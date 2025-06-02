
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class x2debugdraw {
    public static RemoteObject myClass;
	public x2debugdraw() {
	}
    public static PCBA staticBA = new PCBA(null, x2debugdraw.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _cvs = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas");
public static RemoteObject _panel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _x2 = RemoteObject.declareNull("b4a.example.x2utils");
public static RemoteObject _imageview = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _debugscale = RemoteObject.createImmutable(0f);
public static RemoteObject _markedpoints = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.b4xpages _b4xpages = null;
public static b4a.example.b4xcollections _b4xcollections = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"cvs",_ref.getField(false, "_cvs"),"DebugScale",_ref.getField(false, "_debugscale"),"ImageView",_ref.getField(false, "_imageview"),"MarkedPoints",_ref.getField(false, "_markedpoints"),"panel",_ref.getField(false, "_panel"),"X2",_ref.getField(false, "_x2"),"xui",_ref.getField(false, "_xui")};
}
}