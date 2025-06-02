package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class x2debugdraw extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.x2debugdraw");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.x2debugdraw.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XCanvas _cvs = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _panel = null;
public b4a.example.x2utils _x2 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _imageview = null;
public float _debugscale = 0f;
public anywheresoftware.b4a.objects.collections.List _markedpoints = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public String  _class_globals(b4a.example.x2debugdraw __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2debugdraw";
RDebugUtils.currentLine=12058624;
 //BA.debugLineNum = 12058624;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=12058625;
 //BA.debugLineNum = 12058625;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=12058626;
 //BA.debugLineNum = 12058626;BA.debugLine="Public cvs As B4XCanvas";
_cvs = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=12058627;
 //BA.debugLineNum = 12058627;BA.debugLine="Private panel As B4XView";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=12058628;
 //BA.debugLineNum = 12058628;BA.debugLine="Private X2 As X2Utils";
_x2 = new b4a.example.x2utils();
RDebugUtils.currentLine=12058629;
 //BA.debugLineNum = 12058629;BA.debugLine="Private ImageView As B4XView";
_imageview = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=12058630;
 //BA.debugLineNum = 12058630;BA.debugLine="Private DebugScale As Float = 1/2";
_debugscale = (float) (1/(double)2);
RDebugUtils.currentLine=12058631;
 //BA.debugLineNum = 12058631;BA.debugLine="Public MarkedPoints As List";
_markedpoints = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=12058632;
 //BA.debugLineNum = 12058632;BA.debugLine="End Sub";
return "";
}
public String  _draw(b4a.example.x2debugdraw __ref,b4a.example.x2utils._x2gamestep _gs,anywheresoftware.b4a.objects.collections.Map _visiblebodies) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2debugdraw";
if (Debug.shouldDelegate(ba, "draw", true))
	 {return ((String) Debug.delegate(ba, "draw", new Object[] {_gs,_visiblebodies}));}
anywheresoftware.b4a.objects.B2Body _body = null;
anywheresoftware.b4a.objects.B2Fixture _fixture = null;
RDebugUtils.currentLine=12189696;
 //BA.debugLineNum = 12189696;BA.debugLine="Public Sub Draw (gs As X2GameStep, VisibleBodies A";
RDebugUtils.currentLine=12189697;
 //BA.debugLineNum = 12189697;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=12189698;
 //BA.debugLineNum = 12189698;BA.debugLine="DrawGrid";
__ref._drawgrid /*String*/ (null);
RDebugUtils.currentLine=12189699;
 //BA.debugLineNum = 12189699;BA.debugLine="For Each body As B2Body In VisibleBodies.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _visiblebodies.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_body = (anywheresoftware.b4a.objects.B2Body)(group3.Get(index3));
RDebugUtils.currentLine=12189700;
 //BA.debugLineNum = 12189700;BA.debugLine="If body.IsInitialized = False Then Continue";
if (_body.getIsInitialized()==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=12189701;
 //BA.debugLineNum = 12189701;BA.debugLine="Dim fixture As B2Fixture = body.FirstFixture";
_fixture = _body.getFirstFixture();
RDebugUtils.currentLine=12189702;
 //BA.debugLineNum = 12189702;BA.debugLine="Do While fixture <> Null";
while (_fixture!= null) {
RDebugUtils.currentLine=12189703;
 //BA.debugLineNum = 12189703;BA.debugLine="DrawShape (body, fixture.Shape, body.Tag)";
__ref._drawshape /*String*/ (null,_body,_fixture.getShape(),(b4a.example.x2bodywrapper)(_body.getTag()));
RDebugUtils.currentLine=12189704;
 //BA.debugLineNum = 12189704;BA.debugLine="fixture = fixture.NextFixture";
_fixture = _fixture.NextFixture();
 }
;
 }
};
RDebugUtils.currentLine=12189707;
 //BA.debugLineNum = 12189707;BA.debugLine="DrawContactPoints";
__ref._drawcontactpoints /*String*/ (null);
RDebugUtils.currentLine=12189708;
 //BA.debugLineNum = 12189708;BA.debugLine="DrawJoints";
__ref._drawjoints /*String*/ (null);
RDebugUtils.currentLine=12189709;
 //BA.debugLineNum = 12189709;BA.debugLine="DrawMarkedPoints";
__ref._drawmarkedpoints /*String*/ (null);
RDebugUtils.currentLine=12189710;
 //BA.debugLineNum = 12189710;BA.debugLine="X2.SetBitmapWithFitOrFill(ImageView, cvs.CreateBi";
__ref._x2 /*b4a.example.x2utils*/ ._setbitmapwithfitorfill /*String*/ (null,__ref._imageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .CreateBitmap());
RDebugUtils.currentLine=12189711;
 //BA.debugLineNum = 12189711;BA.debugLine="End Sub";
return "";
}
public String  _drawgrid(b4a.example.x2debugdraw __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2debugdraw";
if (Debug.shouldDelegate(ba, "drawgrid", true))
	 {return ((String) Debug.delegate(ba, "drawgrid", null));}
anywheresoftware.b4a.objects.B2Vec2 _vec1 = null;
anywheresoftware.b4a.objects.B2Vec2 _vec2 = null;
int _clr = 0;
int _y = 0;
int _x = 0;
RDebugUtils.currentLine=12255232;
 //BA.debugLineNum = 12255232;BA.debugLine="Private Sub DrawGrid";
RDebugUtils.currentLine=12255233;
 //BA.debugLineNum = 12255233;BA.debugLine="Dim vec1, vec2 As B2Vec2";
_vec1 = new anywheresoftware.b4a.objects.B2Vec2();
_vec2 = new anywheresoftware.b4a.objects.B2Vec2();
RDebugUtils.currentLine=12255234;
 //BA.debugLineNum = 12255234;BA.debugLine="Dim clr As Int";
_clr = 0;
RDebugUtils.currentLine=12255235;
 //BA.debugLineNum = 12255235;BA.debugLine="For y = Ceil(X2.ScreenAABB.BottomLeft.Y) To Floor";
{
final int step3 = 1;
final int limit3 = (int) (__c.Floor(__ref._x2 /*b4a.example.x2utils*/ ._screenaabb /*anywheresoftware.b4a.objects.B2AABB*/ .getTopRight().getY()));
_y = (int) (__c.Ceil(__ref._x2 /*b4a.example.x2utils*/ ._screenaabb /*anywheresoftware.b4a.objects.B2AABB*/ .getBottomLeft().getY())) ;
for (;_y <= limit3 ;_y = _y + step3 ) {
RDebugUtils.currentLine=12255236;
 //BA.debugLineNum = 12255236;BA.debugLine="For x = Ceil(X2.ScreenAABB.BottomLeft.x) To Floo";
{
final int step4 = 1;
final int limit4 = (int) (__c.Floor(__ref._x2 /*b4a.example.x2utils*/ ._screenaabb /*anywheresoftware.b4a.objects.B2AABB*/ .getTopRight().getX()));
_x = (int) (__c.Ceil(__ref._x2 /*b4a.example.x2utils*/ ._screenaabb /*anywheresoftware.b4a.objects.B2AABB*/ .getBottomLeft().getX())) ;
for (;_x <= limit4 ;_x = _x + step4 ) {
RDebugUtils.currentLine=12255237;
 //BA.debugLineNum = 12255237;BA.debugLine="vec1.X = x - 0.05";
_vec1.setX((float) (_x-0.05));
RDebugUtils.currentLine=12255238;
 //BA.debugLineNum = 12255238;BA.debugLine="vec2.X = x + 0.05";
_vec2.setX((float) (_x+0.05));
RDebugUtils.currentLine=12255239;
 //BA.debugLineNum = 12255239;BA.debugLine="vec1.Y = y";
_vec1.setY((float) (_y));
RDebugUtils.currentLine=12255240;
 //BA.debugLineNum = 12255240;BA.debugLine="vec2.Y = y";
_vec2.setY((float) (_y));
RDebugUtils.currentLine=12255241;
 //BA.debugLineNum = 12255241;BA.debugLine="If y = 0 Then clr = xui.Color_Blue Else clr = x";
if (_y==0) { 
_clr = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Blue;}
else {
_clr = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;};
RDebugUtils.currentLine=12255242;
 //BA.debugLineNum = 12255242;BA.debugLine="DrawTwoVertices(vec1, vec2, clr)";
__ref._drawtwovertices /*String*/ (null,_vec1,_vec2,_clr);
RDebugUtils.currentLine=12255243;
 //BA.debugLineNum = 12255243;BA.debugLine="vec1.X = x";
_vec1.setX((float) (_x));
RDebugUtils.currentLine=12255244;
 //BA.debugLineNum = 12255244;BA.debugLine="vec2.X = x";
_vec2.setX((float) (_x));
RDebugUtils.currentLine=12255245;
 //BA.debugLineNum = 12255245;BA.debugLine="vec1.Y = y - 0.05";
_vec1.setY((float) (_y-0.05));
RDebugUtils.currentLine=12255246;
 //BA.debugLineNum = 12255246;BA.debugLine="vec2.Y = y + 0.05";
_vec2.setY((float) (_y+0.05));
RDebugUtils.currentLine=12255247;
 //BA.debugLineNum = 12255247;BA.debugLine="If x = 0 Then clr = xui.Color_Blue Else clr = x";
if (_x==0) { 
_clr = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Blue;}
else {
_clr = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;};
RDebugUtils.currentLine=12255248;
 //BA.debugLineNum = 12255248;BA.debugLine="DrawTwoVertices(vec1, vec2, clr)";
__ref._drawtwovertices /*String*/ (null,_vec1,_vec2,_clr);
 }
};
 }
};
RDebugUtils.currentLine=12255251;
 //BA.debugLineNum = 12255251;BA.debugLine="End Sub";
return "";
}
public String  _drawshape(b4a.example.x2debugdraw __ref,anywheresoftware.b4a.objects.B2Body _body,anywheresoftware.b4a.objects.B2Shape.ConcreteB2Shape _shape,b4a.example.x2bodywrapper _bw) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2debugdraw";
if (Debug.shouldDelegate(ba, "drawshape", true))
	 {return ((String) Debug.delegate(ba, "drawshape", new Object[] {_body,_shape,_bw}));}
int _clr = 0;
anywheresoftware.b4a.objects.B2Vec2 _vec = null;
anywheresoftware.b4a.objects.B2Shape.B2CircleShape _circle = null;
anywheresoftware.b4a.objects.B2Shape.B2EdgeShape _edge = null;
anywheresoftware.b4a.objects.B2Shape.B2PolygonShape _polygon = null;
anywheresoftware.b4a.objects.B2Vec2 _prevvertex = null;
int _i = 0;
anywheresoftware.b4a.objects.B2Vec2 _vertex = null;
anywheresoftware.b4a.objects.B2Shape.B2ChainShape _chain = null;
RDebugUtils.currentLine=12582912;
 //BA.debugLineNum = 12582912;BA.debugLine="Private Sub DrawShape (body As B2Body, shape As B2";
RDebugUtils.currentLine=12582913;
 //BA.debugLineNum = 12582913;BA.debugLine="Dim clr As Int = 0xFF0200FF";
_clr = ((int)0xff0200ff);
RDebugUtils.currentLine=12582914;
 //BA.debugLineNum = 12582914;BA.debugLine="If body.IsColliding Then";
if (_body.getIsColliding()) { 
RDebugUtils.currentLine=12582915;
 //BA.debugLineNum = 12582915;BA.debugLine="clr = 0xFFFFC700";
_clr = ((int)0xffffc700);
RDebugUtils.currentLine=12582916;
 //BA.debugLineNum = 12582916;BA.debugLine="If body.GetContactList(True).Size > 0 Then";
if (_body.GetContactList(__c.True).getSize()>0) { 
RDebugUtils.currentLine=12582917;
 //BA.debugLineNum = 12582917;BA.debugLine="clr = 0xFFFF2E00";
_clr = ((int)0xffff2e00);
 };
 };
RDebugUtils.currentLine=12582920;
 //BA.debugLineNum = 12582920;BA.debugLine="If body.Awake = False Then";
if (_body.getAwake()==__c.False) { 
RDebugUtils.currentLine=12582921;
 //BA.debugLineNum = 12582921;BA.debugLine="clr = xui.Color_Green";
_clr = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Green;
 };
RDebugUtils.currentLine=12582924;
 //BA.debugLineNum = 12582924;BA.debugLine="Dim vec As B2Vec2 = body.WorldCenter";
_vec = _body.getWorldCenter();
RDebugUtils.currentLine=12582925;
 //BA.debugLineNum = 12582925;BA.debugLine="vec = X2.WorldPointToMainBC(vec.X, vec.Y)";
_vec = __ref._x2 /*b4a.example.x2utils*/ ._worldpointtomainbc /*anywheresoftware.b4a.objects.B2Vec2*/ (null,_vec.getX(),_vec.getY());
RDebugUtils.currentLine=12582926;
 //BA.debugLineNum = 12582926;BA.debugLine="vec.MultiplyThis(DebugScale)";
_vec.MultiplyThis(__ref._debugscale /*float*/ );
RDebugUtils.currentLine=12582927;
 //BA.debugLineNum = 12582927;BA.debugLine="cvs.DrawCircle(vec.X, vec.Y, 1, clr, True, 0)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle(_vec.getX(),_vec.getY(),(float) (1),_clr,__c.True,(float) (0));
RDebugUtils.currentLine=12582928;
 //BA.debugLineNum = 12582928;BA.debugLine="vec = body.Position";
_vec = _body.getPosition();
RDebugUtils.currentLine=12582929;
 //BA.debugLineNum = 12582929;BA.debugLine="vec = X2.WorldPointToMainBC(vec.X, vec.Y)";
_vec = __ref._x2 /*b4a.example.x2utils*/ ._worldpointtomainbc /*anywheresoftware.b4a.objects.B2Vec2*/ (null,_vec.getX(),_vec.getY());
RDebugUtils.currentLine=12582930;
 //BA.debugLineNum = 12582930;BA.debugLine="vec.MultiplyThis(DebugScale)";
_vec.MultiplyThis(__ref._debugscale /*float*/ );
RDebugUtils.currentLine=12582931;
 //BA.debugLineNum = 12582931;BA.debugLine="cvs.DrawCircle(vec.X, vec.Y, 2, 0xFFFF0096, False";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle(_vec.getX(),_vec.getY(),(float) (2),((int)0xffff0096),__c.False,(float) (2));
RDebugUtils.currentLine=12582932;
 //BA.debugLineNum = 12582932;BA.debugLine="If bw.DebugDrawColor <> 0 Then clr = bw.DebugDraw";
if (_bw._debugdrawcolor /*int*/ !=0) { 
_clr = _bw._debugdrawcolor /*int*/ ;};
RDebugUtils.currentLine=12582933;
 //BA.debugLineNum = 12582933;BA.debugLine="Select shape.ShapeType";
switch (BA.switchObjectToInt(_shape.getShapeType(),_shape.SHAPE_CIRCLE,_shape.SHAPE_EDGE,_shape.SHAPE_POLYGON,_shape.SHAPE_CHAIN)) {
case 0: {
RDebugUtils.currentLine=12582935;
 //BA.debugLineNum = 12582935;BA.debugLine="Dim circle As B2CircleShape = shape";
_circle = new anywheresoftware.b4a.objects.B2Shape.B2CircleShape();
_circle = (anywheresoftware.b4a.objects.B2Shape.B2CircleShape) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B2Shape.B2CircleShape(), (org.jbox2d.collision.shapes.CircleShape)(_shape.getObject()));
RDebugUtils.currentLine=12582936;
 //BA.debugLineNum = 12582936;BA.debugLine="Dim vec As B2Vec2 = body.GetWorldPoint(circle.S";
_vec = _body.GetWorldPoint(_circle.getSupportVertex());
RDebugUtils.currentLine=12582937;
 //BA.debugLineNum = 12582937;BA.debugLine="vec = X2.WorldPointToMainBC(vec.X, vec.Y)";
_vec = __ref._x2 /*b4a.example.x2utils*/ ._worldpointtomainbc /*anywheresoftware.b4a.objects.B2Vec2*/ (null,_vec.getX(),_vec.getY());
RDebugUtils.currentLine=12582938;
 //BA.debugLineNum = 12582938;BA.debugLine="vec.MultiplyThis(DebugScale)";
_vec.MultiplyThis(__ref._debugscale /*float*/ );
RDebugUtils.currentLine=12582939;
 //BA.debugLineNum = 12582939;BA.debugLine="cvs.DrawCircle(vec.X, vec.Y, X2.MetersToBCPixel";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle(_vec.getX(),_vec.getY(),(float) (__ref._x2 /*b4a.example.x2utils*/ ._meterstobcpixels /*int*/ (null,_circle.getRadius())*__ref._debugscale /*float*/ ),_clr,__c.False,(float) (1));
 break; }
case 1: {
RDebugUtils.currentLine=12582941;
 //BA.debugLineNum = 12582941;BA.debugLine="Dim edge As B2EdgeShape = shape";
_edge = new anywheresoftware.b4a.objects.B2Shape.B2EdgeShape();
_edge = (anywheresoftware.b4a.objects.B2Shape.B2EdgeShape) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B2Shape.B2EdgeShape(), (org.jbox2d.collision.shapes.EdgeShape)(_shape.getObject()));
RDebugUtils.currentLine=12582942;
 //BA.debugLineNum = 12582942;BA.debugLine="DrawTwoVertices(body.GetWorldPoint(edge.Vertex1";
__ref._drawtwovertices /*String*/ (null,_body.GetWorldPoint(_edge.getVertex1()),_body.GetWorldPoint(_edge.getVertex2()),_clr);
 break; }
case 2: {
RDebugUtils.currentLine=12582944;
 //BA.debugLineNum = 12582944;BA.debugLine="Dim polygon As B2PolygonShape = shape";
_polygon = new anywheresoftware.b4a.objects.B2Shape.B2PolygonShape();
_polygon = (anywheresoftware.b4a.objects.B2Shape.B2PolygonShape) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B2Shape.B2PolygonShape(), (org.jbox2d.collision.shapes.PolygonShape)(_shape.getObject()));
RDebugUtils.currentLine=12582945;
 //BA.debugLineNum = 12582945;BA.debugLine="Dim PrevVertex As B2Vec2 = body.GetWorldPoint(p";
_prevvertex = _body.GetWorldPoint(_polygon.GetVertex((int) (0)));
RDebugUtils.currentLine=12582946;
 //BA.debugLineNum = 12582946;BA.debugLine="For i = 1 To polygon.VertexCount - 1";
{
final int step33 = 1;
final int limit33 = (int) (_polygon.getVertexCount()-1);
_i = (int) (1) ;
for (;_i <= limit33 ;_i = _i + step33 ) {
RDebugUtils.currentLine=12582947;
 //BA.debugLineNum = 12582947;BA.debugLine="Dim vertex As B2Vec2 = body.GetWorldPoint(poly";
_vertex = _body.GetWorldPoint(_polygon.GetVertex(_i));
RDebugUtils.currentLine=12582948;
 //BA.debugLineNum = 12582948;BA.debugLine="DrawTwoVertices(PrevVertex, vertex, clr)";
__ref._drawtwovertices /*String*/ (null,_prevvertex,_vertex,_clr);
RDebugUtils.currentLine=12582949;
 //BA.debugLineNum = 12582949;BA.debugLine="PrevVertex = vertex";
_prevvertex = _vertex;
 }
};
RDebugUtils.currentLine=12582951;
 //BA.debugLineNum = 12582951;BA.debugLine="DrawTwoVertices(PrevVertex, body.GetWorldPoint(";
__ref._drawtwovertices /*String*/ (null,_prevvertex,_body.GetWorldPoint(_polygon.GetVertex((int) (0))),_clr);
 break; }
case 3: {
RDebugUtils.currentLine=12582953;
 //BA.debugLineNum = 12582953;BA.debugLine="Dim chain As B2ChainShape = shape";
_chain = new anywheresoftware.b4a.objects.B2Shape.B2ChainShape();
_chain = (anywheresoftware.b4a.objects.B2Shape.B2ChainShape) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B2Shape.B2ChainShape(), (org.jbox2d.collision.shapes.ChainShape)(_shape.getObject()));
RDebugUtils.currentLine=12582954;
 //BA.debugLineNum = 12582954;BA.debugLine="Dim edge As B2EdgeShape";
_edge = new anywheresoftware.b4a.objects.B2Shape.B2EdgeShape();
RDebugUtils.currentLine=12582955;
 //BA.debugLineNum = 12582955;BA.debugLine="edge.Initialize(Null, Null)";
_edge.Initialize((anywheresoftware.b4a.objects.B2Vec2)(__c.Null),(anywheresoftware.b4a.objects.B2Vec2)(__c.Null));
RDebugUtils.currentLine=12582956;
 //BA.debugLineNum = 12582956;BA.debugLine="For i = 0 To chain.EdgeCount - 1";
{
final int step43 = 1;
final int limit43 = (int) (_chain.getEdgeCount()-1);
_i = (int) (0) ;
for (;_i <= limit43 ;_i = _i + step43 ) {
RDebugUtils.currentLine=12582957;
 //BA.debugLineNum = 12582957;BA.debugLine="chain.GetEdge(i, edge)";
_chain.GetEdge(_i,_edge);
RDebugUtils.currentLine=12582958;
 //BA.debugLineNum = 12582958;BA.debugLine="DrawTwoVertices(body.GetWorldPoint(edge.Vertex";
__ref._drawtwovertices /*String*/ (null,_body.GetWorldPoint(_edge.getVertex1()),_body.GetWorldPoint(_edge.getVertex2()),_clr);
 }
};
 break; }
}
;
RDebugUtils.currentLine=12582961;
 //BA.debugLineNum = 12582961;BA.debugLine="End Sub";
return "";
}
public String  _drawcontactpoints(b4a.example.x2debugdraw __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2debugdraw";
if (Debug.shouldDelegate(ba, "drawcontactpoints", true))
	 {return ((String) Debug.delegate(ba, "drawcontactpoints", null));}
anywheresoftware.b4a.objects.B2Contact _contact = null;
anywheresoftware.b4a.objects.B2WorldManifold _wm = null;
int _i = 0;
anywheresoftware.b4a.objects.B2Vec2 _worldpoint = null;
anywheresoftware.b4a.objects.B2Vec2 _vec = null;
RDebugUtils.currentLine=12451840;
 //BA.debugLineNum = 12451840;BA.debugLine="Private Sub DrawContactPoints";
RDebugUtils.currentLine=12451841;
 //BA.debugLineNum = 12451841;BA.debugLine="Dim contact As B2Contact = X2.mWorld.FirstContact";
_contact = __ref._x2 /*b4a.example.x2utils*/ ._mworld /*anywheresoftware.b4a.objects.B2World*/ .FirstContact();
RDebugUtils.currentLine=12451842;
 //BA.debugLineNum = 12451842;BA.debugLine="Dim wm As B2WorldManifold";
_wm = new anywheresoftware.b4a.objects.B2WorldManifold();
RDebugUtils.currentLine=12451843;
 //BA.debugLineNum = 12451843;BA.debugLine="Do While contact <> Null";
while (_contact!= null) {
RDebugUtils.currentLine=12451844;
 //BA.debugLineNum = 12451844;BA.debugLine="contact.GetWorldManifold(wm)";
_contact.GetWorldManifold(_wm);
RDebugUtils.currentLine=12451845;
 //BA.debugLineNum = 12451845;BA.debugLine="For i = 0 To wm.PointCount - 1";
{
final int step5 = 1;
final int limit5 = (int) (_wm.PointCount-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=12451846;
 //BA.debugLineNum = 12451846;BA.debugLine="Dim WorldPoint As B2Vec2 = wm.GetPoint(i)";
_worldpoint = _wm.GetPoint(_i);
RDebugUtils.currentLine=12451847;
 //BA.debugLineNum = 12451847;BA.debugLine="Dim vec As B2Vec2 = X2.WorldPointToMainBC(World";
_vec = __ref._x2 /*b4a.example.x2utils*/ ._worldpointtomainbc /*anywheresoftware.b4a.objects.B2Vec2*/ (null,_worldpoint.getX(),_worldpoint.getY());
RDebugUtils.currentLine=12451848;
 //BA.debugLineNum = 12451848;BA.debugLine="vec.MultiplyThis(DebugScale)";
_vec.MultiplyThis(__ref._debugscale /*float*/ );
RDebugUtils.currentLine=12451849;
 //BA.debugLineNum = 12451849;BA.debugLine="cvs.DrawCircle(vec.X, vec.Y, 3, 0xFFFF2E00, Tru";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle(_vec.getX(),_vec.getY(),(float) (3),((int)0xffff2e00),__c.True,(float) (0));
 }
};
RDebugUtils.currentLine=12451851;
 //BA.debugLineNum = 12451851;BA.debugLine="contact = contact.NextContact";
_contact = _contact.NextContact();
 }
;
RDebugUtils.currentLine=12451853;
 //BA.debugLineNum = 12451853;BA.debugLine="End Sub";
return "";
}
public String  _drawjoints(b4a.example.x2debugdraw __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2debugdraw";
if (Debug.shouldDelegate(ba, "drawjoints", true))
	 {return ((String) Debug.delegate(ba, "drawjoints", null));}
int _jointscolor = 0;
anywheresoftware.b4a.objects.joints.B2Joint _joint = null;
RDebugUtils.currentLine=12386304;
 //BA.debugLineNum = 12386304;BA.debugLine="Private Sub DrawJoints";
RDebugUtils.currentLine=12386305;
 //BA.debugLineNum = 12386305;BA.debugLine="Dim JointsColor As Int = 0xFF00F2FF";
_jointscolor = ((int)0xff00f2ff);
RDebugUtils.currentLine=12386306;
 //BA.debugLineNum = 12386306;BA.debugLine="Dim Joint As B2Joint = X2.mWorld.FirstJoint";
_joint = __ref._x2 /*b4a.example.x2utils*/ ._mworld /*anywheresoftware.b4a.objects.B2World*/ .FirstJoint();
RDebugUtils.currentLine=12386307;
 //BA.debugLineNum = 12386307;BA.debugLine="Do While Joint <> Null";
while (_joint!= null) {
RDebugUtils.currentLine=12386308;
 //BA.debugLineNum = 12386308;BA.debugLine="DrawTwoVertices(Joint.BodyA.Position, Joint.Anch";
__ref._drawtwovertices /*String*/ (null,_joint.getBodyA().getPosition(),_joint.getAnchorA(),_jointscolor);
RDebugUtils.currentLine=12386309;
 //BA.debugLineNum = 12386309;BA.debugLine="DrawTwoVertices(Joint.AnchorA, Joint.AnchorB, Jo";
__ref._drawtwovertices /*String*/ (null,_joint.getAnchorA(),_joint.getAnchorB(),_jointscolor);
RDebugUtils.currentLine=12386310;
 //BA.debugLineNum = 12386310;BA.debugLine="DrawTwoVertices(Joint.AnchorB, Joint.BodyB.Posit";
__ref._drawtwovertices /*String*/ (null,_joint.getAnchorB(),_joint.getBodyB().getPosition(),_jointscolor);
RDebugUtils.currentLine=12386311;
 //BA.debugLineNum = 12386311;BA.debugLine="Joint = Joint.NextJoint";
_joint = _joint.NextJoint();
 }
;
RDebugUtils.currentLine=12386313;
 //BA.debugLineNum = 12386313;BA.debugLine="End Sub";
return "";
}
public String  _drawmarkedpoints(b4a.example.x2debugdraw __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2debugdraw";
if (Debug.shouldDelegate(ba, "drawmarkedpoints", true))
	 {return ((String) Debug.delegate(ba, "drawmarkedpoints", null));}
anywheresoftware.b4a.objects.B2Vec2 _vec = null;
anywheresoftware.b4a.objects.B2Vec2 _v = null;
RDebugUtils.currentLine=12517376;
 //BA.debugLineNum = 12517376;BA.debugLine="Private Sub DrawMarkedPoints";
RDebugUtils.currentLine=12517377;
 //BA.debugLineNum = 12517377;BA.debugLine="For Each vec As B2Vec2 In MarkedPoints";
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._markedpoints /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_vec = (anywheresoftware.b4a.objects.B2Vec2)(group1.Get(index1));
RDebugUtils.currentLine=12517378;
 //BA.debugLineNum = 12517378;BA.debugLine="Dim v As B2Vec2 = X2.WorldPointToMainBC(vec.X, v";
_v = __ref._x2 /*b4a.example.x2utils*/ ._worldpointtomainbc /*anywheresoftware.b4a.objects.B2Vec2*/ (null,_vec.getX(),_vec.getY());
RDebugUtils.currentLine=12517379;
 //BA.debugLineNum = 12517379;BA.debugLine="v.MultiplyThis(DebugScale)";
_v.MultiplyThis(__ref._debugscale /*float*/ );
RDebugUtils.currentLine=12517380;
 //BA.debugLineNum = 12517380;BA.debugLine="cvs.DrawCircle(v.X, v.Y, 3, 0xFF78FF71, True, 0)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle(_v.getX(),_v.getY(),(float) (3),((int)0xff78ff71),__c.True,(float) (0));
 }
};
RDebugUtils.currentLine=12517382;
 //BA.debugLineNum = 12517382;BA.debugLine="MarkedPoints.Clear";
__ref._markedpoints /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=12517383;
 //BA.debugLineNum = 12517383;BA.debugLine="End Sub";
return "";
}
public String  _drawtwovertices(b4a.example.x2debugdraw __ref,anywheresoftware.b4a.objects.B2Vec2 _vec1,anywheresoftware.b4a.objects.B2Vec2 _vec2,int _clr) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2debugdraw";
if (Debug.shouldDelegate(ba, "drawtwovertices", true))
	 {return ((String) Debug.delegate(ba, "drawtwovertices", new Object[] {_vec1,_vec2,_clr}));}
RDebugUtils.currentLine=12648448;
 //BA.debugLineNum = 12648448;BA.debugLine="Private Sub DrawTwoVertices(vec1 As B2Vec2, vec2 A";
RDebugUtils.currentLine=12648450;
 //BA.debugLineNum = 12648450;BA.debugLine="vec1 = X2.WorldPointToMainBC(vec1.X, vec1.Y)";
_vec1 = __ref._x2 /*b4a.example.x2utils*/ ._worldpointtomainbc /*anywheresoftware.b4a.objects.B2Vec2*/ (null,_vec1.getX(),_vec1.getY());
RDebugUtils.currentLine=12648451;
 //BA.debugLineNum = 12648451;BA.debugLine="vec1.MultiplyThis(DebugScale)";
_vec1.MultiplyThis(__ref._debugscale /*float*/ );
RDebugUtils.currentLine=12648452;
 //BA.debugLineNum = 12648452;BA.debugLine="vec2 = X2.WorldPointToMainBC(vec2.X, vec2.Y)";
_vec2 = __ref._x2 /*b4a.example.x2utils*/ ._worldpointtomainbc /*anywheresoftware.b4a.objects.B2Vec2*/ (null,_vec2.getX(),_vec2.getY());
RDebugUtils.currentLine=12648453;
 //BA.debugLineNum = 12648453;BA.debugLine="vec2.MultiplyThis(DebugScale)";
_vec2.MultiplyThis(__ref._debugscale /*float*/ );
RDebugUtils.currentLine=12648454;
 //BA.debugLineNum = 12648454;BA.debugLine="cvs.DrawLine(vec1.X, vec1.Y, vec2.X, vec2.Y, clr,";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawLine(_vec1.getX(),_vec1.getY(),_vec2.getX(),_vec2.getY(),_clr,(float) (1));
RDebugUtils.currentLine=12648455;
 //BA.debugLineNum = 12648455;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.x2debugdraw __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper _parent,b4a.example.x2utils _vx2) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="x2debugdraw";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_parent,_vx2}));}
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
RDebugUtils.currentLine=12124160;
 //BA.debugLineNum = 12124160;BA.debugLine="Public Sub Initialize (Parent As B4XView, vX2 As X";
RDebugUtils.currentLine=12124161;
 //BA.debugLineNum = 12124161;BA.debugLine="panel = xui.CreatePanel(\"\")";
__ref._panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=12124162;
 //BA.debugLineNum = 12124162;BA.debugLine="X2 = vX2";
__ref._x2 /*b4a.example.x2utils*/  = _vx2;
RDebugUtils.currentLine=12124163;
 //BA.debugLineNum = 12124163;BA.debugLine="panel.SetLayoutAnimated(0, 0, 0, X2.MainBC.mWidth";
__ref._panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (__ref._x2 /*b4a.example.x2utils*/ ._mainbc /*b4a.example.bitmapcreator*/ ._mwidth*__ref._debugscale /*float*/ ),(int) (__ref._x2 /*b4a.example.x2utils*/ ._mainbc /*b4a.example.bitmapcreator*/ ._mheight*__ref._debugscale /*float*/ ));
RDebugUtils.currentLine=12124164;
 //BA.debugLineNum = 12124164;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=12124165;
 //BA.debugLineNum = 12124165;BA.debugLine="iv.Initialize(\"\")";
_iv.Initialize(ba,"");
RDebugUtils.currentLine=12124166;
 //BA.debugLineNum = 12124166;BA.debugLine="ImageView = iv";
__ref._imageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iv.getObject()));
RDebugUtils.currentLine=12124167;
 //BA.debugLineNum = 12124167;BA.debugLine="ImageView.Enabled = False";
__ref._imageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=12124168;
 //BA.debugLineNum = 12124168;BA.debugLine="Parent.AddView(ImageView, 1dip, 1dip, 1dip, 1dip)";
_parent.AddView((android.view.View)(__ref._imageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (1)));
RDebugUtils.currentLine=12124169;
 //BA.debugLineNum = 12124169;BA.debugLine="cvs.Initialize(panel)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(__ref._panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=12124170;
 //BA.debugLineNum = 12124170;BA.debugLine="MarkedPoints.Initialize";
__ref._markedpoints /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=12124171;
 //BA.debugLineNum = 12124171;BA.debugLine="Resize";
__ref._resize /*String*/ (null);
RDebugUtils.currentLine=12124172;
 //BA.debugLineNum = 12124172;BA.debugLine="End Sub";
return "";
}
public String  _resize(b4a.example.x2debugdraw __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2debugdraw";
if (Debug.shouldDelegate(ba, "resize", true))
	 {return ((String) Debug.delegate(ba, "resize", null));}
RDebugUtils.currentLine=12320768;
 //BA.debugLineNum = 12320768;BA.debugLine="Public Sub Resize";
RDebugUtils.currentLine=12320769;
 //BA.debugLineNum = 12320769;BA.debugLine="ImageView.SetLayoutAnimated(0, X2.mTargetView.Lef";
__ref._imageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),__ref._x2 /*b4a.example.x2utils*/ ._mtargetview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft(),__ref._x2 /*b4a.example.x2utils*/ ._mtargetview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop(),__ref._x2 /*b4a.example.x2utils*/ ._mtargetview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._x2 /*b4a.example.x2utils*/ ._mtargetview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=12320770;
 //BA.debugLineNum = 12320770;BA.debugLine="End Sub";
return "";
}
}