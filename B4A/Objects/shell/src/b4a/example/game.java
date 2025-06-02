
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class game {
    public static RemoteObject myClass;
	public game() {
	}
    public static PCBA staticBA = new PCBA(null, game.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _x2 = RemoteObject.declareNull("b4a.example.x2utils");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _world = RemoteObject.declareNull("anywheresoftware.b4a.objects.B2World");
public static RemoteObject _ground = RemoteObject.declareNull("b4a.example.x2bodywrapper");
public static RemoteObject _ivforeground = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _ivbackground = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lblstats = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _tilemap = RemoteObject.declareNull("b4a.example.x2tilemap");
public static RemoteObject _objectlayer = RemoteObject.createImmutable("");
public static RemoteObject _panelfortouch = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _car = RemoteObject.declareNull("b4a.example.x2bodywrapper");
public static RemoteObject _force = RemoteObject.declareNull("anywheresoftware.b4a.objects.B2Vec2");
public static RemoteObject _multitouch = RemoteObject.declareNull("b4a.example.x2multitouch");
public static RemoteObject _sound = RemoteObject.declareNull("b4a.example.x2soundpool");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.b4xpages _b4xpages = null;
public static b4a.example.b4xcollections _b4xcollections = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"Car",_ref.getField(false, "_car"),"force",_ref.getField(false, "_force"),"Ground",_ref.getField(false, "_ground"),"ivBackground",_ref.getField(false, "_ivbackground"),"ivForeground",_ref.getField(false, "_ivforeground"),"lblStats",_ref.getField(false, "_lblstats"),"Multitouch",_ref.getField(false, "_multitouch"),"ObjectLayer",_ref.getField(false, "_objectlayer"),"PanelForTouch",_ref.getField(false, "_panelfortouch"),"sound",_ref.getField(false, "_sound"),"TileMap",_ref.getField(false, "_tilemap"),"world",_ref.getField(false, "_world"),"X2",_ref.getField(false, "_x2"),"xui",_ref.getField(false, "_xui")};
}
}