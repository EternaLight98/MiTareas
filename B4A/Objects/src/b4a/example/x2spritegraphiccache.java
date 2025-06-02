package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class x2spritegraphiccache extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.x2spritegraphiccache");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.x2spritegraphiccache.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _x2spritegraphicdata{
public boolean IsInitialized;
public String Name;
public anywheresoftware.b4a.objects.collections.List MapsOfCompressedBCs;
public boolean AntiAlias;
public int AngleInterval;
public anywheresoftware.b4a.objects.collections.List OriginalBCs;
public int SizeOfAllCompressed;
public long LastUsed;
public boolean VerticalSymmetry;
public boolean HorizontalSymmetry;
public void Initialize() {
IsInitialized = true;
Name = "";
MapsOfCompressedBCs = new anywheresoftware.b4a.objects.collections.List();
AntiAlias = false;
AngleInterval = 0;
OriginalBCs = new anywheresoftware.b4a.objects.collections.List();
SizeOfAllCompressed = 0;
LastUsed = 0L;
VerticalSymmetry = false;
HorizontalSymmetry = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.collections.Map _cache = null;
public anywheresoftware.b4a.objects.B4XCanvas[] _cvs = null;
public anywheresoftware.b4a.objects.B4XViewWrapper[] _cvspanel = null;
public b4a.example.bitmapcreator[] _cvsproxy = null;
public int _max_size_for_antialias = 0;
public b4a.example.bitmapcreator _workingspace = null;
public b4a.example.x2utils _x2 = null;
public int _max_size_of_all_compressedbcs = 0;
public int _totalsize = 0;
public anywheresoftware.b4a.objects.B2Transform _transform = null;
public anywheresoftware.b4a.objects.B2Shape.B2PolygonShape _rectshape = null;
public anywheresoftware.b4a.objects.B2AABB _outputaabb = null;
public int _tempid = 0;
public String _tempprefix = "";
public b4a.example.bitmapcreator._internalcompressedbccache _cbccache = null;
public b4a.example.bitmapcreator._internalantialiasingbuffer _aabuffer = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.bitmapcreator._drawtask  _getdrawtask(b4a.example.x2spritegraphiccache __ref,String _name,int _index,int _degrees,boolean _fliph,boolean _flipv,int _targetx,int _targety) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2spritegraphiccache";
if (Debug.shouldDelegate(ba, "getdrawtask", true))
	 {return ((b4a.example.bitmapcreator._drawtask) Debug.delegate(ba, "getdrawtask", new Object[] {_name,_index,_degrees,_fliph,_flipv,_targetx,_targety}));}
b4a.example.bitmapcreator._compressedbc _sprite = null;
b4a.example.bitmapcreator._drawtask _dt = null;
RDebugUtils.currentLine=14680064;
 //BA.debugLineNum = 14680064;BA.debugLine="Public Sub GetDrawTask (Name As String, Index As I";
RDebugUtils.currentLine=14680065;
 //BA.debugLineNum = 14680065;BA.debugLine="Dim sprite As CompressedBC = GetGraphic2(Name, In";
_sprite = __ref._getgraphic2 /*b4a.example.bitmapcreator._compressedbc*/ (null,_name,_index,_degrees,_fliph,_flipv);
RDebugUtils.currentLine=14680066;
 //BA.debugLineNum = 14680066;BA.debugLine="Dim dt As DrawTask = WorkingSpace.CreateDrawTask(";
_dt = __ref._workingspace /*b4a.example.bitmapcreator*/ ._createdrawtask((Object)(_sprite),(anywheresoftware.b4a.objects.B4XCanvas.B4XRect)(__c.Null),(int) (0),(int) (0),__c.False);
RDebugUtils.currentLine=14680067;
 //BA.debugLineNum = 14680067;BA.debugLine="dt.TargetX = TargetX - sprite.mWidth / 2";
_dt.TargetX = (int) (_targetx-_sprite.mWidth/(double)2);
RDebugUtils.currentLine=14680068;
 //BA.debugLineNum = 14680068;BA.debugLine="dt.TargetY = TargetY - sprite.mHeight / 2";
_dt.TargetY = (int) (_targety-_sprite.mHeight/(double)2);
RDebugUtils.currentLine=14680069;
 //BA.debugLineNum = 14680069;BA.debugLine="dt.SrcRect = sprite.TargetRect";
_dt.SrcRect = _sprite.TargetRect;
RDebugUtils.currentLine=14680070;
 //BA.debugLineNum = 14680070;BA.debugLine="dt.IsCompressedSource = True";
_dt.IsCompressedSource = __c.True;
RDebugUtils.currentLine=14680071;
 //BA.debugLineNum = 14680071;BA.debugLine="Return dt";
if (true) return _dt;
RDebugUtils.currentLine=14680072;
 //BA.debugLineNum = 14680072;BA.debugLine="End Sub";
return null;
}
public String  _removegraphics(b4a.example.x2spritegraphiccache __ref,String _name) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2spritegraphiccache";
if (Debug.shouldDelegate(ba, "removegraphics", true))
	 {return ((String) Debug.delegate(ba, "removegraphics", new Object[] {_name}));}
b4a.example.x2spritegraphiccache._x2spritegraphicdata _data = null;
RDebugUtils.currentLine=14614528;
 //BA.debugLineNum = 14614528;BA.debugLine="Public Sub RemoveGraphics (Name As String)";
RDebugUtils.currentLine=14614530;
 //BA.debugLineNum = 14614530;BA.debugLine="Log(\"Remove graphic: \" & Name)";
__c.LogImpl("914614530","Remove graphic: "+_name,0);
RDebugUtils.currentLine=14614532;
 //BA.debugLineNum = 14614532;BA.debugLine="Dim data As X2SpriteGraphicData = cache.Get(Name.";
_data = (b4a.example.x2spritegraphiccache._x2spritegraphicdata)(__ref._cache /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_name.toLowerCase())));
RDebugUtils.currentLine=14614533;
 //BA.debugLineNum = 14614533;BA.debugLine="TotalSize = TotalSize - data.SizeOfAllCompressed";
__ref._totalsize /*int*/  = (int) (__ref._totalsize /*int*/ -_data.SizeOfAllCompressed /*int*/ );
RDebugUtils.currentLine=14614534;
 //BA.debugLineNum = 14614534;BA.debugLine="cache.Remove(Name.ToLowerCase)";
__ref._cache /*anywheresoftware.b4a.objects.collections.Map*/ .Remove((Object)(_name.toLowerCase()));
RDebugUtils.currentLine=14614535;
 //BA.debugLineNum = 14614535;BA.debugLine="End Sub";
return "";
}
public int  _getgraphicscount(b4a.example.x2spritegraphiccache __ref,String _name) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2spritegraphiccache";
if (Debug.shouldDelegate(ba, "getgraphicscount", true))
	 {return ((Integer) Debug.delegate(ba, "getgraphicscount", new Object[] {_name}));}
b4a.example.x2spritegraphiccache._x2spritegraphicdata _data = null;
RDebugUtils.currentLine=14090240;
 //BA.debugLineNum = 14090240;BA.debugLine="Public Sub GetGraphicsCount(Name As String) As Int";
RDebugUtils.currentLine=14090241;
 //BA.debugLineNum = 14090241;BA.debugLine="Dim data As X2SpriteGraphicData = cache.Get(Name.";
_data = (b4a.example.x2spritegraphiccache._x2spritegraphicdata)(__ref._cache /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_name.toLowerCase())));
RDebugUtils.currentLine=14090242;
 //BA.debugLineNum = 14090242;BA.debugLine="If data = Null Then Return 0";
if (_data== null) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=14090243;
 //BA.debugLineNum = 14090243;BA.debugLine="Return data.OriginalBCs.Size";
if (true) return _data.OriginalBCs /*anywheresoftware.b4a.objects.collections.List*/ .getSize();
RDebugUtils.currentLine=14090244;
 //BA.debugLineNum = 14090244;BA.debugLine="End Sub";
return 0;
}
public String  _class_globals(b4a.example.x2spritegraphiccache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2spritegraphiccache";
RDebugUtils.currentLine=13762560;
 //BA.debugLineNum = 13762560;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=13762561;
 //BA.debugLineNum = 13762561;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=13762562;
 //BA.debugLineNum = 13762562;BA.debugLine="Private cache As Map";
_cache = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=13762563;
 //BA.debugLineNum = 13762563;BA.debugLine="Type X2SpriteGraphicData (Name As String, MapsOfC";
;
RDebugUtils.currentLine=13762565;
 //BA.debugLineNum = 13762565;BA.debugLine="Private CVS(6) As B4XCanvas";
_cvs = new anywheresoftware.b4a.objects.B4XCanvas[(int) (6)];
{
int d0 = _cvs.length;
for (int i0 = 0;i0 < d0;i0++) {
_cvs[i0] = new anywheresoftware.b4a.objects.B4XCanvas();
}
}
;
RDebugUtils.currentLine=13762566;
 //BA.debugLineNum = 13762566;BA.debugLine="Private CVSPanel(6) As B4XView";
_cvspanel = new anywheresoftware.b4a.objects.B4XViewWrapper[(int) (6)];
{
int d0 = _cvspanel.length;
for (int i0 = 0;i0 < d0;i0++) {
_cvspanel[i0] = new anywheresoftware.b4a.objects.B4XViewWrapper();
}
}
;
RDebugUtils.currentLine=13762567;
 //BA.debugLineNum = 13762567;BA.debugLine="Private CVSProxy(6) As BitmapCreator";
_cvsproxy = new b4a.example.bitmapcreator[(int) (6)];
{
int d0 = _cvsproxy.length;
for (int i0 = 0;i0 < d0;i0++) {
_cvsproxy[i0] = new b4a.example.bitmapcreator();
}
}
;
RDebugUtils.currentLine=13762568;
 //BA.debugLineNum = 13762568;BA.debugLine="Public MAX_SIZE_FOR_ANTIALIAS As Int = 300";
_max_size_for_antialias = (int) (300);
RDebugUtils.currentLine=13762569;
 //BA.debugLineNum = 13762569;BA.debugLine="Private WorkingSpace As BitmapCreator";
_workingspace = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=13762570;
 //BA.debugLineNum = 13762570;BA.debugLine="Private X2 As X2Utils";
_x2 = new b4a.example.x2utils();
RDebugUtils.currentLine=13762571;
 //BA.debugLineNum = 13762571;BA.debugLine="Private MAX_SIZE_OF_ALL_COMPRESSEDBCS As Int = 30";
_max_size_of_all_compressedbcs = (int) (30*1024*1024);
RDebugUtils.currentLine=13762572;
 //BA.debugLineNum = 13762572;BA.debugLine="Private TotalSize As Int";
_totalsize = 0;
RDebugUtils.currentLine=13762573;
 //BA.debugLineNum = 13762573;BA.debugLine="Private Transform As B2Transform";
_transform = new anywheresoftware.b4a.objects.B2Transform();
RDebugUtils.currentLine=13762574;
 //BA.debugLineNum = 13762574;BA.debugLine="Private RectShape As B2PolygonShape";
_rectshape = new anywheresoftware.b4a.objects.B2Shape.B2PolygonShape();
RDebugUtils.currentLine=13762575;
 //BA.debugLineNum = 13762575;BA.debugLine="Private OutputAABB As B2AABB";
_outputaabb = new anywheresoftware.b4a.objects.B2AABB();
RDebugUtils.currentLine=13762576;
 //BA.debugLineNum = 13762576;BA.debugLine="Private TempId As Int";
_tempid = 0;
RDebugUtils.currentLine=13762577;
 //BA.debugLineNum = 13762577;BA.debugLine="Public Const TempPrefix As String = \"~temp\"";
_tempprefix = "~temp";
RDebugUtils.currentLine=13762578;
 //BA.debugLineNum = 13762578;BA.debugLine="Public CBCCache As InternalCompressedBCCache";
_cbccache = new b4a.example.bitmapcreator._internalcompressedbccache();
RDebugUtils.currentLine=13762579;
 //BA.debugLineNum = 13762579;BA.debugLine="Private AABuffer As InternalAntiAliasingBuffer";
_aabuffer = new b4a.example.bitmapcreator._internalantialiasingbuffer();
RDebugUtils.currentLine=13762580;
 //BA.debugLineNum = 13762580;BA.debugLine="End Sub";
return "";
}
public String  _drawbitmapcreatorflipped(b4a.example.x2spritegraphiccache __ref,b4a.example.bitmapcreator _bc,b4a.example.bitmapcreator _source,float _srcscalex,float _srcscaley,anywheresoftware.b4a.objects.B4XCanvas.B4XRect _srcrect1,boolean _fliphorizontally,boolean _flipvertically,boolean _flipdiagonally) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2spritegraphiccache";
if (Debug.shouldDelegate(ba, "drawbitmapcreatorflipped", true))
	 {return ((String) Debug.delegate(ba, "drawbitmapcreatorflipped", new Object[] {_bc,_source,_srcscalex,_srcscaley,_srcrect1,_fliphorizontally,_flipvertically,_flipdiagonally}));}
int _srcrectwidth = 0;
int _srcrectheight = 0;
float _dx = 0f;
float _dy = 0f;
float _startsrcx = 0f;
int _endsrcx = 0;
float _startsrcy = 0f;
int _endsrcy = 0;
int _targetx = 0;
int _targety = 0;
int _targetystart = 0;
int _targetyend = 0;
int _targetxstart = 0;
int _targetxend = 0;
float _srcx = 0f;
float _srcy = 0f;
int _ssrcx = 0;
int _ssrcy = 0;
int _y = 0;
int _x = 0;
RDebugUtils.currentLine=14942208;
 //BA.debugLineNum = 14942208;BA.debugLine="Public Sub DrawBitmapCreatorFlipped (bc As BitmapC";
RDebugUtils.currentLine=14942210;
 //BA.debugLineNum = 14942210;BA.debugLine="Dim SrcRectWidth As Int = SrcRect1.Width";
_srcrectwidth = (int) (_srcrect1.getWidth());
RDebugUtils.currentLine=14942211;
 //BA.debugLineNum = 14942211;BA.debugLine="Dim SrcRectHeight As Int = SrcRect1.Height";
_srcrectheight = (int) (_srcrect1.getHeight());
RDebugUtils.currentLine=14942212;
 //BA.debugLineNum = 14942212;BA.debugLine="Dim dx As Float = 1 / SrcScaleX";
_dx = (float) (1/(double)_srcscalex);
RDebugUtils.currentLine=14942213;
 //BA.debugLineNum = 14942213;BA.debugLine="Dim dy As Float = 1 / SrcScaleY";
_dy = (float) (1/(double)_srcscaley);
RDebugUtils.currentLine=14942214;
 //BA.debugLineNum = 14942214;BA.debugLine="Dim StartSrcX As Float";
_startsrcx = 0f;
RDebugUtils.currentLine=14942215;
 //BA.debugLineNum = 14942215;BA.debugLine="Dim EndSrcX As Int";
_endsrcx = 0;
RDebugUtils.currentLine=14942216;
 //BA.debugLineNum = 14942216;BA.debugLine="Dim StartSrcY As Float";
_startsrcy = 0f;
RDebugUtils.currentLine=14942217;
 //BA.debugLineNum = 14942217;BA.debugLine="Dim EndSrcY As Int";
_endsrcy = 0;
RDebugUtils.currentLine=14942218;
 //BA.debugLineNum = 14942218;BA.debugLine="If FlipDiagonally And FlipHorizontally And FlipVe";
if (_flipdiagonally && _fliphorizontally && _flipvertically==__c.False) { 
RDebugUtils.currentLine=14942219;
 //BA.debugLineNum = 14942219;BA.debugLine="FlipHorizontally = False";
_fliphorizontally = __c.False;
RDebugUtils.currentLine=14942220;
 //BA.debugLineNum = 14942220;BA.debugLine="FlipVertically = True";
_flipvertically = __c.True;
 }else 
{RDebugUtils.currentLine=14942221;
 //BA.debugLineNum = 14942221;BA.debugLine="Else if FlipDiagonally And FlipVertically And Fli";
if (_flipdiagonally && _flipvertically && _fliphorizontally==__c.False) { 
RDebugUtils.currentLine=14942222;
 //BA.debugLineNum = 14942222;BA.debugLine="FlipHorizontally = True";
_fliphorizontally = __c.True;
RDebugUtils.currentLine=14942223;
 //BA.debugLineNum = 14942223;BA.debugLine="FlipVertically = False";
_flipvertically = __c.False;
 }}
;
RDebugUtils.currentLine=14942225;
 //BA.debugLineNum = 14942225;BA.debugLine="If FlipHorizontally Then";
if (_fliphorizontally) { 
RDebugUtils.currentLine=14942226;
 //BA.debugLineNum = 14942226;BA.debugLine="StartSrcX = SrcRect1.Right - dx";
_startsrcx = (float) (_srcrect1.getRight()-_dx);
RDebugUtils.currentLine=14942227;
 //BA.debugLineNum = 14942227;BA.debugLine="EndSrcX = SrcRect1.Left";
_endsrcx = (int) (_srcrect1.getLeft());
RDebugUtils.currentLine=14942228;
 //BA.debugLineNum = 14942228;BA.debugLine="dx = -dx";
_dx = (float) (-_dx);
 }else {
RDebugUtils.currentLine=14942230;
 //BA.debugLineNum = 14942230;BA.debugLine="EndSrcX = SrcRect1.Right - dx";
_endsrcx = (int) (_srcrect1.getRight()-_dx);
RDebugUtils.currentLine=14942231;
 //BA.debugLineNum = 14942231;BA.debugLine="StartSrcX = SrcRect1.Left";
_startsrcx = _srcrect1.getLeft();
 };
RDebugUtils.currentLine=14942233;
 //BA.debugLineNum = 14942233;BA.debugLine="If FlipVertically Then";
if (_flipvertically) { 
RDebugUtils.currentLine=14942234;
 //BA.debugLineNum = 14942234;BA.debugLine="StartSrcY = SrcRect1.Bottom - dy";
_startsrcy = (float) (_srcrect1.getBottom()-_dy);
RDebugUtils.currentLine=14942235;
 //BA.debugLineNum = 14942235;BA.debugLine="EndSrcY = SrcRect1.Top";
_endsrcy = (int) (_srcrect1.getTop());
RDebugUtils.currentLine=14942236;
 //BA.debugLineNum = 14942236;BA.debugLine="dy = -dy";
_dy = (float) (-_dy);
 }else {
RDebugUtils.currentLine=14942238;
 //BA.debugLineNum = 14942238;BA.debugLine="StartSrcY = SrcRect1.Top";
_startsrcy = _srcrect1.getTop();
RDebugUtils.currentLine=14942239;
 //BA.debugLineNum = 14942239;BA.debugLine="EndSrcY = SrcRect1.Bottom - dy";
_endsrcy = (int) (_srcrect1.getBottom()-_dy);
 };
RDebugUtils.currentLine=14942242;
 //BA.debugLineNum = 14942242;BA.debugLine="Dim TargetX As Int = 0";
_targetx = (int) (0);
RDebugUtils.currentLine=14942243;
 //BA.debugLineNum = 14942243;BA.debugLine="Dim TargetY As Int = 0";
_targety = (int) (0);
RDebugUtils.currentLine=14942244;
 //BA.debugLineNum = 14942244;BA.debugLine="Dim TargetYStart As Int = TargetY";
_targetystart = _targety;
RDebugUtils.currentLine=14942245;
 //BA.debugLineNum = 14942245;BA.debugLine="Dim TargetYEnd As Int = Round((TargetY + SrcRectH";
_targetyend = (int) (__c.Round((_targety+_srcrectheight)*_srcscaley)-1);
RDebugUtils.currentLine=14942246;
 //BA.debugLineNum = 14942246;BA.debugLine="Dim TargetXStart As Int = TargetX";
_targetxstart = _targetx;
RDebugUtils.currentLine=14942247;
 //BA.debugLineNum = 14942247;BA.debugLine="Dim TargetXEnd As Int = Round((TargetX + SrcRectW";
_targetxend = (int) (__c.Round((_targetx+_srcrectwidth)*_srcscalex)-1);
RDebugUtils.currentLine=14942252;
 //BA.debugLineNum = 14942252;BA.debugLine="Dim SrcX, SrcY As Float";
_srcx = 0f;
_srcy = 0f;
RDebugUtils.currentLine=14942253;
 //BA.debugLineNum = 14942253;BA.debugLine="Dim SSrcX, SSrcY As Int";
_ssrcx = 0;
_ssrcy = 0;
RDebugUtils.currentLine=14942254;
 //BA.debugLineNum = 14942254;BA.debugLine="SrcY = StartSrcY";
_srcy = _startsrcy;
RDebugUtils.currentLine=14942255;
 //BA.debugLineNum = 14942255;BA.debugLine="If FlipDiagonally Then";
if (_flipdiagonally) { 
RDebugUtils.currentLine=14942256;
 //BA.debugLineNum = 14942256;BA.debugLine="For y = TargetYStart To TargetYEnd - 1";
{
final int step42 = 1;
final int limit42 = (int) (_targetyend-1);
_y = _targetystart ;
for (;_y <= limit42 ;_y = _y + step42 ) {
RDebugUtils.currentLine=14942257;
 //BA.debugLineNum = 14942257;BA.debugLine="SrcX = StartSrcX";
_srcx = _startsrcx;
RDebugUtils.currentLine=14942258;
 //BA.debugLineNum = 14942258;BA.debugLine="SSrcY = SrcY";
_ssrcy = (int) (_srcy);
RDebugUtils.currentLine=14942259;
 //BA.debugLineNum = 14942259;BA.debugLine="For x = TargetXStart To TargetXEnd - 1";
{
final int step45 = 1;
final int limit45 = (int) (_targetxend-1);
_x = _targetxstart ;
for (;_x <= limit45 ;_x = _x + step45 ) {
RDebugUtils.currentLine=14942260;
 //BA.debugLineNum = 14942260;BA.debugLine="SSrcX = SrcX";
_ssrcx = (int) (_srcx);
RDebugUtils.currentLine=14942261;
 //BA.debugLineNum = 14942261;BA.debugLine="bc.CopyPixelIgnoreSemiTransparent(Source, SSrc";
_bc._copypixelignoresemitransparent(_source,_ssrcx,_ssrcy,_y,_x,__c.True);
RDebugUtils.currentLine=14942262;
 //BA.debugLineNum = 14942262;BA.debugLine="SrcX = SrcX + dx";
_srcx = (float) (_srcx+_dx);
 }
};
RDebugUtils.currentLine=14942264;
 //BA.debugLineNum = 14942264;BA.debugLine="bc.CopyPixelIgnoreSemiTransparent(Source, EndSr";
_bc._copypixelignoresemitransparent(_source,_endsrcx,_ssrcy,_y,_x,__c.True);
RDebugUtils.currentLine=14942265;
 //BA.debugLineNum = 14942265;BA.debugLine="SrcY = SrcY + dy";
_srcy = (float) (_srcy+_dy);
 }
};
RDebugUtils.currentLine=14942267;
 //BA.debugLineNum = 14942267;BA.debugLine="SrcX = StartSrcX";
_srcx = _startsrcx;
RDebugUtils.currentLine=14942268;
 //BA.debugLineNum = 14942268;BA.debugLine="For x = TargetXStart To TargetXEnd - 1";
{
final int step54 = 1;
final int limit54 = (int) (_targetxend-1);
_x = _targetxstart ;
for (;_x <= limit54 ;_x = _x + step54 ) {
RDebugUtils.currentLine=14942269;
 //BA.debugLineNum = 14942269;BA.debugLine="SSrcX = SrcX";
_ssrcx = (int) (_srcx);
RDebugUtils.currentLine=14942270;
 //BA.debugLineNum = 14942270;BA.debugLine="bc.CopyPixelIgnoreSemiTransparent(Source, SSrcX";
_bc._copypixelignoresemitransparent(_source,_ssrcx,_endsrcy,_y,_x,__c.True);
RDebugUtils.currentLine=14942271;
 //BA.debugLineNum = 14942271;BA.debugLine="SrcX = SrcX + dx";
_srcx = (float) (_srcx+_dx);
 }
};
RDebugUtils.currentLine=14942273;
 //BA.debugLineNum = 14942273;BA.debugLine="bc.CopyPixelIgnoreSemiTransparent(Source, EndSrc";
_bc._copypixelignoresemitransparent(_source,_endsrcx,_endsrcy,_y,_x,__c.True);
 }else {
RDebugUtils.currentLine=14942275;
 //BA.debugLineNum = 14942275;BA.debugLine="For y = TargetYStart To TargetYEnd - 1";
{
final int step61 = 1;
final int limit61 = (int) (_targetyend-1);
_y = _targetystart ;
for (;_y <= limit61 ;_y = _y + step61 ) {
RDebugUtils.currentLine=14942276;
 //BA.debugLineNum = 14942276;BA.debugLine="SrcX = StartSrcX";
_srcx = _startsrcx;
RDebugUtils.currentLine=14942277;
 //BA.debugLineNum = 14942277;BA.debugLine="SSrcY = SrcY";
_ssrcy = (int) (_srcy);
RDebugUtils.currentLine=14942278;
 //BA.debugLineNum = 14942278;BA.debugLine="For x = TargetXStart To TargetXEnd - 1";
{
final int step64 = 1;
final int limit64 = (int) (_targetxend-1);
_x = _targetxstart ;
for (;_x <= limit64 ;_x = _x + step64 ) {
RDebugUtils.currentLine=14942279;
 //BA.debugLineNum = 14942279;BA.debugLine="SSrcX = SrcX";
_ssrcx = (int) (_srcx);
RDebugUtils.currentLine=14942290;
 //BA.debugLineNum = 14942290;BA.debugLine="bc.CopyPixelIgnoreSemiTransparent(Source, SSrc";
_bc._copypixelignoresemitransparent(_source,_ssrcx,_ssrcy,_x,_y,__c.True);
RDebugUtils.currentLine=14942292;
 //BA.debugLineNum = 14942292;BA.debugLine="SrcX = SrcX + dx";
_srcx = (float) (_srcx+_dx);
 }
};
RDebugUtils.currentLine=14942294;
 //BA.debugLineNum = 14942294;BA.debugLine="bc.CopyPixelIgnoreSemiTransparent(Source, EndSr";
_bc._copypixelignoresemitransparent(_source,_endsrcx,_ssrcy,_x,_y,__c.True);
RDebugUtils.currentLine=14942295;
 //BA.debugLineNum = 14942295;BA.debugLine="SrcY = SrcY + dy";
_srcy = (float) (_srcy+_dy);
 }
};
RDebugUtils.currentLine=14942297;
 //BA.debugLineNum = 14942297;BA.debugLine="SrcX = StartSrcX";
_srcx = _startsrcx;
RDebugUtils.currentLine=14942298;
 //BA.debugLineNum = 14942298;BA.debugLine="For x = TargetXStart To TargetXEnd - 1";
{
final int step73 = 1;
final int limit73 = (int) (_targetxend-1);
_x = _targetxstart ;
for (;_x <= limit73 ;_x = _x + step73 ) {
RDebugUtils.currentLine=14942299;
 //BA.debugLineNum = 14942299;BA.debugLine="SSrcX = SrcX";
_ssrcx = (int) (_srcx);
RDebugUtils.currentLine=14942300;
 //BA.debugLineNum = 14942300;BA.debugLine="bc.CopyPixelIgnoreSemiTransparent(Source, SSrcX";
_bc._copypixelignoresemitransparent(_source,_ssrcx,_endsrcy,_x,_y,__c.True);
RDebugUtils.currentLine=14942301;
 //BA.debugLineNum = 14942301;BA.debugLine="SrcX = SrcX + dx";
_srcx = (float) (_srcx+_dx);
 }
};
RDebugUtils.currentLine=14942303;
 //BA.debugLineNum = 14942303;BA.debugLine="bc.CopyPixelIgnoreSemiTransparent(Source, EndSrc";
_bc._copypixelignoresemitransparent(_source,_endsrcx,_endsrcy,_x,_y,__c.True);
 };
RDebugUtils.currentLine=14942305;
 //BA.debugLineNum = 14942305;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XCanvas.B4XRect  _findrotatedrect(b4a.example.x2spritegraphiccache __ref,b4a.example.bitmapcreator _input,int _degrees) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2spritegraphiccache";
if (Debug.shouldDelegate(ba, "findrotatedrect", true))
	 {return ((anywheresoftware.b4a.objects.B4XCanvas.B4XRect) Debug.delegate(ba, "findrotatedrect", new Object[] {_input,_degrees}));}
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
RDebugUtils.currentLine=14876672;
 //BA.debugLineNum = 14876672;BA.debugLine="Private Sub FindRotatedRect(Input As BitmapCreator";
RDebugUtils.currentLine=14876673;
 //BA.debugLineNum = 14876673;BA.debugLine="Transform.Angle = X2.DegreesToB2Angle(Degrees)";
__ref._transform /*anywheresoftware.b4a.objects.B2Transform*/ .setAngle(__ref._x2 /*b4a.example.x2utils*/ ._degreestob2angle /*float*/ (null,_degrees));
RDebugUtils.currentLine=14876674;
 //BA.debugLineNum = 14876674;BA.debugLine="RectShape.SetAsBox(Input.mWidth / 2, Input.mHeigh";
__ref._rectshape /*anywheresoftware.b4a.objects.B2Shape.B2PolygonShape*/ .SetAsBox((float) (_input._mwidth/(double)2),(float) (_input._mheight/(double)2));
RDebugUtils.currentLine=14876675;
 //BA.debugLineNum = 14876675;BA.debugLine="RectShape.ComputeAABB(OutputAABB, Transform)";
__ref._rectshape /*anywheresoftware.b4a.objects.B2Shape.B2PolygonShape*/ .ComputeAABB(__ref._outputaabb /*anywheresoftware.b4a.objects.B2AABB*/ ,__ref._transform /*anywheresoftware.b4a.objects.B2Transform*/ );
RDebugUtils.currentLine=14876676;
 //BA.debugLineNum = 14876676;BA.debugLine="Dim r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=14876677;
 //BA.debugLineNum = 14876677;BA.debugLine="r.Initialize(0, 0, Ceil(OutputAABB.TopRight.X - O";
_r.Initialize((float) (0),(float) (0),(float) (__c.Ceil(__ref._outputaabb /*anywheresoftware.b4a.objects.B2AABB*/ .getTopRight().getX()-__ref._outputaabb /*anywheresoftware.b4a.objects.B2AABB*/ .getBottomLeft().getX())),(float) (__c.Ceil(__ref._outputaabb /*anywheresoftware.b4a.objects.B2AABB*/ .getTopRight().getY()-__ref._outputaabb /*anywheresoftware.b4a.objects.B2AABB*/ .getBottomLeft().getY())));
RDebugUtils.currentLine=14876678;
 //BA.debugLineNum = 14876678;BA.debugLine="Return r";
if (true) return _r;
RDebugUtils.currentLine=14876679;
 //BA.debugLineNum = 14876679;BA.debugLine="End Sub";
return null;
}
public b4a.example.bitmapcreator  _getbitmapcreator(b4a.example.x2spritegraphiccache __ref,int _size) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2spritegraphiccache";
if (Debug.shouldDelegate(ba, "getbitmapcreator", true))
	 {return ((b4a.example.bitmapcreator) Debug.delegate(ba, "getbitmapcreator", new Object[] {_size}));}
RDebugUtils.currentLine=14811136;
 //BA.debugLineNum = 14811136;BA.debugLine="Public Sub GetBitmapCreator(Size As Int) As Bitmap";
RDebugUtils.currentLine=14811137;
 //BA.debugLineNum = 14811137;BA.debugLine="Return GetCanvas(Size).TargetView.Tag";
if (true) return (b4a.example.bitmapcreator)(__ref._getcanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ (null,_size).getTargetView().getTag());
RDebugUtils.currentLine=14811138;
 //BA.debugLineNum = 14811138;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XCanvas  _getcanvas(b4a.example.x2spritegraphiccache __ref,int _size) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2spritegraphiccache";
if (Debug.shouldDelegate(ba, "getcanvas", true))
	 {return ((anywheresoftware.b4a.objects.B4XCanvas) Debug.delegate(ba, "getcanvas", new Object[] {_size}));}
int _interval = 0;
int _i = 0;
int _maxsize = 0;
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
RDebugUtils.currentLine=14745600;
 //BA.debugLineNum = 14745600;BA.debugLine="Public Sub GetCanvas(Size As Int) As B4XCanvas";
RDebugUtils.currentLine=14745601;
 //BA.debugLineNum = 14745601;BA.debugLine="Dim interval As Int = MAX_SIZE_FOR_ANTIALIAS / CV";
_interval = (int) (__ref._max_size_for_antialias /*int*/ /(double)__ref._cvspanel /*anywheresoftware.b4a.objects.B4XViewWrapper[]*/ .length);
RDebugUtils.currentLine=14745602;
 //BA.debugLineNum = 14745602;BA.debugLine="Dim i As Int = Min(CVSPanel.Length - 1,  Size / i";
_i = (int) (__c.Min(__ref._cvspanel /*anywheresoftware.b4a.objects.B4XViewWrapper[]*/ .length-1,_size/(double)_interval));
RDebugUtils.currentLine=14745603;
 //BA.debugLineNum = 14745603;BA.debugLine="If CVSPanel(i).IsInitialized = False Then";
if (__ref._cvspanel /*anywheresoftware.b4a.objects.B4XViewWrapper[]*/ [_i].IsInitialized()==__c.False) { 
RDebugUtils.currentLine=14745604;
 //BA.debugLineNum = 14745604;BA.debugLine="Dim MaxSize = (i + 1) * interval As Int";
_maxsize = (int) ((_i+1)*_interval);
RDebugUtils.currentLine=14745605;
 //BA.debugLineNum = 14745605;BA.debugLine="If xui.IsB4J Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()) { 
RDebugUtils.currentLine=14745606;
 //BA.debugLineNum = 14745606;BA.debugLine="CVSPanel(i) = xui.CreatePanel(\"\")";
__ref._cvspanel /*anywheresoftware.b4a.objects.B4XViewWrapper[]*/ [_i] = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
 }else {
RDebugUtils.currentLine=14745608;
 //BA.debugLineNum = 14745608;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=14745609;
 //BA.debugLineNum = 14745609;BA.debugLine="iv.Initialize(\"\")";
_iv.Initialize(ba,"");
RDebugUtils.currentLine=14745610;
 //BA.debugLineNum = 14745610;BA.debugLine="CVSPanel(i) = iv";
__ref._cvspanel /*anywheresoftware.b4a.objects.B4XViewWrapper[]*/ [_i] = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iv.getObject()));
 };
RDebugUtils.currentLine=14745612;
 //BA.debugLineNum = 14745612;BA.debugLine="CVSPanel(i).SetLayoutAnimated(0, 0, 0, MaxSize *";
__ref._cvspanel /*anywheresoftware.b4a.objects.B4XViewWrapper[]*/ [_i].SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_maxsize*__ref._x2 /*b4a.example.x2utils*/ ._bmpsmoothscale /*float*/ ),(int) (_maxsize*__ref._x2 /*b4a.example.x2utils*/ ._bmpsmoothscale /*float*/ ));
RDebugUtils.currentLine=14745614;
 //BA.debugLineNum = 14745614;BA.debugLine="CVS(i).Initialize(CVSPanel(i))";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas[]*/ [_i].Initialize(__ref._cvspanel /*anywheresoftware.b4a.objects.B4XViewWrapper[]*/ [_i]);
RDebugUtils.currentLine=14745615;
 //BA.debugLineNum = 14745615;BA.debugLine="CVSProxy(i).Initialize(MaxSize, MaxSize)";
__ref._cvsproxy /*b4a.example.bitmapcreator[]*/ [_i]._initialize(ba,_maxsize,_maxsize);
RDebugUtils.currentLine=14745616;
 //BA.debugLineNum = 14745616;BA.debugLine="CVSPanel(i).Tag = CVSProxy(i)";
__ref._cvspanel /*anywheresoftware.b4a.objects.B4XViewWrapper[]*/ [_i].setTag((Object)(__ref._cvsproxy /*b4a.example.bitmapcreator[]*/ [_i]));
 };
RDebugUtils.currentLine=14745618;
 //BA.debugLineNum = 14745618;BA.debugLine="Return CVS(i)";
if (true) return __ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas[]*/ [_i];
RDebugUtils.currentLine=14745619;
 //BA.debugLineNum = 14745619;BA.debugLine="End Sub";
return null;
}
public b4a.example.bitmapcreator._compressedbc  _getgraphic2(b4a.example.x2spritegraphiccache __ref,String _name,int _index,int _degrees,boolean _fliphorizontally,boolean _flipvertically) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2spritegraphiccache";
if (Debug.shouldDelegate(ba, "getgraphic2", true))
	 {return ((b4a.example.bitmapcreator._compressedbc) Debug.delegate(ba, "getgraphic2", new Object[] {_name,_index,_degrees,_fliphorizontally,_flipvertically}));}
b4a.example.x2spritegraphiccache._x2spritegraphicdata _data = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
int _delta = 0;
int _key = 0;
b4a.example.bitmapcreator._compressedbc _tempbc = null;
b4a.example.bitmapcreator._compressedbc _nonflippedcbc = null;
int _quarter = 0;
b4a.example.bitmapcreator _originalbc = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
b4a.example.bitmapcreator._drawtask _dt = null;
RDebugUtils.currentLine=14483456;
 //BA.debugLineNum = 14483456;BA.debugLine="Public Sub GetGraphic2(Name As String, Index As In";
RDebugUtils.currentLine=14483457;
 //BA.debugLineNum = 14483457;BA.debugLine="Dim data As X2SpriteGraphicData = cache.Get(Name.";
_data = (b4a.example.x2spritegraphiccache._x2spritegraphicdata)(__ref._cache /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_name.toLowerCase())));
RDebugUtils.currentLine=14483458;
 //BA.debugLineNum = 14483458;BA.debugLine="If data = Null Then";
if (_data== null) { 
RDebugUtils.currentLine=14483459;
 //BA.debugLineNum = 14483459;BA.debugLine="Log($\"Error: graphic not found: ${Name}\"$)";
__c.LogImpl("914483459",("Error: graphic not found: "+__c.SmartStringFormatter("",(Object)(_name))+""),0);
 };
RDebugUtils.currentLine=14483461;
 //BA.debugLineNum = 14483461;BA.debugLine="data.LastUsed = DateTime.Now";
_data.LastUsed /*long*/  = __c.DateTime.getNow();
RDebugUtils.currentLine=14483462;
 //BA.debugLineNum = 14483462;BA.debugLine="Dim m As Map = data.MapsOfCompressedBCs.Get(Index";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_data.MapsOfCompressedBCs /*anywheresoftware.b4a.objects.collections.List*/ .Get(_index)));
RDebugUtils.currentLine=14483463;
 //BA.debugLineNum = 14483463;BA.debugLine="Degrees = Degrees Mod 360";
_degrees = (int) (_degrees%360);
RDebugUtils.currentLine=14483464;
 //BA.debugLineNum = 14483464;BA.debugLine="If Degrees < 0 Then Degrees = 360 + Degrees";
if (_degrees<0) { 
_degrees = (int) (360+_degrees);};
RDebugUtils.currentLine=14483465;
 //BA.debugLineNum = 14483465;BA.debugLine="Dim delta As Int = Degrees Mod data.AngleInterval";
_delta = (int) (_degrees%_data.AngleInterval /*int*/ );
RDebugUtils.currentLine=14483466;
 //BA.debugLineNum = 14483466;BA.debugLine="If delta > data.AngleInterval / 2 Then";
if (_delta>_data.AngleInterval /*int*/ /(double)2) { 
RDebugUtils.currentLine=14483467;
 //BA.debugLineNum = 14483467;BA.debugLine="Degrees = (Degrees - delta + data.AngleInterval)";
_degrees = (int) ((_degrees-_delta+_data.AngleInterval /*int*/ )%360);
 }else {
RDebugUtils.currentLine=14483469;
 //BA.debugLineNum = 14483469;BA.debugLine="Degrees = Degrees - delta";
_degrees = (int) (_degrees-_delta);
 };
RDebugUtils.currentLine=14483471;
 //BA.debugLineNum = 14483471;BA.debugLine="Dim key As Int = Degrees";
_key = _degrees;
RDebugUtils.currentLine=14483472;
 //BA.debugLineNum = 14483472;BA.debugLine="If FlipHorizontally Then key = key + 1000";
if (_fliphorizontally) { 
_key = (int) (_key+1000);};
RDebugUtils.currentLine=14483473;
 //BA.debugLineNum = 14483473;BA.debugLine="If FlipVertically Then key = key + 2000";
if (_flipvertically) { 
_key = (int) (_key+2000);};
RDebugUtils.currentLine=14483474;
 //BA.debugLineNum = 14483474;BA.debugLine="If m.ContainsKey(key) Then Return m.Get(key)";
if (_m.ContainsKey((Object)(_key))) { 
if (true) return (b4a.example.bitmapcreator._compressedbc)(_m.Get((Object)(_key)));};
RDebugUtils.currentLine=14483476;
 //BA.debugLineNum = 14483476;BA.debugLine="Dim TempBC As CompressedBC";
_tempbc = new b4a.example.bitmapcreator._compressedbc();
RDebugUtils.currentLine=14483477;
 //BA.debugLineNum = 14483477;BA.debugLine="If FlipHorizontally <> FlipVertically Then";
if (_fliphorizontally!=_flipvertically) { 
RDebugUtils.currentLine=14483478;
 //BA.debugLineNum = 14483478;BA.debugLine="Dim NonFlippedCbc As CompressedBC = GetGraphic2(";
_nonflippedcbc = __ref._getgraphic2 /*b4a.example.bitmapcreator._compressedbc*/ (null,_name,_index,(int) (-_degrees),__c.False,__c.False);
RDebugUtils.currentLine=14483479;
 //BA.debugLineNum = 14483479;BA.debugLine="TempBC = WorkingSpace.FlipCompressedBitmap(NonFl";
_tempbc = __ref._workingspace /*b4a.example.bitmapcreator*/ ._flipcompressedbitmap(_nonflippedcbc,_fliphorizontally,_flipvertically);
 }else 
{RDebugUtils.currentLine=14483480;
 //BA.debugLineNum = 14483480;BA.debugLine="Else If FlipHorizontally And FlipVertically Then";
if (_fliphorizontally && _flipvertically) { 
RDebugUtils.currentLine=14483481;
 //BA.debugLineNum = 14483481;BA.debugLine="TempBC = GetGraphic2(Name, Index, Degrees + 180,";
_tempbc = __ref._getgraphic2 /*b4a.example.bitmapcreator._compressedbc*/ (null,_name,_index,(int) (_degrees+180),__c.False,__c.False);
 }else 
{RDebugUtils.currentLine=14483482;
 //BA.debugLineNum = 14483482;BA.debugLine="Else If Degrees > 90 And (data.VerticalSymmetry O";
if (_degrees>90 && (_data.VerticalSymmetry /*boolean*/  || _data.HorizontalSymmetry /*boolean*/ )) { 
RDebugUtils.currentLine=14483483;
 //BA.debugLineNum = 14483483;BA.debugLine="Dim quarter As Int = Degrees / 90";
_quarter = (int) (_degrees/(double)90);
RDebugUtils.currentLine=14483484;
 //BA.debugLineNum = 14483484;BA.debugLine="Select quarter";
switch (_quarter) {
case 1: {
RDebugUtils.currentLine=14483486;
 //BA.debugLineNum = 14483486;BA.debugLine="TempBC = GetGraphic2(Name, Index, 180 - Degree";
_tempbc = __ref._getgraphic2 /*b4a.example.bitmapcreator._compressedbc*/ (null,_name,_index,(int) (180-_degrees),__c.False,__c.False);
RDebugUtils.currentLine=14483487;
 //BA.debugLineNum = 14483487;BA.debugLine="TempBC = WorkingSpace.FlipCompressedBitmap(Tem";
_tempbc = __ref._workingspace /*b4a.example.bitmapcreator*/ ._flipcompressedbitmap(_tempbc,__c.Not(_data.HorizontalSymmetry /*boolean*/ ),_data.HorizontalSymmetry /*boolean*/ );
 break; }
case 2: {
RDebugUtils.currentLine=14483489;
 //BA.debugLineNum = 14483489;BA.debugLine="TempBC = GetGraphic2(Name, Index, Degrees - 18";
_tempbc = __ref._getgraphic2 /*b4a.example.bitmapcreator._compressedbc*/ (null,_name,_index,(int) (_degrees-180),__c.False,__c.False);
RDebugUtils.currentLine=14483490;
 //BA.debugLineNum = 14483490;BA.debugLine="TempBC = WorkingSpace.FlipCompressedBitmap(Tem";
_tempbc = __ref._workingspace /*b4a.example.bitmapcreator*/ ._flipcompressedbitmap(_tempbc,__c.True,__c.True);
 break; }
case 3: {
RDebugUtils.currentLine=14483492;
 //BA.debugLineNum = 14483492;BA.debugLine="TempBC = GetGraphic2(Name, Index, 360 - Degree";
_tempbc = __ref._getgraphic2 /*b4a.example.bitmapcreator._compressedbc*/ (null,_name,_index,(int) (360-_degrees),__c.False,__c.False);
RDebugUtils.currentLine=14483493;
 //BA.debugLineNum = 14483493;BA.debugLine="TempBC = WorkingSpace.FlipCompressedBitmap(Tem";
_tempbc = __ref._workingspace /*b4a.example.bitmapcreator*/ ._flipcompressedbitmap(_tempbc,__c.Not(_data.VerticalSymmetry /*boolean*/ ),_data.VerticalSymmetry /*boolean*/ );
 break; }
}
;
 }else 
{RDebugUtils.currentLine=14483495;
 //BA.debugLineNum = 14483495;BA.debugLine="Else If Degrees >= 180 Then";
if (_degrees>=180) { 
RDebugUtils.currentLine=14483496;
 //BA.debugLineNum = 14483496;BA.debugLine="TempBC = GetGraphic2(Name, Index, Degrees - 180,";
_tempbc = __ref._getgraphic2 /*b4a.example.bitmapcreator._compressedbc*/ (null,_name,_index,(int) (_degrees-180),__c.False,__c.False);
RDebugUtils.currentLine=14483497;
 //BA.debugLineNum = 14483497;BA.debugLine="TempBC = WorkingSpace.FlipCompressedBitmap(TempB";
_tempbc = __ref._workingspace /*b4a.example.bitmapcreator*/ ._flipcompressedbitmap(_tempbc,__c.True,__c.True);
 }else {
RDebugUtils.currentLine=14483499;
 //BA.debugLineNum = 14483499;BA.debugLine="Dim OriginalBC As BitmapCreator = data.OriginalB";
_originalbc = (b4a.example.bitmapcreator)(_data.OriginalBCs /*anywheresoftware.b4a.objects.collections.List*/ .Get(_index));
RDebugUtils.currentLine=14483500;
 //BA.debugLineNum = 14483500;BA.debugLine="Dim r As B4XRect = FindRotatedRect(OriginalBC, D";
_r = __ref._findrotatedrect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ (null,_originalbc,_degrees);
RDebugUtils.currentLine=14483501;
 //BA.debugLineNum = 14483501;BA.debugLine="Dim dt As DrawTask = WorkingSpace.CreateDrawTask";
_dt = __ref._workingspace /*b4a.example.bitmapcreator*/ ._createdrawtask((Object)(_originalbc),_originalbc._targetrect,(int) (_r.getWidth()/(double)2),(int) (_r.getHeight()/(double)2),__c.True);
RDebugUtils.currentLine=14483502;
 //BA.debugLineNum = 14483502;BA.debugLine="dt.Degrees = Degrees";
_dt.Degrees = _degrees;
RDebugUtils.currentLine=14483503;
 //BA.debugLineNum = 14483503;BA.debugLine="If r.Width > WorkingSpace.mWidth Or r.Height > W";
if (_r.getWidth()>__ref._workingspace /*b4a.example.bitmapcreator*/ ._mwidth || _r.getHeight()>__ref._workingspace /*b4a.example.bitmapcreator*/ ._mheight) { 
RDebugUtils.currentLine=14483504;
 //BA.debugLineNum = 14483504;BA.debugLine="Log(\"Increasing WorkingSpace size.\")";
__c.LogImpl("914483504","Increasing WorkingSpace size.",0);
RDebugUtils.currentLine=14483505;
 //BA.debugLineNum = 14483505;BA.debugLine="Dim WorkingSpace As BitmapCreator";
_workingspace = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=14483506;
 //BA.debugLineNum = 14483506;BA.debugLine="WorkingSpace.Initialize(r.Width * 1.4, r.Height";
__ref._workingspace /*b4a.example.bitmapcreator*/ ._initialize(ba,(int) (_r.getWidth()*1.4),(int) (_r.getHeight()*1.4));
RDebugUtils.currentLine=14483507;
 //BA.debugLineNum = 14483507;BA.debugLine="InitializeIntsArray";
__ref._initializeintsarray /*String*/ (null);
 }else {
RDebugUtils.currentLine=14483509;
 //BA.debugLineNum = 14483509;BA.debugLine="WorkingSpace.FillRect(xui.Color_Transparent, r)";
__ref._workingspace /*b4a.example.bitmapcreator*/ ._fillrect(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,_r);
 };
RDebugUtils.currentLine=14483511;
 //BA.debugLineNum = 14483511;BA.debugLine="If data.AntiAlias And Degrees Mod 90 <> 0 Then";
if (_data.AntiAlias /*boolean*/  && _degrees%90!=0) { 
RDebugUtils.currentLine=14483512;
 //BA.debugLineNum = 14483512;BA.debugLine="WorkingSpace.DrawRotatedCBC(m.Get(0), Degrees,";
__ref._workingspace /*b4a.example.bitmapcreator*/ ._drawrotatedcbc((b4a.example.bitmapcreator._compressedbc)(_m.Get((Object)(0))),(float) (_degrees),(int) (_r.getWidth()),(int) (_r.getHeight()),__ref._aabuffer /*b4a.example.bitmapcreator._internalantialiasingbuffer*/ );
 }else {
RDebugUtils.currentLine=14483514;
 //BA.debugLineNum = 14483514;BA.debugLine="WorkingSpace.DrawBitmapCreatorTransformed(dt)";
__ref._workingspace /*b4a.example.bitmapcreator*/ ._drawbitmapcreatortransformed(_dt);
 };
RDebugUtils.currentLine=14483516;
 //BA.debugLineNum = 14483516;BA.debugLine="TempBC = WorkingSpace.ExtractCompressedBC(r, CBC";
_tempbc = __ref._workingspace /*b4a.example.bitmapcreator*/ ._extractcompressedbc(_r,__ref._cbccache /*b4a.example.bitmapcreator._internalcompressedbccache*/ );
 }}}}
;
RDebugUtils.currentLine=14483519;
 //BA.debugLineNum = 14483519;BA.debugLine="m.Put(key, TempBC)";
_m.Put((Object)(_key),(Object)(_tempbc));
RDebugUtils.currentLine=14483521;
 //BA.debugLineNum = 14483521;BA.debugLine="data.SizeOfAllCompressed = data.SizeOfAllCompress";
_data.SizeOfAllCompressed /*int*/  = (int) (_data.SizeOfAllCompressed /*int*/ +_tempbc.mBuffer.length);
RDebugUtils.currentLine=14483522;
 //BA.debugLineNum = 14483522;BA.debugLine="TotalSize = TotalSize + TempBC.mBuffer.Length";
__ref._totalsize /*int*/  = (int) (__ref._totalsize /*int*/ +_tempbc.mBuffer.length);
RDebugUtils.currentLine=14483523;
 //BA.debugLineNum = 14483523;BA.debugLine="If TotalSize > MAX_SIZE_OF_ALL_COMPRESSEDBCS Then";
if (__ref._totalsize /*int*/ >__ref._max_size_of_all_compressedbcs /*int*/ ) { 
RDebugUtils.currentLine=14483524;
 //BA.debugLineNum = 14483524;BA.debugLine="TrimCache";
__ref._trimcache /*String*/ (null);
 };
RDebugUtils.currentLine=14483527;
 //BA.debugLineNum = 14483527;BA.debugLine="Return TempBC";
if (true) return _tempbc;
RDebugUtils.currentLine=14483528;
 //BA.debugLineNum = 14483528;BA.debugLine="End Sub";
return null;
}
public b4a.example.bitmapcreator._compressedbc  _getgraphic(b4a.example.x2spritegraphiccache __ref,String _name,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2spritegraphiccache";
if (Debug.shouldDelegate(ba, "getgraphic", true))
	 {return ((b4a.example.bitmapcreator._compressedbc) Debug.delegate(ba, "getgraphic", new Object[] {_name,_index}));}
RDebugUtils.currentLine=14417920;
 //BA.debugLineNum = 14417920;BA.debugLine="Public Sub GetGraphic(Name As String, Index As Int";
RDebugUtils.currentLine=14417921;
 //BA.debugLineNum = 14417921;BA.debugLine="Return GetGraphic2(Name, Index, 0, False, False)";
if (true) return __ref._getgraphic2 /*b4a.example.bitmapcreator._compressedbc*/ (null,_name,_index,(int) (0),__c.False,__c.False);
RDebugUtils.currentLine=14417922;
 //BA.debugLineNum = 14417922;BA.debugLine="End Sub";
return null;
}
public String  _initializeintsarray(b4a.example.x2spritegraphiccache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2spritegraphiccache";
if (Debug.shouldDelegate(ba, "initializeintsarray", true))
	 {return ((String) Debug.delegate(ba, "initializeintsarray", null));}
int[] _intsarray = null;
RDebugUtils.currentLine=13893632;
 //BA.debugLineNum = 13893632;BA.debugLine="Private Sub InitializeIntsArray";
RDebugUtils.currentLine=13893633;
 //BA.debugLineNum = 13893633;BA.debugLine="AABuffer.Initialize";
__ref._aabuffer /*b4a.example.bitmapcreator._internalantialiasingbuffer*/ .Initialize();
RDebugUtils.currentLine=13893637;
 //BA.debugLineNum = 13893637;BA.debugLine="Dim IntsArray(WorkingSpace.mWidth * WorkingSpace.";
_intsarray = new int[(int) (__ref._workingspace /*b4a.example.bitmapcreator*/ ._mwidth*__ref._workingspace /*b4a.example.bitmapcreator*/ ._mheight*5)];
;
RDebugUtils.currentLine=13893639;
 //BA.debugLineNum = 13893639;BA.debugLine="AABuffer.IntsArray = IntsArray";
__ref._aabuffer /*b4a.example.bitmapcreator._internalantialiasingbuffer*/ .IntsArray = _intsarray;
RDebugUtils.currentLine=13893640;
 //BA.debugLineNum = 13893640;BA.debugLine="End Sub";
return "";
}
public String  _trimcache(b4a.example.x2spritegraphiccache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2spritegraphiccache";
if (Debug.shouldDelegate(ba, "trimcache", true))
	 {return ((String) Debug.delegate(ba, "trimcache", null));}
anywheresoftware.b4a.objects.collections.List _dates = null;
b4a.example.x2spritegraphiccache._x2spritegraphicdata _data = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _m = null;
b4a.example.bitmapcreator._compressedbc _zero = null;
RDebugUtils.currentLine=14548992;
 //BA.debugLineNum = 14548992;BA.debugLine="Private Sub TrimCache";
RDebugUtils.currentLine=14548993;
 //BA.debugLineNum = 14548993;BA.debugLine="Log(\"Trim Cache\")";
__c.LogImpl("914548993","Trim Cache",0);
RDebugUtils.currentLine=14548994;
 //BA.debugLineNum = 14548994;BA.debugLine="Log($\"Before: ${TotalSize}\"$)";
__c.LogImpl("914548994",("Before: "+__c.SmartStringFormatter("",(Object)(__ref._totalsize /*int*/ ))+""),0);
RDebugUtils.currentLine=14548995;
 //BA.debugLineNum = 14548995;BA.debugLine="Dim dates As List";
_dates = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=14548996;
 //BA.debugLineNum = 14548996;BA.debugLine="dates.Initialize";
_dates.Initialize();
RDebugUtils.currentLine=14548997;
 //BA.debugLineNum = 14548997;BA.debugLine="For Each data As X2SpriteGraphicData In cache.Val";
{
final anywheresoftware.b4a.BA.IterableList group5 = __ref._cache /*anywheresoftware.b4a.objects.collections.Map*/ .Values();
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_data = (b4a.example.x2spritegraphiccache._x2spritegraphicdata)(group5.Get(index5));
RDebugUtils.currentLine=14548998;
 //BA.debugLineNum = 14548998;BA.debugLine="If data.SizeOfAllCompressed > 0 Then dates.Add(d";
if (_data.SizeOfAllCompressed /*int*/ >0) { 
_dates.Add((Object)(_data));};
 }
};
RDebugUtils.currentLine=14549000;
 //BA.debugLineNum = 14549000;BA.debugLine="dates.SortType(\"LastUsed\", True)";
_dates.SortType("LastUsed",__c.True);
RDebugUtils.currentLine=14549001;
 //BA.debugLineNum = 14549001;BA.debugLine="For i = 0 To dates.Size / 2";
{
final int step9 = 1;
final int limit9 = (int) (_dates.getSize()/(double)2);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=14549002;
 //BA.debugLineNum = 14549002;BA.debugLine="Dim data As X2SpriteGraphicData = dates.Get(i)";
_data = (b4a.example.x2spritegraphiccache._x2spritegraphicdata)(_dates.Get(_i));
RDebugUtils.currentLine=14549003;
 //BA.debugLineNum = 14549003;BA.debugLine="For Each m As Map In data.MapsOfCompressedBCs";
_m = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group11 = _data.MapsOfCompressedBCs /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen11 = group11.getSize()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group11.Get(index11)));
RDebugUtils.currentLine=14549004;
 //BA.debugLineNum = 14549004;BA.debugLine="Dim zero As CompressedBC = m.Get(0)";
_zero = (b4a.example.bitmapcreator._compressedbc)(_m.Get((Object)(0)));
RDebugUtils.currentLine=14549005;
 //BA.debugLineNum = 14549005;BA.debugLine="m.Clear";
_m.Clear();
RDebugUtils.currentLine=14549006;
 //BA.debugLineNum = 14549006;BA.debugLine="m.Put(0, zero)";
_m.Put((Object)(0),(Object)(_zero));
 }
};
RDebugUtils.currentLine=14549008;
 //BA.debugLineNum = 14549008;BA.debugLine="TotalSize = TotalSize - data.SizeOfAllCompressed";
__ref._totalsize /*int*/  = (int) (__ref._totalsize /*int*/ -_data.SizeOfAllCompressed /*int*/ );
RDebugUtils.currentLine=14549009;
 //BA.debugLineNum = 14549009;BA.debugLine="data.SizeOfAllCompressed = 0";
_data.SizeOfAllCompressed /*int*/  = (int) (0);
 }
};
RDebugUtils.currentLine=14549011;
 //BA.debugLineNum = 14549011;BA.debugLine="Log($\"After: ${TotalSize}\"$)";
__c.LogImpl("914549011",("After: "+__c.SmartStringFormatter("",(Object)(__ref._totalsize /*int*/ ))+""),0);
RDebugUtils.currentLine=14549012;
 //BA.debugLineNum = 14549012;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B2Vec2  _getgraphicsizemeters(b4a.example.x2spritegraphiccache __ref,String _name,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2spritegraphiccache";
if (Debug.shouldDelegate(ba, "getgraphicsizemeters", true))
	 {return ((anywheresoftware.b4a.objects.B2Vec2) Debug.delegate(ba, "getgraphicsizemeters", new Object[] {_name,_index}));}
b4a.example.x2spritegraphiccache._x2spritegraphicdata _data = null;
b4a.example.bitmapcreator _bc = null;
anywheresoftware.b4a.objects.B2Vec2 _vec = null;
RDebugUtils.currentLine=14024704;
 //BA.debugLineNum = 14024704;BA.debugLine="Public Sub GetGraphicSizeMeters (Name As String, I";
RDebugUtils.currentLine=14024705;
 //BA.debugLineNum = 14024705;BA.debugLine="Dim data As X2SpriteGraphicData = cache.Get(Name.";
_data = (b4a.example.x2spritegraphiccache._x2spritegraphicdata)(__ref._cache /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_name.toLowerCase())));
RDebugUtils.currentLine=14024706;
 //BA.debugLineNum = 14024706;BA.debugLine="Dim bc As BitmapCreator = data.OriginalBCs.Get(In";
_bc = (b4a.example.bitmapcreator)(_data.OriginalBCs /*anywheresoftware.b4a.objects.collections.List*/ .Get(_index));
RDebugUtils.currentLine=14024707;
 //BA.debugLineNum = 14024707;BA.debugLine="Dim vec As B2Vec2";
_vec = new anywheresoftware.b4a.objects.B2Vec2();
RDebugUtils.currentLine=14024708;
 //BA.debugLineNum = 14024708;BA.debugLine="vec.X = bc.mWidth / X2.mBCPixelsPerMeter";
_vec.setX((float) (_bc._mwidth/(double)__ref._x2 /*b4a.example.x2utils*/ ._mbcpixelspermeter /*float*/ ));
RDebugUtils.currentLine=14024709;
 //BA.debugLineNum = 14024709;BA.debugLine="vec.Y = bc.mHeight / X2.mBCPixelsPerMeter";
_vec.setY((float) (_bc._mheight/(double)__ref._x2 /*b4a.example.x2utils*/ ._mbcpixelspermeter /*float*/ ));
RDebugUtils.currentLine=14024710;
 //BA.debugLineNum = 14024710;BA.debugLine="Return vec";
if (true) return _vec;
RDebugUtils.currentLine=14024711;
 //BA.debugLineNum = 14024711;BA.debugLine="End Sub";
return null;
}
public String  _gettempname(b4a.example.x2spritegraphiccache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2spritegraphiccache";
if (Debug.shouldDelegate(ba, "gettempname", true))
	 {return ((String) Debug.delegate(ba, "gettempname", null));}
RDebugUtils.currentLine=13959168;
 //BA.debugLineNum = 13959168;BA.debugLine="Public Sub GetTempName As String";
RDebugUtils.currentLine=13959169;
 //BA.debugLineNum = 13959169;BA.debugLine="TempId = TempId + 1";
__ref._tempid /*int*/  = (int) (__ref._tempid /*int*/ +1);
RDebugUtils.currentLine=13959170;
 //BA.debugLineNum = 13959170;BA.debugLine="Return TempPrefix & TempId";
if (true) return __ref._tempprefix /*String*/ +BA.NumberToString(__ref._tempid /*int*/ );
RDebugUtils.currentLine=13959171;
 //BA.debugLineNum = 13959171;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.x2spritegraphiccache __ref,anywheresoftware.b4a.BA _ba,b4a.example.x2utils _vx2) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="x2spritegraphiccache";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_vx2}));}
byte[] _b = null;
RDebugUtils.currentLine=13828096;
 //BA.debugLineNum = 13828096;BA.debugLine="Public Sub Initialize (vX2 As X2Utils)";
RDebugUtils.currentLine=13828097;
 //BA.debugLineNum = 13828097;BA.debugLine="CBCCache.Initialize";
__ref._cbccache /*b4a.example.bitmapcreator._internalcompressedbccache*/ .Initialize();
RDebugUtils.currentLine=13828098;
 //BA.debugLineNum = 13828098;BA.debugLine="CBCCache.ColorsMap.Initialize";
__ref._cbccache /*b4a.example.bitmapcreator._internalcompressedbccache*/ .ColorsMap.Initialize();
RDebugUtils.currentLine=13828099;
 //BA.debugLineNum = 13828099;BA.debugLine="cache.Initialize";
__ref._cache /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=13828100;
 //BA.debugLineNum = 13828100;BA.debugLine="WorkingSpace.Initialize(300, 300)";
__ref._workingspace /*b4a.example.bitmapcreator*/ ._initialize(ba,(int) (300),(int) (300));
RDebugUtils.currentLine=13828101;
 //BA.debugLineNum = 13828101;BA.debugLine="Dim b(WorkingSpace.SAME_COLOR_LENGTH_FOR_CACHE *";
_b = new byte[(int) (__ref._workingspace /*b4a.example.bitmapcreator*/ ._same_color_length_for_cache*4*__ref._workingspace /*b4a.example.bitmapcreator*/ ._max_same_color_size+4)];
;
RDebugUtils.currentLine=13828102;
 //BA.debugLineNum = 13828102;BA.debugLine="CBCCache.mBuffer = b";
__ref._cbccache /*b4a.example.bitmapcreator._internalcompressedbccache*/ .mBuffer = _b;
RDebugUtils.currentLine=13828103;
 //BA.debugLineNum = 13828103;BA.debugLine="X2 = vX2";
__ref._x2 /*b4a.example.x2utils*/  = _vx2;
RDebugUtils.currentLine=13828104;
 //BA.debugLineNum = 13828104;BA.debugLine="Transform.Initialize";
__ref._transform /*anywheresoftware.b4a.objects.B2Transform*/ .Initialize();
RDebugUtils.currentLine=13828105;
 //BA.debugLineNum = 13828105;BA.debugLine="RectShape.Initialize";
__ref._rectshape /*anywheresoftware.b4a.objects.B2Shape.B2PolygonShape*/ .Initialize();
RDebugUtils.currentLine=13828106;
 //BA.debugLineNum = 13828106;BA.debugLine="OutputAABB.Initialize";
__ref._outputaabb /*anywheresoftware.b4a.objects.B2AABB*/ .Initialize();
RDebugUtils.currentLine=13828107;
 //BA.debugLineNum = 13828107;BA.debugLine="InitializeIntsArray";
__ref._initializeintsarray /*String*/ (null);
RDebugUtils.currentLine=13828108;
 //BA.debugLineNum = 13828108;BA.debugLine="End Sub";
return "";
}
public b4a.example.x2spritegraphiccache._x2spritegraphicdata  _putgraphic(b4a.example.x2spritegraphiccache __ref,String _name,anywheresoftware.b4a.objects.collections.List _x2scaledbitmaps) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2spritegraphiccache";
if (Debug.shouldDelegate(ba, "putgraphic", true))
	 {return ((b4a.example.x2spritegraphiccache._x2spritegraphicdata) Debug.delegate(ba, "putgraphic", new Object[] {_name,_x2scaledbitmaps}));}
b4a.example.x2utils._x2scaledbitmap _sb = null;
boolean _antialias = false;
RDebugUtils.currentLine=14221312;
 //BA.debugLineNum = 14221312;BA.debugLine="Public Sub PutGraphic(Name As String, X2ScaledBitm";
RDebugUtils.currentLine=14221313;
 //BA.debugLineNum = 14221313;BA.debugLine="Dim sb As X2ScaledBitmap = X2ScaledBitmaps.Get(0)";
_sb = (b4a.example.x2utils._x2scaledbitmap)(_x2scaledbitmaps.Get((int) (0)));
RDebugUtils.currentLine=14221314;
 //BA.debugLineNum = 14221314;BA.debugLine="Dim antialias As Boolean = sb.Bmp.Width / sb.Scal";
_antialias = _sb.Bmp /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getWidth()/(double)_sb.Scale /*float*/ *_sb.Bmp /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getHeight()/(double)_sb.Scale /*float*/ <3000;
RDebugUtils.currentLine=14221315;
 //BA.debugLineNum = 14221315;BA.debugLine="If Name.StartsWith(TempPrefix) Then antialias = F";
if (_name.startsWith(__ref._tempprefix /*String*/ )) { 
_antialias = __c.False;};
RDebugUtils.currentLine=14221316;
 //BA.debugLineNum = 14221316;BA.debugLine="Return PutGraphic2(Name, X2ScaledBitmaps, antiali";
if (true) return __ref._putgraphic2 /*b4a.example.x2spritegraphiccache._x2spritegraphicdata*/ (null,_name,_x2scaledbitmaps,_antialias,(int) (5));
RDebugUtils.currentLine=14221317;
 //BA.debugLineNum = 14221317;BA.debugLine="End Sub";
return null;
}
public b4a.example.x2spritegraphiccache._x2spritegraphicdata  _putgraphic2(b4a.example.x2spritegraphiccache __ref,String _name,anywheresoftware.b4a.objects.collections.List _x2scaledbitmaps,boolean _antialias,int _angleinterval) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2spritegraphiccache";
if (Debug.shouldDelegate(ba, "putgraphic2", true))
	 {return ((b4a.example.x2spritegraphiccache._x2spritegraphicdata) Debug.delegate(ba, "putgraphic2", new Object[] {_name,_x2scaledbitmaps,_antialias,_angleinterval}));}
b4a.example.x2spritegraphiccache._x2spritegraphicdata _data = null;
b4a.example.x2utils._x2scaledbitmap _sb = null;
b4a.example.bitmapcreator _bc = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
b4a.example.bitmapcreator._compressedbc _cbc = null;
RDebugUtils.currentLine=14286848;
 //BA.debugLineNum = 14286848;BA.debugLine="Public Sub PutGraphic2(Name As String, X2ScaledBit";
RDebugUtils.currentLine=14286850;
 //BA.debugLineNum = 14286850;BA.debugLine="Log($\"New graphic: ${Name}\"$)";
__c.LogImpl("914286850",("New graphic: "+__c.SmartStringFormatter("",(Object)(_name))+""),0);
RDebugUtils.currentLine=14286852;
 //BA.debugLineNum = 14286852;BA.debugLine="Dim data As X2SpriteGraphicData";
_data = new b4a.example.x2spritegraphiccache._x2spritegraphicdata();
RDebugUtils.currentLine=14286853;
 //BA.debugLineNum = 14286853;BA.debugLine="data.Initialize";
_data.Initialize();
RDebugUtils.currentLine=14286854;
 //BA.debugLineNum = 14286854;BA.debugLine="data.Name = Name";
_data.Name /*String*/  = _name;
RDebugUtils.currentLine=14286855;
 //BA.debugLineNum = 14286855;BA.debugLine="data.MapsOfCompressedBCs.Initialize";
_data.MapsOfCompressedBCs /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=14286856;
 //BA.debugLineNum = 14286856;BA.debugLine="data.OriginalBCs.Initialize";
_data.OriginalBCs /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=14286857;
 //BA.debugLineNum = 14286857;BA.debugLine="data.LastUsed = DateTime.Now";
_data.LastUsed /*long*/  = __c.DateTime.getNow();
RDebugUtils.currentLine=14286858;
 //BA.debugLineNum = 14286858;BA.debugLine="For Each sb As X2ScaledBitmap In X2ScaledBitmaps";
{
final anywheresoftware.b4a.BA.IterableList group8 = _x2scaledbitmaps;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_sb = (b4a.example.x2utils._x2scaledbitmap)(group8.Get(index8));
RDebugUtils.currentLine=14286859;
 //BA.debugLineNum = 14286859;BA.debugLine="Dim bc As BitmapCreator";
_bc = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=14286860;
 //BA.debugLineNum = 14286860;BA.debugLine="bc.Initialize(sb.Bmp.Width / sb.Scale, sb.bmp.He";
_bc._initialize(ba,(int) (_sb.Bmp /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getWidth()/(double)_sb.Scale /*float*/ ),(int) (_sb.Bmp /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getHeight()/(double)_sb.Scale /*float*/ ));
RDebugUtils.currentLine=14286861;
 //BA.debugLineNum = 14286861;BA.debugLine="bc.CopyPixelsFromBitmap(sb.bmp)";
_bc._copypixelsfrombitmap(_sb.Bmp /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ );
RDebugUtils.currentLine=14286862;
 //BA.debugLineNum = 14286862;BA.debugLine="data.OriginalBCs.Add(bc)";
_data.OriginalBCs /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_bc));
RDebugUtils.currentLine=14286863;
 //BA.debugLineNum = 14286863;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14286864;
 //BA.debugLineNum = 14286864;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=14286865;
 //BA.debugLineNum = 14286865;BA.debugLine="Dim cbc As CompressedBC = bc.ExtractCompressedBC";
_cbc = _bc._extractcompressedbc(_bc._targetrect,__ref._cbccache /*b4a.example.bitmapcreator._internalcompressedbccache*/ );
RDebugUtils.currentLine=14286866;
 //BA.debugLineNum = 14286866;BA.debugLine="m.Put(0, cbc)";
_m.Put((Object)(0),(Object)(_cbc));
RDebugUtils.currentLine=14286867;
 //BA.debugLineNum = 14286867;BA.debugLine="data.MapsOfCompressedBCs.Add(m)";
_data.MapsOfCompressedBCs /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_m.getObject()));
RDebugUtils.currentLine=14286868;
 //BA.debugLineNum = 14286868;BA.debugLine="data.SizeOfAllCompressed = data.SizeOfAllCompres";
_data.SizeOfAllCompressed /*int*/  = (int) (_data.SizeOfAllCompressed /*int*/ +_cbc.mBuffer.length);
 }
};
RDebugUtils.currentLine=14286870;
 //BA.debugLineNum = 14286870;BA.debugLine="data.AngleInterval = AngleInterval";
_data.AngleInterval /*int*/  = _angleinterval;
RDebugUtils.currentLine=14286871;
 //BA.debugLineNum = 14286871;BA.debugLine="data.AntiAlias = AntiAlias";
_data.AntiAlias /*boolean*/  = _antialias;
RDebugUtils.currentLine=14286872;
 //BA.debugLineNum = 14286872;BA.debugLine="cache.Put(data.Name.ToLowerCase, data)";
__ref._cache /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_data.Name /*String*/ .toLowerCase()),(Object)(_data));
RDebugUtils.currentLine=14286873;
 //BA.debugLineNum = 14286873;BA.debugLine="TotalSize = TotalSize + data.SizeOfAllCompressed";
__ref._totalsize /*int*/  = (int) (__ref._totalsize /*int*/ +_data.SizeOfAllCompressed /*int*/ );
RDebugUtils.currentLine=14286874;
 //BA.debugLineNum = 14286874;BA.debugLine="Return data";
if (true) return _data;
RDebugUtils.currentLine=14286875;
 //BA.debugLineNum = 14286875;BA.debugLine="End Sub";
return null;
}
public b4a.example.x2spritegraphiccache._x2spritegraphicdata  _putgraphicbcs(b4a.example.x2spritegraphiccache __ref,String _name,anywheresoftware.b4a.objects.collections.List _bcs,boolean _antialias,int _angleinterval) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2spritegraphiccache";
if (Debug.shouldDelegate(ba, "putgraphicbcs", true))
	 {return ((b4a.example.x2spritegraphiccache._x2spritegraphicdata) Debug.delegate(ba, "putgraphicbcs", new Object[] {_name,_bcs,_antialias,_angleinterval}));}
b4a.example.x2spritegraphiccache._x2spritegraphicdata _data = null;
b4a.example.bitmapcreator _bc = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
b4a.example.bitmapcreator._compressedbc _cbc = null;
RDebugUtils.currentLine=14352384;
 //BA.debugLineNum = 14352384;BA.debugLine="Public Sub PutGraphicBCs(Name As String, BCs As Li";
RDebugUtils.currentLine=14352386;
 //BA.debugLineNum = 14352386;BA.debugLine="Log($\"New graphic: ${Name}\"$)";
__c.LogImpl("914352386",("New graphic: "+__c.SmartStringFormatter("",(Object)(_name))+""),0);
RDebugUtils.currentLine=14352388;
 //BA.debugLineNum = 14352388;BA.debugLine="Dim data As X2SpriteGraphicData";
_data = new b4a.example.x2spritegraphiccache._x2spritegraphicdata();
RDebugUtils.currentLine=14352389;
 //BA.debugLineNum = 14352389;BA.debugLine="data.Initialize";
_data.Initialize();
RDebugUtils.currentLine=14352390;
 //BA.debugLineNum = 14352390;BA.debugLine="data.Name = Name";
_data.Name /*String*/  = _name;
RDebugUtils.currentLine=14352391;
 //BA.debugLineNum = 14352391;BA.debugLine="data.MapsOfCompressedBCs.Initialize";
_data.MapsOfCompressedBCs /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=14352392;
 //BA.debugLineNum = 14352392;BA.debugLine="data.OriginalBCs.Initialize";
_data.OriginalBCs /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=14352393;
 //BA.debugLineNum = 14352393;BA.debugLine="data.LastUsed = DateTime.Now";
_data.LastUsed /*long*/  = __c.DateTime.getNow();
RDebugUtils.currentLine=14352394;
 //BA.debugLineNum = 14352394;BA.debugLine="data.OriginalBCs = BCs";
_data.OriginalBCs /*anywheresoftware.b4a.objects.collections.List*/  = _bcs;
RDebugUtils.currentLine=14352395;
 //BA.debugLineNum = 14352395;BA.debugLine="For Each bc As BitmapCreator In BCs";
{
final anywheresoftware.b4a.BA.IterableList group9 = _bcs;
final int groupLen9 = group9.getSize()
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_bc = (b4a.example.bitmapcreator)(group9.Get(index9));
RDebugUtils.currentLine=14352396;
 //BA.debugLineNum = 14352396;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14352397;
 //BA.debugLineNum = 14352397;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=14352398;
 //BA.debugLineNum = 14352398;BA.debugLine="Dim cbc As CompressedBC = bc.ExtractCompressedBC";
_cbc = _bc._extractcompressedbc(_bc._targetrect,__ref._cbccache /*b4a.example.bitmapcreator._internalcompressedbccache*/ );
RDebugUtils.currentLine=14352399;
 //BA.debugLineNum = 14352399;BA.debugLine="m.Put(0, cbc)";
_m.Put((Object)(0),(Object)(_cbc));
RDebugUtils.currentLine=14352400;
 //BA.debugLineNum = 14352400;BA.debugLine="data.MapsOfCompressedBCs.Add(m)";
_data.MapsOfCompressedBCs /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_m.getObject()));
RDebugUtils.currentLine=14352401;
 //BA.debugLineNum = 14352401;BA.debugLine="data.SizeOfAllCompressed = data.SizeOfAllCompres";
_data.SizeOfAllCompressed /*int*/  = (int) (_data.SizeOfAllCompressed /*int*/ +_cbc.mBuffer.length);
 }
};
RDebugUtils.currentLine=14352403;
 //BA.debugLineNum = 14352403;BA.debugLine="data.AngleInterval = AngleInterval";
_data.AngleInterval /*int*/  = _angleinterval;
RDebugUtils.currentLine=14352404;
 //BA.debugLineNum = 14352404;BA.debugLine="data.AntiAlias = AntiAlias";
_data.AntiAlias /*boolean*/  = _antialias;
RDebugUtils.currentLine=14352405;
 //BA.debugLineNum = 14352405;BA.debugLine="cache.Put(data.Name.ToLowerCase, data)";
__ref._cache /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_data.Name /*String*/ .toLowerCase()),(Object)(_data));
RDebugUtils.currentLine=14352406;
 //BA.debugLineNum = 14352406;BA.debugLine="TotalSize = TotalSize + data.SizeOfAllCompressed";
__ref._totalsize /*int*/  = (int) (__ref._totalsize /*int*/ +_data.SizeOfAllCompressed /*int*/ );
RDebugUtils.currentLine=14352407;
 //BA.debugLineNum = 14352407;BA.debugLine="Return data";
if (true) return _data;
RDebugUtils.currentLine=14352408;
 //BA.debugLineNum = 14352408;BA.debugLine="End Sub";
return null;
}
public String  _warmgraphic(b4a.example.x2spritegraphiccache __ref,String _name) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2spritegraphiccache";
if (Debug.shouldDelegate(ba, "warmgraphic", true))
	 {return ((String) Debug.delegate(ba, "warmgraphic", new Object[] {_name}));}
long _n = 0L;
b4a.example.x2spritegraphiccache._x2spritegraphicdata _data = null;
int _i = 0;
int _degrees = 0;
RDebugUtils.currentLine=14155776;
 //BA.debugLineNum = 14155776;BA.debugLine="Public Sub WarmGraphic (Name As String)";
RDebugUtils.currentLine=14155777;
 //BA.debugLineNum = 14155777;BA.debugLine="Dim n As Long = DateTime.Now";
_n = __c.DateTime.getNow();
RDebugUtils.currentLine=14155778;
 //BA.debugLineNum = 14155778;BA.debugLine="Name = Name.ToLowerCase";
_name = _name.toLowerCase();
RDebugUtils.currentLine=14155779;
 //BA.debugLineNum = 14155779;BA.debugLine="Dim data As X2SpriteGraphicData = cache.Get(Name)";
_data = (b4a.example.x2spritegraphiccache._x2spritegraphicdata)(__ref._cache /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_name)));
RDebugUtils.currentLine=14155780;
 //BA.debugLineNum = 14155780;BA.debugLine="For i = 0 To data.MapsOfCompressedBCs.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (_data.MapsOfCompressedBCs /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=14155781;
 //BA.debugLineNum = 14155781;BA.debugLine="For degrees = 0 To 359 Step data.AngleInterval";
{
final int step5 = _data.AngleInterval /*int*/ ;
final int limit5 = (int) (359);
_degrees = (int) (0) ;
for (;(step5 > 0 && _degrees <= limit5) || (step5 < 0 && _degrees >= limit5) ;_degrees = ((int)(0 + _degrees + step5))  ) {
RDebugUtils.currentLine=14155782;
 //BA.debugLineNum = 14155782;BA.debugLine="X2.GraphicCache.GetGraphic2(Name, i, degrees, F";
__ref._x2 /*b4a.example.x2utils*/ ._graphiccache /*b4a.example.x2spritegraphiccache*/ ._getgraphic2 /*b4a.example.bitmapcreator._compressedbc*/ (null,_name,_i,_degrees,__c.False,__c.False);
 }
};
 }
};
RDebugUtils.currentLine=14155786;
 //BA.debugLineNum = 14155786;BA.debugLine="Log($\"Warm graphic: ${Name}, ${DateTime.Now - n}";
__c.LogImpl("914155786",("Warm graphic: "+__c.SmartStringFormatter("",(Object)(_name))+", "+__c.SmartStringFormatter("",(Object)(__c.DateTime.getNow()-_n))+" ms"),0);
RDebugUtils.currentLine=14155788;
 //BA.debugLineNum = 14155788;BA.debugLine="End Sub";
return "";
}
}