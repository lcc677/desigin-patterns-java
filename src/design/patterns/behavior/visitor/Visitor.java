package design.patterns.behavior.visitor;

/**
 * description: Visitor
 * date: 2021/9/27 下午8:05
 * author: cc
 */
public interface Visitor {
    public void visitProgrammer(Programmer programmer);
    public void visitTester(Tester tester);
    public void visitProductManager(ProductManager productManager);
}
