package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class x2tilemap extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.x2tilemap");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.x2tilemap.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _x2internaltileset{
public boolean IsInitialized;
public b4a.example.bitmapcreator TilesBC;
public int Margin;
public int Spacing;
public int Count;
public int TileWidth;
public int TileHeight;
public String Name;
public int Columns;
public int FirstGID;
public void Initialize() {
IsInitialized = true;
TilesBC = new b4a.example.bitmapcreator();
Margin = 0;
Spacing = 0;
Count = 0;
TileWidth = 0;
TileHeight = 0;
Name = "";
Columns = 0;
FirstGID = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _x2internaltilelayer{
public boolean IsInitialized;
public String Name;
public b4a.example.x2tilemap._x2tile[] Tiles;
public void Initialize() {
IsInitialized = true;
Name = "";
Tiles = new b4a.example.x2tilemap._x2tile[0];
{
int d0 = Tiles.length;
for (int i0 = 0;i0 < d0;i0++) {
Tiles[i0] = new b4a.example.x2tilemap._x2tile();
}
}
;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _x2tileobjecttemplate{
public boolean IsInitialized;
public String Name;
public anywheresoftware.b4a.objects.collections.Map Props;
public anywheresoftware.b4a.objects.collections.Map CustomProps;
public anywheresoftware.b4a.objects.B2Fixture.B2FixtureDef FixtureDef;
public int Id;
public anywheresoftware.b4a.objects.B2Body.B2BodyDef BodyDef;
public boolean FirstTime;
public b4a.example.x2tilemap._x2objectslayer ObjectLayer;
public anywheresoftware.b4a.objects.B2Vec2 Position;
public String Tag;
public void Initialize() {
IsInitialized = true;
Name = "";
Props = new anywheresoftware.b4a.objects.collections.Map();
CustomProps = new anywheresoftware.b4a.objects.collections.Map();
FixtureDef = new anywheresoftware.b4a.objects.B2Fixture.B2FixtureDef();
Id = 0;
BodyDef = new anywheresoftware.b4a.objects.B2Body.B2BodyDef();
FirstTime = false;
ObjectLayer = new b4a.example.x2tilemap._x2objectslayer();
Position = new anywheresoftware.b4a.objects.B2Vec2();
Tag = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _x2objectslayer{
public boolean IsInitialized;
public String Name;
public anywheresoftware.b4a.objects.collections.Map ObjectsById;
public anywheresoftware.b4a.objects.collections.Map ObjectsByName;
public void Initialize() {
IsInitialized = true;
Name = "";
ObjectsById = new anywheresoftware.b4a.objects.collections.Map();
ObjectsByName = new anywheresoftware.b4a.objects.collections.Map();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _x2tile{
public boolean IsInitialized;
public b4a.example.bitmapcreator._compressedbc CBC;
public int TileIdentifier;
public void Initialize() {
IsInitialized = true;
CBC = new b4a.example.bitmapcreator._compressedbc();
TileIdentifier = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
public anywheresoftware.b4a.objects.collections.Map _tilesets = null;
public float _tilewidthmeters = 0f;
public float _tileheightmeters = 0f;
public int _originaltilewidthpixels = 0;
public int _originaltileheightpixels = 0;
public int _tilewidthpixels = 0;
public int _tileheightpixels = 0;
public float _meterstopixelsx = 0f;
public float _meterstopixelsy = 0f;
public int _mapbottomyoriginalpixels = 0;
public int _tilesperrow = 0;
public int _tilespercolumn = 0;
public b4a.example.bitmapcreator _singletilebc = null;
public anywheresoftware.b4a.objects.collections.Map _layers = null;
public anywheresoftware.b4a.objects.collections.Map _tilescbc = null;
public anywheresoftware.b4a.objects.B4XCanvas.B4XRect _maprectpixels = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public b4a.example.x2utils _x2 = null;
public int _flipped_horizontally = 0;
public int _flipped_vertically = 0;
public int _flipped_diagonally_flag = 0;
public anywheresoftware.b4a.objects.StringUtils _su = null;
public anywheresoftware.b4a.randomaccessfile.CompressedStreams _cs = null;
public anywheresoftware.b4a.randomaccessfile.RandomAccessFile _raf = null;
public float _mapxtometer = 0f;
public float _mapytometer = 0f;
public anywheresoftware.b4a.objects.collections.Map _defaultcustomproperties = null;
public b4a.example.bitmapcreator _backgroundcolorbc = null;
public anywheresoftware.b4a.objects.B2AABB _mapaabb = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mtargetview = null;
public b4a.example.bitmapcreator[] _targetviewbc = null;
public int _targetviewbcindex = 0;
public anywheresoftware.b4a.objects.B4XCanvas.B4XRect _reusetilesrect = null;
public anywheresoftware.b4a.objects.B2Vec2 _reusescreencenter = null;
public int _reusetiletop = 0;
public int _reusetileleft = 0;
public anywheresoftware.b4a.objects.B2Vec2 _lastdrawnscreencenterstarted = null;
public anywheresoftware.b4a.objects.B2Vec2 _lastdrawnscreencompleted = null;
public float _tilemapversion = 0f;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public String  _drawingcomplete(b4a.example.x2tilemap __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2tilemap";
if (Debug.shouldDelegate(ba, "drawingcomplete", true))
	 {return ((String) Debug.delegate(ba, "drawingcomplete", null));}
RDebugUtils.currentLine=16711680;
 //BA.debugLineNum = 16711680;BA.debugLine="Public Sub DrawingComplete";
RDebugUtils.currentLine=16711681;
 //BA.debugLineNum = 16711681;BA.debugLine="If TargetViewBC(TargetViewBCIndex).IsInitialized";
if (__ref._targetviewbc /*b4a.example.bitmapcreator[]*/ [__ref._targetviewbcindex /*int*/ ].IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=16711682;
 //BA.debugLineNum = 16711682;BA.debugLine="If LastDrawnScreenCompleted.Equals(LastDrawnScree";
if (__ref._lastdrawnscreencompleted /*anywheresoftware.b4a.objects.B2Vec2*/ .Equals(__ref._lastdrawnscreencenterstarted /*anywheresoftware.b4a.objects.B2Vec2*/ )) { 
if (true) return "";};
RDebugUtils.currentLine=16711683;
 //BA.debugLineNum = 16711683;BA.debugLine="LastDrawnScreenCompleted = LastDrawnScreenCenterS";
__ref._lastdrawnscreencompleted /*anywheresoftware.b4a.objects.B2Vec2*/  = __ref._lastdrawnscreencenterstarted /*anywheresoftware.b4a.objects.B2Vec2*/ .CreateCopy();
RDebugUtils.currentLine=16711684;
 //BA.debugLineNum = 16711684;BA.debugLine="X2.SetBitmapWithFitOrFill(mTargetView, TargetView";
__ref._x2 /*b4a.example.x2utils*/ ._setbitmapwithfitorfill /*String*/ (null,__ref._mtargetview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__ref._targetviewbc /*b4a.example.bitmapcreator[]*/ [__ref._targetviewbcindex /*int*/ ]._getbitmap());
RDebugUtils.currentLine=16711685;
 //BA.debugLineNum = 16711685;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.x2tilemap __ref,anywheresoftware.b4a.BA _ba,b4a.example.x2utils _vx2,String _dir,String _filename,anywheresoftware.b4a.objects.B4XViewWrapper _targetview) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="x2tilemap";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_vx2,_dir,_filename,_targetview}));}
anywheresoftware.b4a.objects.collections.Map _all = null;
anywheresoftware.b4a.objects.collections.List _tilesetslist = null;
anywheresoftware.b4a.objects.collections.Map _ts = null;
int _fgid = 0;
anywheresoftware.b4a.objects.collections.List _layerslist = null;
anywheresoftware.b4a.objects.collections.Map _layer = null;
RDebugUtils.currentLine=15073280;
 //BA.debugLineNum = 15073280;BA.debugLine="Public Sub Initialize (vX2 As X2Utils, Dir As Stri";
RDebugUtils.currentLine=15073281;
 //BA.debugLineNum = 15073281;BA.debugLine="X2 = vX2";
__ref._x2 /*b4a.example.x2utils*/  = _vx2;
RDebugUtils.currentLine=15073282;
 //BA.debugLineNum = 15073282;BA.debugLine="TileSets.Initialize";
__ref._tilesets /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=15073283;
 //BA.debugLineNum = 15073283;BA.debugLine="Layers.Initialize";
__ref._layers /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=15073284;
 //BA.debugLineNum = 15073284;BA.debugLine="Dim all As Map = ReadJson(Dir, FileName)";
_all = new anywheresoftware.b4a.objects.collections.Map();
_all = __ref._readjson /*anywheresoftware.b4a.objects.collections.Map*/ (null,_dir,_filename);
RDebugUtils.currentLine=15073285;
 //BA.debugLineNum = 15073285;BA.debugLine="Dim TileSetsList As List = all.Get(\"tilesets\")";
_tilesetslist = new anywheresoftware.b4a.objects.collections.List();
_tilesetslist = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_all.Get((Object)("tilesets"))));
RDebugUtils.currentLine=15073286;
 //BA.debugLineNum = 15073286;BA.debugLine="For Each ts As Map In TileSetsList";
_ts = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group6 = _tilesetslist;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_ts = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group6.Get(index6)));
RDebugUtils.currentLine=15073287;
 //BA.debugLineNum = 15073287;BA.debugLine="Dim fgid As Int = ts.Get(\"firstgid\")";
_fgid = (int)(BA.ObjectToNumber(_ts.Get((Object)("firstgid"))));
RDebugUtils.currentLine=15073288;
 //BA.debugLineNum = 15073288;BA.debugLine="If ts.ContainsKey(\"source\") Then";
if (_ts.ContainsKey((Object)("source"))) { 
RDebugUtils.currentLine=15073289;
 //BA.debugLineNum = 15073289;BA.debugLine="ts = ReadJson(Dir, ts.Get(\"source\"))";
_ts = __ref._readjson /*anywheresoftware.b4a.objects.collections.Map*/ (null,_dir,BA.ObjectToString(_ts.Get((Object)("source"))));
 };
RDebugUtils.currentLine=15073291;
 //BA.debugLineNum = 15073291;BA.debugLine="LoadTileSet (ts, fgid, Dir)";
__ref._loadtileset /*String*/ (null,_ts,_fgid,_dir);
 }
};
RDebugUtils.currentLine=15073294;
 //BA.debugLineNum = 15073294;BA.debugLine="TilesCBC.Initialize";
__ref._tilescbc /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=15073295;
 //BA.debugLineNum = 15073295;BA.debugLine="TilesPerRow = all.Get(\"width\")";
__ref._tilesperrow /*int*/  = (int)(BA.ObjectToNumber(_all.Get((Object)("width"))));
RDebugUtils.currentLine=15073296;
 //BA.debugLineNum = 15073296;BA.debugLine="TilesPerColumn = all.Get(\"height\")";
__ref._tilespercolumn /*int*/  = (int)(BA.ObjectToNumber(_all.Get((Object)("height"))));
RDebugUtils.currentLine=15073297;
 //BA.debugLineNum = 15073297;BA.debugLine="OriginalTileWidthPixels = all.Get(\"tilewidth\")";
__ref._originaltilewidthpixels /*int*/  = (int)(BA.ObjectToNumber(_all.Get((Object)("tilewidth"))));
RDebugUtils.currentLine=15073298;
 //BA.debugLineNum = 15073298;BA.debugLine="OriginalTileHeightPixels = all.Get(\"tileheight\")";
__ref._originaltileheightpixels /*int*/  = (int)(BA.ObjectToNumber(_all.Get((Object)("tileheight"))));
RDebugUtils.currentLine=15073299;
 //BA.debugLineNum = 15073299;BA.debugLine="TileMapVersion = all.GetDefault(\"version\", 1)";
__ref._tilemapversion /*float*/  = (float)(BA.ObjectToNumber(_all.GetDefault((Object)("version"),(Object)(1))));
RDebugUtils.currentLine=15073300;
 //BA.debugLineNum = 15073300;BA.debugLine="MapBottomYOriginalPixels = OriginalTileHeightPixe";
__ref._mapbottomyoriginalpixels /*int*/  = (int) (__ref._originaltileheightpixels /*int*/ *__ref._tilespercolumn /*int*/ );
RDebugUtils.currentLine=15073301;
 //BA.debugLineNum = 15073301;BA.debugLine="Dim LayersList As List = all.Get(\"layers\")";
_layerslist = new anywheresoftware.b4a.objects.collections.List();
_layerslist = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_all.Get((Object)("layers"))));
RDebugUtils.currentLine=15073302;
 //BA.debugLineNum = 15073302;BA.debugLine="For Each layer As Map In LayersList";
_layer = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group21 = _layerslist;
final int groupLen21 = group21.getSize()
;int index21 = 0;
;
for (; index21 < groupLen21;index21++){
_layer = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group21.Get(index21)));
RDebugUtils.currentLine=15073303;
 //BA.debugLineNum = 15073303;BA.debugLine="If layer.ContainsKey(\"data\") Then";
if (_layer.ContainsKey((Object)("data"))) { 
RDebugUtils.currentLine=15073304;
 //BA.debugLineNum = 15073304;BA.debugLine="ParseTileLayer(layer)";
__ref._parsetilelayer /*String*/ (null,_layer);
 }else 
{RDebugUtils.currentLine=15073305;
 //BA.debugLineNum = 15073305;BA.debugLine="Else if layer.ContainsKey(\"objects\") Then";
if (_layer.ContainsKey((Object)("objects"))) { 
RDebugUtils.currentLine=15073306;
 //BA.debugLineNum = 15073306;BA.debugLine="ParseObjectsLayer(layer)";
__ref._parseobjectslayer /*String*/ (null,_layer);
 }}
;
 }
};
RDebugUtils.currentLine=15073309;
 //BA.debugLineNum = 15073309;BA.debugLine="ReadObjectsTemplate";
__ref._readobjectstemplate /*String*/ (null);
RDebugUtils.currentLine=15073310;
 //BA.debugLineNum = 15073310;BA.debugLine="mTargetView = TargetView";
__ref._mtargetview /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _targetview;
RDebugUtils.currentLine=15073311;
 //BA.debugLineNum = 15073311;BA.debugLine="ReuseTilesRect.Initialize(-1, -1, -1, -1)";
__ref._reusetilesrect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .Initialize((float) (-1),(float) (-1),(float) (-1),(float) (-1));
RDebugUtils.currentLine=15073312;
 //BA.debugLineNum = 15073312;BA.debugLine="LastDrawnScreenCompleted.Set(-1, -1)";
__ref._lastdrawnscreencompleted /*anywheresoftware.b4a.objects.B2Vec2*/ .Set((float) (-1),(float) (-1));
RDebugUtils.currentLine=15073313;
 //BA.debugLineNum = 15073313;BA.debugLine="LastDrawnScreenCenterStarted.Set(-1, -1)";
__ref._lastdrawnscreencenterstarted /*anywheresoftware.b4a.objects.B2Vec2*/ .Set((float) (-1),(float) (-1));
RDebugUtils.currentLine=15073314;
 //BA.debugLineNum = 15073314;BA.debugLine="End Sub";
return "";
}
public String  _setsingletiledimensionsinbcpixels(b4a.example.x2tilemap __ref,int _widthpixels,int _heightpixels) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2tilemap";
if (Debug.shouldDelegate(ba, "setsingletiledimensionsinbcpixels", true))
	 {return ((String) Debug.delegate(ba, "setsingletiledimensionsinbcpixels", new Object[] {_widthpixels,_heightpixels}));}
RDebugUtils.currentLine=15663104;
 //BA.debugLineNum = 15663104;BA.debugLine="Public Sub SetSingleTileDimensionsInBCPixels (Widt";
RDebugUtils.currentLine=15663105;
 //BA.debugLineNum = 15663105;BA.debugLine="TileWidthPixels = WidthPixels";
__ref._tilewidthpixels /*int*/  = _widthpixels;
RDebugUtils.currentLine=15663106;
 //BA.debugLineNum = 15663106;BA.debugLine="TileHeightPixels = HeightPixels";
__ref._tileheightpixels /*int*/  = _heightpixels;
RDebugUtils.currentLine=15663107;
 //BA.debugLineNum = 15663107;BA.debugLine="TileWidthMeters = TileWidthPixels / X2.mBCPixelsP";
__ref._tilewidthmeters /*float*/  = (float) (__ref._tilewidthpixels /*int*/ /(double)__ref._x2 /*b4a.example.x2utils*/ ._mbcpixelspermeter /*float*/ );
RDebugUtils.currentLine=15663108;
 //BA.debugLineNum = 15663108;BA.debugLine="TileHeightMeters = TileHeightPixels / X2.mBCPixel";
__ref._tileheightmeters /*float*/  = (float) (__ref._tileheightpixels /*int*/ /(double)__ref._x2 /*b4a.example.x2utils*/ ._mbcpixelspermeter /*float*/ );
RDebugUtils.currentLine=15663109;
 //BA.debugLineNum = 15663109;BA.debugLine="SingleTileBC.Initialize(TileWidthPixels, TileHeig";
__ref._singletilebc /*b4a.example.bitmapcreator*/ ._initialize(ba,__ref._tilewidthpixels /*int*/ ,__ref._tileheightpixels /*int*/ );
RDebugUtils.currentLine=15663110;
 //BA.debugLineNum = 15663110;BA.debugLine="MetersToPixelsX = TileWidthPixels / TileWidthMete";
__ref._meterstopixelsx /*float*/  = (float) (__ref._tilewidthpixels /*int*/ /(double)__ref._tilewidthmeters /*float*/ );
RDebugUtils.currentLine=15663111;
 //BA.debugLineNum = 15663111;BA.debugLine="MetersToPixelsY = TileHeightPixels / TileHeightMe";
__ref._meterstopixelsy /*float*/  = (float) (__ref._tileheightpixels /*int*/ /(double)__ref._tileheightmeters /*float*/ );
RDebugUtils.currentLine=15663112;
 //BA.debugLineNum = 15663112;BA.debugLine="MapRectPixels.Initialize(0, 0, TileWidthPixels *";
__ref._maprectpixels /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .Initialize((float) (0),(float) (0),(float) (__ref._tilewidthpixels /*int*/ *__ref._tilesperrow /*int*/ ),(float) (__ref._tileheightpixels /*int*/ *__ref._tilespercolumn /*int*/ ));
RDebugUtils.currentLine=15663113;
 //BA.debugLineNum = 15663113;BA.debugLine="SetDimensionsShared";
__ref._setdimensionsshared /*String*/ (null);
RDebugUtils.currentLine=15663114;
 //BA.debugLineNum = 15663114;BA.debugLine="If mTargetView <> Null And mTargetView.IsInitiali";
if (__ref._mtargetview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ != null && __ref._mtargetview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=15663115;
 //BA.debugLineNum = 15663115;BA.debugLine="BackgroundColorBC.Initialize(X2.MainBC.mWidth, X";
__ref._backgroundcolorbc /*b4a.example.bitmapcreator*/ ._initialize(ba,__ref._x2 /*b4a.example.x2utils*/ ._mainbc /*b4a.example.bitmapcreator*/ ._mwidth,__ref._x2 /*b4a.example.x2utils*/ ._mainbc /*b4a.example.bitmapcreator*/ ._mheight);
RDebugUtils.currentLine=15663116;
 //BA.debugLineNum = 15663116;BA.debugLine="SetBackgroundColor(xui.Color_Transparent)";
__ref._setbackgroundcolor /*String*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
 };
RDebugUtils.currentLine=15663118;
 //BA.debugLineNum = 15663118;BA.debugLine="End Sub";
return "";
}
public String  _prepareobjectsdef(b4a.example.x2tilemap __ref,String _layer) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2tilemap";
if (Debug.shouldDelegate(ba, "prepareobjectsdef", true))
	 {return ((String) Debug.delegate(ba, "prepareobjectsdef", new Object[] {_layer}));}
b4a.example.x2tilemap._x2objectslayer _ol = null;
b4a.example.x2tilemap._x2tileobjecttemplate _template = null;
RDebugUtils.currentLine=15400960;
 //BA.debugLineNum = 15400960;BA.debugLine="Public Sub PrepareObjectsDef (Layer As String)";
RDebugUtils.currentLine=15400961;
 //BA.debugLineNum = 15400961;BA.debugLine="Dim ol As X2ObjectsLayer = Layers.Get(Layer)";
_ol = (b4a.example.x2tilemap._x2objectslayer)(__ref._layers /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_layer)));
RDebugUtils.currentLine=15400962;
 //BA.debugLineNum = 15400962;BA.debugLine="For Each template As X2TileObjectTemplate In ol.O";
{
final anywheresoftware.b4a.BA.IterableList group2 = _ol.ObjectsById /*anywheresoftware.b4a.objects.collections.Map*/ .Values();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_template = (b4a.example.x2tilemap._x2tileobjecttemplate)(group2.Get(index2));
RDebugUtils.currentLine=15400963;
 //BA.debugLineNum = 15400963;BA.debugLine="template.Position = MapXYToWorldVec(template.Pro";
_template.Position /*anywheresoftware.b4a.objects.B2Vec2*/  = __ref._mapxytoworldvec /*anywheresoftware.b4a.objects.B2Vec2*/ (null,(float)(BA.ObjectToNumber(_template.Props /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("x")))),(float)(BA.ObjectToNumber(_template.Props /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("y")))));
RDebugUtils.currentLine=15400964;
 //BA.debugLineNum = 15400964;BA.debugLine="template.Tag = template.CustomProps.GetDefault(\"";
_template.Tag /*String*/  = BA.ObjectToString(_template.CustomProps /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("tag"),(Object)("")));
RDebugUtils.currentLine=15400965;
 //BA.debugLineNum = 15400965;BA.debugLine="If GetCustomProperty(template, \"copy from id\") =";
if ((__ref._getcustomproperty /*Object*/ (null,_template,"copy from id")).equals((Object)(0))) { 
RDebugUtils.currentLine=15400966;
 //BA.debugLineNum = 15400966;BA.debugLine="CreateBodyDefAndFixtureDef(template)";
__ref._createbodydefandfixturedef /*String*/ (null,_template);
 };
 }
};
RDebugUtils.currentLine=15400969;
 //BA.debugLineNum = 15400969;BA.debugLine="End Sub";
return "";
}
public b4a.example.x2bodywrapper  _createobject2(b4a.example.x2tilemap __ref,String _objectlayer,int _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2tilemap";
if (Debug.shouldDelegate(ba, "createobject2", true))
	 {return ((b4a.example.x2bodywrapper) Debug.delegate(ba, "createobject2", new Object[] {_objectlayer,_id}));}
RDebugUtils.currentLine=15990784;
 //BA.debugLineNum = 15990784;BA.debugLine="Public Sub CreateObject2 (ObjectLayer As String, I";
RDebugUtils.currentLine=15990785;
 //BA.debugLineNum = 15990785;BA.debugLine="Return CreateObject(GetObjectTemplate(ObjectLayer";
if (true) return __ref._createobject /*b4a.example.x2bodywrapper*/ (null,__ref._getobjecttemplate /*b4a.example.x2tilemap._x2tileobjecttemplate*/ (null,_objectlayer,_id));
RDebugUtils.currentLine=15990786;
 //BA.debugLineNum = 15990786;BA.debugLine="End Sub";
return null;
}
public b4a.example.x2bodywrapper  _createobject2byname(b4a.example.x2tilemap __ref,String _objectlayer,String _name) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2tilemap";
if (Debug.shouldDelegate(ba, "createobject2byname", true))
	 {return ((b4a.example.x2bodywrapper) Debug.delegate(ba, "createobject2byname", new Object[] {_objectlayer,_name}));}
RDebugUtils.currentLine=16056320;
 //BA.debugLineNum = 16056320;BA.debugLine="Public Sub CreateObject2ByName (ObjectLayer As Str";
RDebugUtils.currentLine=16056321;
 //BA.debugLineNum = 16056321;BA.debugLine="Return CreateObject(GetObjectTemplateByName(Objec";
if (true) return __ref._createobject /*b4a.example.x2bodywrapper*/ (null,__ref._getobjecttemplatebyname /*b4a.example.x2tilemap._x2tileobjecttemplate*/ (null,_objectlayer,_name));
RDebugUtils.currentLine=16056322;
 //BA.debugLineNum = 16056322;BA.debugLine="End Sub";
return null;
}
public boolean  _drawscreen(b4a.example.x2tilemap __ref,anywheresoftware.b4a.objects.collections.List _layersnames,anywheresoftware.b4a.objects.collections.List _tasks) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2tilemap";
if (Debug.shouldDelegate(ba, "drawscreen", true))
	 {return ((Boolean) Debug.delegate(ba, "drawscreen", new Object[] {_layersnames,_tasks}));}
anywheresoftware.b4a.objects.B2Vec2 _drawcenter = null;
RDebugUtils.currentLine=16777216;
 //BA.debugLineNum = 16777216;BA.debugLine="Public Sub DrawScreen (LayersNames As List, Tasks";
RDebugUtils.currentLine=16777217;
 //BA.debugLineNum = 16777217;BA.debugLine="If X2.gs.ShouldDraw = False Then Return False";
if (__ref._x2 /*b4a.example.x2utils*/ ._gs /*b4a.example.x2utils._x2gamestep*/ .ShouldDraw /*boolean*/ ==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=16777218;
 //BA.debugLineNum = 16777218;BA.debugLine="Dim DrawCenter As B2Vec2 = X2.ScreenAABB.Center";
_drawcenter = __ref._x2 /*b4a.example.x2utils*/ ._screenaabb /*anywheresoftware.b4a.objects.B2AABB*/ .getCenter();
RDebugUtils.currentLine=16777219;
 //BA.debugLineNum = 16777219;BA.debugLine="If DrawCenter.Equals(LastDrawnScreenCenterStarted";
if (_drawcenter.Equals(__ref._lastdrawnscreencenterstarted /*anywheresoftware.b4a.objects.B2Vec2*/ ) || _drawcenter.Equals(__ref._lastdrawnscreencompleted /*anywheresoftware.b4a.objects.B2Vec2*/ )) { 
if (true) return __c.False;};
RDebugUtils.currentLine=16777220;
 //BA.debugLineNum = 16777220;BA.debugLine="LastDrawnScreenCenterStarted = DrawCenter.CreateC";
__ref._lastdrawnscreencenterstarted /*anywheresoftware.b4a.objects.B2Vec2*/  = _drawcenter.CreateCopy();
RDebugUtils.currentLine=16777221;
 //BA.debugLineNum = 16777221;BA.debugLine="Draw(LayersNames, X2.ScreenAABB, Tasks)";
__ref._draw /*String*/ (null,_layersnames,__ref._x2 /*b4a.example.x2utils*/ ._screenaabb /*anywheresoftware.b4a.objects.B2AABB*/ ,_tasks);
RDebugUtils.currentLine=16777222;
 //BA.debugLineNum = 16777222;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=16777223;
 //BA.debugLineNum = 16777223;BA.debugLine="End Sub";
return false;
}
public String  _class_globals(b4a.example.x2tilemap __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2tilemap";
RDebugUtils.currentLine=15007744;
 //BA.debugLineNum = 15007744;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=15007745;
 //BA.debugLineNum = 15007745;BA.debugLine="Private parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=15007746;
 //BA.debugLineNum = 15007746;BA.debugLine="Type X2InternalTileSet (TilesBC As BitmapCreator,";
;
RDebugUtils.currentLine=15007749;
 //BA.debugLineNum = 15007749;BA.debugLine="Type X2InternalTileLayer (Name As String, Tiles()";
;
RDebugUtils.currentLine=15007750;
 //BA.debugLineNum = 15007750;BA.debugLine="Type X2TileObjectTemplate (Name As String, Props";
;
RDebugUtils.currentLine=15007752;
 //BA.debugLineNum = 15007752;BA.debugLine="Type X2ObjectsLayer (Name As String, ObjectsById";
;
RDebugUtils.currentLine=15007753;
 //BA.debugLineNum = 15007753;BA.debugLine="Type X2Tile (CBC As CompressedBC, TileIdentifier";
;
RDebugUtils.currentLine=15007754;
 //BA.debugLineNum = 15007754;BA.debugLine="Private TileSets As Map";
_tilesets = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=15007755;
 //BA.debugLineNum = 15007755;BA.debugLine="Public TileWidthMeters As Float";
_tilewidthmeters = 0f;
RDebugUtils.currentLine=15007756;
 //BA.debugLineNum = 15007756;BA.debugLine="Public TileHeightMeters As Float";
_tileheightmeters = 0f;
RDebugUtils.currentLine=15007757;
 //BA.debugLineNum = 15007757;BA.debugLine="Private OriginalTileWidthPixels, OriginalTileHeig";
_originaltilewidthpixels = 0;
_originaltileheightpixels = 0;
RDebugUtils.currentLine=15007758;
 //BA.debugLineNum = 15007758;BA.debugLine="Private TileWidthPixels, TileHeightPixels As Int";
_tilewidthpixels = 0;
_tileheightpixels = 0;
RDebugUtils.currentLine=15007759;
 //BA.debugLineNum = 15007759;BA.debugLine="Private MetersToPixelsX, MetersToPixelsY As Float";
_meterstopixelsx = 0f;
_meterstopixelsy = 0f;
RDebugUtils.currentLine=15007760;
 //BA.debugLineNum = 15007760;BA.debugLine="Private MapBottomYOriginalPixels As Int";
_mapbottomyoriginalpixels = 0;
RDebugUtils.currentLine=15007761;
 //BA.debugLineNum = 15007761;BA.debugLine="Public TilesPerRow As Int";
_tilesperrow = 0;
RDebugUtils.currentLine=15007762;
 //BA.debugLineNum = 15007762;BA.debugLine="Public TilesPerColumn As Int";
_tilespercolumn = 0;
RDebugUtils.currentLine=15007763;
 //BA.debugLineNum = 15007763;BA.debugLine="Public SingleTileBC As BitmapCreator";
_singletilebc = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=15007764;
 //BA.debugLineNum = 15007764;BA.debugLine="Public Layers As Map";
_layers = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=15007765;
 //BA.debugLineNum = 15007765;BA.debugLine="Private TilesCBC As Map";
_tilescbc = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=15007766;
 //BA.debugLineNum = 15007766;BA.debugLine="Private MapRectPixels As B4XRect";
_maprectpixels = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=15007767;
 //BA.debugLineNum = 15007767;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=15007768;
 //BA.debugLineNum = 15007768;BA.debugLine="Private X2 As X2Utils";
_x2 = new b4a.example.x2utils();
RDebugUtils.currentLine=15007769;
 //BA.debugLineNum = 15007769;BA.debugLine="Private const FLIPPED_HORIZONTALLY = 0x80000000,";
_flipped_horizontally = ((int)0x80000000);
_flipped_vertically = ((int)0x40000000);
_flipped_diagonally_flag = ((int)0x20000000);
RDebugUtils.currentLine=15007770;
 //BA.debugLineNum = 15007770;BA.debugLine="Private su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=15007771;
 //BA.debugLineNum = 15007771;BA.debugLine="Private cs As CompressedStreams";
_cs = new anywheresoftware.b4a.randomaccessfile.CompressedStreams();
RDebugUtils.currentLine=15007772;
 //BA.debugLineNum = 15007772;BA.debugLine="Private raf As RandomAccessFile";
_raf = new anywheresoftware.b4a.randomaccessfile.RandomAccessFile();
RDebugUtils.currentLine=15007773;
 //BA.debugLineNum = 15007773;BA.debugLine="Public MapXToMeter, MapYToMeter As Float";
_mapxtometer = 0f;
_mapytometer = 0f;
RDebugUtils.currentLine=15007774;
 //BA.debugLineNum = 15007774;BA.debugLine="Private DefaultCustomProperties As Map";
_defaultcustomproperties = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=15007775;
 //BA.debugLineNum = 15007775;BA.debugLine="Private BackgroundColorBC As BitmapCreator";
_backgroundcolorbc = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=15007776;
 //BA.debugLineNum = 15007776;BA.debugLine="Public MapAABB As B2AABB";
_mapaabb = new anywheresoftware.b4a.objects.B2AABB();
RDebugUtils.currentLine=15007777;
 //BA.debugLineNum = 15007777;BA.debugLine="Public mTargetView As B4XView";
_mtargetview = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=15007778;
 //BA.debugLineNum = 15007778;BA.debugLine="Private TargetViewBC(2) As BitmapCreator";
_targetviewbc = new b4a.example.bitmapcreator[(int) (2)];
{
int d0 = _targetviewbc.length;
for (int i0 = 0;i0 < d0;i0++) {
_targetviewbc[i0] = new b4a.example.bitmapcreator();
}
}
;
RDebugUtils.currentLine=15007779;
 //BA.debugLineNum = 15007779;BA.debugLine="Private TargetViewBCIndex As Int";
_targetviewbcindex = 0;
RDebugUtils.currentLine=15007780;
 //BA.debugLineNum = 15007780;BA.debugLine="Private ReuseTilesRect As B4XRect";
_reusetilesrect = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=15007781;
 //BA.debugLineNum = 15007781;BA.debugLine="Private ReuseScreenCenter As B2Vec2";
_reusescreencenter = new anywheresoftware.b4a.objects.B2Vec2();
RDebugUtils.currentLine=15007782;
 //BA.debugLineNum = 15007782;BA.debugLine="Private ReuseTileTop, ReuseTileLeft As Int";
_reusetiletop = 0;
_reusetileleft = 0;
RDebugUtils.currentLine=15007783;
 //BA.debugLineNum = 15007783;BA.debugLine="Private LastDrawnScreenCenterStarted, LastDrawnSc";
_lastdrawnscreencenterstarted = new anywheresoftware.b4a.objects.B2Vec2();
_lastdrawnscreencompleted = new anywheresoftware.b4a.objects.B2Vec2();
RDebugUtils.currentLine=15007784;
 //BA.debugLineNum = 15007784;BA.debugLine="Private TileMapVersion As Float";
_tilemapversion = 0f;
RDebugUtils.currentLine=15007785;
 //BA.debugLineNum = 15007785;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _convertmaptowritablemapifneeded(b4a.example.x2tilemap __ref,anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2tilemap";
if (Debug.shouldDelegate(ba, "convertmaptowritablemapifneeded", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "convertmaptowritablemapifneeded", new Object[] {_m}));}
RDebugUtils.currentLine=15335424;
 //BA.debugLineNum = 15335424;BA.debugLine="Private Sub ConvertMapToWritableMapIfNeeded (m As";
RDebugUtils.currentLine=15335436;
 //BA.debugLineNum = 15335436;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=15335437;
 //BA.debugLineNum = 15335437;BA.debugLine="End Sub";
return null;
}
public String  _createbodydefandfixturedef(b4a.example.x2tilemap __ref,b4a.example.x2tilemap._x2tileobjecttemplate _template) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2tilemap";
if (Debug.shouldDelegate(ba, "createbodydefandfixturedef", true))
	 {return ((String) Debug.delegate(ba, "createbodydefandfixturedef", new Object[] {_template}));}
String _bodytype = "";
float _rotationdegrees = 0f;
anywheresoftware.b4a.objects.B2Shape.B2PolygonShape _polygon = null;
float _dx = 0f;
float _dy = 0f;
anywheresoftware.b4a.objects.B2Shape.B2ChainShape _chain = null;
anywheresoftware.b4a.objects.B2Shape.B2CircleShape _circle = null;
float _width = 0f;
float _radius = 0f;
anywheresoftware.b4a.objects.B2Shape.B2PolygonShape _rect = null;
float _height = 0f;
String _graphicfile = "";
String _graphicname = "";
RDebugUtils.currentLine=15466496;
 //BA.debugLineNum = 15466496;BA.debugLine="Private Sub CreateBodyDefAndFixtureDef(template As";
RDebugUtils.currentLine=15466497;
 //BA.debugLineNum = 15466497;BA.debugLine="Dim bodytype As String = GetCustomProperty(templa";
_bodytype = BA.ObjectToString(__ref._getcustomproperty /*Object*/ (null,_template,"body type"));
RDebugUtils.currentLine=15466498;
 //BA.debugLineNum = 15466498;BA.debugLine="If bodytype = \"dynamic\" Then";
if ((_bodytype).equals("dynamic")) { 
RDebugUtils.currentLine=15466499;
 //BA.debugLineNum = 15466499;BA.debugLine="template.BodyDef.BodyType = template.BodyDef.TYP";
_template.BodyDef /*anywheresoftware.b4a.objects.B2Body.B2BodyDef*/ .setBodyType(_template.BodyDef /*anywheresoftware.b4a.objects.B2Body.B2BodyDef*/ .TYPE_DYNAMIC);
 }else 
{RDebugUtils.currentLine=15466500;
 //BA.debugLineNum = 15466500;BA.debugLine="Else If bodytype = \"kinematic\" Then";
if ((_bodytype).equals("kinematic")) { 
RDebugUtils.currentLine=15466501;
 //BA.debugLineNum = 15466501;BA.debugLine="template.BodyDef.BodyType = template.BodyDef.TYP";
_template.BodyDef /*anywheresoftware.b4a.objects.B2Body.B2BodyDef*/ .setBodyType(_template.BodyDef /*anywheresoftware.b4a.objects.B2Body.B2BodyDef*/ .TYPE_KINEMATIC);
 }else {
RDebugUtils.currentLine=15466504;
 //BA.debugLineNum = 15466504;BA.debugLine="template.CustomProps.Put(\"angle interval\", 1)";
_template.CustomProps /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("angle interval"),(Object)(1));
 }}
;
RDebugUtils.currentLine=15466506;
 //BA.debugLineNum = 15466506;BA.debugLine="template.BodyDef.Position = template.Position";
_template.BodyDef /*anywheresoftware.b4a.objects.B2Body.B2BodyDef*/ .setPosition(_template.Position /*anywheresoftware.b4a.objects.B2Vec2*/ );
RDebugUtils.currentLine=15466507;
 //BA.debugLineNum = 15466507;BA.debugLine="Dim RotationDegrees As Float = template.Props.Get";
_rotationdegrees = (float)(BA.ObjectToNumber(_template.Props /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("rotation"))));
RDebugUtils.currentLine=15466508;
 //BA.debugLineNum = 15466508;BA.debugLine="template.BodyDef.Angle = X2.DegreesToB2Angle(Rota";
_template.BodyDef /*anywheresoftware.b4a.objects.B2Body.B2BodyDef*/ .setAngle(__ref._x2 /*b4a.example.x2utils*/ ._degreestob2angle /*float*/ (null,(int) (_rotationdegrees)));
RDebugUtils.currentLine=15466509;
 //BA.debugLineNum = 15466509;BA.debugLine="template.BodyDef.AllowSleep = GetCustomProperty(t";
_template.BodyDef /*anywheresoftware.b4a.objects.B2Body.B2BodyDef*/ .setAllowSleep(BA.ObjectToBoolean(__ref._getcustomproperty /*Object*/ (null,_template,"allow sleep")));
RDebugUtils.currentLine=15466510;
 //BA.debugLineNum = 15466510;BA.debugLine="template.BodyDef.FixedRotation = GetCustomPropert";
_template.BodyDef /*anywheresoftware.b4a.objects.B2Body.B2BodyDef*/ .setFixedRotation(BA.ObjectToBoolean(__ref._getcustomproperty /*Object*/ (null,_template,"fixed rotation")));
RDebugUtils.currentLine=15466511;
 //BA.debugLineNum = 15466511;BA.debugLine="template.BodyDef.GravityScale = GetCustomProperty";
_template.BodyDef /*anywheresoftware.b4a.objects.B2Body.B2BodyDef*/ .setGravityScale((float)(BA.ObjectToNumber(__ref._getcustomproperty /*Object*/ (null,_template,"gravity scale"))));
RDebugUtils.currentLine=15466512;
 //BA.debugLineNum = 15466512;BA.debugLine="If template.Props.ContainsKey(\"polygon\") Then";
if (_template.Props /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("polygon"))) { 
RDebugUtils.currentLine=15466513;
 //BA.debugLineNum = 15466513;BA.debugLine="Dim polygon As B2PolygonShape";
_polygon = new anywheresoftware.b4a.objects.B2Shape.B2PolygonShape();
RDebugUtils.currentLine=15466514;
 //BA.debugLineNum = 15466514;BA.debugLine="polygon.Initialize";
_polygon.Initialize();
RDebugUtils.currentLine=15466515;
 //BA.debugLineNum = 15466515;BA.debugLine="polygon.Set(ListOfMapCoordinatesToListOfLocalVec";
_polygon.Set(__ref._listofmapcoordinatestolistoflocalvecs /*anywheresoftware.b4a.objects.collections.List*/ (null,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_template.Props /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("polygon")))),(float) (0),(float) (0)));
RDebugUtils.currentLine=15466516;
 //BA.debugLineNum = 15466516;BA.debugLine="X2.GetShapeWidthAndHeight(polygon)";
__ref._x2 /*b4a.example.x2utils*/ ._getshapewidthandheight /*anywheresoftware.b4a.objects.B2Vec2*/ (null,(anywheresoftware.b4a.objects.B2Shape.ConcreteB2Shape) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B2Shape.ConcreteB2Shape(), (org.jbox2d.collision.shapes.Shape)(_polygon.getObject())));
RDebugUtils.currentLine=15466517;
 //BA.debugLineNum = 15466517;BA.debugLine="Dim dx As Float = X2.ShapeAABB.Center.X";
_dx = __ref._x2 /*b4a.example.x2utils*/ ._shapeaabb /*anywheresoftware.b4a.objects.B2AABB*/ .getCenter().getX();
RDebugUtils.currentLine=15466518;
 //BA.debugLineNum = 15466518;BA.debugLine="Dim dy As Float = X2.ShapeAABB.Center.Y";
_dy = __ref._x2 /*b4a.example.x2utils*/ ._shapeaabb /*anywheresoftware.b4a.objects.B2AABB*/ .getCenter().getY();
RDebugUtils.currentLine=15466519;
 //BA.debugLineNum = 15466519;BA.debugLine="polygon.Set(ListOfMapCoordinatesToListOfLocalVec";
_polygon.Set(__ref._listofmapcoordinatestolistoflocalvecs /*anywheresoftware.b4a.objects.collections.List*/ (null,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_template.Props /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("polygon")))),(float) (-_dx),(float) (-_dy)));
RDebugUtils.currentLine=15466522;
 //BA.debugLineNum = 15466522;BA.debugLine="template.BodyDef.Position.AddToThis(X2.CreateVec";
_template.BodyDef /*anywheresoftware.b4a.objects.B2Body.B2BodyDef*/ .getPosition().AddToThis(__ref._x2 /*b4a.example.x2utils*/ ._createvec2 /*anywheresoftware.b4a.objects.B2Vec2*/ (null,(float) (_dy*__c.SinD(_rotationdegrees)+_dx*__c.CosD(_rotationdegrees)),(float) (_dy*__c.CosD(_rotationdegrees)-_dx*__c.SinD(_rotationdegrees))));
RDebugUtils.currentLine=15466524;
 //BA.debugLineNum = 15466524;BA.debugLine="template.FixtureDef.Shape = polygon";
_template.FixtureDef /*anywheresoftware.b4a.objects.B2Fixture.B2FixtureDef*/ .setShape((org.jbox2d.collision.shapes.Shape)(_polygon.getObject()));
 }else 
{RDebugUtils.currentLine=15466525;
 //BA.debugLineNum = 15466525;BA.debugLine="Else If template.Props.ContainsKey(\"polyline\") Th";
if (_template.Props /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("polyline"))) { 
RDebugUtils.currentLine=15466526;
 //BA.debugLineNum = 15466526;BA.debugLine="Dim chain As B2ChainShape";
_chain = new anywheresoftware.b4a.objects.B2Shape.B2ChainShape();
RDebugUtils.currentLine=15466527;
 //BA.debugLineNum = 15466527;BA.debugLine="chain.Initialize";
_chain.Initialize();
RDebugUtils.currentLine=15466528;
 //BA.debugLineNum = 15466528;BA.debugLine="chain.CreateChain(ListOfMapCoordinatesToListOfLo";
_chain.CreateChain(__ref._listofmapcoordinatestolistoflocalvecs /*anywheresoftware.b4a.objects.collections.List*/ (null,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_template.Props /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("polyline")))),(float) (0),(float) (0)));
RDebugUtils.currentLine=15466529;
 //BA.debugLineNum = 15466529;BA.debugLine="template.FixtureDef.Shape = chain";
_template.FixtureDef /*anywheresoftware.b4a.objects.B2Fixture.B2FixtureDef*/ .setShape((org.jbox2d.collision.shapes.Shape)(_chain.getObject()));
 }else 
{RDebugUtils.currentLine=15466530;
 //BA.debugLineNum = 15466530;BA.debugLine="Else If template.Props.GetDefault(\"ellipse\", Fals";
if ((_template.Props /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("ellipse"),(Object)(__c.False))).equals((Object)(__c.True))) { 
RDebugUtils.currentLine=15466531;
 //BA.debugLineNum = 15466531;BA.debugLine="Dim circle As B2CircleShape";
_circle = new anywheresoftware.b4a.objects.B2Shape.B2CircleShape();
RDebugUtils.currentLine=15466532;
 //BA.debugLineNum = 15466532;BA.debugLine="Dim width As Float = template.Props.Get(\"width\")";
_width = (float)(BA.ObjectToNumber(_template.Props /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("width"))));
RDebugUtils.currentLine=15466533;
 //BA.debugLineNum = 15466533;BA.debugLine="Dim radius As Float = width * MapXToMeter / 2";
_radius = (float) (_width*__ref._mapxtometer /*float*/ /(double)2);
RDebugUtils.currentLine=15466534;
 //BA.debugLineNum = 15466534;BA.debugLine="circle.Initialize(radius)";
_circle.Initialize(_radius);
RDebugUtils.currentLine=15466535;
 //BA.debugLineNum = 15466535;BA.debugLine="template.BodyDef.Position.AddToThis(X2.CreateVec";
_template.BodyDef /*anywheresoftware.b4a.objects.B2Body.B2BodyDef*/ .getPosition().AddToThis(__ref._x2 /*b4a.example.x2utils*/ ._createvec2 /*anywheresoftware.b4a.objects.B2Vec2*/ (null,_radius,(float) (-_radius)));
RDebugUtils.currentLine=15466536;
 //BA.debugLineNum = 15466536;BA.debugLine="template.FixtureDef.Shape = circle";
_template.FixtureDef /*anywheresoftware.b4a.objects.B2Fixture.B2FixtureDef*/ .setShape((org.jbox2d.collision.shapes.Shape)(_circle.getObject()));
 }else {
RDebugUtils.currentLine=15466538;
 //BA.debugLineNum = 15466538;BA.debugLine="Dim rect As B2PolygonShape";
_rect = new anywheresoftware.b4a.objects.B2Shape.B2PolygonShape();
RDebugUtils.currentLine=15466539;
 //BA.debugLineNum = 15466539;BA.debugLine="rect.Initialize";
_rect.Initialize();
RDebugUtils.currentLine=15466540;
 //BA.debugLineNum = 15466540;BA.debugLine="Dim width As Float = template.Props.Get(\"width\")";
_width = (float) ((double)(BA.ObjectToNumber(_template.Props /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("width"))))*__ref._mapxtometer /*float*/ );
RDebugUtils.currentLine=15466541;
 //BA.debugLineNum = 15466541;BA.debugLine="Dim height As Float = template.Props.Get(\"height";
_height = (float) ((double)(BA.ObjectToNumber(_template.Props /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("height"))))*__ref._mapytometer /*float*/ );
RDebugUtils.currentLine=15466543;
 //BA.debugLineNum = 15466543;BA.debugLine="template.BodyDef.Position.AddToThis(X2.CreateVec";
_template.BodyDef /*anywheresoftware.b4a.objects.B2Body.B2BodyDef*/ .getPosition().AddToThis(__ref._x2 /*b4a.example.x2utils*/ ._createvec2 /*anywheresoftware.b4a.objects.B2Vec2*/ (null,(float) (-_height/(double)2*__c.SinD(_rotationdegrees)+_width/(double)2*__c.CosD(_rotationdegrees)),(float) (-_height/(double)2*__c.CosD(_rotationdegrees)+-_width/(double)2*__c.SinD(_rotationdegrees))));
RDebugUtils.currentLine=15466545;
 //BA.debugLineNum = 15466545;BA.debugLine="rect.SetAsBox(width / 2, height / 2)";
_rect.SetAsBox((float) (_width/(double)2),(float) (_height/(double)2));
RDebugUtils.currentLine=15466546;
 //BA.debugLineNum = 15466546;BA.debugLine="template.FixtureDef.Shape = rect";
_template.FixtureDef /*anywheresoftware.b4a.objects.B2Fixture.B2FixtureDef*/ .setShape((org.jbox2d.collision.shapes.Shape)(_rect.getObject()));
 }}}
;
RDebugUtils.currentLine=15466548;
 //BA.debugLineNum = 15466548;BA.debugLine="Dim GraphicFile As String = GetCustomProperty(tem";
_graphicfile = BA.ObjectToString(__ref._getcustomproperty /*Object*/ (null,_template,"graphic file 1"));
RDebugUtils.currentLine=15466549;
 //BA.debugLineNum = 15466549;BA.debugLine="Dim GraphicName As String = GetCustomProperty(tem";
_graphicname = BA.ObjectToString(__ref._getcustomproperty /*Object*/ (null,_template,"graphic name"));
RDebugUtils.currentLine=15466550;
 //BA.debugLineNum = 15466550;BA.debugLine="If GraphicFile <> \"\" Then";
if ((_graphicfile).equals("") == false) { 
RDebugUtils.currentLine=15466551;
 //BA.debugLineNum = 15466551;BA.debugLine="If GraphicName <> \"\" Then";
if ((_graphicname).equals("") == false) { 
RDebugUtils.currentLine=15466552;
 //BA.debugLineNum = 15466552;BA.debugLine="Log(\"Both 'graphic name' and 'graphic file' are";
__c.LogImpl("915466552","Both 'graphic name' and 'graphic file' are set. 'graphic name' is ignored.",0);
 };
RDebugUtils.currentLine=15466554;
 //BA.debugLineNum = 15466554;BA.debugLine="GraphicName = LoadGraphicForShape(template.Fixtu";
_graphicname = __ref._loadgraphicforshape /*String*/ (null,_template.FixtureDef /*anywheresoftware.b4a.objects.B2Fixture.B2FixtureDef*/ .getShape(),_graphicfile,_template);
RDebugUtils.currentLine=15466556;
 //BA.debugLineNum = 15466556;BA.debugLine="template.CustomProps.Put(\"graphic name\", Graphic";
_template.CustomProps /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("graphic name"),(Object)(_graphicname));
 };
RDebugUtils.currentLine=15466558;
 //BA.debugLineNum = 15466558;BA.debugLine="template.FixtureDef.Density = GetCustomProperty(t";
_template.FixtureDef /*anywheresoftware.b4a.objects.B2Fixture.B2FixtureDef*/ .setDensity((float)(BA.ObjectToNumber(__ref._getcustomproperty /*Object*/ (null,_template,"density"))));
RDebugUtils.currentLine=15466559;
 //BA.debugLineNum = 15466559;BA.debugLine="template.FixtureDef.SetFilterBits(GetCustomProper";
_template.FixtureDef /*anywheresoftware.b4a.objects.B2Fixture.B2FixtureDef*/ .SetFilterBits((int)(BA.ObjectToNumber(__ref._getcustomproperty /*Object*/ (null,_template,"category bits"))),(int)(BA.ObjectToNumber(__ref._getcustomproperty /*Object*/ (null,_template,"mask bits"))));
RDebugUtils.currentLine=15466560;
 //BA.debugLineNum = 15466560;BA.debugLine="template.FixtureDef.Friction = GetCustomProperty(";
_template.FixtureDef /*anywheresoftware.b4a.objects.B2Fixture.B2FixtureDef*/ .setFriction((float)(BA.ObjectToNumber(__ref._getcustomproperty /*Object*/ (null,_template,"friction"))));
RDebugUtils.currentLine=15466561;
 //BA.debugLineNum = 15466561;BA.debugLine="template.FixtureDef.IsSensor = GetCustomProperty(";
_template.FixtureDef /*anywheresoftware.b4a.objects.B2Fixture.B2FixtureDef*/ .setIsSensor(BA.ObjectToBoolean(__ref._getcustomproperty /*Object*/ (null,_template,"is sensor")));
RDebugUtils.currentLine=15466562;
 //BA.debugLineNum = 15466562;BA.debugLine="template.FixtureDef.Restitution = GetCustomProper";
_template.FixtureDef /*anywheresoftware.b4a.objects.B2Fixture.B2FixtureDef*/ .setRestitution((float)(BA.ObjectToNumber(__ref._getcustomproperty /*Object*/ (null,_template,"restitution"))));
RDebugUtils.currentLine=15466563;
 //BA.debugLineNum = 15466563;BA.debugLine="End Sub";
return "";
}
public Object  _getcustomproperty(b4a.example.x2tilemap __ref,b4a.example.x2tilemap._x2tileobjecttemplate _template,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2tilemap";
if (Debug.shouldDelegate(ba, "getcustomproperty", true))
	 {return ((Object) Debug.delegate(ba, "getcustomproperty", new Object[] {_template,_key}));}
Object _o = null;
String _s = "";
RDebugUtils.currentLine=16187392;
 //BA.debugLineNum = 16187392;BA.debugLine="Public Sub GetCustomProperty(Template As X2TileObj";
RDebugUtils.currentLine=16187393;
 //BA.debugLineNum = 16187393;BA.debugLine="Dim o As Object = Template.CustomProps.Get(Key)";
_o = _template.CustomProps /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_key));
RDebugUtils.currentLine=16187394;
 //BA.debugLineNum = 16187394;BA.debugLine="If o = Null Then";
if (_o== null) { 
RDebugUtils.currentLine=16187395;
 //BA.debugLineNum = 16187395;BA.debugLine="o = DefaultCustomProperties.Get(Key)";
_o = __ref._defaultcustomproperties /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_key));
 };
RDebugUtils.currentLine=16187397;
 //BA.debugLineNum = 16187397;BA.debugLine="If o = Null Then";
if (_o== null) { 
RDebugUtils.currentLine=16187398;
 //BA.debugLineNum = 16187398;BA.debugLine="Log($\"Error: cannot find property: ${Key}\"$)";
__c.LogImpl("916187398",("Error: cannot find property: "+__c.SmartStringFormatter("",(Object)(_key))+""),0);
 };
RDebugUtils.currentLine=16187400;
 //BA.debugLineNum = 16187400;BA.debugLine="If o Is String Then";
if (_o instanceof String) { 
RDebugUtils.currentLine=16187401;
 //BA.debugLineNum = 16187401;BA.debugLine="Dim s As String = o";
_s = BA.ObjectToString(_o);
RDebugUtils.currentLine=16187402;
 //BA.debugLineNum = 16187402;BA.debugLine="Return s.Trim";
if (true) return (Object)(_s.trim());
 };
RDebugUtils.currentLine=16187404;
 //BA.debugLineNum = 16187404;BA.debugLine="Return o";
if (true) return _o;
RDebugUtils.currentLine=16187405;
 //BA.debugLineNum = 16187405;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _listofmapcoordinatestolistoflocalvecs(b4a.example.x2tilemap __ref,anywheresoftware.b4a.objects.collections.List _points,float _offsetxmeters,float _offsetymeters) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2tilemap";
if (Debug.shouldDelegate(ba, "listofmapcoordinatestolistoflocalvecs", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "listofmapcoordinatestolistoflocalvecs", new Object[] {_points,_offsetxmeters,_offsetymeters}));}
anywheresoftware.b4a.objects.collections.List _res = null;
anywheresoftware.b4a.objects.collections.Map _p = null;
float _x = 0f;
float _y = 0f;
RDebugUtils.currentLine=16252928;
 //BA.debugLineNum = 16252928;BA.debugLine="Private Sub ListOfMapCoordinatesToListOfLocalVecs";
RDebugUtils.currentLine=16252929;
 //BA.debugLineNum = 16252929;BA.debugLine="Dim res As List";
_res = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=16252930;
 //BA.debugLineNum = 16252930;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=16252931;
 //BA.debugLineNum = 16252931;BA.debugLine="For Each p As Map In points";
_p = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group3 = _points;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_p = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group3.Get(index3)));
RDebugUtils.currentLine=16252932;
 //BA.debugLineNum = 16252932;BA.debugLine="Dim x As Float = p.Get(\"x\")";
_x = (float)(BA.ObjectToNumber(_p.Get((Object)("x"))));
RDebugUtils.currentLine=16252933;
 //BA.debugLineNum = 16252933;BA.debugLine="Dim y As Float = p.Get(\"y\")";
_y = (float)(BA.ObjectToNumber(_p.Get((Object)("y"))));
RDebugUtils.currentLine=16252934;
 //BA.debugLineNum = 16252934;BA.debugLine="res.Add(X2.CreateVec2(x * MapXToMeter + OffsetXM";
_res.Add((Object)(__ref._x2 /*b4a.example.x2utils*/ ._createvec2 /*anywheresoftware.b4a.objects.B2Vec2*/ (null,(float) (_x*__ref._mapxtometer /*float*/ +_offsetxmeters),(float) ((-_y)*__ref._mapytometer /*float*/ +_offsetymeters))));
 }
};
RDebugUtils.currentLine=16252936;
 //BA.debugLineNum = 16252936;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=16252937;
 //BA.debugLineNum = 16252937;BA.debugLine="End Sub";
return null;
}
public String  _loadgraphicforshape(b4a.example.x2tilemap __ref,anywheresoftware.b4a.objects.B2Shape.ConcreteB2Shape _shape,String _graphicfile,b4a.example.x2tilemap._x2tileobjecttemplate _template) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2tilemap";
if (Debug.shouldDelegate(ba, "loadgraphicforshape", true))
	 {return ((String) Debug.delegate(ba, "loadgraphicforshape", new Object[] {_shape,_graphicfile,_template}));}
anywheresoftware.b4a.objects.B2Vec2 _shapesize = null;
anywheresoftware.b4a.objects.collections.List _files = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _name = null;
int _i = 0;
String _f = "";
boolean _nearestneighbor = false;
anywheresoftware.b4a.objects.collections.List _bmps = null;
String _rowsandcolumns = "";
int _angleinterval = 0;
String[] _xy = null;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;
boolean _keepaspectratio = false;
b4a.example.bitmapcreator _original = null;
b4a.example.x2utils._x2scaledbitmap _sb = null;
b4a.example.x2spritegraphiccache._x2spritegraphicdata _data = null;
RDebugUtils.currentLine=16121856;
 //BA.debugLineNum = 16121856;BA.debugLine="Private Sub LoadGraphicForShape (Shape As B2Shape,";
RDebugUtils.currentLine=16121857;
 //BA.debugLineNum = 16121857;BA.debugLine="Dim ShapeSize As B2Vec2 = X2.GetShapeWidthAndHeig";
_shapesize = __ref._x2 /*b4a.example.x2utils*/ ._getshapewidthandheight /*anywheresoftware.b4a.objects.B2Vec2*/ (null,_shape);
RDebugUtils.currentLine=16121858;
 //BA.debugLineNum = 16121858;BA.debugLine="Dim files As List";
_files = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=16121859;
 //BA.debugLineNum = 16121859;BA.debugLine="files.Initialize";
_files.Initialize();
RDebugUtils.currentLine=16121860;
 //BA.debugLineNum = 16121860;BA.debugLine="files.Add(GraphicFile)";
_files.Add((Object)(_graphicfile));
RDebugUtils.currentLine=16121861;
 //BA.debugLineNum = 16121861;BA.debugLine="Dim name As StringBuilder";
_name = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=16121862;
 //BA.debugLineNum = 16121862;BA.debugLine="name.Initialize";
_name.Initialize();
RDebugUtils.currentLine=16121863;
 //BA.debugLineNum = 16121863;BA.debugLine="name.Append($\"${GraphicFile}_$1.2{ShapeSize.X}x$1";
_name.Append((""+__c.SmartStringFormatter("",(Object)(_graphicfile))+"_"+__c.SmartStringFormatter("1.2",(Object)(_shapesize.getX()))+"x"+__c.SmartStringFormatter("1.2",(Object)(_shapesize.getY()))+""));
RDebugUtils.currentLine=16121865;
 //BA.debugLineNum = 16121865;BA.debugLine="Dim i As Int = 2";
_i = (int) (2);
RDebugUtils.currentLine=16121866;
 //BA.debugLineNum = 16121866;BA.debugLine="Do While Template.CustomProps.ContainsKey(\"graphi";
while (_template.CustomProps /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("graphic file "+BA.NumberToString(_i)))) {
RDebugUtils.currentLine=16121867;
 //BA.debugLineNum = 16121867;BA.debugLine="Dim f As String = Template.CustomProps.Get(\"grap";
_f = BA.ObjectToString(_template.CustomProps /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("graphic file "+BA.NumberToString(_i))));
RDebugUtils.currentLine=16121868;
 //BA.debugLineNum = 16121868;BA.debugLine="files.Add(f)";
_files.Add((Object)(_f));
RDebugUtils.currentLine=16121869;
 //BA.debugLineNum = 16121869;BA.debugLine="name.Append(f)";
_name.Append(_f);
RDebugUtils.currentLine=16121870;
 //BA.debugLineNum = 16121870;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 }
;
RDebugUtils.currentLine=16121872;
 //BA.debugLineNum = 16121872;BA.debugLine="If X2.GraphicCache.GetGraphicsCount(name) = 0 The";
if (__ref._x2 /*b4a.example.x2utils*/ ._graphiccache /*b4a.example.x2spritegraphiccache*/ ._getgraphicscount /*int*/ (null,BA.ObjectToString(_name))==0) { 
RDebugUtils.currentLine=16121873;
 //BA.debugLineNum = 16121873;BA.debugLine="Dim NearestNeighbor As Boolean = GetCustomProper";
_nearestneighbor = BA.ObjectToBoolean(__ref._getcustomproperty /*Object*/ (null,_template,"nearest neighbor scaling"));
RDebugUtils.currentLine=16121874;
 //BA.debugLineNum = 16121874;BA.debugLine="Dim bmps As List";
_bmps = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=16121875;
 //BA.debugLineNum = 16121875;BA.debugLine="Dim RowsAndColumns As String = GetCustomProperty";
_rowsandcolumns = BA.ObjectToString(__ref._getcustomproperty /*Object*/ (null,_template,"graphic sheet: rows, columns"));
RDebugUtils.currentLine=16121876;
 //BA.debugLineNum = 16121876;BA.debugLine="Dim AngleInterval As Int = GetCustomProperty(Tem";
_angleinterval = (int)(BA.ObjectToNumber(__ref._getcustomproperty /*Object*/ (null,_template,"angle interval")));
RDebugUtils.currentLine=16121877;
 //BA.debugLineNum = 16121877;BA.debugLine="If RowsAndColumns <> \"1, 1\" Then";
if ((_rowsandcolumns).equals("1, 1") == false) { 
RDebugUtils.currentLine=16121878;
 //BA.debugLineNum = 16121878;BA.debugLine="Dim xy() As String = Regex.Split(\"[,\\s]+\", Rows";
_xy = __c.Regex.Split("[,\\s]+",_rowsandcolumns);
RDebugUtils.currentLine=16121879;
 //BA.debugLineNum = 16121879;BA.debugLine="If xy(0) <> \"1\" Or xy(1) <> \"1\" Then";
if ((_xy[(int) (0)]).equals("1") == false || (_xy[(int) (1)]).equals("1") == false) { 
RDebugUtils.currentLine=16121880;
 //BA.debugLineNum = 16121880;BA.debugLine="Dim bmp As B4XBitmap = xui.LoadBitmap(File.Dir";
_bmp = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bmp = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .LoadBitmap(__c.File.getDirAssets(),_graphicfile);
RDebugUtils.currentLine=16121881;
 //BA.debugLineNum = 16121881;BA.debugLine="If NearestNeighbor Then";
if (_nearestneighbor) { 
RDebugUtils.currentLine=16121882;
 //BA.debugLineNum = 16121882;BA.debugLine="bmps = X2.ReadSpritesBCs(X2.BitmapToBC(bmp, 1";
_bmps = __ref._x2 /*b4a.example.x2utils*/ ._readspritesbcs /*anywheresoftware.b4a.objects.collections.List*/ (null,__ref._x2 /*b4a.example.x2utils*/ ._bitmaptobc /*b4a.example.bitmapcreator*/ (null,_bmp,(float) (1)),(int)(Double.parseDouble(_xy[(int) (0)])),(int)(Double.parseDouble(_xy[(int) (1)])),_shapesize.getX(),_shapesize.getY());
 }else {
RDebugUtils.currentLine=16121884;
 //BA.debugLineNum = 16121884;BA.debugLine="bmps = X2.ReadSprites(bmp, xy(0), xy(1), Shap";
_bmps = __ref._x2 /*b4a.example.x2utils*/ ._readsprites /*anywheresoftware.b4a.objects.collections.List*/ (null,_bmp,(int)(Double.parseDouble(_xy[(int) (0)])),(int)(Double.parseDouble(_xy[(int) (1)])),_shapesize.getX(),_shapesize.getY());
 };
 };
 };
RDebugUtils.currentLine=16121888;
 //BA.debugLineNum = 16121888;BA.debugLine="If bmps.IsInitialized = False Then";
if (_bmps.IsInitialized()==__c.False) { 
RDebugUtils.currentLine=16121889;
 //BA.debugLineNum = 16121889;BA.debugLine="Dim KeepAspectRatio As Boolean = GetCustomPrope";
_keepaspectratio = BA.ObjectToBoolean(__ref._getcustomproperty /*Object*/ (null,_template,"graphic keep aspect ratio"));
RDebugUtils.currentLine=16121890;
 //BA.debugLineNum = 16121890;BA.debugLine="bmps.Initialize";
_bmps.Initialize();
RDebugUtils.currentLine=16121891;
 //BA.debugLineNum = 16121891;BA.debugLine="For Each f As String In files";
{
final anywheresoftware.b4a.BA.IterableList group34 = _files;
final int groupLen34 = group34.getSize()
;int index34 = 0;
;
for (; index34 < groupLen34;index34++){
_f = BA.ObjectToString(group34.Get(index34));
RDebugUtils.currentLine=16121892;
 //BA.debugLineNum = 16121892;BA.debugLine="If NearestNeighbor Then";
if (_nearestneighbor) { 
RDebugUtils.currentLine=16121893;
 //BA.debugLineNum = 16121893;BA.debugLine="Dim original As BitmapCreator = X2.BitmapToBC";
_original = __ref._x2 /*b4a.example.x2utils*/ ._bitmaptobc /*b4a.example.bitmapcreator*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .LoadBitmap(__c.File.getDirAssets(),_f),(float) (1));
RDebugUtils.currentLine=16121894;
 //BA.debugLineNum = 16121894;BA.debugLine="bmps.Add(X2.NearestNeighborResize(original, o";
_bmps.Add((Object)(__ref._x2 /*b4a.example.x2utils*/ ._nearestneighborresize /*b4a.example.bitmapcreator*/ (null,_original,_original._targetrect,(float) (__ref._x2 /*b4a.example.x2utils*/ ._meterstobcpixels /*int*/ (null,_shapesize.getX())),(float) (__ref._x2 /*b4a.example.x2utils*/ ._meterstobcpixels /*int*/ (null,_shapesize.getY())),_keepaspectratio)));
 }else {
RDebugUtils.currentLine=16121896;
 //BA.debugLineNum = 16121896;BA.debugLine="Dim sb As X2ScaledBitmap = X2.LoadBmp(File.Di";
_sb = __ref._x2 /*b4a.example.x2utils*/ ._loadbmp /*b4a.example.x2utils._x2scaledbitmap*/ (null,__c.File.getDirAssets(),_f,_shapesize.getX(),_shapesize.getY(),_keepaspectratio);
RDebugUtils.currentLine=16121897;
 //BA.debugLineNum = 16121897;BA.debugLine="bmps.Add(sb)";
_bmps.Add((Object)(_sb));
 };
 }
};
 };
RDebugUtils.currentLine=16121901;
 //BA.debugLineNum = 16121901;BA.debugLine="If NearestNeighbor Then";
if (_nearestneighbor) { 
RDebugUtils.currentLine=16121902;
 //BA.debugLineNum = 16121902;BA.debugLine="Dim data As X2SpriteGraphicData = X2.GraphicCac";
_data = __ref._x2 /*b4a.example.x2utils*/ ._graphiccache /*b4a.example.x2spritegraphiccache*/ ._putgraphicbcs /*b4a.example.x2spritegraphiccache._x2spritegraphicdata*/ (null,BA.ObjectToString(_name),_bmps,BA.ObjectToBoolean(__ref._getcustomproperty /*Object*/ (null,_template,"antialias")),_angleinterval);
 }else {
RDebugUtils.currentLine=16121904;
 //BA.debugLineNum = 16121904;BA.debugLine="Dim data As X2SpriteGraphicData = X2.GraphicCac";
_data = __ref._x2 /*b4a.example.x2utils*/ ._graphiccache /*b4a.example.x2spritegraphiccache*/ ._putgraphic2 /*b4a.example.x2spritegraphiccache._x2spritegraphicdata*/ (null,BA.ObjectToString(_name),_bmps,BA.ObjectToBoolean(__ref._getcustomproperty /*Object*/ (null,_template,"antialias")),_angleinterval);
 };
RDebugUtils.currentLine=16121906;
 //BA.debugLineNum = 16121906;BA.debugLine="data.VerticalSymmetry = GetCustomProperty(Templa";
_data.VerticalSymmetry /*boolean*/  = BA.ObjectToBoolean(__ref._getcustomproperty /*Object*/ (null,_template,"vertical symmetry"));
RDebugUtils.currentLine=16121907;
 //BA.debugLineNum = 16121907;BA.debugLine="data.HorizontalSymmetry = GetCustomProperty(Temp";
_data.HorizontalSymmetry /*boolean*/  = BA.ObjectToBoolean(__ref._getcustomproperty /*Object*/ (null,_template,"horizontal symmetry"));
 };
RDebugUtils.currentLine=16121910;
 //BA.debugLineNum = 16121910;BA.debugLine="Return name";
if (true) return BA.ObjectToString(_name);
RDebugUtils.currentLine=16121911;
 //BA.debugLineNum = 16121911;BA.debugLine="End Sub";
return "";
}
public b4a.example.x2bodywrapper  _createobject(b4a.example.x2tilemap __ref,b4a.example.x2tilemap._x2tileobjecttemplate _template) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2tilemap";
if (Debug.shouldDelegate(ba, "createobject", true))
	 {return ((b4a.example.x2bodywrapper) Debug.delegate(ba, "createobject", new Object[] {_template}));}
b4a.example.x2tilemap._x2tileobjecttemplate _sourcetemplate = null;
int _copyid = 0;
b4a.example.x2bodywrapper _bw = null;
RDebugUtils.currentLine=15925248;
 //BA.debugLineNum = 15925248;BA.debugLine="Public Sub CreateObject (Template As X2TileObjectT";
RDebugUtils.currentLine=15925249;
 //BA.debugLineNum = 15925249;BA.debugLine="Template.FirstTime = False";
_template.FirstTime /*boolean*/  = __c.False;
RDebugUtils.currentLine=15925250;
 //BA.debugLineNum = 15925250;BA.debugLine="Dim SourceTemplate As X2TileObjectTemplate = Temp";
_sourcetemplate = _template;
RDebugUtils.currentLine=15925251;
 //BA.debugLineNum = 15925251;BA.debugLine="Dim CopyId As Int = GetCustomProperty(Template, \"";
_copyid = (int)(BA.ObjectToNumber(__ref._getcustomproperty /*Object*/ (null,_template,"copy from id")));
RDebugUtils.currentLine=15925252;
 //BA.debugLineNum = 15925252;BA.debugLine="If CopyId > 0 Then";
if (_copyid>0) { 
RDebugUtils.currentLine=15925253;
 //BA.debugLineNum = 15925253;BA.debugLine="SourceTemplate = Template.ObjectLayer.ObjectsByI";
_sourcetemplate = (b4a.example.x2tilemap._x2tileobjecttemplate)(_template.ObjectLayer /*b4a.example.x2tilemap._x2objectslayer*/ .ObjectsById /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_copyid)));
RDebugUtils.currentLine=15925254;
 //BA.debugLineNum = 15925254;BA.debugLine="SourceTemplate.BodyDef.Position = Template.Posit";
_sourcetemplate.BodyDef /*anywheresoftware.b4a.objects.B2Body.B2BodyDef*/ .setPosition(_template.Position /*anywheresoftware.b4a.objects.B2Vec2*/ );
 };
RDebugUtils.currentLine=15925256;
 //BA.debugLineNum = 15925256;BA.debugLine="Dim bw As X2BodyWrapper = X2.CreateBodyAndWrapper";
_bw = __ref._x2 /*b4a.example.x2utils*/ ._createbodyandwrapper /*b4a.example.x2bodywrapper*/ (null,_sourcetemplate.BodyDef /*anywheresoftware.b4a.objects.B2Body.B2BodyDef*/ ,__c.Null,_template.Name /*String*/ );
RDebugUtils.currentLine=15925257;
 //BA.debugLineNum = 15925257;BA.debugLine="bw.GraphicName = GetCustomProperty(SourceTemplate";
_bw._setgraphicname /*String*/ (null,BA.ObjectToString(__ref._getcustomproperty /*Object*/ (null,_sourcetemplate,"graphic name")));
RDebugUtils.currentLine=15925258;
 //BA.debugLineNum = 15925258;BA.debugLine="bw.DestroyIfInvisible = GetCustomProperty(SourceT";
_bw._destroyifinvisible /*boolean*/  = BA.ObjectToBoolean(__ref._getcustomproperty /*Object*/ (null,_sourcetemplate,"destroy if invisible"));
RDebugUtils.currentLine=15925259;
 //BA.debugLineNum = 15925259;BA.debugLine="bw.SwitchFrameIntervalMs = GetCustomProperty(Sour";
_bw._switchframeintervalms /*int*/  = (int)(BA.ObjectToNumber(__ref._getcustomproperty /*Object*/ (null,_sourcetemplate,"switch frame interval (ms)")));
RDebugUtils.currentLine=15925260;
 //BA.debugLineNum = 15925260;BA.debugLine="bw.TimeToLiveMs = GetCustomProperty(SourceTemplat";
_bw._timetolivems /*float*/  = (float)(BA.ObjectToNumber(__ref._getcustomproperty /*Object*/ (null,_sourcetemplate,"time to live (ms)")));
RDebugUtils.currentLine=15925261;
 //BA.debugLineNum = 15925261;BA.debugLine="bw.TickIfInvisible = GetCustomProperty(SourceTemp";
_bw._tickifinvisible /*boolean*/  = BA.ObjectToBoolean(__ref._getcustomproperty /*Object*/ (null,_sourcetemplate,"tick if invisible"));
RDebugUtils.currentLine=15925262;
 //BA.debugLineNum = 15925262;BA.debugLine="bw.Id = Template.Id";
_bw._id /*int*/  = _template.Id /*int*/ ;
RDebugUtils.currentLine=15925263;
 //BA.debugLineNum = 15925263;BA.debugLine="bw.DrawFirst = GetCustomProperty(SourceTemplate,";
_bw._drawfirst /*boolean*/  = BA.ObjectToBoolean(__ref._getcustomproperty /*Object*/ (null,_sourcetemplate,"draw first"));
RDebugUtils.currentLine=15925264;
 //BA.debugLineNum = 15925264;BA.debugLine="bw.DrawLast = GetCustomProperty(SourceTemplate, \"";
_bw._drawlast /*boolean*/  = BA.ObjectToBoolean(__ref._getcustomproperty /*Object*/ (null,_sourcetemplate,"draw last"));
RDebugUtils.currentLine=15925265;
 //BA.debugLineNum = 15925265;BA.debugLine="bw.Tag = Template.Tag";
_bw._tag /*Object*/  = (Object)(_template.Tag /*String*/ );
RDebugUtils.currentLine=15925266;
 //BA.debugLineNum = 15925266;BA.debugLine="bw.TemplateCustomProperties = Template.CustomProp";
_bw._templatecustomproperties /*anywheresoftware.b4a.objects.collections.Map*/  = _template.CustomProps /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=15925267;
 //BA.debugLineNum = 15925267;BA.debugLine="If SourceTemplate.FixtureDef.Shape.IsInitialized";
if (_sourcetemplate.FixtureDef /*anywheresoftware.b4a.objects.B2Fixture.B2FixtureDef*/ .getShape().IsInitialized()==__c.False) { 
RDebugUtils.currentLine=15925268;
 //BA.debugLineNum = 15925268;BA.debugLine="Log(\"ERROR: Shape is not initialized. Make sure";
__c.LogImpl("915925268","ERROR: Shape is not initialized. Make sure to call PrepareObjectsDef.",0);
 };
RDebugUtils.currentLine=15925270;
 //BA.debugLineNum = 15925270;BA.debugLine="bw.Body.CreateFixture(SourceTemplate.FixtureDef)";
_bw._body /*anywheresoftware.b4a.objects.B2Body*/ .CreateFixture(_sourcetemplate.FixtureDef /*anywheresoftware.b4a.objects.B2Fixture.B2FixtureDef*/ );
RDebugUtils.currentLine=15925271;
 //BA.debugLineNum = 15925271;BA.debugLine="Return bw";
if (true) return _bw;
RDebugUtils.currentLine=15925272;
 //BA.debugLineNum = 15925272;BA.debugLine="End Sub";
return null;
}
public b4a.example.x2tilemap._x2tileobjecttemplate  _getobjecttemplate(b4a.example.x2tilemap __ref,String _layer,int _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2tilemap";
if (Debug.shouldDelegate(ba, "getobjecttemplate", true))
	 {return ((b4a.example.x2tilemap._x2tileobjecttemplate) Debug.delegate(ba, "getobjecttemplate", new Object[] {_layer,_id}));}
b4a.example.x2tilemap._x2objectslayer _ol = null;
b4a.example.x2tilemap._x2tileobjecttemplate _template = null;
RDebugUtils.currentLine=15794176;
 //BA.debugLineNum = 15794176;BA.debugLine="Public Sub GetObjectTemplate (Layer As String, Id";
RDebugUtils.currentLine=15794177;
 //BA.debugLineNum = 15794177;BA.debugLine="Dim ol As X2ObjectsLayer = Layers.Get(Layer)";
_ol = (b4a.example.x2tilemap._x2objectslayer)(__ref._layers /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_layer)));
RDebugUtils.currentLine=15794178;
 //BA.debugLineNum = 15794178;BA.debugLine="Dim template As X2TileObjectTemplate = ol.Objects";
_template = (b4a.example.x2tilemap._x2tileobjecttemplate)(_ol.ObjectsById /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_id)));
RDebugUtils.currentLine=15794179;
 //BA.debugLineNum = 15794179;BA.debugLine="If template = Null Then";
if (_template== null) { 
RDebugUtils.currentLine=15794180;
 //BA.debugLineNum = 15794180;BA.debugLine="Log($\"ERROR: Template not found. Layer: ${Layer}";
__c.LogImpl("915794180",("ERROR: Template not found. Layer: "+__c.SmartStringFormatter("",(Object)(_layer))+", Id: "+__c.SmartStringFormatter("",(Object)(_id))+""),0);
 };
RDebugUtils.currentLine=15794182;
 //BA.debugLineNum = 15794182;BA.debugLine="Return template";
if (true) return _template;
RDebugUtils.currentLine=15794183;
 //BA.debugLineNum = 15794183;BA.debugLine="End Sub";
return null;
}
public b4a.example.x2tilemap._x2tileobjecttemplate  _getobjecttemplatebyname(b4a.example.x2tilemap __ref,String _layer,String _name) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2tilemap";
if (Debug.shouldDelegate(ba, "getobjecttemplatebyname", true))
	 {return ((b4a.example.x2tilemap._x2tileobjecttemplate) Debug.delegate(ba, "getobjecttemplatebyname", new Object[] {_layer,_name}));}
b4a.example.x2tilemap._x2objectslayer _ol = null;
b4a.example.x2tilemap._x2tileobjecttemplate _template = null;
RDebugUtils.currentLine=15859712;
 //BA.debugLineNum = 15859712;BA.debugLine="Public Sub GetObjectTemplateByName (Layer As Strin";
RDebugUtils.currentLine=15859713;
 //BA.debugLineNum = 15859713;BA.debugLine="Dim ol As X2ObjectsLayer = Layers.Get(Layer)";
_ol = (b4a.example.x2tilemap._x2objectslayer)(__ref._layers /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_layer)));
RDebugUtils.currentLine=15859714;
 //BA.debugLineNum = 15859714;BA.debugLine="Dim template As X2TileObjectTemplate = ol.Objects";
_template = (b4a.example.x2tilemap._x2tileobjecttemplate)(_ol.ObjectsByName /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_name)));
RDebugUtils.currentLine=15859715;
 //BA.debugLineNum = 15859715;BA.debugLine="If template = Null Then";
if (_template== null) { 
RDebugUtils.currentLine=15859716;
 //BA.debugLineNum = 15859716;BA.debugLine="Log($\"ERROR: Template not found. Layer: ${Layer}";
__c.LogImpl("915859716",("ERROR: Template not found. Layer: "+__c.SmartStringFormatter("",(Object)(_layer))+", Name: "+__c.SmartStringFormatter("",(Object)(_name))+""),0);
 };
RDebugUtils.currentLine=15859718;
 //BA.debugLineNum = 15859718;BA.debugLine="Return template";
if (true) return _template;
RDebugUtils.currentLine=15859719;
 //BA.debugLineNum = 15859719;BA.debugLine="End Sub";
return null;
}
public String  _draw(b4a.example.x2tilemap __ref,anywheresoftware.b4a.objects.collections.List _layersnames,anywheresoftware.b4a.objects.B2AABB _drawaabb,anywheresoftware.b4a.objects.collections.List _tasks) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2tilemap";
if (Debug.shouldDelegate(ba, "draw", true))
	 {return ((String) Debug.delegate(ba, "draw", new Object[] {_layersnames,_drawaabb,_tasks}));}
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _drawrect = null;
b4a.example.bitmapcreator _targetbc = null;
b4a.example.bitmapcreator._drawtask _backgroundtask = null;
int _startleftpixels = 0;
int _starttoppixels = 0;
int _starttilex = 0;
int _endtilex = 0;
int _starttiley = 0;
int _endtiley = 0;
boolean _drewprevious = false;
String _layername = "";
b4a.example.x2tilemap._x2internaltilelayer _layer = null;
int _y = 0;
int _movingleftpixels = 0;
int _movingtoppixels = 0;
boolean _testreuse = false;
int _x = 0;
b4a.example.x2tilemap._x2tile _t = null;
b4a.example.bitmapcreator._drawtask _dt = null;
RDebugUtils.currentLine=16842752;
 //BA.debugLineNum = 16842752;BA.debugLine="Public Sub Draw (LayersNames As List, DrawAABB As";
RDebugUtils.currentLine=16842753;
 //BA.debugLineNum = 16842753;BA.debugLine="Dim DrawRect As B4XRect";
_drawrect = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=16842754;
 //BA.debugLineNum = 16842754;BA.debugLine="DrawRect.Initialize(Round(DrawAABB.BottomLeft.X *";
_drawrect.Initialize((float) (__c.Round(_drawaabb.getBottomLeft().getX()*__ref._meterstopixelsx /*float*/ )),(float) (__ref._maprectpixels /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getBottom()-__c.Round(_drawaabb.getTopRight().getY()*__ref._meterstopixelsy /*float*/ )),(float) (0),(float) (0));
RDebugUtils.currentLine=16842755;
 //BA.debugLineNum = 16842755;BA.debugLine="TargetViewBCIndex = (TargetViewBCIndex + 1) Mod 2";
__ref._targetviewbcindex /*int*/  = (int) ((__ref._targetviewbcindex /*int*/ +1)%2);
RDebugUtils.currentLine=16842756;
 //BA.debugLineNum = 16842756;BA.debugLine="Dim TargetBC As BitmapCreator = TargetViewBC(Targ";
_targetbc = __ref._targetviewbc /*b4a.example.bitmapcreator[]*/ [__ref._targetviewbcindex /*int*/ ];
RDebugUtils.currentLine=16842757;
 //BA.debugLineNum = 16842757;BA.debugLine="If TargetBC.IsInitialized = False Then";
if (_targetbc.IsInitialized()==__c.False) { 
RDebugUtils.currentLine=16842758;
 //BA.debugLineNum = 16842758;BA.debugLine="TargetBC.Initialize(X2.MainBC.mWidth, X2.MainBC.";
_targetbc._initialize(ba,__ref._x2 /*b4a.example.x2utils*/ ._mainbc /*b4a.example.bitmapcreator*/ ._mwidth,__ref._x2 /*b4a.example.x2utils*/ ._mainbc /*b4a.example.bitmapcreator*/ ._mheight);
 };
RDebugUtils.currentLine=16842760;
 //BA.debugLineNum = 16842760;BA.debugLine="DrawRect.Width = TargetBC.mWidth";
_drawrect.setWidth((float) (_targetbc._mwidth));
RDebugUtils.currentLine=16842761;
 //BA.debugLineNum = 16842761;BA.debugLine="DrawRect.Height = TargetBC.mHeight";
_drawrect.setHeight((float) (_targetbc._mheight));
RDebugUtils.currentLine=16842762;
 //BA.debugLineNum = 16842762;BA.debugLine="Dim backgroundtask As DrawTask = TargetViewBC(Tar";
_backgroundtask = __ref._targetviewbc /*b4a.example.bitmapcreator[]*/ [__ref._targetviewbcindex /*int*/ ]._createdrawtask((Object)(__ref._backgroundcolorbc /*b4a.example.bitmapcreator*/ ),__ref._backgroundcolorbc /*b4a.example.bitmapcreator*/ ._targetrect,(int) (0),(int) (0),__c.True);
RDebugUtils.currentLine=16842763;
 //BA.debugLineNum = 16842763;BA.debugLine="backgroundtask.TargetBC = TargetViewBC(TargetView";
_backgroundtask.TargetBC = __ref._targetviewbc /*b4a.example.bitmapcreator[]*/ [__ref._targetviewbcindex /*int*/ ];
RDebugUtils.currentLine=16842764;
 //BA.debugLineNum = 16842764;BA.debugLine="Tasks.Add(backgroundtask)";
_tasks.Add((Object)(_backgroundtask));
RDebugUtils.currentLine=16842765;
 //BA.debugLineNum = 16842765;BA.debugLine="Dim StartLeftPixels As Int = DrawRect.Left";
_startleftpixels = (int) (_drawrect.getLeft());
RDebugUtils.currentLine=16842766;
 //BA.debugLineNum = 16842766;BA.debugLine="StartLeftPixels = - (StartLeftPixels Mod TileWidt";
_startleftpixels = (int) (-(_startleftpixels%__ref._tilewidthpixels /*int*/ ));
RDebugUtils.currentLine=16842767;
 //BA.debugLineNum = 16842767;BA.debugLine="Dim StartTopPixels As Int = DrawRect.Top";
_starttoppixels = (int) (_drawrect.getTop());
RDebugUtils.currentLine=16842768;
 //BA.debugLineNum = 16842768;BA.debugLine="StartTopPixels =  - (StartTopPixels Mod TileHeigh";
_starttoppixels = (int) (-(_starttoppixels%__ref._tileheightpixels /*int*/ ));
RDebugUtils.currentLine=16842769;
 //BA.debugLineNum = 16842769;BA.debugLine="Dim StartTileX As Int =  DrawRect.Left / TileWidt";
_starttilex = (int) (_drawrect.getLeft()/(double)__ref._tilewidthpixels /*int*/ );
RDebugUtils.currentLine=16842770;
 //BA.debugLineNum = 16842770;BA.debugLine="Dim EndTileX As Int = DrawRect.Right / TileWidthP";
_endtilex = (int) (_drawrect.getRight()/(double)__ref._tilewidthpixels /*int*/ );
RDebugUtils.currentLine=16842771;
 //BA.debugLineNum = 16842771;BA.debugLine="Dim StartTileY As Int = DrawRect.Top / TileHeight";
_starttiley = (int) (_drawrect.getTop()/(double)__ref._tileheightpixels /*int*/ );
RDebugUtils.currentLine=16842772;
 //BA.debugLineNum = 16842772;BA.debugLine="Dim EndTileY As Int = DrawRect.Bottom / TileHeigh";
_endtiley = (int) (_drawrect.getBottom()/(double)__ref._tileheightpixels /*int*/ );
RDebugUtils.currentLine=16842773;
 //BA.debugLineNum = 16842773;BA.debugLine="If ReuseScreenCenter.Equals(LastDrawnScreenComple";
if (__ref._reusescreencenter /*anywheresoftware.b4a.objects.B2Vec2*/ .Equals(__ref._lastdrawnscreencompleted /*anywheresoftware.b4a.objects.B2Vec2*/ )==__c.False) { 
RDebugUtils.currentLine=16842774;
 //BA.debugLineNum = 16842774;BA.debugLine="ReuseTilesRect.Bottom = -1";
__ref._reusetilesrect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .setBottom((float) (-1));
 };
RDebugUtils.currentLine=16842776;
 //BA.debugLineNum = 16842776;BA.debugLine="Dim DrewPrevious As Boolean";
_drewprevious = false;
RDebugUtils.currentLine=16842777;
 //BA.debugLineNum = 16842777;BA.debugLine="For Each LayerName As String In LayersNames";
{
final anywheresoftware.b4a.BA.IterableList group25 = _layersnames;
final int groupLen25 = group25.getSize()
;int index25 = 0;
;
for (; index25 < groupLen25;index25++){
_layername = BA.ObjectToString(group25.Get(index25));
RDebugUtils.currentLine=16842778;
 //BA.debugLineNum = 16842778;BA.debugLine="Dim Layer As X2InternalTileLayer = Layers.Get(La";
_layer = (b4a.example.x2tilemap._x2internaltilelayer)(__ref._layers /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_layername)));
RDebugUtils.currentLine=16842779;
 //BA.debugLineNum = 16842779;BA.debugLine="For y = StartTileY To EndTileY";
{
final int step27 = 1;
final int limit27 = _endtiley;
_y = _starttiley ;
for (;_y <= limit27 ;_y = _y + step27 ) {
RDebugUtils.currentLine=16842780;
 //BA.debugLineNum = 16842780;BA.debugLine="Dim MovingLeftPixels As Int = StartLeftPixels";
_movingleftpixels = _startleftpixels;
RDebugUtils.currentLine=16842781;
 //BA.debugLineNum = 16842781;BA.debugLine="Dim MovingTopPixels As Int = StartTopPixels + (";
_movingtoppixels = (int) (_starttoppixels+(_y-_starttiley)*__ref._tileheightpixels /*int*/ );
RDebugUtils.currentLine=16842782;
 //BA.debugLineNum = 16842782;BA.debugLine="Dim TestReuse As Boolean = y >= ReuseTilesRect.";
_testreuse = _y>=__ref._reusetilesrect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getTop() && _y<=__ref._reusetilesrect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getBottom();
RDebugUtils.currentLine=16842783;
 //BA.debugLineNum = 16842783;BA.debugLine="For x = StartTileX To EndTileX";
{
final int step31 = 1;
final int limit31 = _endtilex;
_x = _starttilex ;
for (;_x <= limit31 ;_x = _x + step31 ) {
RDebugUtils.currentLine=16842784;
 //BA.debugLineNum = 16842784;BA.debugLine="If TestReuse And x >= ReuseTilesRect.Left And";
if (_testreuse && _x>=__ref._reusetilesrect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getLeft() && _x<__ref._reusetilesrect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getRight()-1) { 
RDebugUtils.currentLine=16842785;
 //BA.debugLineNum = 16842785;BA.debugLine="If DrewPrevious = False Then";
if (_drewprevious==__c.False) { 
RDebugUtils.currentLine=16842786;
 //BA.debugLineNum = 16842786;BA.debugLine="DrewPrevious = True";
_drewprevious = __c.True;
RDebugUtils.currentLine=16842787;
 //BA.debugLineNum = 16842787;BA.debugLine="DrawPrevious(x, y, MovingLeftPixels, MovingT";
__ref._drawprevious /*String*/ (null,_x,_y,_movingleftpixels,_movingtoppixels,_targetbc,_tasks);
 };
RDebugUtils.currentLine=16842789;
 //BA.debugLineNum = 16842789;BA.debugLine="x = ReuseTilesRect.Right";
_x = (int) (__ref._reusetilesrect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getRight());
RDebugUtils.currentLine=16842790;
 //BA.debugLineNum = 16842790;BA.debugLine="MovingLeftPixels = StartLeftPixels + TileWidt";
_movingleftpixels = (int) (_startleftpixels+__ref._tilewidthpixels /*int*/ *(_x-_starttilex+1));
RDebugUtils.currentLine=16842791;
 //BA.debugLineNum = 16842791;BA.debugLine="Continue";
if (true) continue;
 }else 
{RDebugUtils.currentLine=16842792;
 //BA.debugLineNum = 16842792;BA.debugLine="Else If x >= 0 And x < TilesPerRow And y >= 0";
if (_x>=0 && _x<__ref._tilesperrow /*int*/  && _y>=0 && _y<__ref._tilespercolumn /*int*/ ) { 
RDebugUtils.currentLine=16842793;
 //BA.debugLineNum = 16842793;BA.debugLine="Dim t As X2Tile = GetTileFromTileLayer(x, y,";
_t = __ref._gettilefromtilelayer /*b4a.example.x2tilemap._x2tile*/ (null,_x,_y,_layer);
RDebugUtils.currentLine=16842794;
 //BA.debugLineNum = 16842794;BA.debugLine="If t <> Null Then";
if (_t!= null) { 
RDebugUtils.currentLine=16842795;
 //BA.debugLineNum = 16842795;BA.debugLine="Dim dt As DrawTask = TargetBC.CreateDrawTask";
_dt = _targetbc._createdrawtask((Object)(_t.CBC /*b4a.example.bitmapcreator._compressedbc*/ ),_t.CBC /*b4a.example.bitmapcreator._compressedbc*/ .TargetRect,_movingleftpixels,_movingtoppixels,__c.True);
RDebugUtils.currentLine=16842796;
 //BA.debugLineNum = 16842796;BA.debugLine="dt.IsCompressedSource = True";
_dt.IsCompressedSource = __c.True;
RDebugUtils.currentLine=16842797;
 //BA.debugLineNum = 16842797;BA.debugLine="dt.TargetBC = TargetBC";
_dt.TargetBC = _targetbc;
RDebugUtils.currentLine=16842798;
 //BA.debugLineNum = 16842798;BA.debugLine="Tasks.Add(dt)";
_tasks.Add((Object)(_dt));
 };
 }}
;
RDebugUtils.currentLine=16842801;
 //BA.debugLineNum = 16842801;BA.debugLine="MovingLeftPixels = MovingLeftPixels + TileWidt";
_movingleftpixels = (int) (_movingleftpixels+__ref._tilewidthpixels /*int*/ );
 }
};
 }
};
 }
};
RDebugUtils.currentLine=16842805;
 //BA.debugLineNum = 16842805;BA.debugLine="If EndTileY - StartTileY > 3 And EndTileX - Start";
if (_endtiley-_starttiley>3 && _endtilex-_starttilex>3) { 
RDebugUtils.currentLine=16842806;
 //BA.debugLineNum = 16842806;BA.debugLine="ReuseTileLeft = StartLeftPixels + TileWidthPixel";
__ref._reusetileleft /*int*/  = (int) (_startleftpixels+__ref._tilewidthpixels /*int*/ );
RDebugUtils.currentLine=16842807;
 //BA.debugLineNum = 16842807;BA.debugLine="ReuseTileTop = StartTopPixels + TileHeightPixels";
__ref._reusetiletop /*int*/  = (int) (_starttoppixels+__ref._tileheightpixels /*int*/ );
RDebugUtils.currentLine=16842808;
 //BA.debugLineNum = 16842808;BA.debugLine="ReuseTilesRect.Initialize(StartTileX + 1, StartT";
__ref._reusetilesrect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .Initialize((float) (_starttilex+1),(float) (_starttiley+1),(float) (_endtilex-1),(float) (_endtiley-1));
RDebugUtils.currentLine=16842809;
 //BA.debugLineNum = 16842809;BA.debugLine="ReuseScreenCenter = LastDrawnScreenCenterStarted";
__ref._reusescreencenter /*anywheresoftware.b4a.objects.B2Vec2*/  = __ref._lastdrawnscreencenterstarted /*anywheresoftware.b4a.objects.B2Vec2*/ .CreateCopy();
 }else {
RDebugUtils.currentLine=16842811;
 //BA.debugLineNum = 16842811;BA.debugLine="ReuseTilesRect.Initialize(-1, -1, -1, -1)";
__ref._reusetilesrect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .Initialize((float) (-1),(float) (-1),(float) (-1),(float) (-1));
 };
RDebugUtils.currentLine=16842813;
 //BA.debugLineNum = 16842813;BA.debugLine="End Sub";
return "";
}
public String  _drawprevious(b4a.example.x2tilemap __ref,int _x,int _y,int _targetleft,int _targettop,b4a.example.bitmapcreator _targetbc,anywheresoftware.b4a.objects.collections.List _tasks) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2tilemap";
if (Debug.shouldDelegate(ba, "drawprevious", true))
	 {return ((String) Debug.delegate(ba, "drawprevious", new Object[] {_x,_y,_targetleft,_targettop,_targetbc,_tasks}));}
b4a.example.bitmapcreator _previousbc = null;
int _dx = 0;
int _dy = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _rect = null;
b4a.example.bitmapcreator._drawtask _dt = null;
RDebugUtils.currentLine=16908288;
 //BA.debugLineNum = 16908288;BA.debugLine="Private Sub DrawPrevious (x As Int, y As Int, Targ";
RDebugUtils.currentLine=16908289;
 //BA.debugLineNum = 16908289;BA.debugLine="Dim PreviousBC As BitmapCreator = TargetViewBC((T";
_previousbc = __ref._targetviewbc /*b4a.example.bitmapcreator[]*/ [(int) ((__ref._targetviewbcindex /*int*/ +1)%2)];
RDebugUtils.currentLine=16908290;
 //BA.debugLineNum = 16908290;BA.debugLine="Dim dx As Int = x - ReuseTilesRect.Left";
_dx = (int) (_x-__ref._reusetilesrect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getLeft());
RDebugUtils.currentLine=16908291;
 //BA.debugLineNum = 16908291;BA.debugLine="Dim dy As Int = y - ReuseTilesRect.Top";
_dy = (int) (_y-__ref._reusetilesrect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getTop());
RDebugUtils.currentLine=16908293;
 //BA.debugLineNum = 16908293;BA.debugLine="Dim rect As B4XRect";
_rect = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=16908294;
 //BA.debugLineNum = 16908294;BA.debugLine="rect.Initialize(ReuseTileLeft + dx * TileWidthPix";
_rect.Initialize((float) (__ref._reusetileleft /*int*/ +_dx*__ref._tilewidthpixels /*int*/ ),(float) (__ref._reusetiletop /*int*/ +_dy*__ref._tileheightpixels /*int*/ ),(float) (0),(float) (0));
RDebugUtils.currentLine=16908295;
 //BA.debugLineNum = 16908295;BA.debugLine="rect.Width = (ReuseTilesRect.Width + 1 - dx) * Ti";
_rect.setWidth((float) ((__ref._reusetilesrect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getWidth()+1-_dx)*__ref._tilewidthpixels /*int*/ ));
RDebugUtils.currentLine=16908296;
 //BA.debugLineNum = 16908296;BA.debugLine="rect.Height = (ReuseTilesRect.Height + 1 - dy) *";
_rect.setHeight((float) ((__ref._reusetilesrect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getHeight()+1-_dy)*__ref._tileheightpixels /*int*/ ));
RDebugUtils.currentLine=16908298;
 //BA.debugLineNum = 16908298;BA.debugLine="Dim dt As DrawTask = TargetBC.CreateDrawTask(Prev";
_dt = _targetbc._createdrawtask((Object)(_previousbc),_rect,_targetleft,_targettop,__c.True);
RDebugUtils.currentLine=16908299;
 //BA.debugLineNum = 16908299;BA.debugLine="dt.TargetBC = TargetBC";
_dt.TargetBC = _targetbc;
RDebugUtils.currentLine=16908300;
 //BA.debugLineNum = 16908300;BA.debugLine="Tasks.Add(dt)";
_tasks.Add((Object)(_dt));
RDebugUtils.currentLine=16908301;
 //BA.debugLineNum = 16908301;BA.debugLine="End Sub";
return "";
}
public b4a.example.x2tilemap._x2tile  _gettilefromtilelayer(b4a.example.x2tilemap __ref,int _mapx,int _mapy,b4a.example.x2tilemap._x2internaltilelayer _layer) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2tilemap";
if (Debug.shouldDelegate(ba, "gettilefromtilelayer", true))
	 {return ((b4a.example.x2tilemap._x2tile) Debug.delegate(ba, "gettilefromtilelayer", new Object[] {_mapx,_mapy,_layer}));}
b4a.example.x2tilemap._x2tile _tile = null;
int _cleanidentifier = 0;
b4a.example.x2tilemap._x2internaltileset _ts = null;
int _index = 0;
int _row = 0;
int _col = 0;
int _x = 0;
int _y = 0;
boolean _h = false;
boolean _v = false;
boolean _d = false;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _src = null;
b4a.example.bitmapcreator._compressedbc _cbc = null;
RDebugUtils.currentLine=16973824;
 //BA.debugLineNum = 16973824;BA.debugLine="Public Sub GetTileFromTileLayer (MapX As Int, MapY";
RDebugUtils.currentLine=16973825;
 //BA.debugLineNum = 16973825;BA.debugLine="Dim tile As X2Tile = Layer.Tiles(MapY * TilesPerR";
_tile = _layer.Tiles /*b4a.example.x2tilemap._x2tile[]*/ [(int) (_mapy*__ref._tilesperrow /*int*/ +_mapx)];
RDebugUtils.currentLine=16973826;
 //BA.debugLineNum = 16973826;BA.debugLine="If tile.TileIdentifier = 0 Then Return Null";
if (_tile.TileIdentifier /*int*/ ==0) { 
if (true) return (b4a.example.x2tilemap._x2tile)(__c.Null);};
RDebugUtils.currentLine=16973827;
 //BA.debugLineNum = 16973827;BA.debugLine="If tile.CBC <> Null Then Return tile";
if (_tile.CBC /*b4a.example.bitmapcreator._compressedbc*/ != null) { 
if (true) return _tile;};
RDebugUtils.currentLine=16973828;
 //BA.debugLineNum = 16973828;BA.debugLine="If TilesCBC.ContainsKey(tile.TileIdentifier) Then";
if (__ref._tilescbc /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_tile.TileIdentifier /*int*/ ))) { 
RDebugUtils.currentLine=16973829;
 //BA.debugLineNum = 16973829;BA.debugLine="tile.CBC = TilesCBC.Get(tile.TileIdentifier)";
_tile.CBC /*b4a.example.bitmapcreator._compressedbc*/  = (b4a.example.bitmapcreator._compressedbc)(__ref._tilescbc /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_tile.TileIdentifier /*int*/ )));
RDebugUtils.currentLine=16973830;
 //BA.debugLineNum = 16973830;BA.debugLine="Return tile";
if (true) return _tile;
 };
RDebugUtils.currentLine=16973832;
 //BA.debugLineNum = 16973832;BA.debugLine="Dim CleanIdentifier As Int = Bit.And(0x1FFFFFFF,";
_cleanidentifier = __c.Bit.And(((int)0x1fffffff),_tile.TileIdentifier /*int*/ );
RDebugUtils.currentLine=16973833;
 //BA.debugLineNum = 16973833;BA.debugLine="For Each ts As X2InternalTileSet In TileSets.Valu";
{
final anywheresoftware.b4a.BA.IterableList group9 = __ref._tilesets /*anywheresoftware.b4a.objects.collections.Map*/ .Values();
final int groupLen9 = group9.getSize()
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_ts = (b4a.example.x2tilemap._x2internaltileset)(group9.Get(index9));
RDebugUtils.currentLine=16973834;
 //BA.debugLineNum = 16973834;BA.debugLine="If ts.FirstGID <= CleanIdentifier And ts.FirstGI";
if (_ts.FirstGID /*int*/ <=_cleanidentifier && _ts.FirstGID /*int*/ +_ts.Count /*int*/ >_cleanidentifier) { 
if (true) break;};
 }
};
RDebugUtils.currentLine=16973836;
 //BA.debugLineNum = 16973836;BA.debugLine="Dim index As Int = CleanIdentifier - ts.FirstGID";
_index = (int) (_cleanidentifier-_ts.FirstGID /*int*/ );
RDebugUtils.currentLine=16973837;
 //BA.debugLineNum = 16973837;BA.debugLine="Dim row As Int = index / ts.Columns";
_row = (int) (_index/(double)_ts.Columns /*int*/ );
RDebugUtils.currentLine=16973838;
 //BA.debugLineNum = 16973838;BA.debugLine="Dim col As Int = index Mod ts.Columns";
_col = (int) (_index%_ts.Columns /*int*/ );
RDebugUtils.currentLine=16973839;
 //BA.debugLineNum = 16973839;BA.debugLine="Dim x As Int = ts.Margin + col * (ts.TileWidth +";
_x = (int) (_ts.Margin /*int*/ +_col*(_ts.TileWidth /*int*/ +_ts.Spacing /*int*/ ));
RDebugUtils.currentLine=16973840;
 //BA.debugLineNum = 16973840;BA.debugLine="Dim y As Int = ts.Margin + row * (ts.TileHeight +";
_y = (int) (_ts.Margin /*int*/ +_row*(_ts.TileHeight /*int*/ +_ts.Spacing /*int*/ ));
RDebugUtils.currentLine=16973841;
 //BA.debugLineNum = 16973841;BA.debugLine="Dim h As Boolean = Bit.And(tile.TileIdentifier, F";
_h = __c.Bit.And(_tile.TileIdentifier /*int*/ ,__ref._flipped_horizontally /*int*/ )!=0;
RDebugUtils.currentLine=16973842;
 //BA.debugLineNum = 16973842;BA.debugLine="Dim v As Boolean = Bit.And(tile.TileIdentifier, F";
_v = __c.Bit.And(_tile.TileIdentifier /*int*/ ,__ref._flipped_vertically /*int*/ )!=0;
RDebugUtils.currentLine=16973843;
 //BA.debugLineNum = 16973843;BA.debugLine="Dim d As Boolean = Bit.And(tile.TileIdentifier, F";
_d = __c.Bit.And(_tile.TileIdentifier /*int*/ ,__ref._flipped_diagonally_flag /*int*/ )!=0;
RDebugUtils.currentLine=16973845;
 //BA.debugLineNum = 16973845;BA.debugLine="Dim src As B4XRect";
_src = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=16973846;
 //BA.debugLineNum = 16973846;BA.debugLine="src.Initialize(x, y, x + ts.TileWidth, y + ts.Til";
_src.Initialize((float) (_x),(float) (_y),(float) (_x+_ts.TileWidth /*int*/ ),(float) (_y+_ts.TileHeight /*int*/ ));
RDebugUtils.currentLine=16973847;
 //BA.debugLineNum = 16973847;BA.debugLine="SingleTileBC.FillRect(xui.Color_Transparent, Sing";
__ref._singletilebc /*b4a.example.bitmapcreator*/ ._fillrect(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__ref._singletilebc /*b4a.example.bitmapcreator*/ ._targetrect);
RDebugUtils.currentLine=16973848;
 //BA.debugLineNum = 16973848;BA.debugLine="X2.GraphicCache.DrawBitmapCreatorFlipped(SingleTi";
__ref._x2 /*b4a.example.x2utils*/ ._graphiccache /*b4a.example.x2spritegraphiccache*/ ._drawbitmapcreatorflipped /*String*/ (null,__ref._singletilebc /*b4a.example.bitmapcreator*/ ,_ts.TilesBC /*b4a.example.bitmapcreator*/ ,(float) (__ref._singletilebc /*b4a.example.bitmapcreator*/ ._mwidth/(double)_ts.TileWidth /*int*/ ),(float) (__ref._singletilebc /*b4a.example.bitmapcreator*/ ._mheight/(double)_ts.TileHeight /*int*/ ),_src,_h,_v,_d);
RDebugUtils.currentLine=16973849;
 //BA.debugLineNum = 16973849;BA.debugLine="Dim cbc As CompressedBC = SingleTileBC.ExtractCom";
_cbc = __ref._singletilebc /*b4a.example.bitmapcreator*/ ._extractcompressedbc(__ref._singletilebc /*b4a.example.bitmapcreator*/ ._targetrect,__ref._x2 /*b4a.example.x2utils*/ ._graphiccache /*b4a.example.x2spritegraphiccache*/ ._cbccache /*b4a.example.bitmapcreator._internalcompressedbccache*/ );
RDebugUtils.currentLine=16973850;
 //BA.debugLineNum = 16973850;BA.debugLine="TilesCBC.Put(tile.TileIdentifier, cbc)";
__ref._tilescbc /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_tile.TileIdentifier /*int*/ ),(Object)(_cbc));
RDebugUtils.currentLine=16973851;
 //BA.debugLineNum = 16973851;BA.debugLine="tile.CBC = cbc";
_tile.CBC /*b4a.example.bitmapcreator._compressedbc*/  = _cbc;
RDebugUtils.currentLine=16973852;
 //BA.debugLineNum = 16973852;BA.debugLine="Return tile";
if (true) return _tile;
RDebugUtils.currentLine=16973853;
 //BA.debugLineNum = 16973853;BA.debugLine="End Sub";
return null;
}
public b4a.example.bitmapcreator  _getcurrentbc(b4a.example.x2tilemap __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2tilemap";
if (Debug.shouldDelegate(ba, "getcurrentbc", true))
	 {return ((b4a.example.bitmapcreator) Debug.delegate(ba, "getcurrentbc", null));}
RDebugUtils.currentLine=16646144;
 //BA.debugLineNum = 16646144;BA.debugLine="Public Sub getCurrentBC As BitmapCreator";
RDebugUtils.currentLine=16646145;
 //BA.debugLineNum = 16646145;BA.debugLine="Return TargetViewBC(TargetViewBCIndex)";
if (true) return __ref._targetviewbc /*b4a.example.bitmapcreator[]*/ [__ref._targetviewbcindex /*int*/ ];
RDebugUtils.currentLine=16646146;
 //BA.debugLineNum = 16646146;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _readjson(b4a.example.x2tilemap __ref,String _dir,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2tilemap";
if (Debug.shouldDelegate(ba, "readjson", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "readjson", new Object[] {_dir,_filename}));}
RDebugUtils.currentLine=16384000;
 //BA.debugLineNum = 16384000;BA.debugLine="Private Sub ReadJson (Dir As String, FileName As S";
RDebugUtils.currentLine=16384001;
 //BA.debugLineNum = 16384001;BA.debugLine="parser.Initialize(File.ReadString(Dir, FileName))";
__ref._parser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(__c.File.ReadString(_dir,_filename));
RDebugUtils.currentLine=16384002;
 //BA.debugLineNum = 16384002;BA.debugLine="Return parser.NextObject";
if (true) return __ref._parser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextObject();
RDebugUtils.currentLine=16384003;
 //BA.debugLineNum = 16384003;BA.debugLine="End Sub";
return null;
}
public String  _loadtileset(b4a.example.x2tilemap __ref,anywheresoftware.b4a.objects.collections.Map _m,int _firstgid,String _dir) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2tilemap";
if (Debug.shouldDelegate(ba, "loadtileset", true))
	 {return ((String) Debug.delegate(ba, "loadtileset", new Object[] {_m,_firstgid,_dir}));}
b4a.example.x2tilemap._x2internaltileset _ts = null;
RDebugUtils.currentLine=16449536;
 //BA.debugLineNum = 16449536;BA.debugLine="Private Sub LoadTileSet (m As Map, FirstGID As Int";
RDebugUtils.currentLine=16449538;
 //BA.debugLineNum = 16449538;BA.debugLine="Dim ts As X2InternalTileSet";
_ts = new b4a.example.x2tilemap._x2internaltileset();
RDebugUtils.currentLine=16449539;
 //BA.debugLineNum = 16449539;BA.debugLine="ts.Initialize";
_ts.Initialize();
RDebugUtils.currentLine=16449540;
 //BA.debugLineNum = 16449540;BA.debugLine="ts.Columns = m.Get(\"columns\")";
_ts.Columns /*int*/  = (int)(BA.ObjectToNumber(_m.Get((Object)("columns"))));
RDebugUtils.currentLine=16449541;
 //BA.debugLineNum = 16449541;BA.debugLine="ts.Name = m.Get(\"name\")";
_ts.Name /*String*/  = BA.ObjectToString(_m.Get((Object)("name")));
RDebugUtils.currentLine=16449542;
 //BA.debugLineNum = 16449542;BA.debugLine="If ts.Columns = 0 Then";
if (_ts.Columns /*int*/ ==0) { 
RDebugUtils.currentLine=16449543;
 //BA.debugLineNum = 16449543;BA.debugLine="Log($\"Skipping tile set: ${ts.Name}\"$)";
__c.LogImpl("916449543",("Skipping tile set: "+__c.SmartStringFormatter("",(Object)(_ts.Name /*String*/ ))+""),0);
RDebugUtils.currentLine=16449544;
 //BA.debugLineNum = 16449544;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=16449546;
 //BA.debugLineNum = 16449546;BA.debugLine="ts.TilesBC = X2.BitmapToBC(xui.LoadBitmap(Dir, m.";
_ts.TilesBC /*b4a.example.bitmapcreator*/  = __ref._x2 /*b4a.example.x2utils*/ ._bitmaptobc /*b4a.example.bitmapcreator*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .LoadBitmap(_dir,BA.ObjectToString(_m.Get((Object)("image")))),(float) (1));
RDebugUtils.currentLine=16449547;
 //BA.debugLineNum = 16449547;BA.debugLine="ts.FirstGID = FirstGID";
_ts.FirstGID /*int*/  = _firstgid;
RDebugUtils.currentLine=16449548;
 //BA.debugLineNum = 16449548;BA.debugLine="ts.Margin = m.Get(\"margin\")";
_ts.Margin /*int*/  = (int)(BA.ObjectToNumber(_m.Get((Object)("margin"))));
RDebugUtils.currentLine=16449549;
 //BA.debugLineNum = 16449549;BA.debugLine="ts.Spacing = m.Get(\"spacing\")";
_ts.Spacing /*int*/  = (int)(BA.ObjectToNumber(_m.Get((Object)("spacing"))));
RDebugUtils.currentLine=16449550;
 //BA.debugLineNum = 16449550;BA.debugLine="ts.Count = m.Get(\"tilecount\")";
_ts.Count /*int*/  = (int)(BA.ObjectToNumber(_m.Get((Object)("tilecount"))));
RDebugUtils.currentLine=16449551;
 //BA.debugLineNum = 16449551;BA.debugLine="ts.TileWidth = m.Get(\"tilewidth\")";
_ts.TileWidth /*int*/  = (int)(BA.ObjectToNumber(_m.Get((Object)("tilewidth"))));
RDebugUtils.currentLine=16449552;
 //BA.debugLineNum = 16449552;BA.debugLine="ts.TileHeight = m.Get(\"tileheight\")";
_ts.TileHeight /*int*/  = (int)(BA.ObjectToNumber(_m.Get((Object)("tileheight"))));
RDebugUtils.currentLine=16449553;
 //BA.debugLineNum = 16449553;BA.debugLine="If TileSets.ContainsKey(ts.Name) Then";
if (__ref._tilesets /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_ts.Name /*String*/ ))) { 
RDebugUtils.currentLine=16449554;
 //BA.debugLineNum = 16449554;BA.debugLine="Log(\"WARNING: Duplicate tile sets with same name";
__c.LogImpl("916449554","WARNING: Duplicate tile sets with same name: "+_ts.Name /*String*/ ,0);
RDebugUtils.currentLine=16449555;
 //BA.debugLineNum = 16449555;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=16449557;
 //BA.debugLineNum = 16449557;BA.debugLine="TileSets.Put(ts.Name, ts)";
__ref._tilesets /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_ts.Name /*String*/ ),(Object)(_ts));
RDebugUtils.currentLine=16449558;
 //BA.debugLineNum = 16449558;BA.debugLine="End Sub";
return "";
}
public String  _parsetilelayer(b4a.example.x2tilemap __ref,anywheresoftware.b4a.objects.collections.Map _layer) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2tilemap";
if (Debug.shouldDelegate(ba, "parsetilelayer", true))
	 {return ((String) Debug.delegate(ba, "parsetilelayer", new Object[] {_layer}));}
String _compression = "";
byte[] _bytes = null;
b4a.example.x2tilemap._x2tile[] _tiles = null;
int _y = 0;
int _x = 0;
b4a.example.x2tilemap._x2internaltilelayer _l = null;
RDebugUtils.currentLine=15532032;
 //BA.debugLineNum = 15532032;BA.debugLine="Private Sub ParseTileLayer (layer As Map)";
RDebugUtils.currentLine=15532033;
 //BA.debugLineNum = 15532033;BA.debugLine="If layer.GetDefault(\"encoding\", \"\") <> \"base64\" T";
if ((_layer.GetDefault((Object)("encoding"),(Object)(""))).equals((Object)("base64")) == false) { 
RDebugUtils.currentLine=15532034;
 //BA.debugLineNum = 15532034;BA.debugLine="Log(\"ERROR: Invalid encoding!!!\")";
__c.LogImpl("915532034","ERROR: Invalid encoding!!!",0);
RDebugUtils.currentLine=15532035;
 //BA.debugLineNum = 15532035;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=15532037;
 //BA.debugLineNum = 15532037;BA.debugLine="Dim compression As String = layer.GetDefault(\"com";
_compression = BA.ObjectToString(_layer.GetDefault((Object)("compression"),(Object)("")));
RDebugUtils.currentLine=15532038;
 //BA.debugLineNum = 15532038;BA.debugLine="If compression <> \"gzip\" And compression <> \"zlib";
if ((_compression).equals("gzip") == false && (_compression).equals("zlib") == false) { 
RDebugUtils.currentLine=15532039;
 //BA.debugLineNum = 15532039;BA.debugLine="Log(\"ERROR: Invalid compression!!!\")";
__c.LogImpl("915532039","ERROR: Invalid compression!!!",0);
RDebugUtils.currentLine=15532040;
 //BA.debugLineNum = 15532040;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=15532042;
 //BA.debugLineNum = 15532042;BA.debugLine="Dim bytes() As Byte = su.DecodeBase64(layer.Get(\"";
_bytes = __ref._su /*anywheresoftware.b4a.objects.StringUtils*/ .DecodeBase64(BA.ObjectToString(_layer.Get((Object)("data"))));
RDebugUtils.currentLine=15532043;
 //BA.debugLineNum = 15532043;BA.debugLine="bytes = cs.DecompressBytes(bytes, compression)";
_bytes = __ref._cs /*anywheresoftware.b4a.randomaccessfile.CompressedStreams*/ .DecompressBytes(_bytes,_compression);
RDebugUtils.currentLine=15532044;
 //BA.debugLineNum = 15532044;BA.debugLine="raf.Initialize3(bytes, True)";
__ref._raf /*anywheresoftware.b4a.randomaccessfile.RandomAccessFile*/ .Initialize3(_bytes,__c.True);
RDebugUtils.currentLine=15532045;
 //BA.debugLineNum = 15532045;BA.debugLine="Dim tiles(TilesPerRow * TilesPerColumn) As X2Tile";
_tiles = new b4a.example.x2tilemap._x2tile[(int) (__ref._tilesperrow /*int*/ *__ref._tilespercolumn /*int*/ )];
{
int d0 = _tiles.length;
for (int i0 = 0;i0 < d0;i0++) {
_tiles[i0] = new b4a.example.x2tilemap._x2tile();
}
}
;
RDebugUtils.currentLine=15532046;
 //BA.debugLineNum = 15532046;BA.debugLine="For y = 0 To TilesPerColumn - 1";
{
final int step14 = 1;
final int limit14 = (int) (__ref._tilespercolumn /*int*/ -1);
_y = (int) (0) ;
for (;_y <= limit14 ;_y = _y + step14 ) {
RDebugUtils.currentLine=15532047;
 //BA.debugLineNum = 15532047;BA.debugLine="For x = 0 To TilesPerRow - 1";
{
final int step15 = 1;
final int limit15 = (int) (__ref._tilesperrow /*int*/ -1);
_x = (int) (0) ;
for (;_x <= limit15 ;_x = _x + step15 ) {
RDebugUtils.currentLine=15532048;
 //BA.debugLineNum = 15532048;BA.debugLine="tiles(y * TilesPerRow + x).TileIdentifier = raf";
_tiles[(int) (_y*__ref._tilesperrow /*int*/ +_x)].TileIdentifier /*int*/  = __ref._raf /*anywheresoftware.b4a.randomaccessfile.RandomAccessFile*/ .ReadInt(__ref._raf /*anywheresoftware.b4a.randomaccessfile.RandomAccessFile*/ .CurrentPosition);
 }
};
 }
};
RDebugUtils.currentLine=15532051;
 //BA.debugLineNum = 15532051;BA.debugLine="Dim l As X2InternalTileLayer";
_l = new b4a.example.x2tilemap._x2internaltilelayer();
RDebugUtils.currentLine=15532052;
 //BA.debugLineNum = 15532052;BA.debugLine="l.Initialize";
_l.Initialize();
RDebugUtils.currentLine=15532053;
 //BA.debugLineNum = 15532053;BA.debugLine="l.Name = layer.Get(\"name\")";
_l.Name /*String*/  = BA.ObjectToString(_layer.Get((Object)("name")));
RDebugUtils.currentLine=15532054;
 //BA.debugLineNum = 15532054;BA.debugLine="l.Tiles = tiles";
_l.Tiles /*b4a.example.x2tilemap._x2tile[]*/  = _tiles;
RDebugUtils.currentLine=15532055;
 //BA.debugLineNum = 15532055;BA.debugLine="Layers.Put(l.Name, l)";
__ref._layers /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_l.Name /*String*/ ),(Object)(_l));
RDebugUtils.currentLine=15532056;
 //BA.debugLineNum = 15532056;BA.debugLine="End Sub";
return "";
}
public String  _parseobjectslayer(b4a.example.x2tilemap __ref,anywheresoftware.b4a.objects.collections.Map _layer) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2tilemap";
if (Debug.shouldDelegate(ba, "parseobjectslayer", true))
	 {return ((String) Debug.delegate(ba, "parseobjectslayer", new Object[] {_layer}));}
b4a.example.x2tilemap._x2objectslayer _ol = null;
anywheresoftware.b4a.objects.collections.List _objects = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _om = null;
b4a.example.x2tilemap._x2tileobjecttemplate _template = null;
RDebugUtils.currentLine=15204352;
 //BA.debugLineNum = 15204352;BA.debugLine="Private Sub ParseObjectsLayer (layer As Map)";
RDebugUtils.currentLine=15204353;
 //BA.debugLineNum = 15204353;BA.debugLine="Dim ol As X2ObjectsLayer";
_ol = new b4a.example.x2tilemap._x2objectslayer();
RDebugUtils.currentLine=15204354;
 //BA.debugLineNum = 15204354;BA.debugLine="ol.Initialize";
_ol.Initialize();
RDebugUtils.currentLine=15204355;
 //BA.debugLineNum = 15204355;BA.debugLine="ol.ObjectsById.Initialize";
_ol.ObjectsById /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=15204356;
 //BA.debugLineNum = 15204356;BA.debugLine="ol.ObjectsByName.Initialize";
_ol.ObjectsByName /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=15204357;
 //BA.debugLineNum = 15204357;BA.debugLine="ol.Name = layer.Get(\"name\")";
_ol.Name /*String*/  = BA.ObjectToString(_layer.Get((Object)("name")));
RDebugUtils.currentLine=15204358;
 //BA.debugLineNum = 15204358;BA.debugLine="Dim objects As List = layer.Get(\"objects\")";
_objects = new anywheresoftware.b4a.objects.collections.List();
_objects = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_layer.Get((Object)("objects"))));
RDebugUtils.currentLine=15204360;
 //BA.debugLineNum = 15204360;BA.debugLine="For i = 0 To objects.Size - 1";
{
final int step7 = 1;
final int limit7 = (int) (_objects.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
RDebugUtils.currentLine=15204361;
 //BA.debugLineNum = 15204361;BA.debugLine="Dim om As Map = objects.Get(i)";
_om = new anywheresoftware.b4a.objects.collections.Map();
_om = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_objects.Get(_i)));
RDebugUtils.currentLine=15204362;
 //BA.debugLineNum = 15204362;BA.debugLine="If om.ContainsKey(\"gid\") Then";
if (_om.ContainsKey((Object)("gid"))) { 
RDebugUtils.currentLine=15204363;
 //BA.debugLineNum = 15204363;BA.debugLine="If om.Get(\"name\") <> \"\" Then";
if ((_om.Get((Object)("name"))).equals((Object)("")) == false) { 
RDebugUtils.currentLine=15204364;
 //BA.debugLineNum = 15204364;BA.debugLine="Log($\"Skipping tile object: (${om.Get(\"name\")}";
__c.LogImpl("915204364",("Skipping tile object: ("+__c.SmartStringFormatter("",_om.Get((Object)("name")))+")"),0);
 };
RDebugUtils.currentLine=15204366;
 //BA.debugLineNum = 15204366;BA.debugLine="Continue";
if (true) continue;
 };
RDebugUtils.currentLine=15204368;
 //BA.debugLineNum = 15204368;BA.debugLine="If om.Get(\"type\") <> \"x2\" Then";
if ((_om.Get((Object)("type"))).equals((Object)("x2")) == false) { 
RDebugUtils.currentLine=15204369;
 //BA.debugLineNum = 15204369;BA.debugLine="Log($\"Type should be set to x2 (${om.Get(\"name\"";
__c.LogImpl("915204369",("Type should be set to x2 ("+__c.SmartStringFormatter("",_om.Get((Object)("name")))+")"),0);
RDebugUtils.currentLine=15204370;
 //BA.debugLineNum = 15204370;BA.debugLine="Continue";
if (true) continue;
 };
RDebugUtils.currentLine=15204372;
 //BA.debugLineNum = 15204372;BA.debugLine="Dim template As X2TileObjectTemplate";
_template = new b4a.example.x2tilemap._x2tileobjecttemplate();
RDebugUtils.currentLine=15204373;
 //BA.debugLineNum = 15204373;BA.debugLine="template.Initialize";
_template.Initialize();
RDebugUtils.currentLine=15204374;
 //BA.debugLineNum = 15204374;BA.debugLine="template.ObjectLayer = ol";
_template.ObjectLayer /*b4a.example.x2tilemap._x2objectslayer*/  = _ol;
RDebugUtils.currentLine=15204375;
 //BA.debugLineNum = 15204375;BA.debugLine="template.Id = om.Get(\"id\")";
_template.Id /*int*/  = (int)(BA.ObjectToNumber(_om.Get((Object)("id"))));
RDebugUtils.currentLine=15204376;
 //BA.debugLineNum = 15204376;BA.debugLine="template.Name = om.Get(\"name\")";
_template.Name /*String*/  = BA.ObjectToString(_om.Get((Object)("name")));
RDebugUtils.currentLine=15204377;
 //BA.debugLineNum = 15204377;BA.debugLine="template.Props = om";
_template.Props /*anywheresoftware.b4a.objects.collections.Map*/  = _om;
RDebugUtils.currentLine=15204378;
 //BA.debugLineNum = 15204378;BA.debugLine="If om.ContainsKey(\"properties\") = False Then";
if (_om.ContainsKey((Object)("properties"))==__c.False) { 
RDebugUtils.currentLine=15204379;
 //BA.debugLineNum = 15204379;BA.debugLine="template.CustomProps.Initialize";
_template.CustomProps /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
 }else {
RDebugUtils.currentLine=15204381;
 //BA.debugLineNum = 15204381;BA.debugLine="If TileMapVersion >= 1.2 Then";
if (__ref._tilemapversion /*float*/ >=1.2) { 
RDebugUtils.currentLine=15204382;
 //BA.debugLineNum = 15204382;BA.debugLine="template.CustomProps = ReadCustomProps(om.Get(";
_template.CustomProps /*anywheresoftware.b4a.objects.collections.Map*/  = __ref._readcustomprops /*anywheresoftware.b4a.objects.collections.Map*/ (null,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_om.Get((Object)("properties")))));
 }else {
RDebugUtils.currentLine=15204384;
 //BA.debugLineNum = 15204384;BA.debugLine="template.CustomProps = ConvertMapToWritableMap";
_template.CustomProps /*anywheresoftware.b4a.objects.collections.Map*/  = __ref._convertmaptowritablemapifneeded /*anywheresoftware.b4a.objects.collections.Map*/ (null,(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_om.Get((Object)("properties")))));
 };
 };
RDebugUtils.currentLine=15204387;
 //BA.debugLineNum = 15204387;BA.debugLine="template.FirstTime = True";
_template.FirstTime /*boolean*/  = __c.True;
RDebugUtils.currentLine=15204389;
 //BA.debugLineNum = 15204389;BA.debugLine="ol.ObjectsById.Put(template.Id, template)";
_ol.ObjectsById /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_template.Id /*int*/ ),(Object)(_template));
RDebugUtils.currentLine=15204390;
 //BA.debugLineNum = 15204390;BA.debugLine="ol.ObjectsByName.Put(template.Name, template)";
_ol.ObjectsByName /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_template.Name /*String*/ ),(Object)(_template));
 }
};
RDebugUtils.currentLine=15204392;
 //BA.debugLineNum = 15204392;BA.debugLine="Layers.Put(ol.Name, ol)";
__ref._layers /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_ol.Name /*String*/ ),(Object)(_ol));
RDebugUtils.currentLine=15204393;
 //BA.debugLineNum = 15204393;BA.debugLine="End Sub";
return "";
}
public String  _readobjectstemplate(b4a.example.x2tilemap __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2tilemap";
if (Debug.shouldDelegate(ba, "readobjectstemplate", true))
	 {return ((String) Debug.delegate(ba, "readobjectstemplate", null));}
anywheresoftware.b4a.objects.collections.List _l1 = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
anywheresoftware.b4a.objects.collections.List _props = null;
anywheresoftware.b4a.objects.collections.Map _p = null;
RDebugUtils.currentLine=15138816;
 //BA.debugLineNum = 15138816;BA.debugLine="Private Sub ReadObjectsTemplate";
RDebugUtils.currentLine=15138817;
 //BA.debugLineNum = 15138817;BA.debugLine="DefaultCustomProperties.Initialize";
__ref._defaultcustomproperties /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=15138818;
 //BA.debugLineNum = 15138818;BA.debugLine="parser.Initialize(File.ReadString(File.DirAssets,";
__ref._parser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(__c.File.ReadString(__c.File.getDirAssets(),"objecttypes.json"));
RDebugUtils.currentLine=15138819;
 //BA.debugLineNum = 15138819;BA.debugLine="Dim l1 As List = parser.NextArray";
_l1 = new anywheresoftware.b4a.objects.collections.List();
_l1 = __ref._parser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=15138820;
 //BA.debugLineNum = 15138820;BA.debugLine="Dim m As Map = l1.Get(0)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_l1.Get((int) (0))));
RDebugUtils.currentLine=15138821;
 //BA.debugLineNum = 15138821;BA.debugLine="Dim props As List = m.Get(\"properties\")";
_props = new anywheresoftware.b4a.objects.collections.List();
_props = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_m.Get((Object)("properties"))));
RDebugUtils.currentLine=15138822;
 //BA.debugLineNum = 15138822;BA.debugLine="For Each p As Map In props";
_p = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group6 = _props;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_p = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group6.Get(index6)));
RDebugUtils.currentLine=15138823;
 //BA.debugLineNum = 15138823;BA.debugLine="DefaultCustomProperties.Put(p.Get(\"name\"), p.Get";
__ref._defaultcustomproperties /*anywheresoftware.b4a.objects.collections.Map*/ .Put(_p.Get((Object)("name")),_p.Get((Object)("value")));
 }
};
RDebugUtils.currentLine=15138825;
 //BA.debugLineNum = 15138825;BA.debugLine="Log($\"Loading objecttypes.json v${DefaultCustomPr";
__c.LogImpl("915138825",("Loading objecttypes.json v"+__c.SmartStringFormatter("",__ref._defaultcustomproperties /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("x2 tiled version")))+""),0);
RDebugUtils.currentLine=15138826;
 //BA.debugLineNum = 15138826;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B2Vec2  _mapxytoworldvec(b4a.example.x2tilemap __ref,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2tilemap";
if (Debug.shouldDelegate(ba, "mapxytoworldvec", true))
	 {return ((anywheresoftware.b4a.objects.B2Vec2) Debug.delegate(ba, "mapxytoworldvec", new Object[] {_x,_y}));}
RDebugUtils.currentLine=16318464;
 //BA.debugLineNum = 16318464;BA.debugLine="Private Sub MapXYToWorldVec(x As Float, y As Float";
RDebugUtils.currentLine=16318465;
 //BA.debugLineNum = 16318465;BA.debugLine="Return X2.CreateVec2(x * MapXToMeter, (MapBottomY";
if (true) return __ref._x2 /*b4a.example.x2utils*/ ._createvec2 /*anywheresoftware.b4a.objects.B2Vec2*/ (null,(float) (_x*__ref._mapxtometer /*float*/ ),(float) ((__ref._mapbottomyoriginalpixels /*int*/ -_y)*__ref._mapytometer /*float*/ ));
RDebugUtils.currentLine=16318466;
 //BA.debugLineNum = 16318466;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _readcustomprops(b4a.example.x2tilemap __ref,anywheresoftware.b4a.objects.collections.List _list) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2tilemap";
if (Debug.shouldDelegate(ba, "readcustomprops", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "readcustomprops", new Object[] {_list}));}
anywheresoftware.b4a.objects.collections.Map _res = null;
anywheresoftware.b4a.objects.collections.Map _p = null;
RDebugUtils.currentLine=15269888;
 //BA.debugLineNum = 15269888;BA.debugLine="Private Sub ReadCustomProps (list As List) As Map";
RDebugUtils.currentLine=15269889;
 //BA.debugLineNum = 15269889;BA.debugLine="Dim res As Map";
_res = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=15269890;
 //BA.debugLineNum = 15269890;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=15269891;
 //BA.debugLineNum = 15269891;BA.debugLine="For Each p As Map In list";
_p = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group3 = _list;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_p = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group3.Get(index3)));
RDebugUtils.currentLine=15269892;
 //BA.debugLineNum = 15269892;BA.debugLine="res.Put(p.Get(\"name\"), p.Get(\"value\"))";
_res.Put(_p.Get((Object)("name")),_p.Get((Object)("value")));
 }
};
RDebugUtils.currentLine=15269894;
 //BA.debugLineNum = 15269894;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=15269895;
 //BA.debugLineNum = 15269895;BA.debugLine="End Sub";
return null;
}
public String  _setbackgroundbitmap(b4a.example.x2tilemap __ref,anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2tilemap";
if (Debug.shouldDelegate(ba, "setbackgroundbitmap", true))
	 {return ((String) Debug.delegate(ba, "setbackgroundbitmap", new Object[] {_bmp}));}
RDebugUtils.currentLine=16580608;
 //BA.debugLineNum = 16580608;BA.debugLine="Public Sub SetBackgroundBitmap (bmp As B4XBitmap)";
RDebugUtils.currentLine=16580609;
 //BA.debugLineNum = 16580609;BA.debugLine="BackgroundColorBC.CopyPixelsFromBitmap(bmp)";
__ref._backgroundcolorbc /*b4a.example.bitmapcreator*/ ._copypixelsfrombitmap(_bmp);
RDebugUtils.currentLine=16580610;
 //BA.debugLineNum = 16580610;BA.debugLine="End Sub";
return "";
}
public String  _setbackgroundcolor(b4a.example.x2tilemap __ref,int _clr) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2tilemap";
if (Debug.shouldDelegate(ba, "setbackgroundcolor", true))
	 {return ((String) Debug.delegate(ba, "setbackgroundcolor", new Object[] {_clr}));}
RDebugUtils.currentLine=16515072;
 //BA.debugLineNum = 16515072;BA.debugLine="Public Sub SetBackgroundColor (clr As Int)";
RDebugUtils.currentLine=16515073;
 //BA.debugLineNum = 16515073;BA.debugLine="BackgroundColorBC.FillRect(clr, BackgroundColorBC";
__ref._backgroundcolorbc /*b4a.example.bitmapcreator*/ ._fillrect(_clr,__ref._backgroundcolorbc /*b4a.example.bitmapcreator*/ ._targetrect);
RDebugUtils.currentLine=16515074;
 //BA.debugLineNum = 16515074;BA.debugLine="End Sub";
return "";
}
public String  _setdimensionsshared(b4a.example.x2tilemap __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2tilemap";
if (Debug.shouldDelegate(ba, "setdimensionsshared", true))
	 {return ((String) Debug.delegate(ba, "setdimensionsshared", null));}
RDebugUtils.currentLine=15728640;
 //BA.debugLineNum = 15728640;BA.debugLine="Private Sub SetDimensionsShared";
RDebugUtils.currentLine=15728641;
 //BA.debugLineNum = 15728641;BA.debugLine="MapXToMeter = TileWidthMeters / OriginalTileWidth";
__ref._mapxtometer /*float*/  = (float) (__ref._tilewidthmeters /*float*/ /(double)__ref._originaltilewidthpixels /*int*/ );
RDebugUtils.currentLine=15728642;
 //BA.debugLineNum = 15728642;BA.debugLine="MapYToMeter = TileHeightMeters / OriginalTileHeig";
__ref._mapytometer /*float*/  = (float) (__ref._tileheightmeters /*float*/ /(double)__ref._originaltileheightpixels /*int*/ );
RDebugUtils.currentLine=15728643;
 //BA.debugLineNum = 15728643;BA.debugLine="MapAABB.Initialize2(X2.CreateVec2(0, 0), X2.Creat";
__ref._mapaabb /*anywheresoftware.b4a.objects.B2AABB*/ .Initialize2(__ref._x2 /*b4a.example.x2utils*/ ._createvec2 /*anywheresoftware.b4a.objects.B2Vec2*/ (null,(float) (0),(float) (0)),__ref._x2 /*b4a.example.x2utils*/ ._createvec2 /*anywheresoftware.b4a.objects.B2Vec2*/ (null,(float) (__ref._tilewidthmeters /*float*/ *__ref._tilesperrow /*int*/ ),(float) (__ref._tileheightmeters /*float*/ *__ref._tilespercolumn /*int*/ )));
RDebugUtils.currentLine=15728644;
 //BA.debugLineNum = 15728644;BA.debugLine="Log($\"TileMap: AABB: ${MapAABB}, Map Pixels (X) p";
__c.LogImpl("915728644",("TileMap: AABB: "+__c.SmartStringFormatter("",(Object)(__ref._mapaabb /*anywheresoftware.b4a.objects.B2AABB*/ ))+", Map Pixels (X) per Meter: "+__c.SmartStringFormatter("1.2",(Object)(1/(double)__ref._mapxtometer /*float*/ ))+", Map Pixels (Y) per Meter: "+__c.SmartStringFormatter("1.2",(Object)(1/(double)__ref._mapytometer /*float*/ ))+""),0);
RDebugUtils.currentLine=15728645;
 //BA.debugLineNum = 15728645;BA.debugLine="End Sub";
return "";
}
public String  _setsingletiledimensionsinmeters(b4a.example.x2tilemap __ref,float _widthmeters,float _heightmeters) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2tilemap";
if (Debug.shouldDelegate(ba, "setsingletiledimensionsinmeters", true))
	 {return ((String) Debug.delegate(ba, "setsingletiledimensionsinmeters", new Object[] {_widthmeters,_heightmeters}));}
RDebugUtils.currentLine=15597568;
 //BA.debugLineNum = 15597568;BA.debugLine="Public Sub SetSingleTileDimensionsInMeters (WidthM";
RDebugUtils.currentLine=15597569;
 //BA.debugLineNum = 15597569;BA.debugLine="If mTargetView <> Null And mTargetView.IsInitiali";
if (__ref._mtargetview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ != null && __ref._mtargetview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=15597570;
 //BA.debugLineNum = 15597570;BA.debugLine="TileWidthPixels = Round(WidthMeters * X2.mBCPixe";
__ref._tilewidthpixels /*int*/  = (int) (__c.Round(_widthmeters*__ref._x2 /*b4a.example.x2utils*/ ._mbcpixelspermeter /*float*/ ));
RDebugUtils.currentLine=15597571;
 //BA.debugLineNum = 15597571;BA.debugLine="TileHeightPixels = Round(HeightMeters * X2.mBCPi";
__ref._tileheightpixels /*int*/  = (int) (__c.Round(_heightmeters*__ref._x2 /*b4a.example.x2utils*/ ._mbcpixelspermeter /*float*/ ));
RDebugUtils.currentLine=15597572;
 //BA.debugLineNum = 15597572;BA.debugLine="SetSingleTileDimensionsInBCPixels(TileWidthPixel";
__ref._setsingletiledimensionsinbcpixels /*String*/ (null,__ref._tilewidthpixels /*int*/ ,__ref._tileheightpixels /*int*/ );
 }else {
RDebugUtils.currentLine=15597574;
 //BA.debugLineNum = 15597574;BA.debugLine="TileWidthMeters = WidthMeters";
__ref._tilewidthmeters /*float*/  = _widthmeters;
RDebugUtils.currentLine=15597575;
 //BA.debugLineNum = 15597575;BA.debugLine="TileHeightMeters = HeightMeters";
__ref._tileheightmeters /*float*/  = _heightmeters;
RDebugUtils.currentLine=15597576;
 //BA.debugLineNum = 15597576;BA.debugLine="SetDimensionsShared";
__ref._setdimensionsshared /*String*/ (null);
 };
RDebugUtils.currentLine=15597578;
 //BA.debugLineNum = 15597578;BA.debugLine="End Sub";
return "";
}
}