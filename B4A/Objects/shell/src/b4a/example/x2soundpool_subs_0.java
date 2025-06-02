package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class x2soundpool_subs_0 {


public static RemoteObject  _addsound(RemoteObject __ref,RemoteObject _name,RemoteObject _dir,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("AddSound (x2soundpool) ","x2soundpool",18,__ref.getField(false, "ba"),__ref,52);
if (RapidSub.canDelegate("addsound")) { return __ref.runUserSub(false, "x2soundpool","addsound", __ref, _name, _dir, _filename);}
Debug.locals.put("Name", _name);
Debug.locals.put("Dir", _dir);
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 52;BA.debugLine="Public Sub AddSound (Name As String, Dir As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 53;BA.debugLine="Name = Name.ToLowerCase";
Debug.JustUpdateDeviceLine();
_name = _name.runMethod(true,"toLowerCase");Debug.locals.put("Name", _name);
 BA.debugLineNum = 60;BA.debugLine="sounds.Put(Name, pool.Load(Dir, FileName))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_sounds" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_name)),(Object)((__ref.getField(false,"_pool" /*RemoteObject*/ ).runMethod(true,"Load",(Object)(_dir),(Object)(_filename)))));
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private sounds As Map";
x2soundpool._sounds = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_sounds",x2soundpool._sounds);
 //BA.debugLineNum = 4;BA.debugLine="Private mp As MediaPlayer";
x2soundpool._mp = RemoteObject.createNew ("anywheresoftware.b4a.objects.MediaPlayerWrapper");__ref.setField("_mp",x2soundpool._mp);
 //BA.debugLineNum = 10;BA.debugLine="Private pool As SoundPool";
x2soundpool._pool = RemoteObject.createNew ("anywheresoftware.b4a.audio.SoundPoolWrapper");__ref.setField("_pool",x2soundpool._pool);
 //BA.debugLineNum = 12;BA.debugLine="Public MuteSounds As Boolean";
x2soundpool._mutesounds = RemoteObject.createImmutable(false);__ref.setField("_mutesounds",x2soundpool._mutesounds);
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (x2soundpool) ","x2soundpool",18,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "x2soundpool","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 16;BA.debugLine="sounds.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_sounds" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 20;BA.debugLine="pool.Initialize(4)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_pool" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(BA.numberCast(int.class, 4)));
 BA.debugLineNum = 21;BA.debugLine="mp.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mp" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 23;BA.debugLine="Dim jo As JavaObject";
Debug.JustUpdateDeviceLine();
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 24;BA.debugLine="jo.InitializeContext";
Debug.JustUpdateDeviceLine();
_jo.runVoidMethod ("InitializeContext",__ref.getField(false, "ba"));
 BA.debugLineNum = 25;BA.debugLine="jo.RunMethod(\"setVolumeControlStream\", Array(3))";
Debug.JustUpdateDeviceLine();
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setVolumeControlStream")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {RemoteObject.createImmutable((3))})));
 BA.debugLineNum = 28;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _playmusic(RemoteObject __ref,RemoteObject _dir,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("PlayMusic (x2soundpool) ","x2soundpool",18,__ref.getField(false, "ba"),__ref,30);
if (RapidSub.canDelegate("playmusic")) { return __ref.runUserSub(false, "x2soundpool","playmusic", __ref, _dir, _filename);}
Debug.locals.put("Dir", _dir);
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 30;BA.debugLine="Public Sub PlayMusic (Dir As String, FileName As S";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 31;BA.debugLine="If mp.IsInitialized Then mp.Stop";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_mp" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
__ref.getField(false,"_mp" /*RemoteObject*/ ).runVoidMethod ("Stop");};
 BA.debugLineNum = 37;BA.debugLine="mp.Load(Dir, FileName)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mp" /*RemoteObject*/ ).runVoidMethod ("Load",(Object)(_dir),(Object)(_filename));
 BA.debugLineNum = 38;BA.debugLine="mp.Looping = True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mp" /*RemoteObject*/ ).runMethod(true,"setLooping",x2soundpool.__c.getField(true,"True"));
 BA.debugLineNum = 39;BA.debugLine="mp.Play";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mp" /*RemoteObject*/ ).runVoidMethod ("Play");
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
public static RemoteObject  _playsound(RemoteObject __ref,RemoteObject _name) throws Exception{
try {
		Debug.PushSubsStack("PlaySound (x2soundpool) ","x2soundpool",18,__ref.getField(false, "ba"),__ref,65);
if (RapidSub.canDelegate("playsound")) { return __ref.runUserSub(false, "x2soundpool","playsound", __ref, _name);}
Debug.locals.put("Name", _name);
 BA.debugLineNum = 65;BA.debugLine="Public Sub PlaySound (Name As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 66;BA.debugLine="PlaySound2(Name, 1)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.x2soundpool.class, "_playsound2" /*RemoteObject*/ ,(Object)(_name),(Object)(BA.numberCast(float.class, 1)));
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
public static RemoteObject  _playsound2(RemoteObject __ref,RemoteObject _name,RemoteObject _volume) throws Exception{
try {
		Debug.PushSubsStack("PlaySound2 (x2soundpool) ","x2soundpool",18,__ref.getField(false, "ba"),__ref,71);
if (RapidSub.canDelegate("playsound2")) { return __ref.runUserSub(false, "x2soundpool","playsound2", __ref, _name, _volume);}
Debug.locals.put("Name", _name);
Debug.locals.put("Volume", _volume);
 BA.debugLineNum = 71;BA.debugLine="Public Sub PlaySound2 (Name As String, Volume As F";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 72;BA.debugLine="If MuteSounds Then Return";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_mutesounds" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 73;BA.debugLine="Name = Name.ToLowerCase";
Debug.JustUpdateDeviceLine();
_name = _name.runMethod(true,"toLowerCase");Debug.locals.put("Name", _name);
 BA.debugLineNum = 80;BA.debugLine="pool.Play(sounds.Get(Name), Volume, Volume, 1, 0,";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_pool" /*RemoteObject*/ ).runVoidMethod ("Play",(Object)(BA.numberCast(int.class, __ref.getField(false,"_sounds" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_name))))),(Object)(_volume),(Object)(_volume),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 1)));
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
public static RemoteObject  _stopmusic(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("StopMusic (x2soundpool) ","x2soundpool",18,__ref.getField(false, "ba"),__ref,47);
if (RapidSub.canDelegate("stopmusic")) { return __ref.runUserSub(false, "x2soundpool","stopmusic", __ref);}
 BA.debugLineNum = 47;BA.debugLine="Public Sub StopMusic";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 48;BA.debugLine="If mp.IsInitialized Then mp.Stop";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_mp" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
__ref.getField(false,"_mp" /*RemoteObject*/ ).runVoidMethod ("Stop");};
 BA.debugLineNum = 49;BA.debugLine="End Sub";
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