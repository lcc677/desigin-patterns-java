package design.patterns.creator.propotype;

public class Sheep implements Cloneable{
    private String name;
    private int age;
    private String color;
    private Sheep friend;

    public Sheep(String name,int age,String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Sheep getFriend() {
        return friend;
    }

    public void setFriend(Sheep friend) {
        this.friend = friend;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    protected Object clone() {
        // 浅拷贝
//        try {
//            return super.clone();
//        } catch (CloneNotSupportedException e){
//            System.out.println("克隆失败");
//            return null;
//        }
//

        // 深拷贝
        try {
            Object obj = super.clone();
            Sheep cloneSheep = (Sheep) obj;
            if (cloneSheep.getFriend() != null) {
                cloneSheep.setFriend((Sheep) cloneSheep.getFriend().clone());
            }else {
                cloneSheep.setFriend(null);
            }
            return cloneSheep;
        } catch (CloneNotSupportedException e){
            System.out.println("克隆失败");
            return null;
        }

    }
}
