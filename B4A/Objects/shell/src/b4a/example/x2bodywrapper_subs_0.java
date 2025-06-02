package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class x2bodywrapper_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public Body As B2Body";
x2bodywrapper._body = RemoteObject.createNew ("anywheresoftware.b4a.objects.B2Body");__ref.setField("_body",x2bodywrapper._body);
 //BA.debugLineNum = 3;BA.debugLine="Public mWorld As B2World";
x2bodywrapper._mworld = RemoteObject.createNew ("anywheresoftware.b4a.objects.B2World");__ref.setField("_mworld",x2bodywrapper._mworld);
 //BA.debugLineNum = 4;BA.debugLine="Public Target As Object";
x2bodywrapper._target = RemoteObject.createNew ("Object");__ref.setField("_target",x2bodywrapper._target);
 //BA.debugLineNum = 5;BA.debugLine="Public mGame As Game";
x2bodywrapper._mgame = RemoteObject.createNew ("b4a.example.game");__ref.setField("_mgame",x2bodywrapper._mgame);
 //BA.debugLineNum = 6;BA.debugLine="Public IsDeleted As Boolean";
x2bodywrapper._isdeleted = RemoteObject.createImmutable(false);__ref.setField("_isdeleted",x2bodywrapper._isdeleted);
 //BA.debugLineNum = 7;BA.debugLine="Public X2 As X2Utils";
x2bodywrapper._x2 = RemoteObject.createNew ("b4a.example.x2utils");__ref.setField("_x2",x2bodywrapper._x2);
 //BA.debugLineNum = 8;BA.debugLine="Public CurrentFrame As Int";
x2bodywrapper._currentframe = RemoteObject.createImmutable(0);__ref.setField("_currentframe",x2bodywrapper._currentframe);
 //BA.debugLineNum = 9;BA.debugLine="Public MinFrame As Int";
x2bodywrapper._minframe = RemoteObject.createImmutable(0);__ref.setField("_minframe",x2bodywrapper._minframe);
 //BA.debugLineNum = 10;BA.debugLine="Public NumberOfFrames As Int";
x2bodywrapper._numberofframes = RemoteObject.createImmutable(0);__ref.setField("_numberofframes",x2bodywrapper._numberofframes);
 //BA.debugLineNum = 11;BA.debugLine="Private mGraphicName As String";
x2bodywrapper._mgraphicname = RemoteObject.createImmutable("");__ref.setField("_mgraphicname",x2bodywrapper._mgraphicname);
 //BA.debugLineNum = 12;BA.debugLine="Public DelegateTo As Object";
x2bodywrapper._delegateto = RemoteObject.createNew ("Object");__ref.setField("_delegateto",x2bodywrapper._delegateto);
 //BA.debugLineNum = 13;BA.debugLine="Public IsVisible As Boolean";
x2bodywrapper._isvisible = RemoteObject.createImmutable(false);__ref.setField("_isvisible",x2bodywrapper._isvisible);
 //BA.debugLineNum = 14;BA.debugLine="Public TimeToLiveMs As Float";
x2bodywrapper._timetolivems = RemoteObject.createImmutable(0f);__ref.setField("_timetolivems",x2bodywrapper._timetolivems);
 //BA.debugLineNum = 15;BA.debugLine="Public SwitchFrameIntervalMs As Int";
x2bodywrapper._switchframeintervalms = RemoteObject.createImmutable(0);__ref.setField("_switchframeintervalms",x2bodywrapper._switchframeintervalms);
 //BA.debugLineNum = 16;BA.debugLine="Public LastSwitchFrameTime As Int";
x2bodywrapper._lastswitchframetime = RemoteObject.createImmutable(0);__ref.setField("_lastswitchframetime",x2bodywrapper._lastswitchframetime);
 //BA.debugLineNum = 17;BA.debugLine="Public Name As String";
x2bodywrapper._name = RemoteObject.createImmutable("");__ref.setField("_name",x2bodywrapper._name);
 //BA.debugLineNum = 18;BA.debugLine="Public DestroyIfInvisible As Boolean = True";
x2bodywrapper._destroyifinvisible = x2bodywrapper.__c.getField(true,"True");__ref.setField("_destroyifinvisible",x2bodywrapper._destroyifinvisible);
 //BA.debugLineNum = 19;BA.debugLine="Public DebugDrawColor As Int";
x2bodywrapper._debugdrawcolor = RemoteObject.createImmutable(0);__ref.setField("_debugdrawcolor",x2bodywrapper._debugdrawcolor);
 //BA.debugLineNum = 20;BA.debugLine="Public StartTime As Int";
x2bodywrapper._starttime = RemoteObject.createImmutable(0);__ref.setField("_starttime",x2bodywrapper._starttime);
 //BA.debugLineNum = 21;BA.debugLine="Public DrawLast As Boolean";
x2bodywrapper._drawlast = RemoteObject.createImmutable(false);__ref.setField("_drawlast",x2bodywrapper._drawlast);
 //BA.debugLineNum = 22;BA.debugLine="Public DrawFirst As Boolean";
x2bodywrapper._drawfirst = RemoteObject.createImmutable(false);__ref.setField("_drawfirst",x2bodywrapper._drawfirst);
 //BA.debugLineNum = 23;BA.debugLine="Public FlipHorizontal As Boolean";
x2bodywrapper._fliphorizontal = RemoteObject.createImmutable(false);__ref.setField("_fliphorizontal",x2bodywrapper._fliphorizontal);
 //BA.debugLineNum = 24;BA.debugLine="Public FlipVertical As Boolean";
x2bodywrapper._flipvertical = RemoteObject.createImmutable(false);__ref.setField("_flipvertical",x2bodywrapper._flipvertical);
 //BA.debugLineNum = 25;BA.debugLine="Public Id As Int";
x2bodywrapper._id = RemoteObject.createImmutable(0);__ref.setField("_id",x2bodywrapper._id);
 //BA.debugLineNum = 26;BA.debugLine="Public TickIfInvisible As Boolean";
x2bodywrapper._tickifinvisible = RemoteObject.createImmutable(false);__ref.setField("_tickifinvisible",x2bodywrapper._tickifinvisible);
 //BA.debugLineNum = 27;BA.debugLine="Public Tag As Object";
x2bodywrapper._tag = RemoteObject.createNew ("Object");__ref.setField("_tag",x2bodywrapper._tag);
 //BA.debugLineNum = 30;BA.debugLine="Public TemplateCustomProperties As Map";
x2bodywrapper._templatecustomproperties = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_templatecustomproperties",x2bodywrapper._templatecustomproperties);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createdrawtaskbasedoncache(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateDrawTaskBasedOnCache (x2bodywrapper) ","x2bodywrapper",15,__ref.getField(false, "ba"),__ref,122);
if (RapidSub.canDelegate("createdrawtaskbasedoncache")) { return __ref.runUserSub(false, "x2bodywrapper","createdrawtaskbasedoncache", __ref);}
RemoteObject _position = RemoteObject.declareNull("anywheresoftware.b4a.objects.B2Vec2");
 BA.debugLineNum = 122;BA.debugLine="Public Sub CreateDrawTaskBasedOnCache As DrawTask";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 123;BA.debugLine="Dim position As B2Vec2 = X2.WorldPointToMainBC(Bo";
Debug.JustUpdateDeviceLine();
_position = __ref.getField(false,"_x2" /*RemoteObject*/ ).runClassMethod (b4a.example.x2utils.class, "_worldpointtomainbc" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_body" /*RemoteObject*/ ).runMethod(false,"getPosition").runMethod(true,"getX")),(Object)(__ref.getField(false,"_body" /*RemoteObject*/ ).runMethod(false,"getPosition").runMethod(true,"getY")));Debug.locals.put("position", _position);Debug.locals.put("position", _position);
 BA.debugLineNum = 124;BA.debugLine="Return X2.GraphicCache.GetDrawTask(mGraphicName,";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_x2" /*RemoteObject*/ ).getField(false,"_graphiccache" /*RemoteObject*/ ).runClassMethod (b4a.example.x2spritegraphiccache.class, "_getdrawtask" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_mgraphicname" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_currentframe" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_x2" /*RemoteObject*/ ).runClassMethod (b4a.example.x2utils.class, "_b2angletodegrees" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_body" /*RemoteObject*/ ).runMethod(true,"getAngle")))),(Object)(__ref.getField(true,"_fliphorizontal" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_flipvertical" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, _position.runMethod(true,"getX"))),(Object)(BA.numberCast(int.class, _position.runMethod(true,"getY"))));
 BA.debugLineNum = 125;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _delete(RemoteObject __ref,RemoteObject _gs) throws Exception{
try {
		Debug.PushSubsStack("Delete (x2bodywrapper) ","x2bodywrapper",15,__ref.getField(false, "ba"),__ref,58);
if (RapidSub.canDelegate("delete")) { return __ref.runUserSub(false, "x2bodywrapper","delete", __ref, _gs);}
Debug.locals.put("GS", _gs);
 BA.debugLineNum = 58;BA.debugLine="Public Sub Delete (GS As X2GameStep)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 59;BA.debugLine="If IsDeleted Then Return";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_isdeleted" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 61;BA.debugLine="Log($\"Deleting body: ${Name}, ${Id}\"$)";
Debug.JustUpdateDeviceLine();
x2bodywrapper.__c.runVoidMethod ("LogImpl","911534339",(RemoteObject.concat(RemoteObject.createImmutable("Deleting body: "),x2bodywrapper.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_name" /*RemoteObject*/ )))),RemoteObject.createImmutable(", "),x2bodywrapper.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 63;BA.debugLine="IsDeleted = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_isdeleted" /*RemoteObject*/ ,x2bodywrapper.__c.getField(true,"True"));
 BA.debugLineNum = 64;BA.debugLine="GS.BodiesToDelete.Add(Body)";
Debug.JustUpdateDeviceLine();
_gs.getField(false,"BodiesToDelete" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((__ref.getField(false,"_body" /*RemoteObject*/ ))));
 BA.debugLineNum = 65;BA.debugLine="If mGraphicName.StartsWith(X2.GraphicCache.TempPr";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_mgraphicname" /*RemoteObject*/ ).runMethod(true,"startsWith",(Object)(__ref.getField(false,"_x2" /*RemoteObject*/ ).getField(false,"_graphiccache" /*RemoteObject*/ ).getField(true,"_tempprefix" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 66;BA.debugLine="X2.GraphicCache.RemoveGraphics(mGraphicName)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_x2" /*RemoteObject*/ ).getField(false,"_graphiccache" /*RemoteObject*/ ).runClassMethod (b4a.example.x2spritegraphiccache.class, "_removegraphics" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_mgraphicname" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcurrenttime(RemoteObject __ref,RemoteObject _gs) throws Exception{
try {
		Debug.PushSubsStack("GetCurrentTime (x2bodywrapper) ","x2bodywrapper",15,__ref.getField(false, "ba"),__ref,79);
if (RapidSub.canDelegate("getcurrenttime")) { return __ref.runUserSub(false, "x2bodywrapper","getcurrenttime", __ref, _gs);}
Debug.locals.put("gs", _gs);
 BA.debugLineNum = 79;BA.debugLine="Public Sub GetCurrentTime (gs As X2GameStep) As In";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 80;BA.debugLine="Return gs.GameTimeMs - StartTime";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.solve(new RemoteObject[] {_gs.getField(true,"GameTimeMs" /*RemoteObject*/ ),__ref.getField(true,"_starttime" /*RemoteObject*/ )}, "-",1, 1);
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getgraphicname(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getGraphicName (x2bodywrapper) ","x2bodywrapper",15,__ref.getField(false, "ba"),__ref,110);
if (RapidSub.canDelegate("getgraphicname")) { return __ref.runUserSub(false, "x2bodywrapper","getgraphicname", __ref);}
 BA.debugLineNum = 110;BA.debugLine="Public Sub getGraphicName As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 111;BA.debugLine="Return mGraphicName";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_mgraphicname" /*RemoteObject*/ );
 BA.debugLineNum = 112;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _vgame,RemoteObject _delegate,RemoteObject _vname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (x2bodywrapper) ","x2bodywrapper",15,__ref.getField(false, "ba"),__ref,33);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "x2bodywrapper","initialize", __ref, _ba, _vgame, _delegate, _vname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("vGame", _vgame);
Debug.locals.put("Delegate", _delegate);
Debug.locals.put("vName", _vname);
 BA.debugLineNum = 33;BA.debugLine="Public Sub Initialize  (vGame As Game, Delegate As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 34;BA.debugLine="DelegateTo = Delegate";
Debug.JustUpdateDeviceLine();
__ref.setField ("_delegateto" /*RemoteObject*/ ,_delegate);
 BA.debugLineNum = 35;BA.debugLine="mGame = vGame";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mgame" /*RemoteObject*/ ,_vgame);
 BA.debugLineNum = 36;BA.debugLine="X2 = mGame.X2";
Debug.JustUpdateDeviceLine();
__ref.setField ("_x2" /*RemoteObject*/ ,__ref.getField(false,"_mgame" /*RemoteObject*/ ).getField(false,"_x2" /*RemoteObject*/ ));
 BA.debugLineNum = 37;BA.debugLine="mWorld = X2.mWorld";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mworld" /*RemoteObject*/ ,__ref.getField(false,"_x2" /*RemoteObject*/ ).getField(false,"_mworld" /*RemoteObject*/ ));
 BA.debugLineNum = 38;BA.debugLine="Name = vName";
Debug.JustUpdateDeviceLine();
__ref.setField ("_name" /*RemoteObject*/ ,_vname);
 BA.debugLineNum = 39;BA.debugLine="StartTime = X2.gs.GameTimeMs";
Debug.JustUpdateDeviceLine();
__ref.setField ("_starttime" /*RemoteObject*/ ,__ref.getField(false,"_x2" /*RemoteObject*/ ).getField(false,"_gs" /*RemoteObject*/ ).getField(true,"GameTimeMs" /*RemoteObject*/ ));
 BA.debugLineNum = 40;BA.debugLine="LastSwitchFrameTime = StartTime";
Debug.JustUpdateDeviceLine();
__ref.setField ("_lastswitchframetime" /*RemoteObject*/ ,__ref.getField(true,"_starttime" /*RemoteObject*/ ));
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
public static RemoteObject  _setbody(RemoteObject __ref,RemoteObject _vbody) throws Exception{
try {
		Debug.PushSubsStack("SetBody (x2bodywrapper) ","x2bodywrapper",15,__ref.getField(false, "ba"),__ref,71);
if (RapidSub.canDelegate("setbody")) { return __ref.runUserSub(false, "x2bodywrapper","setbody", __ref, _vbody);}
Debug.locals.put("vBody", _vbody);
 BA.debugLineNum = 71;BA.debugLine="Public Sub SetBody (vBody As B2Body)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 72;BA.debugLine="Body = vBody";
Debug.JustUpdateDeviceLine();
__ref.setField ("_body" /*RemoteObject*/ ,_vbody);
 BA.debugLineNum = 73;BA.debugLine="If vBody <> Null Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",_vbody)) { 
 BA.debugLineNum = 74;BA.debugLine="vBody.Tag = Me";
Debug.JustUpdateDeviceLine();
_vbody.runMethod(false,"setTag",__ref);
 };
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setgraphicname(RemoteObject __ref,RemoteObject _s) throws Exception{
try {
		Debug.PushSubsStack("setGraphicName (x2bodywrapper) ","x2bodywrapper",15,__ref.getField(false, "ba"),__ref,114);
if (RapidSub.canDelegate("setgraphicname")) { return __ref.runUserSub(false, "x2bodywrapper","setgraphicname", __ref, _s);}
Debug.locals.put("s", _s);
 BA.debugLineNum = 114;BA.debugLine="Public Sub setGraphicName (s As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 115;BA.debugLine="If mGraphicName = s Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mgraphicname" /*RemoteObject*/ ),_s)) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 116;BA.debugLine="mGraphicName = s";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mgraphicname" /*RemoteObject*/ ,_s);
 BA.debugLineNum = 117;BA.debugLine="NumberOfFrames = X2.GraphicCache.GetGraphicsCount";
Debug.JustUpdateDeviceLine();
__ref.setField ("_numberofframes" /*RemoteObject*/ ,__ref.getField(false,"_x2" /*RemoteObject*/ ).getField(false,"_graphiccache" /*RemoteObject*/ ).runClassMethod (b4a.example.x2spritegraphiccache.class, "_getgraphicscount" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_mgraphicname" /*RemoteObject*/ ))));
 BA.debugLineNum = 118;BA.debugLine="If CurrentFrame >= NumberOfFrames Then CurrentFra";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("g",__ref.getField(true,"_currentframe" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_numberofframes" /*RemoteObject*/ )))) { 
__ref.setField ("_currentframe" /*RemoteObject*/ ,__ref.getField(true,"_minframe" /*RemoteObject*/ ));};
 BA.debugLineNum = 119;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _switchframeifneeded(RemoteObject __ref,RemoteObject _gs) throws Exception{
try {
		Debug.PushSubsStack("SwitchFrameIfNeeded (x2bodywrapper) ","x2bodywrapper",15,__ref.getField(false, "ba"),__ref,100);
if (RapidSub.canDelegate("switchframeifneeded")) { return __ref.runUserSub(false, "x2bodywrapper","switchframeifneeded", __ref, _gs);}
Debug.locals.put("GS", _gs);
 BA.debugLineNum = 100;BA.debugLine="Public Sub SwitchFrameIfNeeded (GS As X2GameStep)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 101;BA.debugLine="If (GS.GameTimeMs - LastSwitchFrameTime) >= Switc";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("g",(RemoteObject.solve(new RemoteObject[] {_gs.getField(true,"GameTimeMs" /*RemoteObject*/ ),__ref.getField(true,"_lastswitchframetime" /*RemoteObject*/ )}, "-",1, 1)),BA.numberCast(double.class, __ref.getField(true,"_switchframeintervalms" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 102;BA.debugLine="LastSwitchFrameTime = GS.GameTimeMs";
Debug.JustUpdateDeviceLine();
__ref.setField ("_lastswitchframetime" /*RemoteObject*/ ,_gs.getField(true,"GameTimeMs" /*RemoteObject*/ ));
 BA.debugLineNum = 103;BA.debugLine="CurrentFrame = CurrentFrame + 1";
Debug.JustUpdateDeviceLine();
__ref.setField ("_currentframe" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_currentframe" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 104;BA.debugLine="If CurrentFrame >= NumberOfFrames Then CurrentFr";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("g",__ref.getField(true,"_currentframe" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_numberofframes" /*RemoteObject*/ )))) { 
__ref.setField ("_currentframe" /*RemoteObject*/ ,__ref.getField(true,"_minframe" /*RemoteObject*/ ));};
 };
 BA.debugLineNum = 106;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tick(RemoteObject __ref,RemoteObject _gs) throws Exception{
try {
		Debug.PushSubsStack("Tick (x2bodywrapper) ","x2bodywrapper",15,__ref.getField(false, "ba"),__ref,43);
if (RapidSub.canDelegate("tick")) { return __ref.runUserSub(false, "x2bodywrapper","tick", __ref, _gs);}
Debug.locals.put("GS", _gs);
 BA.debugLineNum = 43;BA.debugLine="Public Sub Tick (GS As X2GameStep)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 44;BA.debugLine="If IsDeleted Then Return";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_isdeleted" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 45;BA.debugLine="If DelegateTo <> Null Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",__ref.getField(false,"_delegateto" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 46;BA.debugLine="CallSub2(DelegateTo, \"Tick\", GS)";
Debug.JustUpdateDeviceLine();
x2bodywrapper.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_delegateto" /*RemoteObject*/ )),(Object)(BA.ObjectToString("Tick")),(Object)((_gs)));
 }else {
 BA.debugLineNum = 48;BA.debugLine="If (TimeToLiveMs > 0 And (GS.GameTimeMs - StartT";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(">",__ref.getField(true,"_timetolivems" /*RemoteObject*/ ),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("g",(RemoteObject.solve(new RemoteObject[] {_gs.getField(true,"GameTimeMs" /*RemoteObject*/ ),__ref.getField(true,"_starttime" /*RemoteObject*/ )}, "-",1, 1)),BA.numberCast(double.class, __ref.getField(true,"_timetolivems" /*RemoteObject*/ )))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(".",__ref.getField(true,"_destroyifinvisible" /*RemoteObject*/ )) && RemoteObject.solveBoolean("=",__ref.getField(true,"_isvisible" /*RemoteObject*/ ),x2bodywrapper.__c.getField(true,"False")))))) { 
 BA.debugLineNum = 50;BA.debugLine="Delete(GS)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.x2bodywrapper.class, "_delete" /*RemoteObject*/ ,(Object)(_gs));
 BA.debugLineNum = 51;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 53;BA.debugLine="If mGraphicName <> \"\" Then UpdateGraphic (GS, Tr";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_mgraphicname" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
__ref.runClassMethod (b4a.example.x2bodywrapper.class, "_updategraphic" /*RemoteObject*/ ,(Object)(_gs),(Object)(x2bodywrapper.__c.getField(true,"True")));};
 };
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
public static RemoteObject  _updategraphic(RemoteObject __ref,RemoteObject _gs,RemoteObject _increaseframeautomatically) throws Exception{
try {
		Debug.PushSubsStack("UpdateGraphic (x2bodywrapper) ","x2bodywrapper",15,__ref.getField(false, "ba"),__ref,85);
if (RapidSub.canDelegate("updategraphic")) { return __ref.runUserSub(false, "x2bodywrapper","updategraphic", __ref, _gs, _increaseframeautomatically);}
RemoteObject _dt = RemoteObject.declareNull("b4a.example.bitmapcreator._drawtask");
Debug.locals.put("GS", _gs);
Debug.locals.put("IncreaseFrameAutomatically", _increaseframeautomatically);
 BA.debugLineNum = 85;BA.debugLine="Public Sub UpdateGraphic (GS As X2GameStep, Increa";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 86;BA.debugLine="If IncreaseFrameAutomatically And SwitchFrameInte";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",_increaseframeautomatically) && RemoteObject.solveBoolean(">",__ref.getField(true,"_switchframeintervalms" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
__ref.runClassMethod (b4a.example.x2bodywrapper.class, "_switchframeifneeded" /*RemoteObject*/ ,(Object)(_gs));};
 BA.debugLineNum = 87;BA.debugLine="If GS.ShouldDraw And IsVisible Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",_gs.getField(true,"ShouldDraw" /*RemoteObject*/ )) && RemoteObject.solveBoolean(".",__ref.getField(true,"_isvisible" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 88;BA.debugLine="Dim dt As DrawTask = CreateDrawTaskBasedOnCache";
Debug.JustUpdateDeviceLine();
_dt = __ref.runClassMethod (b4a.example.x2bodywrapper.class, "_createdrawtaskbasedoncache" /*RemoteObject*/ );Debug.locals.put("dt", _dt);Debug.locals.put("dt", _dt);
 BA.debugLineNum = 89;BA.debugLine="If DrawLast Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_drawlast" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 90;BA.debugLine="X2.LastDrawingTasks.Add(dt)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_x2" /*RemoteObject*/ ).getField(false,"_lastdrawingtasks" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_dt)));
 }else 
{ BA.debugLineNum = 91;BA.debugLine="Else if DrawFirst Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_drawfirst" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 92;BA.debugLine="GS.DrawingTasks.InsertAt(1, dt) 'after the tran";
Debug.JustUpdateDeviceLine();
_gs.getField(false,"DrawingTasks" /*RemoteObject*/ ).runVoidMethod ("InsertAt",(Object)(BA.numberCast(int.class, 1)),(Object)((_dt)));
 }else {
 BA.debugLineNum = 94;BA.debugLine="GS.DrawingTasks.Add(dt)";
Debug.JustUpdateDeviceLine();
_gs.getField(false,"DrawingTasks" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_dt)));
 }}
;
 };
 BA.debugLineNum = 97;BA.debugLine="End Sub";
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