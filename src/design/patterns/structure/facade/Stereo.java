package design.patterns.structure.facade;

public class Stereo {
    public void on() {
        System.out.println("音响打开了");
    }

    public void off() {
        System.out.println("音响关闭了");
    }
    public void height(){
        System.out.println("音响声音调高了");
    }
    public void low(){
        System.out.println("音响声音调低了");
    }
}
