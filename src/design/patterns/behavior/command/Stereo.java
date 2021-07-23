package design.patterns.behavior.command;

// 音响类
public class Stereo {
    public String name;

    public Stereo(String name) {
        this.name = name;
    }
    public void on(){
        System.out.println("音响打开了");
    }
    public void off(){
        System.out.println("音响关闭了");
    }
    public void up(){
        System.out.println("音响声音调高");
    }
    public void down(){
        System.out.println("音响声音调低了");
    }
}
