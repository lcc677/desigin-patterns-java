package design.patterns.structure.faced;

public class TheaterLight {
    public void on() {
        System.out.println("灯光打开了");
    }

    public void off() {
        System.out.println("灯光关闭了");
    }

    public void dim() {
        System.out.println("灯光调暗了");
    }

    public void bright() {
        System.out.println("灯光调亮了");
    }
}
