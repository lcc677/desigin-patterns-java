package design.patterns.behavior.command;

// 吊扇类
public class CeilingFan {
    public String name;

    public CeilingFan(String name) {
        this.name = name;
    }
    public void on(){
        System.out.println("吊扇打开了");
    }
    public void off(){
        System.out.println("吊扇关闭了");
    }
    public void setHeight(){
        System.out.println("我设置了高档位");
    }
    public void setLow(){
        System.out.println("我设置了低档位");
    }
}
