package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class x2bodywrapper extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.x2bodywrapper");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.x2bodywrapper.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.B2Body _body = null;
public anywheresoftware.b4a.objects.B2World _mworld = null;
public Object _target = null;
public b4a.example.game _mgame = null;
public boolean _isdeleted = false;
public b4a.example.x2utils _x2 = null;
public int _currentframe = 0;
public int _minframe = 0;
public int _numberofframes = 0;
public String _mgraphicname = "";
public Object _delegateto = null;
public boolean _isvisible = false;
public float _timetolivems = 0f;
public int _switchframeintervalms = 0;
public int _lastswitchframetime = 0;
public String _name = "";
public boolean _destroyifinvisible = false;
public int _debugdrawcolor = 0;
public int _starttime = 0;
public boolean _drawlast = false;
public boolean _drawfirst = false;
public boolean _fliphorizontal = false;
public boolean _flipvertical = false;
public int _id = 0;
public boolean _tickifinvisible = false;
public Object _tag = null;
public anywheresoftware.b4a.objects.collections.Map _templatecustomproperties = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public String  _class_globals(b4a.example.x2bodywrapper __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2bodywrapper";
RDebugUtils.currentLine=11337728;
 //BA.debugLineNum = 11337728;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=11337729;
 //BA.debugLineNum = 11337729;BA.debugLine="Public Body As B2Body";
_body = new anywheresoftware.b4a.objects.B2Body();
RDebugUtils.currentLine=11337730;
 //BA.debugLineNum = 11337730;BA.debugLine="Public mWorld As B2World";
_mworld = new anywheresoftware.b4a.objects.B2World();
RDebugUtils.currentLine=11337731;
 //BA.debugLineNum = 11337731;BA.debugLine="Public Target As Object";
_target = new Object();
RDebugUtils.currentLine=11337732;
 //BA.debugLineNum = 11337732;BA.debugLine="Public mGame As Game";
_mgame = new b4a.example.game();
RDebugUtils.currentLine=11337733;
 //BA.debugLineNum = 11337733;BA.debugLine="Public IsDeleted As Boolean";
_isdeleted = false;
RDebugUtils.currentLine=11337734;
 //BA.debugLineNum = 11337734;BA.debugLine="Public X2 As X2Utils";
_x2 = new b4a.example.x2utils();
RDebugUtils.currentLine=11337735;
 //BA.debugLineNum = 11337735;BA.debugLine="Public CurrentFrame As Int";
_currentframe = 0;
RDebugUtils.currentLine=11337736;
 //BA.debugLineNum = 11337736;BA.debugLine="Public MinFrame As Int";
_minframe = 0;
RDebugUtils.currentLine=11337737;
 //BA.debugLineNum = 11337737;BA.debugLine="Public NumberOfFrames As Int";
_numberofframes = 0;
RDebugUtils.currentLine=11337738;
 //BA.debugLineNum = 11337738;BA.debugLine="Private mGraphicName As String";
_mgraphicname = "";
RDebugUtils.currentLine=11337739;
 //BA.debugLineNum = 11337739;BA.debugLine="Public DelegateTo As Object";
_delegateto = new Object();
RDebugUtils.currentLine=11337740;
 //BA.debugLineNum = 11337740;BA.debugLine="Public IsVisible As Boolean";
_isvisible = false;
RDebugUtils.currentLine=11337741;
 //BA.debugLineNum = 11337741;BA.debugLine="Public TimeToLiveMs As Float";
_timetolivems = 0f;
RDebugUtils.currentLine=11337742;
 //BA.debugLineNum = 11337742;BA.debugLine="Public SwitchFrameIntervalMs As Int";
_switchframeintervalms = 0;
RDebugUtils.currentLine=11337743;
 //BA.debugLineNum = 11337743;BA.debugLine="Public LastSwitchFrameTime As Int";
_lastswitchframetime = 0;
RDebugUtils.currentLine=11337744;
 //BA.debugLineNum = 11337744;BA.debugLine="Public Name As String";
_name = "";
RDebugUtils.currentLine=11337745;
 //BA.debugLineNum = 11337745;BA.debugLine="Public DestroyIfInvisible As Boolean = True";
_destroyifinvisible = __c.True;
RDebugUtils.currentLine=11337746;
 //BA.debugLineNum = 11337746;BA.debugLine="Public DebugDrawColor As Int";
_debugdrawcolor = 0;
RDebugUtils.currentLine=11337747;
 //BA.debugLineNum = 11337747;BA.debugLine="Public StartTime As Int";
_starttime = 0;
RDebugUtils.currentLine=11337748;
 //BA.debugLineNum = 11337748;BA.debugLine="Public DrawLast As Boolean";
_drawlast = false;
RDebugUtils.currentLine=11337749;
 //BA.debugLineNum = 11337749;BA.debugLine="Public DrawFirst As Boolean";
_drawfirst = false;
RDebugUtils.currentLine=11337750;
 //BA.debugLineNum = 11337750;BA.debugLine="Public FlipHorizontal As Boolean";
_fliphorizontal = false;
RDebugUtils.currentLine=11337751;
 //BA.debugLineNum = 11337751;BA.debugLine="Public FlipVertical As Boolean";
_flipvertical = false;
RDebugUtils.currentLine=11337752;
 //BA.debugLineNum = 11337752;BA.debugLine="Public Id As Int";
_id = 0;
RDebugUtils.currentLine=11337753;
 //BA.debugLineNum = 11337753;BA.debugLine="Public TickIfInvisible As Boolean";
_tickifinvisible = false;
RDebugUtils.currentLine=11337754;
 //BA.debugLineNum = 11337754;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=11337757;
 //BA.debugLineNum = 11337757;BA.debugLine="Public TemplateCustomProperties As Map";
_templatecustomproperties = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=11337758;
 //BA.debugLineNum = 11337758;BA.debugLine="End Sub";
return "";
}
public b4a.example.bitmapcreator._drawtask  _createdrawtaskbasedoncache(b4a.example.x2bodywrapper __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2bodywrapper";
if (Debug.shouldDelegate(ba, "createdrawtaskbasedoncache", true))
	 {return ((b4a.example.bitmapcreator._drawtask) Debug.delegate(ba, "createdrawtaskbasedoncache", null));}
anywheresoftware.b4a.objects.B2Vec2 _position = null;
RDebugUtils.currentLine=11993088;
 //BA.debugLineNum = 11993088;BA.debugLine="Public Sub CreateDrawTaskBasedOnCache As DrawTask";
RDebugUtils.currentLine=11993089;
 //BA.debugLineNum = 11993089;BA.debugLine="Dim position As B2Vec2 = X2.WorldPointToMainBC(Bo";
_position = __ref._x2 /*b4a.example.x2utils*/ ._worldpointtomainbc /*anywheresoftware.b4a.objects.B2Vec2*/ (null,__ref._body /*anywheresoftware.b4a.objects.B2Body*/ .getPosition().getX(),__ref._body /*anywheresoftware.b4a.objects.B2Body*/ .getPosition().getY());
RDebugUtils.currentLine=11993090;
 //BA.debugLineNum = 11993090;BA.debugLine="Return X2.GraphicCache.GetDrawTask(mGraphicName,";
if (true) return __ref._x2 /*b4a.example.x2utils*/ ._graphiccache /*b4a.example.x2spritegraphiccache*/ ._getdrawtask /*b4a.example.bitmapcreator._drawtask*/ (null,__ref._mgraphicname /*String*/ ,__ref._currentframe /*int*/ ,__ref._x2 /*b4a.example.x2utils*/ ._b2angletodegrees /*int*/ (null,__ref._body /*anywheresoftware.b4a.objects.B2Body*/ .getAngle()),__ref._fliphorizontal /*boolean*/ ,__ref._flipvertical /*boolean*/ ,(int) (_position.getX()),(int) (_position.getY()));
RDebugUtils.currentLine=11993091;
 //BA.debugLineNum = 11993091;BA.debugLine="End Sub";
return null;
}
public String  _delete(b4a.example.x2bodywrapper __ref,b4a.example.x2utils._x2gamestep _gs) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2bodywrapper";
if (Debug.shouldDelegate(ba, "delete", true))
	 {return ((String) Debug.delegate(ba, "delete", new Object[] {_gs}));}
RDebugUtils.currentLine=11534336;
 //BA.debugLineNum = 11534336;BA.debugLine="Public Sub Delete (GS As X2GameStep)";
RDebugUtils.currentLine=11534337;
 //BA.debugLineNum = 11534337;BA.debugLine="If IsDeleted Then Return";
if (__ref._isdeleted /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=11534339;
 //BA.debugLineNum = 11534339;BA.debugLine="Log($\"Deleting body: ${Name}, ${Id}\"$)";
__c.LogImpl("911534339",("Deleting body: "+__c.SmartStringFormatter("",(Object)(__ref._name /*String*/ ))+", "+__c.SmartStringFormatter("",(Object)(__ref._id /*int*/ ))+""),0);
RDebugUtils.currentLine=11534341;
 //BA.debugLineNum = 11534341;BA.debugLine="IsDeleted = True";
__ref._isdeleted /*boolean*/  = __c.True;
RDebugUtils.currentLine=11534342;
 //BA.debugLineNum = 11534342;BA.debugLine="GS.BodiesToDelete.Add(Body)";
_gs.BodiesToDelete /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._body /*anywheresoftware.b4a.objects.B2Body*/ ));
RDebugUtils.currentLine=11534343;
 //BA.debugLineNum = 11534343;BA.debugLine="If mGraphicName.StartsWith(X2.GraphicCache.TempPr";
if (__ref._mgraphicname /*String*/ .startsWith(__ref._x2 /*b4a.example.x2utils*/ ._graphiccache /*b4a.example.x2spritegraphiccache*/ ._tempprefix /*String*/ )) { 
RDebugUtils.currentLine=11534344;
 //BA.debugLineNum = 11534344;BA.debugLine="X2.GraphicCache.RemoveGraphics(mGraphicName)";
__ref._x2 /*b4a.example.x2utils*/ ._graphiccache /*b4a.example.x2spritegraphiccache*/ ._removegraphics /*String*/ (null,__ref._mgraphicname /*String*/ );
 };
RDebugUtils.currentLine=11534346;
 //BA.debugLineNum = 11534346;BA.debugLine="End Sub";
return "";
}
public int  _getcurrenttime(b4a.example.x2bodywrapper __ref,b4a.example.x2utils._x2gamestep _gs) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2bodywrapper";
if (Debug.shouldDelegate(ba, "getcurrenttime", true))
	 {return ((Integer) Debug.delegate(ba, "getcurrenttime", new Object[] {_gs}));}
RDebugUtils.currentLine=11665408;
 //BA.debugLineNum = 11665408;BA.debugLine="Public Sub GetCurrentTime (gs As X2GameStep) As In";
RDebugUtils.currentLine=11665409;
 //BA.debugLineNum = 11665409;BA.debugLine="Return gs.GameTimeMs - StartTime";
if (true) return (int) (_gs.GameTimeMs /*int*/ -__ref._starttime /*int*/ );
RDebugUtils.currentLine=11665410;
 //BA.debugLineNum = 11665410;BA.debugLine="End Sub";
return 0;
}
public String  _getgraphicname(b4a.example.x2bodywrapper __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2bodywrapper";
if (Debug.shouldDelegate(ba, "getgraphicname", true))
	 {return ((String) Debug.delegate(ba, "getgraphicname", null));}
RDebugUtils.currentLine=11862016;
 //BA.debugLineNum = 11862016;BA.debugLine="Public Sub getGraphicName As String";
RDebugUtils.currentLine=11862017;
 //BA.debugLineNum = 11862017;BA.debugLine="Return mGraphicName";
if (true) return __ref._mgraphicname /*String*/ ;
RDebugUtils.currentLine=11862018;
 //BA.debugLineNum = 11862018;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.x2bodywrapper __ref,anywheresoftware.b4a.BA _ba,b4a.example.game _vgame,Object _delegate,String _vname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="x2bodywrapper";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_vgame,_delegate,_vname}));}
RDebugUtils.currentLine=11403264;
 //BA.debugLineNum = 11403264;BA.debugLine="Public Sub Initialize  (vGame As Game, Delegate As";
RDebugUtils.currentLine=11403265;
 //BA.debugLineNum = 11403265;BA.debugLine="DelegateTo = Delegate";
__ref._delegateto /*Object*/  = _delegate;
RDebugUtils.currentLine=11403266;
 //BA.debugLineNum = 11403266;BA.debugLine="mGame = vGame";
__ref._mgame /*b4a.example.game*/  = _vgame;
RDebugUtils.currentLine=11403267;
 //BA.debugLineNum = 11403267;BA.debugLine="X2 = mGame.X2";
__ref._x2 /*b4a.example.x2utils*/  = __ref._mgame /*b4a.example.game*/ ._x2 /*b4a.example.x2utils*/ ;
RDebugUtils.currentLine=11403268;
 //BA.debugLineNum = 11403268;BA.debugLine="mWorld = X2.mWorld";
__ref._mworld /*anywheresoftware.b4a.objects.B2World*/  = __ref._x2 /*b4a.example.x2utils*/ ._mworld /*anywheresoftware.b4a.objects.B2World*/ ;
RDebugUtils.currentLine=11403269;
 //BA.debugLineNum = 11403269;BA.debugLine="Name = vName";
__ref._name /*String*/  = _vname;
RDebugUtils.currentLine=11403270;
 //BA.debugLineNum = 11403270;BA.debugLine="StartTime = X2.gs.GameTimeMs";
__ref._starttime /*int*/  = __ref._x2 /*b4a.example.x2utils*/ ._gs /*b4a.example.x2utils._x2gamestep*/ .GameTimeMs /*int*/ ;
RDebugUtils.currentLine=11403271;
 //BA.debugLineNum = 11403271;BA.debugLine="LastSwitchFrameTime = StartTime";
__ref._lastswitchframetime /*int*/  = __ref._starttime /*int*/ ;
RDebugUtils.currentLine=11403272;
 //BA.debugLineNum = 11403272;BA.debugLine="End Sub";
return "";
}
public String  _setbody(b4a.example.x2bodywrapper __ref,anywheresoftware.b4a.objects.B2Body _vbody) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2bodywrapper";
if (Debug.shouldDelegate(ba, "setbody", true))
	 {return ((String) Debug.delegate(ba, "setbody", new Object[] {_vbody}));}
RDebugUtils.currentLine=11599872;
 //BA.debugLineNum = 11599872;BA.debugLine="Public Sub SetBody (vBody As B2Body)";
RDebugUtils.currentLine=11599873;
 //BA.debugLineNum = 11599873;BA.debugLine="Body = vBody";
__ref._body /*anywheresoftware.b4a.objects.B2Body*/  = _vbody;
RDebugUtils.currentLine=11599874;
 //BA.debugLineNum = 11599874;BA.debugLine="If vBody <> Null Then";
if (_vbody!= null) { 
RDebugUtils.currentLine=11599875;
 //BA.debugLineNum = 11599875;BA.debugLine="vBody.Tag = Me";
_vbody.setTag(this);
 };
RDebugUtils.currentLine=11599877;
 //BA.debugLineNum = 11599877;BA.debugLine="End Sub";
return "";
}
public String  _setgraphicname(b4a.example.x2bodywrapper __ref,String _s) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2bodywrapper";
if (Debug.shouldDelegate(ba, "setgraphicname", true))
	 {return ((String) Debug.delegate(ba, "setgraphicname", new Object[] {_s}));}
RDebugUtils.currentLine=11927552;
 //BA.debugLineNum = 11927552;BA.debugLine="Public Sub setGraphicName (s As String)";
RDebugUtils.currentLine=11927553;
 //BA.debugLineNum = 11927553;BA.debugLine="If mGraphicName = s Then Return";
if ((__ref._mgraphicname /*String*/ ).equals(_s)) { 
if (true) return "";};
RDebugUtils.currentLine=11927554;
 //BA.debugLineNum = 11927554;BA.debugLine="mGraphicName = s";
__ref._mgraphicname /*String*/  = _s;
RDebugUtils.currentLine=11927555;
 //BA.debugLineNum = 11927555;BA.debugLine="NumberOfFrames = X2.GraphicCache.GetGraphicsCount";
__ref._numberofframes /*int*/  = __ref._x2 /*b4a.example.x2utils*/ ._graphiccache /*b4a.example.x2spritegraphiccache*/ ._getgraphicscount /*int*/ (null,__ref._mgraphicname /*String*/ );
RDebugUtils.currentLine=11927556;
 //BA.debugLineNum = 11927556;BA.debugLine="If CurrentFrame >= NumberOfFrames Then CurrentFra";
if (__ref._currentframe /*int*/ >=__ref._numberofframes /*int*/ ) { 
__ref._currentframe /*int*/  = __ref._minframe /*int*/ ;};
RDebugUtils.currentLine=11927557;
 //BA.debugLineNum = 11927557;BA.debugLine="End Sub";
return "";
}
public String  _switchframeifneeded(b4a.example.x2bodywrapper __ref,b4a.example.x2utils._x2gamestep _gs) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2bodywrapper";
if (Debug.shouldDelegate(ba, "switchframeifneeded", true))
	 {return ((String) Debug.delegate(ba, "switchframeifneeded", new Object[] {_gs}));}
RDebugUtils.currentLine=11796480;
 //BA.debugLineNum = 11796480;BA.debugLine="Public Sub SwitchFrameIfNeeded (GS As X2GameStep)";
RDebugUtils.currentLine=11796481;
 //BA.debugLineNum = 11796481;BA.debugLine="If (GS.GameTimeMs - LastSwitchFrameTime) >= Switc";
if ((_gs.GameTimeMs /*int*/ -__ref._lastswitchframetime /*int*/ )>=__ref._switchframeintervalms /*int*/ ) { 
RDebugUtils.currentLine=11796482;
 //BA.debugLineNum = 11796482;BA.debugLine="LastSwitchFrameTime = GS.GameTimeMs";
__ref._lastswitchframetime /*int*/  = _gs.GameTimeMs /*int*/ ;
RDebugUtils.currentLine=11796483;
 //BA.debugLineNum = 11796483;BA.debugLine="CurrentFrame = CurrentFrame + 1";
__ref._currentframe /*int*/  = (int) (__ref._currentframe /*int*/ +1);
RDebugUtils.currentLine=11796484;
 //BA.debugLineNum = 11796484;BA.debugLine="If CurrentFrame >= NumberOfFrames Then CurrentFr";
if (__ref._currentframe /*int*/ >=__ref._numberofframes /*int*/ ) { 
__ref._currentframe /*int*/  = __ref._minframe /*int*/ ;};
 };
RDebugUtils.currentLine=11796486;
 //BA.debugLineNum = 11796486;BA.debugLine="End Sub";
return "";
}
public String  _tick(b4a.example.x2bodywrapper __ref,b4a.example.x2utils._x2gamestep _gs) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2bodywrapper";
if (Debug.shouldDelegate(ba, "tick", true))
	 {return ((String) Debug.delegate(ba, "tick", new Object[] {_gs}));}
RDebugUtils.currentLine=11468800;
 //BA.debugLineNum = 11468800;BA.debugLine="Public Sub Tick (GS As X2GameStep)";
RDebugUtils.currentLine=11468801;
 //BA.debugLineNum = 11468801;BA.debugLine="If IsDeleted Then Return";
if (__ref._isdeleted /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=11468802;
 //BA.debugLineNum = 11468802;BA.debugLine="If DelegateTo <> Null Then";
if (__ref._delegateto /*Object*/ != null) { 
RDebugUtils.currentLine=11468803;
 //BA.debugLineNum = 11468803;BA.debugLine="CallSub2(DelegateTo, \"Tick\", GS)";
__c.CallSubDebug2(ba,__ref._delegateto /*Object*/ ,"Tick",(Object)(_gs));
 }else {
RDebugUtils.currentLine=11468805;
 //BA.debugLineNum = 11468805;BA.debugLine="If (TimeToLiveMs > 0 And (GS.GameTimeMs - StartT";
if ((__ref._timetolivems /*float*/ >0 && (_gs.GameTimeMs /*int*/ -__ref._starttime /*int*/ )>=__ref._timetolivems /*float*/ ) || (__ref._destroyifinvisible /*boolean*/  && __ref._isvisible /*boolean*/ ==__c.False)) { 
RDebugUtils.currentLine=11468807;
 //BA.debugLineNum = 11468807;BA.debugLine="Delete(GS)";
__ref._delete /*String*/ (null,_gs);
RDebugUtils.currentLine=11468808;
 //BA.debugLineNum = 11468808;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=11468810;
 //BA.debugLineNum = 11468810;BA.debugLine="If mGraphicName <> \"\" Then UpdateGraphic (GS, Tr";
if ((__ref._mgraphicname /*String*/ ).equals("") == false) { 
__ref._updategraphic /*String*/ (null,_gs,__c.True);};
 };
RDebugUtils.currentLine=11468812;
 //BA.debugLineNum = 11468812;BA.debugLine="End Sub";
return "";
}
public String  _updategraphic(b4a.example.x2bodywrapper __ref,b4a.example.x2utils._x2gamestep _gs,boolean _increaseframeautomatically) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2bodywrapper";
if (Debug.shouldDelegate(ba, "updategraphic", true))
	 {return ((String) Debug.delegate(ba, "updategraphic", new Object[] {_gs,_increaseframeautomatically}));}
b4a.example.bitmapcreator._drawtask _dt = null;
RDebugUtils.currentLine=11730944;
 //BA.debugLineNum = 11730944;BA.debugLine="Public Sub UpdateGraphic (GS As X2GameStep, Increa";
RDebugUtils.currentLine=11730945;
 //BA.debugLineNum = 11730945;BA.debugLine="If IncreaseFrameAutomatically And SwitchFrameInte";
if (_increaseframeautomatically && __ref._switchframeintervalms /*int*/ >0) { 
__ref._switchframeifneeded /*String*/ (null,_gs);};
RDebugUtils.currentLine=11730946;
 //BA.debugLineNum = 11730946;BA.debugLine="If GS.ShouldDraw And IsVisible Then";
if (_gs.ShouldDraw /*boolean*/  && __ref._isvisible /*boolean*/ ) { 
RDebugUtils.currentLine=11730947;
 //BA.debugLineNum = 11730947;BA.debugLine="Dim dt As DrawTask = CreateDrawTaskBasedOnCache";
_dt = __ref._createdrawtaskbasedoncache /*b4a.example.bitmapcreator._drawtask*/ (null);
RDebugUtils.currentLine=11730948;
 //BA.debugLineNum = 11730948;BA.debugLine="If DrawLast Then";
if (__ref._drawlast /*boolean*/ ) { 
RDebugUtils.currentLine=11730949;
 //BA.debugLineNum = 11730949;BA.debugLine="X2.LastDrawingTasks.Add(dt)";
__ref._x2 /*b4a.example.x2utils*/ ._lastdrawingtasks /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_dt));
 }else 
{RDebugUtils.currentLine=11730950;
 //BA.debugLineNum = 11730950;BA.debugLine="Else if DrawFirst Then";
if (__ref._drawfirst /*boolean*/ ) { 
RDebugUtils.currentLine=11730951;
 //BA.debugLineNum = 11730951;BA.debugLine="GS.DrawingTasks.InsertAt(1, dt) 'after the tran";
_gs.DrawingTasks /*anywheresoftware.b4a.objects.collections.List*/ .InsertAt((int) (1),(Object)(_dt));
 }else {
RDebugUtils.currentLine=11730953;
 //BA.debugLineNum = 11730953;BA.debugLine="GS.DrawingTasks.Add(dt)";
_gs.DrawingTasks /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_dt));
 }}
;
 };
RDebugUtils.currentLine=11730956;
 //BA.debugLineNum = 11730956;BA.debugLine="End Sub";
return "";
}
}