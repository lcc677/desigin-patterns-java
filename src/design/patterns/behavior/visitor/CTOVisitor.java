package design.patterns.behavior.visitor;

/**
 * description: CTOVisitor
 * date: 2021/9/27 下午8:16
 * author: cc
 */
public class CTOVisitor implements Visitor{
    private int bugTotal;
    private int taskTotal;
    private int prTotal;

    @Override
    public void visitProgrammer(Programmer programmer) {
        System.out.println("我是CTO，我要看程序员:"+programmer.getName()+"的pr数量:" + programmer.getPrNum());
        prTotal += programmer.getPrNum();

    }

    @Override
    public void visitTester(Tester tester) {
        System.out.println("我是CTO，我要看测试员"+tester.getName()+"的bug数量" + tester.getBugNum());
        bugTotal += tester.getBugNum();
    }

    @Override
    public void visitProductManager(ProductManager productManager) {
        System.out.println("我是CTO，我要看产品经理"+productManager.getName()+"的bug数量" + productManager.getTaskNum());
        taskTotal += productManager.getTaskNum();
    }

    public int getBugTotal() {
        return bugTotal;
    }

    public int getTaskTotal() {
        return taskTotal;
    }

    public int getPrTotal() {
        return prTotal;
    }
}
