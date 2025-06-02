package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class x2debugdraw_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Private xui As XUI";
x2debugdraw._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",x2debugdraw._xui);
 //BA.debugLineNum = 5;BA.debugLine="Public cvs As B4XCanvas";
x2debugdraw._cvs = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas");__ref.setField("_cvs",x2debugdraw._cvs);
 //BA.debugLineNum = 6;BA.debugLine="Private panel As B4XView";
x2debugdraw._panel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_panel",x2debugdraw._panel);
 //BA.debugLineNum = 7;BA.debugLine="Private X2 As X2Utils";
x2debugdraw._x2 = RemoteObject.createNew ("b4a.example.x2utils");__ref.setField("_x2",x2debugdraw._x2);
 //BA.debugLineNum = 8;BA.debugLine="Private ImageView As B4XView";
x2debugdraw._imageview = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_imageview",x2debugdraw._imageview);
 //BA.debugLineNum = 9;BA.debugLine="Private DebugScale As Float = 1/2";
x2debugdraw._debugscale = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(1),RemoteObject.createImmutable(2)}, "/",0, 0));__ref.setField("_debugscale",x2debugdraw._debugscale);
 //BA.debugLineNum = 10;BA.debugLine="Public MarkedPoints As List";
x2debugdraw._markedpoints = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_markedpoints",x2debugdraw._markedpoints);
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _draw(RemoteObject __ref,RemoteObject _gs,RemoteObject _visiblebodies) throws Exception{
try {
		Debug.PushSubsStack("Draw (x2debugdraw) ","x2debugdraw",16,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("draw")) { return __ref.runUserSub(false, "x2debugdraw","draw", __ref, _gs, _visiblebodies);}
RemoteObject _body = RemoteObject.declareNull("anywheresoftware.b4a.objects.B2Body");
RemoteObject _fixture = RemoteObject.declareNull("anywheresoftware.b4a.objects.B2Fixture");
Debug.locals.put("gs", _gs);
Debug.locals.put("VisibleBodies", _visiblebodies);
 BA.debugLineNum = 27;BA.debugLine="Public Sub Draw (gs As X2GameStep, VisibleBodies A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 28;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("ClearRect",(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect")));
 BA.debugLineNum = 29;BA.debugLine="DrawGrid";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.x2debugdraw.class, "_drawgrid" /*RemoteObject*/ );
 BA.debugLineNum = 30;BA.debugLine="For Each body As B2Body In VisibleBodies.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group3 = _visiblebodies.runMethod(false,"Keys");
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_body = (group3.runMethod(false,"Get",index3));Debug.locals.put("body", _body);
Debug.locals.put("body", _body);
 BA.debugLineNum = 31;BA.debugLine="If body.IsInitialized = False Then Continue";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_body.runMethod(true,"getIsInitialized"),x2debugdraw.__c.getField(true,"False"))) { 
if (true) continue;};
 BA.debugLineNum = 32;BA.debugLine="Dim fixture As B2Fixture = body.FirstFixture";
Debug.JustUpdateDeviceLine();
_fixture = _body.runMethod(false,"getFirstFixture");Debug.locals.put("fixture", _fixture);Debug.locals.put("fixture", _fixture);
 BA.debugLineNum = 33;BA.debugLine="Do While fixture <> Null";
Debug.JustUpdateDeviceLine();
while (RemoteObject.solveBoolean("N",_fixture)) {
 BA.debugLineNum = 34;BA.debugLine="DrawShape (body, fixture.Shape, body.Tag)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.x2debugdraw.class, "_drawshape" /*RemoteObject*/ ,(Object)(_body),(Object)(_fixture.runMethod(false,"getShape")),(Object)((_body.runMethod(false,"getTag"))));
 BA.debugLineNum = 35;BA.debugLine="fixture = fixture.NextFixture";
Debug.JustUpdateDeviceLine();
_fixture = _fixture.runMethod(false,"NextFixture");Debug.locals.put("fixture", _fixture);
 }
;
 }
}Debug.locals.put("body", _body);
;
 BA.debugLineNum = 38;BA.debugLine="DrawContactPoints";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.x2debugdraw.class, "_drawcontactpoints" /*RemoteObject*/ );
 BA.debugLineNum = 39;BA.debugLine="DrawJoints";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.x2debugdraw.class, "_drawjoints" /*RemoteObject*/ );
 BA.debugLineNum = 40;BA.debugLine="DrawMarkedPoints";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.x2debugdraw.class, "_drawmarkedpoints" /*RemoteObject*/ );
 BA.debugLineNum = 41;BA.debugLine="X2.SetBitmapWithFitOrFill(ImageView, cvs.CreateBi";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_x2" /*RemoteObject*/ ).runClassMethod (b4a.example.x2utils.class, "_setbitmapwithfitorfill" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_imageview" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"CreateBitmap")));
 BA.debugLineNum = 42;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawcontactpoints(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DrawContactPoints (x2debugdraw) ","x2debugdraw",16,__ref.getField(false, "ba"),__ref,80);
if (RapidSub.canDelegate("drawcontactpoints")) { return __ref.runUserSub(false, "x2debugdraw","drawcontactpoints", __ref);}
RemoteObject _contact = RemoteObject.declareNull("anywheresoftware.b4a.objects.B2Contact");
RemoteObject _wm = RemoteObject.declareNull("anywheresoftware.b4a.objects.B2WorldManifold");
int _i = 0;
RemoteObject _worldpoint = RemoteObject.declareNull("anywheresoftware.b4a.objects.B2Vec2");
RemoteObject _vec = RemoteObject.declareNull("anywheresoftware.b4a.objects.B2Vec2");
 BA.debugLineNum = 80;BA.debugLine="Private Sub DrawContactPoints";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 81;BA.debugLine="Dim contact As B2Contact = X2.mWorld.FirstContact";
Debug.JustUpdateDeviceLine();
_contact = __ref.getField(false,"_x2" /*RemoteObject*/ ).getField(false,"_mworld" /*RemoteObject*/ ).runMethod(false,"FirstContact");Debug.locals.put("contact", _contact);Debug.locals.put("contact", _contact);
 BA.debugLineNum = 82;BA.debugLine="Dim wm As B2WorldManifold";
Debug.JustUpdateDeviceLine();
_wm = RemoteObject.createNew ("anywheresoftware.b4a.objects.B2WorldManifold");Debug.locals.put("wm", _wm);
 BA.debugLineNum = 83;BA.debugLine="Do While contact <> Null";
Debug.JustUpdateDeviceLine();
while (RemoteObject.solveBoolean("N",_contact)) {
 BA.debugLineNum = 84;BA.debugLine="contact.GetWorldManifold(wm)";
Debug.JustUpdateDeviceLine();
_contact.runVoidMethod ("GetWorldManifold",(Object)(_wm));
 BA.debugLineNum = 85;BA.debugLine="For i = 0 To wm.PointCount - 1";
Debug.JustUpdateDeviceLine();
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_wm.getField(true,"PointCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 86;BA.debugLine="Dim WorldPoint As B2Vec2 = wm.GetPoint(i)";
Debug.JustUpdateDeviceLine();
_worldpoint = _wm.runMethod(false,"GetPoint",(Object)(BA.numberCast(int.class, _i)));Debug.locals.put("WorldPoint", _worldpoint);Debug.locals.put("WorldPoint", _worldpoint);
 BA.debugLineNum = 87;BA.debugLine="Dim vec As B2Vec2 = X2.WorldPointToMainBC(World";
Debug.JustUpdateDeviceLine();
_vec = __ref.getField(false,"_x2" /*RemoteObject*/ ).runClassMethod (b4a.example.x2utils.class, "_worldpointtomainbc" /*RemoteObject*/ ,(Object)(_worldpoint.runMethod(true,"getX")),(Object)(_worldpoint.runMethod(true,"getY")));Debug.locals.put("vec", _vec);Debug.locals.put("vec", _vec);
 BA.debugLineNum = 88;BA.debugLine="vec.MultiplyThis(DebugScale)";
Debug.JustUpdateDeviceLine();
_vec.runVoidMethod ("MultiplyThis",(Object)(__ref.getField(true,"_debugscale" /*RemoteObject*/ )));
 BA.debugLineNum = 89;BA.debugLine="cvs.DrawCircle(vec.X, vec.Y, 3, 0xFFFF2E00, Tru";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawCircle",(Object)(_vec.runMethod(true,"getX")),(Object)(_vec.runMethod(true,"getY")),(Object)(BA.numberCast(float.class, 3)),(Object)(BA.numberCast(int.class, ((int)0xffff2e00))),(Object)(x2debugdraw.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, 0)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 91;BA.debugLine="contact = contact.NextContact";
Debug.JustUpdateDeviceLine();
_contact = _contact.runMethod(false,"NextContact");Debug.locals.put("contact", _contact);
 }
;
 BA.debugLineNum = 93;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawgrid(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DrawGrid (x2debugdraw) ","x2debugdraw",16,__ref.getField(false, "ba"),__ref,44);
if (RapidSub.canDelegate("drawgrid")) { return __ref.runUserSub(false, "x2debugdraw","drawgrid", __ref);}
RemoteObject _vec1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.B2Vec2");
RemoteObject _vec2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.B2Vec2");
RemoteObject _clr = RemoteObject.createImmutable(0);
int _y = 0;
int _x = 0;
 BA.debugLineNum = 44;BA.debugLine="Private Sub DrawGrid";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 45;BA.debugLine="Dim vec1, vec2 As B2Vec2";
Debug.JustUpdateDeviceLine();
_vec1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.B2Vec2");Debug.locals.put("vec1", _vec1);
_vec2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.B2Vec2");Debug.locals.put("vec2", _vec2);
 BA.debugLineNum = 46;BA.debugLine="Dim clr As Int";
Debug.JustUpdateDeviceLine();
_clr = RemoteObject.createImmutable(0);Debug.locals.put("clr", _clr);
 BA.debugLineNum = 47;BA.debugLine="For y = Ceil(X2.ScreenAABB.BottomLeft.Y) To Floor";
Debug.JustUpdateDeviceLine();
{
final int step3 = 1;
final int limit3 = (int) (0 + x2debugdraw.__c.runMethod(true,"Floor",(Object)(BA.numberCast(double.class, __ref.getField(false,"_x2" /*RemoteObject*/ ).getField(false,"_screenaabb" /*RemoteObject*/ ).runMethod(false,"getTopRight").runMethod(true,"getY")))).<Double>get().doubleValue());
_y = (int) (0 + x2debugdraw.__c.runMethod(true,"Ceil",(Object)(BA.numberCast(double.class, __ref.getField(false,"_x2" /*RemoteObject*/ ).getField(false,"_screenaabb" /*RemoteObject*/ ).runMethod(false,"getBottomLeft").runMethod(true,"getY")))).<Double>get().doubleValue()) ;
for (;(step3 > 0 && _y <= limit3) || (step3 < 0 && _y >= limit3) ;_y = ((int)(0 + _y + step3))  ) {
Debug.locals.put("y", _y);
 BA.debugLineNum = 48;BA.debugLine="For x = Ceil(X2.ScreenAABB.BottomLeft.x) To Floo";
Debug.JustUpdateDeviceLine();
{
final int step4 = 1;
final int limit4 = (int) (0 + x2debugdraw.__c.runMethod(true,"Floor",(Object)(BA.numberCast(double.class, __ref.getField(false,"_x2" /*RemoteObject*/ ).getField(false,"_screenaabb" /*RemoteObject*/ ).runMethod(false,"getTopRight").runMethod(true,"getX")))).<Double>get().doubleValue());
_x = (int) (0 + x2debugdraw.__c.runMethod(true,"Ceil",(Object)(BA.numberCast(double.class, __ref.getField(false,"_x2" /*RemoteObject*/ ).getField(false,"_screenaabb" /*RemoteObject*/ ).runMethod(false,"getBottomLeft").runMethod(true,"getX")))).<Double>get().doubleValue()) ;
for (;(step4 > 0 && _x <= limit4) || (step4 < 0 && _x >= limit4) ;_x = ((int)(0 + _x + step4))  ) {
Debug.locals.put("x", _x);
 BA.debugLineNum = 49;BA.debugLine="vec1.X = x - 0.05";
Debug.JustUpdateDeviceLine();
_vec1.runMethod(true,"setX",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_x),RemoteObject.createImmutable(0.05)}, "-",1, 0)));
 BA.debugLineNum = 50;BA.debugLine="vec2.X = x + 0.05";
Debug.JustUpdateDeviceLine();
_vec2.runMethod(true,"setX",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_x),RemoteObject.createImmutable(0.05)}, "+",1, 0)));
 BA.debugLineNum = 51;BA.debugLine="vec1.Y = y";
Debug.JustUpdateDeviceLine();
_vec1.runMethod(true,"setY",BA.numberCast(float.class, _y));
 BA.debugLineNum = 52;BA.debugLine="vec2.Y = y";
Debug.JustUpdateDeviceLine();
_vec2.runMethod(true,"setY",BA.numberCast(float.class, _y));
 BA.debugLineNum = 53;BA.debugLine="If y = 0 Then clr = xui.Color_Blue Else clr = x";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_y),BA.numberCast(double.class, 0))) { 
_clr = __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Blue");Debug.locals.put("clr", _clr);}
else {
_clr = __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White");Debug.locals.put("clr", _clr);};
 BA.debugLineNum = 54;BA.debugLine="DrawTwoVertices(vec1, vec2, clr)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.x2debugdraw.class, "_drawtwovertices" /*RemoteObject*/ ,(Object)(_vec1),(Object)(_vec2),(Object)(_clr));
 BA.debugLineNum = 55;BA.debugLine="vec1.X = x";
Debug.JustUpdateDeviceLine();
_vec1.runMethod(true,"setX",BA.numberCast(float.class, _x));
 BA.debugLineNum = 56;BA.debugLine="vec2.X = x";
Debug.JustUpdateDeviceLine();
_vec2.runMethod(true,"setX",BA.numberCast(float.class, _x));
 BA.debugLineNum = 57;BA.debugLine="vec1.Y = y - 0.05";
Debug.JustUpdateDeviceLine();
_vec1.runMethod(true,"setY",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_y),RemoteObject.createImmutable(0.05)}, "-",1, 0)));
 BA.debugLineNum = 58;BA.debugLine="vec2.Y = y + 0.05";
Debug.JustUpdateDeviceLine();
_vec2.runMethod(true,"setY",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_y),RemoteObject.createImmutable(0.05)}, "+",1, 0)));
 BA.debugLineNum = 59;BA.debugLine="If x = 0 Then clr = xui.Color_Blue Else clr = x";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_x),BA.numberCast(double.class, 0))) { 
_clr = __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Blue");Debug.locals.put("clr", _clr);}
else {
_clr = __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White");Debug.locals.put("clr", _clr);};
 BA.debugLineNum = 60;BA.debugLine="DrawTwoVertices(vec1, vec2, clr)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.x2debugdraw.class, "_drawtwovertices" /*RemoteObject*/ ,(Object)(_vec1),(Object)(_vec2),(Object)(_clr));
 }
}Debug.locals.put("x", _x);
;
 }
}Debug.locals.put("y", _y);
;
 BA.debugLineNum = 63;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawjoints(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DrawJoints (x2debugdraw) ","x2debugdraw",16,__ref.getField(false, "ba"),__ref,69);
if (RapidSub.canDelegate("drawjoints")) { return __ref.runUserSub(false, "x2debugdraw","drawjoints", __ref);}
RemoteObject _jointscolor = RemoteObject.createImmutable(0);
RemoteObject _joint = RemoteObject.declareNull("anywheresoftware.b4a.objects.joints.B2Joint");
 BA.debugLineNum = 69;BA.debugLine="Private Sub DrawJoints";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 70;BA.debugLine="Dim JointsColor As Int = 0xFF00F2FF";
Debug.JustUpdateDeviceLine();
_jointscolor = BA.numberCast(int.class, ((int)0xff00f2ff));Debug.locals.put("JointsColor", _jointscolor);Debug.locals.put("JointsColor", _jointscolor);
 BA.debugLineNum = 71;BA.debugLine="Dim Joint As B2Joint = X2.mWorld.FirstJoint";
Debug.JustUpdateDeviceLine();
_joint = __ref.getField(false,"_x2" /*RemoteObject*/ ).getField(false,"_mworld" /*RemoteObject*/ ).runMethod(false,"FirstJoint");Debug.locals.put("Joint", _joint);Debug.locals.put("Joint", _joint);
 BA.debugLineNum = 72;BA.debugLine="Do While Joint <> Null";
Debug.JustUpdateDeviceLine();
while (RemoteObject.solveBoolean("N",_joint)) {
 BA.debugLineNum = 73;BA.debugLine="DrawTwoVertices(Joint.BodyA.Position, Joint.Anch";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.x2debugdraw.class, "_drawtwovertices" /*RemoteObject*/ ,(Object)(_joint.runMethod(false,"getBodyA").runMethod(false,"getPosition")),(Object)(_joint.runMethod(false,"getAnchorA")),(Object)(_jointscolor));
 BA.debugLineNum = 74;BA.debugLine="DrawTwoVertices(Joint.AnchorA, Joint.AnchorB, Jo";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.x2debugdraw.class, "_drawtwovertices" /*RemoteObject*/ ,(Object)(_joint.runMethod(false,"getAnchorA")),(Object)(_joint.runMethod(false,"getAnchorB")),(Object)(_jointscolor));
 BA.debugLineNum = 75;BA.debugLine="DrawTwoVertices(Joint.AnchorB, Joint.BodyB.Posit";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.x2debugdraw.class, "_drawtwovertices" /*RemoteObject*/ ,(Object)(_joint.runMethod(false,"getAnchorB")),(Object)(_joint.runMethod(false,"getBodyB").runMethod(false,"getPosition")),(Object)(_jointscolor));
 BA.debugLineNum = 76;BA.debugLine="Joint = Joint.NextJoint";
Debug.JustUpdateDeviceLine();
_joint = _joint.runMethod(false,"NextJoint");Debug.locals.put("Joint", _joint);
 }
;
 BA.debugLineNum = 78;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawmarkedpoints(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DrawMarkedPoints (x2debugdraw) ","x2debugdraw",16,__ref.getField(false, "ba"),__ref,95);
if (RapidSub.canDelegate("drawmarkedpoints")) { return __ref.runUserSub(false, "x2debugdraw","drawmarkedpoints", __ref);}
RemoteObject _vec = RemoteObject.declareNull("anywheresoftware.b4a.objects.B2Vec2");
RemoteObject _v = RemoteObject.declareNull("anywheresoftware.b4a.objects.B2Vec2");
 BA.debugLineNum = 95;BA.debugLine="Private Sub DrawMarkedPoints";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 96;BA.debugLine="For Each vec As B2Vec2 In MarkedPoints";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = __ref.getField(false,"_markedpoints" /*RemoteObject*/ );
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_vec = (group1.runMethod(false,"Get",index1));Debug.locals.put("vec", _vec);
Debug.locals.put("vec", _vec);
 BA.debugLineNum = 97;BA.debugLine="Dim v As B2Vec2 = X2.WorldPointToMainBC(vec.X, v";
Debug.JustUpdateDeviceLine();
_v = __ref.getField(false,"_x2" /*RemoteObject*/ ).runClassMethod (b4a.example.x2utils.class, "_worldpointtomainbc" /*RemoteObject*/ ,(Object)(_vec.runMethod(true,"getX")),(Object)(_vec.runMethod(true,"getY")));Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 98;BA.debugLine="v.MultiplyThis(DebugScale)";
Debug.JustUpdateDeviceLine();
_v.runVoidMethod ("MultiplyThis",(Object)(__ref.getField(true,"_debugscale" /*RemoteObject*/ )));
 BA.debugLineNum = 99;BA.debugLine="cvs.DrawCircle(v.X, v.Y, 3, 0xFF78FF71, True, 0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawCircle",(Object)(_v.runMethod(true,"getX")),(Object)(_v.runMethod(true,"getY")),(Object)(BA.numberCast(float.class, 3)),(Object)(BA.numberCast(int.class, ((int)0xff78ff71))),(Object)(x2debugdraw.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, 0)));
 }
}Debug.locals.put("vec", _vec);
;
 BA.debugLineNum = 101;BA.debugLine="MarkedPoints.Clear";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_markedpoints" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 102;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawshape(RemoteObject __ref,RemoteObject _body,RemoteObject _shape,RemoteObject _bw) throws Exception{
try {
		Debug.PushSubsStack("DrawShape (x2debugdraw) ","x2debugdraw",16,__ref.getField(false, "ba"),__ref,104);
if (RapidSub.canDelegate("drawshape")) { return __ref.runUserSub(false, "x2debugdraw","drawshape", __ref, _body, _shape, _bw);}
RemoteObject _clr = RemoteObject.createImmutable(0);
RemoteObject _vec = RemoteObject.declareNull("anywheresoftware.b4a.objects.B2Vec2");
RemoteObject _circle = RemoteObject.declareNull("anywheresoftware.b4a.objects.B2Shape.B2CircleShape");
RemoteObject _edge = RemoteObject.declareNull("anywheresoftware.b4a.objects.B2Shape.B2EdgeShape");
RemoteObject _polygon = RemoteObject.declareNull("anywheresoftware.b4a.objects.B2Shape.B2PolygonShape");
RemoteObject _prevvertex = RemoteObject.declareNull("anywheresoftware.b4a.objects.B2Vec2");
int _i = 0;
RemoteObject _vertex = RemoteObject.declareNull("anywheresoftware.b4a.objects.B2Vec2");
RemoteObject _chain = RemoteObject.declareNull("anywheresoftware.b4a.objects.B2Shape.B2ChainShape");
Debug.locals.put("body", _body);
Debug.locals.put("shape", _shape);
Debug.locals.put("bw", _bw);
 BA.debugLineNum = 104;BA.debugLine="Private Sub DrawShape (body As B2Body, shape As B2";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 105;BA.debugLine="Dim clr As Int = 0xFF0200FF";
Debug.JustUpdateDeviceLine();
_clr = BA.numberCast(int.class, ((int)0xff0200ff));Debug.locals.put("clr", _clr);Debug.locals.put("clr", _clr);
 BA.debugLineNum = 106;BA.debugLine="If body.IsColliding Then";
Debug.JustUpdateDeviceLine();
if (_body.runMethod(true,"getIsColliding").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 107;BA.debugLine="clr = 0xFFFFC700";
Debug.JustUpdateDeviceLine();
_clr = BA.numberCast(int.class, ((int)0xffffc700));Debug.locals.put("clr", _clr);
 BA.debugLineNum = 108;BA.debugLine="If body.GetContactList(True).Size > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_body.runMethod(false,"GetContactList",(Object)(x2debugdraw.__c.getField(true,"True"))).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 109;BA.debugLine="clr = 0xFFFF2E00";
Debug.JustUpdateDeviceLine();
_clr = BA.numberCast(int.class, ((int)0xffff2e00));Debug.locals.put("clr", _clr);
 };
 };
 BA.debugLineNum = 112;BA.debugLine="If body.Awake = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_body.runMethod(true,"getAwake"),x2debugdraw.__c.getField(true,"False"))) { 
 BA.debugLineNum = 113;BA.debugLine="clr = xui.Color_Green";
Debug.JustUpdateDeviceLine();
_clr = __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Green");Debug.locals.put("clr", _clr);
 };
 BA.debugLineNum = 116;BA.debugLine="Dim vec As B2Vec2 = body.WorldCenter";
Debug.JustUpdateDeviceLine();
_vec = _body.runMethod(false,"getWorldCenter");Debug.locals.put("vec", _vec);Debug.locals.put("vec", _vec);
 BA.debugLineNum = 117;BA.debugLine="vec = X2.WorldPointToMainBC(vec.X, vec.Y)";
Debug.JustUpdateDeviceLine();
_vec = __ref.getField(false,"_x2" /*RemoteObject*/ ).runClassMethod (b4a.example.x2utils.class, "_worldpointtomainbc" /*RemoteObject*/ ,(Object)(_vec.runMethod(true,"getX")),(Object)(_vec.runMethod(true,"getY")));Debug.locals.put("vec", _vec);
 BA.debugLineNum = 118;BA.debugLine="vec.MultiplyThis(DebugScale)";
Debug.JustUpdateDeviceLine();
_vec.runVoidMethod ("MultiplyThis",(Object)(__ref.getField(true,"_debugscale" /*RemoteObject*/ )));
 BA.debugLineNum = 119;BA.debugLine="cvs.DrawCircle(vec.X, vec.Y, 1, clr, True, 0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawCircle",(Object)(_vec.runMethod(true,"getX")),(Object)(_vec.runMethod(true,"getY")),(Object)(BA.numberCast(float.class, 1)),(Object)(_clr),(Object)(x2debugdraw.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 120;BA.debugLine="vec = body.Position";
Debug.JustUpdateDeviceLine();
_vec = _body.runMethod(false,"getPosition");Debug.locals.put("vec", _vec);
 BA.debugLineNum = 121;BA.debugLine="vec = X2.WorldPointToMainBC(vec.X, vec.Y)";
Debug.JustUpdateDeviceLine();
_vec = __ref.getField(false,"_x2" /*RemoteObject*/ ).runClassMethod (b4a.example.x2utils.class, "_worldpointtomainbc" /*RemoteObject*/ ,(Object)(_vec.runMethod(true,"getX")),(Object)(_vec.runMethod(true,"getY")));Debug.locals.put("vec", _vec);
 BA.debugLineNum = 122;BA.debugLine="vec.MultiplyThis(DebugScale)";
Debug.JustUpdateDeviceLine();
_vec.runVoidMethod ("MultiplyThis",(Object)(__ref.getField(true,"_debugscale" /*RemoteObject*/ )));
 BA.debugLineNum = 123;BA.debugLine="cvs.DrawCircle(vec.X, vec.Y, 2, 0xFFFF0096, False";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawCircle",(Object)(_vec.runMethod(true,"getX")),(Object)(_vec.runMethod(true,"getY")),(Object)(BA.numberCast(float.class, 2)),(Object)(BA.numberCast(int.class, ((int)0xffff0096))),(Object)(x2debugdraw.__c.getField(true,"False")),(Object)(BA.numberCast(float.class, 2)));
 BA.debugLineNum = 124;BA.debugLine="If bw.DebugDrawColor <> 0 Then clr = bw.DebugDraw";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_bw.getField(true,"_debugdrawcolor" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
_clr = _bw.getField(true,"_debugdrawcolor" /*RemoteObject*/ );Debug.locals.put("clr", _clr);};
 BA.debugLineNum = 125;BA.debugLine="Select shape.ShapeType";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_shape.runMethod(false,"getShapeType"),_shape.getField(false,"SHAPE_CIRCLE"),_shape.getField(false,"SHAPE_EDGE"),_shape.getField(false,"SHAPE_POLYGON"),_shape.getField(false,"SHAPE_CHAIN"))) {
case 0: {
 BA.debugLineNum = 127;BA.debugLine="Dim circle As B2CircleShape = shape";
Debug.JustUpdateDeviceLine();
_circle = RemoteObject.createNew ("anywheresoftware.b4a.objects.B2Shape.B2CircleShape");
_circle = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B2Shape.B2CircleShape"), _shape.getObject());Debug.locals.put("circle", _circle);Debug.locals.put("circle", _circle);
 BA.debugLineNum = 128;BA.debugLine="Dim vec As B2Vec2 = body.GetWorldPoint(circle.S";
Debug.JustUpdateDeviceLine();
_vec = _body.runMethod(false,"GetWorldPoint",(Object)(_circle.runMethod(false,"getSupportVertex")));Debug.locals.put("vec", _vec);Debug.locals.put("vec", _vec);
 BA.debugLineNum = 129;BA.debugLine="vec = X2.WorldPointToMainBC(vec.X, vec.Y)";
Debug.JustUpdateDeviceLine();
_vec = __ref.getField(false,"_x2" /*RemoteObject*/ ).runClassMethod (b4a.example.x2utils.class, "_worldpointtomainbc" /*RemoteObject*/ ,(Object)(_vec.runMethod(true,"getX")),(Object)(_vec.runMethod(true,"getY")));Debug.locals.put("vec", _vec);
 BA.debugLineNum = 130;BA.debugLine="vec.MultiplyThis(DebugScale)";
Debug.JustUpdateDeviceLine();
_vec.runVoidMethod ("MultiplyThis",(Object)(__ref.getField(true,"_debugscale" /*RemoteObject*/ )));
 BA.debugLineNum = 131;BA.debugLine="cvs.DrawCircle(vec.X, vec.Y, X2.MetersToBCPixel";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawCircle",(Object)(_vec.runMethod(true,"getX")),(Object)(_vec.runMethod(true,"getY")),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_x2" /*RemoteObject*/ ).runClassMethod (b4a.example.x2utils.class, "_meterstobcpixels" /*RemoteObject*/ ,(Object)(_circle.runMethod(true,"getRadius"))),__ref.getField(true,"_debugscale" /*RemoteObject*/ )}, "*",0, 0))),(Object)(_clr),(Object)(x2debugdraw.__c.getField(true,"False")),(Object)(BA.numberCast(float.class, 1)));
 break; }
case 1: {
 BA.debugLineNum = 133;BA.debugLine="Dim edge As B2EdgeShape = shape";
Debug.JustUpdateDeviceLine();
_edge = RemoteObject.createNew ("anywheresoftware.b4a.objects.B2Shape.B2EdgeShape");
_edge = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B2Shape.B2EdgeShape"), _shape.getObject());Debug.locals.put("edge", _edge);Debug.locals.put("edge", _edge);
 BA.debugLineNum = 134;BA.debugLine="DrawTwoVertices(body.GetWorldPoint(edge.Vertex1";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.x2debugdraw.class, "_drawtwovertices" /*RemoteObject*/ ,(Object)(_body.runMethod(false,"GetWorldPoint",(Object)(_edge.runMethod(false,"getVertex1")))),(Object)(_body.runMethod(false,"GetWorldPoint",(Object)(_edge.runMethod(false,"getVertex2")))),(Object)(_clr));
 break; }
case 2: {
 BA.debugLineNum = 136;BA.debugLine="Dim polygon As B2PolygonShape = shape";
Debug.JustUpdateDeviceLine();
_polygon = RemoteObject.createNew ("anywheresoftware.b4a.objects.B2Shape.B2PolygonShape");
_polygon = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B2Shape.B2PolygonShape"), _shape.getObject());Debug.locals.put("polygon", _polygon);Debug.locals.put("polygon", _polygon);
 BA.debugLineNum = 137;BA.debugLine="Dim PrevVertex As B2Vec2 = body.GetWorldPoint(p";
Debug.JustUpdateDeviceLine();
_prevvertex = _body.runMethod(false,"GetWorldPoint",(Object)(_polygon.runMethod(false,"GetVertex",(Object)(BA.numberCast(int.class, 0)))));Debug.locals.put("PrevVertex", _prevvertex);Debug.locals.put("PrevVertex", _prevvertex);
 BA.debugLineNum = 138;BA.debugLine="For i = 1 To polygon.VertexCount - 1";
Debug.JustUpdateDeviceLine();
{
final int step33 = 1;
final int limit33 = RemoteObject.solve(new RemoteObject[] {_polygon.runMethod(true,"getVertexCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 1 ;
for (;(step33 > 0 && _i <= limit33) || (step33 < 0 && _i >= limit33) ;_i = ((int)(0 + _i + step33))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 139;BA.debugLine="Dim vertex As B2Vec2 = body.GetWorldPoint(poly";
Debug.JustUpdateDeviceLine();
_vertex = _body.runMethod(false,"GetWorldPoint",(Object)(_polygon.runMethod(false,"GetVertex",(Object)(BA.numberCast(int.class, _i)))));Debug.locals.put("vertex", _vertex);Debug.locals.put("vertex", _vertex);
 BA.debugLineNum = 140;BA.debugLine="DrawTwoVertices(PrevVertex, vertex, clr)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.x2debugdraw.class, "_drawtwovertices" /*RemoteObject*/ ,(Object)(_prevvertex),(Object)(_vertex),(Object)(_clr));
 BA.debugLineNum = 141;BA.debugLine="PrevVertex = vertex";
Debug.JustUpdateDeviceLine();
_prevvertex = _vertex;Debug.locals.put("PrevVertex", _prevvertex);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 143;BA.debugLine="DrawTwoVertices(PrevVertex, body.GetWorldPoint(";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.x2debugdraw.class, "_drawtwovertices" /*RemoteObject*/ ,(Object)(_prevvertex),(Object)(_body.runMethod(false,"GetWorldPoint",(Object)(_polygon.runMethod(false,"GetVertex",(Object)(BA.numberCast(int.class, 0)))))),(Object)(_clr));
 break; }
case 3: {
 BA.debugLineNum = 145;BA.debugLine="Dim chain As B2ChainShape = shape";
Debug.JustUpdateDeviceLine();
_chain = RemoteObject.createNew ("anywheresoftware.b4a.objects.B2Shape.B2ChainShape");
_chain = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B2Shape.B2ChainShape"), _shape.getObject());Debug.locals.put("chain", _chain);Debug.locals.put("chain", _chain);
 BA.debugLineNum = 146;BA.debugLine="Dim edge As B2EdgeShape";
Debug.JustUpdateDeviceLine();
_edge = RemoteObject.createNew ("anywheresoftware.b4a.objects.B2Shape.B2EdgeShape");Debug.locals.put("edge", _edge);
 BA.debugLineNum = 147;BA.debugLine="edge.Initialize(Null, Null)";
Debug.JustUpdateDeviceLine();
_edge.runVoidMethod ("Initialize",(Object)((x2debugdraw.__c.getField(false,"Null"))),(Object)((x2debugdraw.__c.getField(false,"Null"))));
 BA.debugLineNum = 148;BA.debugLine="For i = 0 To chain.EdgeCount - 1";
Debug.JustUpdateDeviceLine();
{
final int step43 = 1;
final int limit43 = RemoteObject.solve(new RemoteObject[] {_chain.runMethod(true,"getEdgeCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step43 > 0 && _i <= limit43) || (step43 < 0 && _i >= limit43) ;_i = ((int)(0 + _i + step43))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 149;BA.debugLine="chain.GetEdge(i, edge)";
Debug.JustUpdateDeviceLine();
_chain.runVoidMethod ("GetEdge",(Object)(BA.numberCast(int.class, _i)),(Object)(_edge));
 BA.debugLineNum = 150;BA.debugLine="DrawTwoVertices(body.GetWorldPoint(edge.Vertex";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.x2debugdraw.class, "_drawtwovertices" /*RemoteObject*/ ,(Object)(_body.runMethod(false,"GetWorldPoint",(Object)(_edge.runMethod(false,"getVertex1")))),(Object)(_body.runMethod(false,"GetWorldPoint",(Object)(_edge.runMethod(false,"getVertex2")))),(Object)(_clr));
 }
}Debug.locals.put("i", _i);
;
 break; }
}
;
 BA.debugLineNum = 153;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawtwovertices(RemoteObject __ref,RemoteObject _vec1,RemoteObject _vec2,RemoteObject _clr) throws Exception{
try {
		Debug.PushSubsStack("DrawTwoVertices (x2debugdraw) ","x2debugdraw",16,__ref.getField(false, "ba"),__ref,155);
if (RapidSub.canDelegate("drawtwovertices")) { return __ref.runUserSub(false, "x2debugdraw","drawtwovertices", __ref, _vec1, _vec2, _clr);}
Debug.locals.put("vec1", _vec1);
Debug.locals.put("vec2", _vec2);
Debug.locals.put("clr", _clr);
 BA.debugLineNum = 155;BA.debugLine="Private Sub DrawTwoVertices(vec1 As B2Vec2, vec2 A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 157;BA.debugLine="vec1 = X2.WorldPointToMainBC(vec1.X, vec1.Y)";
Debug.JustUpdateDeviceLine();
_vec1 = __ref.getField(false,"_x2" /*RemoteObject*/ ).runClassMethod (b4a.example.x2utils.class, "_worldpointtomainbc" /*RemoteObject*/ ,(Object)(_vec1.runMethod(true,"getX")),(Object)(_vec1.runMethod(true,"getY")));Debug.locals.put("vec1", _vec1);
 BA.debugLineNum = 158;BA.debugLine="vec1.MultiplyThis(DebugScale)";
Debug.JustUpdateDeviceLine();
_vec1.runVoidMethod ("MultiplyThis",(Object)(__ref.getField(true,"_debugscale" /*RemoteObject*/ )));
 BA.debugLineNum = 159;BA.debugLine="vec2 = X2.WorldPointToMainBC(vec2.X, vec2.Y)";
Debug.JustUpdateDeviceLine();
_vec2 = __ref.getField(false,"_x2" /*RemoteObject*/ ).runClassMethod (b4a.example.x2utils.class, "_worldpointtomainbc" /*RemoteObject*/ ,(Object)(_vec2.runMethod(true,"getX")),(Object)(_vec2.runMethod(true,"getY")));Debug.locals.put("vec2", _vec2);
 BA.debugLineNum = 160;BA.debugLine="vec2.MultiplyThis(DebugScale)";
Debug.JustUpdateDeviceLine();
_vec2.runVoidMethod ("MultiplyThis",(Object)(__ref.getField(true,"_debugscale" /*RemoteObject*/ )));
 BA.debugLineNum = 161;BA.debugLine="cvs.DrawLine(vec1.X, vec1.Y, vec2.X, vec2.Y, clr,";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawLine",(Object)(_vec1.runMethod(true,"getX")),(Object)(_vec1.runMethod(true,"getY")),(Object)(_vec2.runMethod(true,"getX")),(Object)(_vec2.runMethod(true,"getY")),(Object)(_clr),(Object)(BA.numberCast(float.class, 1)));
 BA.debugLineNum = 162;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _parent,RemoteObject _vx2) throws Exception{
try {
		Debug.PushSubsStack("Initialize (x2debugdraw) ","x2debugdraw",16,__ref.getField(false, "ba"),__ref,13);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "x2debugdraw","initialize", __ref, _ba, _parent, _vx2);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _iv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
Debug.locals.put("ba", _ba);
Debug.locals.put("Parent", _parent);
Debug.locals.put("vX2", _vx2);
 BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize (Parent As B4XView, vX2 As X";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 14;BA.debugLine="panel = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_panel" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 15;BA.debugLine="X2 = vX2";
Debug.JustUpdateDeviceLine();
__ref.setField ("_x2" /*RemoteObject*/ ,_vx2);
 BA.debugLineNum = 16;BA.debugLine="panel.SetLayoutAnimated(0, 0, 0, X2.MainBC.mWidth";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_panel" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_x2" /*RemoteObject*/ ).getField(false,"_mainbc" /*RemoteObject*/ ).getField(true,"_mwidth"),__ref.getField(true,"_debugscale" /*RemoteObject*/ )}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_x2" /*RemoteObject*/ ).getField(false,"_mainbc" /*RemoteObject*/ ).getField(true,"_mheight"),__ref.getField(true,"_debugscale" /*RemoteObject*/ )}, "*",0, 0))));
 BA.debugLineNum = 17;BA.debugLine="Dim iv As ImageView";
Debug.JustUpdateDeviceLine();
_iv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");Debug.locals.put("iv", _iv);
 BA.debugLineNum = 18;BA.debugLine="iv.Initialize(\"\")";
Debug.JustUpdateDeviceLine();
_iv.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 19;BA.debugLine="ImageView = iv";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_imageview" /*RemoteObject*/ ).setObject (_iv.getObject());
 BA.debugLineNum = 20;BA.debugLine="ImageView.Enabled = False";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_imageview" /*RemoteObject*/ ).runMethod(true,"setEnabled",x2debugdraw.__c.getField(true,"False"));
 BA.debugLineNum = 21;BA.debugLine="Parent.AddView(ImageView, 1dip, 1dip, 1dip, 1dip)";
Debug.JustUpdateDeviceLine();
_parent.runVoidMethod ("AddView",(Object)((__ref.getField(false,"_imageview" /*RemoteObject*/ ).getObject())),(Object)(x2debugdraw.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))),(Object)(x2debugdraw.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))),(Object)(x2debugdraw.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))),(Object)(x2debugdraw.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))));
 BA.debugLineNum = 22;BA.debugLine="cvs.Initialize(panel)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(__ref.getField(false,"_panel" /*RemoteObject*/ )));
 BA.debugLineNum = 23;BA.debugLine="MarkedPoints.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_markedpoints" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 24;BA.debugLine="Resize";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.x2debugdraw.class, "_resize" /*RemoteObject*/ );
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resize(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Resize (x2debugdraw) ","x2debugdraw",16,__ref.getField(false, "ba"),__ref,65);
if (RapidSub.canDelegate("resize")) { return __ref.runUserSub(false, "x2debugdraw","resize", __ref);}
 BA.debugLineNum = 65;BA.debugLine="Public Sub Resize";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 66;BA.debugLine="ImageView.SetLayoutAnimated(0, X2.mTargetView.Lef";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_imageview" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_x2" /*RemoteObject*/ ).getField(false,"_mtargetview" /*RemoteObject*/ ).runMethod(true,"getLeft")),(Object)(__ref.getField(false,"_x2" /*RemoteObject*/ ).getField(false,"_mtargetview" /*RemoteObject*/ ).runMethod(true,"getTop")),(Object)(__ref.getField(false,"_x2" /*RemoteObject*/ ).getField(false,"_mtargetview" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_x2" /*RemoteObject*/ ).getField(false,"_mtargetview" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 67;BA.debugLine="End Sub";
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