package design.patterns.behavior.visitor;

/**
 * description: Programmer
 * date: 2021/9/27 下午8:08
 * author: cc
 */
public class Programmer extends Staff {
    private int prNum;

    public Programmer(String name,int performance,int prNum) {
        super(name,performance);
        this.prNum = prNum;
    }

    public int getPrNum() {
        return prNum;
    }

    public void setPrNum(int prNum) {
        this.prNum = prNum;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitProgrammer(this);
    }
}
