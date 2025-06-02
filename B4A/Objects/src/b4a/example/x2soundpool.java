package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class x2soundpool extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.x2soundpool");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.x2soundpool.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.collections.Map _sounds = null;
public anywheresoftware.b4a.objects.MediaPlayerWrapper _mp = null;
public anywheresoftware.b4a.audio.SoundPoolWrapper _pool = null;
public boolean _mutesounds = false;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public String  _initialize(b4a.example.x2soundpool __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="x2soundpool";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=13369344;
 //BA.debugLineNum = 13369344;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=13369345;
 //BA.debugLineNum = 13369345;BA.debugLine="sounds.Initialize";
__ref._sounds /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=13369349;
 //BA.debugLineNum = 13369349;BA.debugLine="pool.Initialize(4)";
__ref._pool /*anywheresoftware.b4a.audio.SoundPoolWrapper*/ .Initialize((int) (4));
RDebugUtils.currentLine=13369350;
 //BA.debugLineNum = 13369350;BA.debugLine="mp.Initialize";
__ref._mp /*anywheresoftware.b4a.objects.MediaPlayerWrapper*/ .Initialize();
RDebugUtils.currentLine=13369352;
 //BA.debugLineNum = 13369352;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=13369353;
 //BA.debugLineNum = 13369353;BA.debugLine="jo.InitializeContext";
_jo.InitializeContext(ba);
RDebugUtils.currentLine=13369354;
 //BA.debugLineNum = 13369354;BA.debugLine="jo.RunMethod(\"setVolumeControlStream\", Array(3))";
_jo.RunMethod("setVolumeControlStream",new Object[]{(Object)(3)});
RDebugUtils.currentLine=13369357;
 //BA.debugLineNum = 13369357;BA.debugLine="End Sub";
return "";
}
public String  _addsound(b4a.example.x2soundpool __ref,String _name,String _dir,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2soundpool";
if (Debug.shouldDelegate(ba, "addsound", true))
	 {return ((String) Debug.delegate(ba, "addsound", new Object[] {_name,_dir,_filename}));}
RDebugUtils.currentLine=13565952;
 //BA.debugLineNum = 13565952;BA.debugLine="Public Sub AddSound (Name As String, Dir As String";
RDebugUtils.currentLine=13565953;
 //BA.debugLineNum = 13565953;BA.debugLine="Name = Name.ToLowerCase";
_name = _name.toLowerCase();
RDebugUtils.currentLine=13565960;
 //BA.debugLineNum = 13565960;BA.debugLine="sounds.Put(Name, pool.Load(Dir, FileName))";
__ref._sounds /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_name),(Object)(__ref._pool /*anywheresoftware.b4a.audio.SoundPoolWrapper*/ .Load(_dir,_filename)));
RDebugUtils.currentLine=13565962;
 //BA.debugLineNum = 13565962;BA.debugLine="End Sub";
return "";
}
public String  _playsound(b4a.example.x2soundpool __ref,String _name) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2soundpool";
if (Debug.shouldDelegate(ba, "playsound", true))
	 {return ((String) Debug.delegate(ba, "playsound", new Object[] {_name}));}
RDebugUtils.currentLine=13631488;
 //BA.debugLineNum = 13631488;BA.debugLine="Public Sub PlaySound (Name As String)";
RDebugUtils.currentLine=13631489;
 //BA.debugLineNum = 13631489;BA.debugLine="PlaySound2(Name, 1)";
__ref._playsound2 /*String*/ (null,_name,(float) (1));
RDebugUtils.currentLine=13631490;
 //BA.debugLineNum = 13631490;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.x2soundpool __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2soundpool";
RDebugUtils.currentLine=13303808;
 //BA.debugLineNum = 13303808;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=13303809;
 //BA.debugLineNum = 13303809;BA.debugLine="Private sounds As Map";
_sounds = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=13303810;
 //BA.debugLineNum = 13303810;BA.debugLine="Private mp As MediaPlayer";
_mp = new anywheresoftware.b4a.objects.MediaPlayerWrapper();
RDebugUtils.currentLine=13303816;
 //BA.debugLineNum = 13303816;BA.debugLine="Private pool As SoundPool";
_pool = new anywheresoftware.b4a.audio.SoundPoolWrapper();
RDebugUtils.currentLine=13303818;
 //BA.debugLineNum = 13303818;BA.debugLine="Public MuteSounds As Boolean";
_mutesounds = false;
RDebugUtils.currentLine=13303819;
 //BA.debugLineNum = 13303819;BA.debugLine="End Sub";
return "";
}
public String  _playmusic(b4a.example.x2soundpool __ref,String _dir,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2soundpool";
if (Debug.shouldDelegate(ba, "playmusic", true))
	 {return ((String) Debug.delegate(ba, "playmusic", new Object[] {_dir,_filename}));}
RDebugUtils.currentLine=13434880;
 //BA.debugLineNum = 13434880;BA.debugLine="Public Sub PlayMusic (Dir As String, FileName As S";
RDebugUtils.currentLine=13434881;
 //BA.debugLineNum = 13434881;BA.debugLine="If mp.IsInitialized Then mp.Stop";
if (__ref._mp /*anywheresoftware.b4a.objects.MediaPlayerWrapper*/ .IsInitialized()) { 
__ref._mp /*anywheresoftware.b4a.objects.MediaPlayerWrapper*/ .Stop();};
RDebugUtils.currentLine=13434887;
 //BA.debugLineNum = 13434887;BA.debugLine="mp.Load(Dir, FileName)";
__ref._mp /*anywheresoftware.b4a.objects.MediaPlayerWrapper*/ .Load(_dir,_filename);
RDebugUtils.currentLine=13434888;
 //BA.debugLineNum = 13434888;BA.debugLine="mp.Looping = True";
__ref._mp /*anywheresoftware.b4a.objects.MediaPlayerWrapper*/ .setLooping(__c.True);
RDebugUtils.currentLine=13434889;
 //BA.debugLineNum = 13434889;BA.debugLine="mp.Play";
__ref._mp /*anywheresoftware.b4a.objects.MediaPlayerWrapper*/ .Play();
RDebugUtils.currentLine=13434895;
 //BA.debugLineNum = 13434895;BA.debugLine="End Sub";
return "";
}
public String  _playsound2(b4a.example.x2soundpool __ref,String _name,float _volume) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2soundpool";
if (Debug.shouldDelegate(ba, "playsound2", true))
	 {return ((String) Debug.delegate(ba, "playsound2", new Object[] {_name,_volume}));}
RDebugUtils.currentLine=13697024;
 //BA.debugLineNum = 13697024;BA.debugLine="Public Sub PlaySound2 (Name As String, Volume As F";
RDebugUtils.currentLine=13697025;
 //BA.debugLineNum = 13697025;BA.debugLine="If MuteSounds Then Return";
if (__ref._mutesounds /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=13697026;
 //BA.debugLineNum = 13697026;BA.debugLine="Name = Name.ToLowerCase";
_name = _name.toLowerCase();
RDebugUtils.currentLine=13697033;
 //BA.debugLineNum = 13697033;BA.debugLine="pool.Play(sounds.Get(Name), Volume, Volume, 1, 0,";
__ref._pool /*anywheresoftware.b4a.audio.SoundPoolWrapper*/ .Play((int)(BA.ObjectToNumber(__ref._sounds /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_name)))),_volume,_volume,(int) (1),(int) (0),(float) (1));
RDebugUtils.currentLine=13697035;
 //BA.debugLineNum = 13697035;BA.debugLine="End Sub";
return "";
}
public String  _stopmusic(b4a.example.x2soundpool __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="x2soundpool";
if (Debug.shouldDelegate(ba, "stopmusic", true))
	 {return ((String) Debug.delegate(ba, "stopmusic", null));}
RDebugUtils.currentLine=13500416;
 //BA.debugLineNum = 13500416;BA.debugLine="Public Sub StopMusic";
RDebugUtils.currentLine=13500417;
 //BA.debugLineNum = 13500417;BA.debugLine="If mp.IsInitialized Then mp.Stop";
if (__ref._mp /*anywheresoftware.b4a.objects.MediaPlayerWrapper*/ .IsInitialized()) { 
__ref._mp /*anywheresoftware.b4a.objects.MediaPlayerWrapper*/ .Stop();};
RDebugUtils.currentLine=13500418;
 //BA.debugLineNum = 13500418;BA.debugLine="End Sub";
return "";
}
}