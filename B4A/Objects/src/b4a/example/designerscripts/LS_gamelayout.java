package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_gamelayout{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
String _gameratio="";
String _screenratio="";
//BA.debugLineNum = 2;BA.debugLine="GameRatio = 1.333 'width / height"[gamelayout/General script]
_gameratio = "1.333";
//BA.debugLineNum = 3;BA.debugLine="ScreenRatio = 100%x / 100%y"[gamelayout/General script]
_screenratio = BA.NumberToString((100d / 100 * width)/(100d / 100 * height));
//BA.debugLineNum = 4;BA.debugLine="If ScreenRatio < GameRatio Then"[gamelayout/General script]
if ((Double.parseDouble(_screenratio)<Double.parseDouble(_gameratio))) { 
;
//BA.debugLineNum = 5;BA.debugLine="ivForeground.SetLeftAndRight(0, 100%x)"[gamelayout/General script]
views.get("ivforeground").vw.setLeft((int)(0d));
views.get("ivforeground").vw.setWidth((int)((100d / 100 * width) - (0d)));
//BA.debugLineNum = 6;BA.debugLine="ivForeground.Height = ivForeground.Width / GameRatio"[gamelayout/General script]
views.get("ivforeground").vw.setHeight((int)((views.get("ivforeground").vw.getWidth())/Double.parseDouble(_gameratio)));
//BA.debugLineNum = 7;BA.debugLine="ivForeground.VerticalCenter = 50%y"[gamelayout/General script]
views.get("ivforeground").vw.setTop((int)((50d / 100 * height) - (views.get("ivforeground").vw.getHeight() / 2)));
//BA.debugLineNum = 8;BA.debugLine="Else"[gamelayout/General script]
;}else{ 
;
//BA.debugLineNum = 9;BA.debugLine="ivForeground.SetTopAndBottom(0, 100%y)"[gamelayout/General script]
views.get("ivforeground").vw.setTop((int)(0d));
views.get("ivforeground").vw.setHeight((int)((100d / 100 * height) - (0d)));
//BA.debugLineNum = 10;BA.debugLine="ivForeground.Width = ivForeground.Height * GameRatio"[gamelayout/General script]
views.get("ivforeground").vw.setWidth((int)((views.get("ivforeground").vw.getHeight())*Double.parseDouble(_gameratio)));
//BA.debugLineNum = 11;BA.debugLine="ivForeground.HorizontalCenter = 50%x"[gamelayout/General script]
views.get("ivforeground").vw.setLeft((int)((50d / 100 * width) - (views.get("ivforeground").vw.getWidth() / 2)));
//BA.debugLineNum = 12;BA.debugLine="End If"[gamelayout/General script]
;};
//BA.debugLineNum = 13;BA.debugLine="ivBackground.SetLeftAndRight(ivForeground.Left, ivForeground.Right)"[gamelayout/General script]
views.get("ivbackground").vw.setLeft((int)((views.get("ivforeground").vw.getLeft())));
views.get("ivbackground").vw.setWidth((int)((views.get("ivforeground").vw.getLeft() + views.get("ivforeground").vw.getWidth()) - ((views.get("ivforeground").vw.getLeft()))));
//BA.debugLineNum = 14;BA.debugLine="ivBackground.SetTopAndBottom(ivForeground.Top, ivForeground.Bottom)"[gamelayout/General script]
views.get("ivbackground").vw.setTop((int)((views.get("ivforeground").vw.getTop())));
views.get("ivbackground").vw.setHeight((int)((views.get("ivforeground").vw.getTop() + views.get("ivforeground").vw.getHeight()) - ((views.get("ivforeground").vw.getTop()))));
//BA.debugLineNum = 15;BA.debugLine="PanelForTouch.SetLeftAndRight(ivForeground.Left, ivForeground.Right)"[gamelayout/General script]
views.get("panelfortouch").vw.setLeft((int)((views.get("ivforeground").vw.getLeft())));
views.get("panelfortouch").vw.setWidth((int)((views.get("ivforeground").vw.getLeft() + views.get("ivforeground").vw.getWidth()) - ((views.get("ivforeground").vw.getLeft()))));
//BA.debugLineNum = 16;BA.debugLine="PanelForTouch.SetTopAndBottom(ivForeground.Top, ivForeground.Bottom)"[gamelayout/General script]
views.get("panelfortouch").vw.setTop((int)((views.get("ivforeground").vw.getTop())));
views.get("panelfortouch").vw.setHeight((int)((views.get("ivforeground").vw.getTop() + views.get("ivforeground").vw.getHeight()) - ((views.get("ivforeground").vw.getTop()))));
//BA.debugLineNum = 17;BA.debugLine="lblStats.Left = ivForeground.Left"[gamelayout/General script]
views.get("lblstats").vw.setLeft((int)((views.get("ivforeground").vw.getLeft())));

}
}