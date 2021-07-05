package design.patterns.creator.singleton.type7;

/**
 * 枚举方式
 */
public class SingletonType7 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;

        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
        instance1.sayHello();
        instance2.sayHello();
    }
}

enum Singleton{
    INSTANCE;
    void sayHello(){
        System.out.println("hello");
    }
}
