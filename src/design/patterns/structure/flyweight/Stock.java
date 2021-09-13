package design.patterns.structure.flyweight;

/**
 * description: Stock
 * date: 2021/9/13 下午9:05
 * author: cc
 */
public class Stock {
    private int total;
    private int used;

    public Stock(int total) {
        this.total = total;
        this.used = 0;
    }

    public int getTotal() {
        return total;
    }

    public int getUsed() {
        return used;
    }

    public void setUsed(int used) {
        this.used = used;
    }
    public void addAndGet(int number){
        this.used += number;
    }
}
