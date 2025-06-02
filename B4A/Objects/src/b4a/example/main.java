package b4a.example;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class main extends Activity implements B4AActivity{
	public static main mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = true;
	public static final boolean includeTitle = false;
    public static WeakReference<Activity> previousOne;
    public static boolean dontPause;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.main");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (main).");
				p.finish();
			}
		}
        processBA.setActivityPaused(true);
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(this, processBA, wl, false))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.main");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.main", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (main) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (main) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEventFromUI(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeydown", this, new Object[] {keyCode, event}))
            return true;
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeyup", this, new Object[] {keyCode, event}))
            return true;
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null)
            return;
        if (this != mostCurrent)
			return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        if (!dontPause)
            BA.LogInfo("** Activity (main) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (main) Pause event (activity is not paused). **");
        if (mostCurrent != null)
            processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        if (!dontPause) {
            processBA.setActivityPaused(true);
            mostCurrent = null;
        }

        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
            main mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (main) Resume **");
            if (mc != mostCurrent)
                return;
		    processBA.raiseEvent(mc._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}
    public void onRequestPermissionsResult(int requestCode,
        String permissions[], int[] grantResults) {
        for (int i = 0;i < permissions.length;i++) {
            Object[] o = new Object[] {permissions[i], grantResults[i] == 0};
            processBA.raiseEventFromDifferentThread(null,null, 0, "activity_permissionresult", true, o);
        }
            
    }



public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}
public static boolean isAnyActivityVisible() {
    boolean vis = false;
vis = vis | (main.mostCurrent != null);
return vis;}

private static BA killProgramHelper(BA ba) {
    if (ba == null)
        return null;
    anywheresoftware.b4a.BA.SharedProcessBA sharedProcessBA = ba.sharedProcessBA;
    if (sharedProcessBA == null || sharedProcessBA.activityBA == null)
        return null;
    return sharedProcessBA.activityBA.get();
}
public static void killProgram() {
     {
            Activity __a = null;
            if (main.previousOne != null) {
				__a = main.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(main.mostCurrent == null ? null : main.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

BA.applicationContext.stopService(new android.content.Intent(BA.applicationContext, starter.class));
}
public anywheresoftware.b4a.keywords.Common __c = null;
public static boolean _actionbarhomeclicked = false;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public static String  _activity_actionbarhomeclick() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_actionbarhomeclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_actionbarhomeclick", null));}
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Sub Activity_ActionBarHomeClick";
RDebugUtils.currentLine=393217;
 //BA.debugLineNum = 393217;BA.debugLine="ActionBarHomeClicked = True";
_actionbarhomeclicked = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="B4XPages.Delegate.Activity_ActionBarHomeClick";
mostCurrent._b4xpages._delegate /*b4a.example.b4xpagesdelegator*/ ._activity_actionbarhomeclick /*String*/ (null);
RDebugUtils.currentLine=393219;
 //BA.debugLineNum = 393219;BA.debugLine="ActionBarHomeClicked = False";
_actionbarhomeclicked = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=393220;
 //BA.debugLineNum = 393220;BA.debugLine="End Sub";
return "";
}
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
b4a.example.b4xpagesmanager _pm = null;
RDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=131073;
 //BA.debugLineNum = 131073;BA.debugLine="SetImmersiveMode";
_setimmersivemode();
RDebugUtils.currentLine=131074;
 //BA.debugLineNum = 131074;BA.debugLine="Dim pm As B4XPagesManager";
_pm = new b4a.example.b4xpagesmanager();
RDebugUtils.currentLine=131075;
 //BA.debugLineNum = 131075;BA.debugLine="pm.Initialize(Activity)";
_pm._initialize /*String*/ (null,mostCurrent.activityBA,mostCurrent._activity);
RDebugUtils.currentLine=131076;
 //BA.debugLineNum = 131076;BA.debugLine="End Sub";
return "";
}
public static String  _setimmersivemode() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setimmersivemode", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "setimmersivemode", null));}
anywheresoftware.b4a.keywords.LayoutValues _lv = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Private Sub SetImmersiveMode";
RDebugUtils.currentLine=196609;
 //BA.debugLineNum = 196609;BA.debugLine="Activity_WindowFocusChanged(True)";
_activity_windowfocuschanged(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="Dim lv As LayoutValues = GetRealSize";
_lv = _getrealsize();
RDebugUtils.currentLine=196611;
 //BA.debugLineNum = 196611;BA.debugLine="Dim jo As JavaObject = Activity";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(mostCurrent._activity.getObject()));
RDebugUtils.currentLine=196612;
 //BA.debugLineNum = 196612;BA.debugLine="jo.RunMethod(\"setBottom\", Array(lv.Height))";
_jo.RunMethod("setBottom",new Object[]{(Object)(_lv.Height)});
RDebugUtils.currentLine=196613;
 //BA.debugLineNum = 196613;BA.debugLine="jo.RunMethod(\"setRight\", Array(lv.Width))";
_jo.RunMethod("setRight",new Object[]{(Object)(_lv.Width)});
RDebugUtils.currentLine=196614;
 //BA.debugLineNum = 196614;BA.debugLine="Activity.Height = lv.Height";
mostCurrent._activity.setHeight(_lv.Height);
RDebugUtils.currentLine=196615;
 //BA.debugLineNum = 196615;BA.debugLine="Activity.Width = lv.Width";
mostCurrent._activity.setWidth(_lv.Width);
RDebugUtils.currentLine=196616;
 //BA.debugLineNum = 196616;BA.debugLine="End Sub";
return "";
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_keypress", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "activity_keypress", new Object[] {_keycode}));}
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
RDebugUtils.currentLine=458753;
 //BA.debugLineNum = 458753;BA.debugLine="Return B4XPages.Delegate.Activity_KeyPress(KeyCod";
if (true) return mostCurrent._b4xpages._delegate /*b4a.example.b4xpagesdelegator*/ ._activity_keypress /*boolean*/ (null,_keycode);
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="End Sub";
return false;
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="B4XPages.Delegate.Activity_Pause";
mostCurrent._b4xpages._delegate /*b4a.example.b4xpagesdelegator*/ ._activity_pause /*String*/ (null);
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="End Sub";
return "";
}
public static String  _activity_permissionresult(String _permission,boolean _result) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_permissionresult", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_permissionresult", new Object[] {_permission,_result}));}
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Sub Activity_PermissionResult (Permission As Strin";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="B4XPages.Delegate.Activity_PermissionResult(Permi";
mostCurrent._b4xpages._delegate /*b4a.example.b4xpagesdelegator*/ ._activity_permissionresult /*String*/ (null,_permission,_result);
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="B4XPages.Delegate.Activity_Resume";
mostCurrent._b4xpages._delegate /*b4a.example.b4xpagesdelegator*/ ._activity_resume /*String*/ (null);
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="End Sub";
return "";
}
public static void  _activity_windowfocuschanged(boolean _hasfocus) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_windowfocuschanged", false))
	 {Debug.delegate(mostCurrent.activityBA, "activity_windowfocuschanged", new Object[] {_hasfocus}); return;}
ResumableSub_Activity_WindowFocusChanged rsub = new ResumableSub_Activity_WindowFocusChanged(null,_hasfocus);
rsub.resume(processBA, null);
}
public static class ResumableSub_Activity_WindowFocusChanged extends BA.ResumableSub {
public ResumableSub_Activity_WindowFocusChanged(b4a.example.main parent,boolean _hasfocus) {
this.parent = parent;
this._hasfocus = _hasfocus;
}
b4a.example.main parent;
boolean _hasfocus;
anywheresoftware.b4j.object.JavaObject _jo = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=327681;
 //BA.debugLineNum = 327681;BA.debugLine="If HasFocus Then";
if (true) break;

case 1:
//if
this.state = 10;
if (_hasfocus) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="Try";
if (true) break;

case 4:
//try
this.state = 9;
this.catchState = 8;
this.state = 6;
if (true) break;

case 6:
//C
this.state = 9;
this.catchState = 8;
RDebugUtils.currentLine=327683;
 //BA.debugLineNum = 327683;BA.debugLine="Dim jo As JavaObject = Activity";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(parent.mostCurrent._activity.getObject()));
RDebugUtils.currentLine=327684;
 //BA.debugLineNum = 327684;BA.debugLine="Sleep(300)";
anywheresoftware.b4a.keywords.Common.Sleep(processBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "activity_windowfocuschanged"),(int) (300));
this.state = 11;
return;
case 11:
//C
this.state = 9;
;
RDebugUtils.currentLine=327685;
 //BA.debugLineNum = 327685;BA.debugLine="jo.RunMethod(\"setSystemUiVisibility\", Array As";
_jo.RunMethod("setSystemUiVisibility",new Object[]{(Object)(5894)});
 if (true) break;

case 8:
//C
this.state = 9;
this.catchState = 0;
 if (true) break;
if (true) break;

case 9:
//C
this.state = 10;
this.catchState = 0;
;
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=327691;
 //BA.debugLineNum = 327691;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
processBA.setLastException(e0);}
            }
        }
    }
}
public static String  _create_menu(Object _menu) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "create_menu", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "create_menu", new Object[] {_menu}));}
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Sub Create_Menu (Menu As Object)";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="B4XPages.Delegate.Create_Menu(Menu)";
mostCurrent._b4xpages._delegate /*b4a.example.b4xpagesdelegator*/ ._create_menu /*String*/ (null,_menu);
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.LayoutValues  _getrealsize() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getrealsize", false))
	 {return ((anywheresoftware.b4a.keywords.LayoutValues) Debug.delegate(mostCurrent.activityBA, "getrealsize", null));}
anywheresoftware.b4a.keywords.LayoutValues _lv = null;
anywheresoftware.b4j.object.JavaObject _ctxt = null;
anywheresoftware.b4j.object.JavaObject _display = null;
anywheresoftware.b4j.object.JavaObject _point = null;
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Sub GetRealSize As LayoutValues";
RDebugUtils.currentLine=262145;
 //BA.debugLineNum = 262145;BA.debugLine="Dim lv As LayoutValues";
_lv = new anywheresoftware.b4a.keywords.LayoutValues();
RDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="Dim ctxt As JavaObject";
_ctxt = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=262147;
 //BA.debugLineNum = 262147;BA.debugLine="ctxt.InitializeContext";
_ctxt.InitializeContext(processBA);
RDebugUtils.currentLine=262148;
 //BA.debugLineNum = 262148;BA.debugLine="Dim display As JavaObject = ctxt.RunMethodJO(\"get";
_display = new anywheresoftware.b4j.object.JavaObject();
_display = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_ctxt.RunMethodJO("getSystemService",new Object[]{(Object)("window")}).RunMethod("getDefaultDisplay",(Object[])(anywheresoftware.b4a.keywords.Common.Null))));
RDebugUtils.currentLine=262149;
 //BA.debugLineNum = 262149;BA.debugLine="Dim point As JavaObject";
_point = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=262150;
 //BA.debugLineNum = 262150;BA.debugLine="point.InitializeNewInstance(\"android.graphics.Poi";
_point.InitializeNewInstance("android.graphics.Point",(Object[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=262151;
 //BA.debugLineNum = 262151;BA.debugLine="display.RunMethod(\"getRealSize\", Array(point))";
_display.RunMethod("getRealSize",new Object[]{(Object)(_point.getObject())});
RDebugUtils.currentLine=262152;
 //BA.debugLineNum = 262152;BA.debugLine="lv.Width = point.GetField(\"x\")";
_lv.Width = (int)(BA.ObjectToNumber(_point.GetField("x")));
RDebugUtils.currentLine=262153;
 //BA.debugLineNum = 262153;BA.debugLine="lv.Height = point.GetField(\"y\")";
_lv.Height = (int)(BA.ObjectToNumber(_point.GetField("y")));
RDebugUtils.currentLine=262154;
 //BA.debugLineNum = 262154;BA.debugLine="lv.Scale = 100dip / 100";
_lv.Scale = (float) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100))/(double)100);
RDebugUtils.currentLine=262155;
 //BA.debugLineNum = 262155;BA.debugLine="Return lv";
if (true) return _lv;
RDebugUtils.currentLine=262156;
 //BA.debugLineNum = 262156;BA.debugLine="End Sub";
return null;
}
public boolean _onCreateOptionsMenu(android.view.Menu menu) {
	 processBA.raiseEvent(null, "create_menu", menu);
	 return true;
	
}
}