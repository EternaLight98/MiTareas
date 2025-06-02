
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class x2soundpool {
    public static RemoteObject myClass;
	public x2soundpool() {
	}
    public static PCBA staticBA = new PCBA(null, x2soundpool.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _sounds = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _mp = RemoteObject.declareNull("anywheresoftware.b4a.objects.MediaPlayerWrapper");
public static RemoteObject _pool = RemoteObject.declareNull("anywheresoftware.b4a.audio.SoundPoolWrapper");
public static RemoteObject _mutesounds = RemoteObject.createImmutable(false);
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.b4xpages _b4xpages = null;
public static b4a.example.b4xcollections _b4xcollections = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"mp",_ref.getField(false, "_mp"),"MuteSounds",_ref.getField(false, "_mutesounds"),"pool",_ref.getField(false, "_pool"),"sounds",_ref.getField(false, "_sounds")};
}
}