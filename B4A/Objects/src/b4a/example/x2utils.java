package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class x2utils extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.x2utils");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.x2utils.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _x2gamestep{
public boolean IsInitialized;
public anywheresoftware.b4a.objects.collections.List BodiesToDelete;
public int GameTimeMs;
public boolean ShouldDraw;
public anywheresoftware.b4a.objects.collections.List DrawingTasks;
public void Initialize() {
IsInitialized = true;
BodiesToDelete = new anywheresoftware.b4a.objects.collections.List();
GameTimeMs = 0;
ShouldDraw = false;
DrawingTasks = new anywheresoftware.b4a.objects.collections.List();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _x2bodiesfromcontact{
public boolean IsInitialized;
public b4a.example.x2bodywrapper ThisBody;
public b4a.example.x2bodywrapper OtherBody;
public int NormalSign;
public anywheresoftware.b4a.objects.B2Fixture ThisFixture;
public anywheresoftware.b4a.objects.B2Fixture OtherFixture;
public void Initialize() {
IsInitialized = true;
ThisBody = new b4a.example.x2bodywrapper();
OtherBody = new b4a.example.x2bodywrapper();
NormalSign = 0;
ThisFixture = new anywheresoftware.b4a.objects.B2Fixture();
OtherFixture = new anywheresoftware.b4a.objects.B2Fixture();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _x2futuretask{
public boolean IsInitialized;
public Object Callback;
public String SubName;
public int GameTimeMs;
public Object Value;
public boolean Disabled;
public void Initialize() {
IsInitialized = true;
Callback = new Object();
SubName = "";
GameTimeMs = 0;
Value = new Object();
Disabled = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _x2scaledbitmap{
public boolean IsInitialized;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper Bmp;
public float Scale;
public void Initialize() {
IsInitialized = true;
Bmp = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
Scale = 0f;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public b4a.example.x2utils._x2gamestep _gs = null;
public int _resumableindex = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _mtargetview = null;
public b4a.example.bitmapcreator _mainbc = null;
public anywheresoftware.b4a.objects.collections.List _futuretasks = null;
public float _loopspersecond = 0f;
public boolean _isrunning = false;
public b4a.example.game _mgame = null;
public anywheresoftware.b4a.objects.B2World _mworld = null;
public float _mbcpixelspermeter = 0f;
public b4a.example.x2spritegraphiccache _graphiccache = null;
public float _bmpsmoothscale = 0f;
public anywheresoftware.b4a.objects.B2AABB _screenaabb = null;
public boolean _drawing = false;
public int _targetfps = 0;
public b4a.example.bitmapcreator _transparent = null;
public float _timestepms = 0f;
public b4a.example.x2debugdraw _debugdraw = null;
public boolean _isdebugdrawenabled = false;
public b4a.example.x2soundpool _soundpool = null;
public boolean _islowfps = false;
public float _fps = 0f;
public long _lastdrawingtime = 0L;
public float _slowdownphysicsscale = 0f;
public int _sleeptime = 0;
public int _velocityiterations = 0;
public int _positioniterations = 0;
public anywheresoftware.b4a.objects.collections.List _lastdrawingtasks = null;
public anywheresoftware.b4a.objects.B2AABB _shapeaabb = null;
public anywheresoftware.b4a.objects.B2Transform _shapetransform = null;
public int _max_size = 0;
public anywheresoftware.b4a.objects.collections.List _emptylist = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public String  _start(b4a.example.x2utils __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2utils";
if (Debug.shouldDelegate(ba, "start", true))
	 {return ((String) Debug.delegate(ba, "start", null));}
RDebugUtils.currentLine=17498112;
 //BA.debugLineNum = 17498112;BA.debugLine="Public Sub Start";
RDebugUtils.currentLine=17498113;
 //BA.debugLineNum = 17498113;BA.debugLine="If IsRunning Then Return";
if (__ref._isrunning /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=17498114;
 //BA.debugLineNum = 17498114;BA.debugLine="IsRunning = True";
__ref._isrunning /*boolean*/  = __c.True;
RDebugUtils.currentLine=17498115;
 //BA.debugLineNum = 17498115;BA.debugLine="Drawing = False";
__ref._drawing /*boolean*/  = __c.False;
RDebugUtils.currentLine=17498116;
 //BA.debugLineNum = 17498116;BA.debugLine="MainLoop";
__ref._mainloop /*void*/ (null);
RDebugUtils.currentLine=17498117;
 //BA.debugLineNum = 17498117;BA.debugLine="End Sub";
return "";
}
public String  _stop(b4a.example.x2utils __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2utils";
if (Debug.shouldDelegate(ba, "stop", true))
	 {return ((String) Debug.delegate(ba, "stop", null));}
RDebugUtils.currentLine=17563648;
 //BA.debugLineNum = 17563648;BA.debugLine="Public Sub Stop";
RDebugUtils.currentLine=17563649;
 //BA.debugLineNum = 17563649;BA.debugLine="ResumableIndex = ResumableIndex + 1";
__ref._resumableindex /*int*/  = (int) (__ref._resumableindex /*int*/ +1);
RDebugUtils.currentLine=17563650;
 //BA.debugLineNum = 17563650;BA.debugLine="IsRunning = False";
__ref._isrunning /*boolean*/  = __c.False;
RDebugUtils.currentLine=17563651;
 //BA.debugLineNum = 17563651;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.x2utils __ref,anywheresoftware.b4a.BA _ba,b4a.example.game _mygame,anywheresoftware.b4a.objects.B4XViewWrapper _targetview,anywheresoftware.b4a.objects.B2World _world) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="x2utils";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_mygame,_targetview,_world}));}
int _largedimension = 0;
float _sizescale = 0f;
RDebugUtils.currentLine=17104896;
 //BA.debugLineNum = 17104896;BA.debugLine="Public Sub Initialize (MyGame As Game, TargetView";
RDebugUtils.currentLine=17104897;
 //BA.debugLineNum = 17104897;BA.debugLine="ShapeAABB.Initialize";
__ref._shapeaabb /*anywheresoftware.b4a.objects.B2AABB*/ .Initialize();
RDebugUtils.currentLine=17104898;
 //BA.debugLineNum = 17104898;BA.debugLine="ShapeTransform.Initialize";
__ref._shapetransform /*anywheresoftware.b4a.objects.B2Transform*/ .Initialize();
RDebugUtils.currentLine=17104899;
 //BA.debugLineNum = 17104899;BA.debugLine="EmptyList.Initialize";
__ref._emptylist /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=17104900;
 //BA.debugLineNum = 17104900;BA.debugLine="mGame = MyGame";
__ref._mgame /*b4a.example.game*/  = _mygame;
RDebugUtils.currentLine=17104901;
 //BA.debugLineNum = 17104901;BA.debugLine="mWorld = World";
__ref._mworld /*anywheresoftware.b4a.objects.B2World*/  = _world;
RDebugUtils.currentLine=17104902;
 //BA.debugLineNum = 17104902;BA.debugLine="mTargetView = TargetView";
__ref._mtargetview /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _targetview;
RDebugUtils.currentLine=17104903;
 //BA.debugLineNum = 17104903;BA.debugLine="Dim LargeDimension As Int = Max(mTargetView.Width";
_largedimension = (int) (__c.Max(__ref._mtargetview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mtargetview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight())/(double)__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getScale());
RDebugUtils.currentLine=17104904;
 //BA.debugLineNum = 17104904;BA.debugLine="Dim SizeScale As Float = 1";
_sizescale = (float) (1);
RDebugUtils.currentLine=17104905;
 //BA.debugLineNum = 17104905;BA.debugLine="If LargeDimension > MAX_SIZE Then";
if (_largedimension>__ref._max_size /*int*/ ) { 
RDebugUtils.currentLine=17104906;
 //BA.debugLineNum = 17104906;BA.debugLine="SizeScale = LargeDimension / MAX_SIZE";
_sizescale = (float) (_largedimension/(double)__ref._max_size /*int*/ );
RDebugUtils.currentLine=17104907;
 //BA.debugLineNum = 17104907;BA.debugLine="Log($\"Size scale: $1.2{SizeScale}\"$)";
__c.LogImpl("917104907",("Size scale: "+__c.SmartStringFormatter("1.2",(Object)(_sizescale))+""),0);
 };
RDebugUtils.currentLine=17104909;
 //BA.debugLineNum = 17104909;BA.debugLine="MainBC.Initialize(TargetView.Width / xui.Scale /";
__ref._mainbc /*b4a.example.bitmapcreator*/ ._initialize(ba,(int) (_targetview.getWidth()/(double)__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getScale()/(double)_sizescale),(int) (_targetview.getHeight()/(double)__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getScale()/(double)_sizescale));
RDebugUtils.currentLine=17104910;
 //BA.debugLineNum = 17104910;BA.debugLine="Transparent.Initialize(MainBC.mWidth, MainBC.mHei";
__ref._transparent /*b4a.example.bitmapcreator*/ ._initialize(ba,__ref._mainbc /*b4a.example.bitmapcreator*/ ._mwidth,__ref._mainbc /*b4a.example.bitmapcreator*/ ._mheight);
RDebugUtils.currentLine=17104911;
 //BA.debugLineNum = 17104911;BA.debugLine="ScreenAABB.Initialize";
__ref._screenaabb /*anywheresoftware.b4a.objects.B2AABB*/ .Initialize();
RDebugUtils.currentLine=17104912;
 //BA.debugLineNum = 17104912;BA.debugLine="GraphicCache.Initialize (Me)";
__ref._graphiccache /*b4a.example.x2spritegraphiccache*/ ._initialize /*String*/ (null,ba,(b4a.example.x2utils)(this));
RDebugUtils.currentLine=17104913;
 //BA.debugLineNum = 17104913;BA.debugLine="SoundPool.Initialize";
__ref._soundpool /*b4a.example.x2soundpool*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=17104914;
 //BA.debugLineNum = 17104914;BA.debugLine="LastDrawingTasks.Initialize";
__ref._lastdrawingtasks /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=17104915;
 //BA.debugLineNum = 17104915;BA.debugLine="Reset";
__ref._reset /*String*/ (null);
RDebugUtils.currentLine=17104916;
 //BA.debugLineNum = 17104916;BA.debugLine="End Sub";
return "";
}
public String  _configuredimensions(b4a.example.x2utils __ref,anywheresoftware.b4a.objects.B2Vec2 _centerpointinmeters,float _targetviewwidthinmeters) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2utils";
if (Debug.shouldDelegate(ba, "configuredimensions", true))
	 {return ((String) Debug.delegate(ba, "configuredimensions", new Object[] {_centerpointinmeters,_targetviewwidthinmeters}));}
RDebugUtils.currentLine=18087936;
 //BA.debugLineNum = 18087936;BA.debugLine="Public Sub ConfigureDimensions (CenterPointInMeter";
RDebugUtils.currentLine=18087937;
 //BA.debugLineNum = 18087937;BA.debugLine="mBCPixelsPerMeter = MainBC.mWidth / TargetViewWid";
__ref._mbcpixelspermeter /*float*/  = (float) (__ref._mainbc /*b4a.example.bitmapcreator*/ ._mwidth/(double)_targetviewwidthinmeters);
RDebugUtils.currentLine=18087938;
 //BA.debugLineNum = 18087938;BA.debugLine="UpdateWorldCenter(CenterPointInMeters)";
__ref._updateworldcenter /*String*/ (null,_centerpointinmeters);
RDebugUtils.currentLine=18087939;
 //BA.debugLineNum = 18087939;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B2Vec2  _createvec2(b4a.example.x2utils __ref,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2utils";
if (Debug.shouldDelegate(ba, "createvec2", true))
	 {return ((anywheresoftware.b4a.objects.B2Vec2) Debug.delegate(ba, "createvec2", new Object[] {_x,_y}));}
RDebugUtils.currentLine=19267584;
 //BA.debugLineNum = 19267584;BA.debugLine="Public Sub CreateVec2 (x As Float, y As Float) As";
RDebugUtils.currentLine=19267585;
 //BA.debugLineNum = 19267585;BA.debugLine="Return mWorld.CreateVec2 (x, y)";
if (true) return __ref._mworld /*anywheresoftware.b4a.objects.B2World*/ .CreateVec2(_x,_y);
RDebugUtils.currentLine=19267586;
 //BA.debugLineNum = 19267586;BA.debugLine="End Sub";
return null;
}
public String  _imageviewresized(b4a.example.x2utils __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2utils";
if (Debug.shouldDelegate(ba, "imageviewresized", true))
	 {return ((String) Debug.delegate(ba, "imageviewresized", null));}
RDebugUtils.currentLine=18612224;
 //BA.debugLineNum = 18612224;BA.debugLine="Public Sub ImageViewResized";
RDebugUtils.currentLine=18612225;
 //BA.debugLineNum = 18612225;BA.debugLine="If IsDebugDrawEnabled Then";
if (__ref._isdebugdrawenabled /*boolean*/ ) { 
RDebugUtils.currentLine=18612226;
 //BA.debugLineNum = 18612226;BA.debugLine="DebugDraw.Resize";
__ref._debugdraw /*b4a.example.x2debugdraw*/ ._resize /*String*/ (null);
 };
RDebugUtils.currentLine=18612228;
 //BA.debugLineNum = 18612228;BA.debugLine="End Sub";
return "";
}
public String  _updateworldcenter(b4a.example.x2utils __ref,anywheresoftware.b4a.objects.B2Vec2 _centerpointinmeters) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2utils";
if (Debug.shouldDelegate(ba, "updateworldcenter", true))
	 {return ((String) Debug.delegate(ba, "updateworldcenter", new Object[] {_centerpointinmeters}));}
RDebugUtils.currentLine=18153472;
 //BA.debugLineNum = 18153472;BA.debugLine="Public Sub UpdateWorldCenter (CenterPointInMeters";
RDebugUtils.currentLine=18153473;
 //BA.debugLineNum = 18153473;BA.debugLine="ScreenAABB.BottomLeft.X = CenterPointInMeters.X -";
__ref._screenaabb /*anywheresoftware.b4a.objects.B2AABB*/ .getBottomLeft().setX((float) (_centerpointinmeters.getX()-__ref._mainbc /*b4a.example.bitmapcreator*/ ._mwidth/(double)2/(double)__ref._mbcpixelspermeter /*float*/ ));
RDebugUtils.currentLine=18153474;
 //BA.debugLineNum = 18153474;BA.debugLine="ScreenAABB.BottomLeft.Y = CenterPointInMeters.Y -";
__ref._screenaabb /*anywheresoftware.b4a.objects.B2AABB*/ .getBottomLeft().setY((float) (_centerpointinmeters.getY()-__ref._mainbc /*b4a.example.bitmapcreator*/ ._mheight/(double)2/(double)__ref._mbcpixelspermeter /*float*/ ));
RDebugUtils.currentLine=18153475;
 //BA.debugLineNum = 18153475;BA.debugLine="ScreenAABB.TopRight.X = CenterPointInMeters.X + M";
__ref._screenaabb /*anywheresoftware.b4a.objects.B2AABB*/ .getTopRight().setX((float) (_centerpointinmeters.getX()+__ref._mainbc /*b4a.example.bitmapcreator*/ ._mwidth/(double)2/(double)__ref._mbcpixelspermeter /*float*/ ));
RDebugUtils.currentLine=18153476;
 //BA.debugLineNum = 18153476;BA.debugLine="ScreenAABB.TopRight.Y = CenterPointInMeters.Y + M";
__ref._screenaabb /*anywheresoftware.b4a.objects.B2AABB*/ .getTopRight().setY((float) (_centerpointinmeters.getY()+__ref._mainbc /*b4a.example.bitmapcreator*/ ._mheight/(double)2/(double)__ref._mbcpixelspermeter /*float*/ ));
RDebugUtils.currentLine=18153477;
 //BA.debugLineNum = 18153477;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _getbodiesintersectingwithworldpoint(b4a.example.x2utils __ref,anywheresoftware.b4a.objects.B2Vec2 _point) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2utils";
if (Debug.shouldDelegate(ba, "getbodiesintersectingwithworldpoint", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getbodiesintersectingwithworldpoint", new Object[] {_point}));}
anywheresoftware.b4a.objects.collections.Map _bodies = null;
anywheresoftware.b4a.objects.collections.List _res = null;
anywheresoftware.b4a.objects.B2Body _body = null;
anywheresoftware.b4a.objects.B2Fixture _f = null;
RDebugUtils.currentLine=19791872;
 //BA.debugLineNum = 19791872;BA.debugLine="Public Sub GetBodiesIntersectingWithWorldPoint (Po";
RDebugUtils.currentLine=19791873;
 //BA.debugLineNum = 19791873;BA.debugLine="ShapeAABB.BottomLeft.Set(Point.X, Point.Y)";
__ref._shapeaabb /*anywheresoftware.b4a.objects.B2AABB*/ .getBottomLeft().Set(_point.getX(),_point.getY());
RDebugUtils.currentLine=19791874;
 //BA.debugLineNum = 19791874;BA.debugLine="ShapeAABB.TopRight.Set(Point.X, Point.Y)";
__ref._shapeaabb /*anywheresoftware.b4a.objects.B2AABB*/ .getTopRight().Set(_point.getX(),_point.getY());
RDebugUtils.currentLine=19791875;
 //BA.debugLineNum = 19791875;BA.debugLine="Dim bodies As Map = mWorld.QueryAABBToMapOfBodies";
_bodies = new anywheresoftware.b4a.objects.collections.Map();
_bodies = __ref._mworld /*anywheresoftware.b4a.objects.B2World*/ .QueryAABBToMapOfBodies(__ref._shapeaabb /*anywheresoftware.b4a.objects.B2AABB*/ );
RDebugUtils.currentLine=19791876;
 //BA.debugLineNum = 19791876;BA.debugLine="If bodies.Size = 0 Then Return EmptyList";
if (_bodies.getSize()==0) { 
if (true) return __ref._emptylist /*anywheresoftware.b4a.objects.collections.List*/ ;};
RDebugUtils.currentLine=19791877;
 //BA.debugLineNum = 19791877;BA.debugLine="Dim res As List";
_res = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=19791878;
 //BA.debugLineNum = 19791878;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=19791879;
 //BA.debugLineNum = 19791879;BA.debugLine="For Each body As B2Body In bodies.Keys";
{
final anywheresoftware.b4a.BA.IterableList group7 = _bodies.Keys();
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_body = (anywheresoftware.b4a.objects.B2Body)(group7.Get(index7));
RDebugUtils.currentLine=19791880;
 //BA.debugLineNum = 19791880;BA.debugLine="Dim f As B2Fixture = body.FirstFixture";
_f = _body.getFirstFixture();
RDebugUtils.currentLine=19791881;
 //BA.debugLineNum = 19791881;BA.debugLine="Do While f <> Null";
while (_f!= null) {
RDebugUtils.currentLine=19791882;
 //BA.debugLineNum = 19791882;BA.debugLine="If f.Shape.TestPoint(body.Transform, Point) The";
if (_f.getShape().TestPoint(_body.getTransform(),_point)) { 
RDebugUtils.currentLine=19791883;
 //BA.debugLineNum = 19791883;BA.debugLine="res.Add(body.Tag)";
_res.Add(_body.getTag());
RDebugUtils.currentLine=19791884;
 //BA.debugLineNum = 19791884;BA.debugLine="Exit";
if (true) break;
 };
RDebugUtils.currentLine=19791886;
 //BA.debugLineNum = 19791886;BA.debugLine="f = f.NextFixture";
_f = _f.NextFixture();
 }
;
 }
};
RDebugUtils.currentLine=19791889;
 //BA.debugLineNum = 19791889;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=19791890;
 //BA.debugLineNum = 19791890;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B2Vec2  _screenpointtoworld(b4a.example.x2utils __ref,int _x,int _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2utils";
if (Debug.shouldDelegate(ba, "screenpointtoworld", true))
	 {return ((anywheresoftware.b4a.objects.B2Vec2) Debug.delegate(ba, "screenpointtoworld", new Object[] {_x,_y}));}
float _scale = 0f;
anywheresoftware.b4a.objects.B2Vec2 _position = null;
RDebugUtils.currentLine=18481152;
 //BA.debugLineNum = 18481152;BA.debugLine="Public Sub ScreenPointToWorld (x As Int, y As Int)";
RDebugUtils.currentLine=18481153;
 //BA.debugLineNum = 18481153;BA.debugLine="Dim scale As Float = mTargetView.Width / MainBC.m";
_scale = (float) (__ref._mtargetview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)__ref._mainbc /*b4a.example.bitmapcreator*/ ._mwidth*__ref._mbcpixelspermeter /*float*/ );
RDebugUtils.currentLine=18481154;
 //BA.debugLineNum = 18481154;BA.debugLine="Dim position As B2Vec2";
_position = new anywheresoftware.b4a.objects.B2Vec2();
RDebugUtils.currentLine=18481155;
 //BA.debugLineNum = 18481155;BA.debugLine="position.X = x / scale + ScreenAABB.BottomLeft.X";
_position.setX((float) (_x/(double)_scale+__ref._screenaabb /*anywheresoftware.b4a.objects.B2AABB*/ .getBottomLeft().getX()));
RDebugUtils.currentLine=18481156;
 //BA.debugLineNum = 18481156;BA.debugLine="position.Y = (mTargetView.Height - 1 - y) / scale";
_position.setY((float) ((__ref._mtargetview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-1-_y)/(double)_scale+__ref._screenaabb /*anywheresoftware.b4a.objects.B2AABB*/ .getBottomLeft().getY()));
RDebugUtils.currentLine=18481157;
 //BA.debugLineNum = 18481157;BA.debugLine="Return position";
if (true) return _position;
RDebugUtils.currentLine=18481158;
 //BA.debugLineNum = 18481158;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B2Vec2  _worldpointtomainbc(b4a.example.x2utils __ref,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2utils";
if (Debug.shouldDelegate(ba, "worldpointtomainbc", true))
	 {return ((anywheresoftware.b4a.objects.B2Vec2) Debug.delegate(ba, "worldpointtomainbc", new Object[] {_x,_y}));}
anywheresoftware.b4a.objects.B2Vec2 _position = null;
RDebugUtils.currentLine=18415616;
 //BA.debugLineNum = 18415616;BA.debugLine="Public Sub WorldPointToMainBC (x As Float, y As Fl";
RDebugUtils.currentLine=18415617;
 //BA.debugLineNum = 18415617;BA.debugLine="Dim position As B2Vec2";
_position = new anywheresoftware.b4a.objects.B2Vec2();
RDebugUtils.currentLine=18415618;
 //BA.debugLineNum = 18415618;BA.debugLine="position.X = Round((x  - ScreenAABB.BottomLeft.X)";
_position.setX((float) (__c.Round((_x-__ref._screenaabb /*anywheresoftware.b4a.objects.B2AABB*/ .getBottomLeft().getX())*__ref._mbcpixelspermeter /*float*/ )));
RDebugUtils.currentLine=18415619;
 //BA.debugLineNum = 18415619;BA.debugLine="position.Y = Round(MainBC.mHeight - 1 - (y - Scre";
_position.setY((float) (__c.Round(__ref._mainbc /*b4a.example.bitmapcreator*/ ._mheight-1-(_y-__ref._screenaabb /*anywheresoftware.b4a.objects.B2AABB*/ .getBottomLeft().getY())*__ref._mbcpixelspermeter /*float*/ )));
RDebugUtils.currentLine=18415620;
 //BA.debugLineNum = 18415620;BA.debugLine="Return position";
if (true) return _position;
RDebugUtils.currentLine=18415621;
 //BA.debugLineNum = 18415621;BA.debugLine="End Sub";
return null;
}
public int  _b2angletodegrees(b4a.example.x2utils __ref,float _angle) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2utils";
if (Debug.shouldDelegate(ba, "b2angletodegrees", true))
	 {return ((Integer) Debug.delegate(ba, "b2angletodegrees", new Object[] {_angle}));}
RDebugUtils.currentLine=17760256;
 //BA.debugLineNum = 17760256;BA.debugLine="Public Sub B2AngleToDegrees (Angle As Float) As In";
RDebugUtils.currentLine=17760257;
 //BA.debugLineNum = 17760257;BA.debugLine="Return Round(-Angle * 180 / cPI)";
if (true) return (int) (__c.Round(-_angle*180/(double)__c.cPI));
RDebugUtils.currentLine=17760258;
 //BA.debugLineNum = 17760258;BA.debugLine="End Sub";
return 0;
}
public String  _setbitmapwithfitorfill(b4a.example.x2utils __ref,anywheresoftware.b4a.objects.B4XViewWrapper _vtargetview,anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2utils";
if (Debug.shouldDelegate(ba, "setbitmapwithfitorfill", true))
	 {return ((String) Debug.delegate(ba, "setbitmapwithfitorfill", new Object[] {_vtargetview,_bmp}));}
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
RDebugUtils.currentLine=18546688;
 //BA.debugLineNum = 18546688;BA.debugLine="Public Sub SetBitmapWithFitOrFill (vTargetView As";
RDebugUtils.currentLine=18546689;
 //BA.debugLineNum = 18546689;BA.debugLine="vTargetView.SetBitmap(bmp)";
_vtargetview.SetBitmap((android.graphics.Bitmap)(_bmp.getObject()));
RDebugUtils.currentLine=18546693;
 //BA.debugLineNum = 18546693;BA.debugLine="Dim iv As ImageView = vTargetView";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
_iv = (anywheresoftware.b4a.objects.ImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ImageViewWrapper(), (android.widget.ImageView)(_vtargetview.getObject()));
RDebugUtils.currentLine=18546694;
 //BA.debugLineNum = 18546694;BA.debugLine="iv.Gravity = Gravity.FILL";
_iv.setGravity(__c.Gravity.FILL);
RDebugUtils.currentLine=18546696;
 //BA.debugLineNum = 18546696;BA.debugLine="End Sub";
return "";
}
public int  _meterstobcpixels(b4a.example.x2utils __ref,float _meters) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2utils";
if (Debug.shouldDelegate(ba, "meterstobcpixels", true))
	 {return ((Integer) Debug.delegate(ba, "meterstobcpixels", new Object[] {_meters}));}
RDebugUtils.currentLine=18219008;
 //BA.debugLineNum = 18219008;BA.debugLine="Public Sub MetersToBCPixels (Meters As Float) As I";
RDebugUtils.currentLine=18219009;
 //BA.debugLineNum = 18219009;BA.debugLine="Return Round(Meters * mBCPixelsPerMeter)";
if (true) return (int) (__c.Round(_meters*__ref._mbcpixelspermeter /*float*/ ));
RDebugUtils.currentLine=18219010;
 //BA.debugLineNum = 18219010;BA.debugLine="End Sub";
return 0;
}
public float  _degreestob2angle(b4a.example.x2utils __ref,int _degrees) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2utils";
if (Debug.shouldDelegate(ba, "degreestob2angle", true))
	 {return ((Float) Debug.delegate(ba, "degreestob2angle", new Object[] {_degrees}));}
RDebugUtils.currentLine=17694720;
 //BA.debugLineNum = 17694720;BA.debugLine="Public Sub DegreesToB2Angle (Degrees As Int) As Fl";
RDebugUtils.currentLine=17694721;
 //BA.debugLineNum = 17694721;BA.debugLine="Return -cPI / 180 * Degrees";
if (true) return (float) (-__c.cPI/(double)180*_degrees);
RDebugUtils.currentLine=17694722;
 //BA.debugLineNum = 17694722;BA.debugLine="End Sub";
return 0f;
}
public anywheresoftware.b4a.objects.B2Vec2  _getshapewidthandheight(b4a.example.x2utils __ref,anywheresoftware.b4a.objects.B2Shape.ConcreteB2Shape _shape) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2utils";
if (Debug.shouldDelegate(ba, "getshapewidthandheight", true))
	 {return ((anywheresoftware.b4a.objects.B2Vec2) Debug.delegate(ba, "getshapewidthandheight", new Object[] {_shape}));}
RDebugUtils.currentLine=19529728;
 //BA.debugLineNum = 19529728;BA.debugLine="Public Sub GetShapeWidthAndHeight(Shape As B2Shape";
RDebugUtils.currentLine=19529729;
 //BA.debugLineNum = 19529729;BA.debugLine="Shape.ComputeAABB(ShapeAABB, ShapeTransform)";
_shape.ComputeAABB(__ref._shapeaabb /*anywheresoftware.b4a.objects.B2AABB*/ ,__ref._shapetransform /*anywheresoftware.b4a.objects.B2Transform*/ );
RDebugUtils.currentLine=19529730;
 //BA.debugLineNum = 19529730;BA.debugLine="Return CreateVec2(ShapeAABB.Width, ShapeAABB.Heig";
if (true) return __ref._createvec2 /*anywheresoftware.b4a.objects.B2Vec2*/ (null,__ref._shapeaabb /*anywheresoftware.b4a.objects.B2AABB*/ .getWidth(),__ref._shapeaabb /*anywheresoftware.b4a.objects.B2AABB*/ .getHeight());
RDebugUtils.currentLine=19529731;
 //BA.debugLineNum = 19529731;BA.debugLine="End Sub";
return null;
}
public b4a.example.x2bodywrapper  _createbodyandwrapper(b4a.example.x2utils __ref,anywheresoftware.b4a.objects.B2Body.B2BodyDef _bd,Object _delegate,String _name) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2utils";
if (Debug.shouldDelegate(ba, "createbodyandwrapper", true))
	 {return ((b4a.example.x2bodywrapper) Debug.delegate(ba, "createbodyandwrapper", new Object[] {_bd,_delegate,_name}));}
b4a.example.x2bodywrapper _wrapper = null;
RDebugUtils.currentLine=17629184;
 //BA.debugLineNum = 17629184;BA.debugLine="Public Sub CreateBodyAndWrapper (bd As B2BodyDef,";
RDebugUtils.currentLine=17629185;
 //BA.debugLineNum = 17629185;BA.debugLine="Dim wrapper As X2BodyWrapper";
_wrapper = new b4a.example.x2bodywrapper();
RDebugUtils.currentLine=17629186;
 //BA.debugLineNum = 17629186;BA.debugLine="wrapper.Initialize(mGame, Delegate, Name)";
_wrapper._initialize /*String*/ (null,ba,__ref._mgame /*b4a.example.game*/ ,_delegate,_name);
RDebugUtils.currentLine=17629187;
 //BA.debugLineNum = 17629187;BA.debugLine="wrapper.SetBody(mWorld.CreateBody(bd))";
_wrapper._setbody /*String*/ (null,__ref._mworld /*anywheresoftware.b4a.objects.B2World*/ .CreateBody(_bd));
RDebugUtils.currentLine=17629188;
 //BA.debugLineNum = 17629188;BA.debugLine="Return wrapper";
if (true) return _wrapper;
RDebugUtils.currentLine=17629189;
 //BA.debugLineNum = 17629189;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _readspritesbcs(b4a.example.x2utils __ref,b4a.example.bitmapcreator _source,int _rows,int _columns,float _widthmeters,float _heightmeters) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2utils";
if (Debug.shouldDelegate(ba, "readspritesbcs", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "readspritesbcs", new Object[] {_source,_rows,_columns,_widthmeters,_heightmeters}));}
anywheresoftware.b4a.objects.collections.List _res = null;
float _scale = 0f;
int _rowheight = 0;
int _columnwidth = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _rect = null;
int _r = 0;
int _c = 0;
RDebugUtils.currentLine=18022400;
 //BA.debugLineNum = 18022400;BA.debugLine="Public Sub ReadSpritesBCs (Source As BitmapCreator";
RDebugUtils.currentLine=18022401;
 //BA.debugLineNum = 18022401;BA.debugLine="Dim res As List";
_res = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=18022402;
 //BA.debugLineNum = 18022402;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=18022403;
 //BA.debugLineNum = 18022403;BA.debugLine="Dim scale As Float = mBCPixelsPerMeter * BmpSmoot";
_scale = (float) (__ref._mbcpixelspermeter /*float*/ *__ref._bmpsmoothscale /*float*/ );
RDebugUtils.currentLine=18022404;
 //BA.debugLineNum = 18022404;BA.debugLine="Dim RowHeight As Int = Source.mHeight / Rows";
_rowheight = (int) (_source._mheight/(double)_rows);
RDebugUtils.currentLine=18022405;
 //BA.debugLineNum = 18022405;BA.debugLine="Dim ColumnWidth As Int = Source.mWidth / Columns";
_columnwidth = (int) (_source._mwidth/(double)_columns);
RDebugUtils.currentLine=18022406;
 //BA.debugLineNum = 18022406;BA.debugLine="Dim rect As B4XRect";
_rect = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=18022407;
 //BA.debugLineNum = 18022407;BA.debugLine="rect.Initialize(0, 0, 0, 0)";
_rect.Initialize((float) (0),(float) (0),(float) (0),(float) (0));
RDebugUtils.currentLine=18022408;
 //BA.debugLineNum = 18022408;BA.debugLine="For r = 0 To Rows - 1";
{
final int step8 = 1;
final int limit8 = (int) (_rows-1);
_r = (int) (0) ;
for (;_r <= limit8 ;_r = _r + step8 ) {
RDebugUtils.currentLine=18022409;
 //BA.debugLineNum = 18022409;BA.debugLine="For c = 0 To Columns - 1";
{
final int step9 = 1;
final int limit9 = (int) (_columns-1);
_c = (int) (0) ;
for (;_c <= limit9 ;_c = _c + step9 ) {
RDebugUtils.currentLine=18022410;
 //BA.debugLineNum = 18022410;BA.debugLine="rect.Left = ColumnWidth * c";
_rect.setLeft((float) (_columnwidth*_c));
RDebugUtils.currentLine=18022411;
 //BA.debugLineNum = 18022411;BA.debugLine="rect.Top = RowHeight * r";
_rect.setTop((float) (_rowheight*_r));
RDebugUtils.currentLine=18022412;
 //BA.debugLineNum = 18022412;BA.debugLine="rect.Width = ColumnWidth";
_rect.setWidth((float) (_columnwidth));
RDebugUtils.currentLine=18022413;
 //BA.debugLineNum = 18022413;BA.debugLine="rect.Height = RowHeight";
_rect.setHeight((float) (_rowheight));
RDebugUtils.currentLine=18022414;
 //BA.debugLineNum = 18022414;BA.debugLine="res.Add(NearestNeighborResize(Source, rect, Wid";
_res.Add((Object)(__ref._nearestneighborresize /*b4a.example.bitmapcreator*/ (null,_source,_rect,(float) (_widthmeters*_scale),(float) (_heightmeters*_scale),__c.False)));
 }
};
 }
};
RDebugUtils.currentLine=18022417;
 //BA.debugLineNum = 18022417;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=18022418;
 //BA.debugLineNum = 18022418;BA.debugLine="End Sub";
return null;
}
public b4a.example.bitmapcreator  _bitmaptobc(b4a.example.x2utils __ref,anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp,float _scale) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2utils";
if (Debug.shouldDelegate(ba, "bitmaptobc", true))
	 {return ((b4a.example.bitmapcreator) Debug.delegate(ba, "bitmaptobc", new Object[] {_bmp,_scale}));}
b4a.example.bitmapcreator _b2 = null;
RDebugUtils.currentLine=18939904;
 //BA.debugLineNum = 18939904;BA.debugLine="Public Sub BitmapToBC(bmp As B4XBitmap, Scale As F";
RDebugUtils.currentLine=18939905;
 //BA.debugLineNum = 18939905;BA.debugLine="Dim b2 As BitmapCreator";
_b2 = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=18939906;
 //BA.debugLineNum = 18939906;BA.debugLine="b2.Initialize(bmp.Width / Scale, bmp.Height / Sca";
_b2._initialize(ba,(int) (_bmp.getWidth()/(double)_scale),(int) (_bmp.getHeight()/(double)_scale));
RDebugUtils.currentLine=18939907;
 //BA.debugLineNum = 18939907;BA.debugLine="b2.CopyPixelsFromBitmap(bmp)";
_b2._copypixelsfrombitmap(_bmp);
RDebugUtils.currentLine=18939908;
 //BA.debugLineNum = 18939908;BA.debugLine="Return b2";
if (true) return _b2;
RDebugUtils.currentLine=18939909;
 //BA.debugLineNum = 18939909;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _readsprites(b4a.example.x2utils __ref,anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp,int _rows,int _columns,float _widthmeters,float _heightmeters) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2utils";
if (Debug.shouldDelegate(ba, "readsprites", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "readsprites", new Object[] {_bmp,_rows,_columns,_widthmeters,_heightmeters}));}
anywheresoftware.b4a.objects.collections.List _res = null;
float _scale = 0f;
int _rowheight = 0;
int _columnwidth = 0;
int _r = 0;
int _c = 0;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _b = null;
b4a.example.x2utils._x2scaledbitmap _sb = null;
RDebugUtils.currentLine=17956864;
 //BA.debugLineNum = 17956864;BA.debugLine="Public Sub ReadSprites (Bmp As B4XBitmap, Rows As";
RDebugUtils.currentLine=17956865;
 //BA.debugLineNum = 17956865;BA.debugLine="Dim res As List";
_res = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=17956866;
 //BA.debugLineNum = 17956866;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=17956867;
 //BA.debugLineNum = 17956867;BA.debugLine="Dim scale As Float = mBCPixelsPerMeter * BmpSmoot";
_scale = (float) (__ref._mbcpixelspermeter /*float*/ *__ref._bmpsmoothscale /*float*/ );
RDebugUtils.currentLine=17956868;
 //BA.debugLineNum = 17956868;BA.debugLine="Dim RowHeight As Int = Bmp.Height / Rows";
_rowheight = (int) (_bmp.getHeight()/(double)_rows);
RDebugUtils.currentLine=17956869;
 //BA.debugLineNum = 17956869;BA.debugLine="Dim ColumnWidth As Int = Bmp.Width / Columns";
_columnwidth = (int) (_bmp.getWidth()/(double)_columns);
RDebugUtils.currentLine=17956870;
 //BA.debugLineNum = 17956870;BA.debugLine="For r = 0 To Rows - 1";
{
final int step6 = 1;
final int limit6 = (int) (_rows-1);
_r = (int) (0) ;
for (;_r <= limit6 ;_r = _r + step6 ) {
RDebugUtils.currentLine=17956871;
 //BA.debugLineNum = 17956871;BA.debugLine="For c = 0 To Columns - 1";
{
final int step7 = 1;
final int limit7 = (int) (_columns-1);
_c = (int) (0) ;
for (;_c <= limit7 ;_c = _c + step7 ) {
RDebugUtils.currentLine=17956872;
 //BA.debugLineNum = 17956872;BA.debugLine="Dim b As B4XBitmap = Bmp.Crop(ColumnWidth * c,";
_b = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_b = _bmp.Crop((int) (_columnwidth*_c),(int) (_rowheight*_r),_columnwidth,_rowheight).Resize((int) (_widthmeters*_scale),(int) (_heightmeters*_scale),__c.False);
RDebugUtils.currentLine=17956873;
 //BA.debugLineNum = 17956873;BA.debugLine="Dim sb As X2ScaledBitmap";
_sb = new b4a.example.x2utils._x2scaledbitmap();
RDebugUtils.currentLine=17956874;
 //BA.debugLineNum = 17956874;BA.debugLine="sb.Bmp = b";
_sb.Bmp /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = _b;
RDebugUtils.currentLine=17956875;
 //BA.debugLineNum = 17956875;BA.debugLine="sb.Scale = BmpSmoothScale";
_sb.Scale /*float*/  = __ref._bmpsmoothscale /*float*/ ;
RDebugUtils.currentLine=17956876;
 //BA.debugLineNum = 17956876;BA.debugLine="res.Add(sb)";
_res.Add((Object)(_sb));
 }
};
 }
};
RDebugUtils.currentLine=17956879;
 //BA.debugLineNum = 17956879;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=17956880;
 //BA.debugLineNum = 17956880;BA.debugLine="End Sub";
return null;
}
public b4a.example.bitmapcreator  _nearestneighborresize(b4a.example.x2utils __ref,b4a.example.bitmapcreator _source,anywheresoftware.b4a.objects.B4XCanvas.B4XRect _srcrect,float _width,float _height,boolean _keepaspectratio) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2utils";
if (Debug.shouldDelegate(ba, "nearestneighborresize", true))
	 {return ((b4a.example.bitmapcreator) Debug.delegate(ba, "nearestneighborresize", new Object[] {_source,_srcrect,_width,_height,_keepaspectratio}));}
b4a.example.bitmapcreator _bc = null;
float _ratiow = 0f;
float _ratioh = 0f;
float _ratio = 0f;
RDebugUtils.currentLine=19857408;
 //BA.debugLineNum = 19857408;BA.debugLine="Public Sub NearestNeighborResize (Source As Bitmap";
RDebugUtils.currentLine=19857409;
 //BA.debugLineNum = 19857409;BA.debugLine="Dim bc As BitmapCreator";
_bc = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=19857410;
 //BA.debugLineNum = 19857410;BA.debugLine="If KeepAspectRatio Then";
if (_keepaspectratio) { 
RDebugUtils.currentLine=19857411;
 //BA.debugLineNum = 19857411;BA.debugLine="Dim RatioW As Float = SrcRect.Width / Width";
_ratiow = (float) (_srcrect.getWidth()/(double)_width);
RDebugUtils.currentLine=19857412;
 //BA.debugLineNum = 19857412;BA.debugLine="Dim RatioH As Float = SrcRect.Height / Height";
_ratioh = (float) (_srcrect.getHeight()/(double)_height);
RDebugUtils.currentLine=19857413;
 //BA.debugLineNum = 19857413;BA.debugLine="Dim ratio As Float = Max(RatioH, RatioW)";
_ratio = (float) (__c.Max(_ratioh,_ratiow));
RDebugUtils.currentLine=19857414;
 //BA.debugLineNum = 19857414;BA.debugLine="Width = SrcRect.Width / ratio";
_width = (float) (_srcrect.getWidth()/(double)_ratio);
RDebugUtils.currentLine=19857415;
 //BA.debugLineNum = 19857415;BA.debugLine="Height = SrcRect.Height / ratio";
_height = (float) (_srcrect.getHeight()/(double)_ratio);
 };
RDebugUtils.currentLine=19857417;
 //BA.debugLineNum = 19857417;BA.debugLine="Width = Round(Width)";
_width = (float) (__c.Round(_width));
RDebugUtils.currentLine=19857418;
 //BA.debugLineNum = 19857418;BA.debugLine="Height = Round(Height)";
_height = (float) (__c.Round(_height));
RDebugUtils.currentLine=19857419;
 //BA.debugLineNum = 19857419;BA.debugLine="bc.Initialize(Width, Height)";
_bc._initialize(ba,(int) (_width),(int) (_height));
RDebugUtils.currentLine=19857420;
 //BA.debugLineNum = 19857420;BA.debugLine="GraphicCache.DrawBitmapCreatorFlipped(bc, Source,";
__ref._graphiccache /*b4a.example.x2spritegraphiccache*/ ._drawbitmapcreatorflipped /*String*/ (null,_bc,_source,(float) (_width/(double)_srcrect.getWidth()),(float) (_height/(double)_srcrect.getHeight()),_srcrect,__c.False,__c.False,__c.False);
RDebugUtils.currentLine=19857421;
 //BA.debugLineNum = 19857421;BA.debugLine="Return bc";
if (true) return _bc;
RDebugUtils.currentLine=19857422;
 //BA.debugLineNum = 19857422;BA.debugLine="End Sub";
return null;
}
public b4a.example.x2utils._x2scaledbitmap  _loadbmp(b4a.example.x2utils __ref,String _folder,String _filename,float _widthmeters,float _heightmeters,boolean _keepaspectratio) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2utils";
if (Debug.shouldDelegate(ba, "loadbmp", true))
	 {return ((b4a.example.x2utils._x2scaledbitmap) Debug.delegate(ba, "loadbmp", new Object[] {_folder,_filename,_widthmeters,_heightmeters,_keepaspectratio}));}
RDebugUtils.currentLine=17825792;
 //BA.debugLineNum = 17825792;BA.debugLine="Public Sub LoadBmp (Folder As String, FileName As";
RDebugUtils.currentLine=17825793;
 //BA.debugLineNum = 17825793;BA.debugLine="Return LoadBmp2 (Folder, FileName, WidthMeters, H";
if (true) return __ref._loadbmp2 /*b4a.example.x2utils._x2scaledbitmap*/ (null,_folder,_filename,_widthmeters,_heightmeters,__ref._bmpsmoothscale /*float*/ ,_keepaspectratio);
RDebugUtils.currentLine=17825794;
 //BA.debugLineNum = 17825794;BA.debugLine="End Sub";
return null;
}
public String  _addfuturetask(b4a.example.x2utils __ref,Object _callback,String _subname,int _timetofirems,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2utils";
if (Debug.shouldDelegate(ba, "addfuturetask", true))
	 {return ((String) Debug.delegate(ba, "addfuturetask", new Object[] {_callback,_subname,_timetofirems,_value}));}
RDebugUtils.currentLine=18743296;
 //BA.debugLineNum = 18743296;BA.debugLine="Public Sub AddFutureTask (Callback As Object, SubN";
RDebugUtils.currentLine=18743297;
 //BA.debugLineNum = 18743297;BA.debugLine="AddFutureTask2(Callback, SubName, TimeToFireMs, V";
__ref._addfuturetask2 /*String*/ (null,_callback,_subname,_timetofirems,_value,__c.False);
RDebugUtils.currentLine=18743298;
 //BA.debugLineNum = 18743298;BA.debugLine="End Sub";
return "";
}
public String  _addfuturetask2(b4a.example.x2utils __ref,Object _callback,String _subname,int _timetofirems,Object _value,boolean _allowduplicates) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2utils";
if (Debug.shouldDelegate(ba, "addfuturetask2", true))
	 {return ((String) Debug.delegate(ba, "addfuturetask2", new Object[] {_callback,_subname,_timetofirems,_value,_allowduplicates}));}
b4a.example.x2utils._x2futuretask _ft = null;
int _i = 0;
b4a.example.x2utils._x2futuretask _old = null;
RDebugUtils.currentLine=18808832;
 //BA.debugLineNum = 18808832;BA.debugLine="Public Sub AddFutureTask2 (Callback As Object, Sub";
RDebugUtils.currentLine=18808833;
 //BA.debugLineNum = 18808833;BA.debugLine="Dim ft As X2FutureTask";
_ft = new b4a.example.x2utils._x2futuretask();
RDebugUtils.currentLine=18808834;
 //BA.debugLineNum = 18808834;BA.debugLine="ft.Callback = Callback";
_ft.Callback /*Object*/  = _callback;
RDebugUtils.currentLine=18808835;
 //BA.debugLineNum = 18808835;BA.debugLine="ft.SubName = SubName";
_ft.SubName /*String*/  = _subname;
RDebugUtils.currentLine=18808836;
 //BA.debugLineNum = 18808836;BA.debugLine="ft.GameTimeMs = TimeToFireMs + gs.GameTimeMs";
_ft.GameTimeMs /*int*/  = (int) (_timetofirems+__ref._gs /*b4a.example.x2utils._x2gamestep*/ .GameTimeMs /*int*/ );
RDebugUtils.currentLine=18808837;
 //BA.debugLineNum = 18808837;BA.debugLine="ft.Value = Value";
_ft.Value /*Object*/  = _value;
RDebugUtils.currentLine=18808838;
 //BA.debugLineNum = 18808838;BA.debugLine="For i = FutureTasks.Size - 1 To 0 Step -1";
{
final int step6 = -1;
final int limit6 = (int) (0);
_i = (int) (__ref._futuretasks /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1) ;
for (;_i >= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=18808839;
 //BA.debugLineNum = 18808839;BA.debugLine="Dim old As X2FutureTask = FutureTasks.Get(i)";
_old = (b4a.example.x2utils._x2futuretask)(__ref._futuretasks /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=18808840;
 //BA.debugLineNum = 18808840;BA.debugLine="If AllowDuplicates = False And old.Disabled = Fa";
if (_allowduplicates==__c.False && _old.Disabled /*boolean*/ ==__c.False && _old.GameTimeMs /*int*/ ==_ft.GameTimeMs /*int*/  && (_old.Callback /*Object*/ ).equals(_ft.Callback /*Object*/ ) && (_ft.SubName /*String*/ ).equals(_old.SubName /*String*/ )) { 
RDebugUtils.currentLine=18808841;
 //BA.debugLineNum = 18808841;BA.debugLine="old.Disabled = True";
_old.Disabled /*boolean*/  = __c.True;
 };
RDebugUtils.currentLine=18808843;
 //BA.debugLineNum = 18808843;BA.debugLine="If old.GameTimeMS > ft.GameTimeMs Then";
if (_old.GameTimeMs /*int*/ >_ft.GameTimeMs /*int*/ ) { 
RDebugUtils.currentLine=18808844;
 //BA.debugLineNum = 18808844;BA.debugLine="If i = FutureTasks.Size - 1 Then";
if (_i==__ref._futuretasks /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1) { 
RDebugUtils.currentLine=18808845;
 //BA.debugLineNum = 18808845;BA.debugLine="FutureTasks.Add(ft)";
__ref._futuretasks /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_ft));
 }else {
RDebugUtils.currentLine=18808847;
 //BA.debugLineNum = 18808847;BA.debugLine="FutureTasks.InsertAt(i + 1, ft)";
__ref._futuretasks /*anywheresoftware.b4a.objects.collections.List*/ .InsertAt((int) (_i+1),(Object)(_ft));
 };
RDebugUtils.currentLine=18808849;
 //BA.debugLineNum = 18808849;BA.debugLine="Return";
if (true) return "";
 };
 }
};
RDebugUtils.currentLine=18808852;
 //BA.debugLineNum = 18808852;BA.debugLine="FutureTasks.InsertAt(0, ft)";
__ref._futuretasks /*anywheresoftware.b4a.objects.collections.List*/ .InsertAt((int) (0),(Object)(_ft));
RDebugUtils.currentLine=18808853;
 //BA.debugLineNum = 18808853;BA.debugLine="End Sub";
return "";
}
public String  _bc_bitmapready(b4a.example.x2utils __ref,anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2utils";
if (Debug.shouldDelegate(ba, "bc_bitmapready", true))
	 {return ((String) Debug.delegate(ba, "bc_bitmapready", new Object[] {_bmp}));}
RDebugUtils.currentLine=17235968;
 //BA.debugLineNum = 17235968;BA.debugLine="Private Sub BC_BitmapReady (bmp As B4XBitmap)";
RDebugUtils.currentLine=17235978;
 //BA.debugLineNum = 17235978;BA.debugLine="Drawing = False";
__ref._drawing /*boolean*/  = __c.False;
RDebugUtils.currentLine=17235979;
 //BA.debugLineNum = 17235979;BA.debugLine="FPS = Min((FPS * 20 + 1000 / (DateTime.Now - Last";
__ref._fps /*float*/  = (float) (__c.Min((__ref._fps /*float*/ *20+1000/(double)(__c.DateTime.getNow()-__ref._lastdrawingtime /*long*/ ))/(double)21,__ref._targetfps /*int*/ ));
RDebugUtils.currentLine=17235980;
 //BA.debugLineNum = 17235980;BA.debugLine="LastDrawingTime = DateTime.Now";
__ref._lastdrawingtime /*long*/  = __c.DateTime.getNow();
RDebugUtils.currentLine=17235981;
 //BA.debugLineNum = 17235981;BA.debugLine="SetBitmapWithFitOrFill(mTargetView, bmp)";
__ref._setbitmapwithfitorfill /*String*/ (null,__ref._mtargetview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,_bmp);
RDebugUtils.currentLine=17235982;
 //BA.debugLineNum = 17235982;BA.debugLine="mGame.DrawingComplete";
__ref._mgame /*b4a.example.game*/ ._drawingcomplete /*String*/ (null);
RDebugUtils.currentLine=17235986;
 //BA.debugLineNum = 17235986;BA.debugLine="End Sub";
return "";
}
public float  _bcpixelstometers(b4a.example.x2utils __ref,int _pixels) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2utils";
if (Debug.shouldDelegate(ba, "bcpixelstometers", true))
	 {return ((Float) Debug.delegate(ba, "bcpixelstometers", new Object[] {_pixels}));}
RDebugUtils.currentLine=18284544;
 //BA.debugLineNum = 18284544;BA.debugLine="Public Sub BCPixelsToMeters (Pixels As Int) As Flo";
RDebugUtils.currentLine=18284545;
 //BA.debugLineNum = 18284545;BA.debugLine="Return Pixels / mBCPixelsPerMeter";
if (true) return (float) (_pixels/(double)__ref._mbcpixelspermeter /*float*/ );
RDebugUtils.currentLine=18284546;
 //BA.debugLineNum = 18284546;BA.debugLine="End Sub";
return 0f;
}
public b4a.example.bitmapcreator._compressedbc  _bitmaptocompressedbc(b4a.example.x2utils __ref,anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp,float _scale) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2utils";
if (Debug.shouldDelegate(ba, "bitmaptocompressedbc", true))
	 {return ((b4a.example.bitmapcreator._compressedbc) Debug.delegate(ba, "bitmaptocompressedbc", new Object[] {_bmp,_scale}));}
b4a.example.bitmapcreator _bc = null;
RDebugUtils.currentLine=19005440;
 //BA.debugLineNum = 19005440;BA.debugLine="Public Sub BitmapToCompressedBC (bmp As B4XBitmap,";
RDebugUtils.currentLine=19005441;
 //BA.debugLineNum = 19005441;BA.debugLine="Dim bc As BitmapCreator = BitmapToBC(bmp, Scale)";
_bc = __ref._bitmaptobc /*b4a.example.bitmapcreator*/ (null,_bmp,_scale);
RDebugUtils.currentLine=19005442;
 //BA.debugLineNum = 19005442;BA.debugLine="Return bc.ExtractCompressedBC(bc.TargetRect, Grap";
if (true) return _bc._extractcompressedbc(_bc._targetrect,__ref._graphiccache /*b4a.example.x2spritegraphiccache*/ ._cbccache /*b4a.example.bitmapcreator._internalcompressedbccache*/ );
RDebugUtils.currentLine=19005443;
 //BA.debugLineNum = 19005443;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4a.example.x2utils __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2utils";
RDebugUtils.currentLine=17039360;
 //BA.debugLineNum = 17039360;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=17039361;
 //BA.debugLineNum = 17039361;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=17039362;
 //BA.debugLineNum = 17039362;BA.debugLine="Public gs As X2GameStep";
_gs = new b4a.example.x2utils._x2gamestep();
RDebugUtils.currentLine=17039363;
 //BA.debugLineNum = 17039363;BA.debugLine="Type X2GameStep (BodiesToDelete As List, GameTime";
;
RDebugUtils.currentLine=17039366;
 //BA.debugLineNum = 17039366;BA.debugLine="Type X2BodiesFromContact (ThisBody As X2BodyWrapp";
;
RDebugUtils.currentLine=17039368;
 //BA.debugLineNum = 17039368;BA.debugLine="Public ResumableIndex As Int";
_resumableindex = 0;
RDebugUtils.currentLine=17039369;
 //BA.debugLineNum = 17039369;BA.debugLine="Public mTargetView As B4XView 'Foreground ImageVi";
_mtargetview = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=17039370;
 //BA.debugLineNum = 17039370;BA.debugLine="Public MainBC As BitmapCreator  'Foreground BC";
_mainbc = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=17039372;
 //BA.debugLineNum = 17039372;BA.debugLine="Type X2FutureTask (Callback As Object, SubName As";
;
RDebugUtils.currentLine=17039373;
 //BA.debugLineNum = 17039373;BA.debugLine="Private FutureTasks As List";
_futuretasks = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=17039374;
 //BA.debugLineNum = 17039374;BA.debugLine="Private LoopsPerSecond As Float";
_loopspersecond = 0f;
RDebugUtils.currentLine=17039375;
 //BA.debugLineNum = 17039375;BA.debugLine="Public IsRunning As Boolean";
_isrunning = false;
RDebugUtils.currentLine=17039376;
 //BA.debugLineNum = 17039376;BA.debugLine="Public mGame As Game";
_mgame = new b4a.example.game();
RDebugUtils.currentLine=17039377;
 //BA.debugLineNum = 17039377;BA.debugLine="Public mWorld As B2World";
_mworld = new anywheresoftware.b4a.objects.B2World();
RDebugUtils.currentLine=17039378;
 //BA.debugLineNum = 17039378;BA.debugLine="Public mBCPixelsPerMeter As Float";
_mbcpixelspermeter = 0f;
RDebugUtils.currentLine=17039379;
 //BA.debugLineNum = 17039379;BA.debugLine="Public GraphicCache As X2SpriteGraphicCache";
_graphiccache = new b4a.example.x2spritegraphiccache();
RDebugUtils.currentLine=17039380;
 //BA.debugLineNum = 17039380;BA.debugLine="Public const BmpSmoothScale As Float = 1 'no long";
_bmpsmoothscale = (float) (1);
RDebugUtils.currentLine=17039382;
 //BA.debugLineNum = 17039382;BA.debugLine="Public ScreenAABB As B2AABB";
_screenaabb = new anywheresoftware.b4a.objects.B2AABB();
RDebugUtils.currentLine=17039384;
 //BA.debugLineNum = 17039384;BA.debugLine="Type X2ScaledBitmap (Bmp As B4XBitmap, Scale As F";
;
RDebugUtils.currentLine=17039385;
 //BA.debugLineNum = 17039385;BA.debugLine="Private Drawing As Boolean";
_drawing = false;
RDebugUtils.currentLine=17039387;
 //BA.debugLineNum = 17039387;BA.debugLine="Public TargetFPS As Int = 30";
_targetfps = (int) (30);
RDebugUtils.currentLine=17039391;
 //BA.debugLineNum = 17039391;BA.debugLine="Public Transparent As BitmapCreator";
_transparent = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=17039394;
 //BA.debugLineNum = 17039394;BA.debugLine="Public TimeStepMs As Float";
_timestepms = 0f;
RDebugUtils.currentLine=17039395;
 //BA.debugLineNum = 17039395;BA.debugLine="Public DebugDraw As X2DebugDraw";
_debugdraw = new b4a.example.x2debugdraw();
RDebugUtils.currentLine=17039396;
 //BA.debugLineNum = 17039396;BA.debugLine="Private IsDebugDrawEnabled As Boolean";
_isdebugdrawenabled = false;
RDebugUtils.currentLine=17039397;
 //BA.debugLineNum = 17039397;BA.debugLine="Public SoundPool As X2SoundPool";
_soundpool = new b4a.example.x2soundpool();
RDebugUtils.currentLine=17039399;
 //BA.debugLineNum = 17039399;BA.debugLine="Public IsLowFPS As Boolean";
_islowfps = false;
RDebugUtils.currentLine=17039400;
 //BA.debugLineNum = 17039400;BA.debugLine="Public FPS As Float";
_fps = 0f;
RDebugUtils.currentLine=17039401;
 //BA.debugLineNum = 17039401;BA.debugLine="Private LastDrawingTime As Long";
_lastdrawingtime = 0L;
RDebugUtils.currentLine=17039403;
 //BA.debugLineNum = 17039403;BA.debugLine="Public SlowDownPhysicsScale As Float = 1";
_slowdownphysicsscale = (float) (1);
RDebugUtils.currentLine=17039404;
 //BA.debugLineNum = 17039404;BA.debugLine="Private SleepTime As Int";
_sleeptime = 0;
RDebugUtils.currentLine=17039405;
 //BA.debugLineNum = 17039405;BA.debugLine="Public VelocityIterations As Int = 8";
_velocityiterations = (int) (8);
RDebugUtils.currentLine=17039406;
 //BA.debugLineNum = 17039406;BA.debugLine="Public PositionIterations As Int = 3";
_positioniterations = (int) (3);
RDebugUtils.currentLine=17039407;
 //BA.debugLineNum = 17039407;BA.debugLine="Public LastDrawingTasks As List";
_lastdrawingtasks = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=17039408;
 //BA.debugLineNum = 17039408;BA.debugLine="Public ShapeAABB As B2AABB";
_shapeaabb = new anywheresoftware.b4a.objects.B2AABB();
RDebugUtils.currentLine=17039412;
 //BA.debugLineNum = 17039412;BA.debugLine="Private ShapeTransform As B2Transform";
_shapetransform = new anywheresoftware.b4a.objects.B2Transform();
RDebugUtils.currentLine=17039416;
 //BA.debugLineNum = 17039416;BA.debugLine="Private const MAX_SIZE As Int = 700";
_max_size = (int) (700);
RDebugUtils.currentLine=17039418;
 //BA.debugLineNum = 17039418;BA.debugLine="Private EmptyList As List";
_emptylist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=17039419;
 //BA.debugLineNum = 17039419;BA.debugLine="End Sub";
return "";
}
public String  _convertmillisecondstostring(b4a.example.x2utils __ref,long _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2utils";
if (Debug.shouldDelegate(ba, "convertmillisecondstostring", true))
	 {return ((String) Debug.delegate(ba, "convertmillisecondstostring", new Object[] {_t}));}
int _minutes = 0;
int _seconds = 0;
RDebugUtils.currentLine=19464192;
 //BA.debugLineNum = 19464192;BA.debugLine="Private Sub ConvertMillisecondsToString(t As Long)";
RDebugUtils.currentLine=19464193;
 //BA.debugLineNum = 19464193;BA.debugLine="Dim minutes As Int = t / DateTime.TicksPerMinut";
_minutes = (int) (_t/(double)__c.DateTime.TicksPerMinute);
RDebugUtils.currentLine=19464194;
 //BA.debugLineNum = 19464194;BA.debugLine="Dim seconds As Int = (t Mod DateTime.TicksPerMi";
_seconds = (int) ((_t%__c.DateTime.TicksPerMinute)/(double)__c.DateTime.TicksPerSecond);
RDebugUtils.currentLine=19464195;
 //BA.debugLineNum = 19464195;BA.debugLine="Return $\"$1.0{minutes}:$2.0{seconds}\"$";
if (true) return (""+__c.SmartStringFormatter("1.0",(Object)(_minutes))+":"+__c.SmartStringFormatter("2.0",(Object)(_seconds))+"");
RDebugUtils.currentLine=19464196;
 //BA.debugLineNum = 19464196;BA.debugLine="End Sub";
return "";
}
public b4a.example.bitmapcreator._drawtask  _createdrawtaskfromcompressedbc(b4a.example.x2utils __ref,b4a.example.bitmapcreator._compressedbc _cbc,anywheresoftware.b4a.objects.B2Vec2 _bcposition,anywheresoftware.b4a.objects.B4XCanvas.B4XRect _srcrect) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2utils";
if (Debug.shouldDelegate(ba, "createdrawtaskfromcompressedbc", true))
	 {return ((b4a.example.bitmapcreator._drawtask) Debug.delegate(ba, "createdrawtaskfromcompressedbc", new Object[] {_cbc,_bcposition,_srcrect}));}
b4a.example.bitmapcreator._drawtask _dt = null;
RDebugUtils.currentLine=19333120;
 //BA.debugLineNum = 19333120;BA.debugLine="Public Sub CreateDrawTaskFromCompressedBC (CBC As";
RDebugUtils.currentLine=19333121;
 //BA.debugLineNum = 19333121;BA.debugLine="Dim dt As DrawTask = MainBC.CreateDrawTask(CBC, S";
_dt = __ref._mainbc /*b4a.example.bitmapcreator*/ ._createdrawtask((Object)(_cbc),_srcrect,(int) (_bcposition.getX()-_srcrect.getWidth()/(double)2),(int) (_bcposition.getY()-_srcrect.getHeight()/(double)2),__c.False);
RDebugUtils.currentLine=19333123;
 //BA.debugLineNum = 19333123;BA.debugLine="dt.IsCompressedSource = True";
_dt.IsCompressedSource = __c.True;
RDebugUtils.currentLine=19333124;
 //BA.debugLineNum = 19333124;BA.debugLine="Return dt";
if (true) return _dt;
RDebugUtils.currentLine=19333125;
 //BA.debugLineNum = 19333125;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper  _createimmutablebitmap(b4a.example.x2utils __ref,anywheresoftware.b4a.objects.B4XCanvas _cvs) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2utils";
if (Debug.shouldDelegate(ba, "createimmutablebitmap", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) Debug.delegate(ba, "createimmutablebitmap", new Object[] {_cvs}));}
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _b = null;
RDebugUtils.currentLine=19398656;
 //BA.debugLineNum = 19398656;BA.debugLine="Public Sub CreateImmutableBitmap (CVS As B4XCanvas";
RDebugUtils.currentLine=19398657;
 //BA.debugLineNum = 19398657;BA.debugLine="Dim bmp As B4XBitmap = CVS.CreateBitmap";
_bmp = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bmp = _cvs.CreateBitmap();
RDebugUtils.currentLine=19398659;
 //BA.debugLineNum = 19398659;BA.debugLine="Dim b As Bitmap";
_b = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=19398660;
 //BA.debugLineNum = 19398660;BA.debugLine="b.Initialize3(bmp)";
_b.Initialize3((android.graphics.Bitmap)(_bmp.getObject()));
RDebugUtils.currentLine=19398661;
 //BA.debugLineNum = 19398661;BA.debugLine="bmp = b";
_bmp = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_b.getObject()));
RDebugUtils.currentLine=19398663;
 //BA.debugLineNum = 19398663;BA.debugLine="Return bmp";
if (true) return _bmp;
RDebugUtils.currentLine=19398664;
 //BA.debugLineNum = 19398664;BA.debugLine="End Sub";
return null;
}
public String  _enabledebugdraw(b4a.example.x2utils __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2utils";
if (Debug.shouldDelegate(ba, "enabledebugdraw", true))
	 {return ((String) Debug.delegate(ba, "enabledebugdraw", null));}
RDebugUtils.currentLine=17301504;
 //BA.debugLineNum = 17301504;BA.debugLine="Public Sub EnableDebugDraw";
RDebugUtils.currentLine=17301505;
 //BA.debugLineNum = 17301505;BA.debugLine="If IsDebugDrawEnabled Then Return";
if (__ref._isdebugdrawenabled /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=17301506;
 //BA.debugLineNum = 17301506;BA.debugLine="DebugDraw.Initialize(mTargetView.Parent, Me)";
__ref._debugdraw /*b4a.example.x2debugdraw*/ ._initialize /*String*/ (null,ba,__ref._mtargetview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent(),(b4a.example.x2utils)(this));
RDebugUtils.currentLine=17301507;
 //BA.debugLineNum = 17301507;BA.debugLine="IsDebugDrawEnabled = True";
__ref._isdebugdrawenabled /*boolean*/  = __c.True;
RDebugUtils.currentLine=17301508;
 //BA.debugLineNum = 17301508;BA.debugLine="End Sub";
return "";
}
public b4a.example.x2utils._x2bodiesfromcontact  _getbodiesfromcontact(b4a.example.x2utils __ref,anywheresoftware.b4a.objects.B2Contact _contact,String _firstname) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2utils";
if (Debug.shouldDelegate(ba, "getbodiesfromcontact", true))
	 {return ((b4a.example.x2utils._x2bodiesfromcontact) Debug.delegate(ba, "getbodiesfromcontact", new Object[] {_contact,_firstname}));}
b4a.example.x2bodywrapper _bw = null;
b4a.example.x2utils._x2bodiesfromcontact _bc = null;
RDebugUtils.currentLine=19070976;
 //BA.debugLineNum = 19070976;BA.debugLine="Public Sub GetBodiesFromContact (Contact As B2Cont";
RDebugUtils.currentLine=19070977;
 //BA.debugLineNum = 19070977;BA.debugLine="Dim bw As X2BodyWrapper = Contact.FixtureA.Body.T";
_bw = (b4a.example.x2bodywrapper)(_contact.getFixtureA().getBody().getTag());
RDebugUtils.currentLine=19070978;
 //BA.debugLineNum = 19070978;BA.debugLine="If bw = Null Or Contact.FixtureB.Body.Tag = Null";
if (_bw== null || _contact.getFixtureB().getBody().getTag()== null) { 
if (true) return (b4a.example.x2utils._x2bodiesfromcontact)(__c.Null);};
RDebugUtils.currentLine=19070979;
 //BA.debugLineNum = 19070979;BA.debugLine="If bw.Name = FirstName Then";
if ((_bw._name /*String*/ ).equals(_firstname)) { 
RDebugUtils.currentLine=19070980;
 //BA.debugLineNum = 19070980;BA.debugLine="Dim bc As X2BodiesFromContact";
_bc = new b4a.example.x2utils._x2bodiesfromcontact();
RDebugUtils.currentLine=19070981;
 //BA.debugLineNum = 19070981;BA.debugLine="bc.ThisBody = bw";
_bc.ThisBody /*b4a.example.x2bodywrapper*/  = _bw;
RDebugUtils.currentLine=19070982;
 //BA.debugLineNum = 19070982;BA.debugLine="bc.OtherBody = Contact.FixtureB.Body.Tag";
_bc.OtherBody /*b4a.example.x2bodywrapper*/  = (b4a.example.x2bodywrapper)(_contact.getFixtureB().getBody().getTag());
RDebugUtils.currentLine=19070983;
 //BA.debugLineNum = 19070983;BA.debugLine="bc.ThisFixture = Contact.FixtureA";
_bc.ThisFixture /*anywheresoftware.b4a.objects.B2Fixture*/  = _contact.getFixtureA();
RDebugUtils.currentLine=19070984;
 //BA.debugLineNum = 19070984;BA.debugLine="bc.OtherFixture = Contact.FixtureB";
_bc.OtherFixture /*anywheresoftware.b4a.objects.B2Fixture*/  = _contact.getFixtureB();
RDebugUtils.currentLine=19070985;
 //BA.debugLineNum = 19070985;BA.debugLine="bc.NormalSign = 1";
_bc.NormalSign /*int*/  = (int) (1);
RDebugUtils.currentLine=19070986;
 //BA.debugLineNum = 19070986;BA.debugLine="Return bc";
if (true) return _bc;
 }else {
RDebugUtils.currentLine=19070988;
 //BA.debugLineNum = 19070988;BA.debugLine="bw = Contact.FixtureB.Body.Tag";
_bw = (b4a.example.x2bodywrapper)(_contact.getFixtureB().getBody().getTag());
RDebugUtils.currentLine=19070989;
 //BA.debugLineNum = 19070989;BA.debugLine="If bw.Name = FirstName Then";
if ((_bw._name /*String*/ ).equals(_firstname)) { 
RDebugUtils.currentLine=19070990;
 //BA.debugLineNum = 19070990;BA.debugLine="Dim bc As X2BodiesFromContact";
_bc = new b4a.example.x2utils._x2bodiesfromcontact();
RDebugUtils.currentLine=19070991;
 //BA.debugLineNum = 19070991;BA.debugLine="bc.ThisBody = bw";
_bc.ThisBody /*b4a.example.x2bodywrapper*/  = _bw;
RDebugUtils.currentLine=19070992;
 //BA.debugLineNum = 19070992;BA.debugLine="bc.OtherBody = Contact.FixtureA.Body.Tag";
_bc.OtherBody /*b4a.example.x2bodywrapper*/  = (b4a.example.x2bodywrapper)(_contact.getFixtureA().getBody().getTag());
RDebugUtils.currentLine=19070993;
 //BA.debugLineNum = 19070993;BA.debugLine="bc.ThisFixture = Contact.FixtureB";
_bc.ThisFixture /*anywheresoftware.b4a.objects.B2Fixture*/  = _contact.getFixtureB();
RDebugUtils.currentLine=19070994;
 //BA.debugLineNum = 19070994;BA.debugLine="bc.OtherFixture = Contact.FixtureA";
_bc.OtherFixture /*anywheresoftware.b4a.objects.B2Fixture*/  = _contact.getFixtureA();
RDebugUtils.currentLine=19070995;
 //BA.debugLineNum = 19070995;BA.debugLine="bc.NormalSign = -1";
_bc.NormalSign /*int*/  = (int) (-1);
RDebugUtils.currentLine=19070996;
 //BA.debugLineNum = 19070996;BA.debugLine="Return bc";
if (true) return _bc;
 };
 };
RDebugUtils.currentLine=19070999;
 //BA.debugLineNum = 19070999;BA.debugLine="Return Null";
if (true) return (b4a.example.x2utils._x2bodiesfromcontact)(__c.Null);
RDebugUtils.currentLine=19071000;
 //BA.debugLineNum = 19071000;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getbodieswrappersbyids(b4a.example.x2utils __ref,anywheresoftware.b4a.objects.collections.List _listofids) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2utils";
if (Debug.shouldDelegate(ba, "getbodieswrappersbyids", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getbodieswrappersbyids", new Object[] {_listofids}));}
anywheresoftware.b4a.objects.collections.List _res = null;
anywheresoftware.b4a.objects.collections.List _bodies = null;
anywheresoftware.b4a.objects.B2Body _body = null;
b4a.example.x2bodywrapper _bw = null;
RDebugUtils.currentLine=19726336;
 //BA.debugLineNum = 19726336;BA.debugLine="Public Sub GetBodiesWrappersByIds(ListOfIds As Lis";
RDebugUtils.currentLine=19726337;
 //BA.debugLineNum = 19726337;BA.debugLine="Dim res As List";
_res = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=19726338;
 //BA.debugLineNum = 19726338;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=19726339;
 //BA.debugLineNum = 19726339;BA.debugLine="Dim bodies As List = mWorld.AllBodies";
_bodies = new anywheresoftware.b4a.objects.collections.List();
_bodies = __ref._mworld /*anywheresoftware.b4a.objects.B2World*/ .getAllBodies();
RDebugUtils.currentLine=19726340;
 //BA.debugLineNum = 19726340;BA.debugLine="For Each body As B2Body In bodies";
{
final anywheresoftware.b4a.BA.IterableList group4 = _bodies;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_body = (anywheresoftware.b4a.objects.B2Body)(group4.Get(index4));
RDebugUtils.currentLine=19726341;
 //BA.debugLineNum = 19726341;BA.debugLine="Dim bw As X2BodyWrapper = body.Tag";
_bw = (b4a.example.x2bodywrapper)(_body.getTag());
RDebugUtils.currentLine=19726342;
 //BA.debugLineNum = 19726342;BA.debugLine="If ListOfIds.IndexOf(bw.Id) > -1 Then";
if (_listofids.IndexOf((Object)(_bw._id /*int*/ ))>-1) { 
RDebugUtils.currentLine=19726343;
 //BA.debugLineNum = 19726343;BA.debugLine="res.Add(bw)";
_res.Add((Object)(_bw));
 };
 }
};
RDebugUtils.currentLine=19726346;
 //BA.debugLineNum = 19726346;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=19726347;
 //BA.debugLineNum = 19726347;BA.debugLine="End Sub";
return null;
}
public b4a.example.x2bodywrapper  _getbodywrapperbyid(b4a.example.x2utils __ref,int _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2utils";
if (Debug.shouldDelegate(ba, "getbodywrapperbyid", true))
	 {return ((b4a.example.x2bodywrapper) Debug.delegate(ba, "getbodywrapperbyid", new Object[] {_id}));}
anywheresoftware.b4a.objects.collections.List _bodies = null;
anywheresoftware.b4a.objects.B2Body _body = null;
b4a.example.x2bodywrapper _bw = null;
RDebugUtils.currentLine=19595264;
 //BA.debugLineNum = 19595264;BA.debugLine="Public Sub GetBodyWrapperById (Id As Int) As X2Bod";
RDebugUtils.currentLine=19595265;
 //BA.debugLineNum = 19595265;BA.debugLine="Dim bodies As List = mWorld.AllBodies";
_bodies = new anywheresoftware.b4a.objects.collections.List();
_bodies = __ref._mworld /*anywheresoftware.b4a.objects.B2World*/ .getAllBodies();
RDebugUtils.currentLine=19595266;
 //BA.debugLineNum = 19595266;BA.debugLine="For Each body As B2Body In bodies";
{
final anywheresoftware.b4a.BA.IterableList group2 = _bodies;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_body = (anywheresoftware.b4a.objects.B2Body)(group2.Get(index2));
RDebugUtils.currentLine=19595267;
 //BA.debugLineNum = 19595267;BA.debugLine="Dim bw As X2BodyWrapper = body.Tag";
_bw = (b4a.example.x2bodywrapper)(_body.getTag());
RDebugUtils.currentLine=19595268;
 //BA.debugLineNum = 19595268;BA.debugLine="If bw.Id = Id Then Return bw";
if (_bw._id /*int*/ ==_id) { 
if (true) return _bw;};
 }
};
RDebugUtils.currentLine=19595270;
 //BA.debugLineNum = 19595270;BA.debugLine="Return Null";
if (true) return (b4a.example.x2bodywrapper)(__c.Null);
RDebugUtils.currentLine=19595271;
 //BA.debugLineNum = 19595271;BA.debugLine="End Sub";
return null;
}
public b4a.example.x2bodywrapper  _getbodywrapperbyname(b4a.example.x2utils __ref,String _name) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2utils";
if (Debug.shouldDelegate(ba, "getbodywrapperbyname", true))
	 {return ((b4a.example.x2bodywrapper) Debug.delegate(ba, "getbodywrapperbyname", new Object[] {_name}));}
anywheresoftware.b4a.objects.collections.List _bodies = null;
anywheresoftware.b4a.objects.B2Body _body = null;
b4a.example.x2bodywrapper _bw = null;
RDebugUtils.currentLine=19660800;
 //BA.debugLineNum = 19660800;BA.debugLine="Public Sub GetBodyWrapperByName (Name As String) A";
RDebugUtils.currentLine=19660801;
 //BA.debugLineNum = 19660801;BA.debugLine="Dim bodies As List = mWorld.AllBodies";
_bodies = new anywheresoftware.b4a.objects.collections.List();
_bodies = __ref._mworld /*anywheresoftware.b4a.objects.B2World*/ .getAllBodies();
RDebugUtils.currentLine=19660802;
 //BA.debugLineNum = 19660802;BA.debugLine="For Each body As B2Body In bodies";
{
final anywheresoftware.b4a.BA.IterableList group2 = _bodies;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_body = (anywheresoftware.b4a.objects.B2Body)(group2.Get(index2));
RDebugUtils.currentLine=19660803;
 //BA.debugLineNum = 19660803;BA.debugLine="Dim bw As X2BodyWrapper = body.Tag";
_bw = (b4a.example.x2bodywrapper)(_body.getTag());
RDebugUtils.currentLine=19660804;
 //BA.debugLineNum = 19660804;BA.debugLine="If bw.Name = Name Then Return bw";
if ((_bw._name /*String*/ ).equals(_name)) { 
if (true) return _bw;};
 }
};
RDebugUtils.currentLine=19660806;
 //BA.debugLineNum = 19660806;BA.debugLine="Return Null";
if (true) return (b4a.example.x2bodywrapper)(__c.Null);
RDebugUtils.currentLine=19660807;
 //BA.debugLineNum = 19660807;BA.debugLine="End Sub";
return null;
}
public String  _reset(b4a.example.x2utils __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2utils";
if (Debug.shouldDelegate(ba, "reset", true))
	 {return ((String) Debug.delegate(ba, "reset", null));}
anywheresoftware.b4a.objects.B2Body _b = null;
RDebugUtils.currentLine=17367040;
 //BA.debugLineNum = 17367040;BA.debugLine="Public Sub Reset";
RDebugUtils.currentLine=17367041;
 //BA.debugLineNum = 17367041;BA.debugLine="For Each b As B2Body In mWorld.AllBodies";
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._mworld /*anywheresoftware.b4a.objects.B2World*/ .getAllBodies();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = (anywheresoftware.b4a.objects.B2Body)(group1.Get(index1));
RDebugUtils.currentLine=17367042;
 //BA.debugLineNum = 17367042;BA.debugLine="mWorld.DestroyBody(b)";
__ref._mworld /*anywheresoftware.b4a.objects.B2World*/ .DestroyBody(_b);
 }
};
RDebugUtils.currentLine=17367044;
 //BA.debugLineNum = 17367044;BA.debugLine="FutureTasks.Initialize";
__ref._futuretasks /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=17367045;
 //BA.debugLineNum = 17367045;BA.debugLine="LastDrawingTasks.Clear";
__ref._lastdrawingtasks /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=17367046;
 //BA.debugLineNum = 17367046;BA.debugLine="MainBC.FillRect(xui.Color_Transparent, MainBC.Tar";
__ref._mainbc /*b4a.example.bitmapcreator*/ ._fillrect(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__ref._mainbc /*b4a.example.bitmapcreator*/ ._targetrect);
RDebugUtils.currentLine=17367047;
 //BA.debugLineNum = 17367047;BA.debugLine="gs.Initialize";
__ref._gs /*b4a.example.x2utils._x2gamestep*/ .Initialize();
RDebugUtils.currentLine=17367048;
 //BA.debugLineNum = 17367048;BA.debugLine="gs.GameTimeMs = 0";
__ref._gs /*b4a.example.x2utils._x2gamestep*/ .GameTimeMs /*int*/  = (int) (0);
RDebugUtils.currentLine=17367049;
 //BA.debugLineNum = 17367049;BA.debugLine="gs.BodiesToDelete.Initialize";
__ref._gs /*b4a.example.x2utils._x2gamestep*/ .BodiesToDelete /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=17367050;
 //BA.debugLineNum = 17367050;BA.debugLine="UpdateTimeParameters";
__ref._updatetimeparameters /*String*/ (null);
RDebugUtils.currentLine=17367051;
 //BA.debugLineNum = 17367051;BA.debugLine="End Sub";
return "";
}
public b4a.example.x2utils._x2scaledbitmap  _loadbmp2(b4a.example.x2utils __ref,String _folder,String _filename,float _widthmeters,float _heightmeters,float _bmpscale,boolean _keepaspectratio) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2utils";
if (Debug.shouldDelegate(ba, "loadbmp2", true))
	 {return ((b4a.example.x2utils._x2scaledbitmap) Debug.delegate(ba, "loadbmp2", new Object[] {_folder,_filename,_widthmeters,_heightmeters,_bmpscale,_keepaspectratio}));}
float _scale = 0f;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;
b4a.example.x2utils._x2scaledbitmap _sb = null;
RDebugUtils.currentLine=17891328;
 //BA.debugLineNum = 17891328;BA.debugLine="Public Sub LoadBmp2 (Folder As String, FileName As";
RDebugUtils.currentLine=17891329;
 //BA.debugLineNum = 17891329;BA.debugLine="Dim Scale As Float = mBCPixelsPerMeter * BmpScale";
_scale = (float) (__ref._mbcpixelspermeter /*float*/ *_bmpscale);
RDebugUtils.currentLine=17891330;
 //BA.debugLineNum = 17891330;BA.debugLine="Dim bmp As B4XBitmap = xui.LoadBitmapResize(Folde";
_bmp = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bmp = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .LoadBitmapResize(_folder,_filename,(int) (_widthmeters*_scale),(int) (_heightmeters*_scale),_keepaspectratio);
RDebugUtils.currentLine=17891331;
 //BA.debugLineNum = 17891331;BA.debugLine="Dim sb As X2ScaledBitmap";
_sb = new b4a.example.x2utils._x2scaledbitmap();
RDebugUtils.currentLine=17891332;
 //BA.debugLineNum = 17891332;BA.debugLine="sb.Bmp = bmp";
_sb.Bmp /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = _bmp;
RDebugUtils.currentLine=17891333;
 //BA.debugLineNum = 17891333;BA.debugLine="sb.Scale = BmpScale";
_sb.Scale /*float*/  = _bmpscale;
RDebugUtils.currentLine=17891334;
 //BA.debugLineNum = 17891334;BA.debugLine="Return sb";
if (true) return _sb;
RDebugUtils.currentLine=17891335;
 //BA.debugLineNum = 17891335;BA.debugLine="End Sub";
return null;
}
public void  _mainloop(b4a.example.x2utils __ref) throws Exception{
RDebugUtils.currentModule="x2utils";
if (Debug.shouldDelegate(ba, "mainloop", true))
	 {Debug.delegate(ba, "mainloop", null); return;}
ResumableSub_MainLoop rsub = new ResumableSub_MainLoop(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_MainLoop extends BA.ResumableSub {
public ResumableSub_MainLoop(b4a.example.x2utils parent,b4a.example.x2utils __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.x2utils __ref;
b4a.example.x2utils parent;
int _myindex = 0;
int _skippedframes = 0;
b4a.example.bitmapcreator._drawtask _transparenttask = null;
int _counter = 0;
long _startlooptime = 0L;
anywheresoftware.b4a.objects.collections.List _tasks = null;
boolean _nondrawingiteration = false;
anywheresoftware.b4a.objects.collections.Map _visiblebodies = null;
anywheresoftware.b4a.objects.collections.List _allbodies = null;
anywheresoftware.b4a.objects.B2Body _body = null;
b4a.example.x2bodywrapper _bw = null;
String _stats = "";
anywheresoftware.b4a.BA.IterableList group35;
int index35;
int groupLen35;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="x2utils";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=17170433;
 //BA.debugLineNum = 17170433;BA.debugLine="ResumableIndex = ResumableIndex + 1";
__ref._resumableindex /*int*/  = (int) (__ref._resumableindex /*int*/ +1);
RDebugUtils.currentLine=17170434;
 //BA.debugLineNum = 17170434;BA.debugLine="Log($\"*** MainLoop starting. ResumableIndex = ${R";
parent.__c.LogImpl("917170434",("*** MainLoop starting. ResumableIndex = "+parent.__c.SmartStringFormatter("",(Object)(__ref._resumableindex /*int*/ ))+""),0);
RDebugUtils.currentLine=17170435;
 //BA.debugLineNum = 17170435;BA.debugLine="Dim MyIndex As Int = ResumableIndex";
_myindex = __ref._resumableindex /*int*/ ;
RDebugUtils.currentLine=17170436;
 //BA.debugLineNum = 17170436;BA.debugLine="Dim SkippedFrames As Int";
_skippedframes = 0;
RDebugUtils.currentLine=17170437;
 //BA.debugLineNum = 17170437;BA.debugLine="LastDrawingTime = DateTime.Now";
__ref._lastdrawingtime /*long*/  = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=17170438;
 //BA.debugLineNum = 17170438;BA.debugLine="FPS = TargetFPS";
__ref._fps /*float*/  = (float) (__ref._targetfps /*int*/ );
RDebugUtils.currentLine=17170439;
 //BA.debugLineNum = 17170439;BA.debugLine="Dim TransparentTask As DrawTask = MainBC.CreateDr";
_transparenttask = __ref._mainbc /*b4a.example.bitmapcreator*/ ._createdrawtask((Object)(__ref._transparent /*b4a.example.bitmapcreator*/ ),__ref._transparent /*b4a.example.bitmapcreator*/ ._targetrect,(int) (0),(int) (0),parent.__c.True);
RDebugUtils.currentLine=17170440;
 //BA.debugLineNum = 17170440;BA.debugLine="Dim counter As Int";
_counter = 0;
RDebugUtils.currentLine=17170441;
 //BA.debugLineNum = 17170441;BA.debugLine="Do While MyIndex = ResumableIndex";
if (true) break;

case 1:
//do while
this.state = 52;
while (_myindex==__ref._resumableindex /*int*/ ) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=17170442;
 //BA.debugLineNum = 17170442;BA.debugLine="Dim StartLoopTime As Long = DateTime.Now";
_startlooptime = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=17170444;
 //BA.debugLineNum = 17170444;BA.debugLine="Dim tasks As List";
_tasks = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=17170445;
 //BA.debugLineNum = 17170445;BA.debugLine="tasks.Initialize";
_tasks.Initialize();
RDebugUtils.currentLine=17170446;
 //BA.debugLineNum = 17170446;BA.debugLine="tasks.Add(TransparentTask)";
_tasks.Add((Object)(_transparenttask));
RDebugUtils.currentLine=17170447;
 //BA.debugLineNum = 17170447;BA.debugLine="gs.DrawingTasks = tasks";
__ref._gs /*b4a.example.x2utils._x2gamestep*/ .DrawingTasks /*anywheresoftware.b4a.objects.collections.List*/  = _tasks;
RDebugUtils.currentLine=17170448;
 //BA.debugLineNum = 17170448;BA.debugLine="gs.BodiesToDelete.Clear";
__ref._gs /*b4a.example.x2utils._x2gamestep*/ .BodiesToDelete /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=17170450;
 //BA.debugLineNum = 17170450;BA.debugLine="Dim NonDrawingIteration As Boolean";
_nondrawingiteration = false;
RDebugUtils.currentLine=17170451;
 //BA.debugLineNum = 17170451;BA.debugLine="If LoopsPerSecond < TargetFPS - 6 Then";
if (true) break;

case 4:
//if
this.state = 13;
if (__ref._loopspersecond /*float*/ <__ref._targetfps /*int*/ -6) { 
this.state = 6;
}else {
this.state = 12;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=17170452;
 //BA.debugLineNum = 17170452;BA.debugLine="If IsLowFPS = False Then";
if (true) break;

case 7:
//if
this.state = 10;
if (__ref._islowfps /*boolean*/ ==parent.__c.False) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=17170453;
 //BA.debugLineNum = 17170453;BA.debugLine="LoopsPerSecond = -1000000";
__ref._loopspersecond /*float*/  = (float) (-1000000);
RDebugUtils.currentLine=17170454;
 //BA.debugLineNum = 17170454;BA.debugLine="IsLowFPS = True";
__ref._islowfps /*boolean*/  = parent.__c.True;
 if (true) break;

case 10:
//C
this.state = 13;
;
RDebugUtils.currentLine=17170456;
 //BA.debugLineNum = 17170456;BA.debugLine="NonDrawingIteration = counter Mod 2 = 0";
_nondrawingiteration = _counter%2==0;
 if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=17170458;
 //BA.debugLineNum = 17170458;BA.debugLine="IsLowFPS = False";
__ref._islowfps /*boolean*/  = parent.__c.False;
 if (true) break;

case 13:
//C
this.state = 14;
;
RDebugUtils.currentLine=17170460;
 //BA.debugLineNum = 17170460;BA.debugLine="gs.ShouldDraw = Not(NonDrawingIteration Or Drawi";
__ref._gs /*b4a.example.x2utils._x2gamestep*/ .ShouldDraw /*boolean*/  = parent.__c.Not(_nondrawingiteration || __ref._drawing /*boolean*/ ==parent.__c.True);
RDebugUtils.currentLine=17170461;
 //BA.debugLineNum = 17170461;BA.debugLine="If mGame.BeforeTimeStep(gs) = True Then";
if (true) break;

case 14:
//if
this.state = 17;
if (__ref._mgame /*b4a.example.game*/ ._beforetimestep /*boolean*/ (null,__ref._gs /*b4a.example.x2utils._x2gamestep*/ )==parent.__c.True) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=17170462;
 //BA.debugLineNum = 17170462;BA.debugLine="IsRunning = False";
__ref._isrunning /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=17170463;
 //BA.debugLineNum = 17170463;BA.debugLine="Exit";
this.state = 52;
if (true) break;
 if (true) break;

case 17:
//C
this.state = 18;
;
RDebugUtils.currentLine=17170468;
 //BA.debugLineNum = 17170468;BA.debugLine="mWorld.TimeStep(TimeStepMs / 1000, VelocityItera";
__ref._mworld /*anywheresoftware.b4a.objects.B2World*/ .TimeStep((float) (__ref._timestepms /*float*/ /(double)1000),__ref._velocityiterations /*int*/ ,__ref._positioniterations /*int*/ );
RDebugUtils.currentLine=17170474;
 //BA.debugLineNum = 17170474;BA.debugLine="mGame.Tick(gs)";
__ref._mgame /*b4a.example.game*/ ._tick /*String*/ (null,__ref._gs /*b4a.example.x2utils._x2gamestep*/ );
RDebugUtils.currentLine=17170475;
 //BA.debugLineNum = 17170475;BA.debugLine="Dim VisibleBodies As Map = mWorld.QueryAABBToMap";
_visiblebodies = new anywheresoftware.b4a.objects.collections.Map();
_visiblebodies = __ref._mworld /*anywheresoftware.b4a.objects.B2World*/ .QueryAABBToMapOfBodies(__ref._screenaabb /*anywheresoftware.b4a.objects.B2AABB*/ );
RDebugUtils.currentLine=17170476;
 //BA.debugLineNum = 17170476;BA.debugLine="Dim AllBodies As List = mWorld.AllBodies";
_allbodies = new anywheresoftware.b4a.objects.collections.List();
_allbodies = __ref._mworld /*anywheresoftware.b4a.objects.B2World*/ .getAllBodies();
RDebugUtils.currentLine=17170477;
 //BA.debugLineNum = 17170477;BA.debugLine="For Each body As B2Body In AllBodies";
if (true) break;

case 18:
//for
this.state = 33;
group35 = _allbodies;
index35 = 0;
groupLen35 = group35.getSize();
this.state = 53;
if (true) break;

case 53:
//C
this.state = 33;
if (index35 < groupLen35) {
this.state = 20;
_body = (anywheresoftware.b4a.objects.B2Body)(group35.Get(index35));}
if (true) break;

case 54:
//C
this.state = 53;
index35++;
if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=17170478;
 //BA.debugLineNum = 17170478;BA.debugLine="Dim bw As X2BodyWrapper = body.Tag";
_bw = (b4a.example.x2bodywrapper)(_body.getTag());
RDebugUtils.currentLine=17170479;
 //BA.debugLineNum = 17170479;BA.debugLine="bw.IsVisible = VisibleBodies.ContainsKey(body)";
_bw._isvisible /*boolean*/  = _visiblebodies.ContainsKey((Object)(_body));
RDebugUtils.currentLine=17170480;
 //BA.debugLineNum = 17170480;BA.debugLine="If bw.IsVisible Then";
if (true) break;

case 21:
//if
this.state = 32;
if (_bw._isvisible /*boolean*/ ) { 
this.state = 23;
}else {
this.state = 25;
}if (true) break;

case 23:
//C
this.state = 32;
RDebugUtils.currentLine=17170481;
 //BA.debugLineNum = 17170481;BA.debugLine="bw.Tick(gs)";
_bw._tick /*String*/ (null,__ref._gs /*b4a.example.x2utils._x2gamestep*/ );
 if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=17170483;
 //BA.debugLineNum = 17170483;BA.debugLine="If bw.TickIfInvisible Then";
if (true) break;

case 26:
//if
this.state = 31;
if (_bw._tickifinvisible /*boolean*/ ) { 
this.state = 28;
}else 
{RDebugUtils.currentLine=17170485;
 //BA.debugLineNum = 17170485;BA.debugLine="Else If bw.DestroyIfInvisible Then";
if (_bw._destroyifinvisible /*boolean*/ ) { 
this.state = 30;
}}
if (true) break;

case 28:
//C
this.state = 31;
RDebugUtils.currentLine=17170484;
 //BA.debugLineNum = 17170484;BA.debugLine="bw.Tick(gs)";
_bw._tick /*String*/ (null,__ref._gs /*b4a.example.x2utils._x2gamestep*/ );
 if (true) break;

case 30:
//C
this.state = 31;
RDebugUtils.currentLine=17170486;
 //BA.debugLineNum = 17170486;BA.debugLine="bw.Delete(gs)";
_bw._delete /*String*/ (null,__ref._gs /*b4a.example.x2utils._x2gamestep*/ );
 if (true) break;

case 31:
//C
this.state = 32;
;
 if (true) break;

case 32:
//C
this.state = 54;
;
 if (true) break;
if (true) break;

case 33:
//C
this.state = 34;
;
RDebugUtils.currentLine=17170494;
 //BA.debugLineNum = 17170494;BA.debugLine="RunFutureTasks";
__ref._runfuturetasks /*String*/ (null);
RDebugUtils.currentLine=17170495;
 //BA.debugLineNum = 17170495;BA.debugLine="RemoveDeletedBodies";
__ref._removedeletedbodies /*String*/ (null);
RDebugUtils.currentLine=17170496;
 //BA.debugLineNum = 17170496;BA.debugLine="If gs.ShouldDraw Then";
if (true) break;

case 34:
//if
this.state = 43;
if (__ref._gs /*b4a.example.x2utils._x2gamestep*/ .ShouldDraw /*boolean*/ ) { 
this.state = 36;
}else 
{RDebugUtils.currentLine=17170507;
 //BA.debugLineNum = 17170507;BA.debugLine="Else If NonDrawingIteration = False Then";
if (_nondrawingiteration==parent.__c.False) { 
this.state = 42;
}}
if (true) break;

case 36:
//C
this.state = 37;
RDebugUtils.currentLine=17170497;
 //BA.debugLineNum = 17170497;BA.debugLine="Drawing = True";
__ref._drawing /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=17170498;
 //BA.debugLineNum = 17170498;BA.debugLine="If IsDebugDrawEnabled Then";
if (true) break;

case 37:
//if
this.state = 40;
if (__ref._isdebugdrawenabled /*boolean*/ ) { 
this.state = 39;
}if (true) break;

case 39:
//C
this.state = 40;
RDebugUtils.currentLine=17170499;
 //BA.debugLineNum = 17170499;BA.debugLine="DebugDraw.Draw(gs, VisibleBodies)";
__ref._debugdraw /*b4a.example.x2debugdraw*/ ._draw /*String*/ (null,__ref._gs /*b4a.example.x2utils._x2gamestep*/ ,_visiblebodies);
 if (true) break;

case 40:
//C
this.state = 43;
;
RDebugUtils.currentLine=17170501;
 //BA.debugLineNum = 17170501;BA.debugLine="gs.DrawingTasks.AddAll(LastDrawingTasks)";
__ref._gs /*b4a.example.x2utils._x2gamestep*/ .DrawingTasks /*anywheresoftware.b4a.objects.collections.List*/ .AddAll(__ref._lastdrawingtasks /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=17170506;
 //BA.debugLineNum = 17170506;BA.debugLine="MainBC.DrawBitmapCreatorsAsync(Me, \"BC\", gs.Dra";
__ref._mainbc /*b4a.example.bitmapcreator*/ ._drawbitmapcreatorsasync(parent,"BC",__ref._gs /*b4a.example.x2utils._x2gamestep*/ .DrawingTasks /*anywheresoftware.b4a.objects.collections.List*/ );
 if (true) break;

case 42:
//C
this.state = 43;
RDebugUtils.currentLine=17170508;
 //BA.debugLineNum = 17170508;BA.debugLine="Log(\"skipping frame!!!\")";
parent.__c.LogImpl("917170508","skipping frame!!!",0);
RDebugUtils.currentLine=17170509;
 //BA.debugLineNum = 17170509;BA.debugLine="SkippedFrames = SkippedFrames + 1";
_skippedframes = (int) (_skippedframes+1);
RDebugUtils.currentLine=17170510;
 //BA.debugLineNum = 17170510;BA.debugLine="LoopsPerSecond = LoopsPerSecond - 1";
__ref._loopspersecond /*float*/  = (float) (__ref._loopspersecond /*float*/ -1);
 if (true) break;

case 43:
//C
this.state = 44;
;
RDebugUtils.currentLine=17170512;
 //BA.debugLineNum = 17170512;BA.debugLine="LastDrawingTasks.Clear";
__ref._lastdrawingtasks /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=17170513;
 //BA.debugLineNum = 17170513;BA.debugLine="counter = counter + 1";
_counter = (int) (_counter+1);
RDebugUtils.currentLine=17170514;
 //BA.debugLineNum = 17170514;BA.debugLine="If mGame.lblStats.IsInitialized And mGame.lblSta";
if (true) break;

case 44:
//if
this.state = 51;
if (__ref._mgame /*b4a.example.game*/ ._lblstats /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized() && __ref._mgame /*b4a.example.game*/ ._lblstats /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getVisible()) { 
this.state = 46;
}if (true) break;

case 46:
//C
this.state = 47;
RDebugUtils.currentLine=17170515;
 //BA.debugLineNum = 17170515;BA.debugLine="Dim Stats As String = $\"FPS: ${NumberFormat(FPS";
_stats = ("FPS: "+parent.__c.SmartStringFormatter("",(Object)(parent.__c.NumberFormat(__ref._fps /*float*/ ,(int) (0),(int) (0))))+", Time: "+parent.__c.SmartStringFormatter("",(Object)(__ref._convertmillisecondstostring /*String*/ (null,(long) (__ref._gs /*b4a.example.x2utils._x2gamestep*/ .GameTimeMs /*int*/ ))))+"");
RDebugUtils.currentLine=17170516;
 //BA.debugLineNum = 17170516;BA.debugLine="Stats = Stats & $\", Bodies: ${AllBodies.Size},";
_stats = _stats+(", Bodies: "+parent.__c.SmartStringFormatter("",(Object)(_allbodies.getSize()))+", ScreenAABB: ("+parent.__c.SmartStringFormatter("1.1",(Object)(__ref._screenaabb /*anywheresoftware.b4a.objects.B2AABB*/ .getBottomLeft().getX()))+","+parent.__c.SmartStringFormatter("1.1",(Object)(__ref._screenaabb /*anywheresoftware.b4a.objects.B2AABB*/ .getBottomLeft().getY()))+")-("+parent.__c.SmartStringFormatter("1.1",(Object)(__ref._screenaabb /*anywheresoftware.b4a.objects.B2AABB*/ .getTopRight().getX()))+","+parent.__c.SmartStringFormatter("1.1",(Object)(__ref._screenaabb /*anywheresoftware.b4a.objects.B2AABB*/ .getTopRight().getY()))+")");
RDebugUtils.currentLine=17170517;
 //BA.debugLineNum = 17170517;BA.debugLine="If IsDebugDrawEnabled Then";
if (true) break;

case 47:
//if
this.state = 50;
if (__ref._isdebugdrawenabled /*boolean*/ ) { 
this.state = 49;
}if (true) break;

case 49:
//C
this.state = 50;
RDebugUtils.currentLine=17170518;
 //BA.debugLineNum = 17170518;BA.debugLine="Stats = Stats & \", DebugDraw!\"";
_stats = _stats+", DebugDraw!";
 if (true) break;

case 50:
//C
this.state = 51;
;
RDebugUtils.currentLine=17170521;
 //BA.debugLineNum = 17170521;BA.debugLine="Stats = \"DEBUG MODE! \" & Stats";
_stats = "DEBUG MODE! "+_stats;
RDebugUtils.currentLine=17170523;
 //BA.debugLineNum = 17170523;BA.debugLine="mGame.lblStats.Text = Stats";
__ref._mgame /*b4a.example.game*/ ._lblstats /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(_stats));
 if (true) break;

case 51:
//C
this.state = 1;
;
RDebugUtils.currentLine=17170525;
 //BA.debugLineNum = 17170525;BA.debugLine="gs.ShouldDraw = False";
__ref._gs /*b4a.example.x2utils._x2gamestep*/ .ShouldDraw /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=17170530;
 //BA.debugLineNum = 17170530;BA.debugLine="Sleep(Max(SleepTime - (DateTime.Now - StartLoopT";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "x2utils", "mainloop"),(int) (parent.__c.Max(__ref._sleeptime /*int*/ -(parent.__c.DateTime.getNow()-_startlooptime),7)));
this.state = 55;
return;
case 55:
//C
this.state = 1;
;
RDebugUtils.currentLine=17170534;
 //BA.debugLineNum = 17170534;BA.debugLine="LoopsPerSecond = (LoopsPerSecond * 20 + 1000/(Da";
__ref._loopspersecond /*float*/  = (float) ((__ref._loopspersecond /*float*/ *20+1000/(double)(parent.__c.DateTime.getNow()-_startlooptime))/(double)21);
RDebugUtils.currentLine=17170535;
 //BA.debugLineNum = 17170535;BA.debugLine="gs.GameTimeMs = gs.GameTimeMs + TimeStepMs";
__ref._gs /*b4a.example.x2utils._x2gamestep*/ .GameTimeMs /*int*/  = (int) (__ref._gs /*b4a.example.x2utils._x2gamestep*/ .GameTimeMs /*int*/ +__ref._timestepms /*float*/ );
 if (true) break;

case 52:
//C
this.state = -1;
;
RDebugUtils.currentLine=17170537;
 //BA.debugLineNum = 17170537;BA.debugLine="Log($\"*** Exiting MainLoop. MyIndex = ${MyIndex}\"";
parent.__c.LogImpl("917170537",("*** Exiting MainLoop. MyIndex = "+parent.__c.SmartStringFormatter("",(Object)(_myindex))+""),0);
RDebugUtils.currentLine=17170538;
 //BA.debugLineNum = 17170538;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _runfuturetasks(b4a.example.x2utils __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2utils";
if (Debug.shouldDelegate(ba, "runfuturetasks", true))
	 {return ((String) Debug.delegate(ba, "runfuturetasks", null));}
int _i = 0;
b4a.example.x2utils._x2futuretask _ft = null;
RDebugUtils.currentLine=18677760;
 //BA.debugLineNum = 18677760;BA.debugLine="Private Sub RunFutureTasks";
RDebugUtils.currentLine=18677761;
 //BA.debugLineNum = 18677761;BA.debugLine="For i = FutureTasks.Size - 1 To 0 Step - 1";
{
final int step1 = -1;
final int limit1 = (int) (0);
_i = (int) (__ref._futuretasks /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1) ;
for (;_i >= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=18677762;
 //BA.debugLineNum = 18677762;BA.debugLine="Dim ft As X2FutureTask = FutureTasks.Get(i)";
_ft = (b4a.example.x2utils._x2futuretask)(__ref._futuretasks /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=18677763;
 //BA.debugLineNum = 18677763;BA.debugLine="If gs.GameTimeMs >= ft.GameTimeMs Then";
if (__ref._gs /*b4a.example.x2utils._x2gamestep*/ .GameTimeMs /*int*/ >=_ft.GameTimeMs /*int*/ ) { 
RDebugUtils.currentLine=18677764;
 //BA.debugLineNum = 18677764;BA.debugLine="FutureTasks.RemoveAt(i)";
__ref._futuretasks /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_i);
RDebugUtils.currentLine=18677765;
 //BA.debugLineNum = 18677765;BA.debugLine="If ft.Disabled = False Then CallSub2(ft.Callbac";
if (_ft.Disabled /*boolean*/ ==__c.False) { 
__c.CallSubNew2(ba,_ft.Callback /*Object*/ ,_ft.SubName /*String*/ ,(Object)(_ft));};
 }else {
RDebugUtils.currentLine=18677767;
 //BA.debugLineNum = 18677767;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=18677770;
 //BA.debugLineNum = 18677770;BA.debugLine="End Sub";
return "";
}
public String  _removedeletedbodies(b4a.example.x2utils __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2utils";
if (Debug.shouldDelegate(ba, "removedeletedbodies", true))
	 {return ((String) Debug.delegate(ba, "removedeletedbodies", null));}
anywheresoftware.b4a.objects.B2Body _body = null;
b4a.example.x2bodywrapper _bw = null;
RDebugUtils.currentLine=18350080;
 //BA.debugLineNum = 18350080;BA.debugLine="Private Sub RemoveDeletedBodies";
RDebugUtils.currentLine=18350081;
 //BA.debugLineNum = 18350081;BA.debugLine="For Each body As B2Body In gs.BodiesToDelete";
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._gs /*b4a.example.x2utils._x2gamestep*/ .BodiesToDelete /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_body = (anywheresoftware.b4a.objects.B2Body)(group1.Get(index1));
RDebugUtils.currentLine=18350082;
 //BA.debugLineNum = 18350082;BA.debugLine="If body.Tag Is X2BodyWrapper Then";
if (_body.getTag() instanceof b4a.example.x2bodywrapper) { 
RDebugUtils.currentLine=18350083;
 //BA.debugLineNum = 18350083;BA.debugLine="Dim bw As X2BodyWrapper = body.Tag";
_bw = (b4a.example.x2bodywrapper)(_body.getTag());
RDebugUtils.currentLine=18350084;
 //BA.debugLineNum = 18350084;BA.debugLine="bw.Body.Tag = Null";
_bw._body /*anywheresoftware.b4a.objects.B2Body*/ .setTag(__c.Null);
RDebugUtils.currentLine=18350085;
 //BA.debugLineNum = 18350085;BA.debugLine="bw.Body = Null";
_bw._body /*anywheresoftware.b4a.objects.B2Body*/  = (anywheresoftware.b4a.objects.B2Body)(__c.Null);
 };
RDebugUtils.currentLine=18350087;
 //BA.debugLineNum = 18350087;BA.debugLine="mWorld.DestroyBody(body)";
__ref._mworld /*anywheresoftware.b4a.objects.B2World*/ .DestroyBody(_body);
 }
};
RDebugUtils.currentLine=18350089;
 //BA.debugLineNum = 18350089;BA.debugLine="End Sub";
return "";
}
public float  _modfloat(b4a.example.x2utils __ref,float _dividend,float _divisor) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2utils";
if (Debug.shouldDelegate(ba, "modfloat", true))
	 {return ((Float) Debug.delegate(ba, "modfloat", new Object[] {_dividend,_divisor}));}
RDebugUtils.currentLine=19202048;
 //BA.debugLineNum = 19202048;BA.debugLine="Public Sub ModFloat (Dividend As Float, Divisor As";
RDebugUtils.currentLine=19202052;
 //BA.debugLineNum = 19202052;BA.debugLine="Return Dividend Mod Divisor";
if (true) return (float) (_dividend%_divisor);
RDebugUtils.currentLine=19202054;
 //BA.debugLineNum = 19202054;BA.debugLine="End Sub";
return 0f;
}
public String  _removefuturetasks(b4a.example.x2utils __ref,Object _callback,String _subname) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2utils";
if (Debug.shouldDelegate(ba, "removefuturetasks", true))
	 {return ((String) Debug.delegate(ba, "removefuturetasks", new Object[] {_callback,_subname}));}
int _i = 0;
b4a.example.x2utils._x2futuretask _ft = null;
RDebugUtils.currentLine=18874368;
 //BA.debugLineNum = 18874368;BA.debugLine="Public Sub RemoveFutureTasks (Callback As Object,";
RDebugUtils.currentLine=18874369;
 //BA.debugLineNum = 18874369;BA.debugLine="Dim i As Int = 0";
_i = (int) (0);
RDebugUtils.currentLine=18874370;
 //BA.debugLineNum = 18874370;BA.debugLine="Do While i < FutureTasks.Size";
while (_i<__ref._futuretasks /*anywheresoftware.b4a.objects.collections.List*/ .getSize()) {
RDebugUtils.currentLine=18874371;
 //BA.debugLineNum = 18874371;BA.debugLine="Dim ft As X2FutureTask = FutureTasks.Get(i)";
_ft = (b4a.example.x2utils._x2futuretask)(__ref._futuretasks /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=18874372;
 //BA.debugLineNum = 18874372;BA.debugLine="If ft.Callback = Callback And ft.SubName = SubNa";
if ((_ft.Callback /*Object*/ ).equals(_callback) && (_ft.SubName /*String*/ ).equals(_subname)) { 
RDebugUtils.currentLine=18874373;
 //BA.debugLineNum = 18874373;BA.debugLine="FutureTasks.RemoveAt(i)";
__ref._futuretasks /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_i);
RDebugUtils.currentLine=18874374;
 //BA.debugLineNum = 18874374;BA.debugLine="Continue";
if (true) continue;
 };
RDebugUtils.currentLine=18874376;
 //BA.debugLineNum = 18874376;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 }
;
RDebugUtils.currentLine=18874378;
 //BA.debugLineNum = 18874378;BA.debugLine="End Sub";
return "";
}
public String  _updatetimeparameters(b4a.example.x2utils __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2utils";
if (Debug.shouldDelegate(ba, "updatetimeparameters", true))
	 {return ((String) Debug.delegate(ba, "updatetimeparameters", null));}
RDebugUtils.currentLine=17432576;
 //BA.debugLineNum = 17432576;BA.debugLine="Public Sub UpdateTimeParameters";
RDebugUtils.currentLine=17432577;
 //BA.debugLineNum = 17432577;BA.debugLine="TimeStepMs = 1000 / TargetFPS";
__ref._timestepms /*float*/  = (float) (1000/(double)__ref._targetfps /*int*/ );
RDebugUtils.currentLine=17432578;
 //BA.debugLineNum = 17432578;BA.debugLine="Dim SleepTime As Int = TimeStepMs";
_sleeptime = (int) (__ref._timestepms /*float*/ );
RDebugUtils.currentLine=17432579;
 //BA.debugLineNum = 17432579;BA.debugLine="If xui.IsB4A Then SleepTime = SleepTime - 2";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A()) { 
__ref._sleeptime /*int*/  = (int) (__ref._sleeptime /*int*/ -2);};
RDebugUtils.currentLine=17432580;
 //BA.debugLineNum = 17432580;BA.debugLine="If xui.IsB4J Then SleepTime = SleepTime - 1";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()) { 
__ref._sleeptime /*int*/  = (int) (__ref._sleeptime /*int*/ -1);};
RDebugUtils.currentLine=17432581;
 //BA.debugLineNum = 17432581;BA.debugLine="TimeStepMs = TimeStepMs / SlowDownPhysicsScale";
__ref._timestepms /*float*/  = (float) (__ref._timestepms /*float*/ /(double)__ref._slowdownphysicsscale /*float*/ );
RDebugUtils.currentLine=17432582;
 //BA.debugLineNum = 17432582;BA.debugLine="LoopsPerSecond = TargetFPS";
__ref._loopspersecond /*float*/  = (float) (__ref._targetfps /*int*/ );
RDebugUtils.currentLine=17432583;
 //BA.debugLineNum = 17432583;BA.debugLine="End Sub";
return "";
}
public float  _rndfloat(b4a.example.x2utils __ref,float _fromvalue,float _tovalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2utils";
if (Debug.shouldDelegate(ba, "rndfloat", true))
	 {return ((Float) Debug.delegate(ba, "rndfloat", new Object[] {_fromvalue,_tovalue}));}
RDebugUtils.currentLine=19136512;
 //BA.debugLineNum = 19136512;BA.debugLine="Public Sub RndFloat (FromValue As Float, ToValue A";
RDebugUtils.currentLine=19136513;
 //BA.debugLineNum = 19136513;BA.debugLine="Return Rnd(FromValue * 100000, ToValue * 100000)";
if (true) return (float) (__c.Rnd((int) (_fromvalue*100000),(int) (_tovalue*100000))/(double)100000);
RDebugUtils.currentLine=19136514;
 //BA.debugLineNum = 19136514;BA.debugLine="End Sub";
return 0f;
}
}