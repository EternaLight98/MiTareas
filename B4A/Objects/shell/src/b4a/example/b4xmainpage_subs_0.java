package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_0 {


public static RemoteObject  _b4xpage_appear(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Appear (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,32);
if (RapidSub.canDelegate("b4xpage_appear")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_appear", __ref);}
 BA.debugLineNum = 32;BA.debugLine="Private Sub B4XPage_Appear";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 33;BA.debugLine="If mGame.IsInitialized And mGame.X2.IsRunning = F";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean(".",__ref.getField(false,"_mgame" /*RemoteObject*/ ).runMethod(true,"IsInitialized" /*RemoteObject*/ )) && RemoteObject.solveBoolean("=",__ref.getField(false,"_mgame" /*RemoteObject*/ ).getField(false,"_x2" /*RemoteObject*/ ).getField(true,"_isrunning" /*RemoteObject*/ ),b4xmainpage.__c.getField(true,"False"))) { 
 BA.debugLineNum = 34;BA.debugLine="mGame.X2.Start";
Debug.ShouldStop(2);
__ref.getField(false,"_mgame" /*RemoteObject*/ ).getField(false,"_x2" /*RemoteObject*/ ).runClassMethod (b4a.example.x2utils.class, "_start" /*RemoteObject*/ );
 };
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("b4xpage_created")) { __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1); return;}
ResumableSub_B4XPage_Created rsub = new ResumableSub_B4XPage_Created(null,__ref,_root1);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_B4XPage_Created extends BA.ResumableSub {
public ResumableSub_B4XPage_Created(b4a.example.b4xmainpage parent,RemoteObject __ref,RemoteObject _root1) {
this.parent = parent;
this.__ref = __ref;
this._root1 = _root1;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.b4xmainpage parent;
RemoteObject _root1;
RemoteObject _width = RemoteObject.createImmutable(0);
RemoteObject _height = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,19);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 20;BA.debugLine="Root = Root1";
Debug.ShouldStop(524288);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 21;BA.debugLine="If Root.Width = 0 Or Root.Height = 0 Then";
Debug.ShouldStop(1048576);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_root" /*RemoteObject*/ ).runMethod(true,"getWidth"),BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean("=",__ref.getField(false,"_root" /*RemoteObject*/ ).runMethod(true,"getHeight"),BA.numberCast(double.class, 0))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 22;BA.debugLine="Wait For  B4XPage_Resize(Width As Int, Height As";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","b4xpage_resize", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "b4xpage_created"), null);
this.state = 5;
return;
case 5:
//C
this.state = 4;
_width = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Width", _width);
_height = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(2));Debug.locals.put("Height", _height);
;
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 24;BA.debugLine="mGame.Initialize(Root)";
Debug.ShouldStop(8388608);
__ref.getField(false,"_mgame" /*RemoteObject*/ ).runClassMethod (b4a.example.game.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_root" /*RemoteObject*/ )));
 BA.debugLineNum = 25;BA.debugLine="mGame.X2.Start";
Debug.ShouldStop(16777216);
__ref.getField(false,"_mgame" /*RemoteObject*/ ).getField(false,"_x2" /*RemoteObject*/ ).runClassMethod (b4a.example.x2utils.class, "_start" /*RemoteObject*/ );
 BA.debugLineNum = 26;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
if (true) break;

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
public static RemoteObject  _b4xpage_disappear(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Disappear (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,38);
if (RapidSub.canDelegate("b4xpage_disappear")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_disappear", __ref);}
 BA.debugLineNum = 38;BA.debugLine="Private Sub B4XPage_Disappear";
Debug.ShouldStop(32);
 BA.debugLineNum = 39;BA.debugLine="If mGame.IsInitialized Then";
Debug.ShouldStop(64);
if (__ref.getField(false,"_mgame" /*RemoteObject*/ ).runMethod(true,"IsInitialized" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 40;BA.debugLine="mGame.X2.Stop";
Debug.ShouldStop(128);
__ref.getField(false,"_mgame" /*RemoteObject*/ ).getField(false,"_x2" /*RemoteObject*/ ).runClassMethod (b4a.example.x2utils.class, "_stop" /*RemoteObject*/ );
 };
 BA.debugLineNum = 42;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _b4xpage_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Resize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("b4xpage_resize")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 28;BA.debugLine="Private Sub B4XPage_Resize (Width As Int, Height A";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 29;BA.debugLine="mGame.Resize";
Debug.ShouldStop(268435456);
__ref.getField(false,"_mgame" /*RemoteObject*/ ).runClassMethod (b4a.example.game.class, "_resize" /*RemoteObject*/ );
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private Root As B4XView";
b4xmainpage._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xmainpage._root);
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI";
b4xmainpage._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xmainpage._xui);
 //BA.debugLineNum = 11;BA.debugLine="Public mGame As Game";
b4xmainpage._mgame = RemoteObject.createNew ("b4a.example.game");__ref.setField("_mgame",b4xmainpage._mgame);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,14);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(8192);
 BA.debugLineNum = 16;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}