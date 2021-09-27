package design.patterns.behavior.visitor;

/**
 * description: ProductManager
 * date: 2021/9/27 下午8:15
 * author: cc
 */
public class ProductManager extends Staff{
    private int taskNum;

    public ProductManager(String name, int performance, int taskNum) {
        super(name, performance);
        this.taskNum = taskNum;
    }

    public int getTaskNum() {
        return taskNum;
    }

    public void setTaskNum(int taskNum) {
        this.taskNum = taskNum;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitProductManager(this);
    }
}
