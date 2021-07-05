package design.patterns.creator.factory.commonImplement;

public abstract class Pizza {
    protected String name;
    public Pizza(){}
    public abstract void prepare();
    public void bake(){
        System.out.println(name + "baking");
    }
    public void cut(){
        System.out.println(name + "cuting");
    }
    public void box(){
        System.out.println(name + "boxing");
    }
    public void setName(String name){
        this.name = name;
    }
}
