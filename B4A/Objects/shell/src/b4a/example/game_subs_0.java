package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class game_subs_0 {


public static RemoteObject  _beforetimestep(RemoteObject __ref,RemoteObject _gs) throws Exception{
try {
		Debug.PushSubsStack("BeforeTimeStep (game) ","game",2,__ref.getField(false, "ba"),__ref,84);
if (RapidSub.canDelegate("beforetimestep")) { return __ref.runUserSub(false, "game","beforetimestep", __ref, _gs);}
Debug.locals.put("GS", _gs);
 BA.debugLineNum = 84;BA.debugLine="Public Sub BeforeTimeStep (GS As X2GameStep) As Bo";
Debug.ShouldStop(524288);
 BA.debugLineNum = 85;BA.debugLine="Return False";
Debug.ShouldStop(1048576);
if (true) return game.__c.getField(true,"False");
 BA.debugLineNum = 86;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public X2 As X2Utils";
game._x2 = RemoteObject.createNew ("b4a.example.x2utils");__ref.setField("_x2",game._x2);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
game._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",game._xui);
 //BA.debugLineNum = 4;BA.debugLine="Public world As B2World";
game._world = RemoteObject.createNew ("anywheresoftware.b4a.objects.B2World");__ref.setField("_world",game._world);
 //BA.debugLineNum = 5;BA.debugLine="Public Ground As X2BodyWrapper";
game._ground = RemoteObject.createNew ("b4a.example.x2bodywrapper");__ref.setField("_ground",game._ground);
 //BA.debugLineNum = 6;BA.debugLine="Private ivForeground As B4XView";
game._ivforeground = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_ivforeground",game._ivforeground);
 //BA.debugLineNum = 7;BA.debugLine="Private ivBackground As B4XView";
game._ivbackground = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_ivbackground",game._ivbackground);
 //BA.debugLineNum = 8;BA.debugLine="Public lblStats As B4XView";
game._lblstats = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblstats",game._lblstats);
 //BA.debugLineNum = 9;BA.debugLine="Public TileMap As X2TileMap";
game._tilemap = RemoteObject.createNew ("b4a.example.x2tilemap");__ref.setField("_tilemap",game._tilemap);
 //BA.debugLineNum = 10;BA.debugLine="Public Const ObjectLayer As String = \"Object Laye";
game._objectlayer = BA.ObjectToString("Object Layer 1");__ref.setField("_objectlayer",game._objectlayer);
 //BA.debugLineNum = 11;BA.debugLine="Private PanelForTouch As B4XView";
game._panelfortouch = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_panelfortouch",game._panelfortouch);
 //BA.debugLineNum = 12;BA.debugLine="Private Car As X2BodyWrapper";
game._car = RemoteObject.createNew ("b4a.example.x2bodywrapper");__ref.setField("_car",game._car);
 //BA.debugLineNum = 13;BA.debugLine="Private force As B2Vec2";
game._force = RemoteObject.createNew ("anywheresoftware.b4a.objects.B2Vec2");__ref.setField("_force",game._force);
 //BA.debugLineNum = 14;BA.debugLine="Private Multitouch As X2MultiTouch";
game._multitouch = RemoteObject.createNew ("b4a.example.x2multitouch");__ref.setField("_multitouch",game._multitouch);
 //BA.debugLineNum = 15;BA.debugLine="Private sound As X2SoundPool";
game._sound = RemoteObject.createNew ("b4a.example.x2soundpool");__ref.setField("_sound",game._sound);
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _drawingcomplete(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DrawingComplete (game) ","game",2,__ref.getField(false, "ba"),__ref,79);
if (RapidSub.canDelegate("drawingcomplete")) { return __ref.runUserSub(false, "game","drawingcomplete", __ref);}
 BA.debugLineNum = 79;BA.debugLine="Public Sub DrawingComplete";
Debug.ShouldStop(16384);
 BA.debugLineNum = 80;BA.debugLine="TileMap.DrawingComplete";
Debug.ShouldStop(32768);
__ref.getField(false,"_tilemap" /*RemoteObject*/ ).runClassMethod (b4a.example.x2tilemap.class, "_drawingcomplete" /*RemoteObject*/ );
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _parent) throws Exception{
try {
		Debug.PushSubsStack("Initialize (game) ","game",2,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "game","initialize", __ref, _ba, _parent);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _worldwidth = RemoteObject.createImmutable(0f);
RemoteObject _worldheight = RemoteObject.createImmutable(0f);
RemoteObject _tilesize = RemoteObject.createImmutable(0);
RemoteObject _front = RemoteObject.declareNull("b4a.example.x2bodywrapper");
RemoteObject _weld = RemoteObject.declareNull("anywheresoftware.b4a.objects.joints.B2WeldJoint.B2WeldJointDef");
Debug.locals.put("ba", _ba);
Debug.locals.put("Parent", _parent);
 BA.debugLineNum = 19;BA.debugLine="Public Sub Initialize (Parent As B4XView)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 20;BA.debugLine="Parent.LoadLayout(\"GameLayout\")";
Debug.ShouldStop(524288);
_parent.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("GameLayout")),__ref.getField(false, "ba"));
 BA.debugLineNum = 21;BA.debugLine="world.Initialize(\"world\", world.CreateVec2(0, 0))";
Debug.ShouldStop(1048576);
__ref.getField(false,"_world" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("world")),(Object)(__ref.getField(false,"_world" /*RemoteObject*/ ).runMethod(false,"CreateVec2",(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)))));
 BA.debugLineNum = 22;BA.debugLine="X2.Initialize(Me, ivForeground, world)";
Debug.ShouldStop(2097152);
__ref.getField(false,"_x2" /*RemoteObject*/ ).runClassMethod (b4a.example.x2utils.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)((__ref)),(Object)(__ref.getField(false,"_ivforeground" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_world" /*RemoteObject*/ )));
 BA.debugLineNum = 23;BA.debugLine="Dim WorldWidth As Float = 10 'meters";
Debug.ShouldStop(4194304);
_worldwidth = BA.numberCast(float.class, 10);Debug.locals.put("WorldWidth", _worldwidth);Debug.locals.put("WorldWidth", _worldwidth);
 BA.debugLineNum = 24;BA.debugLine="Dim WorldHeight As Float = WorldWidth / 1.333 'sa";
Debug.ShouldStop(8388608);
_worldheight = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_worldwidth,RemoteObject.createImmutable(1.333)}, "/",0, 0));Debug.locals.put("WorldHeight", _worldheight);Debug.locals.put("WorldHeight", _worldheight);
 BA.debugLineNum = 25;BA.debugLine="X2.ConfigureDimensions(world.CreateVec2(WorldWidt";
Debug.ShouldStop(16777216);
__ref.getField(false,"_x2" /*RemoteObject*/ ).runClassMethod (b4a.example.x2utils.class, "_configuredimensions" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_world" /*RemoteObject*/ ).runMethod(false,"CreateVec2",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_worldwidth,RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_worldheight,RemoteObject.createImmutable(2)}, "/",0, 0))))),(Object)(_worldwidth));
 BA.debugLineNum = 28;BA.debugLine="TileMap.Initialize(X2, File.DirAssets, \"hello wor";
Debug.ShouldStop(134217728);
__ref.getField(false,"_tilemap" /*RemoteObject*/ ).runClassMethod (b4a.example.x2tilemap.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_x2" /*RemoteObject*/ )),(Object)(game.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("hello world with background.json")),(Object)(__ref.getField(false,"_ivbackground" /*RemoteObject*/ )));
 BA.debugLineNum = 30;BA.debugLine="Dim TileSize As Int = Min(X2.MainBC.mWidth / Tile";
Debug.ShouldStop(536870912);
_tilesize = BA.numberCast(int.class, game.__c.runMethod(true,"Min",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_x2" /*RemoteObject*/ ).getField(false,"_mainbc" /*RemoteObject*/ ).getField(true,"_mwidth"),__ref.getField(false,"_tilemap" /*RemoteObject*/ ).getField(true,"_tilesperrow" /*RemoteObject*/ )}, "/",0, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_x2" /*RemoteObject*/ ).getField(false,"_mainbc" /*RemoteObject*/ ).getField(true,"_mheight"),__ref.getField(false,"_tilemap" /*RemoteObject*/ ).getField(true,"_tilespercolumn" /*RemoteObject*/ )}, "/",0, 0))));Debug.locals.put("TileSize", _tilesize);Debug.locals.put("TileSize", _tilesize);
 BA.debugLineNum = 31;BA.debugLine="TileMap.SetSingleTileDimensionsInBCPixels(TileSiz";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_tilemap" /*RemoteObject*/ ).runClassMethod (b4a.example.x2tilemap.class, "_setsingletiledimensionsinbcpixels" /*RemoteObject*/ ,(Object)(_tilesize),(Object)(_tilesize));
 BA.debugLineNum = 33;BA.debugLine="SetWorldCenter";
Debug.ShouldStop(1);
__ref.runClassMethod (b4a.example.game.class, "_setworldcenter" /*RemoteObject*/ );
 BA.debugLineNum = 34;BA.debugLine="TileMap.PrepareObjectsDef(ObjectLayer)";
Debug.ShouldStop(2);
__ref.getField(false,"_tilemap" /*RemoteObject*/ ).runClassMethod (b4a.example.x2tilemap.class, "_prepareobjectsdef" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_objectlayer" /*RemoteObject*/ )));
 BA.debugLineNum = 36;BA.debugLine="TileMap.CreateObject2(ObjectLayer, 9)";
Debug.ShouldStop(8);
__ref.getField(false,"_tilemap" /*RemoteObject*/ ).runClassMethod (b4a.example.x2tilemap.class, "_createobject2" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_objectlayer" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 9)));
 BA.debugLineNum = 37;BA.debugLine="TileMap.CreateObject2(ObjectLayer, 10)";
Debug.ShouldStop(16);
__ref.getField(false,"_tilemap" /*RemoteObject*/ ).runClassMethod (b4a.example.x2tilemap.class, "_createobject2" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_objectlayer" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 10)));
 BA.debugLineNum = 39;BA.debugLine="Car = TileMap.CreateObject2ByName(ObjectLayer, \"c";
Debug.ShouldStop(64);
__ref.setField ("_car" /*RemoteObject*/ ,__ref.getField(false,"_tilemap" /*RemoteObject*/ ).runClassMethod (b4a.example.x2tilemap.class, "_createobject2byname" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_objectlayer" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("car"))));
 BA.debugLineNum = 41;BA.debugLine="Dim front As X2BodyWrapper = TileMap.CreateObject";
Debug.ShouldStop(256);
_front = __ref.getField(false,"_tilemap" /*RemoteObject*/ ).runClassMethod (b4a.example.x2tilemap.class, "_createobject2byname" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_objectlayer" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("car front")));Debug.locals.put("front", _front);Debug.locals.put("front", _front);
 BA.debugLineNum = 42;BA.debugLine="Dim weld As B2WeldJointDef";
Debug.ShouldStop(512);
_weld = RemoteObject.createNew ("anywheresoftware.b4a.objects.joints.B2WeldJoint.B2WeldJointDef");Debug.locals.put("weld", _weld);
 BA.debugLineNum = 43;BA.debugLine="weld.Initialize(Car.Body, front.Body, front.Body.";
Debug.ShouldStop(1024);
_weld.runVoidMethod ("Initialize",(Object)(__ref.getField(false,"_car" /*RemoteObject*/ ).getField(false,"_body" /*RemoteObject*/ )),(Object)(_front.getField(false,"_body" /*RemoteObject*/ )),(Object)(_front.getField(false,"_body" /*RemoteObject*/ ).runMethod(false,"getWorldCenter")));
 BA.debugLineNum = 44;BA.debugLine="X2.mWorld.CreateJoint(weld)";
Debug.ShouldStop(2048);
__ref.getField(false,"_x2" /*RemoteObject*/ ).getField(false,"_mworld" /*RemoteObject*/ ).runVoidMethod ("CreateJoint",(Object)((_weld)));
 BA.debugLineNum = 45;BA.debugLine="force = X2.CreateVec2(0, 0.5)";
Debug.ShouldStop(4096);
__ref.setField ("_force" /*RemoteObject*/ ,__ref.getField(false,"_x2" /*RemoteObject*/ ).runClassMethod (b4a.example.x2utils.class, "_createvec2" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0.5))));
 BA.debugLineNum = 46;BA.debugLine="Multitouch.Initialize(B4XPages.MainPage, Array(Pa";
Debug.ShouldStop(8192);
__ref.getField(false,"_multitouch" /*RemoteObject*/ ).runClassMethod (b4a.example.x2multitouch.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)((game._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ,__ref.getField(false, "ba")))),(Object)(game.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(__ref.getField(false,"_panelfortouch" /*RemoteObject*/ ).getObject())})))));
 BA.debugLineNum = 47;BA.debugLine="sound.Initialize";
Debug.ShouldStop(16384);
__ref.getField(false,"_sound" /*RemoteObject*/ ).runClassMethod (b4a.example.x2soundpool.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 48;BA.debugLine="sound.AddSound(\"click\", File.DirAssets, \"click.mp";
Debug.ShouldStop(32768);
__ref.getField(false,"_sound" /*RemoteObject*/ ).runClassMethod (b4a.example.x2soundpool.class, "_addsound" /*RemoteObject*/ ,(Object)(BA.ObjectToString("click")),(Object)(game.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("click.mp3")));
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resize(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Resize (game) ","game",2,__ref.getField(false, "ba"),__ref,57);
if (RapidSub.canDelegate("resize")) { return __ref.runUserSub(false, "game","resize", __ref);}
 BA.debugLineNum = 57;BA.debugLine="Public Sub Resize";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 58;BA.debugLine="X2.ImageViewResized";
Debug.ShouldStop(33554432);
__ref.getField(false,"_x2" /*RemoteObject*/ ).runClassMethod (b4a.example.x2utils.class, "_imageviewresized" /*RemoteObject*/ );
 BA.debugLineNum = 59;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setworldcenter(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetWorldCenter (game) ","game",2,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("setworldcenter")) { return __ref.runUserSub(false, "game","setworldcenter", __ref);}
 BA.debugLineNum = 51;BA.debugLine="Private Sub SetWorldCenter";
Debug.ShouldStop(262144);
 BA.debugLineNum = 54;BA.debugLine="X2.UpdateWorldCenter(TileMap.MapAABB.Center)";
Debug.ShouldStop(2097152);
__ref.getField(false,"_x2" /*RemoteObject*/ ).runClassMethod (b4a.example.x2utils.class, "_updateworldcenter" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_tilemap" /*RemoteObject*/ ).getField(false,"_mapaabb" /*RemoteObject*/ ).runMethod(false,"getCenter")));
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("Tick (game) ","game",2,__ref.getField(false, "ba"),__ref,61);
if (RapidSub.canDelegate("tick")) { return __ref.runUserSub(false, "game","tick", __ref, _gs);}
RemoteObject _touch = RemoteObject.declareNull("b4a.example.x2multitouch._x2touch");
RemoteObject _bw = RemoteObject.declareNull("b4a.example.x2bodywrapper");
Debug.locals.put("GS", _gs);
 BA.debugLineNum = 61;BA.debugLine="Public Sub Tick (GS As X2GameStep)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 62;BA.debugLine="TileMap.DrawScreen(Array(\"Tile Layer 1\"), GS.Draw";
Debug.ShouldStop(536870912);
__ref.getField(false,"_tilemap" /*RemoteObject*/ ).runClassMethod (b4a.example.x2tilemap.class, "_drawscreen" /*RemoteObject*/ ,(Object)(game.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("Tile Layer 1"))})))),(Object)(_gs.getField(false,"DrawingTasks" /*RemoteObject*/ )));
 BA.debugLineNum = 63;BA.debugLine="Dim touch As X2Touch = Multitouch.GetSingleTouch(";
Debug.ShouldStop(1073741824);
_touch = __ref.getField(false,"_multitouch" /*RemoteObject*/ ).runClassMethod (b4a.example.x2multitouch.class, "_getsingletouch" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_panelfortouch" /*RemoteObject*/ )));Debug.locals.put("touch", _touch);Debug.locals.put("touch", _touch);
 BA.debugLineNum = 64;BA.debugLine="If touch.IsInitialized Then";
Debug.ShouldStop(-2147483648);
if (_touch.getField(true,"IsInitialized" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 65;BA.debugLine="Car.Body.ApplyForceToCenter(Car.Body.Transform.M";
Debug.ShouldStop(1);
__ref.getField(false,"_car" /*RemoteObject*/ ).getField(false,"_body" /*RemoteObject*/ ).runVoidMethod ("ApplyForceToCenter",(Object)(__ref.getField(false,"_car" /*RemoteObject*/ ).getField(false,"_body" /*RemoteObject*/ ).runMethod(false,"getTransform").runMethod(false,"MultiplyRot",(Object)(__ref.getField(false,"_force" /*RemoteObject*/ )))));
 BA.debugLineNum = 66;BA.debugLine="If touch.Handled = False Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_touch.getField(true,"Handled" /*RemoteObject*/ ),game.__c.getField(true,"False"))) { 
 BA.debugLineNum = 68;BA.debugLine="For Each bw As X2BodyWrapper In X2.GetBodiesInt";
Debug.ShouldStop(8);
{
final RemoteObject group6 = __ref.getField(false,"_x2" /*RemoteObject*/ ).runClassMethod (b4a.example.x2utils.class, "_getbodiesintersectingwithworldpoint" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_x2" /*RemoteObject*/ ).runClassMethod (b4a.example.x2utils.class, "_screenpointtoworld" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _touch.getField(true,"X" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, _touch.getField(true,"Y" /*RemoteObject*/ ))))));
final int groupLen6 = group6.runMethod(true,"getSize").<Integer>get()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_bw = (group6.runMethod(false,"Get",index6));Debug.locals.put("bw", _bw);
Debug.locals.put("bw", _bw);
 BA.debugLineNum = 69;BA.debugLine="If bw.Name = \"car\" Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_bw.getField(true,"_name" /*RemoteObject*/ ),BA.ObjectToString("car"))) { 
 BA.debugLineNum = 70;BA.debugLine="Car.Body.ApplyAngularImpulse(5)";
Debug.ShouldStop(32);
__ref.getField(false,"_car" /*RemoteObject*/ ).getField(false,"_body" /*RemoteObject*/ ).runVoidMethod ("ApplyAngularImpulse",(Object)(BA.numberCast(float.class, 5)));
 BA.debugLineNum = 71;BA.debugLine="touch.Handled = True";
Debug.ShouldStop(64);
_touch.setField ("Handled" /*RemoteObject*/ ,game.__c.getField(true,"True"));
 BA.debugLineNum = 72;BA.debugLine="sound.PlaySound(\"click\")";
Debug.ShouldStop(128);
__ref.getField(false,"_sound" /*RemoteObject*/ ).runClassMethod (b4a.example.x2soundpool.class, "_playsound" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("click")));
 };
 }
}Debug.locals.put("bw", _bw);
;
 };
 };
 BA.debugLineNum = 77;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}