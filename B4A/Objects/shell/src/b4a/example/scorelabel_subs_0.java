package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class scorelabel_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (scorelabel) ","scorelabel",14,__ref.getField(false, "ba"),__ref,35);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "scorelabel","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 35;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 36;BA.debugLine="xlbl.SetLayoutAnimated(0, 0, 0, Width, Height)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xlbl" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, _width)),(Object)(BA.numberCast(int.class, _height)));
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private mEventName As String 'ignore";
scorelabel._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",scorelabel._meventname);
 //BA.debugLineNum = 4;BA.debugLine="Private mCallBack As Object 'ignore";
scorelabel._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",scorelabel._mcallback);
 //BA.debugLineNum = 5;BA.debugLine="Private mBase As B4XView 'ignore";
scorelabel._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbase",scorelabel._mbase);
 //BA.debugLineNum = 6;BA.debugLine="Private xui As XUI 'ignore";
scorelabel._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",scorelabel._xui);
 //BA.debugLineNum = 7;BA.debugLine="Private xlbl As B4XView";
scorelabel._xlbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_xlbl",scorelabel._xlbl);
 //BA.debugLineNum = 8;BA.debugLine="Private currentValue As Int";
scorelabel._currentvalue = RemoteObject.createImmutable(0);__ref.setField("_currentvalue",scorelabel._currentvalue);
 //BA.debugLineNum = 9;BA.debugLine="Private tempValue As Int";
scorelabel._tempvalue = RemoteObject.createImmutable(0);__ref.setField("_tempvalue",scorelabel._tempvalue);
 //BA.debugLineNum = 10;BA.debugLine="Public Text As String = \"Score: \"";
scorelabel._text = BA.ObjectToString("Score: ");__ref.setField("_text",scorelabel._text);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (scorelabel) ","scorelabel",14,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "scorelabel","designercreateview", __ref, _base, _lbl, _props);}
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 20;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 21;BA.debugLine="mBase = Base";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).setObject (_base);
 BA.debugLineNum = 22;BA.debugLine="xlbl = Lbl";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xlbl" /*RemoteObject*/ ).setObject (_lbl.getObject());
 BA.debugLineNum = 24;BA.debugLine="xlbl.SetTextAlignment(\"CENTER\", \"LEFT\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xlbl" /*RemoteObject*/ ).runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("LEFT")));
 BA.debugLineNum = 25;BA.debugLine="mBase.AddView(xlbl, 0, 0, 0, 0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_xlbl" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 26;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.scorelabel.class, "_base_resize" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"))));
 BA.debugLineNum = 27;BA.debugLine="setValue(0)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.scorelabel.class, "_setvalue" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbase(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getBase (scorelabel) ","scorelabel",14,__ref.getField(false, "ba"),__ref,31);
if (RapidSub.canDelegate("getbase")) { return __ref.runUserSub(false, "scorelabel","getbase", __ref);}
 BA.debugLineNum = 31;BA.debugLine="Public Sub getBase As B4XView";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 32;BA.debugLine="Return mBase";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_mbase" /*RemoteObject*/ );
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getvalue(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getValue (scorelabel) ","scorelabel",14,__ref.getField(false, "ba"),__ref,43);
if (RapidSub.canDelegate("getvalue")) { return __ref.runUserSub(false, "scorelabel","getvalue", __ref);}
 BA.debugLineNum = 43;BA.debugLine="Public Sub getValue As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 44;BA.debugLine="Return currentValue";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_currentvalue" /*RemoteObject*/ );
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _increasescore(RemoteObject __ref,RemoteObject _delta) throws Exception{
try {
		Debug.PushSubsStack("IncreaseScore (scorelabel) ","scorelabel",14,__ref.getField(false, "ba"),__ref,47);
if (RapidSub.canDelegate("increasescore")) { return __ref.runUserSub(false, "scorelabel","increasescore", __ref, _delta);}
Debug.locals.put("Delta", _delta);
 BA.debugLineNum = 47;BA.debugLine="Public Sub IncreaseScore (Delta As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 48;BA.debugLine="setValue(currentValue + Delta)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.scorelabel.class, "_setvalue" /*RemoteObject*/ ,(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_currentvalue" /*RemoteObject*/ ),_delta}, "+",1, 1)));
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (scorelabel) ","scorelabel",14,__ref.getField(false, "ba"),__ref,14);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "scorelabel","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 15;BA.debugLine="mEventName = EventName";
Debug.JustUpdateDeviceLine();
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 16;BA.debugLine="mCallBack = Callback";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 17;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvalue(RemoteObject __ref,RemoteObject _newvalue) throws Exception{
try {
		Debug.PushSubsStack("setValue (scorelabel) ","scorelabel",14,__ref.getField(false, "ba"),__ref,39);
if (RapidSub.canDelegate("setvalue")) { return __ref.runUserSub(false, "scorelabel","setvalue", __ref, _newvalue);}
Debug.locals.put("NewValue", _newvalue);
 BA.debugLineNum = 39;BA.debugLine="Public Sub setValue(NewValue As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 40;BA.debugLine="currentValue = NewValue";
Debug.JustUpdateDeviceLine();
__ref.setField ("_currentvalue" /*RemoteObject*/ ,_newvalue);
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvaluenow(RemoteObject __ref,RemoteObject _score) throws Exception{
try {
		Debug.PushSubsStack("SetValueNow (scorelabel) ","scorelabel",14,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("setvaluenow")) { return __ref.runUserSub(false, "scorelabel","setvaluenow", __ref, _score);}
Debug.locals.put("score", _score);
 BA.debugLineNum = 51;BA.debugLine="Public Sub SetValueNow (score As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 52;BA.debugLine="currentValue = score";
Debug.JustUpdateDeviceLine();
__ref.setField ("_currentvalue" /*RemoteObject*/ ,_score);
 BA.debugLineNum = 53;BA.debugLine="tempValue = score";
Debug.JustUpdateDeviceLine();
__ref.setField ("_tempvalue" /*RemoteObject*/ ,_score);
 BA.debugLineNum = 54;BA.debugLine="xlbl.Text = $\"${Text}$1.0{score}\"$";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xlbl" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable(""),scorelabel.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_text" /*RemoteObject*/ )))),RemoteObject.createImmutable(""),scorelabel.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("1.0")),(Object)((_score))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Tick (scorelabel) ","scorelabel",14,__ref.getField(false, "ba"),__ref,57);
if (RapidSub.canDelegate("tick")) { return __ref.runUserSub(false, "scorelabel","tick", __ref);}
RemoteObject _dx = RemoteObject.createImmutable(0);
 BA.debugLineNum = 57;BA.debugLine="Public Sub Tick";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 58;BA.debugLine="Dim dx As Int = currentValue - tempValue";
Debug.JustUpdateDeviceLine();
_dx = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_currentvalue" /*RemoteObject*/ ),__ref.getField(true,"_tempvalue" /*RemoteObject*/ )}, "-",1, 1);Debug.locals.put("dx", _dx);Debug.locals.put("dx", _dx);
 BA.debugLineNum = 59;BA.debugLine="If dx <> 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_dx,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 60;BA.debugLine="tempValue = tempValue + Ceil(dx / 5)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_tempvalue" /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_tempvalue" /*RemoteObject*/ ),scorelabel.__c.runMethod(true,"Ceil",(Object)(RemoteObject.solve(new RemoteObject[] {_dx,RemoteObject.createImmutable(5)}, "/",0, 0)))}, "+",1, 0)));
 };
 BA.debugLineNum = 62;BA.debugLine="xlbl.Text = $\"${Text}$1.0{tempValue}\"$";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xlbl" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable(""),scorelabel.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_text" /*RemoteObject*/ )))),RemoteObject.createImmutable(""),scorelabel.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("1.0")),(Object)((__ref.getField(true,"_tempvalue" /*RemoteObject*/ )))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 63;BA.debugLine="End Sub";
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