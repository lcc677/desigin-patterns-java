package design.patterns.behavior.proxy.dynamic;

import java.lang.reflect.Proxy;

/**
 * description: Client
 * date: 2021/8/16 下午7:29
 * author: cc
 */
public class Client {
    Person getOwnProxy(Person person) {
        return (Person) Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(), new OwnerInvocationHandler(person));
    }

    Person getNotOwnProxy(Person person) {
        return (Person) Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(), new NotOwnerInvocationHandler(person));
    }

    void drive() {
        Person joe = new PersonImpl("joe", "男", "篮球");
        Person jack = new PersonImpl("jack", "男", "足球");

        Person joeOwnProxy = getOwnProxy(joe);
        Person joeNotOwnProxy = getNotOwnProxy(joe);
        try {
            joeOwnProxy.setHotOrNotRating(10);
        } catch (Exception e) {
            System.out.println("joe 没有权限给自己设置分数");
        }
        System.out.println("joe的好感度：" + joeOwnProxy.getHotOrNotRating());

        joeOwnProxy.setGender("女");
        System.out.println("joe的性别：" + joeOwnProxy.getGender());
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.drive();
    }
}
