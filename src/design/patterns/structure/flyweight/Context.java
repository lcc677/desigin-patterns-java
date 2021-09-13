package design.patterns.structure.flyweight;

/**
 * description: Context
 * date: 2021/9/13 下午9:19
 * author: cc
 */
public class Context {
    public Active active;
    public Stock stock;

    public Context(Long id,Stock stock) {
        this.active = ActiveFactory.getActive(id);
        this.stock = stock;
    }
    public void detail(){
        active.printActiveDetail(stock);
    }


}
