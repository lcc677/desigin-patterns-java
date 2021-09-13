package design.patterns.structure.flyweight;

/**
 * description: Active,享元模式中的享元类
 * date: 2021/9/13 下午8:36
 * author: cc
 */
public class Active {
    private Long id;
    private String name;
    private String des;

    public Active(Long id,String name, String des) {
        this.id = id;
        this.name = name;
        this.des = des;
    }
    public void printActiveDetail(Stock stock){
        System.out.println("活动:(" + this.id + ")" +  this.name);
        System.out.println("  描述:" + this.des);
        System.out.println("  库存:" + (stock.getTotal() - stock.getUsed()));
    }
}
