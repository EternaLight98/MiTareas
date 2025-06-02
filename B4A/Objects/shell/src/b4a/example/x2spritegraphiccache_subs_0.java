package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class x2spritegraphiccache_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private xui As XUI";
x2spritegraphiccache._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",x2spritegraphiccache._xui);
 //BA.debugLineNum = 3;BA.debugLine="Private cache As Map";
x2spritegraphiccache._cache = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_cache",x2spritegraphiccache._cache);
 //BA.debugLineNum = 4;BA.debugLine="Type X2SpriteGraphicData (Name As String, MapsOfC";
;
 //BA.debugLineNum = 6;BA.debugLine="Private CVS(6) As B4XCanvas";
x2spritegraphiccache._cvs = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.B4XCanvas", new int[] {6}, new Object[]{});__ref.setField("_cvs",x2spritegraphiccache._cvs);
 //BA.debugLineNum = 7;BA.debugLine="Private CVSPanel(6) As B4XView";
x2spritegraphiccache._cvspanel = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.B4XViewWrapper", new int[] {6}, new Object[]{});__ref.setField("_cvspanel",x2spritegraphiccache._cvspanel);
 //BA.debugLineNum = 8;BA.debugLine="Private CVSProxy(6) As BitmapCreator";
x2spritegraphiccache._cvsproxy = RemoteObject.createNewArray ("b4a.example.bitmapcreator", new int[] {6}, new Object[]{});__ref.setField("_cvsproxy",x2spritegraphiccache._cvsproxy);
 //BA.debugLineNum = 9;BA.debugLine="Public MAX_SIZE_FOR_ANTIALIAS As Int = 300";
x2spritegraphiccache._max_size_for_antialias = BA.numberCast(int.class, 300);__ref.setField("_max_size_for_antialias",x2spritegraphiccache._max_size_for_antialias);
 //BA.debugLineNum = 10;BA.debugLine="Private WorkingSpace As BitmapCreator";
x2spritegraphiccache._workingspace = RemoteObject.createNew ("b4a.example.bitmapcreator");__ref.setField("_workingspace",x2spritegraphiccache._workingspace);
 //BA.debugLineNum = 11;BA.debugLine="Private X2 As X2Utils";
x2spritegraphiccache._x2 = RemoteObject.createNew ("b4a.example.x2utils");__ref.setField("_x2",x2spritegraphiccache._x2);
 //BA.debugLineNum = 12;BA.debugLine="Private MAX_SIZE_OF_ALL_COMPRESSEDBCS As Int = 30";
x2spritegraphiccache._max_size_of_all_compressedbcs = RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(30),RemoteObject.createImmutable(1024),RemoteObject.createImmutable(1024)}, "**",0, 1);__ref.setField("_max_size_of_all_compressedbcs",x2spritegraphiccache._max_size_of_all_compressedbcs);
 //BA.debugLineNum = 13;BA.debugLine="Private TotalSize As Int";
x2spritegraphiccache._totalsize = RemoteObject.createImmutable(0);__ref.setField("_totalsize",x2spritegraphiccache._totalsize);
 //BA.debugLineNum = 14;BA.debugLine="Private Transform As B2Transform";
x2spritegraphiccache._transform = RemoteObject.createNew ("anywheresoftware.b4a.objects.B2Transform");__ref.setField("_transform",x2spritegraphiccache._transform);
 //BA.debugLineNum = 15;BA.debugLine="Private RectShape As B2PolygonShape";
x2spritegraphiccache._rectshape = RemoteObject.createNew ("anywheresoftware.b4a.objects.B2Shape.B2PolygonShape");__ref.setField("_rectshape",x2spritegraphiccache._rectshape);
 //BA.debugLineNum = 16;BA.debugLine="Private OutputAABB As B2AABB";
x2spritegraphiccache._outputaabb = RemoteObject.createNew ("anywheresoftware.b4a.objects.B2AABB");__ref.setField("_outputaabb",x2spritegraphiccache._outputaabb);
 //BA.debugLineNum = 17;BA.debugLine="Private TempId As Int";
x2spritegraphiccache._tempid = RemoteObject.createImmutable(0);__ref.setField("_tempid",x2spritegraphiccache._tempid);
 //BA.debugLineNum = 18;BA.debugLine="Public Const TempPrefix As String = \"~temp\"";
x2spritegraphiccache._tempprefix = BA.ObjectToString("~temp");__ref.setField("_tempprefix",x2spritegraphiccache._tempprefix);
 //BA.debugLineNum = 19;BA.debugLine="Public CBCCache As InternalCompressedBCCache";
x2spritegraphiccache._cbccache = RemoteObject.createNew ("b4a.example.bitmapcreator._internalcompressedbccache");__ref.setField("_cbccache",x2spritegraphiccache._cbccache);
 //BA.debugLineNum = 20;BA.debugLine="Private AABuffer As InternalAntiAliasingBuffer";
x2spritegraphiccache._aabuffer = RemoteObject.createNew ("b4a.example.bitmapcreator._internalantialiasingbuffer");__ref.setField("_aabuffer",x2spritegraphiccache._aabuffer);
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _drawbitmapcreatorflipped(RemoteObject __ref,RemoteObject _bc,RemoteObject _source,RemoteObject _srcscalex,RemoteObject _srcscaley,RemoteObject _srcrect1,RemoteObject _fliphorizontally,RemoteObject _flipvertically,RemoteObject _flipdiagonally) throws Exception{
try {
		Debug.PushSubsStack("DrawBitmapCreatorFlipped (x2spritegraphiccache) ","x2spritegraphiccache",19,__ref.getField(false, "ba"),__ref,318);
if (RapidSub.canDelegate("drawbitmapcreatorflipped")) { return __ref.runUserSub(false, "x2spritegraphiccache","drawbitmapcreatorflipped", __ref, _bc, _source, _srcscalex, _srcscaley, _srcrect1, _fliphorizontally, _flipvertically, _flipdiagonally);}
RemoteObject _srcrectwidth = RemoteObject.createImmutable(0);
RemoteObject _srcrectheight = RemoteObject.createImmutable(0);
RemoteObject _dx = RemoteObject.createImmutable(0f);
RemoteObject _dy = RemoteObject.createImmutable(0f);
RemoteObject _startsrcx = RemoteObject.createImmutable(0f);
RemoteObject _endsrcx = RemoteObject.createImmutable(0);
RemoteObject _startsrcy = RemoteObject.createImmutable(0f);
RemoteObject _endsrcy = RemoteObject.createImmutable(0);
RemoteObject _targetx = RemoteObject.createImmutable(0);
RemoteObject _targety = RemoteObject.createImmutable(0);
RemoteObject _targetystart = RemoteObject.createImmutable(0);
RemoteObject _targetyend = RemoteObject.createImmutable(0);
RemoteObject _targetxstart = RemoteObject.createImmutable(0);
RemoteObject _targetxend = RemoteObject.createImmutable(0);
RemoteObject _srcx = RemoteObject.createImmutable(0f);
RemoteObject _srcy = RemoteObject.createImmutable(0f);
RemoteObject _ssrcx = RemoteObject.createImmutable(0);
RemoteObject _ssrcy = RemoteObject.createImmutable(0);
int _y = 0;
int _x = 0;
Debug.locals.put("bc", _bc);
Debug.locals.put("Source", _source);
Debug.locals.put("SrcScaleX", _srcscalex);
Debug.locals.put("SrcScaleY", _srcscaley);
Debug.locals.put("SrcRect1", _srcrect1);
Debug.locals.put("FlipHorizontally", _fliphorizontally);
Debug.locals.put("FlipVertically", _flipvertically);
Debug.locals.put("FlipDiagonally", _flipdiagonally);
 BA.debugLineNum = 318;BA.debugLine="Public Sub DrawBitmapCreatorFlipped (bc As BitmapC";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 320;BA.debugLine="Dim SrcRectWidth As Int = SrcRect1.Width";
Debug.JustUpdateDeviceLine();
_srcrectwidth = BA.numberCast(int.class, _srcrect1.runMethod(true,"getWidth"));Debug.locals.put("SrcRectWidth", _srcrectwidth);Debug.locals.put("SrcRectWidth", _srcrectwidth);
 BA.debugLineNum = 321;BA.debugLine="Dim SrcRectHeight As Int = SrcRect1.Height";
Debug.JustUpdateDeviceLine();
_srcrectheight = BA.numberCast(int.class, _srcrect1.runMethod(true,"getHeight"));Debug.locals.put("SrcRectHeight", _srcrectheight);Debug.locals.put("SrcRectHeight", _srcrectheight);
 BA.debugLineNum = 322;BA.debugLine="Dim dx As Float = 1 / SrcScaleX";
Debug.JustUpdateDeviceLine();
_dx = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(1),_srcscalex}, "/",0, 0));Debug.locals.put("dx", _dx);Debug.locals.put("dx", _dx);
 BA.debugLineNum = 323;BA.debugLine="Dim dy As Float = 1 / SrcScaleY";
Debug.JustUpdateDeviceLine();
_dy = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(1),_srcscaley}, "/",0, 0));Debug.locals.put("dy", _dy);Debug.locals.put("dy", _dy);
 BA.debugLineNum = 324;BA.debugLine="Dim StartSrcX As Float";
Debug.JustUpdateDeviceLine();
_startsrcx = RemoteObject.createImmutable(0f);Debug.locals.put("StartSrcX", _startsrcx);
 BA.debugLineNum = 325;BA.debugLine="Dim EndSrcX As Int";
Debug.JustUpdateDeviceLine();
_endsrcx = RemoteObject.createImmutable(0);Debug.locals.put("EndSrcX", _endsrcx);
 BA.debugLineNum = 326;BA.debugLine="Dim StartSrcY As Float";
Debug.JustUpdateDeviceLine();
_startsrcy = RemoteObject.createImmutable(0f);Debug.locals.put("StartSrcY", _startsrcy);
 BA.debugLineNum = 327;BA.debugLine="Dim EndSrcY As Int";
Debug.JustUpdateDeviceLine();
_endsrcy = RemoteObject.createImmutable(0);Debug.locals.put("EndSrcY", _endsrcy);
 BA.debugLineNum = 328;BA.debugLine="If FlipDiagonally And FlipHorizontally And FlipVe";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",_flipdiagonally) && RemoteObject.solveBoolean(".",_fliphorizontally) && RemoteObject.solveBoolean("=",_flipvertically,x2spritegraphiccache.__c.getField(true,"False"))) { 
 BA.debugLineNum = 329;BA.debugLine="FlipHorizontally = False";
Debug.JustUpdateDeviceLine();
_fliphorizontally = x2spritegraphiccache.__c.getField(true,"False");Debug.locals.put("FlipHorizontally", _fliphorizontally);
 BA.debugLineNum = 330;BA.debugLine="FlipVertically = True";
Debug.JustUpdateDeviceLine();
_flipvertically = x2spritegraphiccache.__c.getField(true,"True");Debug.locals.put("FlipVertically", _flipvertically);
 }else 
{ BA.debugLineNum = 331;BA.debugLine="Else if FlipDiagonally And FlipVertically And Fli";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",_flipdiagonally) && RemoteObject.solveBoolean(".",_flipvertically) && RemoteObject.solveBoolean("=",_fliphorizontally,x2spritegraphiccache.__c.getField(true,"False"))) { 
 BA.debugLineNum = 332;BA.debugLine="FlipHorizontally = True";
Debug.JustUpdateDeviceLine();
_fliphorizontally = x2spritegraphiccache.__c.getField(true,"True");Debug.locals.put("FlipHorizontally", _fliphorizontally);
 BA.debugLineNum = 333;BA.debugLine="FlipVertically = False";
Debug.JustUpdateDeviceLine();
_flipvertically = x2spritegraphiccache.__c.getField(true,"False");Debug.locals.put("FlipVertically", _flipvertically);
 }}
;
 BA.debugLineNum = 335;BA.debugLine="If FlipHorizontally Then";
Debug.JustUpdateDeviceLine();
if (_fliphorizontally.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 336;BA.debugLine="StartSrcX = SrcRect1.Right - dx";
Debug.JustUpdateDeviceLine();
_startsrcx = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_srcrect1.runMethod(true,"getRight"),_dx}, "-",1, 0));Debug.locals.put("StartSrcX", _startsrcx);
 BA.debugLineNum = 337;BA.debugLine="EndSrcX = SrcRect1.Left";
Debug.JustUpdateDeviceLine();
_endsrcx = BA.numberCast(int.class, _srcrect1.runMethod(true,"getLeft"));Debug.locals.put("EndSrcX", _endsrcx);
 BA.debugLineNum = 338;BA.debugLine="dx = -dx";
Debug.JustUpdateDeviceLine();
_dx = BA.numberCast(float.class, -(double) (0 + _dx.<Float>get().floatValue()));Debug.locals.put("dx", _dx);
 }else {
 BA.debugLineNum = 340;BA.debugLine="EndSrcX = SrcRect1.Right - dx";
Debug.JustUpdateDeviceLine();
_endsrcx = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_srcrect1.runMethod(true,"getRight"),_dx}, "-",1, 0));Debug.locals.put("EndSrcX", _endsrcx);
 BA.debugLineNum = 341;BA.debugLine="StartSrcX = SrcRect1.Left";
Debug.JustUpdateDeviceLine();
_startsrcx = _srcrect1.runMethod(true,"getLeft");Debug.locals.put("StartSrcX", _startsrcx);
 };
 BA.debugLineNum = 343;BA.debugLine="If FlipVertically Then";
Debug.JustUpdateDeviceLine();
if (_flipvertically.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 344;BA.debugLine="StartSrcY = SrcRect1.Bottom - dy";
Debug.JustUpdateDeviceLine();
_startsrcy = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_srcrect1.runMethod(true,"getBottom"),_dy}, "-",1, 0));Debug.locals.put("StartSrcY", _startsrcy);
 BA.debugLineNum = 345;BA.debugLine="EndSrcY = SrcRect1.Top";
Debug.JustUpdateDeviceLine();
_endsrcy = BA.numberCast(int.class, _srcrect1.runMethod(true,"getTop"));Debug.locals.put("EndSrcY", _endsrcy);
 BA.debugLineNum = 346;BA.debugLine="dy = -dy";
Debug.JustUpdateDeviceLine();
_dy = BA.numberCast(float.class, -(double) (0 + _dy.<Float>get().floatValue()));Debug.locals.put("dy", _dy);
 }else {
 BA.debugLineNum = 348;BA.debugLine="StartSrcY = SrcRect1.Top";
Debug.JustUpdateDeviceLine();
_startsrcy = _srcrect1.runMethod(true,"getTop");Debug.locals.put("StartSrcY", _startsrcy);
 BA.debugLineNum = 349;BA.debugLine="EndSrcY = SrcRect1.Bottom - dy";
Debug.JustUpdateDeviceLine();
_endsrcy = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_srcrect1.runMethod(true,"getBottom"),_dy}, "-",1, 0));Debug.locals.put("EndSrcY", _endsrcy);
 };
 BA.debugLineNum = 352;BA.debugLine="Dim TargetX As Int = 0";
Debug.JustUpdateDeviceLine();
_targetx = BA.numberCast(int.class, 0);Debug.locals.put("TargetX", _targetx);Debug.locals.put("TargetX", _targetx);
 BA.debugLineNum = 353;BA.debugLine="Dim TargetY As Int = 0";
Debug.JustUpdateDeviceLine();
_targety = BA.numberCast(int.class, 0);Debug.locals.put("TargetY", _targety);Debug.locals.put("TargetY", _targety);
 BA.debugLineNum = 354;BA.debugLine="Dim TargetYStart As Int = TargetY";
Debug.JustUpdateDeviceLine();
_targetystart = _targety;Debug.locals.put("TargetYStart", _targetystart);Debug.locals.put("TargetYStart", _targetystart);
 BA.debugLineNum = 355;BA.debugLine="Dim TargetYEnd As Int = Round((TargetY + SrcRectH";
Debug.JustUpdateDeviceLine();
_targetyend = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {x2spritegraphiccache.__c.runMethod(true,"Round",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_targety,_srcrectheight}, "+",1, 1)),_srcscaley}, "*",0, 0))),RemoteObject.createImmutable(1)}, "-",1, 2));Debug.locals.put("TargetYEnd", _targetyend);Debug.locals.put("TargetYEnd", _targetyend);
 BA.debugLineNum = 356;BA.debugLine="Dim TargetXStart As Int = TargetX";
Debug.JustUpdateDeviceLine();
_targetxstart = _targetx;Debug.locals.put("TargetXStart", _targetxstart);Debug.locals.put("TargetXStart", _targetxstart);
 BA.debugLineNum = 357;BA.debugLine="Dim TargetXEnd As Int = Round((TargetX + SrcRectW";
Debug.JustUpdateDeviceLine();
_targetxend = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {x2spritegraphiccache.__c.runMethod(true,"Round",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_targetx,_srcrectwidth}, "+",1, 1)),_srcscalex}, "*",0, 0))),RemoteObject.createImmutable(1)}, "-",1, 2));Debug.locals.put("TargetXEnd", _targetxend);Debug.locals.put("TargetXEnd", _targetxend);
 BA.debugLineNum = 362;BA.debugLine="Dim SrcX, SrcY As Float";
Debug.JustUpdateDeviceLine();
_srcx = RemoteObject.createImmutable(0f);Debug.locals.put("SrcX", _srcx);
_srcy = RemoteObject.createImmutable(0f);Debug.locals.put("SrcY", _srcy);
 BA.debugLineNum = 363;BA.debugLine="Dim SSrcX, SSrcY As Int";
Debug.JustUpdateDeviceLine();
_ssrcx = RemoteObject.createImmutable(0);Debug.locals.put("SSrcX", _ssrcx);
_ssrcy = RemoteObject.createImmutable(0);Debug.locals.put("SSrcY", _ssrcy);
 BA.debugLineNum = 364;BA.debugLine="SrcY = StartSrcY";
Debug.JustUpdateDeviceLine();
_srcy = _startsrcy;Debug.locals.put("SrcY", _srcy);
 BA.debugLineNum = 365;BA.debugLine="If FlipDiagonally Then";
Debug.JustUpdateDeviceLine();
if (_flipdiagonally.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 366;BA.debugLine="For y = TargetYStart To TargetYEnd - 1";
Debug.JustUpdateDeviceLine();
{
final int step42 = 1;
final int limit42 = RemoteObject.solve(new RemoteObject[] {_targetyend,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_y = _targetystart.<Integer>get().intValue() ;
for (;(step42 > 0 && _y <= limit42) || (step42 < 0 && _y >= limit42) ;_y = ((int)(0 + _y + step42))  ) {
Debug.locals.put("y", _y);
 BA.debugLineNum = 367;BA.debugLine="SrcX = StartSrcX";
Debug.JustUpdateDeviceLine();
_srcx = _startsrcx;Debug.locals.put("SrcX", _srcx);
 BA.debugLineNum = 368;BA.debugLine="SSrcY = SrcY";
Debug.JustUpdateDeviceLine();
_ssrcy = BA.numberCast(int.class, _srcy);Debug.locals.put("SSrcY", _ssrcy);
 BA.debugLineNum = 369;BA.debugLine="For x = TargetXStart To TargetXEnd - 1";
Debug.JustUpdateDeviceLine();
{
final int step45 = 1;
final int limit45 = RemoteObject.solve(new RemoteObject[] {_targetxend,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_x = _targetxstart.<Integer>get().intValue() ;
for (;(step45 > 0 && _x <= limit45) || (step45 < 0 && _x >= limit45) ;_x = ((int)(0 + _x + step45))  ) {
Debug.locals.put("x", _x);
 BA.debugLineNum = 370;BA.debugLine="SSrcX = SrcX";
Debug.JustUpdateDeviceLine();
_ssrcx = BA.numberCast(int.class, _srcx);Debug.locals.put("SSrcX", _ssrcx);
 BA.debugLineNum = 371;BA.debugLine="bc.CopyPixelIgnoreSemiTransparent(Source, SSrc";
Debug.JustUpdateDeviceLine();
_bc.runVoidMethod ("_copypixelignoresemitransparent",(Object)(_source),(Object)(_ssrcx),(Object)(_ssrcy),(Object)(BA.numberCast(int.class, _y)),(Object)(BA.numberCast(int.class, _x)),(Object)(x2spritegraphiccache.__c.getField(true,"True")));
 BA.debugLineNum = 372;BA.debugLine="SrcX = SrcX + dx";
Debug.JustUpdateDeviceLine();
_srcx = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_srcx,_dx}, "+",1, 0));Debug.locals.put("SrcX", _srcx);
 }
}Debug.locals.put("x", _x);
;
 BA.debugLineNum = 374;BA.debugLine="bc.CopyPixelIgnoreSemiTransparent(Source, EndSr";
Debug.JustUpdateDeviceLine();
_bc.runVoidMethod ("_copypixelignoresemitransparent",(Object)(_source),(Object)(_endsrcx),(Object)(_ssrcy),(Object)(BA.numberCast(int.class, _y)),(Object)(BA.numberCast(int.class, _x)),(Object)(x2spritegraphiccache.__c.getField(true,"True")));
 BA.debugLineNum = 375;BA.debugLine="SrcY = SrcY + dy";
Debug.JustUpdateDeviceLine();
_srcy = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_srcy,_dy}, "+",1, 0));Debug.locals.put("SrcY", _srcy);
 }
}Debug.locals.put("y", _y);
;
 BA.debugLineNum = 377;BA.debugLine="SrcX = StartSrcX";
Debug.JustUpdateDeviceLine();
_srcx = _startsrcx;Debug.locals.put("SrcX", _srcx);
 BA.debugLineNum = 378;BA.debugLine="For x = TargetXStart To TargetXEnd - 1";
Debug.JustUpdateDeviceLine();
{
final int step54 = 1;
final int limit54 = RemoteObject.solve(new RemoteObject[] {_targetxend,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_x = _targetxstart.<Integer>get().intValue() ;
for (;(step54 > 0 && _x <= limit54) || (step54 < 0 && _x >= limit54) ;_x = ((int)(0 + _x + step54))  ) {
Debug.locals.put("x", _x);
 BA.debugLineNum = 379;BA.debugLine="SSrcX = SrcX";
Debug.JustUpdateDeviceLine();
_ssrcx = BA.numberCast(int.class, _srcx);Debug.locals.put("SSrcX", _ssrcx);
 BA.debugLineNum = 380;BA.debugLine="bc.CopyPixelIgnoreSemiTransparent(Source, SSrcX";
Debug.JustUpdateDeviceLine();
_bc.runVoidMethod ("_copypixelignoresemitransparent",(Object)(_source),(Object)(_ssrcx),(Object)(_endsrcy),(Object)(BA.numberCast(int.class, _y)),(Object)(BA.numberCast(int.class, _x)),(Object)(x2spritegraphiccache.__c.getField(true,"True")));
 BA.debugLineNum = 381;BA.debugLine="SrcX = SrcX + dx";
Debug.JustUpdateDeviceLine();
_srcx = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_srcx,_dx}, "+",1, 0));Debug.locals.put("SrcX", _srcx);
 }
}Debug.locals.put("x", _x);
;
 BA.debugLineNum = 383;BA.debugLine="bc.CopyPixelIgnoreSemiTransparent(Source, EndSrc";
Debug.JustUpdateDeviceLine();
_bc.runVoidMethod ("_copypixelignoresemitransparent",(Object)(_source),(Object)(_endsrcx),(Object)(_endsrcy),(Object)(BA.numberCast(int.class, _y)),(Object)(BA.numberCast(int.class, _x)),(Object)(x2spritegraphiccache.__c.getField(true,"True")));
 }else {
 BA.debugLineNum = 385;BA.debugLine="For y = TargetYStart To TargetYEnd - 1";
Debug.JustUpdateDeviceLine();
{
final int step61 = 1;
final int limit61 = RemoteObject.solve(new RemoteObject[] {_targetyend,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_y = _targetystart.<Integer>get().intValue() ;
for (;(step61 > 0 && _y <= limit61) || (step61 < 0 && _y >= limit61) ;_y = ((int)(0 + _y + step61))  ) {
Debug.locals.put("y", _y);
 BA.debugLineNum = 386;BA.debugLine="SrcX = StartSrcX";
Debug.JustUpdateDeviceLine();
_srcx = _startsrcx;Debug.locals.put("SrcX", _srcx);
 BA.debugLineNum = 387;BA.debugLine="SSrcY = SrcY";
Debug.JustUpdateDeviceLine();
_ssrcy = BA.numberCast(int.class, _srcy);Debug.locals.put("SSrcY", _ssrcy);
 BA.debugLineNum = 388;BA.debugLine="For x = TargetXStart To TargetXEnd - 1";
Debug.JustUpdateDeviceLine();
{
final int step64 = 1;
final int limit64 = RemoteObject.solve(new RemoteObject[] {_targetxend,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_x = _targetxstart.<Integer>get().intValue() ;
for (;(step64 > 0 && _x <= limit64) || (step64 < 0 && _x >= limit64) ;_x = ((int)(0 + _x + step64))  ) {
Debug.locals.put("x", _x);
 BA.debugLineNum = 389;BA.debugLine="SSrcX = SrcX";
Debug.JustUpdateDeviceLine();
_ssrcx = BA.numberCast(int.class, _srcx);Debug.locals.put("SSrcX", _ssrcx);
 BA.debugLineNum = 400;BA.debugLine="bc.CopyPixelIgnoreSemiTransparent(Source, SSrc";
Debug.JustUpdateDeviceLine();
_bc.runVoidMethod ("_copypixelignoresemitransparent",(Object)(_source),(Object)(_ssrcx),(Object)(_ssrcy),(Object)(BA.numberCast(int.class, _x)),(Object)(BA.numberCast(int.class, _y)),(Object)(x2spritegraphiccache.__c.getField(true,"True")));
 BA.debugLineNum = 402;BA.debugLine="SrcX = SrcX + dx";
Debug.JustUpdateDeviceLine();
_srcx = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_srcx,_dx}, "+",1, 0));Debug.locals.put("SrcX", _srcx);
 }
}Debug.locals.put("x", _x);
;
 BA.debugLineNum = 404;BA.debugLine="bc.CopyPixelIgnoreSemiTransparent(Source, EndSr";
Debug.JustUpdateDeviceLine();
_bc.runVoidMethod ("_copypixelignoresemitransparent",(Object)(_source),(Object)(_endsrcx),(Object)(_ssrcy),(Object)(BA.numberCast(int.class, _x)),(Object)(BA.numberCast(int.class, _y)),(Object)(x2spritegraphiccache.__c.getField(true,"True")));
 BA.debugLineNum = 405;BA.debugLine="SrcY = SrcY + dy";
Debug.JustUpdateDeviceLine();
_srcy = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_srcy,_dy}, "+",1, 0));Debug.locals.put("SrcY", _srcy);
 }
}Debug.locals.put("y", _y);
;
 BA.debugLineNum = 407;BA.debugLine="SrcX = StartSrcX";
Debug.JustUpdateDeviceLine();
_srcx = _startsrcx;Debug.locals.put("SrcX", _srcx);
 BA.debugLineNum = 408;BA.debugLine="For x = TargetXStart To TargetXEnd - 1";
Debug.JustUpdateDeviceLine();
{
final int step73 = 1;
final int limit73 = RemoteObject.solve(new RemoteObject[] {_targetxend,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_x = _targetxstart.<Integer>get().intValue() ;
for (;(step73 > 0 && _x <= limit73) || (step73 < 0 && _x >= limit73) ;_x = ((int)(0 + _x + step73))  ) {
Debug.locals.put("x", _x);
 BA.debugLineNum = 409;BA.debugLine="SSrcX = SrcX";
Debug.JustUpdateDeviceLine();
_ssrcx = BA.numberCast(int.class, _srcx);Debug.locals.put("SSrcX", _ssrcx);
 BA.debugLineNum = 410;BA.debugLine="bc.CopyPixelIgnoreSemiTransparent(Source, SSrcX";
Debug.JustUpdateDeviceLine();
_bc.runVoidMethod ("_copypixelignoresemitransparent",(Object)(_source),(Object)(_ssrcx),(Object)(_endsrcy),(Object)(BA.numberCast(int.class, _x)),(Object)(BA.numberCast(int.class, _y)),(Object)(x2spritegraphiccache.__c.getField(true,"True")));
 BA.debugLineNum = 411;BA.debugLine="SrcX = SrcX + dx";
Debug.JustUpdateDeviceLine();
_srcx = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_srcx,_dx}, "+",1, 0));Debug.locals.put("SrcX", _srcx);
 }
}Debug.locals.put("x", _x);
;
 BA.debugLineNum = 413;BA.debugLine="bc.CopyPixelIgnoreSemiTransparent(Source, EndSrc";
Debug.JustUpdateDeviceLine();
_bc.runVoidMethod ("_copypixelignoresemitransparent",(Object)(_source),(Object)(_endsrcx),(Object)(_endsrcy),(Object)(BA.numberCast(int.class, _x)),(Object)(BA.numberCast(int.class, _y)),(Object)(x2spritegraphiccache.__c.getField(true,"True")));
 };
 BA.debugLineNum = 415;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _findrotatedrect(RemoteObject __ref,RemoteObject _input,RemoteObject _degrees) throws Exception{
try {
		Debug.PushSubsStack("FindRotatedRect (x2spritegraphiccache) ","x2spritegraphiccache",19,__ref.getField(false, "ba"),__ref,306);
if (RapidSub.canDelegate("findrotatedrect")) { return __ref.runUserSub(false, "x2spritegraphiccache","findrotatedrect", __ref, _input, _degrees);}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
Debug.locals.put("Input", _input);
Debug.locals.put("Degrees", _degrees);
 BA.debugLineNum = 306;BA.debugLine="Private Sub FindRotatedRect(Input As BitmapCreator";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 307;BA.debugLine="Transform.Angle = X2.DegreesToB2Angle(Degrees)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_transform" /*RemoteObject*/ ).runMethod(true,"setAngle",__ref.getField(false,"_x2" /*RemoteObject*/ ).runClassMethod (b4a.example.x2utils.class, "_degreestob2angle" /*RemoteObject*/ ,(Object)(_degrees)));
 BA.debugLineNum = 308;BA.debugLine="RectShape.SetAsBox(Input.mWidth / 2, Input.mHeigh";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_rectshape" /*RemoteObject*/ ).runVoidMethod ("SetAsBox",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_input.getField(true,"_mwidth"),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_input.getField(true,"_mheight"),RemoteObject.createImmutable(2)}, "/",0, 0))));
 BA.debugLineNum = 309;BA.debugLine="RectShape.ComputeAABB(OutputAABB, Transform)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_rectshape" /*RemoteObject*/ ).runVoidMethod ("ComputeAABB",(Object)(__ref.getField(false,"_outputaabb" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_transform" /*RemoteObject*/ )));
 BA.debugLineNum = 310;BA.debugLine="Dim r As B4XRect";
Debug.JustUpdateDeviceLine();
_r = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");Debug.locals.put("r", _r);
 BA.debugLineNum = 311;BA.debugLine="r.Initialize(0, 0, Ceil(OutputAABB.TopRight.X - O";
Debug.JustUpdateDeviceLine();
_r.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, x2spritegraphiccache.__c.runMethod(true,"Ceil",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_outputaabb" /*RemoteObject*/ ).runMethod(false,"getTopRight").runMethod(true,"getX"),__ref.getField(false,"_outputaabb" /*RemoteObject*/ ).runMethod(false,"getBottomLeft").runMethod(true,"getX")}, "-",1, 0))))),(Object)(BA.numberCast(float.class, x2spritegraphiccache.__c.runMethod(true,"Ceil",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_outputaabb" /*RemoteObject*/ ).runMethod(false,"getTopRight").runMethod(true,"getY"),__ref.getField(false,"_outputaabb" /*RemoteObject*/ ).runMethod(false,"getBottomLeft").runMethod(true,"getY")}, "-",1, 0))))));
 BA.debugLineNum = 312;BA.debugLine="Return r";
Debug.JustUpdateDeviceLine();
if (true) return _r;
 BA.debugLineNum = 313;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbitmapcreator(RemoteObject __ref,RemoteObject _size) throws Exception{
try {
		Debug.PushSubsStack("GetBitmapCreator (x2spritegraphiccache) ","x2spritegraphiccache",19,__ref.getField(false, "ba"),__ref,302);
if (RapidSub.canDelegate("getbitmapcreator")) { return __ref.runUserSub(false, "x2spritegraphiccache","getbitmapcreator", __ref, _size);}
Debug.locals.put("Size", _size);
 BA.debugLineNum = 302;BA.debugLine="Public Sub GetBitmapCreator(Size As Int) As Bitmap";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 303;BA.debugLine="Return GetCanvas(Size).TargetView.Tag";
Debug.JustUpdateDeviceLine();
if (true) return (__ref.runClassMethod (b4a.example.x2spritegraphiccache.class, "_getcanvas" /*RemoteObject*/ ,(Object)(_size)).runMethod(false,"getTargetView").runMethod(false,"getTag"));
 BA.debugLineNum = 304;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcanvas(RemoteObject __ref,RemoteObject _size) throws Exception{
try {
		Debug.PushSubsStack("GetCanvas (x2spritegraphiccache) ","x2spritegraphiccache",19,__ref.getField(false, "ba"),__ref,280);
if (RapidSub.canDelegate("getcanvas")) { return __ref.runUserSub(false, "x2spritegraphiccache","getcanvas", __ref, _size);}
RemoteObject _interval = RemoteObject.createImmutable(0);
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _maxsize = RemoteObject.createImmutable(0);
RemoteObject _iv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
Debug.locals.put("Size", _size);
 BA.debugLineNum = 280;BA.debugLine="Public Sub GetCanvas(Size As Int) As B4XCanvas";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 281;BA.debugLine="Dim interval As Int = MAX_SIZE_FOR_ANTIALIAS / CV";
Debug.JustUpdateDeviceLine();
_interval = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_max_size_for_antialias" /*RemoteObject*/ ),__ref.getField(false,"_cvspanel" /*RemoteObject*/ ).getField(true,"length")}, "/",0, 0));Debug.locals.put("interval", _interval);Debug.locals.put("interval", _interval);
 BA.debugLineNum = 282;BA.debugLine="Dim i As Int = Min(CVSPanel.Length - 1,  Size / i";
Debug.JustUpdateDeviceLine();
_i = BA.numberCast(int.class, x2spritegraphiccache.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvspanel" /*RemoteObject*/ ).getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1))),(Object)(RemoteObject.solve(new RemoteObject[] {_size,_interval}, "/",0, 0))));Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 283;BA.debugLine="If CVSPanel(i).IsInitialized = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_cvspanel" /*RemoteObject*/ ).getArrayElement(false,_i).runMethod(true,"IsInitialized"),x2spritegraphiccache.__c.getField(true,"False"))) { 
 BA.debugLineNum = 284;BA.debugLine="Dim MaxSize = (i + 1) * interval As Int";
Debug.JustUpdateDeviceLine();
_maxsize = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1)),_interval}, "*",0, 1);Debug.locals.put("MaxSize", _maxsize);Debug.locals.put("MaxSize", _maxsize);
 BA.debugLineNum = 285;BA.debugLine="If xui.IsB4J Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getIsB4J").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 286;BA.debugLine="CVSPanel(i) = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvspanel" /*RemoteObject*/ ).setArrayElement (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))),_i);
 }else {
 BA.debugLineNum = 288;BA.debugLine="Dim iv As ImageView";
Debug.JustUpdateDeviceLine();
_iv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");Debug.locals.put("iv", _iv);
 BA.debugLineNum = 289;BA.debugLine="iv.Initialize(\"\")";
Debug.JustUpdateDeviceLine();
_iv.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 290;BA.debugLine="CVSPanel(i) = iv";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvspanel" /*RemoteObject*/ ).setArrayElement (RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _iv.getObject()),_i);
 };
 BA.debugLineNum = 292;BA.debugLine="CVSPanel(i).SetLayoutAnimated(0, 0, 0, MaxSize *";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvspanel" /*RemoteObject*/ ).getArrayElement(false,_i).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_maxsize,__ref.getField(false,"_x2" /*RemoteObject*/ ).getField(true,"_bmpsmoothscale" /*RemoteObject*/ )}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_maxsize,__ref.getField(false,"_x2" /*RemoteObject*/ ).getField(true,"_bmpsmoothscale" /*RemoteObject*/ )}, "*",0, 0))));
 BA.debugLineNum = 294;BA.debugLine="CVS(i).Initialize(CVSPanel(i))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).getArrayElement(false,_i).runVoidMethod ("Initialize",(Object)(__ref.getField(false,"_cvspanel" /*RemoteObject*/ ).getArrayElement(false,_i)));
 BA.debugLineNum = 295;BA.debugLine="CVSProxy(i).Initialize(MaxSize, MaxSize)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvsproxy" /*RemoteObject*/ ).getArrayElement(false,_i).runVoidMethod ("_initialize",__ref.getField(false, "ba"),(Object)(_maxsize),(Object)(_maxsize));
 BA.debugLineNum = 296;BA.debugLine="CVSPanel(i).Tag = CVSProxy(i)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvspanel" /*RemoteObject*/ ).getArrayElement(false,_i).runMethod(false,"setTag",(__ref.getField(false,"_cvsproxy" /*RemoteObject*/ ).getArrayElement(false,_i)));
 };
 BA.debugLineNum = 298;BA.debugLine="Return CVS(i)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_cvs" /*RemoteObject*/ ).getArrayElement(false,_i);
 BA.debugLineNum = 299;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdrawtask(RemoteObject __ref,RemoteObject _name,RemoteObject _index,RemoteObject _degrees,RemoteObject _fliph,RemoteObject _flipv,RemoteObject _targetx,RemoteObject _targety) throws Exception{
try {
		Debug.PushSubsStack("GetDrawTask (x2spritegraphiccache) ","x2spritegraphiccache",19,__ref.getField(false, "ba"),__ref,267);
if (RapidSub.canDelegate("getdrawtask")) { return __ref.runUserSub(false, "x2spritegraphiccache","getdrawtask", __ref, _name, _index, _degrees, _fliph, _flipv, _targetx, _targety);}
RemoteObject _sprite = RemoteObject.declareNull("b4a.example.bitmapcreator._compressedbc");
RemoteObject _dt = RemoteObject.declareNull("b4a.example.bitmapcreator._drawtask");
Debug.locals.put("Name", _name);
Debug.locals.put("Index", _index);
Debug.locals.put("Degrees", _degrees);
Debug.locals.put("FlipH", _fliph);
Debug.locals.put("FlipV", _flipv);
Debug.locals.put("TargetX", _targetx);
Debug.locals.put("TargetY", _targety);
 BA.debugLineNum = 267;BA.debugLine="Public Sub GetDrawTask (Name As String, Index As I";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 268;BA.debugLine="Dim sprite As CompressedBC = GetGraphic2(Name, In";
Debug.JustUpdateDeviceLine();
_sprite = __ref.runClassMethod (b4a.example.x2spritegraphiccache.class, "_getgraphic2" /*RemoteObject*/ ,(Object)(_name),(Object)(_index),(Object)(_degrees),(Object)(_fliph),(Object)(_flipv));Debug.locals.put("sprite", _sprite);Debug.locals.put("sprite", _sprite);
 BA.debugLineNum = 269;BA.debugLine="Dim dt As DrawTask = WorkingSpace.CreateDrawTask(";
Debug.JustUpdateDeviceLine();
_dt = __ref.getField(false,"_workingspace" /*RemoteObject*/ ).runMethod(false,"_createdrawtask",(Object)((_sprite)),(Object)((x2spritegraphiccache.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(x2spritegraphiccache.__c.getField(true,"False")));Debug.locals.put("dt", _dt);Debug.locals.put("dt", _dt);
 BA.debugLineNum = 270;BA.debugLine="dt.TargetX = TargetX - sprite.mWidth / 2";
Debug.JustUpdateDeviceLine();
_dt.setField ("TargetX",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_targetx,_sprite.getField(true,"mWidth"),RemoteObject.createImmutable(2)}, "-/",1, 0)));
 BA.debugLineNum = 271;BA.debugLine="dt.TargetY = TargetY - sprite.mHeight / 2";
Debug.JustUpdateDeviceLine();
_dt.setField ("TargetY",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_targety,_sprite.getField(true,"mHeight"),RemoteObject.createImmutable(2)}, "-/",1, 0)));
 BA.debugLineNum = 272;BA.debugLine="dt.SrcRect = sprite.TargetRect";
Debug.JustUpdateDeviceLine();
_dt.setField ("SrcRect",_sprite.getField(false,"TargetRect"));
 BA.debugLineNum = 273;BA.debugLine="dt.IsCompressedSource = True";
Debug.JustUpdateDeviceLine();
_dt.setField ("IsCompressedSource",x2spritegraphiccache.__c.getField(true,"True"));
 BA.debugLineNum = 274;BA.debugLine="Return dt";
Debug.JustUpdateDeviceLine();
if (true) return _dt;
 BA.debugLineNum = 275;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getgraphic(RemoteObject __ref,RemoteObject _name,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("GetGraphic (x2spritegraphiccache) ","x2spritegraphiccache",19,__ref.getField(false, "ba"),__ref,156);
if (RapidSub.canDelegate("getgraphic")) { return __ref.runUserSub(false, "x2spritegraphiccache","getgraphic", __ref, _name, _index);}
Debug.locals.put("Name", _name);
Debug.locals.put("Index", _index);
 BA.debugLineNum = 156;BA.debugLine="Public Sub GetGraphic(Name As String, Index As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 157;BA.debugLine="Return GetGraphic2(Name, Index, 0, False, False)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4a.example.x2spritegraphiccache.class, "_getgraphic2" /*RemoteObject*/ ,(Object)(_name),(Object)(_index),(Object)(BA.numberCast(int.class, 0)),(Object)(x2spritegraphiccache.__c.getField(true,"False")),(Object)(x2spritegraphiccache.__c.getField(true,"False")));
 BA.debugLineNum = 158;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getgraphic2(RemoteObject __ref,RemoteObject _name,RemoteObject _index,RemoteObject _degrees,RemoteObject _fliphorizontally,RemoteObject _flipvertically) throws Exception{
try {
		Debug.PushSubsStack("GetGraphic2 (x2spritegraphiccache) ","x2spritegraphiccache",19,__ref.getField(false, "ba"),__ref,160);
if (RapidSub.canDelegate("getgraphic2")) { return __ref.runUserSub(false, "x2spritegraphiccache","getgraphic2", __ref, _name, _index, _degrees, _fliphorizontally, _flipvertically);}
RemoteObject _data = RemoteObject.declareNull("b4a.example.x2spritegraphiccache._x2spritegraphicdata");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _delta = RemoteObject.createImmutable(0);
RemoteObject _key = RemoteObject.createImmutable(0);
RemoteObject _tempbc = RemoteObject.declareNull("b4a.example.bitmapcreator._compressedbc");
RemoteObject _nonflippedcbc = RemoteObject.declareNull("b4a.example.bitmapcreator._compressedbc");
RemoteObject _quarter = RemoteObject.createImmutable(0);
RemoteObject _originalbc = RemoteObject.declareNull("b4a.example.bitmapcreator");
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
RemoteObject _dt = RemoteObject.declareNull("b4a.example.bitmapcreator._drawtask");
Debug.locals.put("Name", _name);
Debug.locals.put("Index", _index);
Debug.locals.put("Degrees", _degrees);
Debug.locals.put("FlipHorizontally", _fliphorizontally);
Debug.locals.put("FlipVertically", _flipvertically);
 BA.debugLineNum = 160;BA.debugLine="Public Sub GetGraphic2(Name As String, Index As In";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 161;BA.debugLine="Dim data As X2SpriteGraphicData = cache.Get(Name.";
Debug.JustUpdateDeviceLine();
_data = (__ref.getField(false,"_cache" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_name.runMethod(true,"toLowerCase")))));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 162;BA.debugLine="If data = Null Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("n",_data)) { 
 BA.debugLineNum = 163;BA.debugLine="Log($\"Error: graphic not found: ${Name}\"$)";
Debug.JustUpdateDeviceLine();
x2spritegraphiccache.__c.runVoidMethod ("LogImpl","914483459",(RemoteObject.concat(RemoteObject.createImmutable("Error: graphic not found: "),x2spritegraphiccache.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_name))),RemoteObject.createImmutable(""))),0);
 };
 BA.debugLineNum = 165;BA.debugLine="data.LastUsed = DateTime.Now";
Debug.JustUpdateDeviceLine();
_data.setField ("LastUsed" /*RemoteObject*/ ,x2spritegraphiccache.__c.getField(false,"DateTime").runMethod(true,"getNow"));
 BA.debugLineNum = 166;BA.debugLine="Dim m As Map = data.MapsOfCompressedBCs.Get(Index";
Debug.JustUpdateDeviceLine();
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _data.getField(false,"MapsOfCompressedBCs" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_index)));Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 167;BA.debugLine="Degrees = Degrees Mod 360";
Debug.JustUpdateDeviceLine();
_degrees = RemoteObject.solve(new RemoteObject[] {_degrees,RemoteObject.createImmutable(360)}, "%",0, 1);Debug.locals.put("Degrees", _degrees);
 BA.debugLineNum = 168;BA.debugLine="If Degrees < 0 Then Degrees = 360 + Degrees";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",_degrees,BA.numberCast(double.class, 0))) { 
_degrees = RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(360),_degrees}, "+",1, 1);Debug.locals.put("Degrees", _degrees);};
 BA.debugLineNum = 169;BA.debugLine="Dim delta As Int = Degrees Mod data.AngleInterval";
Debug.JustUpdateDeviceLine();
_delta = RemoteObject.solve(new RemoteObject[] {_degrees,_data.getField(true,"AngleInterval" /*RemoteObject*/ )}, "%",0, 1);Debug.locals.put("delta", _delta);Debug.locals.put("delta", _delta);
 BA.debugLineNum = 170;BA.debugLine="If delta > data.AngleInterval / 2 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_delta,RemoteObject.solve(new RemoteObject[] {_data.getField(true,"AngleInterval" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/",0, 0))) { 
 BA.debugLineNum = 171;BA.debugLine="Degrees = (Degrees - delta + data.AngleInterval)";
Debug.JustUpdateDeviceLine();
_degrees = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_degrees,_delta,_data.getField(true,"AngleInterval" /*RemoteObject*/ )}, "-+",2, 1)),RemoteObject.createImmutable(360)}, "%",0, 1);Debug.locals.put("Degrees", _degrees);
 }else {
 BA.debugLineNum = 173;BA.debugLine="Degrees = Degrees - delta";
Debug.JustUpdateDeviceLine();
_degrees = RemoteObject.solve(new RemoteObject[] {_degrees,_delta}, "-",1, 1);Debug.locals.put("Degrees", _degrees);
 };
 BA.debugLineNum = 175;BA.debugLine="Dim key As Int = Degrees";
Debug.JustUpdateDeviceLine();
_key = _degrees;Debug.locals.put("key", _key);Debug.locals.put("key", _key);
 BA.debugLineNum = 176;BA.debugLine="If FlipHorizontally Then key = key + 1000";
Debug.JustUpdateDeviceLine();
if (_fliphorizontally.<Boolean>get().booleanValue()) { 
_key = RemoteObject.solve(new RemoteObject[] {_key,RemoteObject.createImmutable(1000)}, "+",1, 1);Debug.locals.put("key", _key);};
 BA.debugLineNum = 177;BA.debugLine="If FlipVertically Then key = key + 2000";
Debug.JustUpdateDeviceLine();
if (_flipvertically.<Boolean>get().booleanValue()) { 
_key = RemoteObject.solve(new RemoteObject[] {_key,RemoteObject.createImmutable(2000)}, "+",1, 1);Debug.locals.put("key", _key);};
 BA.debugLineNum = 178;BA.debugLine="If m.ContainsKey(key) Then Return m.Get(key)";
Debug.JustUpdateDeviceLine();
if (_m.runMethod(true,"ContainsKey",(Object)((_key))).<Boolean>get().booleanValue()) { 
if (true) return (_m.runMethod(false,"Get",(Object)((_key))));};
 BA.debugLineNum = 180;BA.debugLine="Dim TempBC As CompressedBC";
Debug.JustUpdateDeviceLine();
_tempbc = RemoteObject.createNew ("b4a.example.bitmapcreator._compressedbc");Debug.locals.put("TempBC", _tempbc);
 BA.debugLineNum = 181;BA.debugLine="If FlipHorizontally <> FlipVertically Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_fliphorizontally,_flipvertically)) { 
 BA.debugLineNum = 182;BA.debugLine="Dim NonFlippedCbc As CompressedBC = GetGraphic2(";
Debug.JustUpdateDeviceLine();
_nonflippedcbc = __ref.runClassMethod (b4a.example.x2spritegraphiccache.class, "_getgraphic2" /*RemoteObject*/ ,(Object)(_name),(Object)(_index),(Object)(BA.numberCast(int.class, -(double) (0 + _degrees.<Integer>get().intValue()))),(Object)(x2spritegraphiccache.__c.getField(true,"False")),(Object)(x2spritegraphiccache.__c.getField(true,"False")));Debug.locals.put("NonFlippedCbc", _nonflippedcbc);Debug.locals.put("NonFlippedCbc", _nonflippedcbc);
 BA.debugLineNum = 183;BA.debugLine="TempBC = WorkingSpace.FlipCompressedBitmap(NonFl";
Debug.JustUpdateDeviceLine();
_tempbc = __ref.getField(false,"_workingspace" /*RemoteObject*/ ).runMethod(false,"_flipcompressedbitmap",(Object)(_nonflippedcbc),(Object)(_fliphorizontally),(Object)(_flipvertically));Debug.locals.put("TempBC", _tempbc);
 }else 
{ BA.debugLineNum = 184;BA.debugLine="Else If FlipHorizontally And FlipVertically Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",_fliphorizontally) && RemoteObject.solveBoolean(".",_flipvertically)) { 
 BA.debugLineNum = 185;BA.debugLine="TempBC = GetGraphic2(Name, Index, Degrees + 180,";
Debug.JustUpdateDeviceLine();
_tempbc = __ref.runClassMethod (b4a.example.x2spritegraphiccache.class, "_getgraphic2" /*RemoteObject*/ ,(Object)(_name),(Object)(_index),(Object)(RemoteObject.solve(new RemoteObject[] {_degrees,RemoteObject.createImmutable(180)}, "+",1, 1)),(Object)(x2spritegraphiccache.__c.getField(true,"False")),(Object)(x2spritegraphiccache.__c.getField(true,"False")));Debug.locals.put("TempBC", _tempbc);
 }else 
{ BA.debugLineNum = 186;BA.debugLine="Else If Degrees > 90 And (data.VerticalSymmetry O";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_degrees,BA.numberCast(double.class, 90)) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(".",_data.getField(true,"VerticalSymmetry" /*RemoteObject*/ )) || RemoteObject.solveBoolean(".",_data.getField(true,"HorizontalSymmetry" /*RemoteObject*/ )))))) { 
 BA.debugLineNum = 187;BA.debugLine="Dim quarter As Int = Degrees / 90";
Debug.JustUpdateDeviceLine();
_quarter = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_degrees,RemoteObject.createImmutable(90)}, "/",0, 0));Debug.locals.put("quarter", _quarter);Debug.locals.put("quarter", _quarter);
 BA.debugLineNum = 188;BA.debugLine="Select quarter";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_quarter,BA.numberCast(int.class, 1),BA.numberCast(int.class, 2),BA.numberCast(int.class, 3))) {
case 0: {
 BA.debugLineNum = 190;BA.debugLine="TempBC = GetGraphic2(Name, Index, 180 - Degree";
Debug.JustUpdateDeviceLine();
_tempbc = __ref.runClassMethod (b4a.example.x2spritegraphiccache.class, "_getgraphic2" /*RemoteObject*/ ,(Object)(_name),(Object)(_index),(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(180),_degrees}, "-",1, 1)),(Object)(x2spritegraphiccache.__c.getField(true,"False")),(Object)(x2spritegraphiccache.__c.getField(true,"False")));Debug.locals.put("TempBC", _tempbc);
 BA.debugLineNum = 191;BA.debugLine="TempBC = WorkingSpace.FlipCompressedBitmap(Tem";
Debug.JustUpdateDeviceLine();
_tempbc = __ref.getField(false,"_workingspace" /*RemoteObject*/ ).runMethod(false,"_flipcompressedbitmap",(Object)(_tempbc),(Object)(x2spritegraphiccache.__c.runMethod(true,"Not",(Object)(_data.getField(true,"HorizontalSymmetry" /*RemoteObject*/ )))),(Object)(_data.getField(true,"HorizontalSymmetry" /*RemoteObject*/ )));Debug.locals.put("TempBC", _tempbc);
 break; }
case 1: {
 BA.debugLineNum = 193;BA.debugLine="TempBC = GetGraphic2(Name, Index, Degrees - 18";
Debug.JustUpdateDeviceLine();
_tempbc = __ref.runClassMethod (b4a.example.x2spritegraphiccache.class, "_getgraphic2" /*RemoteObject*/ ,(Object)(_name),(Object)(_index),(Object)(RemoteObject.solve(new RemoteObject[] {_degrees,RemoteObject.createImmutable(180)}, "-",1, 1)),(Object)(x2spritegraphiccache.__c.getField(true,"False")),(Object)(x2spritegraphiccache.__c.getField(true,"False")));Debug.locals.put("TempBC", _tempbc);
 BA.debugLineNum = 194;BA.debugLine="TempBC = WorkingSpace.FlipCompressedBitmap(Tem";
Debug.JustUpdateDeviceLine();
_tempbc = __ref.getField(false,"_workingspace" /*RemoteObject*/ ).runMethod(false,"_flipcompressedbitmap",(Object)(_tempbc),(Object)(x2spritegraphiccache.__c.getField(true,"True")),(Object)(x2spritegraphiccache.__c.getField(true,"True")));Debug.locals.put("TempBC", _tempbc);
 break; }
case 2: {
 BA.debugLineNum = 196;BA.debugLine="TempBC = GetGraphic2(Name, Index, 360 - Degree";
Debug.JustUpdateDeviceLine();
_tempbc = __ref.runClassMethod (b4a.example.x2spritegraphiccache.class, "_getgraphic2" /*RemoteObject*/ ,(Object)(_name),(Object)(_index),(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(360),_degrees}, "-",1, 1)),(Object)(x2spritegraphiccache.__c.getField(true,"False")),(Object)(x2spritegraphiccache.__c.getField(true,"False")));Debug.locals.put("TempBC", _tempbc);
 BA.debugLineNum = 197;BA.debugLine="TempBC = WorkingSpace.FlipCompressedBitmap(Tem";
Debug.JustUpdateDeviceLine();
_tempbc = __ref.getField(false,"_workingspace" /*RemoteObject*/ ).runMethod(false,"_flipcompressedbitmap",(Object)(_tempbc),(Object)(x2spritegraphiccache.__c.runMethod(true,"Not",(Object)(_data.getField(true,"VerticalSymmetry" /*RemoteObject*/ )))),(Object)(_data.getField(true,"VerticalSymmetry" /*RemoteObject*/ )));Debug.locals.put("TempBC", _tempbc);
 break; }
}
;
 }else 
{ BA.debugLineNum = 199;BA.debugLine="Else If Degrees >= 180 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("g",_degrees,BA.numberCast(double.class, 180))) { 
 BA.debugLineNum = 200;BA.debugLine="TempBC = GetGraphic2(Name, Index, Degrees - 180,";
Debug.JustUpdateDeviceLine();
_tempbc = __ref.runClassMethod (b4a.example.x2spritegraphiccache.class, "_getgraphic2" /*RemoteObject*/ ,(Object)(_name),(Object)(_index),(Object)(RemoteObject.solve(new RemoteObject[] {_degrees,RemoteObject.createImmutable(180)}, "-",1, 1)),(Object)(x2spritegraphiccache.__c.getField(true,"False")),(Object)(x2spritegraphiccache.__c.getField(true,"False")));Debug.locals.put("TempBC", _tempbc);
 BA.debugLineNum = 201;BA.debugLine="TempBC = WorkingSpace.FlipCompressedBitmap(TempB";
Debug.JustUpdateDeviceLine();
_tempbc = __ref.getField(false,"_workingspace" /*RemoteObject*/ ).runMethod(false,"_flipcompressedbitmap",(Object)(_tempbc),(Object)(x2spritegraphiccache.__c.getField(true,"True")),(Object)(x2spritegraphiccache.__c.getField(true,"True")));Debug.locals.put("TempBC", _tempbc);
 }else {
 BA.debugLineNum = 203;BA.debugLine="Dim OriginalBC As BitmapCreator = data.OriginalB";
Debug.JustUpdateDeviceLine();
_originalbc = (_data.getField(false,"OriginalBCs" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_index)));Debug.locals.put("OriginalBC", _originalbc);Debug.locals.put("OriginalBC", _originalbc);
 BA.debugLineNum = 204;BA.debugLine="Dim r As B4XRect = FindRotatedRect(OriginalBC, D";
Debug.JustUpdateDeviceLine();
_r = __ref.runClassMethod (b4a.example.x2spritegraphiccache.class, "_findrotatedrect" /*RemoteObject*/ ,(Object)(_originalbc),(Object)(_degrees));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 205;BA.debugLine="Dim dt As DrawTask = WorkingSpace.CreateDrawTask";
Debug.JustUpdateDeviceLine();
_dt = __ref.getField(false,"_workingspace" /*RemoteObject*/ ).runMethod(false,"_createdrawtask",(Object)((_originalbc)),(Object)(_originalbc.getField(false,"_targetrect")),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(x2spritegraphiccache.__c.getField(true,"True")));Debug.locals.put("dt", _dt);Debug.locals.put("dt", _dt);
 BA.debugLineNum = 206;BA.debugLine="dt.Degrees = Degrees";
Debug.JustUpdateDeviceLine();
_dt.setField ("Degrees",_degrees);
 BA.debugLineNum = 207;BA.debugLine="If r.Width > WorkingSpace.mWidth Or r.Height > W";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_r.runMethod(true,"getWidth"),BA.numberCast(double.class, __ref.getField(false,"_workingspace" /*RemoteObject*/ ).getField(true,"_mwidth"))) || RemoteObject.solveBoolean(">",_r.runMethod(true,"getHeight"),BA.numberCast(double.class, __ref.getField(false,"_workingspace" /*RemoteObject*/ ).getField(true,"_mheight")))) { 
 BA.debugLineNum = 208;BA.debugLine="Log(\"Increasing WorkingSpace size.\")";
Debug.JustUpdateDeviceLine();
x2spritegraphiccache.__c.runVoidMethod ("LogImpl","914483504",RemoteObject.createImmutable("Increasing WorkingSpace size."),0);
 BA.debugLineNum = 209;BA.debugLine="Dim WorkingSpace As BitmapCreator";
Debug.JustUpdateDeviceLine();
x2spritegraphiccache._workingspace = RemoteObject.createNew ("b4a.example.bitmapcreator");__ref.setField("_workingspace",x2spritegraphiccache._workingspace);
 BA.debugLineNum = 210;BA.debugLine="WorkingSpace.Initialize(r.Width * 1.4, r.Height";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_workingspace" /*RemoteObject*/ ).runVoidMethod ("_initialize",__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getWidth"),RemoteObject.createImmutable(1.4)}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getHeight"),RemoteObject.createImmutable(1.4)}, "*",0, 0))));
 BA.debugLineNum = 211;BA.debugLine="InitializeIntsArray";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.x2spritegraphiccache.class, "_initializeintsarray" /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 213;BA.debugLine="WorkingSpace.FillRect(xui.Color_Transparent, r)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_workingspace" /*RemoteObject*/ ).runVoidMethod ("_fillrect",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(_r));
 };
 BA.debugLineNum = 215;BA.debugLine="If data.AntiAlias And Degrees Mod 90 <> 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",_data.getField(true,"AntiAlias" /*RemoteObject*/ )) && RemoteObject.solveBoolean("!",RemoteObject.solve(new RemoteObject[] {_degrees,RemoteObject.createImmutable(90)}, "%",0, 1),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 216;BA.debugLine="WorkingSpace.DrawRotatedCBC(m.Get(0), Degrees,";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_workingspace" /*RemoteObject*/ ).runVoidMethod ("_drawrotatedcbc",(Object)((_m.runMethod(false,"Get",(Object)(RemoteObject.createImmutable((0)))))),(Object)(BA.numberCast(float.class, _degrees)),(Object)(BA.numberCast(int.class, _r.runMethod(true,"getWidth"))),(Object)(BA.numberCast(int.class, _r.runMethod(true,"getHeight"))),(Object)(__ref.getField(false,"_aabuffer" /*RemoteObject*/ )));
 }else {
 BA.debugLineNum = 218;BA.debugLine="WorkingSpace.DrawBitmapCreatorTransformed(dt)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_workingspace" /*RemoteObject*/ ).runVoidMethod ("_drawbitmapcreatortransformed",(Object)(_dt));
 };
 BA.debugLineNum = 220;BA.debugLine="TempBC = WorkingSpace.ExtractCompressedBC(r, CBC";
Debug.JustUpdateDeviceLine();
_tempbc = __ref.getField(false,"_workingspace" /*RemoteObject*/ ).runMethod(false,"_extractcompressedbc",(Object)(_r),(Object)(__ref.getField(false,"_cbccache" /*RemoteObject*/ )));Debug.locals.put("TempBC", _tempbc);
 }}}}
;
 BA.debugLineNum = 223;BA.debugLine="m.Put(key, TempBC)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)((_key)),(Object)((_tempbc)));
 BA.debugLineNum = 225;BA.debugLine="data.SizeOfAllCompressed = data.SizeOfAllCompress";
Debug.JustUpdateDeviceLine();
_data.setField ("SizeOfAllCompressed" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {_data.getField(true,"SizeOfAllCompressed" /*RemoteObject*/ ),_tempbc.getField(false,"mBuffer").getField(true,"length")}, "+",1, 1));
 BA.debugLineNum = 226;BA.debugLine="TotalSize = TotalSize + TempBC.mBuffer.Length";
Debug.JustUpdateDeviceLine();
__ref.setField ("_totalsize" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_totalsize" /*RemoteObject*/ ),_tempbc.getField(false,"mBuffer").getField(true,"length")}, "+",1, 1));
 BA.debugLineNum = 227;BA.debugLine="If TotalSize > MAX_SIZE_OF_ALL_COMPRESSEDBCS Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_totalsize" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_max_size_of_all_compressedbcs" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 228;BA.debugLine="TrimCache";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.x2spritegraphiccache.class, "_trimcache" /*RemoteObject*/ );
 };
 BA.debugLineNum = 231;BA.debugLine="Return TempBC";
Debug.JustUpdateDeviceLine();
if (true) return _tempbc;
 BA.debugLineNum = 232;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getgraphicscount(RemoteObject __ref,RemoteObject _name) throws Exception{
try {
		Debug.PushSubsStack("GetGraphicsCount (x2spritegraphiccache) ","x2spritegraphiccache",19,__ref.getField(false, "ba"),__ref,62);
if (RapidSub.canDelegate("getgraphicscount")) { return __ref.runUserSub(false, "x2spritegraphiccache","getgraphicscount", __ref, _name);}
RemoteObject _data = RemoteObject.declareNull("b4a.example.x2spritegraphiccache._x2spritegraphicdata");
Debug.locals.put("Name", _name);
 BA.debugLineNum = 62;BA.debugLine="Public Sub GetGraphicsCount(Name As String) As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 63;BA.debugLine="Dim data As X2SpriteGraphicData = cache.Get(Name.";
Debug.JustUpdateDeviceLine();
_data = (__ref.getField(false,"_cache" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_name.runMethod(true,"toLowerCase")))));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 64;BA.debugLine="If data = Null Then Return 0";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("n",_data)) { 
if (true) return BA.numberCast(int.class, 0);};
 BA.debugLineNum = 65;BA.debugLine="Return data.OriginalBCs.Size";
Debug.JustUpdateDeviceLine();
if (true) return _data.getField(false,"OriginalBCs" /*RemoteObject*/ ).runMethod(true,"getSize");
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getgraphicsizemeters(RemoteObject __ref,RemoteObject _name,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("GetGraphicSizeMeters (x2spritegraphiccache) ","x2spritegraphiccache",19,__ref.getField(false, "ba"),__ref,53);
if (RapidSub.canDelegate("getgraphicsizemeters")) { return __ref.runUserSub(false, "x2spritegraphiccache","getgraphicsizemeters", __ref, _name, _index);}
RemoteObject _data = RemoteObject.declareNull("b4a.example.x2spritegraphiccache._x2spritegraphicdata");
RemoteObject _bc = RemoteObject.declareNull("b4a.example.bitmapcreator");
RemoteObject _vec = RemoteObject.declareNull("anywheresoftware.b4a.objects.B2Vec2");
Debug.locals.put("Name", _name);
Debug.locals.put("Index", _index);
 BA.debugLineNum = 53;BA.debugLine="Public Sub GetGraphicSizeMeters (Name As String, I";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 54;BA.debugLine="Dim data As X2SpriteGraphicData = cache.Get(Name.";
Debug.JustUpdateDeviceLine();
_data = (__ref.getField(false,"_cache" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_name.runMethod(true,"toLowerCase")))));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 55;BA.debugLine="Dim bc As BitmapCreator = data.OriginalBCs.Get(In";
Debug.JustUpdateDeviceLine();
_bc = (_data.getField(false,"OriginalBCs" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_index)));Debug.locals.put("bc", _bc);Debug.locals.put("bc", _bc);
 BA.debugLineNum = 56;BA.debugLine="Dim vec As B2Vec2";
Debug.JustUpdateDeviceLine();
_vec = RemoteObject.createNew ("anywheresoftware.b4a.objects.B2Vec2");Debug.locals.put("vec", _vec);
 BA.debugLineNum = 57;BA.debugLine="vec.X = bc.mWidth / X2.mBCPixelsPerMeter";
Debug.JustUpdateDeviceLine();
_vec.runMethod(true,"setX",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_bc.getField(true,"_mwidth"),__ref.getField(false,"_x2" /*RemoteObject*/ ).getField(true,"_mbcpixelspermeter" /*RemoteObject*/ )}, "/",0, 0)));
 BA.debugLineNum = 58;BA.debugLine="vec.Y = bc.mHeight / X2.mBCPixelsPerMeter";
Debug.JustUpdateDeviceLine();
_vec.runMethod(true,"setY",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_bc.getField(true,"_mheight"),__ref.getField(false,"_x2" /*RemoteObject*/ ).getField(true,"_mbcpixelspermeter" /*RemoteObject*/ )}, "/",0, 0)));
 BA.debugLineNum = 59;BA.debugLine="Return vec";
Debug.JustUpdateDeviceLine();
if (true) return _vec;
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettempname(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetTempName (x2spritegraphiccache) ","x2spritegraphiccache",19,__ref.getField(false, "ba"),__ref,47);
if (RapidSub.canDelegate("gettempname")) { return __ref.runUserSub(false, "x2spritegraphiccache","gettempname", __ref);}
 BA.debugLineNum = 47;BA.debugLine="Public Sub GetTempName As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 48;BA.debugLine="TempId = TempId + 1";
Debug.JustUpdateDeviceLine();
__ref.setField ("_tempid" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_tempid" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 49;BA.debugLine="Return TempPrefix & TempId";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.concat(__ref.getField(true,"_tempprefix" /*RemoteObject*/ ),__ref.getField(true,"_tempid" /*RemoteObject*/ ));
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _vx2) throws Exception{
try {
		Debug.PushSubsStack("Initialize (x2spritegraphiccache) ","x2spritegraphiccache",19,__ref.getField(false, "ba"),__ref,23);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "x2spritegraphiccache","initialize", __ref, _ba, _vx2);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _b = null;
Debug.locals.put("ba", _ba);
Debug.locals.put("vX2", _vx2);
 BA.debugLineNum = 23;BA.debugLine="Public Sub Initialize (vX2 As X2Utils)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 24;BA.debugLine="CBCCache.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cbccache" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 25;BA.debugLine="CBCCache.ColorsMap.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cbccache" /*RemoteObject*/ ).getField(false,"ColorsMap").runVoidMethod ("Initialize");
 BA.debugLineNum = 26;BA.debugLine="cache.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cache" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 27;BA.debugLine="WorkingSpace.Initialize(300, 300)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_workingspace" /*RemoteObject*/ ).runVoidMethod ("_initialize",__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 300)),(Object)(BA.numberCast(int.class, 300)));
 BA.debugLineNum = 28;BA.debugLine="Dim b(WorkingSpace.SAME_COLOR_LENGTH_FOR_CACHE *";
Debug.JustUpdateDeviceLine();
_b = RemoteObject.createNewArray ("byte", new int[] {RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_workingspace" /*RemoteObject*/ ).getField(true,"_same_color_length_for_cache"),RemoteObject.createImmutable(4),__ref.getField(false,"_workingspace" /*RemoteObject*/ ).getField(true,"_max_same_color_size"),RemoteObject.createImmutable(4)}, "**+",1, 1).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("b", _b);
 BA.debugLineNum = 29;BA.debugLine="CBCCache.mBuffer = b";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cbccache" /*RemoteObject*/ ).setField ("mBuffer",_b);
 BA.debugLineNum = 30;BA.debugLine="X2 = vX2";
Debug.JustUpdateDeviceLine();
__ref.setField ("_x2" /*RemoteObject*/ ,_vx2);
 BA.debugLineNum = 31;BA.debugLine="Transform.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_transform" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 32;BA.debugLine="RectShape.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_rectshape" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 33;BA.debugLine="OutputAABB.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_outputaabb" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 34;BA.debugLine="InitializeIntsArray";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.x2spritegraphiccache.class, "_initializeintsarray" /*RemoteObject*/ );
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initializeintsarray(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("InitializeIntsArray (x2spritegraphiccache) ","x2spritegraphiccache",19,__ref.getField(false, "ba"),__ref,37);
if (RapidSub.canDelegate("initializeintsarray")) { return __ref.runUserSub(false, "x2spritegraphiccache","initializeintsarray", __ref);}
RemoteObject _intsarray = null;
 BA.debugLineNum = 37;BA.debugLine="Private Sub InitializeIntsArray";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 38;BA.debugLine="AABuffer.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_aabuffer" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 42;BA.debugLine="Dim IntsArray(WorkingSpace.mWidth * WorkingSpace.";
Debug.JustUpdateDeviceLine();
_intsarray = RemoteObject.createNewArray ("int", new int[] {RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_workingspace" /*RemoteObject*/ ).getField(true,"_mwidth"),__ref.getField(false,"_workingspace" /*RemoteObject*/ ).getField(true,"_mheight"),RemoteObject.createImmutable(5)}, "**",0, 1).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("IntsArray", _intsarray);
 BA.debugLineNum = 44;BA.debugLine="AABuffer.IntsArray = IntsArray";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_aabuffer" /*RemoteObject*/ ).setField ("IntsArray",_intsarray);
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _putgraphic(RemoteObject __ref,RemoteObject _name,RemoteObject _x2scaledbitmaps) throws Exception{
try {
		Debug.PushSubsStack("PutGraphic (x2spritegraphiccache) ","x2spritegraphiccache",19,__ref.getField(false, "ba"),__ref,86);
if (RapidSub.canDelegate("putgraphic")) { return __ref.runUserSub(false, "x2spritegraphiccache","putgraphic", __ref, _name, _x2scaledbitmaps);}
RemoteObject _sb = RemoteObject.declareNull("b4a.example.x2utils._x2scaledbitmap");
RemoteObject _antialias = RemoteObject.createImmutable(false);
Debug.locals.put("Name", _name);
Debug.locals.put("X2ScaledBitmaps", _x2scaledbitmaps);
 BA.debugLineNum = 86;BA.debugLine="Public Sub PutGraphic(Name As String, X2ScaledBitm";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 87;BA.debugLine="Dim sb As X2ScaledBitmap = X2ScaledBitmaps.Get(0)";
Debug.JustUpdateDeviceLine();
_sb = (_x2scaledbitmaps.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("sb", _sb);Debug.locals.put("sb", _sb);
 BA.debugLineNum = 88;BA.debugLine="Dim antialias As Boolean = sb.Bmp.Width / sb.Scal";
Debug.JustUpdateDeviceLine();
_antialias = BA.ObjectToBoolean(RemoteObject.solveBoolean("<",RemoteObject.solve(new RemoteObject[] {_sb.getField(false,"Bmp" /*RemoteObject*/ ).runMethod(true,"getWidth"),_sb.getField(true,"Scale" /*RemoteObject*/ ),_sb.getField(false,"Bmp" /*RemoteObject*/ ).runMethod(true,"getHeight"),_sb.getField(true,"Scale" /*RemoteObject*/ )}, "/*/",0, 0),BA.numberCast(double.class, 3000)));Debug.locals.put("antialias", _antialias);Debug.locals.put("antialias", _antialias);
 BA.debugLineNum = 89;BA.debugLine="If Name.StartsWith(TempPrefix) Then antialias = F";
Debug.JustUpdateDeviceLine();
if (_name.runMethod(true,"startsWith",(Object)(__ref.getField(true,"_tempprefix" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
_antialias = x2spritegraphiccache.__c.getField(true,"False");Debug.locals.put("antialias", _antialias);};
 BA.debugLineNum = 90;BA.debugLine="Return PutGraphic2(Name, X2ScaledBitmaps, antiali";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4a.example.x2spritegraphiccache.class, "_putgraphic2" /*RemoteObject*/ ,(Object)(_name),(Object)(_x2scaledbitmaps),(Object)(_antialias),(Object)(BA.numberCast(int.class, 5)));
 BA.debugLineNum = 91;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _putgraphic2(RemoteObject __ref,RemoteObject _name,RemoteObject _x2scaledbitmaps,RemoteObject _antialias,RemoteObject _angleinterval) throws Exception{
try {
		Debug.PushSubsStack("PutGraphic2 (x2spritegraphiccache) ","x2spritegraphiccache",19,__ref.getField(false, "ba"),__ref,97);
if (RapidSub.canDelegate("putgraphic2")) { return __ref.runUserSub(false, "x2spritegraphiccache","putgraphic2", __ref, _name, _x2scaledbitmaps, _antialias, _angleinterval);}
RemoteObject _data = RemoteObject.declareNull("b4a.example.x2spritegraphiccache._x2spritegraphicdata");
RemoteObject _sb = RemoteObject.declareNull("b4a.example.x2utils._x2scaledbitmap");
RemoteObject _bc = RemoteObject.declareNull("b4a.example.bitmapcreator");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _cbc = RemoteObject.declareNull("b4a.example.bitmapcreator._compressedbc");
Debug.locals.put("Name", _name);
Debug.locals.put("X2ScaledBitmaps", _x2scaledbitmaps);
Debug.locals.put("AntiAlias", _antialias);
Debug.locals.put("AngleInterval", _angleinterval);
 BA.debugLineNum = 97;BA.debugLine="Public Sub PutGraphic2(Name As String, X2ScaledBit";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 99;BA.debugLine="Log($\"New graphic: ${Name}\"$)";
Debug.JustUpdateDeviceLine();
x2spritegraphiccache.__c.runVoidMethod ("LogImpl","914286850",(RemoteObject.concat(RemoteObject.createImmutable("New graphic: "),x2spritegraphiccache.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_name))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 101;BA.debugLine="Dim data As X2SpriteGraphicData";
Debug.JustUpdateDeviceLine();
_data = RemoteObject.createNew ("b4a.example.x2spritegraphiccache._x2spritegraphicdata");Debug.locals.put("data", _data);
 BA.debugLineNum = 102;BA.debugLine="data.Initialize";
Debug.JustUpdateDeviceLine();
_data.runVoidMethod ("Initialize");
 BA.debugLineNum = 103;BA.debugLine="data.Name = Name";
Debug.JustUpdateDeviceLine();
_data.setField ("Name" /*RemoteObject*/ ,_name);
 BA.debugLineNum = 104;BA.debugLine="data.MapsOfCompressedBCs.Initialize";
Debug.JustUpdateDeviceLine();
_data.getField(false,"MapsOfCompressedBCs" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 105;BA.debugLine="data.OriginalBCs.Initialize";
Debug.JustUpdateDeviceLine();
_data.getField(false,"OriginalBCs" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 106;BA.debugLine="data.LastUsed = DateTime.Now";
Debug.JustUpdateDeviceLine();
_data.setField ("LastUsed" /*RemoteObject*/ ,x2spritegraphiccache.__c.getField(false,"DateTime").runMethod(true,"getNow"));
 BA.debugLineNum = 107;BA.debugLine="For Each sb As X2ScaledBitmap In X2ScaledBitmaps";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group8 = _x2scaledbitmaps;
final int groupLen8 = group8.runMethod(true,"getSize").<Integer>get()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_sb = (group8.runMethod(false,"Get",index8));Debug.locals.put("sb", _sb);
Debug.locals.put("sb", _sb);
 BA.debugLineNum = 108;BA.debugLine="Dim bc As BitmapCreator";
Debug.JustUpdateDeviceLine();
_bc = RemoteObject.createNew ("b4a.example.bitmapcreator");Debug.locals.put("bc", _bc);
 BA.debugLineNum = 109;BA.debugLine="bc.Initialize(sb.Bmp.Width / sb.Scale, sb.bmp.He";
Debug.JustUpdateDeviceLine();
_bc.runVoidMethod ("_initialize",__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_sb.getField(false,"Bmp" /*RemoteObject*/ ).runMethod(true,"getWidth"),_sb.getField(true,"Scale" /*RemoteObject*/ )}, "/",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_sb.getField(false,"Bmp" /*RemoteObject*/ ).runMethod(true,"getHeight"),_sb.getField(true,"Scale" /*RemoteObject*/ )}, "/",0, 0))));
 BA.debugLineNum = 110;BA.debugLine="bc.CopyPixelsFromBitmap(sb.bmp)";
Debug.JustUpdateDeviceLine();
_bc.runVoidMethod ("_copypixelsfrombitmap",(Object)(_sb.getField(false,"Bmp" /*RemoteObject*/ )));
 BA.debugLineNum = 111;BA.debugLine="data.OriginalBCs.Add(bc)";
Debug.JustUpdateDeviceLine();
_data.getField(false,"OriginalBCs" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_bc)));
 BA.debugLineNum = 112;BA.debugLine="Dim m As Map";
Debug.JustUpdateDeviceLine();
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 113;BA.debugLine="m.Initialize";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 114;BA.debugLine="Dim cbc As CompressedBC = bc.ExtractCompressedBC";
Debug.JustUpdateDeviceLine();
_cbc = _bc.runMethod(false,"_extractcompressedbc",(Object)(_bc.getField(false,"_targetrect")),(Object)(__ref.getField(false,"_cbccache" /*RemoteObject*/ )));Debug.locals.put("cbc", _cbc);Debug.locals.put("cbc", _cbc);
 BA.debugLineNum = 115;BA.debugLine="m.Put(0, cbc)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable((0))),(Object)((_cbc)));
 BA.debugLineNum = 116;BA.debugLine="data.MapsOfCompressedBCs.Add(m)";
Debug.JustUpdateDeviceLine();
_data.getField(false,"MapsOfCompressedBCs" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_m.getObject())));
 BA.debugLineNum = 117;BA.debugLine="data.SizeOfAllCompressed = data.SizeOfAllCompres";
Debug.JustUpdateDeviceLine();
_data.setField ("SizeOfAllCompressed" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {_data.getField(true,"SizeOfAllCompressed" /*RemoteObject*/ ),_cbc.getField(false,"mBuffer").getField(true,"length")}, "+",1, 1));
 }
}Debug.locals.put("sb", _sb);
;
 BA.debugLineNum = 119;BA.debugLine="data.AngleInterval = AngleInterval";
Debug.JustUpdateDeviceLine();
_data.setField ("AngleInterval" /*RemoteObject*/ ,_angleinterval);
 BA.debugLineNum = 120;BA.debugLine="data.AntiAlias = AntiAlias";
Debug.JustUpdateDeviceLine();
_data.setField ("AntiAlias" /*RemoteObject*/ ,_antialias);
 BA.debugLineNum = 121;BA.debugLine="cache.Put(data.Name.ToLowerCase, data)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cache" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_data.getField(true,"Name" /*RemoteObject*/ ).runMethod(true,"toLowerCase"))),(Object)((_data)));
 BA.debugLineNum = 122;BA.debugLine="TotalSize = TotalSize + data.SizeOfAllCompressed";
Debug.JustUpdateDeviceLine();
__ref.setField ("_totalsize" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_totalsize" /*RemoteObject*/ ),_data.getField(true,"SizeOfAllCompressed" /*RemoteObject*/ )}, "+",1, 1));
 BA.debugLineNum = 123;BA.debugLine="Return data";
Debug.JustUpdateDeviceLine();
if (true) return _data;
 BA.debugLineNum = 124;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _putgraphicbcs(RemoteObject __ref,RemoteObject _name,RemoteObject _bcs,RemoteObject _antialias,RemoteObject _angleinterval) throws Exception{
try {
		Debug.PushSubsStack("PutGraphicBCs (x2spritegraphiccache) ","x2spritegraphiccache",19,__ref.getField(false, "ba"),__ref,128);
if (RapidSub.canDelegate("putgraphicbcs")) { return __ref.runUserSub(false, "x2spritegraphiccache","putgraphicbcs", __ref, _name, _bcs, _antialias, _angleinterval);}
RemoteObject _data = RemoteObject.declareNull("b4a.example.x2spritegraphiccache._x2spritegraphicdata");
RemoteObject _bc = RemoteObject.declareNull("b4a.example.bitmapcreator");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _cbc = RemoteObject.declareNull("b4a.example.bitmapcreator._compressedbc");
Debug.locals.put("Name", _name);
Debug.locals.put("BCs", _bcs);
Debug.locals.put("AntiAlias", _antialias);
Debug.locals.put("AngleInterval", _angleinterval);
 BA.debugLineNum = 128;BA.debugLine="Public Sub PutGraphicBCs(Name As String, BCs As Li";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 130;BA.debugLine="Log($\"New graphic: ${Name}\"$)";
Debug.JustUpdateDeviceLine();
x2spritegraphiccache.__c.runVoidMethod ("LogImpl","914352386",(RemoteObject.concat(RemoteObject.createImmutable("New graphic: "),x2spritegraphiccache.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_name))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 132;BA.debugLine="Dim data As X2SpriteGraphicData";
Debug.JustUpdateDeviceLine();
_data = RemoteObject.createNew ("b4a.example.x2spritegraphiccache._x2spritegraphicdata");Debug.locals.put("data", _data);
 BA.debugLineNum = 133;BA.debugLine="data.Initialize";
Debug.JustUpdateDeviceLine();
_data.runVoidMethod ("Initialize");
 BA.debugLineNum = 134;BA.debugLine="data.Name = Name";
Debug.JustUpdateDeviceLine();
_data.setField ("Name" /*RemoteObject*/ ,_name);
 BA.debugLineNum = 135;BA.debugLine="data.MapsOfCompressedBCs.Initialize";
Debug.JustUpdateDeviceLine();
_data.getField(false,"MapsOfCompressedBCs" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 136;BA.debugLine="data.OriginalBCs.Initialize";
Debug.JustUpdateDeviceLine();
_data.getField(false,"OriginalBCs" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 137;BA.debugLine="data.LastUsed = DateTime.Now";
Debug.JustUpdateDeviceLine();
_data.setField ("LastUsed" /*RemoteObject*/ ,x2spritegraphiccache.__c.getField(false,"DateTime").runMethod(true,"getNow"));
 BA.debugLineNum = 138;BA.debugLine="data.OriginalBCs = BCs";
Debug.JustUpdateDeviceLine();
_data.setField ("OriginalBCs" /*RemoteObject*/ ,_bcs);
 BA.debugLineNum = 139;BA.debugLine="For Each bc As BitmapCreator In BCs";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group9 = _bcs;
final int groupLen9 = group9.runMethod(true,"getSize").<Integer>get()
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_bc = (group9.runMethod(false,"Get",index9));Debug.locals.put("bc", _bc);
Debug.locals.put("bc", _bc);
 BA.debugLineNum = 140;BA.debugLine="Dim m As Map";
Debug.JustUpdateDeviceLine();
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 141;BA.debugLine="m.Initialize";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 142;BA.debugLine="Dim cbc As CompressedBC = bc.ExtractCompressedBC";
Debug.JustUpdateDeviceLine();
_cbc = _bc.runMethod(false,"_extractcompressedbc",(Object)(_bc.getField(false,"_targetrect")),(Object)(__ref.getField(false,"_cbccache" /*RemoteObject*/ )));Debug.locals.put("cbc", _cbc);Debug.locals.put("cbc", _cbc);
 BA.debugLineNum = 143;BA.debugLine="m.Put(0, cbc)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable((0))),(Object)((_cbc)));
 BA.debugLineNum = 144;BA.debugLine="data.MapsOfCompressedBCs.Add(m)";
Debug.JustUpdateDeviceLine();
_data.getField(false,"MapsOfCompressedBCs" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_m.getObject())));
 BA.debugLineNum = 145;BA.debugLine="data.SizeOfAllCompressed = data.SizeOfAllCompres";
Debug.JustUpdateDeviceLine();
_data.setField ("SizeOfAllCompressed" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {_data.getField(true,"SizeOfAllCompressed" /*RemoteObject*/ ),_cbc.getField(false,"mBuffer").getField(true,"length")}, "+",1, 1));
 }
}Debug.locals.put("bc", _bc);
;
 BA.debugLineNum = 147;BA.debugLine="data.AngleInterval = AngleInterval";
Debug.JustUpdateDeviceLine();
_data.setField ("AngleInterval" /*RemoteObject*/ ,_angleinterval);
 BA.debugLineNum = 148;BA.debugLine="data.AntiAlias = AntiAlias";
Debug.JustUpdateDeviceLine();
_data.setField ("AntiAlias" /*RemoteObject*/ ,_antialias);
 BA.debugLineNum = 149;BA.debugLine="cache.Put(data.Name.ToLowerCase, data)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cache" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_data.getField(true,"Name" /*RemoteObject*/ ).runMethod(true,"toLowerCase"))),(Object)((_data)));
 BA.debugLineNum = 150;BA.debugLine="TotalSize = TotalSize + data.SizeOfAllCompressed";
Debug.JustUpdateDeviceLine();
__ref.setField ("_totalsize" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_totalsize" /*RemoteObject*/ ),_data.getField(true,"SizeOfAllCompressed" /*RemoteObject*/ )}, "+",1, 1));
 BA.debugLineNum = 151;BA.debugLine="Return data";
Debug.JustUpdateDeviceLine();
if (true) return _data;
 BA.debugLineNum = 152;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _removegraphics(RemoteObject __ref,RemoteObject _name) throws Exception{
try {
		Debug.PushSubsStack("RemoveGraphics (x2spritegraphiccache) ","x2spritegraphiccache",19,__ref.getField(false, "ba"),__ref,257);
if (RapidSub.canDelegate("removegraphics")) { return __ref.runUserSub(false, "x2spritegraphiccache","removegraphics", __ref, _name);}
RemoteObject _data = RemoteObject.declareNull("b4a.example.x2spritegraphiccache._x2spritegraphicdata");
Debug.locals.put("Name", _name);
 BA.debugLineNum = 257;BA.debugLine="Public Sub RemoveGraphics (Name As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 259;BA.debugLine="Log(\"Remove graphic: \" & Name)";
Debug.JustUpdateDeviceLine();
x2spritegraphiccache.__c.runVoidMethod ("LogImpl","914614530",RemoteObject.concat(RemoteObject.createImmutable("Remove graphic: "),_name),0);
 BA.debugLineNum = 261;BA.debugLine="Dim data As X2SpriteGraphicData = cache.Get(Name.";
Debug.JustUpdateDeviceLine();
_data = (__ref.getField(false,"_cache" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_name.runMethod(true,"toLowerCase")))));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 262;BA.debugLine="TotalSize = TotalSize - data.SizeOfAllCompressed";
Debug.JustUpdateDeviceLine();
__ref.setField ("_totalsize" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_totalsize" /*RemoteObject*/ ),_data.getField(true,"SizeOfAllCompressed" /*RemoteObject*/ )}, "-",1, 1));
 BA.debugLineNum = 263;BA.debugLine="cache.Remove(Name.ToLowerCase)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cache" /*RemoteObject*/ ).runVoidMethod ("Remove",(Object)((_name.runMethod(true,"toLowerCase"))));
 BA.debugLineNum = 264;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _trimcache(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("TrimCache (x2spritegraphiccache) ","x2spritegraphiccache",19,__ref.getField(false, "ba"),__ref,234);
if (RapidSub.canDelegate("trimcache")) { return __ref.runUserSub(false, "x2spritegraphiccache","trimcache", __ref);}
RemoteObject _dates = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _data = RemoteObject.declareNull("b4a.example.x2spritegraphiccache._x2spritegraphicdata");
int _i = 0;
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _zero = RemoteObject.declareNull("b4a.example.bitmapcreator._compressedbc");
 BA.debugLineNum = 234;BA.debugLine="Private Sub TrimCache";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 235;BA.debugLine="Log(\"Trim Cache\")";
Debug.JustUpdateDeviceLine();
x2spritegraphiccache.__c.runVoidMethod ("LogImpl","914548993",RemoteObject.createImmutable("Trim Cache"),0);
 BA.debugLineNum = 236;BA.debugLine="Log($\"Before: ${TotalSize}\"$)";
Debug.JustUpdateDeviceLine();
x2spritegraphiccache.__c.runVoidMethod ("LogImpl","914548994",(RemoteObject.concat(RemoteObject.createImmutable("Before: "),x2spritegraphiccache.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_totalsize" /*RemoteObject*/ )))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 237;BA.debugLine="Dim dates As List";
Debug.JustUpdateDeviceLine();
_dates = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("dates", _dates);
 BA.debugLineNum = 238;BA.debugLine="dates.Initialize";
Debug.JustUpdateDeviceLine();
_dates.runVoidMethod ("Initialize");
 BA.debugLineNum = 239;BA.debugLine="For Each data As X2SpriteGraphicData In cache.Val";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group5 = __ref.getField(false,"_cache" /*RemoteObject*/ ).runMethod(false,"Values");
final int groupLen5 = group5.runMethod(true,"getSize").<Integer>get()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_data = (group5.runMethod(false,"Get",index5));Debug.locals.put("data", _data);
Debug.locals.put("data", _data);
 BA.debugLineNum = 240;BA.debugLine="If data.SizeOfAllCompressed > 0 Then dates.Add(d";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_data.getField(true,"SizeOfAllCompressed" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
_dates.runVoidMethod ("Add",(Object)((_data)));};
 }
}Debug.locals.put("data", _data);
;
 BA.debugLineNum = 242;BA.debugLine="dates.SortType(\"LastUsed\", True)";
Debug.JustUpdateDeviceLine();
_dates.runVoidMethod ("SortType",(Object)(BA.ObjectToString("LastUsed")),(Object)(x2spritegraphiccache.__c.getField(true,"True")));
 BA.debugLineNum = 243;BA.debugLine="For i = 0 To dates.Size / 2";
Debug.JustUpdateDeviceLine();
{
final int step9 = 1;
final int limit9 = (int) (0 + RemoteObject.solve(new RemoteObject[] {_dates.runMethod(true,"getSize"),RemoteObject.createImmutable(2)}, "/",0, 0).<Double>get().doubleValue());
_i = 0 ;
for (;(step9 > 0 && _i <= limit9) || (step9 < 0 && _i >= limit9) ;_i = ((int)(0 + _i + step9))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 244;BA.debugLine="Dim data As X2SpriteGraphicData = dates.Get(i)";
Debug.JustUpdateDeviceLine();
_data = (_dates.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 245;BA.debugLine="For Each m As Map In data.MapsOfCompressedBCs";
Debug.JustUpdateDeviceLine();
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group11 = _data.getField(false,"MapsOfCompressedBCs" /*RemoteObject*/ );
final int groupLen11 = group11.runMethod(true,"getSize").<Integer>get()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_m = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group11.runMethod(false,"Get",index11));Debug.locals.put("m", _m);
Debug.locals.put("m", _m);
 BA.debugLineNum = 246;BA.debugLine="Dim zero As CompressedBC = m.Get(0)";
Debug.JustUpdateDeviceLine();
_zero = (_m.runMethod(false,"Get",(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("zero", _zero);Debug.locals.put("zero", _zero);
 BA.debugLineNum = 247;BA.debugLine="m.Clear";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Clear");
 BA.debugLineNum = 248;BA.debugLine="m.Put(0, zero)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable((0))),(Object)((_zero)));
 }
}Debug.locals.put("m", _m);
;
 BA.debugLineNum = 250;BA.debugLine="TotalSize = TotalSize - data.SizeOfAllCompressed";
Debug.JustUpdateDeviceLine();
__ref.setField ("_totalsize" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_totalsize" /*RemoteObject*/ ),_data.getField(true,"SizeOfAllCompressed" /*RemoteObject*/ )}, "-",1, 1));
 BA.debugLineNum = 251;BA.debugLine="data.SizeOfAllCompressed = 0";
Debug.JustUpdateDeviceLine();
_data.setField ("SizeOfAllCompressed" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 253;BA.debugLine="Log($\"After: ${TotalSize}\"$)";
Debug.JustUpdateDeviceLine();
x2spritegraphiccache.__c.runVoidMethod ("LogImpl","914549011",(RemoteObject.concat(RemoteObject.createImmutable("After: "),x2spritegraphiccache.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_totalsize" /*RemoteObject*/ )))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 254;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _warmgraphic(RemoteObject __ref,RemoteObject _name) throws Exception{
try {
		Debug.PushSubsStack("WarmGraphic (x2spritegraphiccache) ","x2spritegraphiccache",19,__ref.getField(false, "ba"),__ref,70);
if (RapidSub.canDelegate("warmgraphic")) { return __ref.runUserSub(false, "x2spritegraphiccache","warmgraphic", __ref, _name);}
RemoteObject _n = RemoteObject.createImmutable(0L);
RemoteObject _data = RemoteObject.declareNull("b4a.example.x2spritegraphiccache._x2spritegraphicdata");
int _i = 0;
int _degrees = 0;
Debug.locals.put("Name", _name);
 BA.debugLineNum = 70;BA.debugLine="Public Sub WarmGraphic (Name As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 71;BA.debugLine="Dim n As Long = DateTime.Now";
Debug.JustUpdateDeviceLine();
_n = x2spritegraphiccache.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("n", _n);Debug.locals.put("n", _n);
 BA.debugLineNum = 72;BA.debugLine="Name = Name.ToLowerCase";
Debug.JustUpdateDeviceLine();
_name = _name.runMethod(true,"toLowerCase");Debug.locals.put("Name", _name);
 BA.debugLineNum = 73;BA.debugLine="Dim data As X2SpriteGraphicData = cache.Get(Name)";
Debug.JustUpdateDeviceLine();
_data = (__ref.getField(false,"_cache" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_name))));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 74;BA.debugLine="For i = 0 To data.MapsOfCompressedBCs.Size - 1";
Debug.JustUpdateDeviceLine();
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {_data.getField(false,"MapsOfCompressedBCs" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 75;BA.debugLine="For degrees = 0 To 359 Step data.AngleInterval";
Debug.JustUpdateDeviceLine();
{
final int step5 = _data.getField(true,"AngleInterval" /*RemoteObject*/ ).<Integer>get().intValue();
final int limit5 = 359;
_degrees = 0 ;
for (;(step5 > 0 && _degrees <= limit5) || (step5 < 0 && _degrees >= limit5) ;_degrees = ((int)(0 + _degrees + step5))  ) {
Debug.locals.put("degrees", _degrees);
 BA.debugLineNum = 76;BA.debugLine="X2.GraphicCache.GetGraphic2(Name, i, degrees, F";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_x2" /*RemoteObject*/ ).getField(false,"_graphiccache" /*RemoteObject*/ ).runClassMethod (b4a.example.x2spritegraphiccache.class, "_getgraphic2" /*RemoteObject*/ ,(Object)(_name),(Object)(BA.numberCast(int.class, _i)),(Object)(BA.numberCast(int.class, _degrees)),(Object)(x2spritegraphiccache.__c.getField(true,"False")),(Object)(x2spritegraphiccache.__c.getField(true,"False")));
 }
}Debug.locals.put("degrees", _degrees);
;
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 80;BA.debugLine="Log($\"Warm graphic: ${Name}, ${DateTime.Now - n}";
Debug.JustUpdateDeviceLine();
x2spritegraphiccache.__c.runVoidMethod ("LogImpl","914155786",(RemoteObject.concat(RemoteObject.createImmutable("Warm graphic: "),x2spritegraphiccache.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_name))),RemoteObject.createImmutable(", "),x2spritegraphiccache.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((RemoteObject.solve(new RemoteObject[] {x2spritegraphiccache.__c.getField(false,"DateTime").runMethod(true,"getNow"),_n}, "-",1, 2)))),RemoteObject.createImmutable(" ms"))),0);
 BA.debugLineNum = 82;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}