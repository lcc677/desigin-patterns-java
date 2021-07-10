package design.patterns.creator.propotype;

public class SheepTest {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom",12,"grey");

        Sheep friend = new Sheep("jack",15,"red");
        sheep.setFriend(friend);

//        Sheep sheep1 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
//
//        System.out.println(sheep.getName());
//        System.out.println(sheep1.getName());
        Sheep sheep2 = (Sheep) sheep.clone();
        System.out.println(sheep.getFriend().hashCode());
        System.out.println(sheep2.getFriend().hashCode());
    }
}
