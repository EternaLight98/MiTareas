
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class scorelabel {
    public static RemoteObject myClass;
	public scorelabel() {
	}
    public static PCBA staticBA = new PCBA(null, scorelabel.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _xlbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _currentvalue = RemoteObject.createImmutable(0);
public static RemoteObject _tempvalue = RemoteObject.createImmutable(0);
public static RemoteObject _text = RemoteObject.createImmutable("");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.b4xpages _b4xpages = null;
public static b4a.example.b4xcollections _b4xcollections = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"currentValue",_ref.getField(false, "_currentvalue"),"mBase",_ref.getField(false, "_mbase"),"mCallBack",_ref.getField(false, "_mcallback"),"mEventName",_ref.getField(false, "_meventname"),"tempValue",_ref.getField(false, "_tempvalue"),"Text",_ref.getField(false, "_text"),"xlbl",_ref.getField(false, "_xlbl"),"xui",_ref.getField(false, "_xui")};
}
}