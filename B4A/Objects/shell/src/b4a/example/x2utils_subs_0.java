package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class x2utils_subs_0 {


public static RemoteObject  _addfuturetask(RemoteObject __ref,RemoteObject _callback,RemoteObject _subname,RemoteObject _timetofirems,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("AddFutureTask (x2utils) ","x2utils",21,__ref.getField(false, "ba"),__ref,420);
if (RapidSub.canDelegate("addfuturetask")) { return __ref.runUserSub(false, "x2utils","addfuturetask", __ref, _callback, _subname, _timetofirems, _value);}
Debug.locals.put("Callback", _callback);
Debug.locals.put("SubName", _subname);
Debug.locals.put("TimeToFireMs", _timetofirems);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 420;BA.debugLine="Public Sub AddFutureTask (Callback As Object, SubN";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 421;BA.debugLine="AddFutureTask2(Callback, SubName, TimeToFireMs, V";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.x2utils.class, "_addfuturetask2" /*RemoteObject*/ ,(Object)(_callback),(Object)(_subname),(Object)(_timetofirems),(Object)(_value),(Object)(x2utils.__c.getField(true,"False")));
 BA.debugLineNum = 422;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addfuturetask2(RemoteObject __ref,RemoteObject _callback,RemoteObject _subname,RemoteObject _timetofirems,RemoteObject _value,RemoteObject _allowduplicates) throws Exception{
try {
		Debug.PushSubsStack("AddFutureTask2 (x2utils) ","x2utils",21,__ref.getField(false, "ba"),__ref,425);
if (RapidSub.canDelegate("addfuturetask2")) { return __ref.runUserSub(false, "x2utils","addfuturetask2", __ref, _callback, _subname, _timetofirems, _value, _allowduplicates);}
RemoteObject _ft = RemoteObject.declareNull("b4a.example.x2utils._x2futuretask");
int _i = 0;
RemoteObject _old = RemoteObject.declareNull("b4a.example.x2utils._x2futuretask");
Debug.locals.put("Callback", _callback);
Debug.locals.put("SubName", _subname);
Debug.locals.put("TimeToFireMs", _timetofirems);
Debug.locals.put("Value", _value);
Debug.locals.put("AllowDuplicates", _allowduplicates);
 BA.debugLineNum = 425;BA.debugLine="Public Sub AddFutureTask2 (Callback As Object, Sub";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 426;BA.debugLine="Dim ft As X2FutureTask";
Debug.JustUpdateDeviceLine();
_ft = RemoteObject.createNew ("b4a.example.x2utils._x2futuretask");Debug.locals.put("ft", _ft);
 BA.debugLineNum = 427;BA.debugLine="ft.Callback = Callback";
Debug.JustUpdateDeviceLine();
_ft.setField ("Callback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 428;BA.debugLine="ft.SubName = SubName";
Debug.JustUpdateDeviceLine();
_ft.setField ("SubName" /*RemoteObject*/ ,_subname);
 BA.debugLineNum = 429;BA.debugLine="ft.GameTimeMs = TimeToFireMs + gs.GameTimeMs";
Debug.JustUpdateDeviceLine();
_ft.setField ("GameTimeMs" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {_timetofirems,__ref.getField(false,"_gs" /*RemoteObject*/ ).getField(true,"GameTimeMs" /*RemoteObject*/ )}, "+",1, 1));
 BA.debugLineNum = 430;BA.debugLine="ft.Value = Value";
Debug.JustUpdateDeviceLine();
_ft.setField ("Value" /*RemoteObject*/ ,_value);
 BA.debugLineNum = 431;BA.debugLine="For i = FutureTasks.Size - 1 To 0 Step -1";
Debug.JustUpdateDeviceLine();
{
final int step6 = -1;
final int limit6 = 0;
_i = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_futuretasks" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue() ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 432;BA.debugLine="Dim old As X2FutureTask = FutureTasks.Get(i)";
Debug.JustUpdateDeviceLine();
_old = (__ref.getField(false,"_futuretasks" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("old", _old);Debug.locals.put("old", _old);
 BA.debugLineNum = 433;BA.debugLine="If AllowDuplicates = False And old.Disabled = Fa";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_allowduplicates,x2utils.__c.getField(true,"False")) && RemoteObject.solveBoolean("=",_old.getField(true,"Disabled" /*RemoteObject*/ ),x2utils.__c.getField(true,"False")) && RemoteObject.solveBoolean("=",_old.getField(true,"GameTimeMs" /*RemoteObject*/ ),BA.numberCast(double.class, _ft.getField(true,"GameTimeMs" /*RemoteObject*/ ))) && RemoteObject.solveBoolean("=",_old.getField(false,"Callback" /*RemoteObject*/ ),_ft.getField(false,"Callback" /*RemoteObject*/ )) && RemoteObject.solveBoolean("=",_ft.getField(true,"SubName" /*RemoteObject*/ ),_old.getField(true,"SubName" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 434;BA.debugLine="old.Disabled = True";
Debug.JustUpdateDeviceLine();
_old.setField ("Disabled" /*RemoteObject*/ ,x2utils.__c.getField(true,"True"));
 };
 BA.debugLineNum = 436;BA.debugLine="If old.GameTimeMS > ft.GameTimeMs Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_old.getField(true,"GameTimeMs" /*RemoteObject*/ ),BA.numberCast(double.class, _ft.getField(true,"GameTimeMs" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 437;BA.debugLine="If i = FutureTasks.Size - 1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_futuretasks" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1)))) { 
 BA.debugLineNum = 438;BA.debugLine="FutureTasks.Add(ft)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_futuretasks" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_ft)));
 }else {
 BA.debugLineNum = 440;BA.debugLine="FutureTasks.InsertAt(i + 1, ft)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_futuretasks" /*RemoteObject*/ ).runVoidMethod ("InsertAt",(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)((_ft)));
 };
 BA.debugLineNum = 442;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.createImmutable("");
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 445;BA.debugLine="FutureTasks.InsertAt(0, ft)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_futuretasks" /*RemoteObject*/ ).runVoidMethod ("InsertAt",(Object)(BA.numberCast(int.class, 0)),(Object)((_ft)));
 BA.debugLineNum = 446;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _b2angletodegrees(RemoteObject __ref,RemoteObject _angle) throws Exception{
try {
		Debug.PushSubsStack("B2AngleToDegrees (x2utils) ","x2utils",21,__ref.getField(false, "ba"),__ref,270);
if (RapidSub.canDelegate("b2angletodegrees")) { return __ref.runUserSub(false, "x2utils","b2angletodegrees", __ref, _angle);}
Debug.locals.put("Angle", _angle);
 BA.debugLineNum = 270;BA.debugLine="Public Sub B2AngleToDegrees (Angle As Float) As In";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 271;BA.debugLine="Return Round(-Angle * 180 / cPI)";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(int.class, x2utils.__c.runMethod(true,"Round",(Object)(BA.numberCast(double.class, -(double) (0 + _angle.<Float>get().floatValue())*(double) (0 + 180)/(double)x2utils.__c.getField(true,"cPI").<Double>get().doubleValue()))));
 BA.debugLineNum = 272;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _bc_bitmapready(RemoteObject __ref,RemoteObject _bmp) throws Exception{
try {
		Debug.PushSubsStack("BC_BitmapReady (x2utils) ","x2utils",21,__ref.getField(false, "ba"),__ref,193);
if (RapidSub.canDelegate("bc_bitmapready")) { return __ref.runUserSub(false, "x2utils","bc_bitmapready", __ref, _bmp);}
Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 193;BA.debugLine="Private Sub BC_BitmapReady (bmp As B4XBitmap)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 203;BA.debugLine="Drawing = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_drawing" /*RemoteObject*/ ,x2utils.__c.getField(true,"False"));
 BA.debugLineNum = 204;BA.debugLine="FPS = Min((FPS * 20 + 1000 / (DateTime.Now - Last";
Debug.JustUpdateDeviceLine();
__ref.setField ("_fps" /*RemoteObject*/ ,BA.numberCast(float.class, x2utils.__c.runMethod(true,"Min",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_fps" /*RemoteObject*/ ),RemoteObject.createImmutable(20),RemoteObject.createImmutable(1000),(RemoteObject.solve(new RemoteObject[] {x2utils.__c.getField(false,"DateTime").runMethod(true,"getNow"),__ref.getField(true,"_lastdrawingtime" /*RemoteObject*/ )}, "-",1, 2))}, "*+/",1, 0)),RemoteObject.createImmutable(21)}, "/",0, 0)),(Object)(BA.numberCast(double.class, __ref.getField(true,"_targetfps" /*RemoteObject*/ ))))));
 BA.debugLineNum = 205;BA.debugLine="LastDrawingTime = DateTime.Now";
Debug.JustUpdateDeviceLine();
__ref.setField ("_lastdrawingtime" /*RemoteObject*/ ,x2utils.__c.getField(false,"DateTime").runMethod(true,"getNow"));
 BA.debugLineNum = 206;BA.debugLine="SetBitmapWithFitOrFill(mTargetView, bmp)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.x2utils.class, "_setbitmapwithfitorfill" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_mtargetview" /*RemoteObject*/ )),(Object)(_bmp));
 BA.debugLineNum = 207;BA.debugLine="mGame.DrawingComplete";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mgame" /*RemoteObject*/ ).runClassMethod (b4a.example.game.class, "_drawingcomplete" /*RemoteObject*/ );
 BA.debugLineNum = 211;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _bcpixelstometers(RemoteObject __ref,RemoteObject _pixels) throws Exception{
try {
		Debug.PushSubsStack("BCPixelsToMeters (x2utils) ","x2utils",21,__ref.getField(false, "ba"),__ref,349);
if (RapidSub.canDelegate("bcpixelstometers")) { return __ref.runUserSub(false, "x2utils","bcpixelstometers", __ref, _pixels);}
Debug.locals.put("Pixels", _pixels);
 BA.debugLineNum = 349;BA.debugLine="Public Sub BCPixelsToMeters (Pixels As Int) As Flo";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 350;BA.debugLine="Return Pixels / mBCPixelsPerMeter";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_pixels,__ref.getField(true,"_mbcpixelspermeter" /*RemoteObject*/ )}, "/",0, 0));
 BA.debugLineNum = 351;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0f);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _bitmaptobc(RemoteObject __ref,RemoteObject _bmp,RemoteObject _scale) throws Exception{
try {
		Debug.PushSubsStack("BitmapToBC (x2utils) ","x2utils",21,__ref.getField(false, "ba"),__ref,464);
if (RapidSub.canDelegate("bitmaptobc")) { return __ref.runUserSub(false, "x2utils","bitmaptobc", __ref, _bmp, _scale);}
RemoteObject _b2 = RemoteObject.declareNull("b4a.example.bitmapcreator");
Debug.locals.put("bmp", _bmp);
Debug.locals.put("Scale", _scale);
 BA.debugLineNum = 464;BA.debugLine="Public Sub BitmapToBC(bmp As B4XBitmap, Scale As F";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 465;BA.debugLine="Dim b2 As BitmapCreator";
Debug.JustUpdateDeviceLine();
_b2 = RemoteObject.createNew ("b4a.example.bitmapcreator");Debug.locals.put("b2", _b2);
 BA.debugLineNum = 466;BA.debugLine="b2.Initialize(bmp.Width / Scale, bmp.Height / Sca";
Debug.JustUpdateDeviceLine();
_b2.runVoidMethod ("_initialize",__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_bmp.runMethod(true,"getWidth"),_scale}, "/",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_bmp.runMethod(true,"getHeight"),_scale}, "/",0, 0))));
 BA.debugLineNum = 467;BA.debugLine="b2.CopyPixelsFromBitmap(bmp)";
Debug.JustUpdateDeviceLine();
_b2.runVoidMethod ("_copypixelsfrombitmap",(Object)(_bmp));
 BA.debugLineNum = 468;BA.debugLine="Return b2";
Debug.JustUpdateDeviceLine();
if (true) return _b2;
 BA.debugLineNum = 469;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _bitmaptocompressedbc(RemoteObject __ref,RemoteObject _bmp,RemoteObject _scale) throws Exception{
try {
		Debug.PushSubsStack("BitmapToCompressedBC (x2utils) ","x2utils",21,__ref.getField(false, "ba"),__ref,472);
if (RapidSub.canDelegate("bitmaptocompressedbc")) { return __ref.runUserSub(false, "x2utils","bitmaptocompressedbc", __ref, _bmp, _scale);}
RemoteObject _bc = RemoteObject.declareNull("b4a.example.bitmapcreator");
Debug.locals.put("bmp", _bmp);
Debug.locals.put("Scale", _scale);
 BA.debugLineNum = 472;BA.debugLine="Public Sub BitmapToCompressedBC (bmp As B4XBitmap,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 473;BA.debugLine="Dim bc As BitmapCreator = BitmapToBC(bmp, Scale)";
Debug.JustUpdateDeviceLine();
_bc = __ref.runClassMethod (b4a.example.x2utils.class, "_bitmaptobc" /*RemoteObject*/ ,(Object)(_bmp),(Object)(_scale));Debug.locals.put("bc", _bc);Debug.locals.put("bc", _bc);
 BA.debugLineNum = 474;BA.debugLine="Return bc.ExtractCompressedBC(bc.TargetRect, Grap";
Debug.JustUpdateDeviceLine();
if (true) return _bc.runMethod(false,"_extractcompressedbc",(Object)(_bc.getField(false,"_targetrect")),(Object)(__ref.getField(false,"_graphiccache" /*RemoteObject*/ ).getField(false,"_cbccache" /*RemoteObject*/ )));
 BA.debugLineNum = 475;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private xui As XUI";
x2utils._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",x2utils._xui);
 //BA.debugLineNum = 3;BA.debugLine="Public gs As X2GameStep";
x2utils._gs = RemoteObject.createNew ("b4a.example.x2utils._x2gamestep");__ref.setField("_gs",x2utils._gs);
 //BA.debugLineNum = 4;BA.debugLine="Type X2GameStep (BodiesToDelete As List, GameTime";
;
 //BA.debugLineNum = 7;BA.debugLine="Type X2BodiesFromContact (ThisBody As X2BodyWrapp";
;
 //BA.debugLineNum = 9;BA.debugLine="Public ResumableIndex As Int";
x2utils._resumableindex = RemoteObject.createImmutable(0);__ref.setField("_resumableindex",x2utils._resumableindex);
 //BA.debugLineNum = 10;BA.debugLine="Public mTargetView As B4XView 'Foreground ImageVi";
x2utils._mtargetview = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mtargetview",x2utils._mtargetview);
 //BA.debugLineNum = 11;BA.debugLine="Public MainBC As BitmapCreator  'Foreground BC";
x2utils._mainbc = RemoteObject.createNew ("b4a.example.bitmapcreator");__ref.setField("_mainbc",x2utils._mainbc);
 //BA.debugLineNum = 13;BA.debugLine="Type X2FutureTask (Callback As Object, SubName As";
;
 //BA.debugLineNum = 14;BA.debugLine="Private FutureTasks As List";
x2utils._futuretasks = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_futuretasks",x2utils._futuretasks);
 //BA.debugLineNum = 15;BA.debugLine="Private LoopsPerSecond As Float";
x2utils._loopspersecond = RemoteObject.createImmutable(0f);__ref.setField("_loopspersecond",x2utils._loopspersecond);
 //BA.debugLineNum = 16;BA.debugLine="Public IsRunning As Boolean";
x2utils._isrunning = RemoteObject.createImmutable(false);__ref.setField("_isrunning",x2utils._isrunning);
 //BA.debugLineNum = 17;BA.debugLine="Public mGame As Game";
x2utils._mgame = RemoteObject.createNew ("b4a.example.game");__ref.setField("_mgame",x2utils._mgame);
 //BA.debugLineNum = 18;BA.debugLine="Public mWorld As B2World";
x2utils._mworld = RemoteObject.createNew ("anywheresoftware.b4a.objects.B2World");__ref.setField("_mworld",x2utils._mworld);
 //BA.debugLineNum = 19;BA.debugLine="Public mBCPixelsPerMeter As Float";
x2utils._mbcpixelspermeter = RemoteObject.createImmutable(0f);__ref.setField("_mbcpixelspermeter",x2utils._mbcpixelspermeter);
 //BA.debugLineNum = 20;BA.debugLine="Public GraphicCache As X2SpriteGraphicCache";
x2utils._graphiccache = RemoteObject.createNew ("b4a.example.x2spritegraphiccache");__ref.setField("_graphiccache",x2utils._graphiccache);
 //BA.debugLineNum = 21;BA.debugLine="Public const BmpSmoothScale As Float = 1 'no long";
x2utils._bmpsmoothscale = BA.numberCast(float.class, 1);__ref.setField("_bmpsmoothscale",x2utils._bmpsmoothscale);
 //BA.debugLineNum = 23;BA.debugLine="Public ScreenAABB As B2AABB";
x2utils._screenaabb = RemoteObject.createNew ("anywheresoftware.b4a.objects.B2AABB");__ref.setField("_screenaabb",x2utils._screenaabb);
 //BA.debugLineNum = 25;BA.debugLine="Type X2ScaledBitmap (Bmp As B4XBitmap, Scale As F";
;
 //BA.debugLineNum = 26;BA.debugLine="Private Drawing As Boolean";
x2utils._drawing = RemoteObject.createImmutable(false);__ref.setField("_drawing",x2utils._drawing);
 //BA.debugLineNum = 28;BA.debugLine="Public TargetFPS As Int = 30";
x2utils._targetfps = BA.numberCast(int.class, 30);__ref.setField("_targetfps",x2utils._targetfps);
 //BA.debugLineNum = 32;BA.debugLine="Public Transparent As BitmapCreator";
x2utils._transparent = RemoteObject.createNew ("b4a.example.bitmapcreator");__ref.setField("_transparent",x2utils._transparent);
 //BA.debugLineNum = 35;BA.debugLine="Public TimeStepMs As Float";
x2utils._timestepms = RemoteObject.createImmutable(0f);__ref.setField("_timestepms",x2utils._timestepms);
 //BA.debugLineNum = 36;BA.debugLine="Public DebugDraw As X2DebugDraw";
x2utils._debugdraw = RemoteObject.createNew ("b4a.example.x2debugdraw");__ref.setField("_debugdraw",x2utils._debugdraw);
 //BA.debugLineNum = 37;BA.debugLine="Private IsDebugDrawEnabled As Boolean";
x2utils._isdebugdrawenabled = RemoteObject.createImmutable(false);__ref.setField("_isdebugdrawenabled",x2utils._isdebugdrawenabled);
 //BA.debugLineNum = 38;BA.debugLine="Public SoundPool As X2SoundPool";
x2utils._soundpool = RemoteObject.createNew ("b4a.example.x2soundpool");__ref.setField("_soundpool",x2utils._soundpool);
 //BA.debugLineNum = 40;BA.debugLine="Public IsLowFPS As Boolean";
x2utils._islowfps = RemoteObject.createImmutable(false);__ref.setField("_islowfps",x2utils._islowfps);
 //BA.debugLineNum = 41;BA.debugLine="Public FPS As Float";
x2utils._fps = RemoteObject.createImmutable(0f);__ref.setField("_fps",x2utils._fps);
 //BA.debugLineNum = 42;BA.debugLine="Private LastDrawingTime As Long";
x2utils._lastdrawingtime = RemoteObject.createImmutable(0L);__ref.setField("_lastdrawingtime",x2utils._lastdrawingtime);
 //BA.debugLineNum = 44;BA.debugLine="Public SlowDownPhysicsScale As Float = 1";
x2utils._slowdownphysicsscale = BA.numberCast(float.class, 1);__ref.setField("_slowdownphysicsscale",x2utils._slowdownphysicsscale);
 //BA.debugLineNum = 45;BA.debugLine="Private SleepTime As Int";
x2utils._sleeptime = RemoteObject.createImmutable(0);__ref.setField("_sleeptime",x2utils._sleeptime);
 //BA.debugLineNum = 46;BA.debugLine="Public VelocityIterations As Int = 8";
x2utils._velocityiterations = BA.numberCast(int.class, 8);__ref.setField("_velocityiterations",x2utils._velocityiterations);
 //BA.debugLineNum = 47;BA.debugLine="Public PositionIterations As Int = 3";
x2utils._positioniterations = BA.numberCast(int.class, 3);__ref.setField("_positioniterations",x2utils._positioniterations);
 //BA.debugLineNum = 48;BA.debugLine="Public LastDrawingTasks As List";
x2utils._lastdrawingtasks = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_lastdrawingtasks",x2utils._lastdrawingtasks);
 //BA.debugLineNum = 49;BA.debugLine="Public ShapeAABB As B2AABB";
x2utils._shapeaabb = RemoteObject.createNew ("anywheresoftware.b4a.objects.B2AABB");__ref.setField("_shapeaabb",x2utils._shapeaabb);
 //BA.debugLineNum = 53;BA.debugLine="Private ShapeTransform As B2Transform";
x2utils._shapetransform = RemoteObject.createNew ("anywheresoftware.b4a.objects.B2Transform");__ref.setField("_shapetransform",x2utils._shapetransform);
 //BA.debugLineNum = 57;BA.debugLine="Private const MAX_SIZE As Int = 700";
x2utils._max_size = BA.numberCast(int.class, 700);__ref.setField("_max_size",x2utils._max_size);
 //BA.debugLineNum = 59;BA.debugLine="Private EmptyList As List";
x2utils._emptylist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_emptylist",x2utils._emptylist);
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _configuredimensions(RemoteObject __ref,RemoteObject _centerpointinmeters,RemoteObject _targetviewwidthinmeters) throws Exception{
try {
		Debug.PushSubsStack("ConfigureDimensions (x2utils) ","x2utils",21,__ref.getField(false, "ba"),__ref,330);
if (RapidSub.canDelegate("configuredimensions")) { return __ref.runUserSub(false, "x2utils","configuredimensions", __ref, _centerpointinmeters, _targetviewwidthinmeters);}
Debug.locals.put("CenterPointInMeters", _centerpointinmeters);
Debug.locals.put("TargetViewWidthInMeters", _targetviewwidthinmeters);
 BA.debugLineNum = 330;BA.debugLine="Public Sub ConfigureDimensions (CenterPointInMeter";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 331;BA.debugLine="mBCPixelsPerMeter = MainBC.mWidth / TargetViewWid";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mbcpixelspermeter" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mainbc" /*RemoteObject*/ ).getField(true,"_mwidth"),_targetviewwidthinmeters}, "/",0, 0)));
 BA.debugLineNum = 332;BA.debugLine="UpdateWorldCenter(CenterPointInMeters)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.x2utils.class, "_updateworldcenter" /*RemoteObject*/ ,(Object)(_centerpointinmeters));
 BA.debugLineNum = 333;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _convertmillisecondstostring(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("ConvertMillisecondsToString (x2utils) ","x2utils",21,__ref.getField(false, "ba"),__ref,543);
if (RapidSub.canDelegate("convertmillisecondstostring")) { return __ref.runUserSub(false, "x2utils","convertmillisecondstostring", __ref, _t);}
RemoteObject _minutes = RemoteObject.createImmutable(0);
RemoteObject _seconds = RemoteObject.createImmutable(0);
Debug.locals.put("t", _t);
 BA.debugLineNum = 543;BA.debugLine="Private Sub ConvertMillisecondsToString(t As Long)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 544;BA.debugLine="Dim minutes As Int = t / DateTime.TicksPerMinut";
Debug.JustUpdateDeviceLine();
_minutes = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_t,x2utils.__c.getField(false,"DateTime").getField(true,"TicksPerMinute")}, "/",0, 0));Debug.locals.put("minutes", _minutes);Debug.locals.put("minutes", _minutes);
 BA.debugLineNum = 545;BA.debugLine="Dim seconds As Int = (t Mod DateTime.TicksPerMi";
Debug.JustUpdateDeviceLine();
_seconds = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_t,x2utils.__c.getField(false,"DateTime").getField(true,"TicksPerMinute")}, "%",0, 2)),x2utils.__c.getField(false,"DateTime").getField(true,"TicksPerSecond")}, "/",0, 0));Debug.locals.put("seconds", _seconds);Debug.locals.put("seconds", _seconds);
 BA.debugLineNum = 546;BA.debugLine="Return $\"$1.0{minutes}:$2.0{seconds}\"$";
Debug.JustUpdateDeviceLine();
if (true) return (RemoteObject.concat(RemoteObject.createImmutable(""),x2utils.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("1.0")),(Object)((_minutes))),RemoteObject.createImmutable(":"),x2utils.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("2.0")),(Object)((_seconds))),RemoteObject.createImmutable("")));
 BA.debugLineNum = 547;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createbodyandwrapper(RemoteObject __ref,RemoteObject _bd,RemoteObject _delegate,RemoteObject _name) throws Exception{
try {
		Debug.PushSubsStack("CreateBodyAndWrapper (x2utils) ","x2utils",21,__ref.getField(false, "ba"),__ref,259);
if (RapidSub.canDelegate("createbodyandwrapper")) { return __ref.runUserSub(false, "x2utils","createbodyandwrapper", __ref, _bd, _delegate, _name);}
RemoteObject _wrapper = RemoteObject.declareNull("b4a.example.x2bodywrapper");
Debug.locals.put("bd", _bd);
Debug.locals.put("Delegate", _delegate);
Debug.locals.put("Name", _name);
 BA.debugLineNum = 259;BA.debugLine="Public Sub CreateBodyAndWrapper (bd As B2BodyDef,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 260;BA.debugLine="Dim wrapper As X2BodyWrapper";
Debug.JustUpdateDeviceLine();
_wrapper = RemoteObject.createNew ("b4a.example.x2bodywrapper");Debug.locals.put("wrapper", _wrapper);
 BA.debugLineNum = 261;BA.debugLine="wrapper.Initialize(mGame, Delegate, Name)";
Debug.JustUpdateDeviceLine();
_wrapper.runClassMethod (b4a.example.x2bodywrapper.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mgame" /*RemoteObject*/ )),(Object)(_delegate),(Object)(_name));
 BA.debugLineNum = 262;BA.debugLine="wrapper.SetBody(mWorld.CreateBody(bd))";
Debug.JustUpdateDeviceLine();
_wrapper.runClassMethod (b4a.example.x2bodywrapper.class, "_setbody" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_mworld" /*RemoteObject*/ ).runMethod(false,"CreateBody",(Object)(_bd))));
 BA.debugLineNum = 263;BA.debugLine="Return wrapper";
Debug.JustUpdateDeviceLine();
if (true) return _wrapper;
 BA.debugLineNum = 264;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createdrawtaskfromcompressedbc(RemoteObject __ref,RemoteObject _cbc,RemoteObject _bcposition,RemoteObject _srcrect) throws Exception{
try {
		Debug.PushSubsStack("CreateDrawTaskFromCompressedBC (x2utils) ","x2utils",21,__ref.getField(false, "ba"),__ref,525);
if (RapidSub.canDelegate("createdrawtaskfromcompressedbc")) { return __ref.runUserSub(false, "x2utils","createdrawtaskfromcompressedbc", __ref, _cbc, _bcposition, _srcrect);}
RemoteObject _dt = RemoteObject.declareNull("b4a.example.bitmapcreator._drawtask");
Debug.locals.put("CBC", _cbc);
Debug.locals.put("BCPosition", _bcposition);
Debug.locals.put("SrcRect", _srcrect);
 BA.debugLineNum = 525;BA.debugLine="Public Sub CreateDrawTaskFromCompressedBC (CBC As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 526;BA.debugLine="Dim dt As DrawTask = MainBC.CreateDrawTask(CBC, S";
Debug.JustUpdateDeviceLine();
_dt = __ref.getField(false,"_mainbc" /*RemoteObject*/ ).runMethod(false,"_createdrawtask",(Object)((_cbc)),(Object)(_srcrect),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_bcposition.runMethod(true,"getX"),_srcrect.runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "-/",1, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_bcposition.runMethod(true,"getY"),_srcrect.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "-/",1, 0))),(Object)(x2utils.__c.getField(true,"False")));Debug.locals.put("dt", _dt);Debug.locals.put("dt", _dt);
 BA.debugLineNum = 528;BA.debugLine="dt.IsCompressedSource = True";
Debug.JustUpdateDeviceLine();
_dt.setField ("IsCompressedSource",x2utils.__c.getField(true,"True"));
 BA.debugLineNum = 529;BA.debugLine="Return dt";
Debug.JustUpdateDeviceLine();
if (true) return _dt;
 BA.debugLineNum = 530;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createimmutablebitmap(RemoteObject __ref,RemoteObject _cvs) throws Exception{
try {
		Debug.PushSubsStack("CreateImmutableBitmap (x2utils) ","x2utils",21,__ref.getField(false, "ba"),__ref,533);
if (RapidSub.canDelegate("createimmutablebitmap")) { return __ref.runUserSub(false, "x2utils","createimmutablebitmap", __ref, _cvs);}
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
RemoteObject _b = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
Debug.locals.put("CVS", _cvs);
 BA.debugLineNum = 533;BA.debugLine="Public Sub CreateImmutableBitmap (CVS As B4XCanvas";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 534;BA.debugLine="Dim bmp As B4XBitmap = CVS.CreateBitmap";
Debug.JustUpdateDeviceLine();
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_bmp = _cvs.runMethod(false,"CreateBitmap");Debug.locals.put("bmp", _bmp);Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 536;BA.debugLine="Dim b As Bitmap";
Debug.JustUpdateDeviceLine();
_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("b", _b);
 BA.debugLineNum = 537;BA.debugLine="b.Initialize3(bmp)";
Debug.JustUpdateDeviceLine();
_b.runVoidMethod ("Initialize3",(Object)((_bmp.getObject())));
 BA.debugLineNum = 538;BA.debugLine="bmp = b";
Debug.JustUpdateDeviceLine();
_bmp = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper"), _b.getObject());Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 540;BA.debugLine="Return bmp";
Debug.JustUpdateDeviceLine();
if (true) return _bmp;
 BA.debugLineNum = 541;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createvec2(RemoteObject __ref,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("CreateVec2 (x2utils) ","x2utils",21,__ref.getField(false, "ba"),__ref,520);
if (RapidSub.canDelegate("createvec2")) { return __ref.runUserSub(false, "x2utils","createvec2", __ref, _x, _y);}
Debug.locals.put("x", _x);
Debug.locals.put("y", _y);
 BA.debugLineNum = 520;BA.debugLine="Public Sub CreateVec2 (x As Float, y As Float) As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 521;BA.debugLine="Return mWorld.CreateVec2 (x, y)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_mworld" /*RemoteObject*/ ).runMethod(false,"CreateVec2",(Object)(_x),(Object)(_y));
 BA.debugLineNum = 522;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _degreestob2angle(RemoteObject __ref,RemoteObject _degrees) throws Exception{
try {
		Debug.PushSubsStack("DegreesToB2Angle (x2utils) ","x2utils",21,__ref.getField(false, "ba"),__ref,266);
if (RapidSub.canDelegate("degreestob2angle")) { return __ref.runUserSub(false, "x2utils","degreestob2angle", __ref, _degrees);}
Debug.locals.put("Degrees", _degrees);
 BA.debugLineNum = 266;BA.debugLine="Public Sub DegreesToB2Angle (Degrees As Int) As Fl";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 267;BA.debugLine="Return -cPI / 180 * Degrees";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(float.class, -x2utils.__c.getField(true,"cPI").<Double>get().doubleValue()/(double)(double) (0 + 180)*(double) (0 + _degrees.<Integer>get().intValue()));
 BA.debugLineNum = 268;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0f);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _enabledebugdraw(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("EnableDebugDraw (x2utils) ","x2utils",21,__ref.getField(false, "ba"),__ref,214);
if (RapidSub.canDelegate("enabledebugdraw")) { return __ref.runUserSub(false, "x2utils","enabledebugdraw", __ref);}
 BA.debugLineNum = 214;BA.debugLine="Public Sub EnableDebugDraw";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 215;BA.debugLine="If IsDebugDrawEnabled Then Return";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_isdebugdrawenabled" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 216;BA.debugLine="DebugDraw.Initialize(mTargetView.Parent, Me)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_debugdraw" /*RemoteObject*/ ).runClassMethod (b4a.example.x2debugdraw.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mtargetview" /*RemoteObject*/ ).runMethod(false,"getParent")),(Object)((__ref)));
 BA.debugLineNum = 217;BA.debugLine="IsDebugDrawEnabled = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_isdebugdrawenabled" /*RemoteObject*/ ,x2utils.__c.getField(true,"True"));
 BA.debugLineNum = 218;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbodiesfromcontact(RemoteObject __ref,RemoteObject _contact,RemoteObject _firstname) throws Exception{
try {
		Debug.PushSubsStack("GetBodiesFromContact (x2utils) ","x2utils",21,__ref.getField(false, "ba"),__ref,477);
if (RapidSub.canDelegate("getbodiesfromcontact")) { return __ref.runUserSub(false, "x2utils","getbodiesfromcontact", __ref, _contact, _firstname);}
RemoteObject _bw = RemoteObject.declareNull("b4a.example.x2bodywrapper");
RemoteObject _bc = RemoteObject.declareNull("b4a.example.x2utils._x2bodiesfromcontact");
Debug.locals.put("Contact", _contact);
Debug.locals.put("FirstName", _firstname);
 BA.debugLineNum = 477;BA.debugLine="Public Sub GetBodiesFromContact (Contact As B2Cont";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 478;BA.debugLine="Dim bw As X2BodyWrapper = Contact.FixtureA.Body.T";
Debug.JustUpdateDeviceLine();
_bw = (_contact.runMethod(false,"getFixtureA").runMethod(false,"getBody").runMethod(false,"getTag"));Debug.locals.put("bw", _bw);Debug.locals.put("bw", _bw);
 BA.debugLineNum = 479;BA.debugLine="If bw = Null Or Contact.FixtureB.Body.Tag = Null";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("n",_bw) || RemoteObject.solveBoolean("n",_contact.runMethod(false,"getFixtureB").runMethod(false,"getBody").runMethod(false,"getTag"))) { 
if (true) return (x2utils.__c.getField(false,"Null"));};
 BA.debugLineNum = 480;BA.debugLine="If bw.Name = FirstName Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_bw.getField(true,"_name" /*RemoteObject*/ ),_firstname)) { 
 BA.debugLineNum = 481;BA.debugLine="Dim bc As X2BodiesFromContact";
Debug.JustUpdateDeviceLine();
_bc = RemoteObject.createNew ("b4a.example.x2utils._x2bodiesfromcontact");Debug.locals.put("bc", _bc);
 BA.debugLineNum = 482;BA.debugLine="bc.ThisBody = bw";
Debug.JustUpdateDeviceLine();
_bc.setField ("ThisBody" /*RemoteObject*/ ,_bw);
 BA.debugLineNum = 483;BA.debugLine="bc.OtherBody = Contact.FixtureB.Body.Tag";
Debug.JustUpdateDeviceLine();
_bc.setField ("OtherBody" /*RemoteObject*/ ,(_contact.runMethod(false,"getFixtureB").runMethod(false,"getBody").runMethod(false,"getTag")));
 BA.debugLineNum = 484;BA.debugLine="bc.ThisFixture = Contact.FixtureA";
Debug.JustUpdateDeviceLine();
_bc.setField ("ThisFixture" /*RemoteObject*/ ,_contact.runMethod(false,"getFixtureA"));
 BA.debugLineNum = 485;BA.debugLine="bc.OtherFixture = Contact.FixtureB";
Debug.JustUpdateDeviceLine();
_bc.setField ("OtherFixture" /*RemoteObject*/ ,_contact.runMethod(false,"getFixtureB"));
 BA.debugLineNum = 486;BA.debugLine="bc.NormalSign = 1";
Debug.JustUpdateDeviceLine();
_bc.setField ("NormalSign" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 BA.debugLineNum = 487;BA.debugLine="Return bc";
Debug.JustUpdateDeviceLine();
if (true) return _bc;
 }else {
 BA.debugLineNum = 489;BA.debugLine="bw = Contact.FixtureB.Body.Tag";
Debug.JustUpdateDeviceLine();
_bw = (_contact.runMethod(false,"getFixtureB").runMethod(false,"getBody").runMethod(false,"getTag"));Debug.locals.put("bw", _bw);
 BA.debugLineNum = 490;BA.debugLine="If bw.Name = FirstName Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_bw.getField(true,"_name" /*RemoteObject*/ ),_firstname)) { 
 BA.debugLineNum = 491;BA.debugLine="Dim bc As X2BodiesFromContact";
Debug.JustUpdateDeviceLine();
_bc = RemoteObject.createNew ("b4a.example.x2utils._x2bodiesfromcontact");Debug.locals.put("bc", _bc);
 BA.debugLineNum = 492;BA.debugLine="bc.ThisBody = bw";
Debug.JustUpdateDeviceLine();
_bc.setField ("ThisBody" /*RemoteObject*/ ,_bw);
 BA.debugLineNum = 493;BA.debugLine="bc.OtherBody = Contact.FixtureA.Body.Tag";
Debug.JustUpdateDeviceLine();
_bc.setField ("OtherBody" /*RemoteObject*/ ,(_contact.runMethod(false,"getFixtureA").runMethod(false,"getBody").runMethod(false,"getTag")));
 BA.debugLineNum = 494;BA.debugLine="bc.ThisFixture = Contact.FixtureB";
Debug.JustUpdateDeviceLine();
_bc.setField ("ThisFixture" /*RemoteObject*/ ,_contact.runMethod(false,"getFixtureB"));
 BA.debugLineNum = 495;BA.debugLine="bc.OtherFixture = Contact.FixtureA";
Debug.JustUpdateDeviceLine();
_bc.setField ("OtherFixture" /*RemoteObject*/ ,_contact.runMethod(false,"getFixtureA"));
 BA.debugLineNum = 496;BA.debugLine="bc.NormalSign = -1";
Debug.JustUpdateDeviceLine();
_bc.setField ("NormalSign" /*RemoteObject*/ ,BA.numberCast(int.class, -(double) (0 + 1)));
 BA.debugLineNum = 497;BA.debugLine="Return bc";
Debug.JustUpdateDeviceLine();
if (true) return _bc;
 };
 };
 BA.debugLineNum = 500;BA.debugLine="Return Null";
Debug.JustUpdateDeviceLine();
if (true) return (x2utils.__c.getField(false,"Null"));
 BA.debugLineNum = 501;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbodiesintersectingwithworldpoint(RemoteObject __ref,RemoteObject _point) throws Exception{
try {
		Debug.PushSubsStack("GetBodiesIntersectingWithWorldPoint (x2utils) ","x2utils",21,__ref.getField(false, "ba"),__ref,589);
if (RapidSub.canDelegate("getbodiesintersectingwithworldpoint")) { return __ref.runUserSub(false, "x2utils","getbodiesintersectingwithworldpoint", __ref, _point);}
RemoteObject _bodies = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _body = RemoteObject.declareNull("anywheresoftware.b4a.objects.B2Body");
RemoteObject _f = RemoteObject.declareNull("anywheresoftware.b4a.objects.B2Fixture");
Debug.locals.put("Point", _point);
 BA.debugLineNum = 589;BA.debugLine="Public Sub GetBodiesIntersectingWithWorldPoint (Po";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 590;BA.debugLine="ShapeAABB.BottomLeft.Set(Point.X, Point.Y)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_shapeaabb" /*RemoteObject*/ ).runMethod(false,"getBottomLeft").runVoidMethod ("Set",(Object)(_point.runMethod(true,"getX")),(Object)(_point.runMethod(true,"getY")));
 BA.debugLineNum = 591;BA.debugLine="ShapeAABB.TopRight.Set(Point.X, Point.Y)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_shapeaabb" /*RemoteObject*/ ).runMethod(false,"getTopRight").runVoidMethod ("Set",(Object)(_point.runMethod(true,"getX")),(Object)(_point.runMethod(true,"getY")));
 BA.debugLineNum = 592;BA.debugLine="Dim bodies As Map = mWorld.QueryAABBToMapOfBodies";
Debug.JustUpdateDeviceLine();
_bodies = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_bodies = __ref.getField(false,"_mworld" /*RemoteObject*/ ).runMethod(false,"QueryAABBToMapOfBodies",(Object)(__ref.getField(false,"_shapeaabb" /*RemoteObject*/ )));Debug.locals.put("bodies", _bodies);Debug.locals.put("bodies", _bodies);
 BA.debugLineNum = 593;BA.debugLine="If bodies.Size = 0 Then Return EmptyList";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_bodies.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return __ref.getField(false,"_emptylist" /*RemoteObject*/ );};
 BA.debugLineNum = 594;BA.debugLine="Dim res As List";
Debug.JustUpdateDeviceLine();
_res = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("res", _res);
 BA.debugLineNum = 595;BA.debugLine="res.Initialize";
Debug.JustUpdateDeviceLine();
_res.runVoidMethod ("Initialize");
 BA.debugLineNum = 596;BA.debugLine="For Each body As B2Body In bodies.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group7 = _bodies.runMethod(false,"Keys");
final int groupLen7 = group7.runMethod(true,"getSize").<Integer>get()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_body = (group7.runMethod(false,"Get",index7));Debug.locals.put("body", _body);
Debug.locals.put("body", _body);
 BA.debugLineNum = 597;BA.debugLine="Dim f As B2Fixture = body.FirstFixture";
Debug.JustUpdateDeviceLine();
_f = _body.runMethod(false,"getFirstFixture");Debug.locals.put("f", _f);Debug.locals.put("f", _f);
 BA.debugLineNum = 598;BA.debugLine="Do While f <> Null";
Debug.JustUpdateDeviceLine();
while (RemoteObject.solveBoolean("N",_f)) {
 BA.debugLineNum = 599;BA.debugLine="If f.Shape.TestPoint(body.Transform, Point) The";
Debug.JustUpdateDeviceLine();
if (_f.runMethod(false,"getShape").runMethod(true,"TestPoint",(Object)(_body.runMethod(false,"getTransform")),(Object)(_point)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 600;BA.debugLine="res.Add(body.Tag)";
Debug.JustUpdateDeviceLine();
_res.runVoidMethod ("Add",(Object)(_body.runMethod(false,"getTag")));
 BA.debugLineNum = 601;BA.debugLine="Exit";
Debug.JustUpdateDeviceLine();
if (true) break;
 };
 BA.debugLineNum = 603;BA.debugLine="f = f.NextFixture";
Debug.JustUpdateDeviceLine();
_f = _f.runMethod(false,"NextFixture");Debug.locals.put("f", _f);
 }
;
 }
}Debug.locals.put("body", _body);
;
 BA.debugLineNum = 606;BA.debugLine="Return res";
Debug.JustUpdateDeviceLine();
if (true) return _res;
 BA.debugLineNum = 607;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbodieswrappersbyids(RemoteObject __ref,RemoteObject _listofids) throws Exception{
try {
		Debug.PushSubsStack("GetBodiesWrappersByIds (x2utils) ","x2utils",21,__ref.getField(false, "ba"),__ref,575);
if (RapidSub.canDelegate("getbodieswrappersbyids")) { return __ref.runUserSub(false, "x2utils","getbodieswrappersbyids", __ref, _listofids);}
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _bodies = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _body = RemoteObject.declareNull("anywheresoftware.b4a.objects.B2Body");
RemoteObject _bw = RemoteObject.declareNull("b4a.example.x2bodywrapper");
Debug.locals.put("ListOfIds", _listofids);
 BA.debugLineNum = 575;BA.debugLine="Public Sub GetBodiesWrappersByIds(ListOfIds As Lis";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 576;BA.debugLine="Dim res As List";
Debug.JustUpdateDeviceLine();
_res = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("res", _res);
 BA.debugLineNum = 577;BA.debugLine="res.Initialize";
Debug.JustUpdateDeviceLine();
_res.runVoidMethod ("Initialize");
 BA.debugLineNum = 578;BA.debugLine="Dim bodies As List = mWorld.AllBodies";
Debug.JustUpdateDeviceLine();
_bodies = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_bodies = __ref.getField(false,"_mworld" /*RemoteObject*/ ).runMethod(false,"getAllBodies");Debug.locals.put("bodies", _bodies);Debug.locals.put("bodies", _bodies);
 BA.debugLineNum = 579;BA.debugLine="For Each body As B2Body In bodies";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group4 = _bodies;
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_body = (group4.runMethod(false,"Get",index4));Debug.locals.put("body", _body);
Debug.locals.put("body", _body);
 BA.debugLineNum = 580;BA.debugLine="Dim bw As X2BodyWrapper = body.Tag";
Debug.JustUpdateDeviceLine();
_bw = (_body.runMethod(false,"getTag"));Debug.locals.put("bw", _bw);Debug.locals.put("bw", _bw);
 BA.debugLineNum = 581;BA.debugLine="If ListOfIds.IndexOf(bw.Id) > -1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_listofids.runMethod(true,"IndexOf",(Object)((_bw.getField(true,"_id" /*RemoteObject*/ )))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 582;BA.debugLine="res.Add(bw)";
Debug.JustUpdateDeviceLine();
_res.runVoidMethod ("Add",(Object)((_bw)));
 };
 }
}Debug.locals.put("body", _body);
;
 BA.debugLineNum = 585;BA.debugLine="Return res";
Debug.JustUpdateDeviceLine();
if (true) return _res;
 BA.debugLineNum = 586;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbodywrapperbyid(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("GetBodyWrapperById (x2utils) ","x2utils",21,__ref.getField(false, "ba"),__ref,555);
if (RapidSub.canDelegate("getbodywrapperbyid")) { return __ref.runUserSub(false, "x2utils","getbodywrapperbyid", __ref, _id);}
RemoteObject _bodies = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _body = RemoteObject.declareNull("anywheresoftware.b4a.objects.B2Body");
RemoteObject _bw = RemoteObject.declareNull("b4a.example.x2bodywrapper");
Debug.locals.put("Id", _id);
 BA.debugLineNum = 555;BA.debugLine="Public Sub GetBodyWrapperById (Id As Int) As X2Bod";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 556;BA.debugLine="Dim bodies As List = mWorld.AllBodies";
Debug.JustUpdateDeviceLine();
_bodies = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_bodies = __ref.getField(false,"_mworld" /*RemoteObject*/ ).runMethod(false,"getAllBodies");Debug.locals.put("bodies", _bodies);Debug.locals.put("bodies", _bodies);
 BA.debugLineNum = 557;BA.debugLine="For Each body As B2Body In bodies";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group2 = _bodies;
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_body = (group2.runMethod(false,"Get",index2));Debug.locals.put("body", _body);
Debug.locals.put("body", _body);
 BA.debugLineNum = 558;BA.debugLine="Dim bw As X2BodyWrapper = body.Tag";
Debug.JustUpdateDeviceLine();
_bw = (_body.runMethod(false,"getTag"));Debug.locals.put("bw", _bw);Debug.locals.put("bw", _bw);
 BA.debugLineNum = 559;BA.debugLine="If bw.Id = Id Then Return bw";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_bw.getField(true,"_id" /*RemoteObject*/ ),BA.numberCast(double.class, _id))) { 
if (true) return _bw;};
 }
}Debug.locals.put("body", _body);
;
 BA.debugLineNum = 561;BA.debugLine="Return Null";
Debug.JustUpdateDeviceLine();
if (true) return (x2utils.__c.getField(false,"Null"));
 BA.debugLineNum = 562;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbodywrapperbyname(RemoteObject __ref,RemoteObject _name) throws Exception{
try {
		Debug.PushSubsStack("GetBodyWrapperByName (x2utils) ","x2utils",21,__ref.getField(false, "ba"),__ref,565);
if (RapidSub.canDelegate("getbodywrapperbyname")) { return __ref.runUserSub(false, "x2utils","getbodywrapperbyname", __ref, _name);}
RemoteObject _bodies = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _body = RemoteObject.declareNull("anywheresoftware.b4a.objects.B2Body");
RemoteObject _bw = RemoteObject.declareNull("b4a.example.x2bodywrapper");
Debug.locals.put("Name", _name);
 BA.debugLineNum = 565;BA.debugLine="Public Sub GetBodyWrapperByName (Name As String) A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 566;BA.debugLine="Dim bodies As List = mWorld.AllBodies";
Debug.JustUpdateDeviceLine();
_bodies = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_bodies = __ref.getField(false,"_mworld" /*RemoteObject*/ ).runMethod(false,"getAllBodies");Debug.locals.put("bodies", _bodies);Debug.locals.put("bodies", _bodies);
 BA.debugLineNum = 567;BA.debugLine="For Each body As B2Body In bodies";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group2 = _bodies;
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_body = (group2.runMethod(false,"Get",index2));Debug.locals.put("body", _body);
Debug.locals.put("body", _body);
 BA.debugLineNum = 568;BA.debugLine="Dim bw As X2BodyWrapper = body.Tag";
Debug.JustUpdateDeviceLine();
_bw = (_body.runMethod(false,"getTag"));Debug.locals.put("bw", _bw);Debug.locals.put("bw", _bw);
 BA.debugLineNum = 569;BA.debugLine="If bw.Name = Name Then Return bw";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_bw.getField(true,"_name" /*RemoteObject*/ ),_name)) { 
if (true) return _bw;};
 }
}Debug.locals.put("body", _body);
;
 BA.debugLineNum = 571;BA.debugLine="Return Null";
Debug.JustUpdateDeviceLine();
if (true) return (x2utils.__c.getField(false,"Null"));
 BA.debugLineNum = 572;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getshapewidthandheight(RemoteObject __ref,RemoteObject _shape) throws Exception{
try {
		Debug.PushSubsStack("GetShapeWidthAndHeight (x2utils) ","x2utils",21,__ref.getField(false, "ba"),__ref,549);
if (RapidSub.canDelegate("getshapewidthandheight")) { return __ref.runUserSub(false, "x2utils","getshapewidthandheight", __ref, _shape);}
Debug.locals.put("Shape", _shape);
 BA.debugLineNum = 549;BA.debugLine="Public Sub GetShapeWidthAndHeight(Shape As B2Shape";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 550;BA.debugLine="Shape.ComputeAABB(ShapeAABB, ShapeTransform)";
Debug.JustUpdateDeviceLine();
_shape.runVoidMethod ("ComputeAABB",(Object)(__ref.getField(false,"_shapeaabb" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_shapetransform" /*RemoteObject*/ )));
 BA.debugLineNum = 551;BA.debugLine="Return CreateVec2(ShapeAABB.Width, ShapeAABB.Heig";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4a.example.x2utils.class, "_createvec2" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_shapeaabb" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_shapeaabb" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 552;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _imageviewresized(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ImageViewResized (x2utils) ","x2utils",21,__ref.getField(false, "ba"),__ref,393);
if (RapidSub.canDelegate("imageviewresized")) { return __ref.runUserSub(false, "x2utils","imageviewresized", __ref);}
 BA.debugLineNum = 393;BA.debugLine="Public Sub ImageViewResized";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 394;BA.debugLine="If IsDebugDrawEnabled Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_isdebugdrawenabled" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 395;BA.debugLine="DebugDraw.Resize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_debugdraw" /*RemoteObject*/ ).runClassMethod (b4a.example.x2debugdraw.class, "_resize" /*RemoteObject*/ );
 };
 BA.debugLineNum = 397;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _mygame,RemoteObject _targetview,RemoteObject _world) throws Exception{
try {
		Debug.PushSubsStack("Initialize (x2utils) ","x2utils",21,__ref.getField(false, "ba"),__ref,62);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "x2utils","initialize", __ref, _ba, _mygame, _targetview, _world);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _largedimension = RemoteObject.createImmutable(0);
RemoteObject _sizescale = RemoteObject.createImmutable(0f);
Debug.locals.put("ba", _ba);
Debug.locals.put("MyGame", _mygame);
Debug.locals.put("TargetView", _targetview);
Debug.locals.put("World", _world);
 BA.debugLineNum = 62;BA.debugLine="Public Sub Initialize (MyGame As Game, TargetView";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 63;BA.debugLine="ShapeAABB.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_shapeaabb" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 64;BA.debugLine="ShapeTransform.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_shapetransform" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 65;BA.debugLine="EmptyList.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_emptylist" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 66;BA.debugLine="mGame = MyGame";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mgame" /*RemoteObject*/ ,_mygame);
 BA.debugLineNum = 67;BA.debugLine="mWorld = World";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mworld" /*RemoteObject*/ ,_world);
 BA.debugLineNum = 68;BA.debugLine="mTargetView = TargetView";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mtargetview" /*RemoteObject*/ ,_targetview);
 BA.debugLineNum = 69;BA.debugLine="Dim LargeDimension As Int = Max(mTargetView.Width";
Debug.JustUpdateDeviceLine();
_largedimension = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {x2utils.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, __ref.getField(false,"_mtargetview" /*RemoteObject*/ ).runMethod(true,"getWidth"))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_mtargetview" /*RemoteObject*/ ).runMethod(true,"getHeight")))),__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getScale")}, "/",0, 0));Debug.locals.put("LargeDimension", _largedimension);Debug.locals.put("LargeDimension", _largedimension);
 BA.debugLineNum = 70;BA.debugLine="Dim SizeScale As Float = 1";
Debug.JustUpdateDeviceLine();
_sizescale = BA.numberCast(float.class, 1);Debug.locals.put("SizeScale", _sizescale);Debug.locals.put("SizeScale", _sizescale);
 BA.debugLineNum = 71;BA.debugLine="If LargeDimension > MAX_SIZE Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_largedimension,BA.numberCast(double.class, __ref.getField(true,"_max_size" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 72;BA.debugLine="SizeScale = LargeDimension / MAX_SIZE";
Debug.JustUpdateDeviceLine();
_sizescale = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_largedimension,__ref.getField(true,"_max_size" /*RemoteObject*/ )}, "/",0, 0));Debug.locals.put("SizeScale", _sizescale);
 BA.debugLineNum = 73;BA.debugLine="Log($\"Size scale: $1.2{SizeScale}\"$)";
Debug.JustUpdateDeviceLine();
x2utils.__c.runVoidMethod ("LogImpl","917104907",(RemoteObject.concat(RemoteObject.createImmutable("Size scale: "),x2utils.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("1.2")),(Object)((_sizescale))),RemoteObject.createImmutable(""))),0);
 };
 BA.debugLineNum = 75;BA.debugLine="MainBC.Initialize(TargetView.Width / xui.Scale /";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mainbc" /*RemoteObject*/ ).runVoidMethod ("_initialize",__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_targetview.runMethod(true,"getWidth"),__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getScale"),_sizescale}, "//",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_targetview.runMethod(true,"getHeight"),__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getScale"),_sizescale}, "//",0, 0))));
 BA.debugLineNum = 76;BA.debugLine="Transparent.Initialize(MainBC.mWidth, MainBC.mHei";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_transparent" /*RemoteObject*/ ).runVoidMethod ("_initialize",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mainbc" /*RemoteObject*/ ).getField(true,"_mwidth")),(Object)(__ref.getField(false,"_mainbc" /*RemoteObject*/ ).getField(true,"_mheight")));
 BA.debugLineNum = 77;BA.debugLine="ScreenAABB.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_screenaabb" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 78;BA.debugLine="GraphicCache.Initialize (Me)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_graphiccache" /*RemoteObject*/ ).runClassMethod (b4a.example.x2spritegraphiccache.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)((__ref)));
 BA.debugLineNum = 79;BA.debugLine="SoundPool.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_soundpool" /*RemoteObject*/ ).runClassMethod (b4a.example.x2soundpool.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 80;BA.debugLine="LastDrawingTasks.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lastdrawingtasks" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 81;BA.debugLine="Reset";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.x2utils.class, "_reset" /*RemoteObject*/ );
 BA.debugLineNum = 82;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadbmp(RemoteObject __ref,RemoteObject _folder,RemoteObject _filename,RemoteObject _widthmeters,RemoteObject _heightmeters,RemoteObject _keepaspectratio) throws Exception{
try {
		Debug.PushSubsStack("LoadBmp (x2utils) ","x2utils",21,__ref.getField(false, "ba"),__ref,275);
if (RapidSub.canDelegate("loadbmp")) { return __ref.runUserSub(false, "x2utils","loadbmp", __ref, _folder, _filename, _widthmeters, _heightmeters, _keepaspectratio);}
Debug.locals.put("Folder", _folder);
Debug.locals.put("FileName", _filename);
Debug.locals.put("WidthMeters", _widthmeters);
Debug.locals.put("HeightMeters", _heightmeters);
Debug.locals.put("KeepAspectRatio", _keepaspectratio);
 BA.debugLineNum = 275;BA.debugLine="Public Sub LoadBmp (Folder As String, FileName As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 276;BA.debugLine="Return LoadBmp2 (Folder, FileName, WidthMeters, H";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4a.example.x2utils.class, "_loadbmp2" /*RemoteObject*/ ,(Object)(_folder),(Object)(_filename),(Object)(_widthmeters),(Object)(_heightmeters),(Object)(__ref.getField(true,"_bmpsmoothscale" /*RemoteObject*/ )),(Object)(_keepaspectratio));
 BA.debugLineNum = 277;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadbmp2(RemoteObject __ref,RemoteObject _folder,RemoteObject _filename,RemoteObject _widthmeters,RemoteObject _heightmeters,RemoteObject _bmpscale,RemoteObject _keepaspectratio) throws Exception{
try {
		Debug.PushSubsStack("LoadBmp2 (x2utils) ","x2utils",21,__ref.getField(false, "ba"),__ref,281);
if (RapidSub.canDelegate("loadbmp2")) { return __ref.runUserSub(false, "x2utils","loadbmp2", __ref, _folder, _filename, _widthmeters, _heightmeters, _bmpscale, _keepaspectratio);}
RemoteObject _scale = RemoteObject.createImmutable(0f);
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
RemoteObject _sb = RemoteObject.declareNull("b4a.example.x2utils._x2scaledbitmap");
Debug.locals.put("Folder", _folder);
Debug.locals.put("FileName", _filename);
Debug.locals.put("WidthMeters", _widthmeters);
Debug.locals.put("HeightMeters", _heightmeters);
Debug.locals.put("BmpScale", _bmpscale);
Debug.locals.put("KeepAspectRatio", _keepaspectratio);
 BA.debugLineNum = 281;BA.debugLine="Public Sub LoadBmp2 (Folder As String, FileName As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 282;BA.debugLine="Dim Scale As Float = mBCPixelsPerMeter * BmpScale";
Debug.JustUpdateDeviceLine();
_scale = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mbcpixelspermeter" /*RemoteObject*/ ),_bmpscale}, "*",0, 0));Debug.locals.put("Scale", _scale);Debug.locals.put("Scale", _scale);
 BA.debugLineNum = 283;BA.debugLine="Dim bmp As B4XBitmap = xui.LoadBitmapResize(Folde";
Debug.JustUpdateDeviceLine();
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_bmp = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"LoadBitmapResize",(Object)(_folder),(Object)(_filename),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_widthmeters,_scale}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_heightmeters,_scale}, "*",0, 0))),(Object)(_keepaspectratio));Debug.locals.put("bmp", _bmp);Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 284;BA.debugLine="Dim sb As X2ScaledBitmap";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("b4a.example.x2utils._x2scaledbitmap");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 285;BA.debugLine="sb.Bmp = bmp";
Debug.JustUpdateDeviceLine();
_sb.setField ("Bmp" /*RemoteObject*/ ,_bmp);
 BA.debugLineNum = 286;BA.debugLine="sb.Scale = BmpScale";
Debug.JustUpdateDeviceLine();
_sb.setField ("Scale" /*RemoteObject*/ ,_bmpscale);
 BA.debugLineNum = 287;BA.debugLine="Return sb";
Debug.JustUpdateDeviceLine();
if (true) return _sb;
 BA.debugLineNum = 288;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _mainloop(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("MainLoop (x2utils) ","x2utils",21,__ref.getField(false, "ba"),__ref,84);
if (RapidSub.canDelegate("mainloop")) { __ref.runUserSub(false, "x2utils","mainloop", __ref); return;}
ResumableSub_MainLoop rsub = new ResumableSub_MainLoop(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_MainLoop extends BA.ResumableSub {
public ResumableSub_MainLoop(b4a.example.x2utils parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.x2utils parent;
RemoteObject _myindex = RemoteObject.createImmutable(0);
RemoteObject _skippedframes = RemoteObject.createImmutable(0);
RemoteObject _transparenttask = RemoteObject.declareNull("b4a.example.bitmapcreator._drawtask");
RemoteObject _counter = RemoteObject.createImmutable(0);
RemoteObject _startlooptime = RemoteObject.createImmutable(0L);
RemoteObject _tasks = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _nondrawingiteration = RemoteObject.createImmutable(false);
RemoteObject _visiblebodies = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _allbodies = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _body = RemoteObject.declareNull("anywheresoftware.b4a.objects.B2Body");
RemoteObject _bw = RemoteObject.declareNull("b4a.example.x2bodywrapper");
RemoteObject _stats = RemoteObject.createImmutable("");
RemoteObject group35;
int index35;
int groupLen35;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("MainLoop (x2utils) ","x2utils",21,__ref.getField(false, "ba"),__ref,84);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 85;BA.debugLine="ResumableIndex = ResumableIndex + 1";
Debug.JustUpdateDeviceLine();
__ref.setField ("_resumableindex" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_resumableindex" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 86;BA.debugLine="Log($\"*** MainLoop starting. ResumableIndex = ${R";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","917170434",(RemoteObject.concat(RemoteObject.createImmutable("*** MainLoop starting. ResumableIndex = "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_resumableindex" /*RemoteObject*/ )))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 87;BA.debugLine="Dim MyIndex As Int = ResumableIndex";
Debug.JustUpdateDeviceLine();
_myindex = __ref.getField(true,"_resumableindex" /*RemoteObject*/ );Debug.locals.put("MyIndex", _myindex);Debug.locals.put("MyIndex", _myindex);
 BA.debugLineNum = 88;BA.debugLine="Dim SkippedFrames As Int";
Debug.JustUpdateDeviceLine();
_skippedframes = RemoteObject.createImmutable(0);Debug.locals.put("SkippedFrames", _skippedframes);
 BA.debugLineNum = 89;BA.debugLine="LastDrawingTime = DateTime.Now";
Debug.JustUpdateDeviceLine();
__ref.setField ("_lastdrawingtime" /*RemoteObject*/ ,parent.__c.getField(false,"DateTime").runMethod(true,"getNow"));
 BA.debugLineNum = 90;BA.debugLine="FPS = TargetFPS";
Debug.JustUpdateDeviceLine();
__ref.setField ("_fps" /*RemoteObject*/ ,BA.numberCast(float.class, __ref.getField(true,"_targetfps" /*RemoteObject*/ )));
 BA.debugLineNum = 91;BA.debugLine="Dim TransparentTask As DrawTask = MainBC.CreateDr";
Debug.JustUpdateDeviceLine();
_transparenttask = __ref.getField(false,"_mainbc" /*RemoteObject*/ ).runMethod(false,"_createdrawtask",(Object)((__ref.getField(false,"_transparent" /*RemoteObject*/ ))),(Object)(__ref.getField(false,"_transparent" /*RemoteObject*/ ).getField(false,"_targetrect")),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(true,"True")));Debug.locals.put("TransparentTask", _transparenttask);Debug.locals.put("TransparentTask", _transparenttask);
 BA.debugLineNum = 92;BA.debugLine="Dim counter As Int";
Debug.JustUpdateDeviceLine();
_counter = RemoteObject.createImmutable(0);Debug.locals.put("counter", _counter);
 BA.debugLineNum = 93;BA.debugLine="Do While MyIndex = ResumableIndex";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//do while
this.state = 52;
while (RemoteObject.solveBoolean("=",_myindex,BA.numberCast(double.class, __ref.getField(true,"_resumableindex" /*RemoteObject*/ )))) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 94;BA.debugLine="Dim StartLoopTime As Long = DateTime.Now";
Debug.JustUpdateDeviceLine();
_startlooptime = parent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("StartLoopTime", _startlooptime);Debug.locals.put("StartLoopTime", _startlooptime);
 BA.debugLineNum = 96;BA.debugLine="Dim tasks As List";
Debug.JustUpdateDeviceLine();
_tasks = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("tasks", _tasks);
 BA.debugLineNum = 97;BA.debugLine="tasks.Initialize";
Debug.JustUpdateDeviceLine();
_tasks.runVoidMethod ("Initialize");
 BA.debugLineNum = 98;BA.debugLine="tasks.Add(TransparentTask)";
Debug.JustUpdateDeviceLine();
_tasks.runVoidMethod ("Add",(Object)((_transparenttask)));
 BA.debugLineNum = 99;BA.debugLine="gs.DrawingTasks = tasks";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_gs" /*RemoteObject*/ ).setField ("DrawingTasks" /*RemoteObject*/ ,_tasks);
 BA.debugLineNum = 100;BA.debugLine="gs.BodiesToDelete.Clear";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_gs" /*RemoteObject*/ ).getField(false,"BodiesToDelete" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 102;BA.debugLine="Dim NonDrawingIteration As Boolean";
Debug.JustUpdateDeviceLine();
_nondrawingiteration = RemoteObject.createImmutable(false);Debug.locals.put("NonDrawingIteration", _nondrawingiteration);
 BA.debugLineNum = 103;BA.debugLine="If LoopsPerSecond < TargetFPS - 6 Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 4:
//if
this.state = 13;
if (RemoteObject.solveBoolean("<",__ref.getField(true,"_loopspersecond" /*RemoteObject*/ ),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_targetfps" /*RemoteObject*/ ),RemoteObject.createImmutable(6)}, "-",1, 1)))) { 
this.state = 6;
}else {
this.state = 12;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 104;BA.debugLine="If IsLowFPS = False Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_islowfps" /*RemoteObject*/ ),parent.__c.getField(true,"False"))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 105;BA.debugLine="LoopsPerSecond = -1000000";
Debug.JustUpdateDeviceLine();
__ref.setField ("_loopspersecond" /*RemoteObject*/ ,BA.numberCast(float.class, -(double) (0 + 1000000)));
 BA.debugLineNum = 106;BA.debugLine="IsLowFPS = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_islowfps" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 if (true) break;

case 10:
//C
this.state = 13;
;
 BA.debugLineNum = 108;BA.debugLine="NonDrawingIteration = counter Mod 2 = 0";
Debug.JustUpdateDeviceLine();
_nondrawingiteration = BA.ObjectToBoolean(RemoteObject.solveBoolean("=",RemoteObject.solve(new RemoteObject[] {_counter,RemoteObject.createImmutable(2)}, "%",0, 1),BA.numberCast(double.class, 0)));Debug.locals.put("NonDrawingIteration", _nondrawingiteration);
 if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 110;BA.debugLine="IsLowFPS = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_islowfps" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 if (true) break;

case 13:
//C
this.state = 14;
;
 BA.debugLineNum = 112;BA.debugLine="gs.ShouldDraw = Not(NonDrawingIteration Or Drawi";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_gs" /*RemoteObject*/ ).setField ("ShouldDraw" /*RemoteObject*/ ,parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean(".",_nondrawingiteration) || RemoteObject.solveBoolean("=",__ref.getField(true,"_drawing" /*RemoteObject*/ ),parent.__c.getField(true,"True"))))));
 BA.debugLineNum = 113;BA.debugLine="If mGame.BeforeTimeStep(gs) = True Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 14:
//if
this.state = 17;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_mgame" /*RemoteObject*/ ).runClassMethod (b4a.example.game.class, "_beforetimestep" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_gs" /*RemoteObject*/ ))),parent.__c.getField(true,"True"))) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 114;BA.debugLine="IsRunning = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_isrunning" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 115;BA.debugLine="Exit";
Debug.JustUpdateDeviceLine();
this.state = 52;
if (true) break;
 if (true) break;

case 17:
//C
this.state = 18;
;
 BA.debugLineNum = 120;BA.debugLine="mWorld.TimeStep(TimeStepMs / 1000, VelocityItera";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mworld" /*RemoteObject*/ ).runVoidMethodAndSync ("TimeStep",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_timestepms" /*RemoteObject*/ ),RemoteObject.createImmutable(1000)}, "/",0, 0))),(Object)(__ref.getField(true,"_velocityiterations" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_positioniterations" /*RemoteObject*/ )));
 BA.debugLineNum = 126;BA.debugLine="mGame.Tick(gs)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mgame" /*RemoteObject*/ ).runClassMethod (b4a.example.game.class, "_tick" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_gs" /*RemoteObject*/ )));
 BA.debugLineNum = 127;BA.debugLine="Dim VisibleBodies As Map = mWorld.QueryAABBToMap";
Debug.JustUpdateDeviceLine();
_visiblebodies = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_visiblebodies = __ref.getField(false,"_mworld" /*RemoteObject*/ ).runMethod(false,"QueryAABBToMapOfBodies",(Object)(__ref.getField(false,"_screenaabb" /*RemoteObject*/ )));Debug.locals.put("VisibleBodies", _visiblebodies);Debug.locals.put("VisibleBodies", _visiblebodies);
 BA.debugLineNum = 128;BA.debugLine="Dim AllBodies As List = mWorld.AllBodies";
Debug.JustUpdateDeviceLine();
_allbodies = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_allbodies = __ref.getField(false,"_mworld" /*RemoteObject*/ ).runMethod(false,"getAllBodies");Debug.locals.put("AllBodies", _allbodies);Debug.locals.put("AllBodies", _allbodies);
 BA.debugLineNum = 129;BA.debugLine="For Each body As B2Body In AllBodies";
Debug.JustUpdateDeviceLine();
if (true) break;

case 18:
//for
this.state = 33;
group35 = _allbodies;
index35 = 0;
groupLen35 = group35.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("body", _body);
this.state = 53;
if (true) break;

case 53:
//C
this.state = 33;
if (index35 < groupLen35) {
this.state = 20;
_body = (group35.runMethod(false,"Get",index35));Debug.locals.put("body", _body);}
if (true) break;

case 54:
//C
this.state = 53;
index35++;
Debug.locals.put("body", _body);
if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 130;BA.debugLine="Dim bw As X2BodyWrapper = body.Tag";
Debug.JustUpdateDeviceLine();
_bw = (_body.runMethod(false,"getTag"));Debug.locals.put("bw", _bw);Debug.locals.put("bw", _bw);
 BA.debugLineNum = 131;BA.debugLine="bw.IsVisible = VisibleBodies.ContainsKey(body)";
Debug.JustUpdateDeviceLine();
_bw.setField ("_isvisible" /*RemoteObject*/ ,_visiblebodies.runMethod(true,"ContainsKey",(Object)((_body))));
 BA.debugLineNum = 132;BA.debugLine="If bw.IsVisible Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 21:
//if
this.state = 32;
if (_bw.getField(true,"_isvisible" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 23;
}else {
this.state = 25;
}if (true) break;

case 23:
//C
this.state = 32;
 BA.debugLineNum = 133;BA.debugLine="bw.Tick(gs)";
Debug.JustUpdateDeviceLine();
_bw.runClassMethod (b4a.example.x2bodywrapper.class, "_tick" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_gs" /*RemoteObject*/ )));
 if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 135;BA.debugLine="If bw.TickIfInvisible Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 26:
//if
this.state = 31;
if (_bw.getField(true,"_tickifinvisible" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 28;
}else 
{ BA.debugLineNum = 137;BA.debugLine="Else If bw.DestroyIfInvisible Then";
Debug.JustUpdateDeviceLine();
if (_bw.getField(true,"_destroyifinvisible" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 30;
}}
if (true) break;

case 28:
//C
this.state = 31;
 BA.debugLineNum = 136;BA.debugLine="bw.Tick(gs)";
Debug.JustUpdateDeviceLine();
_bw.runClassMethod (b4a.example.x2bodywrapper.class, "_tick" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_gs" /*RemoteObject*/ )));
 if (true) break;

case 30:
//C
this.state = 31;
 BA.debugLineNum = 138;BA.debugLine="bw.Delete(gs)";
Debug.JustUpdateDeviceLine();
_bw.runClassMethod (b4a.example.x2bodywrapper.class, "_delete" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_gs" /*RemoteObject*/ )));
 if (true) break;

case 31:
//C
this.state = 32;
;
 if (true) break;

case 32:
//C
this.state = 54;
;
 if (true) break;
if (true) break;

case 33:
//C
this.state = 34;
Debug.locals.put("body", _body);
;
 BA.debugLineNum = 146;BA.debugLine="RunFutureTasks";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.x2utils.class, "_runfuturetasks" /*RemoteObject*/ );
 BA.debugLineNum = 147;BA.debugLine="RemoveDeletedBodies";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.x2utils.class, "_removedeletedbodies" /*RemoteObject*/ );
 BA.debugLineNum = 148;BA.debugLine="If gs.ShouldDraw Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 34:
//if
this.state = 43;
if (__ref.getField(false,"_gs" /*RemoteObject*/ ).getField(true,"ShouldDraw" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 36;
}else 
{ BA.debugLineNum = 159;BA.debugLine="Else If NonDrawingIteration = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_nondrawingiteration,parent.__c.getField(true,"False"))) { 
this.state = 42;
}}
if (true) break;

case 36:
//C
this.state = 37;
 BA.debugLineNum = 149;BA.debugLine="Drawing = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_drawing" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 150;BA.debugLine="If IsDebugDrawEnabled Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 37:
//if
this.state = 40;
if (__ref.getField(true,"_isdebugdrawenabled" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 39;
}if (true) break;

case 39:
//C
this.state = 40;
 BA.debugLineNum = 151;BA.debugLine="DebugDraw.Draw(gs, VisibleBodies)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_debugdraw" /*RemoteObject*/ ).runClassMethod (b4a.example.x2debugdraw.class, "_draw" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_gs" /*RemoteObject*/ )),(Object)(_visiblebodies));
 if (true) break;

case 40:
//C
this.state = 43;
;
 BA.debugLineNum = 153;BA.debugLine="gs.DrawingTasks.AddAll(LastDrawingTasks)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_gs" /*RemoteObject*/ ).getField(false,"DrawingTasks" /*RemoteObject*/ ).runVoidMethod ("AddAll",(Object)(__ref.getField(false,"_lastdrawingtasks" /*RemoteObject*/ )));
 BA.debugLineNum = 158;BA.debugLine="MainBC.DrawBitmapCreatorsAsync(Me, \"BC\", gs.Dra";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mainbc" /*RemoteObject*/ ).runVoidMethod ("_drawbitmapcreatorsasync",(Object)(__ref),(Object)(BA.ObjectToString("BC")),(Object)(__ref.getField(false,"_gs" /*RemoteObject*/ ).getField(false,"DrawingTasks" /*RemoteObject*/ )));
 if (true) break;

case 42:
//C
this.state = 43;
 BA.debugLineNum = 160;BA.debugLine="Log(\"skipping frame!!!\")";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","917170508",RemoteObject.createImmutable("skipping frame!!!"),0);
 BA.debugLineNum = 161;BA.debugLine="SkippedFrames = SkippedFrames + 1";
Debug.JustUpdateDeviceLine();
_skippedframes = RemoteObject.solve(new RemoteObject[] {_skippedframes,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("SkippedFrames", _skippedframes);
 BA.debugLineNum = 162;BA.debugLine="LoopsPerSecond = LoopsPerSecond - 1";
Debug.JustUpdateDeviceLine();
__ref.setField ("_loopspersecond" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_loopspersecond" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 0)));
 if (true) break;

case 43:
//C
this.state = 44;
;
 BA.debugLineNum = 164;BA.debugLine="LastDrawingTasks.Clear";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lastdrawingtasks" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 165;BA.debugLine="counter = counter + 1";
Debug.JustUpdateDeviceLine();
_counter = RemoteObject.solve(new RemoteObject[] {_counter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("counter", _counter);
 BA.debugLineNum = 166;BA.debugLine="If mGame.lblStats.IsInitialized And mGame.lblSta";
Debug.JustUpdateDeviceLine();
if (true) break;

case 44:
//if
this.state = 51;
if (RemoteObject.solveBoolean(".",__ref.getField(false,"_mgame" /*RemoteObject*/ ).getField(false,"_lblstats" /*RemoteObject*/ ).runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean(".",__ref.getField(false,"_mgame" /*RemoteObject*/ ).getField(false,"_lblstats" /*RemoteObject*/ ).runMethod(true,"getVisible"))) { 
this.state = 46;
}if (true) break;

case 46:
//C
this.state = 47;
 BA.debugLineNum = 167;BA.debugLine="Dim Stats As String = $\"FPS: ${NumberFormat(FPS";
Debug.JustUpdateDeviceLine();
_stats = (RemoteObject.concat(RemoteObject.createImmutable("FPS: "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, __ref.getField(true,"_fps" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))))),RemoteObject.createImmutable(", Time: "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4a.example.x2utils.class, "_convertmillisecondstostring" /*RemoteObject*/ ,(Object)(BA.numberCast(long.class, __ref.getField(false,"_gs" /*RemoteObject*/ ).getField(true,"GameTimeMs" /*RemoteObject*/ ))))))),RemoteObject.createImmutable("")));Debug.locals.put("Stats", _stats);Debug.locals.put("Stats", _stats);
 BA.debugLineNum = 168;BA.debugLine="Stats = Stats & $\", Bodies: ${AllBodies.Size},";
Debug.JustUpdateDeviceLine();
_stats = RemoteObject.concat(_stats,(RemoteObject.concat(RemoteObject.createImmutable(", Bodies: "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_allbodies.runMethod(true,"getSize")))),RemoteObject.createImmutable(", ScreenAABB: ("),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("1.1")),(Object)((__ref.getField(false,"_screenaabb" /*RemoteObject*/ ).runMethod(false,"getBottomLeft").runMethod(true,"getX")))),RemoteObject.createImmutable(","),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("1.1")),(Object)((__ref.getField(false,"_screenaabb" /*RemoteObject*/ ).runMethod(false,"getBottomLeft").runMethod(true,"getY")))),RemoteObject.createImmutable(")-("),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("1.1")),(Object)((__ref.getField(false,"_screenaabb" /*RemoteObject*/ ).runMethod(false,"getTopRight").runMethod(true,"getX")))),RemoteObject.createImmutable(","),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("1.1")),(Object)((__ref.getField(false,"_screenaabb" /*RemoteObject*/ ).runMethod(false,"getTopRight").runMethod(true,"getY")))),RemoteObject.createImmutable(")"))));Debug.locals.put("Stats", _stats);
 BA.debugLineNum = 169;BA.debugLine="If IsDebugDrawEnabled Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 47:
//if
this.state = 50;
if (__ref.getField(true,"_isdebugdrawenabled" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 49;
}if (true) break;

case 49:
//C
this.state = 50;
 BA.debugLineNum = 170;BA.debugLine="Stats = Stats & \", DebugDraw!\"";
Debug.JustUpdateDeviceLine();
_stats = RemoteObject.concat(_stats,RemoteObject.createImmutable(", DebugDraw!"));Debug.locals.put("Stats", _stats);
 if (true) break;

case 50:
//C
this.state = 51;
;
 BA.debugLineNum = 173;BA.debugLine="Stats = \"DEBUG MODE! \" & Stats";
Debug.JustUpdateDeviceLine();
_stats = RemoteObject.concat(RemoteObject.createImmutable("DEBUG MODE! "),_stats);Debug.locals.put("Stats", _stats);
 BA.debugLineNum = 175;BA.debugLine="mGame.lblStats.Text = Stats";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mgame" /*RemoteObject*/ ).getField(false,"_lblstats" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_stats));
 if (true) break;

case 51:
//C
this.state = 1;
;
 BA.debugLineNum = 177;BA.debugLine="gs.ShouldDraw = False";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_gs" /*RemoteObject*/ ).setField ("ShouldDraw" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 182;BA.debugLine="Sleep(Max(SleepTime - (DateTime.Now - StartLoopT";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "x2utils", "mainloop"),BA.numberCast(int.class, parent.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_sleeptime" /*RemoteObject*/ ),(RemoteObject.solve(new RemoteObject[] {parent.__c.getField(false,"DateTime").runMethod(true,"getNow"),_startlooptime}, "-",1, 2))}, "-",1, 2))),(Object)(BA.numberCast(double.class, 7)))));
this.state = 55;
return;
case 55:
//C
this.state = 1;
;
 BA.debugLineNum = 186;BA.debugLine="LoopsPerSecond = (LoopsPerSecond * 20 + 1000/(Da";
Debug.JustUpdateDeviceLine();
__ref.setField ("_loopspersecond" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_loopspersecond" /*RemoteObject*/ ),RemoteObject.createImmutable(20),RemoteObject.createImmutable(1000),(RemoteObject.solve(new RemoteObject[] {parent.__c.getField(false,"DateTime").runMethod(true,"getNow"),_startlooptime}, "-",1, 2))}, "*+/",1, 0)),RemoteObject.createImmutable(21)}, "/",0, 0)));
 BA.debugLineNum = 187;BA.debugLine="gs.GameTimeMs = gs.GameTimeMs + TimeStepMs";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_gs" /*RemoteObject*/ ).setField ("GameTimeMs" /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_gs" /*RemoteObject*/ ).getField(true,"GameTimeMs" /*RemoteObject*/ ),__ref.getField(true,"_timestepms" /*RemoteObject*/ )}, "+",1, 0)));
 if (true) break;

case 52:
//C
this.state = -1;
;
 BA.debugLineNum = 189;BA.debugLine="Log($\"*** Exiting MainLoop. MyIndex = ${MyIndex}\"";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","917170537",(RemoteObject.concat(RemoteObject.createImmutable("*** Exiting MainLoop. MyIndex = "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_myindex))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 190;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static RemoteObject  _meterstobcpixels(RemoteObject __ref,RemoteObject _meters) throws Exception{
try {
		Debug.PushSubsStack("MetersToBCPixels (x2utils) ","x2utils",21,__ref.getField(false, "ba"),__ref,344);
if (RapidSub.canDelegate("meterstobcpixels")) { return __ref.runUserSub(false, "x2utils","meterstobcpixels", __ref, _meters);}
Debug.locals.put("Meters", _meters);
 BA.debugLineNum = 344;BA.debugLine="Public Sub MetersToBCPixels (Meters As Float) As I";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 345;BA.debugLine="Return Round(Meters * mBCPixelsPerMeter)";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(int.class, x2utils.__c.runMethod(true,"Round",(Object)(RemoteObject.solve(new RemoteObject[] {_meters,__ref.getField(true,"_mbcpixelspermeter" /*RemoteObject*/ )}, "*",0, 0))));
 BA.debugLineNum = 346;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _modfloat(RemoteObject __ref,RemoteObject _dividend,RemoteObject _divisor) throws Exception{
try {
		Debug.PushSubsStack("ModFloat (x2utils) ","x2utils",21,__ref.getField(false, "ba"),__ref,511);
if (RapidSub.canDelegate("modfloat")) { return __ref.runUserSub(false, "x2utils","modfloat", __ref, _dividend, _divisor);}
Debug.locals.put("Dividend", _dividend);
Debug.locals.put("Divisor", _divisor);
 BA.debugLineNum = 511;BA.debugLine="Public Sub ModFloat (Dividend As Float, Divisor As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 515;BA.debugLine="Return Dividend Mod Divisor";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_dividend,_divisor}, "%",0, 0));
 BA.debugLineNum = 517;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0f);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _nearestneighborresize(RemoteObject __ref,RemoteObject _source,RemoteObject _srcrect,RemoteObject _width,RemoteObject _height,RemoteObject _keepaspectratio) throws Exception{
try {
		Debug.PushSubsStack("NearestNeighborResize (x2utils) ","x2utils",21,__ref.getField(false, "ba"),__ref,609);
if (RapidSub.canDelegate("nearestneighborresize")) { return __ref.runUserSub(false, "x2utils","nearestneighborresize", __ref, _source, _srcrect, _width, _height, _keepaspectratio);}
RemoteObject _bc = RemoteObject.declareNull("b4a.example.bitmapcreator");
RemoteObject _ratiow = RemoteObject.createImmutable(0f);
RemoteObject _ratioh = RemoteObject.createImmutable(0f);
RemoteObject _ratio = RemoteObject.createImmutable(0f);
Debug.locals.put("Source", _source);
Debug.locals.put("SrcRect", _srcrect);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
Debug.locals.put("KeepAspectRatio", _keepaspectratio);
 BA.debugLineNum = 609;BA.debugLine="Public Sub NearestNeighborResize (Source As Bitmap";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 610;BA.debugLine="Dim bc As BitmapCreator";
Debug.JustUpdateDeviceLine();
_bc = RemoteObject.createNew ("b4a.example.bitmapcreator");Debug.locals.put("bc", _bc);
 BA.debugLineNum = 611;BA.debugLine="If KeepAspectRatio Then";
Debug.JustUpdateDeviceLine();
if (_keepaspectratio.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 612;BA.debugLine="Dim RatioW As Float = SrcRect.Width / Width";
Debug.JustUpdateDeviceLine();
_ratiow = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_srcrect.runMethod(true,"getWidth"),_width}, "/",0, 0));Debug.locals.put("RatioW", _ratiow);Debug.locals.put("RatioW", _ratiow);
 BA.debugLineNum = 613;BA.debugLine="Dim RatioH As Float = SrcRect.Height / Height";
Debug.JustUpdateDeviceLine();
_ratioh = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_srcrect.runMethod(true,"getHeight"),_height}, "/",0, 0));Debug.locals.put("RatioH", _ratioh);Debug.locals.put("RatioH", _ratioh);
 BA.debugLineNum = 614;BA.debugLine="Dim ratio As Float = Max(RatioH, RatioW)";
Debug.JustUpdateDeviceLine();
_ratio = BA.numberCast(float.class, x2utils.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, _ratioh)),(Object)(BA.numberCast(double.class, _ratiow))));Debug.locals.put("ratio", _ratio);Debug.locals.put("ratio", _ratio);
 BA.debugLineNum = 615;BA.debugLine="Width = SrcRect.Width / ratio";
Debug.JustUpdateDeviceLine();
_width = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_srcrect.runMethod(true,"getWidth"),_ratio}, "/",0, 0));Debug.locals.put("Width", _width);
 BA.debugLineNum = 616;BA.debugLine="Height = SrcRect.Height / ratio";
Debug.JustUpdateDeviceLine();
_height = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_srcrect.runMethod(true,"getHeight"),_ratio}, "/",0, 0));Debug.locals.put("Height", _height);
 };
 BA.debugLineNum = 618;BA.debugLine="Width = Round(Width)";
Debug.JustUpdateDeviceLine();
_width = BA.numberCast(float.class, x2utils.__c.runMethod(true,"Round",(Object)(BA.numberCast(double.class, _width))));Debug.locals.put("Width", _width);
 BA.debugLineNum = 619;BA.debugLine="Height = Round(Height)";
Debug.JustUpdateDeviceLine();
_height = BA.numberCast(float.class, x2utils.__c.runMethod(true,"Round",(Object)(BA.numberCast(double.class, _height))));Debug.locals.put("Height", _height);
 BA.debugLineNum = 620;BA.debugLine="bc.Initialize(Width, Height)";
Debug.JustUpdateDeviceLine();
_bc.runVoidMethod ("_initialize",__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, _width)),(Object)(BA.numberCast(int.class, _height)));
 BA.debugLineNum = 621;BA.debugLine="GraphicCache.DrawBitmapCreatorFlipped(bc, Source,";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_graphiccache" /*RemoteObject*/ ).runClassMethod (b4a.example.x2spritegraphiccache.class, "_drawbitmapcreatorflipped" /*RemoteObject*/ ,(Object)(_bc),(Object)(_source),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_width,_srcrect.runMethod(true,"getWidth")}, "/",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_height,_srcrect.runMethod(true,"getHeight")}, "/",0, 0))),(Object)(_srcrect),(Object)(x2utils.__c.getField(true,"False")),(Object)(x2utils.__c.getField(true,"False")),(Object)(x2utils.__c.getField(true,"False")));
 BA.debugLineNum = 622;BA.debugLine="Return bc";
Debug.JustUpdateDeviceLine();
if (true) return _bc;
 BA.debugLineNum = 623;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _readsprites(RemoteObject __ref,RemoteObject _bmp,RemoteObject _rows,RemoteObject _columns,RemoteObject _widthmeters,RemoteObject _heightmeters) throws Exception{
try {
		Debug.PushSubsStack("ReadSprites (x2utils) ","x2utils",21,__ref.getField(false, "ba"),__ref,291);
if (RapidSub.canDelegate("readsprites")) { return __ref.runUserSub(false, "x2utils","readsprites", __ref, _bmp, _rows, _columns, _widthmeters, _heightmeters);}
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _scale = RemoteObject.createImmutable(0f);
RemoteObject _rowheight = RemoteObject.createImmutable(0);
RemoteObject _columnwidth = RemoteObject.createImmutable(0);
int _r = 0;
int _c = 0;
RemoteObject _b = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
RemoteObject _sb = RemoteObject.declareNull("b4a.example.x2utils._x2scaledbitmap");
Debug.locals.put("Bmp", _bmp);
Debug.locals.put("Rows", _rows);
Debug.locals.put("Columns", _columns);
Debug.locals.put("WidthMeters", _widthmeters);
Debug.locals.put("HeightMeters", _heightmeters);
 BA.debugLineNum = 291;BA.debugLine="Public Sub ReadSprites (Bmp As B4XBitmap, Rows As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 292;BA.debugLine="Dim res As List";
Debug.JustUpdateDeviceLine();
_res = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("res", _res);
 BA.debugLineNum = 293;BA.debugLine="res.Initialize";
Debug.JustUpdateDeviceLine();
_res.runVoidMethod ("Initialize");
 BA.debugLineNum = 294;BA.debugLine="Dim scale As Float = mBCPixelsPerMeter * BmpSmoot";
Debug.JustUpdateDeviceLine();
_scale = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mbcpixelspermeter" /*RemoteObject*/ ),__ref.getField(true,"_bmpsmoothscale" /*RemoteObject*/ )}, "*",0, 0));Debug.locals.put("scale", _scale);Debug.locals.put("scale", _scale);
 BA.debugLineNum = 295;BA.debugLine="Dim RowHeight As Int = Bmp.Height / Rows";
Debug.JustUpdateDeviceLine();
_rowheight = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_bmp.runMethod(true,"getHeight"),_rows}, "/",0, 0));Debug.locals.put("RowHeight", _rowheight);Debug.locals.put("RowHeight", _rowheight);
 BA.debugLineNum = 296;BA.debugLine="Dim ColumnWidth As Int = Bmp.Width / Columns";
Debug.JustUpdateDeviceLine();
_columnwidth = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_bmp.runMethod(true,"getWidth"),_columns}, "/",0, 0));Debug.locals.put("ColumnWidth", _columnwidth);Debug.locals.put("ColumnWidth", _columnwidth);
 BA.debugLineNum = 297;BA.debugLine="For r = 0 To Rows - 1";
Debug.JustUpdateDeviceLine();
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {_rows,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_r = 0 ;
for (;(step6 > 0 && _r <= limit6) || (step6 < 0 && _r >= limit6) ;_r = ((int)(0 + _r + step6))  ) {
Debug.locals.put("r", _r);
 BA.debugLineNum = 298;BA.debugLine="For c = 0 To Columns - 1";
Debug.JustUpdateDeviceLine();
{
final int step7 = 1;
final int limit7 = RemoteObject.solve(new RemoteObject[] {_columns,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_c = 0 ;
for (;(step7 > 0 && _c <= limit7) || (step7 < 0 && _c >= limit7) ;_c = ((int)(0 + _c + step7))  ) {
Debug.locals.put("c", _c);
 BA.debugLineNum = 299;BA.debugLine="Dim b As B4XBitmap = Bmp.Crop(ColumnWidth * c,";
Debug.JustUpdateDeviceLine();
_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_b = _bmp.runMethod(false,"Crop",(Object)(RemoteObject.solve(new RemoteObject[] {_columnwidth,RemoteObject.createImmutable(_c)}, "*",0, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {_rowheight,RemoteObject.createImmutable(_r)}, "*",0, 1)),(Object)(_columnwidth),(Object)(_rowheight)).runMethod(false,"Resize",(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_widthmeters,_scale}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_heightmeters,_scale}, "*",0, 0))),(Object)(x2utils.__c.getField(true,"False")));Debug.locals.put("b", _b);Debug.locals.put("b", _b);
 BA.debugLineNum = 300;BA.debugLine="Dim sb As X2ScaledBitmap";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("b4a.example.x2utils._x2scaledbitmap");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 301;BA.debugLine="sb.Bmp = b";
Debug.JustUpdateDeviceLine();
_sb.setField ("Bmp" /*RemoteObject*/ ,_b);
 BA.debugLineNum = 302;BA.debugLine="sb.Scale = BmpSmoothScale";
Debug.JustUpdateDeviceLine();
_sb.setField ("Scale" /*RemoteObject*/ ,__ref.getField(true,"_bmpsmoothscale" /*RemoteObject*/ ));
 BA.debugLineNum = 303;BA.debugLine="res.Add(sb)";
Debug.JustUpdateDeviceLine();
_res.runVoidMethod ("Add",(Object)((_sb)));
 }
}Debug.locals.put("c", _c);
;
 }
}Debug.locals.put("r", _r);
;
 BA.debugLineNum = 306;BA.debugLine="Return res";
Debug.JustUpdateDeviceLine();
if (true) return _res;
 BA.debugLineNum = 307;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _readspritesbcs(RemoteObject __ref,RemoteObject _source,RemoteObject _rows,RemoteObject _columns,RemoteObject _widthmeters,RemoteObject _heightmeters) throws Exception{
try {
		Debug.PushSubsStack("ReadSpritesBCs (x2utils) ","x2utils",21,__ref.getField(false, "ba"),__ref,309);
if (RapidSub.canDelegate("readspritesbcs")) { return __ref.runUserSub(false, "x2utils","readspritesbcs", __ref, _source, _rows, _columns, _widthmeters, _heightmeters);}
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _scale = RemoteObject.createImmutable(0f);
RemoteObject _rowheight = RemoteObject.createImmutable(0);
RemoteObject _columnwidth = RemoteObject.createImmutable(0);
RemoteObject _rect = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
int _r = 0;
int _c = 0;
Debug.locals.put("Source", _source);
Debug.locals.put("Rows", _rows);
Debug.locals.put("Columns", _columns);
Debug.locals.put("WidthMeters", _widthmeters);
Debug.locals.put("HeightMeters", _heightmeters);
 BA.debugLineNum = 309;BA.debugLine="Public Sub ReadSpritesBCs (Source As BitmapCreator";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 310;BA.debugLine="Dim res As List";
Debug.JustUpdateDeviceLine();
_res = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("res", _res);
 BA.debugLineNum = 311;BA.debugLine="res.Initialize";
Debug.JustUpdateDeviceLine();
_res.runVoidMethod ("Initialize");
 BA.debugLineNum = 312;BA.debugLine="Dim scale As Float = mBCPixelsPerMeter * BmpSmoot";
Debug.JustUpdateDeviceLine();
_scale = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mbcpixelspermeter" /*RemoteObject*/ ),__ref.getField(true,"_bmpsmoothscale" /*RemoteObject*/ )}, "*",0, 0));Debug.locals.put("scale", _scale);Debug.locals.put("scale", _scale);
 BA.debugLineNum = 313;BA.debugLine="Dim RowHeight As Int = Source.mHeight / Rows";
Debug.JustUpdateDeviceLine();
_rowheight = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_source.getField(true,"_mheight"),_rows}, "/",0, 0));Debug.locals.put("RowHeight", _rowheight);Debug.locals.put("RowHeight", _rowheight);
 BA.debugLineNum = 314;BA.debugLine="Dim ColumnWidth As Int = Source.mWidth / Columns";
Debug.JustUpdateDeviceLine();
_columnwidth = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_source.getField(true,"_mwidth"),_columns}, "/",0, 0));Debug.locals.put("ColumnWidth", _columnwidth);Debug.locals.put("ColumnWidth", _columnwidth);
 BA.debugLineNum = 315;BA.debugLine="Dim rect As B4XRect";
Debug.JustUpdateDeviceLine();
_rect = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");Debug.locals.put("rect", _rect);
 BA.debugLineNum = 316;BA.debugLine="rect.Initialize(0, 0, 0, 0)";
Debug.JustUpdateDeviceLine();
_rect.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 317;BA.debugLine="For r = 0 To Rows - 1";
Debug.JustUpdateDeviceLine();
{
final int step8 = 1;
final int limit8 = RemoteObject.solve(new RemoteObject[] {_rows,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_r = 0 ;
for (;(step8 > 0 && _r <= limit8) || (step8 < 0 && _r >= limit8) ;_r = ((int)(0 + _r + step8))  ) {
Debug.locals.put("r", _r);
 BA.debugLineNum = 318;BA.debugLine="For c = 0 To Columns - 1";
Debug.JustUpdateDeviceLine();
{
final int step9 = 1;
final int limit9 = RemoteObject.solve(new RemoteObject[] {_columns,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_c = 0 ;
for (;(step9 > 0 && _c <= limit9) || (step9 < 0 && _c >= limit9) ;_c = ((int)(0 + _c + step9))  ) {
Debug.locals.put("c", _c);
 BA.debugLineNum = 319;BA.debugLine="rect.Left = ColumnWidth * c";
Debug.JustUpdateDeviceLine();
_rect.runMethod(true,"setLeft",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_columnwidth,RemoteObject.createImmutable(_c)}, "*",0, 1)));
 BA.debugLineNum = 320;BA.debugLine="rect.Top = RowHeight * r";
Debug.JustUpdateDeviceLine();
_rect.runMethod(true,"setTop",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_rowheight,RemoteObject.createImmutable(_r)}, "*",0, 1)));
 BA.debugLineNum = 321;BA.debugLine="rect.Width = ColumnWidth";
Debug.JustUpdateDeviceLine();
_rect.runMethod(true,"setWidth",BA.numberCast(float.class, _columnwidth));
 BA.debugLineNum = 322;BA.debugLine="rect.Height = RowHeight";
Debug.JustUpdateDeviceLine();
_rect.runMethod(true,"setHeight",BA.numberCast(float.class, _rowheight));
 BA.debugLineNum = 323;BA.debugLine="res.Add(NearestNeighborResize(Source, rect, Wid";
Debug.JustUpdateDeviceLine();
_res.runVoidMethod ("Add",(Object)((__ref.runClassMethod (b4a.example.x2utils.class, "_nearestneighborresize" /*RemoteObject*/ ,(Object)(_source),(Object)(_rect),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_widthmeters,_scale}, "*",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_heightmeters,_scale}, "*",0, 0))),(Object)(x2utils.__c.getField(true,"False"))))));
 }
}Debug.locals.put("c", _c);
;
 }
}Debug.locals.put("r", _r);
;
 BA.debugLineNum = 326;BA.debugLine="Return res";
Debug.JustUpdateDeviceLine();
if (true) return _res;
 BA.debugLineNum = 327;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _removedeletedbodies(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("RemoveDeletedBodies (x2utils) ","x2utils",21,__ref.getField(false, "ba"),__ref,353);
if (RapidSub.canDelegate("removedeletedbodies")) { return __ref.runUserSub(false, "x2utils","removedeletedbodies", __ref);}
RemoteObject _body = RemoteObject.declareNull("anywheresoftware.b4a.objects.B2Body");
RemoteObject _bw = RemoteObject.declareNull("b4a.example.x2bodywrapper");
 BA.debugLineNum = 353;BA.debugLine="Private Sub RemoveDeletedBodies";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 354;BA.debugLine="For Each body As B2Body In gs.BodiesToDelete";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = __ref.getField(false,"_gs" /*RemoteObject*/ ).getField(false,"BodiesToDelete" /*RemoteObject*/ );
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_body = (group1.runMethod(false,"Get",index1));Debug.locals.put("body", _body);
Debug.locals.put("body", _body);
 BA.debugLineNum = 355;BA.debugLine="If body.Tag Is X2BodyWrapper Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("i",_body.runMethod(false,"getTag"), RemoteObject.createImmutable("b4a.example.x2bodywrapper"))) { 
 BA.debugLineNum = 356;BA.debugLine="Dim bw As X2BodyWrapper = body.Tag";
Debug.JustUpdateDeviceLine();
_bw = (_body.runMethod(false,"getTag"));Debug.locals.put("bw", _bw);Debug.locals.put("bw", _bw);
 BA.debugLineNum = 357;BA.debugLine="bw.Body.Tag = Null";
Debug.JustUpdateDeviceLine();
_bw.getField(false,"_body" /*RemoteObject*/ ).runMethod(false,"setTag",x2utils.__c.getField(false,"Null"));
 BA.debugLineNum = 358;BA.debugLine="bw.Body = Null";
Debug.JustUpdateDeviceLine();
_bw.setField ("_body" /*RemoteObject*/ ,(x2utils.__c.getField(false,"Null")));
 };
 BA.debugLineNum = 360;BA.debugLine="mWorld.DestroyBody(body)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mworld" /*RemoteObject*/ ).runVoidMethod ("DestroyBody",(Object)(_body));
 }
}Debug.locals.put("body", _body);
;
 BA.debugLineNum = 362;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _removefuturetasks(RemoteObject __ref,RemoteObject _callback,RemoteObject _subname) throws Exception{
try {
		Debug.PushSubsStack("RemoveFutureTasks (x2utils) ","x2utils",21,__ref.getField(false, "ba"),__ref,449);
if (RapidSub.canDelegate("removefuturetasks")) { return __ref.runUserSub(false, "x2utils","removefuturetasks", __ref, _callback, _subname);}
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _ft = RemoteObject.declareNull("b4a.example.x2utils._x2futuretask");
Debug.locals.put("Callback", _callback);
Debug.locals.put("SubName", _subname);
 BA.debugLineNum = 449;BA.debugLine="Public Sub RemoveFutureTasks (Callback As Object,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 450;BA.debugLine="Dim i As Int = 0";
Debug.JustUpdateDeviceLine();
_i = BA.numberCast(int.class, 0);Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 451;BA.debugLine="Do While i < FutureTasks.Size";
Debug.JustUpdateDeviceLine();
while (RemoteObject.solveBoolean("<",_i,BA.numberCast(double.class, __ref.getField(false,"_futuretasks" /*RemoteObject*/ ).runMethod(true,"getSize")))) {
 BA.debugLineNum = 452;BA.debugLine="Dim ft As X2FutureTask = FutureTasks.Get(i)";
Debug.JustUpdateDeviceLine();
_ft = (__ref.getField(false,"_futuretasks" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_i)));Debug.locals.put("ft", _ft);Debug.locals.put("ft", _ft);
 BA.debugLineNum = 453;BA.debugLine="If ft.Callback = Callback And ft.SubName = SubNa";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_ft.getField(false,"Callback" /*RemoteObject*/ ),_callback) && RemoteObject.solveBoolean("=",_ft.getField(true,"SubName" /*RemoteObject*/ ),_subname)) { 
 BA.debugLineNum = 454;BA.debugLine="FutureTasks.RemoveAt(i)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_futuretasks" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(_i));
 BA.debugLineNum = 455;BA.debugLine="Continue";
Debug.JustUpdateDeviceLine();
if (true) continue;
 };
 BA.debugLineNum = 457;BA.debugLine="i = i + 1";
Debug.JustUpdateDeviceLine();
_i = RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("i", _i);
 }
;
 BA.debugLineNum = 459;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _reset(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Reset (x2utils) ","x2utils",21,__ref.getField(false, "ba"),__ref,221);
if (RapidSub.canDelegate("reset")) { return __ref.runUserSub(false, "x2utils","reset", __ref);}
RemoteObject _b = RemoteObject.declareNull("anywheresoftware.b4a.objects.B2Body");
 BA.debugLineNum = 221;BA.debugLine="Public Sub Reset";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 222;BA.debugLine="For Each b As B2Body In mWorld.AllBodies";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = __ref.getField(false,"_mworld" /*RemoteObject*/ ).runMethod(false,"getAllBodies");
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = (group1.runMethod(false,"Get",index1));Debug.locals.put("b", _b);
Debug.locals.put("b", _b);
 BA.debugLineNum = 223;BA.debugLine="mWorld.DestroyBody(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mworld" /*RemoteObject*/ ).runVoidMethod ("DestroyBody",(Object)(_b));
 }
}Debug.locals.put("b", _b);
;
 BA.debugLineNum = 225;BA.debugLine="FutureTasks.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_futuretasks" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 226;BA.debugLine="LastDrawingTasks.Clear";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lastdrawingtasks" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 227;BA.debugLine="MainBC.FillRect(xui.Color_Transparent, MainBC.Tar";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mainbc" /*RemoteObject*/ ).runVoidMethod ("_fillrect",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(__ref.getField(false,"_mainbc" /*RemoteObject*/ ).getField(false,"_targetrect")));
 BA.debugLineNum = 228;BA.debugLine="gs.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_gs" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 229;BA.debugLine="gs.GameTimeMs = 0";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_gs" /*RemoteObject*/ ).setField ("GameTimeMs" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 230;BA.debugLine="gs.BodiesToDelete.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_gs" /*RemoteObject*/ ).getField(false,"BodiesToDelete" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 231;BA.debugLine="UpdateTimeParameters";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.x2utils.class, "_updatetimeparameters" /*RemoteObject*/ );
 BA.debugLineNum = 232;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _rndfloat(RemoteObject __ref,RemoteObject _fromvalue,RemoteObject _tovalue) throws Exception{
try {
		Debug.PushSubsStack("RndFloat (x2utils) ","x2utils",21,__ref.getField(false, "ba"),__ref,506);
if (RapidSub.canDelegate("rndfloat")) { return __ref.runUserSub(false, "x2utils","rndfloat", __ref, _fromvalue, _tovalue);}
Debug.locals.put("FromValue", _fromvalue);
Debug.locals.put("ToValue", _tovalue);
 BA.debugLineNum = 506;BA.debugLine="Public Sub RndFloat (FromValue As Float, ToValue A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 507;BA.debugLine="Return Rnd(FromValue * 100000, ToValue * 100000)";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {x2utils.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_fromvalue,RemoteObject.createImmutable(100000)}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_tovalue,RemoteObject.createImmutable(100000)}, "*",0, 0)))),RemoteObject.createImmutable(100000)}, "/",0, 0));
 BA.debugLineNum = 508;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0f);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _runfuturetasks(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("RunFutureTasks (x2utils) ","x2utils",21,__ref.getField(false, "ba"),__ref,399);
if (RapidSub.canDelegate("runfuturetasks")) { return __ref.runUserSub(false, "x2utils","runfuturetasks", __ref);}
int _i = 0;
RemoteObject _ft = RemoteObject.declareNull("b4a.example.x2utils._x2futuretask");
 BA.debugLineNum = 399;BA.debugLine="Private Sub RunFutureTasks";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 400;BA.debugLine="For i = FutureTasks.Size - 1 To 0 Step - 1";
Debug.JustUpdateDeviceLine();
{
final int step1 = -1;
final int limit1 = 0;
_i = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_futuretasks" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue() ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 401;BA.debugLine="Dim ft As X2FutureTask = FutureTasks.Get(i)";
Debug.JustUpdateDeviceLine();
_ft = (__ref.getField(false,"_futuretasks" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("ft", _ft);Debug.locals.put("ft", _ft);
 BA.debugLineNum = 402;BA.debugLine="If gs.GameTimeMs >= ft.GameTimeMs Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("g",__ref.getField(false,"_gs" /*RemoteObject*/ ).getField(true,"GameTimeMs" /*RemoteObject*/ ),BA.numberCast(double.class, _ft.getField(true,"GameTimeMs" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 403;BA.debugLine="FutureTasks.RemoveAt(i)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_futuretasks" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(BA.numberCast(int.class, _i)));
 BA.debugLineNum = 404;BA.debugLine="If ft.Disabled = False Then CallSub2(ft.Callbac";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_ft.getField(true,"Disabled" /*RemoteObject*/ ),x2utils.__c.getField(true,"False"))) { 
x2utils.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(_ft.getField(false,"Callback" /*RemoteObject*/ )),(Object)(_ft.getField(true,"SubName" /*RemoteObject*/ )),(Object)((_ft)));};
 }else {
 BA.debugLineNum = 406;BA.debugLine="Exit";
Debug.JustUpdateDeviceLine();
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 409;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _screenpointtoworld(RemoteObject __ref,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("ScreenPointToWorld (x2utils) ","x2utils",21,__ref.getField(false, "ba"),__ref,372);
if (RapidSub.canDelegate("screenpointtoworld")) { return __ref.runUserSub(false, "x2utils","screenpointtoworld", __ref, _x, _y);}
RemoteObject _scale = RemoteObject.createImmutable(0f);
RemoteObject _position = RemoteObject.declareNull("anywheresoftware.b4a.objects.B2Vec2");
Debug.locals.put("x", _x);
Debug.locals.put("y", _y);
 BA.debugLineNum = 372;BA.debugLine="Public Sub ScreenPointToWorld (x As Int, y As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 373;BA.debugLine="Dim scale As Float = mTargetView.Width / MainBC.m";
Debug.JustUpdateDeviceLine();
_scale = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mtargetview" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(false,"_mainbc" /*RemoteObject*/ ).getField(true,"_mwidth"),__ref.getField(true,"_mbcpixelspermeter" /*RemoteObject*/ )}, "/*",0, 0));Debug.locals.put("scale", _scale);Debug.locals.put("scale", _scale);
 BA.debugLineNum = 374;BA.debugLine="Dim position As B2Vec2";
Debug.JustUpdateDeviceLine();
_position = RemoteObject.createNew ("anywheresoftware.b4a.objects.B2Vec2");Debug.locals.put("position", _position);
 BA.debugLineNum = 375;BA.debugLine="position.X = x / scale + ScreenAABB.BottomLeft.X";
Debug.JustUpdateDeviceLine();
_position.runMethod(true,"setX",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_x,_scale,__ref.getField(false,"_screenaabb" /*RemoteObject*/ ).runMethod(false,"getBottomLeft").runMethod(true,"getX")}, "/+",1, 0)));
 BA.debugLineNum = 376;BA.debugLine="position.Y = (mTargetView.Height - 1 - y) / scale";
Debug.JustUpdateDeviceLine();
_position.runMethod(true,"setY",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mtargetview" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(1),_y}, "--",2, 1)),_scale,__ref.getField(false,"_screenaabb" /*RemoteObject*/ ).runMethod(false,"getBottomLeft").runMethod(true,"getY")}, "/+",1, 0)));
 BA.debugLineNum = 377;BA.debugLine="Return position";
Debug.JustUpdateDeviceLine();
if (true) return _position;
 BA.debugLineNum = 378;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbitmapwithfitorfill(RemoteObject __ref,RemoteObject _vtargetview,RemoteObject _bmp) throws Exception{
try {
		Debug.PushSubsStack("SetBitmapWithFitOrFill (x2utils) ","x2utils",21,__ref.getField(false, "ba"),__ref,382);
if (RapidSub.canDelegate("setbitmapwithfitorfill")) { return __ref.runUserSub(false, "x2utils","setbitmapwithfitorfill", __ref, _vtargetview, _bmp);}
RemoteObject _iv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
Debug.locals.put("vTargetView", _vtargetview);
Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 382;BA.debugLine="Public Sub SetBitmapWithFitOrFill (vTargetView As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 383;BA.debugLine="vTargetView.SetBitmap(bmp)";
Debug.JustUpdateDeviceLine();
_vtargetview.runVoidMethod ("SetBitmap",(Object)((_bmp.getObject())));
 BA.debugLineNum = 387;BA.debugLine="Dim iv As ImageView = vTargetView";
Debug.JustUpdateDeviceLine();
_iv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
_iv = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ImageViewWrapper"), _vtargetview.getObject());Debug.locals.put("iv", _iv);Debug.locals.put("iv", _iv);
 BA.debugLineNum = 388;BA.debugLine="iv.Gravity = Gravity.FILL";
Debug.JustUpdateDeviceLine();
_iv.runMethod(true,"setGravity",x2utils.__c.getField(false,"Gravity").getField(true,"FILL"));
 BA.debugLineNum = 390;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _start(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Start (x2utils) ","x2utils",21,__ref.getField(false, "ba"),__ref,245);
if (RapidSub.canDelegate("start")) { return __ref.runUserSub(false, "x2utils","start", __ref);}
 BA.debugLineNum = 245;BA.debugLine="Public Sub Start";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 246;BA.debugLine="If IsRunning Then Return";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_isrunning" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 247;BA.debugLine="IsRunning = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_isrunning" /*RemoteObject*/ ,x2utils.__c.getField(true,"True"));
 BA.debugLineNum = 248;BA.debugLine="Drawing = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_drawing" /*RemoteObject*/ ,x2utils.__c.getField(true,"False"));
 BA.debugLineNum = 249;BA.debugLine="MainLoop";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.x2utils.class, "_mainloop" /*void*/ );
 BA.debugLineNum = 250;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _stop(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Stop (x2utils) ","x2utils",21,__ref.getField(false, "ba"),__ref,252);
if (RapidSub.canDelegate("stop")) { return __ref.runUserSub(false, "x2utils","stop", __ref);}
 BA.debugLineNum = 252;BA.debugLine="Public Sub Stop";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 253;BA.debugLine="ResumableIndex = ResumableIndex + 1";
Debug.JustUpdateDeviceLine();
__ref.setField ("_resumableindex" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_resumableindex" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 254;BA.debugLine="IsRunning = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_isrunning" /*RemoteObject*/ ,x2utils.__c.getField(true,"False"));
 BA.debugLineNum = 255;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updatetimeparameters(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("UpdateTimeParameters (x2utils) ","x2utils",21,__ref.getField(false, "ba"),__ref,235);
if (RapidSub.canDelegate("updatetimeparameters")) { return __ref.runUserSub(false, "x2utils","updatetimeparameters", __ref);}
 BA.debugLineNum = 235;BA.debugLine="Public Sub UpdateTimeParameters";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 236;BA.debugLine="TimeStepMs = 1000 / TargetFPS";
Debug.JustUpdateDeviceLine();
__ref.setField ("_timestepms" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(1000),__ref.getField(true,"_targetfps" /*RemoteObject*/ )}, "/",0, 0)));
 BA.debugLineNum = 237;BA.debugLine="Dim SleepTime As Int = TimeStepMs";
Debug.JustUpdateDeviceLine();
x2utils._sleeptime = BA.numberCast(int.class, __ref.getField(true,"_timestepms" /*RemoteObject*/ ));__ref.setField("_sleeptime",x2utils._sleeptime);
 BA.debugLineNum = 238;BA.debugLine="If xui.IsB4A Then SleepTime = SleepTime - 2";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getIsB4A").<Boolean>get().booleanValue()) { 
__ref.setField ("_sleeptime" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_sleeptime" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "-",1, 1));};
 BA.debugLineNum = 239;BA.debugLine="If xui.IsB4J Then SleepTime = SleepTime - 1";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getIsB4J").<Boolean>get().booleanValue()) { 
__ref.setField ("_sleeptime" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_sleeptime" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1));};
 BA.debugLineNum = 240;BA.debugLine="TimeStepMs = TimeStepMs / SlowDownPhysicsScale";
Debug.JustUpdateDeviceLine();
__ref.setField ("_timestepms" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_timestepms" /*RemoteObject*/ ),__ref.getField(true,"_slowdownphysicsscale" /*RemoteObject*/ )}, "/",0, 0)));
 BA.debugLineNum = 241;BA.debugLine="LoopsPerSecond = TargetFPS";
Debug.JustUpdateDeviceLine();
__ref.setField ("_loopspersecond" /*RemoteObject*/ ,BA.numberCast(float.class, __ref.getField(true,"_targetfps" /*RemoteObject*/ )));
 BA.debugLineNum = 242;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updateworldcenter(RemoteObject __ref,RemoteObject _centerpointinmeters) throws Exception{
try {
		Debug.PushSubsStack("UpdateWorldCenter (x2utils) ","x2utils",21,__ref.getField(false, "ba"),__ref,336);
if (RapidSub.canDelegate("updateworldcenter")) { return __ref.runUserSub(false, "x2utils","updateworldcenter", __ref, _centerpointinmeters);}
Debug.locals.put("CenterPointInMeters", _centerpointinmeters);
 BA.debugLineNum = 336;BA.debugLine="Public Sub UpdateWorldCenter (CenterPointInMeters";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 337;BA.debugLine="ScreenAABB.BottomLeft.X = CenterPointInMeters.X -";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_screenaabb" /*RemoteObject*/ ).runMethod(false,"getBottomLeft").runMethod(true,"setX",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_centerpointinmeters.runMethod(true,"getX"),__ref.getField(false,"_mainbc" /*RemoteObject*/ ).getField(true,"_mwidth"),RemoteObject.createImmutable(2),__ref.getField(true,"_mbcpixelspermeter" /*RemoteObject*/ )}, "-//",1, 0)));
 BA.debugLineNum = 338;BA.debugLine="ScreenAABB.BottomLeft.Y = CenterPointInMeters.Y -";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_screenaabb" /*RemoteObject*/ ).runMethod(false,"getBottomLeft").runMethod(true,"setY",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_centerpointinmeters.runMethod(true,"getY"),__ref.getField(false,"_mainbc" /*RemoteObject*/ ).getField(true,"_mheight"),RemoteObject.createImmutable(2),__ref.getField(true,"_mbcpixelspermeter" /*RemoteObject*/ )}, "-//",1, 0)));
 BA.debugLineNum = 339;BA.debugLine="ScreenAABB.TopRight.X = CenterPointInMeters.X + M";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_screenaabb" /*RemoteObject*/ ).runMethod(false,"getTopRight").runMethod(true,"setX",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_centerpointinmeters.runMethod(true,"getX"),__ref.getField(false,"_mainbc" /*RemoteObject*/ ).getField(true,"_mwidth"),RemoteObject.createImmutable(2),__ref.getField(true,"_mbcpixelspermeter" /*RemoteObject*/ )}, "+//",1, 0)));
 BA.debugLineNum = 340;BA.debugLine="ScreenAABB.TopRight.Y = CenterPointInMeters.Y + M";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_screenaabb" /*RemoteObject*/ ).runMethod(false,"getTopRight").runMethod(true,"setY",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_centerpointinmeters.runMethod(true,"getY"),__ref.getField(false,"_mainbc" /*RemoteObject*/ ).getField(true,"_mheight"),RemoteObject.createImmutable(2),__ref.getField(true,"_mbcpixelspermeter" /*RemoteObject*/ )}, "+//",1, 0)));
 BA.debugLineNum = 341;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _worldpointtomainbc(RemoteObject __ref,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("WorldPointToMainBC (x2utils) ","x2utils",21,__ref.getField(false, "ba"),__ref,365);
if (RapidSub.canDelegate("worldpointtomainbc")) { return __ref.runUserSub(false, "x2utils","worldpointtomainbc", __ref, _x, _y);}
RemoteObject _position = RemoteObject.declareNull("anywheresoftware.b4a.objects.B2Vec2");
Debug.locals.put("x", _x);
Debug.locals.put("y", _y);
 BA.debugLineNum = 365;BA.debugLine="Public Sub WorldPointToMainBC (x As Float, y As Fl";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 366;BA.debugLine="Dim position As B2Vec2";
Debug.JustUpdateDeviceLine();
_position = RemoteObject.createNew ("anywheresoftware.b4a.objects.B2Vec2");Debug.locals.put("position", _position);
 BA.debugLineNum = 367;BA.debugLine="position.X = Round((x  - ScreenAABB.BottomLeft.X)";
Debug.JustUpdateDeviceLine();
_position.runMethod(true,"setX",BA.numberCast(float.class, x2utils.__c.runMethod(true,"Round",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_x,__ref.getField(false,"_screenaabb" /*RemoteObject*/ ).runMethod(false,"getBottomLeft").runMethod(true,"getX")}, "-",1, 0)),__ref.getField(true,"_mbcpixelspermeter" /*RemoteObject*/ )}, "*",0, 0)))));
 BA.debugLineNum = 368;BA.debugLine="position.Y = Round(MainBC.mHeight - 1 - (y - Scre";
Debug.JustUpdateDeviceLine();
_position.runMethod(true,"setY",BA.numberCast(float.class, x2utils.__c.runMethod(true,"Round",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mainbc" /*RemoteObject*/ ).getField(true,"_mheight"),RemoteObject.createImmutable(1),(RemoteObject.solve(new RemoteObject[] {_y,__ref.getField(false,"_screenaabb" /*RemoteObject*/ ).runMethod(false,"getBottomLeft").runMethod(true,"getY")}, "-",1, 0)),__ref.getField(true,"_mbcpixelspermeter" /*RemoteObject*/ )}, "--*",2, 0)))));
 BA.debugLineNum = 369;BA.debugLine="Return position";
Debug.JustUpdateDeviceLine();
if (true) return _position;
 BA.debugLineNum = 370;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}