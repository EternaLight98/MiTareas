package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class x2tilemap_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private parser As JSONParser";
x2tilemap._parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");__ref.setField("_parser",x2tilemap._parser);
 //BA.debugLineNum = 3;BA.debugLine="Type X2InternalTileSet (TilesBC As BitmapCreator,";
;
 //BA.debugLineNum = 6;BA.debugLine="Type X2InternalTileLayer (Name As String, Tiles()";
;
 //BA.debugLineNum = 7;BA.debugLine="Type X2TileObjectTemplate (Name As String, Props";
;
 //BA.debugLineNum = 9;BA.debugLine="Type X2ObjectsLayer (Name As String, ObjectsById";
;
 //BA.debugLineNum = 10;BA.debugLine="Type X2Tile (CBC As CompressedBC, TileIdentifier";
;
 //BA.debugLineNum = 11;BA.debugLine="Private TileSets As Map";
x2tilemap._tilesets = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_tilesets",x2tilemap._tilesets);
 //BA.debugLineNum = 12;BA.debugLine="Public TileWidthMeters As Float";
x2tilemap._tilewidthmeters = RemoteObject.createImmutable(0f);__ref.setField("_tilewidthmeters",x2tilemap._tilewidthmeters);
 //BA.debugLineNum = 13;BA.debugLine="Public TileHeightMeters As Float";
x2tilemap._tileheightmeters = RemoteObject.createImmutable(0f);__ref.setField("_tileheightmeters",x2tilemap._tileheightmeters);
 //BA.debugLineNum = 14;BA.debugLine="Private OriginalTileWidthPixels, OriginalTileHeig";
x2tilemap._originaltilewidthpixels = RemoteObject.createImmutable(0);__ref.setField("_originaltilewidthpixels",x2tilemap._originaltilewidthpixels);
x2tilemap._originaltileheightpixels = RemoteObject.createImmutable(0);__ref.setField("_originaltileheightpixels",x2tilemap._originaltileheightpixels);
 //BA.debugLineNum = 15;BA.debugLine="Private TileWidthPixels, TileHeightPixels As Int";
x2tilemap._tilewidthpixels = RemoteObject.createImmutable(0);__ref.setField("_tilewidthpixels",x2tilemap._tilewidthpixels);
x2tilemap._tileheightpixels = RemoteObject.createImmutable(0);__ref.setField("_tileheightpixels",x2tilemap._tileheightpixels);
 //BA.debugLineNum = 16;BA.debugLine="Private MetersToPixelsX, MetersToPixelsY As Float";
x2tilemap._meterstopixelsx = RemoteObject.createImmutable(0f);__ref.setField("_meterstopixelsx",x2tilemap._meterstopixelsx);
x2tilemap._meterstopixelsy = RemoteObject.createImmutable(0f);__ref.setField("_meterstopixelsy",x2tilemap._meterstopixelsy);
 //BA.debugLineNum = 17;BA.debugLine="Private MapBottomYOriginalPixels As Int";
x2tilemap._mapbottomyoriginalpixels = RemoteObject.createImmutable(0);__ref.setField("_mapbottomyoriginalpixels",x2tilemap._mapbottomyoriginalpixels);
 //BA.debugLineNum = 18;BA.debugLine="Public TilesPerRow As Int";
x2tilemap._tilesperrow = RemoteObject.createImmutable(0);__ref.setField("_tilesperrow",x2tilemap._tilesperrow);
 //BA.debugLineNum = 19;BA.debugLine="Public TilesPerColumn As Int";
x2tilemap._tilespercolumn = RemoteObject.createImmutable(0);__ref.setField("_tilespercolumn",x2tilemap._tilespercolumn);
 //BA.debugLineNum = 20;BA.debugLine="Public SingleTileBC As BitmapCreator";
x2tilemap._singletilebc = RemoteObject.createNew ("b4a.example.bitmapcreator");__ref.setField("_singletilebc",x2tilemap._singletilebc);
 //BA.debugLineNum = 21;BA.debugLine="Public Layers As Map";
x2tilemap._layers = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_layers",x2tilemap._layers);
 //BA.debugLineNum = 22;BA.debugLine="Private TilesCBC As Map";
x2tilemap._tilescbc = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_tilescbc",x2tilemap._tilescbc);
 //BA.debugLineNum = 23;BA.debugLine="Private MapRectPixels As B4XRect";
x2tilemap._maprectpixels = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");__ref.setField("_maprectpixels",x2tilemap._maprectpixels);
 //BA.debugLineNum = 24;BA.debugLine="Private xui As XUI";
x2tilemap._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",x2tilemap._xui);
 //BA.debugLineNum = 25;BA.debugLine="Private X2 As X2Utils";
x2tilemap._x2 = RemoteObject.createNew ("b4a.example.x2utils");__ref.setField("_x2",x2tilemap._x2);
 //BA.debugLineNum = 26;BA.debugLine="Private const FLIPPED_HORIZONTALLY = 0x80000000,";
x2tilemap._flipped_horizontally = BA.numberCast(int.class, ((int)0x80000000));__ref.setField("_flipped_horizontally",x2tilemap._flipped_horizontally);
x2tilemap._flipped_vertically = BA.numberCast(int.class, ((int)0x40000000));__ref.setField("_flipped_vertically",x2tilemap._flipped_vertically);
x2tilemap._flipped_diagonally_flag = BA.numberCast(int.class, ((int)0x20000000));__ref.setField("_flipped_diagonally_flag",x2tilemap._flipped_diagonally_flag);
 //BA.debugLineNum = 27;BA.debugLine="Private su As StringUtils";
x2tilemap._su = RemoteObject.createNew ("anywheresoftware.b4a.objects.StringUtils");__ref.setField("_su",x2tilemap._su);
 //BA.debugLineNum = 28;BA.debugLine="Private cs As CompressedStreams";
x2tilemap._cs = RemoteObject.createNew ("anywheresoftware.b4a.randomaccessfile.CompressedStreams");__ref.setField("_cs",x2tilemap._cs);
 //BA.debugLineNum = 29;BA.debugLine="Private raf As RandomAccessFile";
x2tilemap._raf = RemoteObject.createNew ("anywheresoftware.b4a.randomaccessfile.RandomAccessFile");__ref.setField("_raf",x2tilemap._raf);
 //BA.debugLineNum = 30;BA.debugLine="Public MapXToMeter, MapYToMeter As Float";
x2tilemap._mapxtometer = RemoteObject.createImmutable(0f);__ref.setField("_mapxtometer",x2tilemap._mapxtometer);
x2tilemap._mapytometer = RemoteObject.createImmutable(0f);__ref.setField("_mapytometer",x2tilemap._mapytometer);
 //BA.debugLineNum = 31;BA.debugLine="Private DefaultCustomProperties As Map";
x2tilemap._defaultcustomproperties = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_defaultcustomproperties",x2tilemap._defaultcustomproperties);
 //BA.debugLineNum = 32;BA.debugLine="Private BackgroundColorBC As BitmapCreator";
x2tilemap._backgroundcolorbc = RemoteObject.createNew ("b4a.example.bitmapcreator");__ref.setField("_backgroundcolorbc",x2tilemap._backgroundcolorbc);
 //BA.debugLineNum = 33;BA.debugLine="Public MapAABB As B2AABB";
x2tilemap._mapaabb = RemoteObject.createNew ("anywheresoftware.b4a.objects.B2AABB");__ref.setField("_mapaabb",x2tilemap._mapaabb);
 //BA.debugLineNum = 34;BA.debugLine="Public mTargetView As B4XView";
x2tilemap._mtargetview = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mtargetview",x2tilemap._mtargetview);
 //BA.debugLineNum = 35;BA.debugLine="Private TargetViewBC(2) As BitmapCreator";
x2tilemap._targetviewbc = RemoteObject.createNewArray ("b4a.example.bitmapcreator", new int[] {2}, new Object[]{});__ref.setField("_targetviewbc",x2tilemap._targetviewbc);
 //BA.debugLineNum = 36;BA.debugLine="Private TargetViewBCIndex As Int";
x2tilemap._targetviewbcindex = RemoteObject.createImmutable(0);__ref.setField("_targetviewbcindex",x2tilemap._targetviewbcindex);
 //BA.debugLineNum = 37;BA.debugLine="Private ReuseTilesRect As B4XRect";
x2tilemap._reusetilesrect = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");__ref.setField("_reusetilesrect",x2tilemap._reusetilesrect);
 //BA.debugLineNum = 38;BA.debugLine="Private ReuseScreenCenter As B2Vec2";
x2tilemap._reusescreencenter = RemoteObject.createNew ("anywheresoftware.b4a.objects.B2Vec2");__ref.setField("_reusescreencenter",x2tilemap._reusescreencenter);
 //BA.debugLineNum = 39;BA.debugLine="Private ReuseTileTop, ReuseTileLeft As Int";
x2tilemap._reusetiletop = RemoteObject.createImmutable(0);__ref.setField("_reusetiletop",x2tilemap._reusetiletop);
x2tilemap._reusetileleft = RemoteObject.createImmutable(0);__ref.setField("_reusetileleft",x2tilemap._reusetileleft);
 //BA.debugLineNum = 40;BA.debugLine="Private LastDrawnScreenCenterStarted, LastDrawnSc";
x2tilemap._lastdrawnscreencenterstarted = RemoteObject.createNew ("anywheresoftware.b4a.objects.B2Vec2");__ref.setField("_lastdrawnscreencenterstarted",x2tilemap._lastdrawnscreencenterstarted);
x2tilemap._lastdrawnscreencompleted = RemoteObject.createNew ("anywheresoftware.b4a.objects.B2Vec2");__ref.setField("_lastdrawnscreencompleted",x2tilemap._lastdrawnscreencompleted);
 //BA.debugLineNum = 41;BA.debugLine="Private TileMapVersion As Float";
x2tilemap._tilemapversion = RemoteObject.createImmutable(0f);__ref.setField("_tilemapversion",x2tilemap._tilemapversion);
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _convertmaptowritablemapifneeded(RemoteObject __ref,RemoteObject _m) throws Exception{
try {
		Debug.PushSubsStack("ConvertMapToWritableMapIfNeeded (x2tilemap) ","x2tilemap",20,__ref.getField(false, "ba"),__ref,147);
if (RapidSub.canDelegate("convertmaptowritablemapifneeded")) { return __ref.runUserSub(false, "x2tilemap","convertmaptowritablemapifneeded", __ref, _m);}
Debug.locals.put("m", _m);
 BA.debugLineNum = 147;BA.debugLine="Private Sub ConvertMapToWritableMapIfNeeded (m As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 159;BA.debugLine="Return m";
Debug.JustUpdateDeviceLine();
if (true) return _m;
 BA.debugLineNum = 160;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createbodydefandfixturedef(RemoteObject __ref,RemoteObject _template) throws Exception{
try {
		Debug.PushSubsStack("CreateBodyDefAndFixtureDef (x2tilemap) ","x2tilemap",20,__ref.getField(false, "ba"),__ref,173);
if (RapidSub.canDelegate("createbodydefandfixturedef")) { return __ref.runUserSub(false, "x2tilemap","createbodydefandfixturedef", __ref, _template);}
RemoteObject _bodytype = RemoteObject.createImmutable("");
RemoteObject _rotationdegrees = RemoteObject.createImmutable(0f);
RemoteObject _polygon = RemoteObject.declareNull("anywheresoftware.b4a.objects.B2Shape.B2PolygonShape");
RemoteObject _dx = RemoteObject.createImmutable(0f);
RemoteObject _dy = RemoteObject.createImmutable(0f);
RemoteObject _chain = RemoteObject.declareNull("anywheresoftware.b4a.objects.B2Shape.B2ChainShape");
RemoteObject _circle = RemoteObject.declareNull("anywheresoftware.b4a.objects.B2Shape.B2CircleShape");
RemoteObject _width = RemoteObject.createImmutable(0f);
RemoteObject _radius = RemoteObject.createImmutable(0f);
RemoteObject _rect = RemoteObject.declareNull("anywheresoftware.b4a.objects.B2Shape.B2PolygonShape");
RemoteObject _height = RemoteObject.createImmutable(0f);
RemoteObject _graphicfile = RemoteObject.createImmutable("");
RemoteObject _graphicname = RemoteObject.createImmutable("");
Debug.locals.put("template", _template);
 BA.debugLineNum = 173;BA.debugLine="Private Sub CreateBodyDefAndFixtureDef(template As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 174;BA.debugLine="Dim bodytype As String = GetCustomProperty(templa";
Debug.JustUpdateDeviceLine();
_bodytype = BA.ObjectToString(__ref.runClassMethod (b4a.example.x2tilemap.class, "_getcustomproperty" /*RemoteObject*/ ,(Object)(_template),(Object)(RemoteObject.createImmutable("body type"))));Debug.locals.put("bodytype", _bodytype);Debug.locals.put("bodytype", _bodytype);
 BA.debugLineNum = 175;BA.debugLine="If bodytype = \"dynamic\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_bodytype,BA.ObjectToString("dynamic"))) { 
 BA.debugLineNum = 176;BA.debugLine="template.BodyDef.BodyType = template.BodyDef.TYP";
Debug.JustUpdateDeviceLine();
_template.getField(false,"BodyDef" /*RemoteObject*/ ).runMethod(false,"setBodyType",_template.getField(false,"BodyDef" /*RemoteObject*/ ).getField(false,"TYPE_DYNAMIC"));
 }else 
{ BA.debugLineNum = 177;BA.debugLine="Else If bodytype = \"kinematic\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_bodytype,BA.ObjectToString("kinematic"))) { 
 BA.debugLineNum = 178;BA.debugLine="template.BodyDef.BodyType = template.BodyDef.TYP";
Debug.JustUpdateDeviceLine();
_template.getField(false,"BodyDef" /*RemoteObject*/ ).runMethod(false,"setBodyType",_template.getField(false,"BodyDef" /*RemoteObject*/ ).getField(false,"TYPE_KINEMATIC"));
 }else {
 BA.debugLineNum = 181;BA.debugLine="template.CustomProps.Put(\"angle interval\", 1)";
Debug.JustUpdateDeviceLine();
_template.getField(false,"CustomProps" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("angle interval"))),(Object)(RemoteObject.createImmutable((1))));
 }}
;
 BA.debugLineNum = 183;BA.debugLine="template.BodyDef.Position = template.Position";
Debug.JustUpdateDeviceLine();
_template.getField(false,"BodyDef" /*RemoteObject*/ ).runMethod(false,"setPosition",_template.getField(false,"Position" /*RemoteObject*/ ));
 BA.debugLineNum = 184;BA.debugLine="Dim RotationDegrees As Float = template.Props.Get";
Debug.JustUpdateDeviceLine();
_rotationdegrees = BA.numberCast(float.class, _template.getField(false,"Props" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("rotation")))));Debug.locals.put("RotationDegrees", _rotationdegrees);Debug.locals.put("RotationDegrees", _rotationdegrees);
 BA.debugLineNum = 185;BA.debugLine="template.BodyDef.Angle = X2.DegreesToB2Angle(Rota";
Debug.JustUpdateDeviceLine();
_template.getField(false,"BodyDef" /*RemoteObject*/ ).runMethod(true,"setAngle",__ref.getField(false,"_x2" /*RemoteObject*/ ).runClassMethod (b4a.example.x2utils.class, "_degreestob2angle" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _rotationdegrees))));
 BA.debugLineNum = 186;BA.debugLine="template.BodyDef.AllowSleep = GetCustomProperty(t";
Debug.JustUpdateDeviceLine();
_template.getField(false,"BodyDef" /*RemoteObject*/ ).runMethod(true,"setAllowSleep",BA.ObjectToBoolean(__ref.runClassMethod (b4a.example.x2tilemap.class, "_getcustomproperty" /*RemoteObject*/ ,(Object)(_template),(Object)(RemoteObject.createImmutable("allow sleep")))));
 BA.debugLineNum = 187;BA.debugLine="template.BodyDef.FixedRotation = GetCustomPropert";
Debug.JustUpdateDeviceLine();
_template.getField(false,"BodyDef" /*RemoteObject*/ ).runMethod(true,"setFixedRotation",BA.ObjectToBoolean(__ref.runClassMethod (b4a.example.x2tilemap.class, "_getcustomproperty" /*RemoteObject*/ ,(Object)(_template),(Object)(RemoteObject.createImmutable("fixed rotation")))));
 BA.debugLineNum = 188;BA.debugLine="template.BodyDef.GravityScale = GetCustomProperty";
Debug.JustUpdateDeviceLine();
_template.getField(false,"BodyDef" /*RemoteObject*/ ).runMethod(true,"setGravityScale",BA.numberCast(float.class, __ref.runClassMethod (b4a.example.x2tilemap.class, "_getcustomproperty" /*RemoteObject*/ ,(Object)(_template),(Object)(RemoteObject.createImmutable("gravity scale")))));
 BA.debugLineNum = 189;BA.debugLine="If template.Props.ContainsKey(\"polygon\") Then";
Debug.JustUpdateDeviceLine();
if (_template.getField(false,"Props" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("polygon")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 190;BA.debugLine="Dim polygon As B2PolygonShape";
Debug.JustUpdateDeviceLine();
_polygon = RemoteObject.createNew ("anywheresoftware.b4a.objects.B2Shape.B2PolygonShape");Debug.locals.put("polygon", _polygon);
 BA.debugLineNum = 191;BA.debugLine="polygon.Initialize";
Debug.JustUpdateDeviceLine();
_polygon.runVoidMethod ("Initialize");
 BA.debugLineNum = 192;BA.debugLine="polygon.Set(ListOfMapCoordinatesToListOfLocalVec";
Debug.JustUpdateDeviceLine();
_polygon.runVoidMethod ("Set",(Object)(__ref.runClassMethod (b4a.example.x2tilemap.class, "_listofmapcoordinatestolistoflocalvecs" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _template.getField(false,"Props" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("polygon"))))),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)))));
 BA.debugLineNum = 193;BA.debugLine="X2.GetShapeWidthAndHeight(polygon)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_x2" /*RemoteObject*/ ).runClassMethod (b4a.example.x2utils.class, "_getshapewidthandheight" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B2Shape.ConcreteB2Shape"), _polygon.getObject()));
 BA.debugLineNum = 194;BA.debugLine="Dim dx As Float = X2.ShapeAABB.Center.X";
Debug.JustUpdateDeviceLine();
_dx = __ref.getField(false,"_x2" /*RemoteObject*/ ).getField(false,"_shapeaabb" /*RemoteObject*/ ).runMethod(false,"getCenter").runMethod(true,"getX");Debug.locals.put("dx", _dx);Debug.locals.put("dx", _dx);
 BA.debugLineNum = 195;BA.debugLine="Dim dy As Float = X2.ShapeAABB.Center.Y";
Debug.JustUpdateDeviceLine();
_dy = __ref.getField(false,"_x2" /*RemoteObject*/ ).getField(false,"_shapeaabb" /*RemoteObject*/ ).runMethod(false,"getCenter").runMethod(true,"getY");Debug.locals.put("dy", _dy);Debug.locals.put("dy", _dy);
 BA.debugLineNum = 196;BA.debugLine="polygon.Set(ListOfMapCoordinatesToListOfLocalVec";
Debug.JustUpdateDeviceLine();
_polygon.runVoidMethod ("Set",(Object)(__ref.runClassMethod (b4a.example.x2tilemap.class, "_listofmapcoordinatestolistoflocalvecs" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _template.getField(false,"Props" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("polygon"))))),(Object)(BA.numberCast(float.class, -(double) (0 + _dx.<Float>get().floatValue()))),(Object)(BA.numberCast(float.class, -(double) (0 + _dy.<Float>get().floatValue()))))));
 BA.debugLineNum = 199;BA.debugLine="template.BodyDef.Position.AddToThis(X2.CreateVec";
Debug.JustUpdateDeviceLine();
_template.getField(false,"BodyDef" /*RemoteObject*/ ).runMethod(false,"getPosition").runVoidMethod ("AddToThis",(Object)(__ref.getField(false,"_x2" /*RemoteObject*/ ).runClassMethod (b4a.example.x2utils.class, "_createvec2" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_dy,x2tilemap.__c.runMethod(true,"SinD",(Object)(BA.numberCast(double.class, _rotationdegrees))),_dx,x2tilemap.__c.runMethod(true,"CosD",(Object)(BA.numberCast(double.class, _rotationdegrees)))}, "*+*",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_dy,x2tilemap.__c.runMethod(true,"CosD",(Object)(BA.numberCast(double.class, _rotationdegrees))),_dx,x2tilemap.__c.runMethod(true,"SinD",(Object)(BA.numberCast(double.class, _rotationdegrees)))}, "*-*",1, 0))))));
 BA.debugLineNum = 201;BA.debugLine="template.FixtureDef.Shape = polygon";
Debug.JustUpdateDeviceLine();
_template.getField(false,"FixtureDef" /*RemoteObject*/ ).runMethod(false,"setShape",(_polygon.getObject()));
 }else 
{ BA.debugLineNum = 202;BA.debugLine="Else If template.Props.ContainsKey(\"polyline\") Th";
Debug.JustUpdateDeviceLine();
if (_template.getField(false,"Props" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("polyline")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 203;BA.debugLine="Dim chain As B2ChainShape";
Debug.JustUpdateDeviceLine();
_chain = RemoteObject.createNew ("anywheresoftware.b4a.objects.B2Shape.B2ChainShape");Debug.locals.put("chain", _chain);
 BA.debugLineNum = 204;BA.debugLine="chain.Initialize";
Debug.JustUpdateDeviceLine();
_chain.runVoidMethod ("Initialize");
 BA.debugLineNum = 205;BA.debugLine="chain.CreateChain(ListOfMapCoordinatesToListOfLo";
Debug.JustUpdateDeviceLine();
_chain.runVoidMethod ("CreateChain",(Object)(__ref.runClassMethod (b4a.example.x2tilemap.class, "_listofmapcoordinatestolistoflocalvecs" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _template.getField(false,"Props" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("polyline"))))),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)))));
 BA.debugLineNum = 206;BA.debugLine="template.FixtureDef.Shape = chain";
Debug.JustUpdateDeviceLine();
_template.getField(false,"FixtureDef" /*RemoteObject*/ ).runMethod(false,"setShape",(_chain.getObject()));
 }else 
{ BA.debugLineNum = 207;BA.debugLine="Else If template.Props.GetDefault(\"ellipse\", Fals";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_template.getField(false,"Props" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ellipse"))),(Object)((x2tilemap.__c.getField(true,"False")))),(x2tilemap.__c.getField(true,"True")))) { 
 BA.debugLineNum = 208;BA.debugLine="Dim circle As B2CircleShape";
Debug.JustUpdateDeviceLine();
_circle = RemoteObject.createNew ("anywheresoftware.b4a.objects.B2Shape.B2CircleShape");Debug.locals.put("circle", _circle);
 BA.debugLineNum = 209;BA.debugLine="Dim width As Float = template.Props.Get(\"width\")";
Debug.JustUpdateDeviceLine();
_width = BA.numberCast(float.class, _template.getField(false,"Props" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("width")))));Debug.locals.put("width", _width);Debug.locals.put("width", _width);
 BA.debugLineNum = 210;BA.debugLine="Dim radius As Float = width * MapXToMeter / 2";
Debug.JustUpdateDeviceLine();
_radius = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_width,__ref.getField(true,"_mapxtometer" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "*/",0, 0));Debug.locals.put("radius", _radius);Debug.locals.put("radius", _radius);
 BA.debugLineNum = 211;BA.debugLine="circle.Initialize(radius)";
Debug.JustUpdateDeviceLine();
_circle.runVoidMethod ("Initialize",(Object)(_radius));
 BA.debugLineNum = 212;BA.debugLine="template.BodyDef.Position.AddToThis(X2.CreateVec";
Debug.JustUpdateDeviceLine();
_template.getField(false,"BodyDef" /*RemoteObject*/ ).runMethod(false,"getPosition").runVoidMethod ("AddToThis",(Object)(__ref.getField(false,"_x2" /*RemoteObject*/ ).runClassMethod (b4a.example.x2utils.class, "_createvec2" /*RemoteObject*/ ,(Object)(_radius),(Object)(BA.numberCast(float.class, -(double) (0 + _radius.<Float>get().floatValue()))))));
 BA.debugLineNum = 213;BA.debugLine="template.FixtureDef.Shape = circle";
Debug.JustUpdateDeviceLine();
_template.getField(false,"FixtureDef" /*RemoteObject*/ ).runMethod(false,"setShape",(_circle.getObject()));
 }else {
 BA.debugLineNum = 215;BA.debugLine="Dim rect As B2PolygonShape";
Debug.JustUpdateDeviceLine();
_rect = RemoteObject.createNew ("anywheresoftware.b4a.objects.B2Shape.B2PolygonShape");Debug.locals.put("rect", _rect);
 BA.debugLineNum = 216;BA.debugLine="rect.Initialize";
Debug.JustUpdateDeviceLine();
_rect.runVoidMethod ("Initialize");
 BA.debugLineNum = 217;BA.debugLine="Dim width As Float = template.Props.Get(\"width\")";
Debug.JustUpdateDeviceLine();
_width = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _template.getField(false,"Props" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("width"))))),__ref.getField(true,"_mapxtometer" /*RemoteObject*/ )}, "*",0, 0));Debug.locals.put("width", _width);Debug.locals.put("width", _width);
 BA.debugLineNum = 218;BA.debugLine="Dim height As Float = template.Props.Get(\"height";
Debug.JustUpdateDeviceLine();
_height = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _template.getField(false,"Props" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("height"))))),__ref.getField(true,"_mapytometer" /*RemoteObject*/ )}, "*",0, 0));Debug.locals.put("height", _height);Debug.locals.put("height", _height);
 BA.debugLineNum = 220;BA.debugLine="template.BodyDef.Position.AddToThis(X2.CreateVec";
Debug.JustUpdateDeviceLine();
_template.getField(false,"BodyDef" /*RemoteObject*/ ).runMethod(false,"getPosition").runVoidMethod ("AddToThis",(Object)(__ref.getField(false,"_x2" /*RemoteObject*/ ).runClassMethod (b4a.example.x2utils.class, "_createvec2" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, -(double) (0 + _height.<Float>get().floatValue())/(double)(double) (0 + 2)*x2tilemap.__c.runMethod(true,"SinD",(Object)(BA.numberCast(double.class, _rotationdegrees))).<Double>get().doubleValue()+(double) (0 + _width.<Float>get().floatValue())/(double)(double) (0 + 2)*x2tilemap.__c.runMethod(true,"CosD",(Object)(BA.numberCast(double.class, _rotationdegrees))).<Double>get().doubleValue())),(Object)(BA.numberCast(float.class, -(double) (0 + _height.<Float>get().floatValue())/(double)(double) (0 + 2)*x2tilemap.__c.runMethod(true,"CosD",(Object)(BA.numberCast(double.class, _rotationdegrees))).<Double>get().doubleValue()+-(double) (0 + _width.<Float>get().floatValue())/(double)(double) (0 + 2)*x2tilemap.__c.runMethod(true,"SinD",(Object)(BA.numberCast(double.class, _rotationdegrees))).<Double>get().doubleValue())))));
 BA.debugLineNum = 222;BA.debugLine="rect.SetAsBox(width / 2, height / 2)";
Debug.JustUpdateDeviceLine();
_rect.runVoidMethod ("SetAsBox",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_width,RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_height,RemoteObject.createImmutable(2)}, "/",0, 0))));
 BA.debugLineNum = 223;BA.debugLine="template.FixtureDef.Shape = rect";
Debug.JustUpdateDeviceLine();
_template.getField(false,"FixtureDef" /*RemoteObject*/ ).runMethod(false,"setShape",(_rect.getObject()));
 }}}
;
 BA.debugLineNum = 225;BA.debugLine="Dim GraphicFile As String = GetCustomProperty(tem";
Debug.JustUpdateDeviceLine();
_graphicfile = BA.ObjectToString(__ref.runClassMethod (b4a.example.x2tilemap.class, "_getcustomproperty" /*RemoteObject*/ ,(Object)(_template),(Object)(RemoteObject.createImmutable("graphic file 1"))));Debug.locals.put("GraphicFile", _graphicfile);Debug.locals.put("GraphicFile", _graphicfile);
 BA.debugLineNum = 226;BA.debugLine="Dim GraphicName As String = GetCustomProperty(tem";
Debug.JustUpdateDeviceLine();
_graphicname = BA.ObjectToString(__ref.runClassMethod (b4a.example.x2tilemap.class, "_getcustomproperty" /*RemoteObject*/ ,(Object)(_template),(Object)(RemoteObject.createImmutable("graphic name"))));Debug.locals.put("GraphicName", _graphicname);Debug.locals.put("GraphicName", _graphicname);
 BA.debugLineNum = 227;BA.debugLine="If GraphicFile <> \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_graphicfile,BA.ObjectToString(""))) { 
 BA.debugLineNum = 228;BA.debugLine="If GraphicName <> \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_graphicname,BA.ObjectToString(""))) { 
 BA.debugLineNum = 229;BA.debugLine="Log(\"Both 'graphic name' and 'graphic file' are";
Debug.JustUpdateDeviceLine();
x2tilemap.__c.runVoidMethod ("LogImpl","915466552",RemoteObject.createImmutable("Both 'graphic name' and 'graphic file' are set. 'graphic name' is ignored."),0);
 };
 BA.debugLineNum = 231;BA.debugLine="GraphicName = LoadGraphicForShape(template.Fixtu";
Debug.JustUpdateDeviceLine();
_graphicname = __ref.runClassMethod (b4a.example.x2tilemap.class, "_loadgraphicforshape" /*RemoteObject*/ ,(Object)(_template.getField(false,"FixtureDef" /*RemoteObject*/ ).runMethod(false,"getShape")),(Object)(_graphicfile),(Object)(_template));Debug.locals.put("GraphicName", _graphicname);
 BA.debugLineNum = 233;BA.debugLine="template.CustomProps.Put(\"graphic name\", Graphic";
Debug.JustUpdateDeviceLine();
_template.getField(false,"CustomProps" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("graphic name"))),(Object)((_graphicname)));
 };
 BA.debugLineNum = 235;BA.debugLine="template.FixtureDef.Density = GetCustomProperty(t";
Debug.JustUpdateDeviceLine();
_template.getField(false,"FixtureDef" /*RemoteObject*/ ).runMethod(true,"setDensity",BA.numberCast(float.class, __ref.runClassMethod (b4a.example.x2tilemap.class, "_getcustomproperty" /*RemoteObject*/ ,(Object)(_template),(Object)(RemoteObject.createImmutable("density")))));
 BA.debugLineNum = 236;BA.debugLine="template.FixtureDef.SetFilterBits(GetCustomProper";
Debug.JustUpdateDeviceLine();
_template.getField(false,"FixtureDef" /*RemoteObject*/ ).runVoidMethod ("SetFilterBits",(Object)(BA.numberCast(int.class, __ref.runClassMethod (b4a.example.x2tilemap.class, "_getcustomproperty" /*RemoteObject*/ ,(Object)(_template),(Object)(RemoteObject.createImmutable("category bits"))))),(Object)(BA.numberCast(int.class, __ref.runClassMethod (b4a.example.x2tilemap.class, "_getcustomproperty" /*RemoteObject*/ ,(Object)(_template),(Object)(RemoteObject.createImmutable("mask bits"))))));
 BA.debugLineNum = 237;BA.debugLine="template.FixtureDef.Friction = GetCustomProperty(";
Debug.JustUpdateDeviceLine();
_template.getField(false,"FixtureDef" /*RemoteObject*/ ).runMethod(true,"setFriction",BA.numberCast(float.class, __ref.runClassMethod (b4a.example.x2tilemap.class, "_getcustomproperty" /*RemoteObject*/ ,(Object)(_template),(Object)(RemoteObject.createImmutable("friction")))));
 BA.debugLineNum = 238;BA.debugLine="template.FixtureDef.IsSensor = GetCustomProperty(";
Debug.JustUpdateDeviceLine();
_template.getField(false,"FixtureDef" /*RemoteObject*/ ).runMethod(true,"setIsSensor",BA.ObjectToBoolean(__ref.runClassMethod (b4a.example.x2tilemap.class, "_getcustomproperty" /*RemoteObject*/ ,(Object)(_template),(Object)(RemoteObject.createImmutable("is sensor")))));
 BA.debugLineNum = 239;BA.debugLine="template.FixtureDef.Restitution = GetCustomProper";
Debug.JustUpdateDeviceLine();
_template.getField(false,"FixtureDef" /*RemoteObject*/ ).runMethod(true,"setRestitution",BA.numberCast(float.class, __ref.runClassMethod (b4a.example.x2tilemap.class, "_getcustomproperty" /*RemoteObject*/ ,(Object)(_template),(Object)(RemoteObject.createImmutable("restitution")))));
 BA.debugLineNum = 240;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createobject(RemoteObject __ref,RemoteObject _template) throws Exception{
try {
		Debug.PushSubsStack("CreateObject (x2tilemap) ","x2tilemap",20,__ref.getField(false, "ba"),__ref,327);
if (RapidSub.canDelegate("createobject")) { return __ref.runUserSub(false, "x2tilemap","createobject", __ref, _template);}
RemoteObject _sourcetemplate = RemoteObject.declareNull("b4a.example.x2tilemap._x2tileobjecttemplate");
RemoteObject _copyid = RemoteObject.createImmutable(0);
RemoteObject _bw = RemoteObject.declareNull("b4a.example.x2bodywrapper");
Debug.locals.put("Template", _template);
 BA.debugLineNum = 327;BA.debugLine="Public Sub CreateObject (Template As X2TileObjectT";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 328;BA.debugLine="Template.FirstTime = False";
Debug.JustUpdateDeviceLine();
_template.setField ("FirstTime" /*RemoteObject*/ ,x2tilemap.__c.getField(true,"False"));
 BA.debugLineNum = 329;BA.debugLine="Dim SourceTemplate As X2TileObjectTemplate = Temp";
Debug.JustUpdateDeviceLine();
_sourcetemplate = _template;Debug.locals.put("SourceTemplate", _sourcetemplate);Debug.locals.put("SourceTemplate", _sourcetemplate);
 BA.debugLineNum = 330;BA.debugLine="Dim CopyId As Int = GetCustomProperty(Template, \"";
Debug.JustUpdateDeviceLine();
_copyid = BA.numberCast(int.class, __ref.runClassMethod (b4a.example.x2tilemap.class, "_getcustomproperty" /*RemoteObject*/ ,(Object)(_template),(Object)(RemoteObject.createImmutable("copy from id"))));Debug.locals.put("CopyId", _copyid);Debug.locals.put("CopyId", _copyid);
 BA.debugLineNum = 331;BA.debugLine="If CopyId > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_copyid,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 332;BA.debugLine="SourceTemplate = Template.ObjectLayer.ObjectsByI";
Debug.JustUpdateDeviceLine();
_sourcetemplate = (_template.getField(false,"ObjectLayer" /*RemoteObject*/ ).getField(false,"ObjectsById" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_copyid))));Debug.locals.put("SourceTemplate", _sourcetemplate);
 BA.debugLineNum = 333;BA.debugLine="SourceTemplate.BodyDef.Position = Template.Posit";
Debug.JustUpdateDeviceLine();
_sourcetemplate.getField(false,"BodyDef" /*RemoteObject*/ ).runMethod(false,"setPosition",_template.getField(false,"Position" /*RemoteObject*/ ));
 };
 BA.debugLineNum = 335;BA.debugLine="Dim bw As X2BodyWrapper = X2.CreateBodyAndWrapper";
Debug.JustUpdateDeviceLine();
_bw = __ref.getField(false,"_x2" /*RemoteObject*/ ).runClassMethod (b4a.example.x2utils.class, "_createbodyandwrapper" /*RemoteObject*/ ,(Object)(_sourcetemplate.getField(false,"BodyDef" /*RemoteObject*/ )),(Object)(x2tilemap.__c.getField(false,"Null")),(Object)(_template.getField(true,"Name" /*RemoteObject*/ )));Debug.locals.put("bw", _bw);Debug.locals.put("bw", _bw);
 BA.debugLineNum = 336;BA.debugLine="bw.GraphicName = GetCustomProperty(SourceTemplate";
Debug.JustUpdateDeviceLine();
_bw.runClassMethod (b4a.example.x2bodywrapper.class, "_setgraphicname" /*RemoteObject*/ ,BA.ObjectToString(__ref.runClassMethod (b4a.example.x2tilemap.class, "_getcustomproperty" /*RemoteObject*/ ,(Object)(_sourcetemplate),(Object)(RemoteObject.createImmutable("graphic name")))));
 BA.debugLineNum = 337;BA.debugLine="bw.DestroyIfInvisible = GetCustomProperty(SourceT";
Debug.JustUpdateDeviceLine();
_bw.setField ("_destroyifinvisible" /*RemoteObject*/ ,BA.ObjectToBoolean(__ref.runClassMethod (b4a.example.x2tilemap.class, "_getcustomproperty" /*RemoteObject*/ ,(Object)(_sourcetemplate),(Object)(RemoteObject.createImmutable("destroy if invisible")))));
 BA.debugLineNum = 338;BA.debugLine="bw.SwitchFrameIntervalMs = GetCustomProperty(Sour";
Debug.JustUpdateDeviceLine();
_bw.setField ("_switchframeintervalms" /*RemoteObject*/ ,BA.numberCast(int.class, __ref.runClassMethod (b4a.example.x2tilemap.class, "_getcustomproperty" /*RemoteObject*/ ,(Object)(_sourcetemplate),(Object)(RemoteObject.createImmutable("switch frame interval (ms)")))));
 BA.debugLineNum = 339;BA.debugLine="bw.TimeToLiveMs = GetCustomProperty(SourceTemplat";
Debug.JustUpdateDeviceLine();
_bw.setField ("_timetolivems" /*RemoteObject*/ ,BA.numberCast(float.class, __ref.runClassMethod (b4a.example.x2tilemap.class, "_getcustomproperty" /*RemoteObject*/ ,(Object)(_sourcetemplate),(Object)(RemoteObject.createImmutable("time to live (ms)")))));
 BA.debugLineNum = 340;BA.debugLine="bw.TickIfInvisible = GetCustomProperty(SourceTemp";
Debug.JustUpdateDeviceLine();
_bw.setField ("_tickifinvisible" /*RemoteObject*/ ,BA.ObjectToBoolean(__ref.runClassMethod (b4a.example.x2tilemap.class, "_getcustomproperty" /*RemoteObject*/ ,(Object)(_sourcetemplate),(Object)(RemoteObject.createImmutable("tick if invisible")))));
 BA.debugLineNum = 341;BA.debugLine="bw.Id = Template.Id";
Debug.JustUpdateDeviceLine();
_bw.setField ("_id" /*RemoteObject*/ ,_template.getField(true,"Id" /*RemoteObject*/ ));
 BA.debugLineNum = 342;BA.debugLine="bw.DrawFirst = GetCustomProperty(SourceTemplate,";
Debug.JustUpdateDeviceLine();
_bw.setField ("_drawfirst" /*RemoteObject*/ ,BA.ObjectToBoolean(__ref.runClassMethod (b4a.example.x2tilemap.class, "_getcustomproperty" /*RemoteObject*/ ,(Object)(_sourcetemplate),(Object)(RemoteObject.createImmutable("draw first")))));
 BA.debugLineNum = 343;BA.debugLine="bw.DrawLast = GetCustomProperty(SourceTemplate, \"";
Debug.JustUpdateDeviceLine();
_bw.setField ("_drawlast" /*RemoteObject*/ ,BA.ObjectToBoolean(__ref.runClassMethod (b4a.example.x2tilemap.class, "_getcustomproperty" /*RemoteObject*/ ,(Object)(_sourcetemplate),(Object)(RemoteObject.createImmutable("draw last")))));
 BA.debugLineNum = 344;BA.debugLine="bw.Tag = Template.Tag";
Debug.JustUpdateDeviceLine();
_bw.setField ("_tag" /*RemoteObject*/ ,(_template.getField(true,"Tag" /*RemoteObject*/ )));
 BA.debugLineNum = 345;BA.debugLine="bw.TemplateCustomProperties = Template.CustomProp";
Debug.JustUpdateDeviceLine();
_bw.setField ("_templatecustomproperties" /*RemoteObject*/ ,_template.getField(false,"CustomProps" /*RemoteObject*/ ));
 BA.debugLineNum = 346;BA.debugLine="If SourceTemplate.FixtureDef.Shape.IsInitialized";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_sourcetemplate.getField(false,"FixtureDef" /*RemoteObject*/ ).runMethod(false,"getShape").runMethod(true,"IsInitialized"),x2tilemap.__c.getField(true,"False"))) { 
 BA.debugLineNum = 347;BA.debugLine="Log(\"ERROR: Shape is not initialized. Make sure";
Debug.JustUpdateDeviceLine();
x2tilemap.__c.runVoidMethod ("LogImpl","915925268",RemoteObject.createImmutable("ERROR: Shape is not initialized. Make sure to call PrepareObjectsDef."),0);
 };
 BA.debugLineNum = 349;BA.debugLine="bw.Body.CreateFixture(SourceTemplate.FixtureDef)";
Debug.JustUpdateDeviceLine();
_bw.getField(false,"_body" /*RemoteObject*/ ).runVoidMethod ("CreateFixture",(Object)(_sourcetemplate.getField(false,"FixtureDef" /*RemoteObject*/ )));
 BA.debugLineNum = 350;BA.debugLine="Return bw";
Debug.JustUpdateDeviceLine();
if (true) return _bw;
 BA.debugLineNum = 351;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createobject2(RemoteObject __ref,RemoteObject _objectlayer,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("CreateObject2 (x2tilemap) ","x2tilemap",20,__ref.getField(false, "ba"),__ref,354);
if (RapidSub.canDelegate("createobject2")) { return __ref.runUserSub(false, "x2tilemap","createobject2", __ref, _objectlayer, _id);}
Debug.locals.put("ObjectLayer", _objectlayer);
Debug.locals.put("Id", _id);
 BA.debugLineNum = 354;BA.debugLine="Public Sub CreateObject2 (ObjectLayer As String, I";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 355;BA.debugLine="Return CreateObject(GetObjectTemplate(ObjectLayer";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4a.example.x2tilemap.class, "_createobject" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4a.example.x2tilemap.class, "_getobjecttemplate" /*RemoteObject*/ ,(Object)(_objectlayer),(Object)(_id))));
 BA.debugLineNum = 356;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createobject2byname(RemoteObject __ref,RemoteObject _objectlayer,RemoteObject _name) throws Exception{
try {
		Debug.PushSubsStack("CreateObject2ByName (x2tilemap) ","x2tilemap",20,__ref.getField(false, "ba"),__ref,359);
if (RapidSub.canDelegate("createobject2byname")) { return __ref.runUserSub(false, "x2tilemap","createobject2byname", __ref, _objectlayer, _name);}
Debug.locals.put("ObjectLayer", _objectlayer);
Debug.locals.put("Name", _name);
 BA.debugLineNum = 359;BA.debugLine="Public Sub CreateObject2ByName (ObjectLayer As Str";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 360;BA.debugLine="Return CreateObject(GetObjectTemplateByName(Objec";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4a.example.x2tilemap.class, "_createobject" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4a.example.x2tilemap.class, "_getobjecttemplatebyname" /*RemoteObject*/ ,(Object)(_objectlayer),(Object)(_name))));
 BA.debugLineNum = 361;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _draw(RemoteObject __ref,RemoteObject _layersnames,RemoteObject _drawaabb,RemoteObject _tasks) throws Exception{
try {
		Debug.PushSubsStack("Draw (x2tilemap) ","x2tilemap",20,__ref.getField(false, "ba"),__ref,518);
if (RapidSub.canDelegate("draw")) { return __ref.runUserSub(false, "x2tilemap","draw", __ref, _layersnames, _drawaabb, _tasks);}
RemoteObject _drawrect = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
RemoteObject _targetbc = RemoteObject.declareNull("b4a.example.bitmapcreator");
RemoteObject _backgroundtask = RemoteObject.declareNull("b4a.example.bitmapcreator._drawtask");
RemoteObject _startleftpixels = RemoteObject.createImmutable(0);
RemoteObject _starttoppixels = RemoteObject.createImmutable(0);
RemoteObject _starttilex = RemoteObject.createImmutable(0);
RemoteObject _endtilex = RemoteObject.createImmutable(0);
RemoteObject _starttiley = RemoteObject.createImmutable(0);
RemoteObject _endtiley = RemoteObject.createImmutable(0);
RemoteObject _drewprevious = RemoteObject.createImmutable(false);
RemoteObject _layername = RemoteObject.createImmutable("");
RemoteObject _layer = RemoteObject.declareNull("b4a.example.x2tilemap._x2internaltilelayer");
int _y = 0;
RemoteObject _movingleftpixels = RemoteObject.createImmutable(0);
RemoteObject _movingtoppixels = RemoteObject.createImmutable(0);
RemoteObject _testreuse = RemoteObject.createImmutable(false);
int _x = 0;
RemoteObject _t = RemoteObject.declareNull("b4a.example.x2tilemap._x2tile");
RemoteObject _dt = RemoteObject.declareNull("b4a.example.bitmapcreator._drawtask");
Debug.locals.put("LayersNames", _layersnames);
Debug.locals.put("DrawAABB", _drawaabb);
Debug.locals.put("Tasks", _tasks);
 BA.debugLineNum = 518;BA.debugLine="Public Sub Draw (LayersNames As List, DrawAABB As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 519;BA.debugLine="Dim DrawRect As B4XRect";
Debug.JustUpdateDeviceLine();
_drawrect = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");Debug.locals.put("DrawRect", _drawrect);
 BA.debugLineNum = 520;BA.debugLine="DrawRect.Initialize(Round(DrawAABB.BottomLeft.X *";
Debug.JustUpdateDeviceLine();
_drawrect.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, x2tilemap.__c.runMethod(true,"Round",(Object)(RemoteObject.solve(new RemoteObject[] {_drawaabb.runMethod(false,"getBottomLeft").runMethod(true,"getX"),__ref.getField(true,"_meterstopixelsx" /*RemoteObject*/ )}, "*",0, 0))))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_maprectpixels" /*RemoteObject*/ ).runMethod(true,"getBottom"),x2tilemap.__c.runMethod(true,"Round",(Object)(RemoteObject.solve(new RemoteObject[] {_drawaabb.runMethod(false,"getTopRight").runMethod(true,"getY"),__ref.getField(true,"_meterstopixelsy" /*RemoteObject*/ )}, "*",0, 0)))}, "-",1, 0))),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 521;BA.debugLine="TargetViewBCIndex = (TargetViewBCIndex + 1) Mod 2";
Debug.JustUpdateDeviceLine();
__ref.setField ("_targetviewbcindex" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_targetviewbcindex" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1)),RemoteObject.createImmutable(2)}, "%",0, 1));
 BA.debugLineNum = 522;BA.debugLine="Dim TargetBC As BitmapCreator = TargetViewBC(Targ";
Debug.JustUpdateDeviceLine();
_targetbc = __ref.getField(false,"_targetviewbc" /*RemoteObject*/ ).getArrayElement(false,__ref.getField(true,"_targetviewbcindex" /*RemoteObject*/ ));Debug.locals.put("TargetBC", _targetbc);Debug.locals.put("TargetBC", _targetbc);
 BA.debugLineNum = 523;BA.debugLine="If TargetBC.IsInitialized = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_targetbc.runMethod(true,"IsInitialized"),x2tilemap.__c.getField(true,"False"))) { 
 BA.debugLineNum = 524;BA.debugLine="TargetBC.Initialize(X2.MainBC.mWidth, X2.MainBC.";
Debug.JustUpdateDeviceLine();
_targetbc.runVoidMethod ("_initialize",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_x2" /*RemoteObject*/ ).getField(false,"_mainbc" /*RemoteObject*/ ).getField(true,"_mwidth")),(Object)(__ref.getField(false,"_x2" /*RemoteObject*/ ).getField(false,"_mainbc" /*RemoteObject*/ ).getField(true,"_mheight")));
 };
 BA.debugLineNum = 526;BA.debugLine="DrawRect.Width = TargetBC.mWidth";
Debug.JustUpdateDeviceLine();
_drawrect.runMethod(true,"setWidth",BA.numberCast(float.class, _targetbc.getField(true,"_mwidth")));
 BA.debugLineNum = 527;BA.debugLine="DrawRect.Height = TargetBC.mHeight";
Debug.JustUpdateDeviceLine();
_drawrect.runMethod(true,"setHeight",BA.numberCast(float.class, _targetbc.getField(true,"_mheight")));
 BA.debugLineNum = 528;BA.debugLine="Dim backgroundtask As DrawTask = TargetViewBC(Tar";
Debug.JustUpdateDeviceLine();
_backgroundtask = __ref.getField(false,"_targetviewbc" /*RemoteObject*/ ).getArrayElement(false,__ref.getField(true,"_targetviewbcindex" /*RemoteObject*/ )).runMethod(false,"_createdrawtask",(Object)((__ref.getField(false,"_backgroundcolorbc" /*RemoteObject*/ ))),(Object)(__ref.getField(false,"_backgroundcolorbc" /*RemoteObject*/ ).getField(false,"_targetrect")),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(x2tilemap.__c.getField(true,"True")));Debug.locals.put("backgroundtask", _backgroundtask);Debug.locals.put("backgroundtask", _backgroundtask);
 BA.debugLineNum = 529;BA.debugLine="backgroundtask.TargetBC = TargetViewBC(TargetView";
Debug.JustUpdateDeviceLine();
_backgroundtask.setField ("TargetBC",__ref.getField(false,"_targetviewbc" /*RemoteObject*/ ).getArrayElement(false,__ref.getField(true,"_targetviewbcindex" /*RemoteObject*/ )));
 BA.debugLineNum = 530;BA.debugLine="Tasks.Add(backgroundtask)";
Debug.JustUpdateDeviceLine();
_tasks.runVoidMethod ("Add",(Object)((_backgroundtask)));
 BA.debugLineNum = 531;BA.debugLine="Dim StartLeftPixels As Int = DrawRect.Left";
Debug.JustUpdateDeviceLine();
_startleftpixels = BA.numberCast(int.class, _drawrect.runMethod(true,"getLeft"));Debug.locals.put("StartLeftPixels", _startleftpixels);Debug.locals.put("StartLeftPixels", _startleftpixels);
 BA.debugLineNum = 532;BA.debugLine="StartLeftPixels = - (StartLeftPixels Mod TileWidt";
Debug.JustUpdateDeviceLine();
_startleftpixels = BA.numberCast(int.class, -(double) (0 + (RemoteObject.solve(new RemoteObject[] {_startleftpixels,__ref.getField(true,"_tilewidthpixels" /*RemoteObject*/ )}, "%",0, 1)).<Integer>get().intValue()));Debug.locals.put("StartLeftPixels", _startleftpixels);
 BA.debugLineNum = 533;BA.debugLine="Dim StartTopPixels As Int = DrawRect.Top";
Debug.JustUpdateDeviceLine();
_starttoppixels = BA.numberCast(int.class, _drawrect.runMethod(true,"getTop"));Debug.locals.put("StartTopPixels", _starttoppixels);Debug.locals.put("StartTopPixels", _starttoppixels);
 BA.debugLineNum = 534;BA.debugLine="StartTopPixels =  - (StartTopPixels Mod TileHeigh";
Debug.JustUpdateDeviceLine();
_starttoppixels = BA.numberCast(int.class, -(double) (0 + (RemoteObject.solve(new RemoteObject[] {_starttoppixels,__ref.getField(true,"_tileheightpixels" /*RemoteObject*/ )}, "%",0, 1)).<Integer>get().intValue()));Debug.locals.put("StartTopPixels", _starttoppixels);
 BA.debugLineNum = 535;BA.debugLine="Dim StartTileX As Int =  DrawRect.Left / TileWidt";
Debug.JustUpdateDeviceLine();
_starttilex = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_drawrect.runMethod(true,"getLeft"),__ref.getField(true,"_tilewidthpixels" /*RemoteObject*/ )}, "/",0, 0));Debug.locals.put("StartTileX", _starttilex);Debug.locals.put("StartTileX", _starttilex);
 BA.debugLineNum = 536;BA.debugLine="Dim EndTileX As Int = DrawRect.Right / TileWidthP";
Debug.JustUpdateDeviceLine();
_endtilex = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_drawrect.runMethod(true,"getRight"),__ref.getField(true,"_tilewidthpixels" /*RemoteObject*/ )}, "/",0, 0));Debug.locals.put("EndTileX", _endtilex);Debug.locals.put("EndTileX", _endtilex);
 BA.debugLineNum = 537;BA.debugLine="Dim StartTileY As Int = DrawRect.Top / TileHeight";
Debug.JustUpdateDeviceLine();
_starttiley = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_drawrect.runMethod(true,"getTop"),__ref.getField(true,"_tileheightpixels" /*RemoteObject*/ )}, "/",0, 0));Debug.locals.put("StartTileY", _starttiley);Debug.locals.put("StartTileY", _starttiley);
 BA.debugLineNum = 538;BA.debugLine="Dim EndTileY As Int = DrawRect.Bottom / TileHeigh";
Debug.JustUpdateDeviceLine();
_endtiley = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_drawrect.runMethod(true,"getBottom"),__ref.getField(true,"_tileheightpixels" /*RemoteObject*/ )}, "/",0, 0));Debug.locals.put("EndTileY", _endtiley);Debug.locals.put("EndTileY", _endtiley);
 BA.debugLineNum = 539;BA.debugLine="If ReuseScreenCenter.Equals(LastDrawnScreenComple";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_reusescreencenter" /*RemoteObject*/ ).runMethod(true,"Equals",(Object)(__ref.getField(false,"_lastdrawnscreencompleted" /*RemoteObject*/ ))),x2tilemap.__c.getField(true,"False"))) { 
 BA.debugLineNum = 540;BA.debugLine="ReuseTilesRect.Bottom = -1";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_reusetilesrect" /*RemoteObject*/ ).runMethod(true,"setBottom",BA.numberCast(float.class, -(double) (0 + 1)));
 };
 BA.debugLineNum = 542;BA.debugLine="Dim DrewPrevious As Boolean";
Debug.JustUpdateDeviceLine();
_drewprevious = RemoteObject.createImmutable(false);Debug.locals.put("DrewPrevious", _drewprevious);
 BA.debugLineNum = 543;BA.debugLine="For Each LayerName As String In LayersNames";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group25 = _layersnames;
final int groupLen25 = group25.runMethod(true,"getSize").<Integer>get()
;int index25 = 0;
;
for (; index25 < groupLen25;index25++){
_layername = BA.ObjectToString(group25.runMethod(false,"Get",index25));Debug.locals.put("LayerName", _layername);
Debug.locals.put("LayerName", _layername);
 BA.debugLineNum = 544;BA.debugLine="Dim Layer As X2InternalTileLayer = Layers.Get(La";
Debug.JustUpdateDeviceLine();
_layer = (__ref.getField(false,"_layers" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_layername))));Debug.locals.put("Layer", _layer);Debug.locals.put("Layer", _layer);
 BA.debugLineNum = 545;BA.debugLine="For y = StartTileY To EndTileY";
Debug.JustUpdateDeviceLine();
{
final int step27 = 1;
final int limit27 = _endtiley.<Integer>get().intValue();
_y = _starttiley.<Integer>get().intValue() ;
for (;(step27 > 0 && _y <= limit27) || (step27 < 0 && _y >= limit27) ;_y = ((int)(0 + _y + step27))  ) {
Debug.locals.put("y", _y);
 BA.debugLineNum = 546;BA.debugLine="Dim MovingLeftPixels As Int = StartLeftPixels";
Debug.JustUpdateDeviceLine();
_movingleftpixels = _startleftpixels;Debug.locals.put("MovingLeftPixels", _movingleftpixels);Debug.locals.put("MovingLeftPixels", _movingleftpixels);
 BA.debugLineNum = 547;BA.debugLine="Dim MovingTopPixels As Int = StartTopPixels + (";
Debug.JustUpdateDeviceLine();
_movingtoppixels = RemoteObject.solve(new RemoteObject[] {_starttoppixels,(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_y),_starttiley}, "-",1, 1)),__ref.getField(true,"_tileheightpixels" /*RemoteObject*/ )}, "+*",1, 1);Debug.locals.put("MovingTopPixels", _movingtoppixels);Debug.locals.put("MovingTopPixels", _movingtoppixels);
 BA.debugLineNum = 548;BA.debugLine="Dim TestReuse As Boolean = y >= ReuseTilesRect.";
Debug.JustUpdateDeviceLine();
_testreuse = BA.ObjectToBoolean(RemoteObject.solveBoolean("g",RemoteObject.createImmutable(_y),BA.numberCast(double.class, __ref.getField(false,"_reusetilesrect" /*RemoteObject*/ ).runMethod(true,"getTop"))) && RemoteObject.solveBoolean("k",RemoteObject.createImmutable(_y),BA.numberCast(double.class, __ref.getField(false,"_reusetilesrect" /*RemoteObject*/ ).runMethod(true,"getBottom"))));Debug.locals.put("TestReuse", _testreuse);Debug.locals.put("TestReuse", _testreuse);
 BA.debugLineNum = 549;BA.debugLine="For x = StartTileX To EndTileX";
Debug.JustUpdateDeviceLine();
{
final int step31 = 1;
final int limit31 = _endtilex.<Integer>get().intValue();
_x = _starttilex.<Integer>get().intValue() ;
for (;(step31 > 0 && _x <= limit31) || (step31 < 0 && _x >= limit31) ;_x = ((int)(0 + _x + step31))  ) {
Debug.locals.put("x", _x);
 BA.debugLineNum = 550;BA.debugLine="If TestReuse And x >= ReuseTilesRect.Left And";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",_testreuse) && RemoteObject.solveBoolean("g",RemoteObject.createImmutable(_x),BA.numberCast(double.class, __ref.getField(false,"_reusetilesrect" /*RemoteObject*/ ).runMethod(true,"getLeft"))) && RemoteObject.solveBoolean("<",RemoteObject.createImmutable(_x),RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_reusetilesrect" /*RemoteObject*/ ).runMethod(true,"getRight"),RemoteObject.createImmutable(1)}, "-",1, 0))) { 
 BA.debugLineNum = 551;BA.debugLine="If DrewPrevious = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_drewprevious,x2tilemap.__c.getField(true,"False"))) { 
 BA.debugLineNum = 552;BA.debugLine="DrewPrevious = True";
Debug.JustUpdateDeviceLine();
_drewprevious = x2tilemap.__c.getField(true,"True");Debug.locals.put("DrewPrevious", _drewprevious);
 BA.debugLineNum = 553;BA.debugLine="DrawPrevious(x, y, MovingLeftPixels, MovingT";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.x2tilemap.class, "_drawprevious" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _x)),(Object)(BA.numberCast(int.class, _y)),(Object)(_movingleftpixels),(Object)(_movingtoppixels),(Object)(_targetbc),(Object)(_tasks));
 };
 BA.debugLineNum = 555;BA.debugLine="x = ReuseTilesRect.Right";
Debug.JustUpdateDeviceLine();
_x = (int) (0 + __ref.getField(false,"_reusetilesrect" /*RemoteObject*/ ).runMethod(true,"getRight").<Float>get().floatValue());Debug.locals.put("x", _x);
 BA.debugLineNum = 556;BA.debugLine="MovingLeftPixels = StartLeftPixels + TileWidt";
Debug.JustUpdateDeviceLine();
_movingleftpixels = RemoteObject.solve(new RemoteObject[] {_startleftpixels,__ref.getField(true,"_tilewidthpixels" /*RemoteObject*/ ),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_x),_starttilex,RemoteObject.createImmutable(1)}, "-+",2, 1))}, "+*",1, 1);Debug.locals.put("MovingLeftPixels", _movingleftpixels);
 BA.debugLineNum = 557;BA.debugLine="Continue";
Debug.JustUpdateDeviceLine();
if (true) continue;
 }else 
{ BA.debugLineNum = 558;BA.debugLine="Else If x >= 0 And x < TilesPerRow And y >= 0";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("g",RemoteObject.createImmutable(_x),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("<",RemoteObject.createImmutable(_x),BA.numberCast(double.class, __ref.getField(true,"_tilesperrow" /*RemoteObject*/ ))) && RemoteObject.solveBoolean("g",RemoteObject.createImmutable(_y),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("<",RemoteObject.createImmutable(_y),BA.numberCast(double.class, __ref.getField(true,"_tilespercolumn" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 559;BA.debugLine="Dim t As X2Tile = GetTileFromTileLayer(x, y,";
Debug.JustUpdateDeviceLine();
_t = __ref.runClassMethod (b4a.example.x2tilemap.class, "_gettilefromtilelayer" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _x)),(Object)(BA.numberCast(int.class, _y)),(Object)(_layer));Debug.locals.put("t", _t);Debug.locals.put("t", _t);
 BA.debugLineNum = 560;BA.debugLine="If t <> Null Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",_t)) { 
 BA.debugLineNum = 561;BA.debugLine="Dim dt As DrawTask = TargetBC.CreateDrawTask";
Debug.JustUpdateDeviceLine();
_dt = _targetbc.runMethod(false,"_createdrawtask",(Object)((_t.getField(false,"CBC" /*RemoteObject*/ ))),(Object)(_t.getField(false,"CBC" /*RemoteObject*/ ).getField(false,"TargetRect")),(Object)(_movingleftpixels),(Object)(_movingtoppixels),(Object)(x2tilemap.__c.getField(true,"True")));Debug.locals.put("dt", _dt);Debug.locals.put("dt", _dt);
 BA.debugLineNum = 562;BA.debugLine="dt.IsCompressedSource = True";
Debug.JustUpdateDeviceLine();
_dt.setField ("IsCompressedSource",x2tilemap.__c.getField(true,"True"));
 BA.debugLineNum = 563;BA.debugLine="dt.TargetBC = TargetBC";
Debug.JustUpdateDeviceLine();
_dt.setField ("TargetBC",_targetbc);
 BA.debugLineNum = 564;BA.debugLine="Tasks.Add(dt)";
Debug.JustUpdateDeviceLine();
_tasks.runVoidMethod ("Add",(Object)((_dt)));
 };
 }}
;
 BA.debugLineNum = 567;BA.debugLine="MovingLeftPixels = MovingLeftPixels + TileWidt";
Debug.JustUpdateDeviceLine();
_movingleftpixels = RemoteObject.solve(new RemoteObject[] {_movingleftpixels,__ref.getField(true,"_tilewidthpixels" /*RemoteObject*/ )}, "+",1, 1);Debug.locals.put("MovingLeftPixels", _movingleftpixels);
 }
}Debug.locals.put("x", _x);
;
 }
}Debug.locals.put("y", _y);
;
 }
}Debug.locals.put("LayerName", _layername);
;
 BA.debugLineNum = 571;BA.debugLine="If EndTileY - StartTileY > 3 And EndTileX - Start";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",RemoteObject.solve(new RemoteObject[] {_endtiley,_starttiley}, "-",1, 1),BA.numberCast(double.class, 3)) && RemoteObject.solveBoolean(">",RemoteObject.solve(new RemoteObject[] {_endtilex,_starttilex}, "-",1, 1),BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 572;BA.debugLine="ReuseTileLeft = StartLeftPixels + TileWidthPixel";
Debug.JustUpdateDeviceLine();
__ref.setField ("_reusetileleft" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {_startleftpixels,__ref.getField(true,"_tilewidthpixels" /*RemoteObject*/ )}, "+",1, 1));
 BA.debugLineNum = 573;BA.debugLine="ReuseTileTop = StartTopPixels + TileHeightPixels";
Debug.JustUpdateDeviceLine();
__ref.setField ("_reusetiletop" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {_starttoppixels,__ref.getField(true,"_tileheightpixels" /*RemoteObject*/ )}, "+",1, 1));
 BA.debugLineNum = 574;BA.debugLine="ReuseTilesRect.Initialize(StartTileX + 1, StartT";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_reusetilesrect" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_starttilex,RemoteObject.createImmutable(1)}, "+",1, 1))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_starttiley,RemoteObject.createImmutable(1)}, "+",1, 1))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_endtilex,RemoteObject.createImmutable(1)}, "-",1, 1))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_endtiley,RemoteObject.createImmutable(1)}, "-",1, 1))));
 BA.debugLineNum = 575;BA.debugLine="ReuseScreenCenter = LastDrawnScreenCenterStarted";
Debug.JustUpdateDeviceLine();
__ref.setField ("_reusescreencenter" /*RemoteObject*/ ,__ref.getField(false,"_lastdrawnscreencenterstarted" /*RemoteObject*/ ).runMethod(false,"CreateCopy"));
 }else {
 BA.debugLineNum = 577;BA.debugLine="ReuseTilesRect.Initialize(-1, -1, -1, -1)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_reusetilesrect" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, -(double) (0 + 1))),(Object)(BA.numberCast(float.class, -(double) (0 + 1))),(Object)(BA.numberCast(float.class, -(double) (0 + 1))),(Object)(BA.numberCast(float.class, -(double) (0 + 1))));
 };
 BA.debugLineNum = 579;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawingcomplete(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DrawingComplete (x2tilemap) ","x2tilemap",20,__ref.getField(false, "ba"),__ref,496);
if (RapidSub.canDelegate("drawingcomplete")) { return __ref.runUserSub(false, "x2tilemap","drawingcomplete", __ref);}
 BA.debugLineNum = 496;BA.debugLine="Public Sub DrawingComplete";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 497;BA.debugLine="If TargetViewBC(TargetViewBCIndex).IsInitialized";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_targetviewbc" /*RemoteObject*/ ).getArrayElement(false,__ref.getField(true,"_targetviewbcindex" /*RemoteObject*/ )).runMethod(true,"IsInitialized"),x2tilemap.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 498;BA.debugLine="If LastDrawnScreenCompleted.Equals(LastDrawnScree";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_lastdrawnscreencompleted" /*RemoteObject*/ ).runMethod(true,"Equals",(Object)(__ref.getField(false,"_lastdrawnscreencenterstarted" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 499;BA.debugLine="LastDrawnScreenCompleted = LastDrawnScreenCenterS";
Debug.JustUpdateDeviceLine();
__ref.setField ("_lastdrawnscreencompleted" /*RemoteObject*/ ,__ref.getField(false,"_lastdrawnscreencenterstarted" /*RemoteObject*/ ).runMethod(false,"CreateCopy"));
 BA.debugLineNum = 500;BA.debugLine="X2.SetBitmapWithFitOrFill(mTargetView, TargetView";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_x2" /*RemoteObject*/ ).runClassMethod (b4a.example.x2utils.class, "_setbitmapwithfitorfill" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_mtargetview" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_targetviewbc" /*RemoteObject*/ ).getArrayElement(false,__ref.getField(true,"_targetviewbcindex" /*RemoteObject*/ )).runMethod(false,"_getbitmap")));
 BA.debugLineNum = 501;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawprevious(RemoteObject __ref,RemoteObject _x,RemoteObject _y,RemoteObject _targetleft,RemoteObject _targettop,RemoteObject _targetbc,RemoteObject _tasks) throws Exception{
try {
		Debug.PushSubsStack("DrawPrevious (x2tilemap) ","x2tilemap",20,__ref.getField(false, "ba"),__ref,581);
if (RapidSub.canDelegate("drawprevious")) { return __ref.runUserSub(false, "x2tilemap","drawprevious", __ref, _x, _y, _targetleft, _targettop, _targetbc, _tasks);}
RemoteObject _previousbc = RemoteObject.declareNull("b4a.example.bitmapcreator");
RemoteObject _dx = RemoteObject.createImmutable(0);
RemoteObject _dy = RemoteObject.createImmutable(0);
RemoteObject _rect = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
RemoteObject _dt = RemoteObject.declareNull("b4a.example.bitmapcreator._drawtask");
Debug.locals.put("x", _x);
Debug.locals.put("y", _y);
Debug.locals.put("TargetLeft", _targetleft);
Debug.locals.put("TargetTop", _targettop);
Debug.locals.put("TargetBC", _targetbc);
Debug.locals.put("Tasks", _tasks);
 BA.debugLineNum = 581;BA.debugLine="Private Sub DrawPrevious (x As Int, y As Int, Targ";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 582;BA.debugLine="Dim PreviousBC As BitmapCreator = TargetViewBC((T";
Debug.JustUpdateDeviceLine();
_previousbc = __ref.getField(false,"_targetviewbc" /*RemoteObject*/ ).getArrayElement(false,RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_targetviewbcindex" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1)),RemoteObject.createImmutable(2)}, "%",0, 1));Debug.locals.put("PreviousBC", _previousbc);Debug.locals.put("PreviousBC", _previousbc);
 BA.debugLineNum = 583;BA.debugLine="Dim dx As Int = x - ReuseTilesRect.Left";
Debug.JustUpdateDeviceLine();
_dx = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_x,__ref.getField(false,"_reusetilesrect" /*RemoteObject*/ ).runMethod(true,"getLeft")}, "-",1, 0));Debug.locals.put("dx", _dx);Debug.locals.put("dx", _dx);
 BA.debugLineNum = 584;BA.debugLine="Dim dy As Int = y - ReuseTilesRect.Top";
Debug.JustUpdateDeviceLine();
_dy = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_y,__ref.getField(false,"_reusetilesrect" /*RemoteObject*/ ).runMethod(true,"getTop")}, "-",1, 0));Debug.locals.put("dy", _dy);Debug.locals.put("dy", _dy);
 BA.debugLineNum = 586;BA.debugLine="Dim rect As B4XRect";
Debug.JustUpdateDeviceLine();
_rect = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");Debug.locals.put("rect", _rect);
 BA.debugLineNum = 587;BA.debugLine="rect.Initialize(ReuseTileLeft + dx * TileWidthPix";
Debug.JustUpdateDeviceLine();
_rect.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_reusetileleft" /*RemoteObject*/ ),_dx,__ref.getField(true,"_tilewidthpixels" /*RemoteObject*/ )}, "+*",1, 1))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_reusetiletop" /*RemoteObject*/ ),_dy,__ref.getField(true,"_tileheightpixels" /*RemoteObject*/ )}, "+*",1, 1))),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 588;BA.debugLine="rect.Width = (ReuseTilesRect.Width + 1 - dx) * Ti";
Debug.JustUpdateDeviceLine();
_rect.runMethod(true,"setWidth",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_reusetilesrect" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(1),_dx}, "+-",2, 0)),__ref.getField(true,"_tilewidthpixels" /*RemoteObject*/ )}, "*",0, 0)));
 BA.debugLineNum = 589;BA.debugLine="rect.Height = (ReuseTilesRect.Height + 1 - dy) *";
Debug.JustUpdateDeviceLine();
_rect.runMethod(true,"setHeight",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_reusetilesrect" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(1),_dy}, "+-",2, 0)),__ref.getField(true,"_tileheightpixels" /*RemoteObject*/ )}, "*",0, 0)));
 BA.debugLineNum = 591;BA.debugLine="Dim dt As DrawTask = TargetBC.CreateDrawTask(Prev";
Debug.JustUpdateDeviceLine();
_dt = _targetbc.runMethod(false,"_createdrawtask",(Object)((_previousbc)),(Object)(_rect),(Object)(_targetleft),(Object)(_targettop),(Object)(x2tilemap.__c.getField(true,"True")));Debug.locals.put("dt", _dt);Debug.locals.put("dt", _dt);
 BA.debugLineNum = 592;BA.debugLine="dt.TargetBC = TargetBC";
Debug.JustUpdateDeviceLine();
_dt.setField ("TargetBC",_targetbc);
 BA.debugLineNum = 593;BA.debugLine="Tasks.Add(dt)";
Debug.JustUpdateDeviceLine();
_tasks.runVoidMethod ("Add",(Object)((_dt)));
 BA.debugLineNum = 594;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawscreen(RemoteObject __ref,RemoteObject _layersnames,RemoteObject _tasks) throws Exception{
try {
		Debug.PushSubsStack("DrawScreen (x2tilemap) ","x2tilemap",20,__ref.getField(false, "ba"),__ref,506);
if (RapidSub.canDelegate("drawscreen")) { return __ref.runUserSub(false, "x2tilemap","drawscreen", __ref, _layersnames, _tasks);}
RemoteObject _drawcenter = RemoteObject.declareNull("anywheresoftware.b4a.objects.B2Vec2");
Debug.locals.put("LayersNames", _layersnames);
Debug.locals.put("Tasks", _tasks);
 BA.debugLineNum = 506;BA.debugLine="Public Sub DrawScreen (LayersNames As List, Tasks";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 507;BA.debugLine="If X2.gs.ShouldDraw = False Then Return False";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_x2" /*RemoteObject*/ ).getField(false,"_gs" /*RemoteObject*/ ).getField(true,"ShouldDraw" /*RemoteObject*/ ),x2tilemap.__c.getField(true,"False"))) { 
if (true) return x2tilemap.__c.getField(true,"False");};
 BA.debugLineNum = 508;BA.debugLine="Dim DrawCenter As B2Vec2 = X2.ScreenAABB.Center";
Debug.JustUpdateDeviceLine();
_drawcenter = __ref.getField(false,"_x2" /*RemoteObject*/ ).getField(false,"_screenaabb" /*RemoteObject*/ ).runMethod(false,"getCenter");Debug.locals.put("DrawCenter", _drawcenter);Debug.locals.put("DrawCenter", _drawcenter);
 BA.debugLineNum = 509;BA.debugLine="If DrawCenter.Equals(LastDrawnScreenCenterStarted";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",_drawcenter.runMethod(true,"Equals",(Object)(__ref.getField(false,"_lastdrawnscreencenterstarted" /*RemoteObject*/ )))) || RemoteObject.solveBoolean(".",_drawcenter.runMethod(true,"Equals",(Object)(__ref.getField(false,"_lastdrawnscreencompleted" /*RemoteObject*/ ))))) { 
if (true) return x2tilemap.__c.getField(true,"False");};
 BA.debugLineNum = 510;BA.debugLine="LastDrawnScreenCenterStarted = DrawCenter.CreateC";
Debug.JustUpdateDeviceLine();
__ref.setField ("_lastdrawnscreencenterstarted" /*RemoteObject*/ ,_drawcenter.runMethod(false,"CreateCopy"));
 BA.debugLineNum = 511;BA.debugLine="Draw(LayersNames, X2.ScreenAABB, Tasks)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.x2tilemap.class, "_draw" /*RemoteObject*/ ,(Object)(_layersnames),(Object)(__ref.getField(false,"_x2" /*RemoteObject*/ ).getField(false,"_screenaabb" /*RemoteObject*/ )),(Object)(_tasks));
 BA.debugLineNum = 512;BA.debugLine="Return True";
Debug.JustUpdateDeviceLine();
if (true) return x2tilemap.__c.getField(true,"True");
 BA.debugLineNum = 513;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcurrentbc(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getCurrentBC (x2tilemap) ","x2tilemap",20,__ref.getField(false, "ba"),__ref,491);
if (RapidSub.canDelegate("getcurrentbc")) { return __ref.runUserSub(false, "x2tilemap","getcurrentbc", __ref);}
 BA.debugLineNum = 491;BA.debugLine="Public Sub getCurrentBC As BitmapCreator";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 492;BA.debugLine="Return TargetViewBC(TargetViewBCIndex)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_targetviewbc" /*RemoteObject*/ ).getArrayElement(false,__ref.getField(true,"_targetviewbcindex" /*RemoteObject*/ ));
 BA.debugLineNum = 493;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcustomproperty(RemoteObject __ref,RemoteObject _template,RemoteObject _key) throws Exception{
try {
		Debug.PushSubsStack("GetCustomProperty (x2tilemap) ","x2tilemap",20,__ref.getField(false, "ba"),__ref,421);
if (RapidSub.canDelegate("getcustomproperty")) { return __ref.runUserSub(false, "x2tilemap","getcustomproperty", __ref, _template, _key);}
RemoteObject _o = RemoteObject.declareNull("Object");
RemoteObject _s = RemoteObject.createImmutable("");
Debug.locals.put("Template", _template);
Debug.locals.put("Key", _key);
 BA.debugLineNum = 421;BA.debugLine="Public Sub GetCustomProperty(Template As X2TileObj";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 422;BA.debugLine="Dim o As Object = Template.CustomProps.Get(Key)";
Debug.JustUpdateDeviceLine();
_o = _template.getField(false,"CustomProps" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_key)));Debug.locals.put("o", _o);Debug.locals.put("o", _o);
 BA.debugLineNum = 423;BA.debugLine="If o = Null Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("n",_o)) { 
 BA.debugLineNum = 424;BA.debugLine="o = DefaultCustomProperties.Get(Key)";
Debug.JustUpdateDeviceLine();
_o = __ref.getField(false,"_defaultcustomproperties" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_key)));Debug.locals.put("o", _o);
 };
 BA.debugLineNum = 426;BA.debugLine="If o = Null Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("n",_o)) { 
 BA.debugLineNum = 427;BA.debugLine="Log($\"Error: cannot find property: ${Key}\"$)";
Debug.JustUpdateDeviceLine();
x2tilemap.__c.runVoidMethod ("LogImpl","916187398",(RemoteObject.concat(RemoteObject.createImmutable("Error: cannot find property: "),x2tilemap.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_key))),RemoteObject.createImmutable(""))),0);
 };
 BA.debugLineNum = 429;BA.debugLine="If o Is String Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("i",_o, RemoteObject.createImmutable("String"))) { 
 BA.debugLineNum = 430;BA.debugLine="Dim s As String = o";
Debug.JustUpdateDeviceLine();
_s = BA.ObjectToString(_o);Debug.locals.put("s", _s);Debug.locals.put("s", _s);
 BA.debugLineNum = 431;BA.debugLine="Return s.Trim";
Debug.JustUpdateDeviceLine();
if (true) return (_s.runMethod(true,"trim"));
 };
 BA.debugLineNum = 433;BA.debugLine="Return o";
Debug.JustUpdateDeviceLine();
if (true) return _o;
 BA.debugLineNum = 434;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getobjecttemplate(RemoteObject __ref,RemoteObject _layer,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("GetObjectTemplate (x2tilemap) ","x2tilemap",20,__ref.getField(false, "ba"),__ref,307);
if (RapidSub.canDelegate("getobjecttemplate")) { return __ref.runUserSub(false, "x2tilemap","getobjecttemplate", __ref, _layer, _id);}
RemoteObject _ol = RemoteObject.declareNull("b4a.example.x2tilemap._x2objectslayer");
RemoteObject _template = RemoteObject.declareNull("b4a.example.x2tilemap._x2tileobjecttemplate");
Debug.locals.put("Layer", _layer);
Debug.locals.put("Id", _id);
 BA.debugLineNum = 307;BA.debugLine="Public Sub GetObjectTemplate (Layer As String, Id";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 308;BA.debugLine="Dim ol As X2ObjectsLayer = Layers.Get(Layer)";
Debug.JustUpdateDeviceLine();
_ol = (__ref.getField(false,"_layers" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_layer))));Debug.locals.put("ol", _ol);Debug.locals.put("ol", _ol);
 BA.debugLineNum = 309;BA.debugLine="Dim template As X2TileObjectTemplate = ol.Objects";
Debug.JustUpdateDeviceLine();
_template = (_ol.getField(false,"ObjectsById" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_id))));Debug.locals.put("template", _template);Debug.locals.put("template", _template);
 BA.debugLineNum = 310;BA.debugLine="If template = Null Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("n",_template)) { 
 BA.debugLineNum = 311;BA.debugLine="Log($\"ERROR: Template not found. Layer: ${Layer}";
Debug.JustUpdateDeviceLine();
x2tilemap.__c.runVoidMethod ("LogImpl","915794180",(RemoteObject.concat(RemoteObject.createImmutable("ERROR: Template not found. Layer: "),x2tilemap.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_layer))),RemoteObject.createImmutable(", Id: "),x2tilemap.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_id))),RemoteObject.createImmutable(""))),0);
 };
 BA.debugLineNum = 313;BA.debugLine="Return template";
Debug.JustUpdateDeviceLine();
if (true) return _template;
 BA.debugLineNum = 314;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getobjecttemplatebyname(RemoteObject __ref,RemoteObject _layer,RemoteObject _name) throws Exception{
try {
		Debug.PushSubsStack("GetObjectTemplateByName (x2tilemap) ","x2tilemap",20,__ref.getField(false, "ba"),__ref,317);
if (RapidSub.canDelegate("getobjecttemplatebyname")) { return __ref.runUserSub(false, "x2tilemap","getobjecttemplatebyname", __ref, _layer, _name);}
RemoteObject _ol = RemoteObject.declareNull("b4a.example.x2tilemap._x2objectslayer");
RemoteObject _template = RemoteObject.declareNull("b4a.example.x2tilemap._x2tileobjecttemplate");
Debug.locals.put("Layer", _layer);
Debug.locals.put("Name", _name);
 BA.debugLineNum = 317;BA.debugLine="Public Sub GetObjectTemplateByName (Layer As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 318;BA.debugLine="Dim ol As X2ObjectsLayer = Layers.Get(Layer)";
Debug.JustUpdateDeviceLine();
_ol = (__ref.getField(false,"_layers" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_layer))));Debug.locals.put("ol", _ol);Debug.locals.put("ol", _ol);
 BA.debugLineNum = 319;BA.debugLine="Dim template As X2TileObjectTemplate = ol.Objects";
Debug.JustUpdateDeviceLine();
_template = (_ol.getField(false,"ObjectsByName" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_name))));Debug.locals.put("template", _template);Debug.locals.put("template", _template);
 BA.debugLineNum = 320;BA.debugLine="If template = Null Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("n",_template)) { 
 BA.debugLineNum = 321;BA.debugLine="Log($\"ERROR: Template not found. Layer: ${Layer}";
Debug.JustUpdateDeviceLine();
x2tilemap.__c.runVoidMethod ("LogImpl","915859716",(RemoteObject.concat(RemoteObject.createImmutable("ERROR: Template not found. Layer: "),x2tilemap.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_layer))),RemoteObject.createImmutable(", Name: "),x2tilemap.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_name))),RemoteObject.createImmutable(""))),0);
 };
 BA.debugLineNum = 323;BA.debugLine="Return template";
Debug.JustUpdateDeviceLine();
if (true) return _template;
 BA.debugLineNum = 324;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettilefromtilelayer(RemoteObject __ref,RemoteObject _mapx,RemoteObject _mapy,RemoteObject _layer) throws Exception{
try {
		Debug.PushSubsStack("GetTileFromTileLayer (x2tilemap) ","x2tilemap",20,__ref.getField(false, "ba"),__ref,599);
if (RapidSub.canDelegate("gettilefromtilelayer")) { return __ref.runUserSub(false, "x2tilemap","gettilefromtilelayer", __ref, _mapx, _mapy, _layer);}
RemoteObject _tile = RemoteObject.declareNull("b4a.example.x2tilemap._x2tile");
RemoteObject _cleanidentifier = RemoteObject.createImmutable(0);
RemoteObject _ts = RemoteObject.declareNull("b4a.example.x2tilemap._x2internaltileset");
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _row = RemoteObject.createImmutable(0);
RemoteObject _col = RemoteObject.createImmutable(0);
RemoteObject _x = RemoteObject.createImmutable(0);
RemoteObject _y = RemoteObject.createImmutable(0);
RemoteObject _h = RemoteObject.createImmutable(false);
RemoteObject _v = RemoteObject.createImmutable(false);
RemoteObject _d = RemoteObject.createImmutable(false);
RemoteObject _src = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
RemoteObject _cbc = RemoteObject.declareNull("b4a.example.bitmapcreator._compressedbc");
Debug.locals.put("MapX", _mapx);
Debug.locals.put("MapY", _mapy);
Debug.locals.put("Layer", _layer);
 BA.debugLineNum = 599;BA.debugLine="Public Sub GetTileFromTileLayer (MapX As Int, MapY";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 600;BA.debugLine="Dim tile As X2Tile = Layer.Tiles(MapY * TilesPerR";
Debug.JustUpdateDeviceLine();
_tile = _layer.getField(false,"Tiles" /*RemoteObject*/ ).getArrayElement(false, /*RemoteObject*/ RemoteObject.solve(new RemoteObject[] {_mapy,__ref.getField(true,"_tilesperrow" /*RemoteObject*/ ),_mapx}, "*+",1, 1));Debug.locals.put("tile", _tile);Debug.locals.put("tile", _tile);
 BA.debugLineNum = 601;BA.debugLine="If tile.TileIdentifier = 0 Then Return Null";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_tile.getField(true,"TileIdentifier" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
if (true) return (x2tilemap.__c.getField(false,"Null"));};
 BA.debugLineNum = 602;BA.debugLine="If tile.CBC <> Null Then Return tile";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",_tile.getField(false,"CBC" /*RemoteObject*/ ))) { 
if (true) return _tile;};
 BA.debugLineNum = 603;BA.debugLine="If TilesCBC.ContainsKey(tile.TileIdentifier) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_tilescbc" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_tile.getField(true,"TileIdentifier" /*RemoteObject*/ )))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 604;BA.debugLine="tile.CBC = TilesCBC.Get(tile.TileIdentifier)";
Debug.JustUpdateDeviceLine();
_tile.setField ("CBC" /*RemoteObject*/ ,(__ref.getField(false,"_tilescbc" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_tile.getField(true,"TileIdentifier" /*RemoteObject*/ ))))));
 BA.debugLineNum = 605;BA.debugLine="Return tile";
Debug.JustUpdateDeviceLine();
if (true) return _tile;
 };
 BA.debugLineNum = 607;BA.debugLine="Dim CleanIdentifier As Int = Bit.And(0x1FFFFFFF,";
Debug.JustUpdateDeviceLine();
_cleanidentifier = x2tilemap.__c.getField(false,"Bit").runMethod(true,"And",(Object)(BA.numberCast(int.class, ((int)0x1fffffff))),(Object)(_tile.getField(true,"TileIdentifier" /*RemoteObject*/ )));Debug.locals.put("CleanIdentifier", _cleanidentifier);Debug.locals.put("CleanIdentifier", _cleanidentifier);
 BA.debugLineNum = 608;BA.debugLine="For Each ts As X2InternalTileSet In TileSets.Valu";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group9 = __ref.getField(false,"_tilesets" /*RemoteObject*/ ).runMethod(false,"Values");
final int groupLen9 = group9.runMethod(true,"getSize").<Integer>get()
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_ts = (group9.runMethod(false,"Get",index9));Debug.locals.put("ts", _ts);
Debug.locals.put("ts", _ts);
 BA.debugLineNum = 609;BA.debugLine="If ts.FirstGID <= CleanIdentifier And ts.FirstGI";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("k",_ts.getField(true,"FirstGID" /*RemoteObject*/ ),BA.numberCast(double.class, _cleanidentifier)) && RemoteObject.solveBoolean(">",RemoteObject.solve(new RemoteObject[] {_ts.getField(true,"FirstGID" /*RemoteObject*/ ),_ts.getField(true,"Count" /*RemoteObject*/ )}, "+",1, 1),BA.numberCast(double.class, _cleanidentifier))) { 
if (true) break;};
 }
}Debug.locals.put("ts", _ts);
;
 BA.debugLineNum = 611;BA.debugLine="Dim index As Int = CleanIdentifier - ts.FirstGID";
Debug.JustUpdateDeviceLine();
_index = RemoteObject.solve(new RemoteObject[] {_cleanidentifier,_ts.getField(true,"FirstGID" /*RemoteObject*/ )}, "-",1, 1);Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 612;BA.debugLine="Dim row As Int = index / ts.Columns";
Debug.JustUpdateDeviceLine();
_row = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_index,_ts.getField(true,"Columns" /*RemoteObject*/ )}, "/",0, 0));Debug.locals.put("row", _row);Debug.locals.put("row", _row);
 BA.debugLineNum = 613;BA.debugLine="Dim col As Int = index Mod ts.Columns";
Debug.JustUpdateDeviceLine();
_col = RemoteObject.solve(new RemoteObject[] {_index,_ts.getField(true,"Columns" /*RemoteObject*/ )}, "%",0, 1);Debug.locals.put("col", _col);Debug.locals.put("col", _col);
 BA.debugLineNum = 614;BA.debugLine="Dim x As Int = ts.Margin + col * (ts.TileWidth +";
Debug.JustUpdateDeviceLine();
_x = RemoteObject.solve(new RemoteObject[] {_ts.getField(true,"Margin" /*RemoteObject*/ ),_col,(RemoteObject.solve(new RemoteObject[] {_ts.getField(true,"TileWidth" /*RemoteObject*/ ),_ts.getField(true,"Spacing" /*RemoteObject*/ )}, "+",1, 1))}, "+*",1, 1);Debug.locals.put("x", _x);Debug.locals.put("x", _x);
 BA.debugLineNum = 615;BA.debugLine="Dim y As Int = ts.Margin + row * (ts.TileHeight +";
Debug.JustUpdateDeviceLine();
_y = RemoteObject.solve(new RemoteObject[] {_ts.getField(true,"Margin" /*RemoteObject*/ ),_row,(RemoteObject.solve(new RemoteObject[] {_ts.getField(true,"TileHeight" /*RemoteObject*/ ),_ts.getField(true,"Spacing" /*RemoteObject*/ )}, "+",1, 1))}, "+*",1, 1);Debug.locals.put("y", _y);Debug.locals.put("y", _y);
 BA.debugLineNum = 616;BA.debugLine="Dim h As Boolean = Bit.And(tile.TileIdentifier, F";
Debug.JustUpdateDeviceLine();
_h = BA.ObjectToBoolean(RemoteObject.solveBoolean("!",x2tilemap.__c.getField(false,"Bit").runMethod(true,"And",(Object)(_tile.getField(true,"TileIdentifier" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_flipped_horizontally" /*RemoteObject*/ ))),BA.numberCast(double.class, 0)));Debug.locals.put("h", _h);Debug.locals.put("h", _h);
 BA.debugLineNum = 617;BA.debugLine="Dim v As Boolean = Bit.And(tile.TileIdentifier, F";
Debug.JustUpdateDeviceLine();
_v = BA.ObjectToBoolean(RemoteObject.solveBoolean("!",x2tilemap.__c.getField(false,"Bit").runMethod(true,"And",(Object)(_tile.getField(true,"TileIdentifier" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_flipped_vertically" /*RemoteObject*/ ))),BA.numberCast(double.class, 0)));Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 618;BA.debugLine="Dim d As Boolean = Bit.And(tile.TileIdentifier, F";
Debug.JustUpdateDeviceLine();
_d = BA.ObjectToBoolean(RemoteObject.solveBoolean("!",x2tilemap.__c.getField(false,"Bit").runMethod(true,"And",(Object)(_tile.getField(true,"TileIdentifier" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_flipped_diagonally_flag" /*RemoteObject*/ ))),BA.numberCast(double.class, 0)));Debug.locals.put("d", _d);Debug.locals.put("d", _d);
 BA.debugLineNum = 620;BA.debugLine="Dim src As B4XRect";
Debug.JustUpdateDeviceLine();
_src = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");Debug.locals.put("src", _src);
 BA.debugLineNum = 621;BA.debugLine="src.Initialize(x, y, x + ts.TileWidth, y + ts.Til";
Debug.JustUpdateDeviceLine();
_src.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, _x)),(Object)(BA.numberCast(float.class, _y)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_x,_ts.getField(true,"TileWidth" /*RemoteObject*/ )}, "+",1, 1))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_y,_ts.getField(true,"TileHeight" /*RemoteObject*/ )}, "+",1, 1))));
 BA.debugLineNum = 622;BA.debugLine="SingleTileBC.FillRect(xui.Color_Transparent, Sing";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_singletilebc" /*RemoteObject*/ ).runVoidMethod ("_fillrect",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(__ref.getField(false,"_singletilebc" /*RemoteObject*/ ).getField(false,"_targetrect")));
 BA.debugLineNum = 623;BA.debugLine="X2.GraphicCache.DrawBitmapCreatorFlipped(SingleTi";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_x2" /*RemoteObject*/ ).getField(false,"_graphiccache" /*RemoteObject*/ ).runClassMethod (b4a.example.x2spritegraphiccache.class, "_drawbitmapcreatorflipped" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_singletilebc" /*RemoteObject*/ )),(Object)(_ts.getField(false,"TilesBC" /*RemoteObject*/ )),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_singletilebc" /*RemoteObject*/ ).getField(true,"_mwidth"),_ts.getField(true,"TileWidth" /*RemoteObject*/ )}, "/",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_singletilebc" /*RemoteObject*/ ).getField(true,"_mheight"),_ts.getField(true,"TileHeight" /*RemoteObject*/ )}, "/",0, 0))),(Object)(_src),(Object)(_h),(Object)(_v),(Object)(_d));
 BA.debugLineNum = 624;BA.debugLine="Dim cbc As CompressedBC = SingleTileBC.ExtractCom";
Debug.JustUpdateDeviceLine();
_cbc = __ref.getField(false,"_singletilebc" /*RemoteObject*/ ).runMethod(false,"_extractcompressedbc",(Object)(__ref.getField(false,"_singletilebc" /*RemoteObject*/ ).getField(false,"_targetrect")),(Object)(__ref.getField(false,"_x2" /*RemoteObject*/ ).getField(false,"_graphiccache" /*RemoteObject*/ ).getField(false,"_cbccache" /*RemoteObject*/ )));Debug.locals.put("cbc", _cbc);Debug.locals.put("cbc", _cbc);
 BA.debugLineNum = 625;BA.debugLine="TilesCBC.Put(tile.TileIdentifier, cbc)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tilescbc" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_tile.getField(true,"TileIdentifier" /*RemoteObject*/ ))),(Object)((_cbc)));
 BA.debugLineNum = 626;BA.debugLine="tile.CBC = cbc";
Debug.JustUpdateDeviceLine();
_tile.setField ("CBC" /*RemoteObject*/ ,_cbc);
 BA.debugLineNum = 627;BA.debugLine="Return tile";
Debug.JustUpdateDeviceLine();
if (true) return _tile;
 BA.debugLineNum = 628;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _vx2,RemoteObject _dir,RemoteObject _filename,RemoteObject _targetview) throws Exception{
try {
		Debug.PushSubsStack("Initialize (x2tilemap) ","x2tilemap",20,__ref.getField(false, "ba"),__ref,47);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "x2tilemap","initialize", __ref, _ba, _vx2, _dir, _filename, _targetview);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _all = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _tilesetslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _ts = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _fgid = RemoteObject.createImmutable(0);
RemoteObject _layerslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _layer = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("ba", _ba);
Debug.locals.put("vX2", _vx2);
Debug.locals.put("Dir", _dir);
Debug.locals.put("FileName", _filename);
Debug.locals.put("TargetView", _targetview);
 BA.debugLineNum = 47;BA.debugLine="Public Sub Initialize (vX2 As X2Utils, Dir As Stri";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 48;BA.debugLine="X2 = vX2";
Debug.JustUpdateDeviceLine();
__ref.setField ("_x2" /*RemoteObject*/ ,_vx2);
 BA.debugLineNum = 49;BA.debugLine="TileSets.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tilesets" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 50;BA.debugLine="Layers.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_layers" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 51;BA.debugLine="Dim all As Map = ReadJson(Dir, FileName)";
Debug.JustUpdateDeviceLine();
_all = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_all = __ref.runClassMethod (b4a.example.x2tilemap.class, "_readjson" /*RemoteObject*/ ,(Object)(_dir),(Object)(_filename));Debug.locals.put("all", _all);Debug.locals.put("all", _all);
 BA.debugLineNum = 52;BA.debugLine="Dim TileSetsList As List = all.Get(\"tilesets\")";
Debug.JustUpdateDeviceLine();
_tilesetslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_tilesetslist = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _all.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tilesets")))));Debug.locals.put("TileSetsList", _tilesetslist);Debug.locals.put("TileSetsList", _tilesetslist);
 BA.debugLineNum = 53;BA.debugLine="For Each ts As Map In TileSetsList";
Debug.JustUpdateDeviceLine();
_ts = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group6 = _tilesetslist;
final int groupLen6 = group6.runMethod(true,"getSize").<Integer>get()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_ts = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group6.runMethod(false,"Get",index6));Debug.locals.put("ts", _ts);
Debug.locals.put("ts", _ts);
 BA.debugLineNum = 54;BA.debugLine="Dim fgid As Int = ts.Get(\"firstgid\")";
Debug.JustUpdateDeviceLine();
_fgid = BA.numberCast(int.class, _ts.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("firstgid")))));Debug.locals.put("fgid", _fgid);Debug.locals.put("fgid", _fgid);
 BA.debugLineNum = 55;BA.debugLine="If ts.ContainsKey(\"source\") Then";
Debug.JustUpdateDeviceLine();
if (_ts.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("source")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 56;BA.debugLine="ts = ReadJson(Dir, ts.Get(\"source\"))";
Debug.JustUpdateDeviceLine();
_ts = __ref.runClassMethod (b4a.example.x2tilemap.class, "_readjson" /*RemoteObject*/ ,(Object)(_dir),(Object)(BA.ObjectToString(_ts.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("source")))))));Debug.locals.put("ts", _ts);
 };
 BA.debugLineNum = 58;BA.debugLine="LoadTileSet (ts, fgid, Dir)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.x2tilemap.class, "_loadtileset" /*RemoteObject*/ ,(Object)(_ts),(Object)(_fgid),(Object)(_dir));
 }
}Debug.locals.put("ts", _ts);
;
 BA.debugLineNum = 61;BA.debugLine="TilesCBC.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tilescbc" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 62;BA.debugLine="TilesPerRow = all.Get(\"width\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_tilesperrow" /*RemoteObject*/ ,BA.numberCast(int.class, _all.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("width"))))));
 BA.debugLineNum = 63;BA.debugLine="TilesPerColumn = all.Get(\"height\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_tilespercolumn" /*RemoteObject*/ ,BA.numberCast(int.class, _all.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("height"))))));
 BA.debugLineNum = 64;BA.debugLine="OriginalTileWidthPixels = all.Get(\"tilewidth\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_originaltilewidthpixels" /*RemoteObject*/ ,BA.numberCast(int.class, _all.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tilewidth"))))));
 BA.debugLineNum = 65;BA.debugLine="OriginalTileHeightPixels = all.Get(\"tileheight\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_originaltileheightpixels" /*RemoteObject*/ ,BA.numberCast(int.class, _all.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tileheight"))))));
 BA.debugLineNum = 66;BA.debugLine="TileMapVersion = all.GetDefault(\"version\", 1)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_tilemapversion" /*RemoteObject*/ ,BA.numberCast(float.class, _all.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("version"))),(Object)(RemoteObject.createImmutable((1))))));
 BA.debugLineNum = 67;BA.debugLine="MapBottomYOriginalPixels = OriginalTileHeightPixe";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mapbottomyoriginalpixels" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_originaltileheightpixels" /*RemoteObject*/ ),__ref.getField(true,"_tilespercolumn" /*RemoteObject*/ )}, "*",0, 1));
 BA.debugLineNum = 68;BA.debugLine="Dim LayersList As List = all.Get(\"layers\")";
Debug.JustUpdateDeviceLine();
_layerslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_layerslist = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _all.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("layers")))));Debug.locals.put("LayersList", _layerslist);Debug.locals.put("LayersList", _layerslist);
 BA.debugLineNum = 69;BA.debugLine="For Each layer As Map In LayersList";
Debug.JustUpdateDeviceLine();
_layer = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group21 = _layerslist;
final int groupLen21 = group21.runMethod(true,"getSize").<Integer>get()
;int index21 = 0;
;
for (; index21 < groupLen21;index21++){
_layer = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group21.runMethod(false,"Get",index21));Debug.locals.put("layer", _layer);
Debug.locals.put("layer", _layer);
 BA.debugLineNum = 70;BA.debugLine="If layer.ContainsKey(\"data\") Then";
Debug.JustUpdateDeviceLine();
if (_layer.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("data")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 71;BA.debugLine="ParseTileLayer(layer)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.x2tilemap.class, "_parsetilelayer" /*RemoteObject*/ ,(Object)(_layer));
 }else 
{ BA.debugLineNum = 72;BA.debugLine="Else if layer.ContainsKey(\"objects\") Then";
Debug.JustUpdateDeviceLine();
if (_layer.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("objects")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 73;BA.debugLine="ParseObjectsLayer(layer)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.x2tilemap.class, "_parseobjectslayer" /*RemoteObject*/ ,(Object)(_layer));
 }}
;
 }
}Debug.locals.put("layer", _layer);
;
 BA.debugLineNum = 76;BA.debugLine="ReadObjectsTemplate";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.x2tilemap.class, "_readobjectstemplate" /*RemoteObject*/ );
 BA.debugLineNum = 77;BA.debugLine="mTargetView = TargetView";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mtargetview" /*RemoteObject*/ ,_targetview);
 BA.debugLineNum = 78;BA.debugLine="ReuseTilesRect.Initialize(-1, -1, -1, -1)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_reusetilesrect" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, -(double) (0 + 1))),(Object)(BA.numberCast(float.class, -(double) (0 + 1))),(Object)(BA.numberCast(float.class, -(double) (0 + 1))),(Object)(BA.numberCast(float.class, -(double) (0 + 1))));
 BA.debugLineNum = 79;BA.debugLine="LastDrawnScreenCompleted.Set(-1, -1)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lastdrawnscreencompleted" /*RemoteObject*/ ).runVoidMethod ("Set",(Object)(BA.numberCast(float.class, -(double) (0 + 1))),(Object)(BA.numberCast(float.class, -(double) (0 + 1))));
 BA.debugLineNum = 80;BA.debugLine="LastDrawnScreenCenterStarted.Set(-1, -1)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lastdrawnscreencenterstarted" /*RemoteObject*/ ).runVoidMethod ("Set",(Object)(BA.numberCast(float.class, -(double) (0 + 1))),(Object)(BA.numberCast(float.class, -(double) (0 + 1))));
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listofmapcoordinatestolistoflocalvecs(RemoteObject __ref,RemoteObject _points,RemoteObject _offsetxmeters,RemoteObject _offsetymeters) throws Exception{
try {
		Debug.PushSubsStack("ListOfMapCoordinatesToListOfLocalVecs (x2tilemap) ","x2tilemap",20,__ref.getField(false, "ba"),__ref,436);
if (RapidSub.canDelegate("listofmapcoordinatestolistoflocalvecs")) { return __ref.runUserSub(false, "x2tilemap","listofmapcoordinatestolistoflocalvecs", __ref, _points, _offsetxmeters, _offsetymeters);}
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _x = RemoteObject.createImmutable(0f);
RemoteObject _y = RemoteObject.createImmutable(0f);
Debug.locals.put("points", _points);
Debug.locals.put("OffsetXMeters", _offsetxmeters);
Debug.locals.put("OffsetYMeters", _offsetymeters);
 BA.debugLineNum = 436;BA.debugLine="Private Sub ListOfMapCoordinatesToListOfLocalVecs";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 437;BA.debugLine="Dim res As List";
Debug.JustUpdateDeviceLine();
_res = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("res", _res);
 BA.debugLineNum = 438;BA.debugLine="res.Initialize";
Debug.JustUpdateDeviceLine();
_res.runVoidMethod ("Initialize");
 BA.debugLineNum = 439;BA.debugLine="For Each p As Map In points";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group3 = _points;
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group3.runMethod(false,"Get",index3));Debug.locals.put("p", _p);
Debug.locals.put("p", _p);
 BA.debugLineNum = 440;BA.debugLine="Dim x As Float = p.Get(\"x\")";
Debug.JustUpdateDeviceLine();
_x = BA.numberCast(float.class, _p.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("x")))));Debug.locals.put("x", _x);Debug.locals.put("x", _x);
 BA.debugLineNum = 441;BA.debugLine="Dim y As Float = p.Get(\"y\")";
Debug.JustUpdateDeviceLine();
_y = BA.numberCast(float.class, _p.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("y")))));Debug.locals.put("y", _y);Debug.locals.put("y", _y);
 BA.debugLineNum = 442;BA.debugLine="res.Add(X2.CreateVec2(x * MapXToMeter + OffsetXM";
Debug.JustUpdateDeviceLine();
_res.runVoidMethod ("Add",(Object)((__ref.getField(false,"_x2" /*RemoteObject*/ ).runClassMethod (b4a.example.x2utils.class, "_createvec2" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_x,__ref.getField(true,"_mapxtometer" /*RemoteObject*/ ),_offsetxmeters}, "*+",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable((-(double) (0 + _y.<Float>get().floatValue()))),__ref.getField(true,"_mapytometer" /*RemoteObject*/ ),_offsetymeters}, "*+",1, 0)))))));
 }
}Debug.locals.put("p", _p);
;
 BA.debugLineNum = 444;BA.debugLine="Return res";
Debug.JustUpdateDeviceLine();
if (true) return _res;
 BA.debugLineNum = 445;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadgraphicforshape(RemoteObject __ref,RemoteObject _shape,RemoteObject _graphicfile,RemoteObject _template) throws Exception{
try {
		Debug.PushSubsStack("LoadGraphicForShape (x2tilemap) ","x2tilemap",20,__ref.getField(false, "ba"),__ref,363);
if (RapidSub.canDelegate("loadgraphicforshape")) { return __ref.runUserSub(false, "x2tilemap","loadgraphicforshape", __ref, _shape, _graphicfile, _template);}
RemoteObject _shapesize = RemoteObject.declareNull("anywheresoftware.b4a.objects.B2Vec2");
RemoteObject _files = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _name = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _f = RemoteObject.createImmutable("");
RemoteObject _nearestneighbor = RemoteObject.createImmutable(false);
RemoteObject _bmps = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _rowsandcolumns = RemoteObject.createImmutable("");
RemoteObject _angleinterval = RemoteObject.createImmutable(0);
RemoteObject _xy = null;
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
RemoteObject _keepaspectratio = RemoteObject.createImmutable(false);
RemoteObject _original = RemoteObject.declareNull("b4a.example.bitmapcreator");
RemoteObject _sb = RemoteObject.declareNull("b4a.example.x2utils._x2scaledbitmap");
RemoteObject _data = RemoteObject.declareNull("b4a.example.x2spritegraphiccache._x2spritegraphicdata");
Debug.locals.put("Shape", _shape);
Debug.locals.put("GraphicFile", _graphicfile);
Debug.locals.put("Template", _template);
 BA.debugLineNum = 363;BA.debugLine="Private Sub LoadGraphicForShape (Shape As B2Shape,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 364;BA.debugLine="Dim ShapeSize As B2Vec2 = X2.GetShapeWidthAndHeig";
Debug.JustUpdateDeviceLine();
_shapesize = __ref.getField(false,"_x2" /*RemoteObject*/ ).runClassMethod (b4a.example.x2utils.class, "_getshapewidthandheight" /*RemoteObject*/ ,(Object)(_shape));Debug.locals.put("ShapeSize", _shapesize);Debug.locals.put("ShapeSize", _shapesize);
 BA.debugLineNum = 365;BA.debugLine="Dim files As List";
Debug.JustUpdateDeviceLine();
_files = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("files", _files);
 BA.debugLineNum = 366;BA.debugLine="files.Initialize";
Debug.JustUpdateDeviceLine();
_files.runVoidMethod ("Initialize");
 BA.debugLineNum = 367;BA.debugLine="files.Add(GraphicFile)";
Debug.JustUpdateDeviceLine();
_files.runVoidMethod ("Add",(Object)((_graphicfile)));
 BA.debugLineNum = 368;BA.debugLine="Dim name As StringBuilder";
Debug.JustUpdateDeviceLine();
_name = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("name", _name);
 BA.debugLineNum = 369;BA.debugLine="name.Initialize";
Debug.JustUpdateDeviceLine();
_name.runVoidMethod ("Initialize");
 BA.debugLineNum = 370;BA.debugLine="name.Append($\"${GraphicFile}_$1.2{ShapeSize.X}x$1";
Debug.JustUpdateDeviceLine();
_name.runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),x2tilemap.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_graphicfile))),RemoteObject.createImmutable("_"),x2tilemap.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("1.2")),(Object)((_shapesize.runMethod(true,"getX")))),RemoteObject.createImmutable("x"),x2tilemap.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("1.2")),(Object)((_shapesize.runMethod(true,"getY")))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 372;BA.debugLine="Dim i As Int = 2";
Debug.JustUpdateDeviceLine();
_i = BA.numberCast(int.class, 2);Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 373;BA.debugLine="Do While Template.CustomProps.ContainsKey(\"graphi";
Debug.JustUpdateDeviceLine();
while (_template.getField(false,"CustomProps" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((RemoteObject.concat(RemoteObject.createImmutable("graphic file "),_i)))).<Boolean>get().booleanValue()) {
 BA.debugLineNum = 374;BA.debugLine="Dim f As String = Template.CustomProps.Get(\"grap";
Debug.JustUpdateDeviceLine();
_f = BA.ObjectToString(_template.getField(false,"CustomProps" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.concat(RemoteObject.createImmutable("graphic file "),_i)))));Debug.locals.put("f", _f);Debug.locals.put("f", _f);
 BA.debugLineNum = 375;BA.debugLine="files.Add(f)";
Debug.JustUpdateDeviceLine();
_files.runVoidMethod ("Add",(Object)((_f)));
 BA.debugLineNum = 376;BA.debugLine="name.Append(f)";
Debug.JustUpdateDeviceLine();
_name.runVoidMethod ("Append",(Object)(_f));
 BA.debugLineNum = 377;BA.debugLine="i = i + 1";
Debug.JustUpdateDeviceLine();
_i = RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("i", _i);
 }
;
 BA.debugLineNum = 379;BA.debugLine="If X2.GraphicCache.GetGraphicsCount(name) = 0 The";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_x2" /*RemoteObject*/ ).getField(false,"_graphiccache" /*RemoteObject*/ ).runClassMethod (b4a.example.x2spritegraphiccache.class, "_getgraphicscount" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_name))),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 380;BA.debugLine="Dim NearestNeighbor As Boolean = GetCustomProper";
Debug.JustUpdateDeviceLine();
_nearestneighbor = BA.ObjectToBoolean(__ref.runClassMethod (b4a.example.x2tilemap.class, "_getcustomproperty" /*RemoteObject*/ ,(Object)(_template),(Object)(RemoteObject.createImmutable("nearest neighbor scaling"))));Debug.locals.put("NearestNeighbor", _nearestneighbor);Debug.locals.put("NearestNeighbor", _nearestneighbor);
 BA.debugLineNum = 381;BA.debugLine="Dim bmps As List";
Debug.JustUpdateDeviceLine();
_bmps = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("bmps", _bmps);
 BA.debugLineNum = 382;BA.debugLine="Dim RowsAndColumns As String = GetCustomProperty";
Debug.JustUpdateDeviceLine();
_rowsandcolumns = BA.ObjectToString(__ref.runClassMethod (b4a.example.x2tilemap.class, "_getcustomproperty" /*RemoteObject*/ ,(Object)(_template),(Object)(RemoteObject.createImmutable("graphic sheet: rows, columns"))));Debug.locals.put("RowsAndColumns", _rowsandcolumns);Debug.locals.put("RowsAndColumns", _rowsandcolumns);
 BA.debugLineNum = 383;BA.debugLine="Dim AngleInterval As Int = GetCustomProperty(Tem";
Debug.JustUpdateDeviceLine();
_angleinterval = BA.numberCast(int.class, __ref.runClassMethod (b4a.example.x2tilemap.class, "_getcustomproperty" /*RemoteObject*/ ,(Object)(_template),(Object)(RemoteObject.createImmutable("angle interval"))));Debug.locals.put("AngleInterval", _angleinterval);Debug.locals.put("AngleInterval", _angleinterval);
 BA.debugLineNum = 384;BA.debugLine="If RowsAndColumns <> \"1, 1\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_rowsandcolumns,BA.ObjectToString("1, 1"))) { 
 BA.debugLineNum = 385;BA.debugLine="Dim xy() As String = Regex.Split(\"[,\\s]+\", Rows";
Debug.JustUpdateDeviceLine();
_xy = x2tilemap.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("[,\\s]+")),(Object)(_rowsandcolumns));Debug.locals.put("xy", _xy);Debug.locals.put("xy", _xy);
 BA.debugLineNum = 386;BA.debugLine="If xy(0) <> \"1\" Or xy(1) <> \"1\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_xy.getArrayElement(true,BA.numberCast(int.class, 0)),BA.ObjectToString("1")) || RemoteObject.solveBoolean("!",_xy.getArrayElement(true,BA.numberCast(int.class, 1)),BA.ObjectToString("1"))) { 
 BA.debugLineNum = 387;BA.debugLine="Dim bmp As B4XBitmap = xui.LoadBitmap(File.Dir";
Debug.JustUpdateDeviceLine();
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_bmp = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"LoadBitmap",(Object)(x2tilemap.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(_graphicfile));Debug.locals.put("bmp", _bmp);Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 388;BA.debugLine="If NearestNeighbor Then";
Debug.JustUpdateDeviceLine();
if (_nearestneighbor.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 389;BA.debugLine="bmps = X2.ReadSpritesBCs(X2.BitmapToBC(bmp, 1";
Debug.JustUpdateDeviceLine();
_bmps = __ref.getField(false,"_x2" /*RemoteObject*/ ).runClassMethod (b4a.example.x2utils.class, "_readspritesbcs" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_x2" /*RemoteObject*/ ).runClassMethod (b4a.example.x2utils.class, "_bitmaptobc" /*RemoteObject*/ ,(Object)(_bmp),(Object)(BA.numberCast(float.class, 1)))),(Object)(BA.numberCast(int.class, _xy.getArrayElement(true,BA.numberCast(int.class, 0)))),(Object)(BA.numberCast(int.class, _xy.getArrayElement(true,BA.numberCast(int.class, 1)))),(Object)(_shapesize.runMethod(true,"getX")),(Object)(_shapesize.runMethod(true,"getY")));Debug.locals.put("bmps", _bmps);
 }else {
 BA.debugLineNum = 391;BA.debugLine="bmps = X2.ReadSprites(bmp, xy(0), xy(1), Shap";
Debug.JustUpdateDeviceLine();
_bmps = __ref.getField(false,"_x2" /*RemoteObject*/ ).runClassMethod (b4a.example.x2utils.class, "_readsprites" /*RemoteObject*/ ,(Object)(_bmp),(Object)(BA.numberCast(int.class, _xy.getArrayElement(true,BA.numberCast(int.class, 0)))),(Object)(BA.numberCast(int.class, _xy.getArrayElement(true,BA.numberCast(int.class, 1)))),(Object)(_shapesize.runMethod(true,"getX")),(Object)(_shapesize.runMethod(true,"getY")));Debug.locals.put("bmps", _bmps);
 };
 };
 };
 BA.debugLineNum = 395;BA.debugLine="If bmps.IsInitialized = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_bmps.runMethod(true,"IsInitialized"),x2tilemap.__c.getField(true,"False"))) { 
 BA.debugLineNum = 396;BA.debugLine="Dim KeepAspectRatio As Boolean = GetCustomPrope";
Debug.JustUpdateDeviceLine();
_keepaspectratio = BA.ObjectToBoolean(__ref.runClassMethod (b4a.example.x2tilemap.class, "_getcustomproperty" /*RemoteObject*/ ,(Object)(_template),(Object)(RemoteObject.createImmutable("graphic keep aspect ratio"))));Debug.locals.put("KeepAspectRatio", _keepaspectratio);Debug.locals.put("KeepAspectRatio", _keepaspectratio);
 BA.debugLineNum = 397;BA.debugLine="bmps.Initialize";
Debug.JustUpdateDeviceLine();
_bmps.runVoidMethod ("Initialize");
 BA.debugLineNum = 398;BA.debugLine="For Each f As String In files";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group34 = _files;
final int groupLen34 = group34.runMethod(true,"getSize").<Integer>get()
;int index34 = 0;
;
for (; index34 < groupLen34;index34++){
_f = BA.ObjectToString(group34.runMethod(false,"Get",index34));Debug.locals.put("f", _f);
Debug.locals.put("f", _f);
 BA.debugLineNum = 399;BA.debugLine="If NearestNeighbor Then";
Debug.JustUpdateDeviceLine();
if (_nearestneighbor.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 400;BA.debugLine="Dim original As BitmapCreator = X2.BitmapToBC";
Debug.JustUpdateDeviceLine();
_original = __ref.getField(false,"_x2" /*RemoteObject*/ ).runClassMethod (b4a.example.x2utils.class, "_bitmaptobc" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"LoadBitmap",(Object)(x2tilemap.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(_f))),(Object)(BA.numberCast(float.class, 1)));Debug.locals.put("original", _original);Debug.locals.put("original", _original);
 BA.debugLineNum = 401;BA.debugLine="bmps.Add(X2.NearestNeighborResize(original, o";
Debug.JustUpdateDeviceLine();
_bmps.runVoidMethod ("Add",(Object)((__ref.getField(false,"_x2" /*RemoteObject*/ ).runClassMethod (b4a.example.x2utils.class, "_nearestneighborresize" /*RemoteObject*/ ,(Object)(_original),(Object)(_original.getField(false,"_targetrect")),(Object)(BA.numberCast(float.class, __ref.getField(false,"_x2" /*RemoteObject*/ ).runClassMethod (b4a.example.x2utils.class, "_meterstobcpixels" /*RemoteObject*/ ,(Object)(_shapesize.runMethod(true,"getX"))))),(Object)(BA.numberCast(float.class, __ref.getField(false,"_x2" /*RemoteObject*/ ).runClassMethod (b4a.example.x2utils.class, "_meterstobcpixels" /*RemoteObject*/ ,(Object)(_shapesize.runMethod(true,"getY"))))),(Object)(_keepaspectratio)))));
 }else {
 BA.debugLineNum = 403;BA.debugLine="Dim sb As X2ScaledBitmap = X2.LoadBmp(File.Di";
Debug.JustUpdateDeviceLine();
_sb = __ref.getField(false,"_x2" /*RemoteObject*/ ).runClassMethod (b4a.example.x2utils.class, "_loadbmp" /*RemoteObject*/ ,(Object)(x2tilemap.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(_f),(Object)(_shapesize.runMethod(true,"getX")),(Object)(_shapesize.runMethod(true,"getY")),(Object)(_keepaspectratio));Debug.locals.put("sb", _sb);Debug.locals.put("sb", _sb);
 BA.debugLineNum = 404;BA.debugLine="bmps.Add(sb)";
Debug.JustUpdateDeviceLine();
_bmps.runVoidMethod ("Add",(Object)((_sb)));
 };
 }
}Debug.locals.put("f", _f);
;
 };
 BA.debugLineNum = 408;BA.debugLine="If NearestNeighbor Then";
Debug.JustUpdateDeviceLine();
if (_nearestneighbor.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 409;BA.debugLine="Dim data As X2SpriteGraphicData = X2.GraphicCac";
Debug.JustUpdateDeviceLine();
_data = __ref.getField(false,"_x2" /*RemoteObject*/ ).getField(false,"_graphiccache" /*RemoteObject*/ ).runClassMethod (b4a.example.x2spritegraphiccache.class, "_putgraphicbcs" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_name)),(Object)(_bmps),(Object)(BA.ObjectToBoolean(__ref.runClassMethod (b4a.example.x2tilemap.class, "_getcustomproperty" /*RemoteObject*/ ,(Object)(_template),(Object)(RemoteObject.createImmutable("antialias"))))),(Object)(_angleinterval));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 }else {
 BA.debugLineNum = 411;BA.debugLine="Dim data As X2SpriteGraphicData = X2.GraphicCac";
Debug.JustUpdateDeviceLine();
_data = __ref.getField(false,"_x2" /*RemoteObject*/ ).getField(false,"_graphiccache" /*RemoteObject*/ ).runClassMethod (b4a.example.x2spritegraphiccache.class, "_putgraphic2" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_name)),(Object)(_bmps),(Object)(BA.ObjectToBoolean(__ref.runClassMethod (b4a.example.x2tilemap.class, "_getcustomproperty" /*RemoteObject*/ ,(Object)(_template),(Object)(RemoteObject.createImmutable("antialias"))))),(Object)(_angleinterval));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 };
 BA.debugLineNum = 413;BA.debugLine="data.VerticalSymmetry = GetCustomProperty(Templa";
Debug.JustUpdateDeviceLine();
_data.setField ("VerticalSymmetry" /*RemoteObject*/ ,BA.ObjectToBoolean(__ref.runClassMethod (b4a.example.x2tilemap.class, "_getcustomproperty" /*RemoteObject*/ ,(Object)(_template),(Object)(RemoteObject.createImmutable("vertical symmetry")))));
 BA.debugLineNum = 414;BA.debugLine="data.HorizontalSymmetry = GetCustomProperty(Temp";
Debug.JustUpdateDeviceLine();
_data.setField ("HorizontalSymmetry" /*RemoteObject*/ ,BA.ObjectToBoolean(__ref.runClassMethod (b4a.example.x2tilemap.class, "_getcustomproperty" /*RemoteObject*/ ,(Object)(_template),(Object)(RemoteObject.createImmutable("horizontal symmetry")))));
 };
 BA.debugLineNum = 417;BA.debugLine="Return name";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString(_name);
 BA.debugLineNum = 418;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadtileset(RemoteObject __ref,RemoteObject _m,RemoteObject _firstgid,RemoteObject _dir) throws Exception{
try {
		Debug.PushSubsStack("LoadTileSet (x2tilemap) ","x2tilemap",20,__ref.getField(false, "ba"),__ref,457);
if (RapidSub.canDelegate("loadtileset")) { return __ref.runUserSub(false, "x2tilemap","loadtileset", __ref, _m, _firstgid, _dir);}
RemoteObject _ts = RemoteObject.declareNull("b4a.example.x2tilemap._x2internaltileset");
Debug.locals.put("m", _m);
Debug.locals.put("FirstGID", _firstgid);
Debug.locals.put("Dir", _dir);
 BA.debugLineNum = 457;BA.debugLine="Private Sub LoadTileSet (m As Map, FirstGID As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 459;BA.debugLine="Dim ts As X2InternalTileSet";
Debug.JustUpdateDeviceLine();
_ts = RemoteObject.createNew ("b4a.example.x2tilemap._x2internaltileset");Debug.locals.put("ts", _ts);
 BA.debugLineNum = 460;BA.debugLine="ts.Initialize";
Debug.JustUpdateDeviceLine();
_ts.runVoidMethod ("Initialize");
 BA.debugLineNum = 461;BA.debugLine="ts.Columns = m.Get(\"columns\")";
Debug.JustUpdateDeviceLine();
_ts.setField ("Columns" /*RemoteObject*/ ,BA.numberCast(int.class, _m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("columns"))))));
 BA.debugLineNum = 462;BA.debugLine="ts.Name = m.Get(\"name\")";
Debug.JustUpdateDeviceLine();
_ts.setField ("Name" /*RemoteObject*/ ,BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name"))))));
 BA.debugLineNum = 463;BA.debugLine="If ts.Columns = 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_ts.getField(true,"Columns" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 464;BA.debugLine="Log($\"Skipping tile set: ${ts.Name}\"$)";
Debug.JustUpdateDeviceLine();
x2tilemap.__c.runVoidMethod ("LogImpl","916449543",(RemoteObject.concat(RemoteObject.createImmutable("Skipping tile set: "),x2tilemap.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_ts.getField(true,"Name" /*RemoteObject*/ )))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 465;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 467;BA.debugLine="ts.TilesBC = X2.BitmapToBC(xui.LoadBitmap(Dir, m.";
Debug.JustUpdateDeviceLine();
_ts.setField ("TilesBC" /*RemoteObject*/ ,__ref.getField(false,"_x2" /*RemoteObject*/ ).runClassMethod (b4a.example.x2utils.class, "_bitmaptobc" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"LoadBitmap",(Object)(_dir),(Object)(BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("image")))))))),(Object)(BA.numberCast(float.class, 1))));
 BA.debugLineNum = 468;BA.debugLine="ts.FirstGID = FirstGID";
Debug.JustUpdateDeviceLine();
_ts.setField ("FirstGID" /*RemoteObject*/ ,_firstgid);
 BA.debugLineNum = 469;BA.debugLine="ts.Margin = m.Get(\"margin\")";
Debug.JustUpdateDeviceLine();
_ts.setField ("Margin" /*RemoteObject*/ ,BA.numberCast(int.class, _m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("margin"))))));
 BA.debugLineNum = 470;BA.debugLine="ts.Spacing = m.Get(\"spacing\")";
Debug.JustUpdateDeviceLine();
_ts.setField ("Spacing" /*RemoteObject*/ ,BA.numberCast(int.class, _m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("spacing"))))));
 BA.debugLineNum = 471;BA.debugLine="ts.Count = m.Get(\"tilecount\")";
Debug.JustUpdateDeviceLine();
_ts.setField ("Count" /*RemoteObject*/ ,BA.numberCast(int.class, _m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tilecount"))))));
 BA.debugLineNum = 472;BA.debugLine="ts.TileWidth = m.Get(\"tilewidth\")";
Debug.JustUpdateDeviceLine();
_ts.setField ("TileWidth" /*RemoteObject*/ ,BA.numberCast(int.class, _m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tilewidth"))))));
 BA.debugLineNum = 473;BA.debugLine="ts.TileHeight = m.Get(\"tileheight\")";
Debug.JustUpdateDeviceLine();
_ts.setField ("TileHeight" /*RemoteObject*/ ,BA.numberCast(int.class, _m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tileheight"))))));
 BA.debugLineNum = 474;BA.debugLine="If TileSets.ContainsKey(ts.Name) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_tilesets" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_ts.getField(true,"Name" /*RemoteObject*/ )))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 475;BA.debugLine="Log(\"WARNING: Duplicate tile sets with same name";
Debug.JustUpdateDeviceLine();
x2tilemap.__c.runVoidMethod ("LogImpl","916449554",RemoteObject.concat(RemoteObject.createImmutable("WARNING: Duplicate tile sets with same name: "),_ts.getField(true,"Name" /*RemoteObject*/ )),0);
 BA.debugLineNum = 476;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 478;BA.debugLine="TileSets.Put(ts.Name, ts)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tilesets" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_ts.getField(true,"Name" /*RemoteObject*/ ))),(Object)((_ts)));
 BA.debugLineNum = 479;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mapxytoworldvec(RemoteObject __ref,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("MapXYToWorldVec (x2tilemap) ","x2tilemap",20,__ref.getField(false, "ba"),__ref,448);
if (RapidSub.canDelegate("mapxytoworldvec")) { return __ref.runUserSub(false, "x2tilemap","mapxytoworldvec", __ref, _x, _y);}
Debug.locals.put("x", _x);
Debug.locals.put("y", _y);
 BA.debugLineNum = 448;BA.debugLine="Private Sub MapXYToWorldVec(x As Float, y As Float";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 449;BA.debugLine="Return X2.CreateVec2(x * MapXToMeter, (MapBottomY";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_x2" /*RemoteObject*/ ).runClassMethod (b4a.example.x2utils.class, "_createvec2" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_x,__ref.getField(true,"_mapxtometer" /*RemoteObject*/ )}, "*",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mapbottomyoriginalpixels" /*RemoteObject*/ ),_y}, "-",1, 0)),__ref.getField(true,"_mapytometer" /*RemoteObject*/ )}, "*",0, 0))));
 BA.debugLineNum = 450;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _parseobjectslayer(RemoteObject __ref,RemoteObject _layer) throws Exception{
try {
		Debug.PushSubsStack("ParseObjectsLayer (x2tilemap) ","x2tilemap",20,__ref.getField(false, "ba"),__ref,95);
if (RapidSub.canDelegate("parseobjectslayer")) { return __ref.runUserSub(false, "x2tilemap","parseobjectslayer", __ref, _layer);}
RemoteObject _ol = RemoteObject.declareNull("b4a.example.x2tilemap._x2objectslayer");
RemoteObject _objects = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _om = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _template = RemoteObject.declareNull("b4a.example.x2tilemap._x2tileobjecttemplate");
Debug.locals.put("layer", _layer);
 BA.debugLineNum = 95;BA.debugLine="Private Sub ParseObjectsLayer (layer As Map)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 96;BA.debugLine="Dim ol As X2ObjectsLayer";
Debug.JustUpdateDeviceLine();
_ol = RemoteObject.createNew ("b4a.example.x2tilemap._x2objectslayer");Debug.locals.put("ol", _ol);
 BA.debugLineNum = 97;BA.debugLine="ol.Initialize";
Debug.JustUpdateDeviceLine();
_ol.runVoidMethod ("Initialize");
 BA.debugLineNum = 98;BA.debugLine="ol.ObjectsById.Initialize";
Debug.JustUpdateDeviceLine();
_ol.getField(false,"ObjectsById" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 99;BA.debugLine="ol.ObjectsByName.Initialize";
Debug.JustUpdateDeviceLine();
_ol.getField(false,"ObjectsByName" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 100;BA.debugLine="ol.Name = layer.Get(\"name\")";
Debug.JustUpdateDeviceLine();
_ol.setField ("Name" /*RemoteObject*/ ,BA.ObjectToString(_layer.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name"))))));
 BA.debugLineNum = 101;BA.debugLine="Dim objects As List = layer.Get(\"objects\")";
Debug.JustUpdateDeviceLine();
_objects = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_objects = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _layer.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("objects")))));Debug.locals.put("objects", _objects);Debug.locals.put("objects", _objects);
 BA.debugLineNum = 103;BA.debugLine="For i = 0 To objects.Size - 1";
Debug.JustUpdateDeviceLine();
{
final int step7 = 1;
final int limit7 = RemoteObject.solve(new RemoteObject[] {_objects.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7) ;_i = ((int)(0 + _i + step7))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 104;BA.debugLine="Dim om As Map = objects.Get(i)";
Debug.JustUpdateDeviceLine();
_om = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_om = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _objects.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("om", _om);Debug.locals.put("om", _om);
 BA.debugLineNum = 105;BA.debugLine="If om.ContainsKey(\"gid\") Then";
Debug.JustUpdateDeviceLine();
if (_om.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("gid")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 106;BA.debugLine="If om.Get(\"name\") <> \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_om.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name")))),RemoteObject.createImmutable(("")))) { 
 BA.debugLineNum = 107;BA.debugLine="Log($\"Skipping tile object: (${om.Get(\"name\")}";
Debug.JustUpdateDeviceLine();
x2tilemap.__c.runVoidMethod ("LogImpl","915204364",(RemoteObject.concat(RemoteObject.createImmutable("Skipping tile object: ("),x2tilemap.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_om.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name")))))),RemoteObject.createImmutable(")"))),0);
 };
 BA.debugLineNum = 109;BA.debugLine="Continue";
Debug.JustUpdateDeviceLine();
if (true) continue;
 };
 BA.debugLineNum = 111;BA.debugLine="If om.Get(\"type\") <> \"x2\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_om.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("type")))),RemoteObject.createImmutable(("x2")))) { 
 BA.debugLineNum = 112;BA.debugLine="Log($\"Type should be set to x2 (${om.Get(\"name\"";
Debug.JustUpdateDeviceLine();
x2tilemap.__c.runVoidMethod ("LogImpl","915204369",(RemoteObject.concat(RemoteObject.createImmutable("Type should be set to x2 ("),x2tilemap.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_om.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name")))))),RemoteObject.createImmutable(")"))),0);
 BA.debugLineNum = 113;BA.debugLine="Continue";
Debug.JustUpdateDeviceLine();
if (true) continue;
 };
 BA.debugLineNum = 115;BA.debugLine="Dim template As X2TileObjectTemplate";
Debug.JustUpdateDeviceLine();
_template = RemoteObject.createNew ("b4a.example.x2tilemap._x2tileobjecttemplate");Debug.locals.put("template", _template);
 BA.debugLineNum = 116;BA.debugLine="template.Initialize";
Debug.JustUpdateDeviceLine();
_template.runVoidMethod ("Initialize");
 BA.debugLineNum = 117;BA.debugLine="template.ObjectLayer = ol";
Debug.JustUpdateDeviceLine();
_template.setField ("ObjectLayer" /*RemoteObject*/ ,_ol);
 BA.debugLineNum = 118;BA.debugLine="template.Id = om.Get(\"id\")";
Debug.JustUpdateDeviceLine();
_template.setField ("Id" /*RemoteObject*/ ,BA.numberCast(int.class, _om.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 BA.debugLineNum = 119;BA.debugLine="template.Name = om.Get(\"name\")";
Debug.JustUpdateDeviceLine();
_template.setField ("Name" /*RemoteObject*/ ,BA.ObjectToString(_om.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name"))))));
 BA.debugLineNum = 120;BA.debugLine="template.Props = om";
Debug.JustUpdateDeviceLine();
_template.setField ("Props" /*RemoteObject*/ ,_om);
 BA.debugLineNum = 121;BA.debugLine="If om.ContainsKey(\"properties\") = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_om.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("properties")))),x2tilemap.__c.getField(true,"False"))) { 
 BA.debugLineNum = 122;BA.debugLine="template.CustomProps.Initialize";
Debug.JustUpdateDeviceLine();
_template.getField(false,"CustomProps" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 }else {
 BA.debugLineNum = 124;BA.debugLine="If TileMapVersion >= 1.2 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("g",__ref.getField(true,"_tilemapversion" /*RemoteObject*/ ),BA.numberCast(double.class, 1.2))) { 
 BA.debugLineNum = 125;BA.debugLine="template.CustomProps = ReadCustomProps(om.Get(";
Debug.JustUpdateDeviceLine();
_template.setField ("CustomProps" /*RemoteObject*/ ,__ref.runClassMethod (b4a.example.x2tilemap.class, "_readcustomprops" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _om.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("properties")))))));
 }else {
 BA.debugLineNum = 127;BA.debugLine="template.CustomProps = ConvertMapToWritableMap";
Debug.JustUpdateDeviceLine();
_template.setField ("CustomProps" /*RemoteObject*/ ,__ref.runClassMethod (b4a.example.x2tilemap.class, "_convertmaptowritablemapifneeded" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _om.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("properties")))))));
 };
 };
 BA.debugLineNum = 130;BA.debugLine="template.FirstTime = True";
Debug.JustUpdateDeviceLine();
_template.setField ("FirstTime" /*RemoteObject*/ ,x2tilemap.__c.getField(true,"True"));
 BA.debugLineNum = 132;BA.debugLine="ol.ObjectsById.Put(template.Id, template)";
Debug.JustUpdateDeviceLine();
_ol.getField(false,"ObjectsById" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_template.getField(true,"Id" /*RemoteObject*/ ))),(Object)((_template)));
 BA.debugLineNum = 133;BA.debugLine="ol.ObjectsByName.Put(template.Name, template)";
Debug.JustUpdateDeviceLine();
_ol.getField(false,"ObjectsByName" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_template.getField(true,"Name" /*RemoteObject*/ ))),(Object)((_template)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 135;BA.debugLine="Layers.Put(ol.Name, ol)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_layers" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_ol.getField(true,"Name" /*RemoteObject*/ ))),(Object)((_ol)));
 BA.debugLineNum = 136;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _parsetilelayer(RemoteObject __ref,RemoteObject _layer) throws Exception{
try {
		Debug.PushSubsStack("ParseTileLayer (x2tilemap) ","x2tilemap",20,__ref.getField(false, "ba"),__ref,242);
if (RapidSub.canDelegate("parsetilelayer")) { return __ref.runUserSub(false, "x2tilemap","parsetilelayer", __ref, _layer);}
RemoteObject _compression = RemoteObject.createImmutable("");
RemoteObject _bytes = null;
RemoteObject _tiles = null;
int _y = 0;
int _x = 0;
RemoteObject _l = RemoteObject.declareNull("b4a.example.x2tilemap._x2internaltilelayer");
Debug.locals.put("layer", _layer);
 BA.debugLineNum = 242;BA.debugLine="Private Sub ParseTileLayer (layer As Map)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 243;BA.debugLine="If layer.GetDefault(\"encoding\", \"\") <> \"base64\" T";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_layer.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("encoding"))),(Object)((RemoteObject.createImmutable("")))),RemoteObject.createImmutable(("base64")))) { 
 BA.debugLineNum = 244;BA.debugLine="Log(\"ERROR: Invalid encoding!!!\")";
Debug.JustUpdateDeviceLine();
x2tilemap.__c.runVoidMethod ("LogImpl","915532034",RemoteObject.createImmutable("ERROR: Invalid encoding!!!"),0);
 BA.debugLineNum = 245;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 247;BA.debugLine="Dim compression As String = layer.GetDefault(\"com";
Debug.JustUpdateDeviceLine();
_compression = BA.ObjectToString(_layer.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("compression"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("compression", _compression);Debug.locals.put("compression", _compression);
 BA.debugLineNum = 248;BA.debugLine="If compression <> \"gzip\" And compression <> \"zlib";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_compression,BA.ObjectToString("gzip")) && RemoteObject.solveBoolean("!",_compression,BA.ObjectToString("zlib"))) { 
 BA.debugLineNum = 249;BA.debugLine="Log(\"ERROR: Invalid compression!!!\")";
Debug.JustUpdateDeviceLine();
x2tilemap.__c.runVoidMethod ("LogImpl","915532039",RemoteObject.createImmutable("ERROR: Invalid compression!!!"),0);
 BA.debugLineNum = 250;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 252;BA.debugLine="Dim bytes() As Byte = su.DecodeBase64(layer.Get(\"";
Debug.JustUpdateDeviceLine();
_bytes = __ref.getField(false,"_su" /*RemoteObject*/ ).runMethod(false,"DecodeBase64",(Object)(BA.ObjectToString(_layer.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("data")))))));Debug.locals.put("bytes", _bytes);Debug.locals.put("bytes", _bytes);
 BA.debugLineNum = 253;BA.debugLine="bytes = cs.DecompressBytes(bytes, compression)";
Debug.JustUpdateDeviceLine();
_bytes = __ref.getField(false,"_cs" /*RemoteObject*/ ).runMethod(false,"DecompressBytes",(Object)(_bytes),(Object)(_compression));Debug.locals.put("bytes", _bytes);
 BA.debugLineNum = 254;BA.debugLine="raf.Initialize3(bytes, True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_raf" /*RemoteObject*/ ).runVoidMethod ("Initialize3",(Object)(_bytes),(Object)(x2tilemap.__c.getField(true,"True")));
 BA.debugLineNum = 255;BA.debugLine="Dim tiles(TilesPerRow * TilesPerColumn) As X2Tile";
Debug.JustUpdateDeviceLine();
_tiles = RemoteObject.createNewArray ("b4a.example.x2tilemap._x2tile", new int[] {RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_tilesperrow" /*RemoteObject*/ ),__ref.getField(true,"_tilespercolumn" /*RemoteObject*/ )}, "*",0, 1).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("tiles", _tiles);
 BA.debugLineNum = 256;BA.debugLine="For y = 0 To TilesPerColumn - 1";
Debug.JustUpdateDeviceLine();
{
final int step14 = 1;
final int limit14 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_tilespercolumn" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_y = 0 ;
for (;(step14 > 0 && _y <= limit14) || (step14 < 0 && _y >= limit14) ;_y = ((int)(0 + _y + step14))  ) {
Debug.locals.put("y", _y);
 BA.debugLineNum = 257;BA.debugLine="For x = 0 To TilesPerRow - 1";
Debug.JustUpdateDeviceLine();
{
final int step15 = 1;
final int limit15 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_tilesperrow" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_x = 0 ;
for (;(step15 > 0 && _x <= limit15) || (step15 < 0 && _x >= limit15) ;_x = ((int)(0 + _x + step15))  ) {
Debug.locals.put("x", _x);
 BA.debugLineNum = 258;BA.debugLine="tiles(y * TilesPerRow + x).TileIdentifier = raf";
Debug.JustUpdateDeviceLine();
_tiles.getArrayElement(false, /*RemoteObject*/ RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_y),__ref.getField(true,"_tilesperrow" /*RemoteObject*/ ),RemoteObject.createImmutable(_x)}, "*+",1, 1)).setField ("TileIdentifier" /*RemoteObject*/ ,__ref.getField(false,"_raf" /*RemoteObject*/ ).runMethod(true,"ReadInt",(Object)(__ref.getField(false,"_raf" /*RemoteObject*/ ).getField(true,"CurrentPosition"))));
 }
}Debug.locals.put("x", _x);
;
 }
}Debug.locals.put("y", _y);
;
 BA.debugLineNum = 261;BA.debugLine="Dim l As X2InternalTileLayer";
Debug.JustUpdateDeviceLine();
_l = RemoteObject.createNew ("b4a.example.x2tilemap._x2internaltilelayer");Debug.locals.put("l", _l);
 BA.debugLineNum = 262;BA.debugLine="l.Initialize";
Debug.JustUpdateDeviceLine();
_l.runVoidMethod ("Initialize");
 BA.debugLineNum = 263;BA.debugLine="l.Name = layer.Get(\"name\")";
Debug.JustUpdateDeviceLine();
_l.setField ("Name" /*RemoteObject*/ ,BA.ObjectToString(_layer.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name"))))));
 BA.debugLineNum = 264;BA.debugLine="l.Tiles = tiles";
Debug.JustUpdateDeviceLine();
_l.setField ("Tiles" /*RemoteObject*/ ,_tiles);
 BA.debugLineNum = 265;BA.debugLine="Layers.Put(l.Name, l)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_layers" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_l.getField(true,"Name" /*RemoteObject*/ ))),(Object)((_l)));
 BA.debugLineNum = 266;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _prepareobjectsdef(RemoteObject __ref,RemoteObject _layer) throws Exception{
try {
		Debug.PushSubsStack("PrepareObjectsDef (x2tilemap) ","x2tilemap",20,__ref.getField(false, "ba"),__ref,162);
if (RapidSub.canDelegate("prepareobjectsdef")) { return __ref.runUserSub(false, "x2tilemap","prepareobjectsdef", __ref, _layer);}
RemoteObject _ol = RemoteObject.declareNull("b4a.example.x2tilemap._x2objectslayer");
RemoteObject _template = RemoteObject.declareNull("b4a.example.x2tilemap._x2tileobjecttemplate");
Debug.locals.put("Layer", _layer);
 BA.debugLineNum = 162;BA.debugLine="Public Sub PrepareObjectsDef (Layer As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 163;BA.debugLine="Dim ol As X2ObjectsLayer = Layers.Get(Layer)";
Debug.JustUpdateDeviceLine();
_ol = (__ref.getField(false,"_layers" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_layer))));Debug.locals.put("ol", _ol);Debug.locals.put("ol", _ol);
 BA.debugLineNum = 164;BA.debugLine="For Each template As X2TileObjectTemplate In ol.O";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group2 = _ol.getField(false,"ObjectsById" /*RemoteObject*/ ).runMethod(false,"Values");
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_template = (group2.runMethod(false,"Get",index2));Debug.locals.put("template", _template);
Debug.locals.put("template", _template);
 BA.debugLineNum = 165;BA.debugLine="template.Position = MapXYToWorldVec(template.Pro";
Debug.JustUpdateDeviceLine();
_template.setField ("Position" /*RemoteObject*/ ,__ref.runClassMethod (b4a.example.x2tilemap.class, "_mapxytoworldvec" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, _template.getField(false,"Props" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("x")))))),(Object)(BA.numberCast(float.class, _template.getField(false,"Props" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("y"))))))));
 BA.debugLineNum = 166;BA.debugLine="template.Tag = template.CustomProps.GetDefault(\"";
Debug.JustUpdateDeviceLine();
_template.setField ("Tag" /*RemoteObject*/ ,BA.ObjectToString(_template.getField(false,"CustomProps" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("tag"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 167;BA.debugLine="If GetCustomProperty(template, \"copy from id\") =";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4a.example.x2tilemap.class, "_getcustomproperty" /*RemoteObject*/ ,(Object)(_template),(Object)(RemoteObject.createImmutable("copy from id"))),RemoteObject.createImmutable((0)))) { 
 BA.debugLineNum = 168;BA.debugLine="CreateBodyDefAndFixtureDef(template)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.x2tilemap.class, "_createbodydefandfixturedef" /*RemoteObject*/ ,(Object)(_template));
 };
 }
}Debug.locals.put("template", _template);
;
 BA.debugLineNum = 171;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _readcustomprops(RemoteObject __ref,RemoteObject _list) throws Exception{
try {
		Debug.PushSubsStack("ReadCustomProps (x2tilemap) ","x2tilemap",20,__ref.getField(false, "ba"),__ref,138);
if (RapidSub.canDelegate("readcustomprops")) { return __ref.runUserSub(false, "x2tilemap","readcustomprops", __ref, _list);}
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("list", _list);
 BA.debugLineNum = 138;BA.debugLine="Private Sub ReadCustomProps (list As List) As Map";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 139;BA.debugLine="Dim res As Map";
Debug.JustUpdateDeviceLine();
_res = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("res", _res);
 BA.debugLineNum = 140;BA.debugLine="res.Initialize";
Debug.JustUpdateDeviceLine();
_res.runVoidMethod ("Initialize");
 BA.debugLineNum = 141;BA.debugLine="For Each p As Map In list";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group3 = _list;
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group3.runMethod(false,"Get",index3));Debug.locals.put("p", _p);
Debug.locals.put("p", _p);
 BA.debugLineNum = 142;BA.debugLine="res.Put(p.Get(\"name\"), p.Get(\"value\"))";
Debug.JustUpdateDeviceLine();
_res.runVoidMethod ("Put",(Object)(_p.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name"))))),(Object)(_p.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("value"))))));
 }
}Debug.locals.put("p", _p);
;
 BA.debugLineNum = 144;BA.debugLine="Return res";
Debug.JustUpdateDeviceLine();
if (true) return _res;
 BA.debugLineNum = 145;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _readjson(RemoteObject __ref,RemoteObject _dir,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("ReadJson (x2tilemap) ","x2tilemap",20,__ref.getField(false, "ba"),__ref,452);
if (RapidSub.canDelegate("readjson")) { return __ref.runUserSub(false, "x2tilemap","readjson", __ref, _dir, _filename);}
Debug.locals.put("Dir", _dir);
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 452;BA.debugLine="Private Sub ReadJson (Dir As String, FileName As S";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 453;BA.debugLine="parser.Initialize(File.ReadString(Dir, FileName))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_parser" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(x2tilemap.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(_dir),(Object)(_filename))));
 BA.debugLineNum = 454;BA.debugLine="Return parser.NextObject";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_parser" /*RemoteObject*/ ).runMethod(false,"NextObject");
 BA.debugLineNum = 455;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _readobjectstemplate(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ReadObjectsTemplate (x2tilemap) ","x2tilemap",20,__ref.getField(false, "ba"),__ref,83);
if (RapidSub.canDelegate("readobjectstemplate")) { return __ref.runUserSub(false, "x2tilemap","readobjectstemplate", __ref);}
RemoteObject _l1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _props = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 83;BA.debugLine="Private Sub ReadObjectsTemplate";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 84;BA.debugLine="DefaultCustomProperties.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_defaultcustomproperties" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 85;BA.debugLine="parser.Initialize(File.ReadString(File.DirAssets,";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_parser" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(x2tilemap.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(x2tilemap.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("objecttypes.json")))));
 BA.debugLineNum = 86;BA.debugLine="Dim l1 As List = parser.NextArray";
Debug.JustUpdateDeviceLine();
_l1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_l1 = __ref.getField(false,"_parser" /*RemoteObject*/ ).runMethod(false,"NextArray");Debug.locals.put("l1", _l1);Debug.locals.put("l1", _l1);
 BA.debugLineNum = 87;BA.debugLine="Dim m As Map = l1.Get(0)";
Debug.JustUpdateDeviceLine();
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _l1.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 88;BA.debugLine="Dim props As List = m.Get(\"properties\")";
Debug.JustUpdateDeviceLine();
_props = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_props = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("properties")))));Debug.locals.put("props", _props);Debug.locals.put("props", _props);
 BA.debugLineNum = 89;BA.debugLine="For Each p As Map In props";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group6 = _props;
final int groupLen6 = group6.runMethod(true,"getSize").<Integer>get()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group6.runMethod(false,"Get",index6));Debug.locals.put("p", _p);
Debug.locals.put("p", _p);
 BA.debugLineNum = 90;BA.debugLine="DefaultCustomProperties.Put(p.Get(\"name\"), p.Get";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_defaultcustomproperties" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(_p.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name"))))),(Object)(_p.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("value"))))));
 }
}Debug.locals.put("p", _p);
;
 BA.debugLineNum = 92;BA.debugLine="Log($\"Loading objecttypes.json v${DefaultCustomPr";
Debug.JustUpdateDeviceLine();
x2tilemap.__c.runVoidMethod ("LogImpl","915138825",(RemoteObject.concat(RemoteObject.createImmutable("Loading objecttypes.json v"),x2tilemap.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(__ref.getField(false,"_defaultcustomproperties" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("x2 tiled version")))))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 93;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbackgroundbitmap(RemoteObject __ref,RemoteObject _bmp) throws Exception{
try {
		Debug.PushSubsStack("SetBackgroundBitmap (x2tilemap) ","x2tilemap",20,__ref.getField(false, "ba"),__ref,485);
if (RapidSub.canDelegate("setbackgroundbitmap")) { return __ref.runUserSub(false, "x2tilemap","setbackgroundbitmap", __ref, _bmp);}
Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 485;BA.debugLine="Public Sub SetBackgroundBitmap (bmp As B4XBitmap)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 486;BA.debugLine="BackgroundColorBC.CopyPixelsFromBitmap(bmp)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_backgroundcolorbc" /*RemoteObject*/ ).runVoidMethod ("_copypixelsfrombitmap",(Object)(_bmp));
 BA.debugLineNum = 487;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbackgroundcolor(RemoteObject __ref,RemoteObject _clr) throws Exception{
try {
		Debug.PushSubsStack("SetBackgroundColor (x2tilemap) ","x2tilemap",20,__ref.getField(false, "ba"),__ref,481);
if (RapidSub.canDelegate("setbackgroundcolor")) { return __ref.runUserSub(false, "x2tilemap","setbackgroundcolor", __ref, _clr);}
Debug.locals.put("clr", _clr);
 BA.debugLineNum = 481;BA.debugLine="Public Sub SetBackgroundColor (clr As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 482;BA.debugLine="BackgroundColorBC.FillRect(clr, BackgroundColorBC";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_backgroundcolorbc" /*RemoteObject*/ ).runVoidMethod ("_fillrect",(Object)(_clr),(Object)(__ref.getField(false,"_backgroundcolorbc" /*RemoteObject*/ ).getField(false,"_targetrect")));
 BA.debugLineNum = 483;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdimensionsshared(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetDimensionsShared (x2tilemap) ","x2tilemap",20,__ref.getField(false, "ba"),__ref,299);
if (RapidSub.canDelegate("setdimensionsshared")) { return __ref.runUserSub(false, "x2tilemap","setdimensionsshared", __ref);}
 BA.debugLineNum = 299;BA.debugLine="Private Sub SetDimensionsShared";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 300;BA.debugLine="MapXToMeter = TileWidthMeters / OriginalTileWidth";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mapxtometer" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_tilewidthmeters" /*RemoteObject*/ ),__ref.getField(true,"_originaltilewidthpixels" /*RemoteObject*/ )}, "/",0, 0)));
 BA.debugLineNum = 301;BA.debugLine="MapYToMeter = TileHeightMeters / OriginalTileHeig";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mapytometer" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_tileheightmeters" /*RemoteObject*/ ),__ref.getField(true,"_originaltileheightpixels" /*RemoteObject*/ )}, "/",0, 0)));
 BA.debugLineNum = 302;BA.debugLine="MapAABB.Initialize2(X2.CreateVec2(0, 0), X2.Creat";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mapaabb" /*RemoteObject*/ ).runVoidMethod ("Initialize2",(Object)(__ref.getField(false,"_x2" /*RemoteObject*/ ).runClassMethod (b4a.example.x2utils.class, "_createvec2" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)))),(Object)(__ref.getField(false,"_x2" /*RemoteObject*/ ).runClassMethod (b4a.example.x2utils.class, "_createvec2" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_tilewidthmeters" /*RemoteObject*/ ),__ref.getField(true,"_tilesperrow" /*RemoteObject*/ )}, "*",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_tileheightmeters" /*RemoteObject*/ ),__ref.getField(true,"_tilespercolumn" /*RemoteObject*/ )}, "*",0, 0))))));
 BA.debugLineNum = 303;BA.debugLine="Log($\"TileMap: AABB: ${MapAABB}, Map Pixels (X) p";
Debug.JustUpdateDeviceLine();
x2tilemap.__c.runVoidMethod ("LogImpl","915728644",(RemoteObject.concat(RemoteObject.createImmutable("TileMap: AABB: "),x2tilemap.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_mapaabb" /*RemoteObject*/ )))),RemoteObject.createImmutable(", Map Pixels (X) per Meter: "),x2tilemap.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("1.2")),(Object)((RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(1),__ref.getField(true,"_mapxtometer" /*RemoteObject*/ )}, "/",0, 0)))),RemoteObject.createImmutable(", Map Pixels (Y) per Meter: "),x2tilemap.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("1.2")),(Object)((RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(1),__ref.getField(true,"_mapytometer" /*RemoteObject*/ )}, "/",0, 0)))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 304;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setsingletiledimensionsinbcpixels(RemoteObject __ref,RemoteObject _widthpixels,RemoteObject _heightpixels) throws Exception{
try {
		Debug.PushSubsStack("SetSingleTileDimensionsInBCPixels (x2tilemap) ","x2tilemap",20,__ref.getField(false, "ba"),__ref,283);
if (RapidSub.canDelegate("setsingletiledimensionsinbcpixels")) { return __ref.runUserSub(false, "x2tilemap","setsingletiledimensionsinbcpixels", __ref, _widthpixels, _heightpixels);}
Debug.locals.put("WidthPixels", _widthpixels);
Debug.locals.put("HeightPixels", _heightpixels);
 BA.debugLineNum = 283;BA.debugLine="Public Sub SetSingleTileDimensionsInBCPixels (Widt";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 284;BA.debugLine="TileWidthPixels = WidthPixels";
Debug.JustUpdateDeviceLine();
__ref.setField ("_tilewidthpixels" /*RemoteObject*/ ,_widthpixels);
 BA.debugLineNum = 285;BA.debugLine="TileHeightPixels = HeightPixels";
Debug.JustUpdateDeviceLine();
__ref.setField ("_tileheightpixels" /*RemoteObject*/ ,_heightpixels);
 BA.debugLineNum = 286;BA.debugLine="TileWidthMeters = TileWidthPixels / X2.mBCPixelsP";
Debug.JustUpdateDeviceLine();
__ref.setField ("_tilewidthmeters" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_tilewidthpixels" /*RemoteObject*/ ),__ref.getField(false,"_x2" /*RemoteObject*/ ).getField(true,"_mbcpixelspermeter" /*RemoteObject*/ )}, "/",0, 0)));
 BA.debugLineNum = 287;BA.debugLine="TileHeightMeters = TileHeightPixels / X2.mBCPixel";
Debug.JustUpdateDeviceLine();
__ref.setField ("_tileheightmeters" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_tileheightpixels" /*RemoteObject*/ ),__ref.getField(false,"_x2" /*RemoteObject*/ ).getField(true,"_mbcpixelspermeter" /*RemoteObject*/ )}, "/",0, 0)));
 BA.debugLineNum = 288;BA.debugLine="SingleTileBC.Initialize(TileWidthPixels, TileHeig";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_singletilebc" /*RemoteObject*/ ).runVoidMethod ("_initialize",__ref.getField(false, "ba"),(Object)(__ref.getField(true,"_tilewidthpixels" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_tileheightpixels" /*RemoteObject*/ )));
 BA.debugLineNum = 289;BA.debugLine="MetersToPixelsX = TileWidthPixels / TileWidthMete";
Debug.JustUpdateDeviceLine();
__ref.setField ("_meterstopixelsx" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_tilewidthpixels" /*RemoteObject*/ ),__ref.getField(true,"_tilewidthmeters" /*RemoteObject*/ )}, "/",0, 0)));
 BA.debugLineNum = 290;BA.debugLine="MetersToPixelsY = TileHeightPixels / TileHeightMe";
Debug.JustUpdateDeviceLine();
__ref.setField ("_meterstopixelsy" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_tileheightpixels" /*RemoteObject*/ ),__ref.getField(true,"_tileheightmeters" /*RemoteObject*/ )}, "/",0, 0)));
 BA.debugLineNum = 291;BA.debugLine="MapRectPixels.Initialize(0, 0, TileWidthPixels *";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_maprectpixels" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_tilewidthpixels" /*RemoteObject*/ ),__ref.getField(true,"_tilesperrow" /*RemoteObject*/ )}, "*",0, 1))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_tileheightpixels" /*RemoteObject*/ ),__ref.getField(true,"_tilespercolumn" /*RemoteObject*/ )}, "*",0, 1))));
 BA.debugLineNum = 292;BA.debugLine="SetDimensionsShared";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.x2tilemap.class, "_setdimensionsshared" /*RemoteObject*/ );
 BA.debugLineNum = 293;BA.debugLine="If mTargetView <> Null And mTargetView.IsInitiali";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",__ref.getField(false,"_mtargetview" /*RemoteObject*/ )) && RemoteObject.solveBoolean(".",__ref.getField(false,"_mtargetview" /*RemoteObject*/ ).runMethod(true,"IsInitialized"))) { 
 BA.debugLineNum = 294;BA.debugLine="BackgroundColorBC.Initialize(X2.MainBC.mWidth, X";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_backgroundcolorbc" /*RemoteObject*/ ).runVoidMethod ("_initialize",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_x2" /*RemoteObject*/ ).getField(false,"_mainbc" /*RemoteObject*/ ).getField(true,"_mwidth")),(Object)(__ref.getField(false,"_x2" /*RemoteObject*/ ).getField(false,"_mainbc" /*RemoteObject*/ ).getField(true,"_mheight")));
 BA.debugLineNum = 295;BA.debugLine="SetBackgroundColor(xui.Color_Transparent)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.x2tilemap.class, "_setbackgroundcolor" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")));
 };
 BA.debugLineNum = 297;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setsingletiledimensionsinmeters(RemoteObject __ref,RemoteObject _widthmeters,RemoteObject _heightmeters) throws Exception{
try {
		Debug.PushSubsStack("SetSingleTileDimensionsInMeters (x2tilemap) ","x2tilemap",20,__ref.getField(false, "ba"),__ref,270);
if (RapidSub.canDelegate("setsingletiledimensionsinmeters")) { return __ref.runUserSub(false, "x2tilemap","setsingletiledimensionsinmeters", __ref, _widthmeters, _heightmeters);}
Debug.locals.put("WidthMeters", _widthmeters);
Debug.locals.put("HeightMeters", _heightmeters);
 BA.debugLineNum = 270;BA.debugLine="Public Sub SetSingleTileDimensionsInMeters (WidthM";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 271;BA.debugLine="If mTargetView <> Null And mTargetView.IsInitiali";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",__ref.getField(false,"_mtargetview" /*RemoteObject*/ )) && RemoteObject.solveBoolean(".",__ref.getField(false,"_mtargetview" /*RemoteObject*/ ).runMethod(true,"IsInitialized"))) { 
 BA.debugLineNum = 272;BA.debugLine="TileWidthPixels = Round(WidthMeters * X2.mBCPixe";
Debug.JustUpdateDeviceLine();
__ref.setField ("_tilewidthpixels" /*RemoteObject*/ ,BA.numberCast(int.class, x2tilemap.__c.runMethod(true,"Round",(Object)(RemoteObject.solve(new RemoteObject[] {_widthmeters,__ref.getField(false,"_x2" /*RemoteObject*/ ).getField(true,"_mbcpixelspermeter" /*RemoteObject*/ )}, "*",0, 0)))));
 BA.debugLineNum = 273;BA.debugLine="TileHeightPixels = Round(HeightMeters * X2.mBCPi";
Debug.JustUpdateDeviceLine();
__ref.setField ("_tileheightpixels" /*RemoteObject*/ ,BA.numberCast(int.class, x2tilemap.__c.runMethod(true,"Round",(Object)(RemoteObject.solve(new RemoteObject[] {_heightmeters,__ref.getField(false,"_x2" /*RemoteObject*/ ).getField(true,"_mbcpixelspermeter" /*RemoteObject*/ )}, "*",0, 0)))));
 BA.debugLineNum = 274;BA.debugLine="SetSingleTileDimensionsInBCPixels(TileWidthPixel";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.x2tilemap.class, "_setsingletiledimensionsinbcpixels" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_tilewidthpixels" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_tileheightpixels" /*RemoteObject*/ )));
 }else {
 BA.debugLineNum = 276;BA.debugLine="TileWidthMeters = WidthMeters";
Debug.JustUpdateDeviceLine();
__ref.setField ("_tilewidthmeters" /*RemoteObject*/ ,_widthmeters);
 BA.debugLineNum = 277;BA.debugLine="TileHeightMeters = HeightMeters";
Debug.JustUpdateDeviceLine();
__ref.setField ("_tileheightmeters" /*RemoteObject*/ ,_heightmeters);
 BA.debugLineNum = 278;BA.debugLine="SetDimensionsShared";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.x2tilemap.class, "_setdimensionsshared" /*RemoteObject*/ );
 };
 BA.debugLineNum = 280;BA.debugLine="End Sub";
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