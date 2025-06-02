
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class x2tilemap {
    public static RemoteObject myClass;
	public x2tilemap() {
	}
    public static PCBA staticBA = new PCBA(null, x2tilemap.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
public static RemoteObject _tilesets = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _tilewidthmeters = RemoteObject.createImmutable(0f);
public static RemoteObject _tileheightmeters = RemoteObject.createImmutable(0f);
public static RemoteObject _originaltilewidthpixels = RemoteObject.createImmutable(0);
public static RemoteObject _originaltileheightpixels = RemoteObject.createImmutable(0);
public static RemoteObject _tilewidthpixels = RemoteObject.createImmutable(0);
public static RemoteObject _tileheightpixels = RemoteObject.createImmutable(0);
public static RemoteObject _meterstopixelsx = RemoteObject.createImmutable(0f);
public static RemoteObject _meterstopixelsy = RemoteObject.createImmutable(0f);
public static RemoteObject _mapbottomyoriginalpixels = RemoteObject.createImmutable(0);
public static RemoteObject _tilesperrow = RemoteObject.createImmutable(0);
public static RemoteObject _tilespercolumn = RemoteObject.createImmutable(0);
public static RemoteObject _singletilebc = RemoteObject.declareNull("b4a.example.bitmapcreator");
public static RemoteObject _layers = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _tilescbc = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _maprectpixels = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _x2 = RemoteObject.declareNull("b4a.example.x2utils");
public static RemoteObject _flipped_horizontally = RemoteObject.createImmutable(0);
public static RemoteObject _flipped_vertically = RemoteObject.createImmutable(0);
public static RemoteObject _flipped_diagonally_flag = RemoteObject.createImmutable(0);
public static RemoteObject _su = RemoteObject.declareNull("anywheresoftware.b4a.objects.StringUtils");
public static RemoteObject _cs = RemoteObject.declareNull("anywheresoftware.b4a.randomaccessfile.CompressedStreams");
public static RemoteObject _raf = RemoteObject.declareNull("anywheresoftware.b4a.randomaccessfile.RandomAccessFile");
public static RemoteObject _mapxtometer = RemoteObject.createImmutable(0f);
public static RemoteObject _mapytometer = RemoteObject.createImmutable(0f);
public static RemoteObject _defaultcustomproperties = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _backgroundcolorbc = RemoteObject.declareNull("b4a.example.bitmapcreator");
public static RemoteObject _mapaabb = RemoteObject.declareNull("anywheresoftware.b4a.objects.B2AABB");
public static RemoteObject _mtargetview = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _targetviewbc = null;
public static RemoteObject _targetviewbcindex = RemoteObject.createImmutable(0);
public static RemoteObject _reusetilesrect = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
public static RemoteObject _reusescreencenter = RemoteObject.declareNull("anywheresoftware.b4a.objects.B2Vec2");
public static RemoteObject _reusetiletop = RemoteObject.createImmutable(0);
public static RemoteObject _reusetileleft = RemoteObject.createImmutable(0);
public static RemoteObject _lastdrawnscreencenterstarted = RemoteObject.declareNull("anywheresoftware.b4a.objects.B2Vec2");
public static RemoteObject _lastdrawnscreencompleted = RemoteObject.declareNull("anywheresoftware.b4a.objects.B2Vec2");
public static RemoteObject _tilemapversion = RemoteObject.createImmutable(0f);
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.b4xpages _b4xpages = null;
public static b4a.example.b4xcollections _b4xcollections = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"BackgroundColorBC",_ref.getField(false, "_backgroundcolorbc"),"cs",_ref.getField(false, "_cs"),"DefaultCustomProperties",_ref.getField(false, "_defaultcustomproperties"),"FLIPPED_DIAGONALLY_FLAG",_ref.getField(false, "_flipped_diagonally_flag"),"FLIPPED_HORIZONTALLY",_ref.getField(false, "_flipped_horizontally"),"FLIPPED_VERTICALLY",_ref.getField(false, "_flipped_vertically"),"LastDrawnScreenCenterStarted",_ref.getField(false, "_lastdrawnscreencenterstarted"),"LastDrawnScreenCompleted",_ref.getField(false, "_lastdrawnscreencompleted"),"Layers",_ref.getField(false, "_layers"),"MapAABB",_ref.getField(false, "_mapaabb"),"MapBottomYOriginalPixels",_ref.getField(false, "_mapbottomyoriginalpixels"),"MapRectPixels",_ref.getField(false, "_maprectpixels"),"MapXToMeter",_ref.getField(false, "_mapxtometer"),"MapYToMeter",_ref.getField(false, "_mapytometer"),"MetersToPixelsX",_ref.getField(false, "_meterstopixelsx"),"MetersToPixelsY",_ref.getField(false, "_meterstopixelsy"),"mTargetView",_ref.getField(false, "_mtargetview"),"OriginalTileHeightPixels",_ref.getField(false, "_originaltileheightpixels"),"OriginalTileWidthPixels",_ref.getField(false, "_originaltilewidthpixels"),"parser",_ref.getField(false, "_parser"),"raf",_ref.getField(false, "_raf"),"ReuseScreenCenter",_ref.getField(false, "_reusescreencenter"),"ReuseTileLeft",_ref.getField(false, "_reusetileleft"),"ReuseTilesRect",_ref.getField(false, "_reusetilesrect"),"ReuseTileTop",_ref.getField(false, "_reusetiletop"),"SingleTileBC",_ref.getField(false, "_singletilebc"),"su",_ref.getField(false, "_su"),"TargetViewBC",_ref.getField(false, "_targetviewbc"),"TargetViewBCIndex",_ref.getField(false, "_targetviewbcindex"),"TileHeightMeters",_ref.getField(false, "_tileheightmeters"),"TileHeightPixels",_ref.getField(false, "_tileheightpixels"),"TileMapVersion",_ref.getField(false, "_tilemapversion"),"TilesCBC",_ref.getField(false, "_tilescbc"),"TileSets",_ref.getField(false, "_tilesets"),"TilesPerColumn",_ref.getField(false, "_tilespercolumn"),"TilesPerRow",_ref.getField(false, "_tilesperrow"),"TileWidthMeters",_ref.getField(false, "_tilewidthmeters"),"TileWidthPixels",_ref.getField(false, "_tilewidthpixels"),"X2",_ref.getField(false, "_x2"),"xui",_ref.getField(false, "_xui")};
}
}