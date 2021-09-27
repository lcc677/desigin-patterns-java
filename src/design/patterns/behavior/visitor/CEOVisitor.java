package design.patterns.behavior.visitor;

/**
 * description: CEOVisitor
 * date: 2021/9/27 下午8:19
 * author: cc
 */
public class CEOVisitor implements Visitor{
    private int performance;

    @Override
    public void visitProgrammer(Programmer programmer) {
        System.out.println("我是CEO，我要看程序员:"+programmer.getName()+"的绩效:" + programmer.getPerformance());
        performance += programmer.getPerformance();
    }

    @Override
    public void visitTester(Tester tester) {
        System.out.println("我是CEO，我要看程序员:"+tester.getName()+"的绩效:" + tester.getPerformance());
        performance += tester.getPerformance();
    }

    @Override
    public void visitProductManager(ProductManager productManager) {
        System.out.println("我是CEO，我要看程序员:"+productManager.getName()+"的绩效:" + productManager.getPerformance());
        performance += productManager.getPerformance();
    }

    public int getPerformance() {
        return performance;
    }
}
