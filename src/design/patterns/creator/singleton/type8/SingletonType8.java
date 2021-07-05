package design.patterns.creator.singleton.type8;

/**
 * 懒汉式-静态内部类
 */
public class SingletonType8 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}

class Singleton {
    private Singleton() {
    }

    private static class InnerSingleton {
        private final static Singleton INSTANCE = new Singleton();

    }

    public static Singleton getInstance() {
        return InnerSingleton.INSTANCE;
    }
}
