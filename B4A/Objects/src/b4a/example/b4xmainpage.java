package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xmainpage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.b4xmainpage");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.b4xmainpage.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public b4a.example.game _mgame = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public String  _b4xpage_appear(b4a.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "b4xpage_appear", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_appear", null));}
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Private Sub B4XPage_Appear";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="If mGame.IsInitialized And mGame.X2.IsRunning = F";
if (__ref._mgame /*b4a.example.game*/ .IsInitialized /*boolean*/ () && __ref._mgame /*b4a.example.game*/ ._x2 /*b4a.example.x2utils*/ ._isrunning /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="mGame.X2.Start";
__ref._mgame /*b4a.example.game*/ ._x2 /*b4a.example.x2utils*/ ._start /*String*/ (null);
 };
RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="End Sub";
return "";
}
public void  _b4xpage_created(b4a.example.b4xmainpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}); return;}
ResumableSub_B4XPage_Created rsub = new ResumableSub_B4XPage_Created(this,__ref,_root1);
rsub.resume(ba, null);
}
public static class ResumableSub_B4XPage_Created extends BA.ResumableSub {
public ResumableSub_B4XPage_Created(b4a.example.b4xmainpage parent,b4a.example.b4xmainpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) {
this.parent = parent;
this.__ref = __ref;
this._root1 = _root1;
this.__ref = parent;
}
b4a.example.b4xmainpage __ref;
b4a.example.b4xmainpage parent;
anywheresoftware.b4a.objects.B4XViewWrapper _root1;
int _width = 0;
int _height = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="If Root.Width = 0 Or Root.Height = 0 Then";
if (true) break;

case 1:
//if
this.state = 4;
if (__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()==0 || __ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()==0) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="Wait For  B4XPage_Resize(Width As Int, Height As";
parent.__c.WaitFor("b4xpage_resize", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "b4xpage_created"), null);
this.state = 5;
return;
case 5:
//C
this.state = 4;
_width = (Integer) result[1];
_height = (Integer) result[2];
;
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=917509;
 //BA.debugLineNum = 917509;BA.debugLine="mGame.Initialize(Root)";
__ref._mgame /*b4a.example.game*/ ._initialize /*String*/ (null,ba,__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=917510;
 //BA.debugLineNum = 917510;BA.debugLine="mGame.X2.Start";
__ref._mgame /*b4a.example.game*/ ._x2 /*b4a.example.x2utils*/ ._start /*String*/ (null);
RDebugUtils.currentLine=917511;
 //BA.debugLineNum = 917511;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _b4xpage_disappear(b4a.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "b4xpage_disappear", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_disappear", null));}
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Private Sub B4XPage_Disappear";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="If mGame.IsInitialized Then";
if (__ref._mgame /*b4a.example.game*/ .IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="mGame.X2.Stop";
__ref._mgame /*b4a.example.game*/ ._x2 /*b4a.example.x2utils*/ ._stop /*String*/ (null);
 };
RDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_resize(b4a.example.b4xmainpage __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "b4xpage_resize", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Private Sub B4XPage_Resize (Width As Int, Height A";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="mGame.Resize";
__ref._mgame /*b4a.example.game*/ ._resize /*String*/ (null);
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="Private Root As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="Public mGame As Game";
_mgame = new b4a.example.game();
RDebugUtils.currentLine=786436;
 //BA.debugLineNum = 786436;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.b4xmainpage __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="End Sub";
return "";
}
}