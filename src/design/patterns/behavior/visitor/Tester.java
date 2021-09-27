package design.patterns.behavior.visitor;

/**
 * description: Tester
 * date: 2021/9/27 下午8:13
 * author: cc
 */
public class Tester extends Staff{
    private int bugNum;

    public Tester(String name, int performance, int bugNum) {
        super(name, performance);
        this.bugNum = bugNum;
    }

    public int getBugNum() {
        return bugNum;
    }

    public void setBugNum(int bugNum) {
        this.bugNum = bugNum;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitTester(this);
    }
}
