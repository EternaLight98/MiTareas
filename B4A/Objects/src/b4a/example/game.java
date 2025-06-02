package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class game extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.game");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.game.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public b4a.example.x2utils _x2 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B2World _world = null;
public b4a.example.x2bodywrapper _ground = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _ivforeground = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _ivbackground = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblstats = null;
public b4a.example.x2tilemap _tilemap = null;
public String _objectlayer = "";
public anywheresoftware.b4a.objects.B4XViewWrapper _panelfortouch = null;
public b4a.example.x2bodywrapper _car = null;
public anywheresoftware.b4a.objects.B2Vec2 _force = null;
public b4a.example.x2multitouch _multitouch = null;
public b4a.example.x2soundpool _sound = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public String  _initialize(b4a.example.game __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper _parent) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="game";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_parent}));}
float _worldwidth = 0f;
float _worldheight = 0f;
int _tilesize = 0;
b4a.example.x2bodywrapper _front = null;
anywheresoftware.b4a.objects.joints.B2WeldJoint.B2WeldJointDef _weld = null;
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Public Sub Initialize (Parent As B4XView)";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="Parent.LoadLayout(\"GameLayout\")";
_parent.LoadLayout("GameLayout",ba);
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="world.Initialize(\"world\", world.CreateVec2(0, 0))";
__ref._world /*anywheresoftware.b4a.objects.B2World*/ .Initialize(ba,"world",__ref._world /*anywheresoftware.b4a.objects.B2World*/ .CreateVec2((float) (0),(float) (0)));
RDebugUtils.currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="X2.Initialize(Me, ivForeground, world)";
__ref._x2 /*b4a.example.x2utils*/ ._initialize /*String*/ (null,ba,(b4a.example.game)(this),__ref._ivforeground /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__ref._world /*anywheresoftware.b4a.objects.B2World*/ );
RDebugUtils.currentLine=1245188;
 //BA.debugLineNum = 1245188;BA.debugLine="Dim WorldWidth As Float = 10 'meters";
_worldwidth = (float) (10);
RDebugUtils.currentLine=1245189;
 //BA.debugLineNum = 1245189;BA.debugLine="Dim WorldHeight As Float = WorldWidth / 1.333 'sa";
_worldheight = (float) (_worldwidth/(double)1.333);
RDebugUtils.currentLine=1245190;
 //BA.debugLineNum = 1245190;BA.debugLine="X2.ConfigureDimensions(world.CreateVec2(WorldWidt";
__ref._x2 /*b4a.example.x2utils*/ ._configuredimensions /*String*/ (null,__ref._world /*anywheresoftware.b4a.objects.B2World*/ .CreateVec2((float) (_worldwidth/(double)2),(float) (_worldheight/(double)2)),_worldwidth);
RDebugUtils.currentLine=1245193;
 //BA.debugLineNum = 1245193;BA.debugLine="TileMap.Initialize(X2, File.DirAssets, \"hello wor";
__ref._tilemap /*b4a.example.x2tilemap*/ ._initialize /*String*/ (null,ba,__ref._x2 /*b4a.example.x2utils*/ ,__c.File.getDirAssets(),"hello world with background.json",__ref._ivbackground /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=1245195;
 //BA.debugLineNum = 1245195;BA.debugLine="Dim TileSize As Int = Min(X2.MainBC.mWidth / Tile";
_tilesize = (int) (__c.Min(__ref._x2 /*b4a.example.x2utils*/ ._mainbc /*b4a.example.bitmapcreator*/ ._mwidth/(double)__ref._tilemap /*b4a.example.x2tilemap*/ ._tilesperrow /*int*/ ,__ref._x2 /*b4a.example.x2utils*/ ._mainbc /*b4a.example.bitmapcreator*/ ._mheight/(double)__ref._tilemap /*b4a.example.x2tilemap*/ ._tilespercolumn /*int*/ ));
RDebugUtils.currentLine=1245196;
 //BA.debugLineNum = 1245196;BA.debugLine="TileMap.SetSingleTileDimensionsInBCPixels(TileSiz";
__ref._tilemap /*b4a.example.x2tilemap*/ ._setsingletiledimensionsinbcpixels /*String*/ (null,_tilesize,_tilesize);
RDebugUtils.currentLine=1245198;
 //BA.debugLineNum = 1245198;BA.debugLine="SetWorldCenter";
__ref._setworldcenter /*String*/ (null);
RDebugUtils.currentLine=1245199;
 //BA.debugLineNum = 1245199;BA.debugLine="TileMap.PrepareObjectsDef(ObjectLayer)";
__ref._tilemap /*b4a.example.x2tilemap*/ ._prepareobjectsdef /*String*/ (null,__ref._objectlayer /*String*/ );
RDebugUtils.currentLine=1245201;
 //BA.debugLineNum = 1245201;BA.debugLine="TileMap.CreateObject2(ObjectLayer, 9)";
__ref._tilemap /*b4a.example.x2tilemap*/ ._createobject2 /*b4a.example.x2bodywrapper*/ (null,__ref._objectlayer /*String*/ ,(int) (9));
RDebugUtils.currentLine=1245202;
 //BA.debugLineNum = 1245202;BA.debugLine="TileMap.CreateObject2(ObjectLayer, 10)";
__ref._tilemap /*b4a.example.x2tilemap*/ ._createobject2 /*b4a.example.x2bodywrapper*/ (null,__ref._objectlayer /*String*/ ,(int) (10));
RDebugUtils.currentLine=1245204;
 //BA.debugLineNum = 1245204;BA.debugLine="Car = TileMap.CreateObject2ByName(ObjectLayer, \"c";
__ref._car /*b4a.example.x2bodywrapper*/  = __ref._tilemap /*b4a.example.x2tilemap*/ ._createobject2byname /*b4a.example.x2bodywrapper*/ (null,__ref._objectlayer /*String*/ ,"car");
RDebugUtils.currentLine=1245206;
 //BA.debugLineNum = 1245206;BA.debugLine="Dim front As X2BodyWrapper = TileMap.CreateObject";
_front = __ref._tilemap /*b4a.example.x2tilemap*/ ._createobject2byname /*b4a.example.x2bodywrapper*/ (null,__ref._objectlayer /*String*/ ,"car front");
RDebugUtils.currentLine=1245207;
 //BA.debugLineNum = 1245207;BA.debugLine="Dim weld As B2WeldJointDef";
_weld = new anywheresoftware.b4a.objects.joints.B2WeldJoint.B2WeldJointDef();
RDebugUtils.currentLine=1245208;
 //BA.debugLineNum = 1245208;BA.debugLine="weld.Initialize(Car.Body, front.Body, front.Body.";
_weld.Initialize(__ref._car /*b4a.example.x2bodywrapper*/ ._body /*anywheresoftware.b4a.objects.B2Body*/ ,_front._body /*anywheresoftware.b4a.objects.B2Body*/ ,_front._body /*anywheresoftware.b4a.objects.B2Body*/ .getWorldCenter());
RDebugUtils.currentLine=1245209;
 //BA.debugLineNum = 1245209;BA.debugLine="X2.mWorld.CreateJoint(weld)";
__ref._x2 /*b4a.example.x2utils*/ ._mworld /*anywheresoftware.b4a.objects.B2World*/ .CreateJoint((anywheresoftware.b4a.objects.joints.B2Joint.B2JointDef)(_weld));
RDebugUtils.currentLine=1245210;
 //BA.debugLineNum = 1245210;BA.debugLine="force = X2.CreateVec2(0, 0.5)";
__ref._force /*anywheresoftware.b4a.objects.B2Vec2*/  = __ref._x2 /*b4a.example.x2utils*/ ._createvec2 /*anywheresoftware.b4a.objects.B2Vec2*/ (null,(float) (0),(float) (0.5));
RDebugUtils.currentLine=1245211;
 //BA.debugLineNum = 1245211;BA.debugLine="Multitouch.Initialize(B4XPages.MainPage, Array(Pa";
__ref._multitouch /*b4a.example.x2multitouch*/ ._initialize /*String*/ (null,ba,(Object)(_b4xpages._mainpage /*b4a.example.b4xmainpage*/ (ba)),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(__ref._panelfortouch /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject())}));
RDebugUtils.currentLine=1245212;
 //BA.debugLineNum = 1245212;BA.debugLine="sound.Initialize";
__ref._sound /*b4a.example.x2soundpool*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1245213;
 //BA.debugLineNum = 1245213;BA.debugLine="sound.AddSound(\"click\", File.DirAssets, \"click.mp";
__ref._sound /*b4a.example.x2soundpool*/ ._addsound /*String*/ (null,"click",__c.File.getDirAssets(),"click.mp3");
RDebugUtils.currentLine=1245214;
 //BA.debugLineNum = 1245214;BA.debugLine="End Sub";
return "";
}
public String  _resize(b4a.example.game __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="game";
if (Debug.shouldDelegate(ba, "resize", false))
	 {return ((String) Debug.delegate(ba, "resize", null));}
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Public Sub Resize";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="X2.ImageViewResized";
__ref._x2 /*b4a.example.x2utils*/ ._imageviewresized /*String*/ (null);
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="End Sub";
return "";
}
public boolean  _beforetimestep(b4a.example.game __ref,b4a.example.x2utils._x2gamestep _gs) throws Exception{
__ref = this;
RDebugUtils.currentModule="game";
if (Debug.shouldDelegate(ba, "beforetimestep", false))
	 {return ((Boolean) Debug.delegate(ba, "beforetimestep", new Object[] {_gs}));}
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Public Sub BeforeTimeStep (GS As X2GameStep) As Bo";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="End Sub";
return false;
}
public String  _class_globals(b4a.example.game __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="game";
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="Public X2 As X2Utils";
_x2 = new b4a.example.x2utils();
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="Public world As B2World";
_world = new anywheresoftware.b4a.objects.B2World();
RDebugUtils.currentLine=1179652;
 //BA.debugLineNum = 1179652;BA.debugLine="Public Ground As X2BodyWrapper";
_ground = new b4a.example.x2bodywrapper();
RDebugUtils.currentLine=1179653;
 //BA.debugLineNum = 1179653;BA.debugLine="Private ivForeground As B4XView";
_ivforeground = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1179654;
 //BA.debugLineNum = 1179654;BA.debugLine="Private ivBackground As B4XView";
_ivbackground = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1179655;
 //BA.debugLineNum = 1179655;BA.debugLine="Public lblStats As B4XView";
_lblstats = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1179656;
 //BA.debugLineNum = 1179656;BA.debugLine="Public TileMap As X2TileMap";
_tilemap = new b4a.example.x2tilemap();
RDebugUtils.currentLine=1179657;
 //BA.debugLineNum = 1179657;BA.debugLine="Public Const ObjectLayer As String = \"Object Laye";
_objectlayer = "Object Layer 1";
RDebugUtils.currentLine=1179658;
 //BA.debugLineNum = 1179658;BA.debugLine="Private PanelForTouch As B4XView";
_panelfortouch = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1179659;
 //BA.debugLineNum = 1179659;BA.debugLine="Private Car As X2BodyWrapper";
_car = new b4a.example.x2bodywrapper();
RDebugUtils.currentLine=1179660;
 //BA.debugLineNum = 1179660;BA.debugLine="Private force As B2Vec2";
_force = new anywheresoftware.b4a.objects.B2Vec2();
RDebugUtils.currentLine=1179661;
 //BA.debugLineNum = 1179661;BA.debugLine="Private Multitouch As X2MultiTouch";
_multitouch = new b4a.example.x2multitouch();
RDebugUtils.currentLine=1179662;
 //BA.debugLineNum = 1179662;BA.debugLine="Private sound As X2SoundPool";
_sound = new b4a.example.x2soundpool();
RDebugUtils.currentLine=1179663;
 //BA.debugLineNum = 1179663;BA.debugLine="End Sub";
return "";
}
public String  _drawingcomplete(b4a.example.game __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="game";
if (Debug.shouldDelegate(ba, "drawingcomplete", false))
	 {return ((String) Debug.delegate(ba, "drawingcomplete", null));}
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Public Sub DrawingComplete";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="TileMap.DrawingComplete";
__ref._tilemap /*b4a.example.x2tilemap*/ ._drawingcomplete /*String*/ (null);
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="End Sub";
return "";
}
public String  _setworldcenter(b4a.example.game __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="game";
if (Debug.shouldDelegate(ba, "setworldcenter", false))
	 {return ((String) Debug.delegate(ba, "setworldcenter", null));}
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Private Sub SetWorldCenter";
RDebugUtils.currentLine=1310723;
 //BA.debugLineNum = 1310723;BA.debugLine="X2.UpdateWorldCenter(TileMap.MapAABB.Center)";
__ref._x2 /*b4a.example.x2utils*/ ._updateworldcenter /*String*/ (null,__ref._tilemap /*b4a.example.x2tilemap*/ ._mapaabb /*anywheresoftware.b4a.objects.B2AABB*/ .getCenter());
RDebugUtils.currentLine=1310724;
 //BA.debugLineNum = 1310724;BA.debugLine="End Sub";
return "";
}
public String  _tick(b4a.example.game __ref,b4a.example.x2utils._x2gamestep _gs) throws Exception{
__ref = this;
RDebugUtils.currentModule="game";
if (Debug.shouldDelegate(ba, "tick", false))
	 {return ((String) Debug.delegate(ba, "tick", new Object[] {_gs}));}
b4a.example.x2multitouch._x2touch _touch = null;
b4a.example.x2bodywrapper _bw = null;
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Public Sub Tick (GS As X2GameStep)";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="TileMap.DrawScreen(Array(\"Tile Layer 1\"), GS.Draw";
__ref._tilemap /*b4a.example.x2tilemap*/ ._drawscreen /*boolean*/ (null,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("Tile Layer 1")}),_gs.DrawingTasks /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="Dim touch As X2Touch = Multitouch.GetSingleTouch(";
_touch = __ref._multitouch /*b4a.example.x2multitouch*/ ._getsingletouch /*b4a.example.x2multitouch._x2touch*/ (null,__ref._panelfortouch /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=1441795;
 //BA.debugLineNum = 1441795;BA.debugLine="If touch.IsInitialized Then";
if (_touch.IsInitialized /*boolean*/ ) { 
RDebugUtils.currentLine=1441796;
 //BA.debugLineNum = 1441796;BA.debugLine="Car.Body.ApplyForceToCenter(Car.Body.Transform.M";
__ref._car /*b4a.example.x2bodywrapper*/ ._body /*anywheresoftware.b4a.objects.B2Body*/ .ApplyForceToCenter(__ref._car /*b4a.example.x2bodywrapper*/ ._body /*anywheresoftware.b4a.objects.B2Body*/ .getTransform().MultiplyRot(__ref._force /*anywheresoftware.b4a.objects.B2Vec2*/ ));
RDebugUtils.currentLine=1441797;
 //BA.debugLineNum = 1441797;BA.debugLine="If touch.Handled = False Then";
if (_touch.Handled /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=1441799;
 //BA.debugLineNum = 1441799;BA.debugLine="For Each bw As X2BodyWrapper In X2.GetBodiesInt";
{
final anywheresoftware.b4a.BA.IterableList group6 = __ref._x2 /*b4a.example.x2utils*/ ._getbodiesintersectingwithworldpoint /*anywheresoftware.b4a.objects.collections.List*/ (null,__ref._x2 /*b4a.example.x2utils*/ ._screenpointtoworld /*anywheresoftware.b4a.objects.B2Vec2*/ (null,(int) (_touch.X /*float*/ ),(int) (_touch.Y /*float*/ )));
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_bw = (b4a.example.x2bodywrapper)(group6.Get(index6));
RDebugUtils.currentLine=1441800;
 //BA.debugLineNum = 1441800;BA.debugLine="If bw.Name = \"car\" Then";
if ((_bw._name /*String*/ ).equals("car")) { 
RDebugUtils.currentLine=1441801;
 //BA.debugLineNum = 1441801;BA.debugLine="Car.Body.ApplyAngularImpulse(5)";
__ref._car /*b4a.example.x2bodywrapper*/ ._body /*anywheresoftware.b4a.objects.B2Body*/ .ApplyAngularImpulse((float) (5));
RDebugUtils.currentLine=1441802;
 //BA.debugLineNum = 1441802;BA.debugLine="touch.Handled = True";
_touch.Handled /*boolean*/  = __c.True;
RDebugUtils.currentLine=1441803;
 //BA.debugLineNum = 1441803;BA.debugLine="sound.PlaySound(\"click\")";
__ref._sound /*b4a.example.x2soundpool*/ ._playsound /*String*/ (null,"click");
 };
 }
};
 };
 };
RDebugUtils.currentLine=1441808;
 //BA.debugLineNum = 1441808;BA.debugLine="End Sub";
return "";
}
}