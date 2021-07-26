package design.patterns.structure.facade;

public class DVDPlayer {
    public void on() {
        System.out.println("DVDPlayer 打开了");
    }

    public void setCD() {
        System.out.println("DVDPlayer 放入碟片");
    }
    public void paused(){
        System.out.println("DVDPlayer 暂停了");
    }

    public void off() {
        System.out.println("DVDPlayer 关闭了");
    }
}
