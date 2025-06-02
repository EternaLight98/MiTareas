
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class x2multitouch {
    public static RemoteObject myClass;
	public x2multitouch() {
	}
    public static PCBA staticBA = new PCBA(null, x2multitouch.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _keys = RemoteObject.declareNull("b4a.example.b4xset");
public static RemoteObject _viewsfingers = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _gd = RemoteObject.declareNull("anywheresoftware.b4a.agraham.gestures.Gestures");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.b4xpages _b4xpages = null;
public static b4a.example.b4xcollections _b4xcollections = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"gd",_ref.getField(false, "_gd"),"Keys",_ref.getField(false, "_keys"),"ViewsFingers",_ref.getField(false, "_viewsfingers")};
}
}