
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class x2utils {
    public static RemoteObject myClass;
	public x2utils() {
	}
    public static PCBA staticBA = new PCBA(null, x2utils.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _gs = RemoteObject.declareNull("b4a.example.x2utils._x2gamestep");
public static RemoteObject _resumableindex = RemoteObject.createImmutable(0);
public static RemoteObject _mtargetview = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _mainbc = RemoteObject.declareNull("b4a.example.bitmapcreator");
public static RemoteObject _futuretasks = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _loopspersecond = RemoteObject.createImmutable(0f);
public static RemoteObject _isrunning = RemoteObject.createImmutable(false);
public static RemoteObject _mgame = RemoteObject.declareNull("b4a.example.game");
public static RemoteObject _mworld = RemoteObject.declareNull("anywheresoftware.b4a.objects.B2World");
public static RemoteObject _mbcpixelspermeter = RemoteObject.createImmutable(0f);
public static RemoteObject _graphiccache = RemoteObject.declareNull("b4a.example.x2spritegraphiccache");
public static RemoteObject _bmpsmoothscale = RemoteObject.createImmutable(0f);
public static RemoteObject _screenaabb = RemoteObject.declareNull("anywheresoftware.b4a.objects.B2AABB");
public static RemoteObject _drawing = RemoteObject.createImmutable(false);
public static RemoteObject _targetfps = RemoteObject.createImmutable(0);
public static RemoteObject _transparent = RemoteObject.declareNull("b4a.example.bitmapcreator");
public static RemoteObject _timestepms = RemoteObject.createImmutable(0f);
public static RemoteObject _debugdraw = RemoteObject.declareNull("b4a.example.x2debugdraw");
public static RemoteObject _isdebugdrawenabled = RemoteObject.createImmutable(false);
public static RemoteObject _soundpool = RemoteObject.declareNull("b4a.example.x2soundpool");
public static RemoteObject _islowfps = RemoteObject.createImmutable(false);
public static RemoteObject _fps = RemoteObject.createImmutable(0f);
public static RemoteObject _lastdrawingtime = RemoteObject.createImmutable(0L);
public static RemoteObject _slowdownphysicsscale = RemoteObject.createImmutable(0f);
public static RemoteObject _sleeptime = RemoteObject.createImmutable(0);
public static RemoteObject _velocityiterations = RemoteObject.createImmutable(0);
public static RemoteObject _positioniterations = RemoteObject.createImmutable(0);
public static RemoteObject _lastdrawingtasks = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _shapeaabb = RemoteObject.declareNull("anywheresoftware.b4a.objects.B2AABB");
public static RemoteObject _shapetransform = RemoteObject.declareNull("anywheresoftware.b4a.objects.B2Transform");
public static RemoteObject _max_size = RemoteObject.createImmutable(0);
public static RemoteObject _emptylist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.b4xpages _b4xpages = null;
public static b4a.example.b4xcollections _b4xcollections = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"BmpSmoothScale",_ref.getField(false, "_bmpsmoothscale"),"DebugDraw",_ref.getField(false, "_debugdraw"),"Drawing",_ref.getField(false, "_drawing"),"EmptyList",_ref.getField(false, "_emptylist"),"FPS",_ref.getField(false, "_fps"),"FutureTasks",_ref.getField(false, "_futuretasks"),"GraphicCache",_ref.getField(false, "_graphiccache"),"gs",_ref.getField(false, "_gs"),"IsDebugDrawEnabled",_ref.getField(false, "_isdebugdrawenabled"),"IsLowFPS",_ref.getField(false, "_islowfps"),"IsRunning",_ref.getField(false, "_isrunning"),"LastDrawingTasks",_ref.getField(false, "_lastdrawingtasks"),"LastDrawingTime",_ref.getField(false, "_lastdrawingtime"),"LoopsPerSecond",_ref.getField(false, "_loopspersecond"),"MainBC",_ref.getField(false, "_mainbc"),"MAX_SIZE",_ref.getField(false, "_max_size"),"mBCPixelsPerMeter",_ref.getField(false, "_mbcpixelspermeter"),"mGame",_ref.getField(false, "_mgame"),"mTargetView",_ref.getField(false, "_mtargetview"),"mWorld",_ref.getField(false, "_mworld"),"PositionIterations",_ref.getField(false, "_positioniterations"),"ResumableIndex",_ref.getField(false, "_resumableindex"),"ScreenAABB",_ref.getField(false, "_screenaabb"),"ShapeAABB",_ref.getField(false, "_shapeaabb"),"ShapeTransform",_ref.getField(false, "_shapetransform"),"SleepTime",_ref.getField(false, "_sleeptime"),"SlowDownPhysicsScale",_ref.getField(false, "_slowdownphysicsscale"),"SoundPool",_ref.getField(false, "_soundpool"),"TargetFPS",_ref.getField(false, "_targetfps"),"TimeStepMs",_ref.getField(false, "_timestepms"),"Transparent",_ref.getField(false, "_transparent"),"VelocityIterations",_ref.getField(false, "_velocityiterations"),"xui",_ref.getField(false, "_xui")};
}
}