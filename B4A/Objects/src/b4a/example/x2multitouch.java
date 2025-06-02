package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class x2multitouch extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.x2multitouch");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.x2multitouch.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _x2touch{
public boolean IsInitialized;
public float X;
public float Y;
public float DownX;
public float DownY;
public boolean Handled;
public boolean FingerUp;
public int EventCounter;
public Object PointerId;
public void Initialize() {
IsInitialized = true;
X = 0f;
Y = 0f;
DownX = 0f;
DownY = 0f;
Handled = false;
FingerUp = false;
EventCounter = 0;
PointerId = new Object();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public b4a.example.b4xset _keys = null;
public anywheresoftware.b4a.objects.collections.Map _viewsfingers = null;
public anywheresoftware.b4a.agraham.gestures.Gestures _gd = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public String  _initialize(b4a.example.x2multitouch __ref,anywheresoftware.b4a.BA _ba,Object _page,anywheresoftware.b4a.objects.collections.List _touchpanels) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="x2multitouch";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_page,_touchpanels}));}
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
RDebugUtils.currentLine=12779520;
 //BA.debugLineNum = 12779520;BA.debugLine="Public Sub Initialize (Page As Object, TouchPanels";
RDebugUtils.currentLine=12779521;
 //BA.debugLineNum = 12779521;BA.debugLine="Keys.Initialize";
__ref._keys /*b4a.example.b4xset*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=12779522;
 //BA.debugLineNum = 12779522;BA.debugLine="ViewsFingers.Initialize";
__ref._viewsfingers /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=12779524;
 //BA.debugLineNum = 12779524;BA.debugLine="If TouchPanels.IsInitialized Then";
if (_touchpanels.IsInitialized()) { 
RDebugUtils.currentLine=12779525;
 //BA.debugLineNum = 12779525;BA.debugLine="For Each v As B4XView In TouchPanels";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group4 = _touchpanels;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group4.Get(index4)));
RDebugUtils.currentLine=12779526;
 //BA.debugLineNum = 12779526;BA.debugLine="gd.SetOnTouchListener(v, \"Gestures_Touch\")";
__ref._gd /*anywheresoftware.b4a.agraham.gestures.Gestures*/ .SetOnTouchListener(ba,(android.view.View)(_v.getObject()),"Gestures_Touch");
 }
};
 };
RDebugUtils.currentLine=12779540;
 //BA.debugLineNum = 12779540;BA.debugLine="End Sub";
return "";
}
public b4a.example.x2multitouch._x2touch  _getsingletouch(b4a.example.x2multitouch __ref,anywheresoftware.b4a.objects.B4XViewWrapper _panel) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2multitouch";
if (Debug.shouldDelegate(ba, "getsingletouch", true))
	 {return ((b4a.example.x2multitouch._x2touch) Debug.delegate(ba, "getsingletouch", new Object[] {_panel}));}
anywheresoftware.b4a.objects.collections.List _t = null;
b4a.example.x2multitouch._x2touch _touch = null;
RDebugUtils.currentLine=12976128;
 //BA.debugLineNum = 12976128;BA.debugLine="Public Sub GetSingleTouch(Panel As B4XView) As X2T";
RDebugUtils.currentLine=12976129;
 //BA.debugLineNum = 12976129;BA.debugLine="Dim t As List = GetTouches(Panel)";
_t = new anywheresoftware.b4a.objects.collections.List();
_t = __ref._gettouches /*anywheresoftware.b4a.objects.collections.List*/ (null,_panel);
RDebugUtils.currentLine=12976130;
 //BA.debugLineNum = 12976130;BA.debugLine="If t.Size > 0 Then Return t.Get(0)";
if (_t.getSize()>0) { 
if (true) return (b4a.example.x2multitouch._x2touch)(_t.Get((int) (0)));};
RDebugUtils.currentLine=12976131;
 //BA.debugLineNum = 12976131;BA.debugLine="Dim touch As X2Touch";
_touch = new b4a.example.x2multitouch._x2touch();
RDebugUtils.currentLine=12976132;
 //BA.debugLineNum = 12976132;BA.debugLine="Return touch";
if (true) return _touch;
RDebugUtils.currentLine=12976133;
 //BA.debugLineNum = 12976133;BA.debugLine="End Sub";
return null;
}
public String  _b4idelegatemultitouchevent(b4a.example.x2multitouch __ref,anywheresoftware.b4a.objects.B4XViewWrapper _pnl,int _action,Object _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2multitouch";
if (Debug.shouldDelegate(ba, "b4idelegatemultitouchevent", true))
	 {return ((String) Debug.delegate(ba, "b4idelegatemultitouchevent", new Object[] {_pnl,_action,_data}));}
RDebugUtils.currentLine=13041664;
 //BA.debugLineNum = 13041664;BA.debugLine="Public Sub B4iDelegateMultitouchEvent(pnl As B4XVi";
RDebugUtils.currentLine=13041686;
 //BA.debugLineNum = 13041686;BA.debugLine="End Sub";
return "";
}
public String  _b4jdelegatetouchevent(b4a.example.x2multitouch __ref,anywheresoftware.b4a.objects.B4XViewWrapper _pnl,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2multitouch";
if (Debug.shouldDelegate(ba, "b4jdelegatetouchevent", true))
	 {return ((String) Debug.delegate(ba, "b4jdelegatetouchevent", new Object[] {_pnl,_action,_x,_y}));}
RDebugUtils.currentLine=13107200;
 //BA.debugLineNum = 13107200;BA.debugLine="Public Sub B4JDelegateTouchEvent (pnl As B4XView,";
RDebugUtils.currentLine=13107219;
 //BA.debugLineNum = 13107219;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.x2multitouch __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2multitouch";
RDebugUtils.currentLine=12713984;
 //BA.debugLineNum = 12713984;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=12713985;
 //BA.debugLineNum = 12713985;BA.debugLine="Type X2Touch (X As Float, Y As Float, DownX As Fl";
;
RDebugUtils.currentLine=12713986;
 //BA.debugLineNum = 12713986;BA.debugLine="Public Keys As B4XSet";
_keys = new b4a.example.b4xset();
RDebugUtils.currentLine=12713987;
 //BA.debugLineNum = 12713987;BA.debugLine="Private ViewsFingers As Map";
_viewsfingers = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=12713991;
 //BA.debugLineNum = 12713991;BA.debugLine="Private gd As Gestures";
_gd = new anywheresoftware.b4a.agraham.gestures.Gestures();
RDebugUtils.currentLine=12713995;
 //BA.debugLineNum = 12713995;BA.debugLine="End Sub";
return "";
}
public b4a.example.x2multitouch._x2touch  _createx2touch(b4a.example.x2multitouch __ref,float _x,float _y,Object _pid) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2multitouch";
if (Debug.shouldDelegate(ba, "createx2touch", true))
	 {return ((b4a.example.x2multitouch._x2touch) Debug.delegate(ba, "createx2touch", new Object[] {_x,_y,_pid}));}
b4a.example.x2multitouch._x2touch _t1 = null;
RDebugUtils.currentLine=13238272;
 //BA.debugLineNum = 13238272;BA.debugLine="Private Sub CreateX2Touch (X As Float, Y As Float,";
RDebugUtils.currentLine=13238273;
 //BA.debugLineNum = 13238273;BA.debugLine="Dim t1 As X2Touch";
_t1 = new b4a.example.x2multitouch._x2touch();
RDebugUtils.currentLine=13238274;
 //BA.debugLineNum = 13238274;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=13238275;
 //BA.debugLineNum = 13238275;BA.debugLine="t1.X = X";
_t1.X /*float*/  = _x;
RDebugUtils.currentLine=13238276;
 //BA.debugLineNum = 13238276;BA.debugLine="t1.Y = Y";
_t1.Y /*float*/  = _y;
RDebugUtils.currentLine=13238277;
 //BA.debugLineNum = 13238277;BA.debugLine="t1.DownX = X";
_t1.DownX /*float*/  = _x;
RDebugUtils.currentLine=13238278;
 //BA.debugLineNum = 13238278;BA.debugLine="t1.DownY = y";
_t1.DownY /*float*/  = _y;
RDebugUtils.currentLine=13238279;
 //BA.debugLineNum = 13238279;BA.debugLine="t1.PointerId = pid";
_t1.PointerId /*Object*/  = _pid;
RDebugUtils.currentLine=13238280;
 //BA.debugLineNum = 13238280;BA.debugLine="t1.EventCounter = -1";
_t1.EventCounter /*int*/  = (int) (-1);
RDebugUtils.currentLine=13238281;
 //BA.debugLineNum = 13238281;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=13238282;
 //BA.debugLineNum = 13238282;BA.debugLine="End Sub";
return null;
}
public boolean  _gestures_touch(b4a.example.x2multitouch __ref,Object _view,int _pointerid,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2multitouch";
if (Debug.shouldDelegate(ba, "gestures_touch", true))
	 {return ((Boolean) Debug.delegate(ba, "gestures_touch", new Object[] {_view,_pointerid,_action,_x,_y}));}
anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
anywheresoftware.b4a.objects.collections.Map _fingers = null;
String _newpointerid = "";
b4a.example.x2multitouch._x2touch _touch = null;
int _id = 0;
RDebugUtils.currentLine=13172736;
 //BA.debugLineNum = 13172736;BA.debugLine="Private Sub Gestures_Touch(View As Object, Pointer";
RDebugUtils.currentLine=13172737;
 //BA.debugLineNum = 13172737;BA.debugLine="Dim pnl As B4XView = Sender";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
RDebugUtils.currentLine=13172738;
 //BA.debugLineNum = 13172738;BA.debugLine="If ViewsFingers.ContainsKey(pnl) = False Then";
if (__ref._viewsfingers /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_pnl.getObject()))==__c.False) { 
RDebugUtils.currentLine=13172739;
 //BA.debugLineNum = 13172739;BA.debugLine="ViewsFingers.Put(pnl, CreateMap())";
__ref._viewsfingers /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_pnl.getObject()),(Object)(__c.createMap(new Object[] {}).getObject()));
 };
RDebugUtils.currentLine=13172741;
 //BA.debugLineNum = 13172741;BA.debugLine="Dim fingers As Map = ViewsFingers.Get(pnl)";
_fingers = new anywheresoftware.b4a.objects.collections.Map();
_fingers = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._viewsfingers /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_pnl.getObject()))));
RDebugUtils.currentLine=13172742;
 //BA.debugLineNum = 13172742;BA.debugLine="Select Action";
switch (BA.switchObjectToInt(_action,__ref._gd /*anywheresoftware.b4a.agraham.gestures.Gestures*/ .ACTION_DOWN,__ref._gd /*anywheresoftware.b4a.agraham.gestures.Gestures*/ .ACTION_POINTER_DOWN,__ref._gd /*anywheresoftware.b4a.agraham.gestures.Gestures*/ .ACTION_POINTER_UP,__ref._gd /*anywheresoftware.b4a.agraham.gestures.Gestures*/ .ACTION_UP)) {
case 0: 
case 1: {
RDebugUtils.currentLine=13172745;
 //BA.debugLineNum = 13172745;BA.debugLine="NewPointerId = PointerID";
_newpointerid = BA.NumberToString(_pointerid);
RDebugUtils.currentLine=13172746;
 //BA.debugLineNum = 13172746;BA.debugLine="fingers.Put(PointerID, CreateX2Touch(X, Y, Poin";
_fingers.Put((Object)(_pointerid),(Object)(__ref._createx2touch /*b4a.example.x2multitouch._x2touch*/ (null,_x,_y,(Object)(_pointerid))));
 break; }
case 2: 
case 3: {
RDebugUtils.currentLine=13172748;
 //BA.debugLineNum = 13172748;BA.debugLine="If fingers.ContainsKey(PointerID) Then";
if (_fingers.ContainsKey((Object)(_pointerid))) { 
RDebugUtils.currentLine=13172749;
 //BA.debugLineNum = 13172749;BA.debugLine="Dim touch As X2Touch = fingers.Get(PointerID)";
_touch = (b4a.example.x2multitouch._x2touch)(_fingers.Get((Object)(_pointerid)));
RDebugUtils.currentLine=13172750;
 //BA.debugLineNum = 13172750;BA.debugLine="touch.FingerUp = True";
_touch.FingerUp /*boolean*/  = __c.True;
 };
 break; }
}
;
RDebugUtils.currentLine=13172753;
 //BA.debugLineNum = 13172753;BA.debugLine="For Each id As Int In fingers.Keys";
{
final anywheresoftware.b4a.BA.IterableList group16 = _fingers.Keys();
final int groupLen16 = group16.getSize()
;int index16 = 0;
;
for (; index16 < groupLen16;index16++){
_id = (int)(BA.ObjectToNumber(group16.Get(index16)));
RDebugUtils.currentLine=13172754;
 //BA.debugLineNum = 13172754;BA.debugLine="Dim touch As X2Touch = fingers.Get(id)";
_touch = (b4a.example.x2multitouch._x2touch)(_fingers.Get((Object)(_id)));
RDebugUtils.currentLine=13172755;
 //BA.debugLineNum = 13172755;BA.debugLine="touch.X = gd.GetX(id)";
_touch.X /*float*/  = __ref._gd /*anywheresoftware.b4a.agraham.gestures.Gestures*/ .GetX(_id);
RDebugUtils.currentLine=13172756;
 //BA.debugLineNum = 13172756;BA.debugLine="touch.Y = gd.GetY(id)";
_touch.Y /*float*/  = __ref._gd /*anywheresoftware.b4a.agraham.gestures.Gestures*/ .GetY(_id);
 }
};
RDebugUtils.currentLine=13172758;
 //BA.debugLineNum = 13172758;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=13172759;
 //BA.debugLineNum = 13172759;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.objects.collections.List  _gettouches(b4a.example.x2multitouch __ref,anywheresoftware.b4a.objects.B4XViewWrapper _panel) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2multitouch";
if (Debug.shouldDelegate(ba, "gettouches", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "gettouches", new Object[] {_panel}));}
anywheresoftware.b4a.objects.collections.List _res = null;
anywheresoftware.b4a.objects.collections.Map _fingers = null;
b4a.example.x2multitouch._x2touch _touch = null;
RDebugUtils.currentLine=12910592;
 //BA.debugLineNum = 12910592;BA.debugLine="Public Sub GetTouches (Panel As B4XView) As List";
RDebugUtils.currentLine=12910593;
 //BA.debugLineNum = 12910593;BA.debugLine="Dim Res As List";
_res = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=12910594;
 //BA.debugLineNum = 12910594;BA.debugLine="Res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=12910595;
 //BA.debugLineNum = 12910595;BA.debugLine="If ViewsFingers.ContainsKey(Panel) = False Then";
if (__ref._viewsfingers /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_panel.getObject()))==__c.False) { 
RDebugUtils.currentLine=12910596;
 //BA.debugLineNum = 12910596;BA.debugLine="Return Res";
if (true) return _res;
 };
RDebugUtils.currentLine=12910598;
 //BA.debugLineNum = 12910598;BA.debugLine="Dim fingers As Map = ViewsFingers.Get(Panel)";
_fingers = new anywheresoftware.b4a.objects.collections.Map();
_fingers = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._viewsfingers /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_panel.getObject()))));
RDebugUtils.currentLine=12910599;
 //BA.debugLineNum = 12910599;BA.debugLine="For Each touch As X2Touch In fingers.Values";
{
final anywheresoftware.b4a.BA.IterableList group7 = _fingers.Values();
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_touch = (b4a.example.x2multitouch._x2touch)(group7.Get(index7));
RDebugUtils.currentLine=12910600;
 //BA.debugLineNum = 12910600;BA.debugLine="Res.Add(touch)";
_res.Add((Object)(_touch));
 }
};
RDebugUtils.currentLine=12910602;
 //BA.debugLineNum = 12910602;BA.debugLine="For Each touch As X2Touch In Res";
{
final anywheresoftware.b4a.BA.IterableList group10 = _res;
final int groupLen10 = group10.getSize()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_touch = (b4a.example.x2multitouch._x2touch)(group10.Get(index10));
RDebugUtils.currentLine=12910603;
 //BA.debugLineNum = 12910603;BA.debugLine="If touch.FingerUp Then fingers.Remove(touch.Poin";
if (_touch.FingerUp /*boolean*/ ) { 
_fingers.Remove(_touch.PointerId /*Object*/ );};
RDebugUtils.currentLine=12910604;
 //BA.debugLineNum = 12910604;BA.debugLine="touch.EventCounter = touch.EventCounter + 1";
_touch.EventCounter /*int*/  = (int) (_touch.EventCounter /*int*/ +1);
 }
};
RDebugUtils.currentLine=12910606;
 //BA.debugLineNum = 12910606;BA.debugLine="Return Res";
if (true) return _res;
RDebugUtils.currentLine=12910607;
 //BA.debugLineNum = 12910607;BA.debugLine="End Sub";
return null;
}
public String  _resetstate(b4a.example.x2multitouch __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2multitouch";
if (Debug.shouldDelegate(ba, "resetstate", true))
	 {return ((String) Debug.delegate(ba, "resetstate", null));}
RDebugUtils.currentLine=12845056;
 //BA.debugLineNum = 12845056;BA.debugLine="Public Sub ResetState";
RDebugUtils.currentLine=12845057;
 //BA.debugLineNum = 12845057;BA.debugLine="Keys.Clear";
__ref._keys /*b4a.example.b4xset*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=12845058;
 //BA.debugLineNum = 12845058;BA.debugLine="ViewsFingers.Clear";
__ref._viewsfingers /*anywheresoftware.b4a.objects.collections.Map*/ .Clear();
RDebugUtils.currentLine=12845059;
 //BA.debugLineNum = 12845059;BA.debugLine="End Sub";
return "";
}
}