package design.patterns.creator.singleton.type2;


/**
 * 饿汉式-静态代码块
 */
public class SingletonType2 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashcode:" + instance1.hashCode());
        System.out.println("instance2.hashcode:" + instance2.hashCode());
    }
}

class Singleton{
    // 私有化构造方法
    private final static Singleton instance;
    private Singleton(){}
    // 类内部创建一个实例
    static {
        instance = new Singleton();
    }
    // 获取实例
    public static Singleton getInstance(){
        return instance;
    }
}