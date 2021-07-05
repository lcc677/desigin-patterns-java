package design.patterns.creator.singleton.type1;


/**
 * 饿汉式-静态变量
 */
public class SingletonType1 {
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
    private Singleton(){}
    // 类内部创建一个实例
    private final static Singleton instance = new Singleton();
    // 获取实例
    public static Singleton getInstance(){
        return instance;
    }
}