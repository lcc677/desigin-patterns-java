package design.patterns.behavior.command;

public class GarageDoor {
    public String name;

    public GarageDoor(String name) {
        this.name = name;
    }
    public void up(){
        System.out.println("车库们打开了");
    }
    public void down(){
        System.out.println("车库门关上了");
    }
}
