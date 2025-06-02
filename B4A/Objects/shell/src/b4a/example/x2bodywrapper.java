
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class x2bodywrapper {
    public static RemoteObject myClass;
	public x2bodywrapper() {
	}
    public static PCBA staticBA = new PCBA(null, x2bodywrapper.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _body = RemoteObject.declareNull("anywheresoftware.b4a.objects.B2Body");
public static RemoteObject _mworld = RemoteObject.declareNull("anywheresoftware.b4a.objects.B2World");
public static RemoteObject _target = RemoteObject.declareNull("Object");
public static RemoteObject _mgame = RemoteObject.declareNull("b4a.example.game");
public static RemoteObject _isdeleted = RemoteObject.createImmutable(false);
public static RemoteObject _x2 = RemoteObject.declareNull("b4a.example.x2utils");
public static RemoteObject _currentframe = RemoteObject.createImmutable(0);
public static RemoteObject _minframe = RemoteObject.createImmutable(0);
public static RemoteObject _numberofframes = RemoteObject.createImmutable(0);
public static RemoteObject _mgraphicname = RemoteObject.createImmutable("");
public static RemoteObject _delegateto = RemoteObject.declareNull("Object");
public static RemoteObject _isvisible = RemoteObject.createImmutable(false);
public static RemoteObject _timetolivems = RemoteObject.createImmutable(0f);
public static RemoteObject _switchframeintervalms = RemoteObject.createImmutable(0);
public static RemoteObject _lastswitchframetime = RemoteObject.createImmutable(0);
public static RemoteObject _name = RemoteObject.createImmutable("");
public static RemoteObject _destroyifinvisible = RemoteObject.createImmutable(false);
public static RemoteObject _debugdrawcolor = RemoteObject.createImmutable(0);
public static RemoteObject _starttime = RemoteObject.createImmutable(0);
public static RemoteObject _drawlast = RemoteObject.createImmutable(false);
public static RemoteObject _drawfirst = RemoteObject.createImmutable(false);
public static RemoteObject _fliphorizontal = RemoteObject.createImmutable(false);
public static RemoteObject _flipvertical = RemoteObject.createImmutable(false);
public static RemoteObject _id = RemoteObject.createImmutable(0);
public static RemoteObject _tickifinvisible = RemoteObject.createImmutable(false);
public static RemoteObject _tag = RemoteObject.declareNull("Object");
public static RemoteObject _templatecustomproperties = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.b4xpages _b4xpages = null;
public static b4a.example.b4xcollections _b4xcollections = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"Body",_ref.getField(false, "_body"),"CurrentFrame",_ref.getField(false, "_currentframe"),"DebugDrawColor",_ref.getField(false, "_debugdrawcolor"),"DelegateTo",_ref.getField(false, "_delegateto"),"DestroyIfInvisible",_ref.getField(false, "_destroyifinvisible"),"DrawFirst",_ref.getField(false, "_drawfirst"),"DrawLast",_ref.getField(false, "_drawlast"),"FlipHorizontal",_ref.getField(false, "_fliphorizontal"),"FlipVertical",_ref.getField(false, "_flipvertical"),"Id",_ref.getField(false, "_id"),"IsDeleted",_ref.getField(false, "_isdeleted"),"IsVisible",_ref.getField(false, "_isvisible"),"LastSwitchFrameTime",_ref.getField(false, "_lastswitchframetime"),"mGame",_ref.getField(false, "_mgame"),"mGraphicName",_ref.getField(false, "_mgraphicname"),"MinFrame",_ref.getField(false, "_minframe"),"mWorld",_ref.getField(false, "_mworld"),"Name",_ref.getField(false, "_name"),"NumberOfFrames",_ref.getField(false, "_numberofframes"),"StartTime",_ref.getField(false, "_starttime"),"SwitchFrameIntervalMs",_ref.getField(false, "_switchframeintervalms"),"Tag",_ref.getField(false, "_tag"),"Target",_ref.getField(false, "_target"),"TemplateCustomProperties",_ref.getField(false, "_templatecustomproperties"),"TickIfInvisible",_ref.getField(false, "_tickifinvisible"),"TimeToLiveMs",_ref.getField(false, "_timetolivems"),"X2",_ref.getField(false, "_x2")};
}
}