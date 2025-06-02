
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class x2spritegraphiccache {
    public static RemoteObject myClass;
	public x2spritegraphiccache() {
	}
    public static PCBA staticBA = new PCBA(null, x2spritegraphiccache.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _cache = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _cvs = null;
public static RemoteObject _cvspanel = null;
public static RemoteObject _cvsproxy = null;
public static RemoteObject _max_size_for_antialias = RemoteObject.createImmutable(0);
public static RemoteObject _workingspace = RemoteObject.declareNull("b4a.example.bitmapcreator");
public static RemoteObject _x2 = RemoteObject.declareNull("b4a.example.x2utils");
public static RemoteObject _max_size_of_all_compressedbcs = RemoteObject.createImmutable(0);
public static RemoteObject _totalsize = RemoteObject.createImmutable(0);
public static RemoteObject _transform = RemoteObject.declareNull("anywheresoftware.b4a.objects.B2Transform");
public static RemoteObject _rectshape = RemoteObject.declareNull("anywheresoftware.b4a.objects.B2Shape.B2PolygonShape");
public static RemoteObject _outputaabb = RemoteObject.declareNull("anywheresoftware.b4a.objects.B2AABB");
public static RemoteObject _tempid = RemoteObject.createImmutable(0);
public static RemoteObject _tempprefix = RemoteObject.createImmutable("");
public static RemoteObject _cbccache = RemoteObject.declareNull("b4a.example.bitmapcreator._internalcompressedbccache");
public static RemoteObject _aabuffer = RemoteObject.declareNull("b4a.example.bitmapcreator._internalantialiasingbuffer");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.b4xpages _b4xpages = null;
public static b4a.example.b4xcollections _b4xcollections = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"AABuffer",_ref.getField(false, "_aabuffer"),"cache",_ref.getField(false, "_cache"),"CBCCache",_ref.getField(false, "_cbccache"),"CVS",_ref.getField(false, "_cvs"),"CVSPanel",_ref.getField(false, "_cvspanel"),"CVSProxy",_ref.getField(false, "_cvsproxy"),"MAX_SIZE_FOR_ANTIALIAS",_ref.getField(false, "_max_size_for_antialias"),"MAX_SIZE_OF_ALL_COMPRESSEDBCS",_ref.getField(false, "_max_size_of_all_compressedbcs"),"OutputAABB",_ref.getField(false, "_outputaabb"),"RectShape",_ref.getField(false, "_rectshape"),"TempId",_ref.getField(false, "_tempid"),"TempPrefix",_ref.getField(false, "_tempprefix"),"TotalSize",_ref.getField(false, "_totalsize"),"Transform",_ref.getField(false, "_transform"),"WorkingSpace",_ref.getField(false, "_workingspace"),"X2",_ref.getField(false, "_x2"),"xui",_ref.getField(false, "_xui")};
}
}