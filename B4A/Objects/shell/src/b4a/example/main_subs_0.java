package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_actionbarhomeclick() throws Exception{
try {
		Debug.PushSubsStack("Activity_ActionBarHomeClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,69);
if (RapidSub.canDelegate("activity_actionbarhomeclick")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_actionbarhomeclick");}
 BA.debugLineNum = 69;BA.debugLine="Sub Activity_ActionBarHomeClick";
Debug.ShouldStop(16);
 BA.debugLineNum = 70;BA.debugLine="ActionBarHomeClicked = True";
Debug.ShouldStop(32);
main._actionbarhomeclicked = main.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 71;BA.debugLine="B4XPages.Delegate.Activity_ActionBarHomeClick";
Debug.ShouldStop(64);
main.mostCurrent._b4xpages._delegate /*RemoteObject*/ .runClassMethod (b4a.example.b4xpagesdelegator.class, "_activity_actionbarhomeclick" /*RemoteObject*/ );
 BA.debugLineNum = 72;BA.debugLine="ActionBarHomeClicked = False";
Debug.ShouldStop(128);
main._actionbarhomeclicked = main.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 73;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,23);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
RemoteObject _pm = RemoteObject.declareNull("b4a.example.b4xpagesmanager");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 23;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 24;BA.debugLine="SetImmersiveMode";
Debug.ShouldStop(8388608);
_setimmersivemode();
 BA.debugLineNum = 25;BA.debugLine="Dim pm As B4XPagesManager";
Debug.ShouldStop(16777216);
_pm = RemoteObject.createNew ("b4a.example.b4xpagesmanager");Debug.locals.put("pm", _pm);
 BA.debugLineNum = 26;BA.debugLine="pm.Initialize(Activity)";
Debug.ShouldStop(33554432);
_pm.runClassMethod (b4a.example.b4xpagesmanager.class, "_initialize" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(main.mostCurrent._activity));
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_keypress(RemoteObject _keycode) throws Exception{
try {
		Debug.PushSubsStack("Activity_KeyPress (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,75);
if (RapidSub.canDelegate("activity_keypress")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_keypress", _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 75;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(1024);
 BA.debugLineNum = 76;BA.debugLine="Return B4XPages.Delegate.Activity_KeyPress(KeyCod";
Debug.ShouldStop(2048);
if (true) return main.mostCurrent._b4xpages._delegate /*RemoteObject*/ .runClassMethod (b4a.example.b4xpagesdelegator.class, "_activity_keypress" /*RemoteObject*/ ,(Object)(_keycode));
 BA.debugLineNum = 77;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,83);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 83;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 84;BA.debugLine="B4XPages.Delegate.Activity_Pause";
Debug.ShouldStop(524288);
main.mostCurrent._b4xpages._delegate /*RemoteObject*/ .runClassMethod (b4a.example.b4xpagesdelegator.class, "_activity_pause" /*RemoteObject*/ );
 BA.debugLineNum = 85;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_permissionresult(RemoteObject _permission,RemoteObject _result) throws Exception{
try {
		Debug.PushSubsStack("Activity_PermissionResult (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,87);
if (RapidSub.canDelegate("activity_permissionresult")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_permissionresult", _permission, _result);}
Debug.locals.put("Permission", _permission);
Debug.locals.put("Result", _result);
 BA.debugLineNum = 87;BA.debugLine="Sub Activity_PermissionResult (Permission As Strin";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 88;BA.debugLine="B4XPages.Delegate.Activity_PermissionResult(Permi";
Debug.ShouldStop(8388608);
main.mostCurrent._b4xpages._delegate /*RemoteObject*/ .runClassMethod (b4a.example.b4xpagesdelegator.class, "_activity_permissionresult" /*RemoteObject*/ ,(Object)(_permission),(Object)(_result));
 BA.debugLineNum = 89;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,79);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 79;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(16384);
 BA.debugLineNum = 80;BA.debugLine="B4XPages.Delegate.Activity_Resume";
Debug.ShouldStop(32768);
main.mostCurrent._b4xpages._delegate /*RemoteObject*/ .runClassMethod (b4a.example.b4xpagesdelegator.class, "_activity_resume" /*RemoteObject*/ );
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _activity_windowfocuschanged(RemoteObject _hasfocus) throws Exception{
try {
		Debug.PushSubsStack("Activity_WindowFocusChanged (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,53);
if (RapidSub.canDelegate("activity_windowfocuschanged")) { b4a.example.main.remoteMe.runUserSub(false, "main","activity_windowfocuschanged", _hasfocus); return;}
ResumableSub_Activity_WindowFocusChanged rsub = new ResumableSub_Activity_WindowFocusChanged(null,_hasfocus);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Activity_WindowFocusChanged extends BA.ResumableSub {
public ResumableSub_Activity_WindowFocusChanged(b4a.example.main parent,RemoteObject _hasfocus) {
this.parent = parent;
this._hasfocus = _hasfocus;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.main parent;
RemoteObject _hasfocus;
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Activity_WindowFocusChanged (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,53);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 54;BA.debugLine="If HasFocus Then";
Debug.ShouldStop(2097152);
if (true) break;

case 1:
//if
this.state = 10;
if (_hasfocus.<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 55;BA.debugLine="Try";
Debug.ShouldStop(4194304);
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
 BA.debugLineNum = 56;BA.debugLine="Dim jo As JavaObject = Activity";
Debug.ShouldStop(8388608);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), parent.mostCurrent._activity.getObject());Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 57;BA.debugLine="Sleep(300)";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("Sleep",main.processBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "activity_windowfocuschanged"),BA.numberCast(int.class, 300));
this.state = 11;
return;
case 11:
//C
this.state = 9;
;
 BA.debugLineNum = 58;BA.debugLine="jo.RunMethod(\"setSystemUiVisibility\", Array As";
Debug.ShouldStop(33554432);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setSystemUiVisibility")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {RemoteObject.createImmutable((5894))})));
 Debug.CheckDeviceExceptions();
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
 BA.debugLineNum = 64;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e0.toString());}
            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _create_menu(RemoteObject _menu) throws Exception{
try {
		Debug.PushSubsStack("Create_Menu (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,91);
if (RapidSub.canDelegate("create_menu")) { return b4a.example.main.remoteMe.runUserSub(false, "main","create_menu", _menu);}
Debug.locals.put("Menu", _menu);
 BA.debugLineNum = 91;BA.debugLine="Sub Create_Menu (Menu As Object)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 92;BA.debugLine="B4XPages.Delegate.Create_Menu(Menu)";
Debug.ShouldStop(134217728);
main.mostCurrent._b4xpages._delegate /*RemoteObject*/ .runClassMethod (b4a.example.b4xpagesdelegator.class, "_create_menu" /*RemoteObject*/ ,(Object)(_menu));
 BA.debugLineNum = 93;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getrealsize() throws Exception{
try {
		Debug.PushSubsStack("GetRealSize (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,39);
if (RapidSub.canDelegate("getrealsize")) { return b4a.example.main.remoteMe.runUserSub(false, "main","getrealsize");}
RemoteObject _lv = RemoteObject.declareNull("anywheresoftware.b4a.keywords.LayoutValues");
RemoteObject _ctxt = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _display = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _point = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
 BA.debugLineNum = 39;BA.debugLine="Sub GetRealSize As LayoutValues";
Debug.ShouldStop(64);
 BA.debugLineNum = 40;BA.debugLine="Dim lv As LayoutValues";
Debug.ShouldStop(128);
_lv = RemoteObject.createNew ("anywheresoftware.b4a.keywords.LayoutValues");Debug.locals.put("lv", _lv);
 BA.debugLineNum = 41;BA.debugLine="Dim ctxt As JavaObject";
Debug.ShouldStop(256);
_ctxt = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("ctxt", _ctxt);
 BA.debugLineNum = 42;BA.debugLine="ctxt.InitializeContext";
Debug.ShouldStop(512);
_ctxt.runVoidMethod ("InitializeContext",main.processBA);
 BA.debugLineNum = 43;BA.debugLine="Dim display As JavaObject = ctxt.RunMethodJO(\"get";
Debug.ShouldStop(1024);
_display = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_display = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _ctxt.runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getSystemService")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("window"))}))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getDefaultDisplay")),(Object)((main.mostCurrent.__c.getField(false,"Null")))));Debug.locals.put("display", _display);Debug.locals.put("display", _display);
 BA.debugLineNum = 44;BA.debugLine="Dim point As JavaObject";
Debug.ShouldStop(2048);
_point = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("point", _point);
 BA.debugLineNum = 45;BA.debugLine="point.InitializeNewInstance(\"android.graphics.Poi";
Debug.ShouldStop(4096);
_point.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("android.graphics.Point")),(Object)((main.mostCurrent.__c.getField(false,"Null"))));
 BA.debugLineNum = 46;BA.debugLine="display.RunMethod(\"getRealSize\", Array(point))";
Debug.ShouldStop(8192);
_display.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("getRealSize")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_point.getObject())})));
 BA.debugLineNum = 47;BA.debugLine="lv.Width = point.GetField(\"x\")";
Debug.ShouldStop(16384);
_lv.setField ("Width",BA.numberCast(int.class, _point.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("x")))));
 BA.debugLineNum = 48;BA.debugLine="lv.Height = point.GetField(\"y\")";
Debug.ShouldStop(32768);
_lv.setField ("Height",BA.numberCast(int.class, _point.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("y")))));
 BA.debugLineNum = 49;BA.debugLine="lv.Scale = 100dip / 100";
Debug.ShouldStop(65536);
_lv.setField ("Scale",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100))),RemoteObject.createImmutable(100)}, "/",0, 0)));
 BA.debugLineNum = 50;BA.debugLine="Return lv";
Debug.ShouldStop(131072);
if (true) return _lv;
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 19;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
b4xpages_subs_0._process_globals();
b4xcollections_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example.main");
b4xmainpage.myClass = BA.getDeviceClass ("b4a.example.b4xmainpage");
game.myClass = BA.getDeviceClass ("b4a.example.game");
starter.myClass = BA.getDeviceClass ("b4a.example.starter");
b4xpages.myClass = BA.getDeviceClass ("b4a.example.b4xpages");
b4xbitset.myClass = BA.getDeviceClass ("b4a.example.b4xbitset");
b4xbytesbuilder.myClass = BA.getDeviceClass ("b4a.example.b4xbytesbuilder");
b4xcache.myClass = BA.getDeviceClass ("b4a.example.b4xcache");
b4xcollections.myClass = BA.getDeviceClass ("b4a.example.b4xcollections");
b4xcomparatorsort.myClass = BA.getDeviceClass ("b4a.example.b4xcomparatorsort");
b4xorderedmap.myClass = BA.getDeviceClass ("b4a.example.b4xorderedmap");
b4xset.myClass = BA.getDeviceClass ("b4a.example.b4xset");
b4xpagesdelegator.myClass = BA.getDeviceClass ("b4a.example.b4xpagesdelegator");
b4xpagesmanager.myClass = BA.getDeviceClass ("b4a.example.b4xpagesmanager");
scorelabel.myClass = BA.getDeviceClass ("b4a.example.scorelabel");
x2bodywrapper.myClass = BA.getDeviceClass ("b4a.example.x2bodywrapper");
x2debugdraw.myClass = BA.getDeviceClass ("b4a.example.x2debugdraw");
x2multitouch.myClass = BA.getDeviceClass ("b4a.example.x2multitouch");
x2soundpool.myClass = BA.getDeviceClass ("b4a.example.x2soundpool");
x2spritegraphiccache.myClass = BA.getDeviceClass ("b4a.example.x2spritegraphiccache");
x2tilemap.myClass = BA.getDeviceClass ("b4a.example.x2tilemap");
x2utils.myClass = BA.getDeviceClass ("b4a.example.x2utils");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 16;BA.debugLine="Public ActionBarHomeClicked As Boolean";
main._actionbarhomeclicked = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _setimmersivemode() throws Exception{
try {
		Debug.PushSubsStack("SetImmersiveMode (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,29);
if (RapidSub.canDelegate("setimmersivemode")) { return b4a.example.main.remoteMe.runUserSub(false, "main","setimmersivemode");}
RemoteObject _lv = RemoteObject.declareNull("anywheresoftware.b4a.keywords.LayoutValues");
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
 BA.debugLineNum = 29;BA.debugLine="Private Sub SetImmersiveMode";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 30;BA.debugLine="Activity_WindowFocusChanged(True)";
Debug.ShouldStop(536870912);
_activity_windowfocuschanged(main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 31;BA.debugLine="Dim lv As LayoutValues = GetRealSize";
Debug.ShouldStop(1073741824);
_lv = _getrealsize();Debug.locals.put("lv", _lv);Debug.locals.put("lv", _lv);
 BA.debugLineNum = 32;BA.debugLine="Dim jo As JavaObject = Activity";
Debug.ShouldStop(-2147483648);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), main.mostCurrent._activity.getObject());Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 33;BA.debugLine="jo.RunMethod(\"setBottom\", Array(lv.Height))";
Debug.ShouldStop(1);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setBottom")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_lv.getField(true,"Height"))})));
 BA.debugLineNum = 34;BA.debugLine="jo.RunMethod(\"setRight\", Array(lv.Width))";
Debug.ShouldStop(2);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setRight")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_lv.getField(true,"Width"))})));
 BA.debugLineNum = 35;BA.debugLine="Activity.Height = lv.Height";
Debug.ShouldStop(4);
main.mostCurrent._activity.runMethod(true,"setHeight",_lv.getField(true,"Height"));
 BA.debugLineNum = 36;BA.debugLine="Activity.Width = lv.Width";
Debug.ShouldStop(8);
main.mostCurrent._activity.runMethod(true,"setWidth",_lv.getField(true,"Width"));
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}