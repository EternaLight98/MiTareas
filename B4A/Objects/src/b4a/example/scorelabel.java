package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class scorelabel extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.scorelabel");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.scorelabel.class).invoke(this, new Object[] {null});
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
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
public int _currentvalue = 0;
public int _tempvalue = 0;
public String _text = "";
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public String  _base_resize(b4a.example.scorelabel __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="scorelabel";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=10944512;
 //BA.debugLineNum = 10944512;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=10944513;
 //BA.debugLineNum = 10944513;BA.debugLine="xlbl.SetLayoutAnimated(0, 0, 0, Width, Height)";
__ref._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
RDebugUtils.currentLine=10944514;
 //BA.debugLineNum = 10944514;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.scorelabel __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="scorelabel";
RDebugUtils.currentLine=10682368;
 //BA.debugLineNum = 10682368;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=10682369;
 //BA.debugLineNum = 10682369;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=10682370;
 //BA.debugLineNum = 10682370;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=10682371;
 //BA.debugLineNum = 10682371;BA.debugLine="Private mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=10682372;
 //BA.debugLineNum = 10682372;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=10682373;
 //BA.debugLineNum = 10682373;BA.debugLine="Private xlbl As B4XView";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=10682374;
 //BA.debugLineNum = 10682374;BA.debugLine="Private currentValue As Int";
_currentvalue = 0;
RDebugUtils.currentLine=10682375;
 //BA.debugLineNum = 10682375;BA.debugLine="Private tempValue As Int";
_tempvalue = 0;
RDebugUtils.currentLine=10682376;
 //BA.debugLineNum = 10682376;BA.debugLine="Public Text As String = \"Score: \"";
_text = "Score: ";
RDebugUtils.currentLine=10682378;
 //BA.debugLineNum = 10682378;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.example.scorelabel __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="scorelabel";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
RDebugUtils.currentLine=10813440;
 //BA.debugLineNum = 10813440;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=10813441;
 //BA.debugLineNum = 10813441;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=10813442;
 //BA.debugLineNum = 10813442;BA.debugLine="xlbl = Lbl";
__ref._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=10813444;
 //BA.debugLineNum = 10813444;BA.debugLine="xlbl.SetTextAlignment(\"CENTER\", \"LEFT\")";
__ref._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetTextAlignment("CENTER","LEFT");
RDebugUtils.currentLine=10813445;
 //BA.debugLineNum = 10813445;BA.debugLine="mBase.AddView(xlbl, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=10813446;
 //BA.debugLineNum = 10813446;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=10813447;
 //BA.debugLineNum = 10813447;BA.debugLine="setValue(0)";
__ref._setvalue /*String*/ (null,(int) (0));
RDebugUtils.currentLine=10813449;
 //BA.debugLineNum = 10813449;BA.debugLine="End Sub";
return "";
}
public String  _setvalue(b4a.example.scorelabel __ref,int _newvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="scorelabel";
if (Debug.shouldDelegate(ba, "setvalue", true))
	 {return ((String) Debug.delegate(ba, "setvalue", new Object[] {_newvalue}));}
RDebugUtils.currentLine=11010048;
 //BA.debugLineNum = 11010048;BA.debugLine="Public Sub setValue(NewValue As Int)";
RDebugUtils.currentLine=11010049;
 //BA.debugLineNum = 11010049;BA.debugLine="currentValue = NewValue";
__ref._currentvalue /*int*/  = _newvalue;
RDebugUtils.currentLine=11010050;
 //BA.debugLineNum = 11010050;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getbase(b4a.example.scorelabel __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="scorelabel";
if (Debug.shouldDelegate(ba, "getbase", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getbase", null));}
RDebugUtils.currentLine=10878976;
 //BA.debugLineNum = 10878976;BA.debugLine="Public Sub getBase As B4XView";
RDebugUtils.currentLine=10878977;
 //BA.debugLineNum = 10878977;BA.debugLine="Return mBase";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=10878978;
 //BA.debugLineNum = 10878978;BA.debugLine="End Sub";
return null;
}
public int  _getvalue(b4a.example.scorelabel __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="scorelabel";
if (Debug.shouldDelegate(ba, "getvalue", true))
	 {return ((Integer) Debug.delegate(ba, "getvalue", null));}
RDebugUtils.currentLine=11075584;
 //BA.debugLineNum = 11075584;BA.debugLine="Public Sub getValue As Int";
RDebugUtils.currentLine=11075585;
 //BA.debugLineNum = 11075585;BA.debugLine="Return currentValue";
if (true) return __ref._currentvalue /*int*/ ;
RDebugUtils.currentLine=11075586;
 //BA.debugLineNum = 11075586;BA.debugLine="End Sub";
return 0;
}
public String  _increasescore(b4a.example.scorelabel __ref,int _delta) throws Exception{
__ref = this;
RDebugUtils.currentModule="scorelabel";
if (Debug.shouldDelegate(ba, "increasescore", true))
	 {return ((String) Debug.delegate(ba, "increasescore", new Object[] {_delta}));}
RDebugUtils.currentLine=11141120;
 //BA.debugLineNum = 11141120;BA.debugLine="Public Sub IncreaseScore (Delta As Int)";
RDebugUtils.currentLine=11141121;
 //BA.debugLineNum = 11141121;BA.debugLine="setValue(currentValue + Delta)";
__ref._setvalue /*String*/ (null,(int) (__ref._currentvalue /*int*/ +_delta));
RDebugUtils.currentLine=11141122;
 //BA.debugLineNum = 11141122;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.scorelabel __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="scorelabel";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=10747904;
 //BA.debugLineNum = 10747904;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=10747905;
 //BA.debugLineNum = 10747905;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=10747906;
 //BA.debugLineNum = 10747906;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=10747907;
 //BA.debugLineNum = 10747907;BA.debugLine="End Sub";
return "";
}
public String  _setvaluenow(b4a.example.scorelabel __ref,int _score) throws Exception{
__ref = this;
RDebugUtils.currentModule="scorelabel";
if (Debug.shouldDelegate(ba, "setvaluenow", true))
	 {return ((String) Debug.delegate(ba, "setvaluenow", new Object[] {_score}));}
RDebugUtils.currentLine=11206656;
 //BA.debugLineNum = 11206656;BA.debugLine="Public Sub SetValueNow (score As Int)";
RDebugUtils.currentLine=11206657;
 //BA.debugLineNum = 11206657;BA.debugLine="currentValue = score";
__ref._currentvalue /*int*/  = _score;
RDebugUtils.currentLine=11206658;
 //BA.debugLineNum = 11206658;BA.debugLine="tempValue = score";
__ref._tempvalue /*int*/  = _score;
RDebugUtils.currentLine=11206659;
 //BA.debugLineNum = 11206659;BA.debugLine="xlbl.Text = $\"${Text}$1.0{score}\"$";
__ref._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence((""+__c.SmartStringFormatter("",(Object)(__ref._text /*String*/ ))+""+__c.SmartStringFormatter("1.0",(Object)(_score))+"")));
RDebugUtils.currentLine=11206660;
 //BA.debugLineNum = 11206660;BA.debugLine="End Sub";
return "";
}
public String  _tick(b4a.example.scorelabel __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="scorelabel";
if (Debug.shouldDelegate(ba, "tick", true))
	 {return ((String) Debug.delegate(ba, "tick", null));}
int _dx = 0;
RDebugUtils.currentLine=11272192;
 //BA.debugLineNum = 11272192;BA.debugLine="Public Sub Tick";
RDebugUtils.currentLine=11272193;
 //BA.debugLineNum = 11272193;BA.debugLine="Dim dx As Int = currentValue - tempValue";
_dx = (int) (__ref._currentvalue /*int*/ -__ref._tempvalue /*int*/ );
RDebugUtils.currentLine=11272194;
 //BA.debugLineNum = 11272194;BA.debugLine="If dx <> 0 Then";
if (_dx!=0) { 
RDebugUtils.currentLine=11272195;
 //BA.debugLineNum = 11272195;BA.debugLine="tempValue = tempValue + Ceil(dx / 5)";
__ref._tempvalue /*int*/  = (int) (__ref._tempvalue /*int*/ +__c.Ceil(_dx/(double)5));
 };
RDebugUtils.currentLine=11272197;
 //BA.debugLineNum = 11272197;BA.debugLine="xlbl.Text = $\"${Text}$1.0{tempValue}\"$";
__ref._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence((""+__c.SmartStringFormatter("",(Object)(__ref._text /*String*/ ))+""+__c.SmartStringFormatter("1.0",(Object)(__ref._tempvalue /*int*/ ))+"")));
RDebugUtils.currentLine=11272198;
 //BA.debugLineNum = 11272198;BA.debugLine="End Sub";
return "";
}
}