package design.patterns.behavior.visitor;

/**
 * description: staff
 * date: 2021/9/27 下午8:09
 * author: cc
 */
public abstract class Staff {
    private String name;
    private int performance;

    public Staff(String name, int performance) {
        this.name = name;
        this.performance = performance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPerformance() {
        return performance;
    }

    public void setPerformance(int performance) {
        this.performance = performance;
    }

    public abstract void accept(Visitor visitor);
}
