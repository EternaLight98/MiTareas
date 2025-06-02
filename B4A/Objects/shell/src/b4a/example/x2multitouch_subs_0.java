package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class x2multitouch_subs_0 {


public static RemoteObject  _b4idelegatemultitouchevent(RemoteObject __ref,RemoteObject _pnl,RemoteObject _action,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("B4iDelegateMultitouchEvent (x2multitouch) ","x2multitouch",17,__ref.getField(false, "ba"),__ref,77);
if (RapidSub.canDelegate("b4idelegatemultitouchevent")) { return __ref.runUserSub(false, "x2multitouch","b4idelegatemultitouchevent", __ref, _pnl, _action, _data);}
Debug.locals.put("pnl", _pnl);
Debug.locals.put("Action", _action);
Debug.locals.put("Data", _data);
 BA.debugLineNum = 77;BA.debugLine="Public Sub B4iDelegateMultitouchEvent(pnl As B4XVi";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 99;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _b4jdelegatetouchevent(RemoteObject __ref,RemoteObject _pnl,RemoteObject _action,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("B4JDelegateTouchEvent (x2multitouch) ","x2multitouch",17,__ref.getField(false, "ba"),__ref,106);
if (RapidSub.canDelegate("b4jdelegatetouchevent")) { return __ref.runUserSub(false, "x2multitouch","b4jdelegatetouchevent", __ref, _pnl, _action, _x, _y);}
Debug.locals.put("pnl", _pnl);
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 106;BA.debugLine="Public Sub B4JDelegateTouchEvent (pnl As B4XView,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 125;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Type X2Touch (X As Float, Y As Float, DownX As Fl";
;
 //BA.debugLineNum = 3;BA.debugLine="Public Keys As B4XSet";
x2multitouch._keys = RemoteObject.createNew ("b4a.example.b4xset");__ref.setField("_keys",x2multitouch._keys);
 //BA.debugLineNum = 4;BA.debugLine="Private ViewsFingers As Map";
x2multitouch._viewsfingers = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_viewsfingers",x2multitouch._viewsfingers);
 //BA.debugLineNum = 8;BA.debugLine="Private gd As Gestures";
x2multitouch._gd = RemoteObject.createNew ("anywheresoftware.b4a.agraham.gestures.Gestures");__ref.setField("_gd",x2multitouch._gd);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createx2touch(RemoteObject __ref,RemoteObject _x,RemoteObject _y,RemoteObject _pid) throws Exception{
try {
		Debug.PushSubsStack("CreateX2Touch (x2multitouch) ","x2multitouch",17,__ref.getField(false, "ba"),__ref,165);
if (RapidSub.canDelegate("createx2touch")) { return __ref.runUserSub(false, "x2multitouch","createx2touch", __ref, _x, _y, _pid);}
RemoteObject _t1 = RemoteObject.declareNull("b4a.example.x2multitouch._x2touch");
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
Debug.locals.put("pid", _pid);
 BA.debugLineNum = 165;BA.debugLine="Private Sub CreateX2Touch (X As Float, Y As Float,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 166;BA.debugLine="Dim t1 As X2Touch";
Debug.JustUpdateDeviceLine();
_t1 = RemoteObject.createNew ("b4a.example.x2multitouch._x2touch");Debug.locals.put("t1", _t1);
 BA.debugLineNum = 167;BA.debugLine="t1.Initialize";
Debug.JustUpdateDeviceLine();
_t1.runVoidMethod ("Initialize");
 BA.debugLineNum = 168;BA.debugLine="t1.X = X";
Debug.JustUpdateDeviceLine();
_t1.setField ("X" /*RemoteObject*/ ,_x);
 BA.debugLineNum = 169;BA.debugLine="t1.Y = Y";
Debug.JustUpdateDeviceLine();
_t1.setField ("Y" /*RemoteObject*/ ,_y);
 BA.debugLineNum = 170;BA.debugLine="t1.DownX = X";
Debug.JustUpdateDeviceLine();
_t1.setField ("DownX" /*RemoteObject*/ ,_x);
 BA.debugLineNum = 171;BA.debugLine="t1.DownY = y";
Debug.JustUpdateDeviceLine();
_t1.setField ("DownY" /*RemoteObject*/ ,_y);
 BA.debugLineNum = 172;BA.debugLine="t1.PointerId = pid";
Debug.JustUpdateDeviceLine();
_t1.setField ("PointerId" /*RemoteObject*/ ,_pid);
 BA.debugLineNum = 173;BA.debugLine="t1.EventCounter = -1";
Debug.JustUpdateDeviceLine();
_t1.setField ("EventCounter" /*RemoteObject*/ ,BA.numberCast(int.class, -(double) (0 + 1)));
 BA.debugLineNum = 174;BA.debugLine="Return t1";
Debug.JustUpdateDeviceLine();
if (true) return _t1;
 BA.debugLineNum = 175;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gestures_touch(RemoteObject __ref,RemoteObject _view,RemoteObject _pointerid,RemoteObject _action,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("Gestures_Touch (x2multitouch) ","x2multitouch",17,__ref.getField(false, "ba"),__ref,139);
if (RapidSub.canDelegate("gestures_touch")) { return __ref.runUserSub(false, "x2multitouch","gestures_touch", __ref, _view, _pointerid, _action, _x, _y);}
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _fingers = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _newpointerid = RemoteObject.createImmutable("");
RemoteObject _touch = RemoteObject.declareNull("b4a.example.x2multitouch._x2touch");
RemoteObject _id = RemoteObject.createImmutable(0);
Debug.locals.put("View", _view);
Debug.locals.put("PointerID", _pointerid);
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 139;BA.debugLine="Private Sub Gestures_Touch(View As Object, Pointer";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 140;BA.debugLine="Dim pnl As B4XView = Sender";
Debug.JustUpdateDeviceLine();
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_pnl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), x2multitouch.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("pnl", _pnl);Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 141;BA.debugLine="If ViewsFingers.ContainsKey(pnl) = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_viewsfingers" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_pnl.getObject()))),x2multitouch.__c.getField(true,"False"))) { 
 BA.debugLineNum = 142;BA.debugLine="ViewsFingers.Put(pnl, CreateMap())";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_viewsfingers" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_pnl.getObject())),(Object)((x2multitouch.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {})).getObject())));
 };
 BA.debugLineNum = 144;BA.debugLine="Dim fingers As Map = ViewsFingers.Get(pnl)";
Debug.JustUpdateDeviceLine();
_fingers = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_fingers = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_viewsfingers" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_pnl.getObject()))));Debug.locals.put("fingers", _fingers);Debug.locals.put("fingers", _fingers);
 BA.debugLineNum = 145;BA.debugLine="Select Action";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_action,__ref.getField(false,"_gd" /*RemoteObject*/ ).getField(true,"ACTION_DOWN"),__ref.getField(false,"_gd" /*RemoteObject*/ ).getField(true,"ACTION_POINTER_DOWN"),__ref.getField(false,"_gd" /*RemoteObject*/ ).getField(true,"ACTION_POINTER_UP"),__ref.getField(false,"_gd" /*RemoteObject*/ ).getField(true,"ACTION_UP"))) {
case 0: 
case 1: {
 BA.debugLineNum = 148;BA.debugLine="NewPointerId = PointerID";
Debug.JustUpdateDeviceLine();
_newpointerid = BA.NumberToString(_pointerid);Debug.locals.put("newpointerid", _newpointerid);
 BA.debugLineNum = 149;BA.debugLine="fingers.Put(PointerID, CreateX2Touch(X, Y, Poin";
Debug.JustUpdateDeviceLine();
_fingers.runVoidMethod ("Put",(Object)((_pointerid)),(Object)((__ref.runClassMethod (b4a.example.x2multitouch.class, "_createx2touch" /*RemoteObject*/ ,(Object)(_x),(Object)(_y),(Object)((_pointerid))))));
 break; }
case 2: 
case 3: {
 BA.debugLineNum = 151;BA.debugLine="If fingers.ContainsKey(PointerID) Then";
Debug.JustUpdateDeviceLine();
if (_fingers.runMethod(true,"ContainsKey",(Object)((_pointerid))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 152;BA.debugLine="Dim touch As X2Touch = fingers.Get(PointerID)";
Debug.JustUpdateDeviceLine();
_touch = (_fingers.runMethod(false,"Get",(Object)((_pointerid))));Debug.locals.put("touch", _touch);Debug.locals.put("touch", _touch);
 BA.debugLineNum = 153;BA.debugLine="touch.FingerUp = True";
Debug.JustUpdateDeviceLine();
_touch.setField ("FingerUp" /*RemoteObject*/ ,x2multitouch.__c.getField(true,"True"));
 };
 break; }
}
;
 BA.debugLineNum = 156;BA.debugLine="For Each id As Int In fingers.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group16 = _fingers.runMethod(false,"Keys");
final int groupLen16 = group16.runMethod(true,"getSize").<Integer>get()
;int index16 = 0;
;
for (; index16 < groupLen16;index16++){
_id = BA.numberCast(int.class, group16.runMethod(false,"Get",index16));Debug.locals.put("id", _id);
Debug.locals.put("id", _id);
 BA.debugLineNum = 157;BA.debugLine="Dim touch As X2Touch = fingers.Get(id)";
Debug.JustUpdateDeviceLine();
_touch = (_fingers.runMethod(false,"Get",(Object)((_id))));Debug.locals.put("touch", _touch);Debug.locals.put("touch", _touch);
 BA.debugLineNum = 158;BA.debugLine="touch.X = gd.GetX(id)";
Debug.JustUpdateDeviceLine();
_touch.setField ("X" /*RemoteObject*/ ,__ref.getField(false,"_gd" /*RemoteObject*/ ).runMethod(true,"GetX",(Object)(_id)));
 BA.debugLineNum = 159;BA.debugLine="touch.Y = gd.GetY(id)";
Debug.JustUpdateDeviceLine();
_touch.setField ("Y" /*RemoteObject*/ ,__ref.getField(false,"_gd" /*RemoteObject*/ ).runMethod(true,"GetY",(Object)(_id)));
 }
}Debug.locals.put("id", _id);
;
 BA.debugLineNum = 161;BA.debugLine="Return True";
Debug.JustUpdateDeviceLine();
if (true) return x2multitouch.__c.getField(true,"True");
 BA.debugLineNum = 162;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getsingletouch(RemoteObject __ref,RemoteObject _panel) throws Exception{
try {
		Debug.PushSubsStack("GetSingleTouch (x2multitouch) ","x2multitouch",17,__ref.getField(false, "ba"),__ref,64);
if (RapidSub.canDelegate("getsingletouch")) { return __ref.runUserSub(false, "x2multitouch","getsingletouch", __ref, _panel);}
RemoteObject _t = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _touch = RemoteObject.declareNull("b4a.example.x2multitouch._x2touch");
Debug.locals.put("Panel", _panel);
 BA.debugLineNum = 64;BA.debugLine="Public Sub GetSingleTouch(Panel As B4XView) As X2T";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 65;BA.debugLine="Dim t As List = GetTouches(Panel)";
Debug.JustUpdateDeviceLine();
_t = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_t = __ref.runClassMethod (b4a.example.x2multitouch.class, "_gettouches" /*RemoteObject*/ ,(Object)(_panel));Debug.locals.put("t", _t);Debug.locals.put("t", _t);
 BA.debugLineNum = 66;BA.debugLine="If t.Size > 0 Then Return t.Get(0)";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_t.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return (_t.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));};
 BA.debugLineNum = 67;BA.debugLine="Dim touch As X2Touch";
Debug.JustUpdateDeviceLine();
_touch = RemoteObject.createNew ("b4a.example.x2multitouch._x2touch");Debug.locals.put("touch", _touch);
 BA.debugLineNum = 68;BA.debugLine="Return touch";
Debug.JustUpdateDeviceLine();
if (true) return _touch;
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettouches(RemoteObject __ref,RemoteObject _panel) throws Exception{
try {
		Debug.PushSubsStack("GetTouches (x2multitouch) ","x2multitouch",17,__ref.getField(false, "ba"),__ref,47);
if (RapidSub.canDelegate("gettouches")) { return __ref.runUserSub(false, "x2multitouch","gettouches", __ref, _panel);}
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _fingers = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _touch = RemoteObject.declareNull("b4a.example.x2multitouch._x2touch");
Debug.locals.put("Panel", _panel);
 BA.debugLineNum = 47;BA.debugLine="Public Sub GetTouches (Panel As B4XView) As List";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 48;BA.debugLine="Dim Res As List";
Debug.JustUpdateDeviceLine();
_res = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Res", _res);
 BA.debugLineNum = 49;BA.debugLine="Res.Initialize";
Debug.JustUpdateDeviceLine();
_res.runVoidMethod ("Initialize");
 BA.debugLineNum = 50;BA.debugLine="If ViewsFingers.ContainsKey(Panel) = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_viewsfingers" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_panel.getObject()))),x2multitouch.__c.getField(true,"False"))) { 
 BA.debugLineNum = 51;BA.debugLine="Return Res";
Debug.JustUpdateDeviceLine();
if (true) return _res;
 };
 BA.debugLineNum = 53;BA.debugLine="Dim fingers As Map = ViewsFingers.Get(Panel)";
Debug.JustUpdateDeviceLine();
_fingers = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_fingers = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_viewsfingers" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_panel.getObject()))));Debug.locals.put("fingers", _fingers);Debug.locals.put("fingers", _fingers);
 BA.debugLineNum = 54;BA.debugLine="For Each touch As X2Touch In fingers.Values";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group7 = _fingers.runMethod(false,"Values");
final int groupLen7 = group7.runMethod(true,"getSize").<Integer>get()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_touch = (group7.runMethod(false,"Get",index7));Debug.locals.put("touch", _touch);
Debug.locals.put("touch", _touch);
 BA.debugLineNum = 55;BA.debugLine="Res.Add(touch)";
Debug.JustUpdateDeviceLine();
_res.runVoidMethod ("Add",(Object)((_touch)));
 }
}Debug.locals.put("touch", _touch);
;
 BA.debugLineNum = 57;BA.debugLine="For Each touch As X2Touch In Res";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group10 = _res;
final int groupLen10 = group10.runMethod(true,"getSize").<Integer>get()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_touch = (group10.runMethod(false,"Get",index10));Debug.locals.put("touch", _touch);
Debug.locals.put("touch", _touch);
 BA.debugLineNum = 58;BA.debugLine="If touch.FingerUp Then fingers.Remove(touch.Poin";
Debug.JustUpdateDeviceLine();
if (_touch.getField(true,"FingerUp" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
_fingers.runVoidMethod ("Remove",(Object)(_touch.getField(false,"PointerId" /*RemoteObject*/ )));};
 BA.debugLineNum = 59;BA.debugLine="touch.EventCounter = touch.EventCounter + 1";
Debug.JustUpdateDeviceLine();
_touch.setField ("EventCounter" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {_touch.getField(true,"EventCounter" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 }
}Debug.locals.put("touch", _touch);
;
 BA.debugLineNum = 61;BA.debugLine="Return Res";
Debug.JustUpdateDeviceLine();
if (true) return _res;
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _page,RemoteObject _touchpanels) throws Exception{
try {
		Debug.PushSubsStack("Initialize (x2multitouch) ","x2multitouch",17,__ref.getField(false, "ba"),__ref,17);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "x2multitouch","initialize", __ref, _ba, _page, _touchpanels);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _v = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("ba", _ba);
Debug.locals.put("Page", _page);
Debug.locals.put("TouchPanels", _touchpanels);
 BA.debugLineNum = 17;BA.debugLine="Public Sub Initialize (Page As Object, TouchPanels";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 18;BA.debugLine="Keys.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_keys" /*RemoteObject*/ ).runClassMethod (b4a.example.b4xset.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 19;BA.debugLine="ViewsFingers.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_viewsfingers" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 21;BA.debugLine="If TouchPanels.IsInitialized Then";
Debug.JustUpdateDeviceLine();
if (_touchpanels.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 22;BA.debugLine="For Each v As B4XView In TouchPanels";
Debug.JustUpdateDeviceLine();
_v = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
{
final RemoteObject group4 = _touchpanels;
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_v = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), group4.runMethod(false,"Get",index4));Debug.locals.put("v", _v);
Debug.locals.put("v", _v);
 BA.debugLineNum = 23;BA.debugLine="gd.SetOnTouchListener(v, \"Gestures_Touch\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_gd" /*RemoteObject*/ ).runVoidMethod ("SetOnTouchListener",__ref.getField(false, "ba"),(Object)((_v.getObject())),(Object)(RemoteObject.createImmutable("Gestures_Touch")));
 }
}Debug.locals.put("v", _v);
;
 };
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resetstate(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ResetState (x2multitouch) ","x2multitouch",17,__ref.getField(false, "ba"),__ref,40);
if (RapidSub.canDelegate("resetstate")) { return __ref.runUserSub(false, "x2multitouch","resetstate", __ref);}
 BA.debugLineNum = 40;BA.debugLine="Public Sub ResetState";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 41;BA.debugLine="Keys.Clear";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_keys" /*RemoteObject*/ ).runClassMethod (b4a.example.b4xset.class, "_clear" /*RemoteObject*/ );
 BA.debugLineNum = 42;BA.debugLine="ViewsFingers.Clear";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_viewsfingers" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}