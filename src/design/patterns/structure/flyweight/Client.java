package design.patterns.structure.flyweight;

/**
 * description: Client
 * date: 2021/9/13 下午9:22
 * author: cc
 */
public class Client {
    public static void main(String[] args) {
        Stock stock = new Stock(1000);

        // 这种模式，实例的个数没有少，因为context的实例就是原来的实例的个数。但是活动描述都是一个，减少了描述的多次存储
        // 如果我们把库存不单独放在Stock中，而是放在Context中也是可以的哦
        for (int i = 0; i < 100; i++) {
            stock.addAndGet(1);
            Context context = new Context(1000l, stock);
            context.detail();
        }
        // 这种模式，我们缺失了context这个情景，直接将变化的库存（stock），传递给享元来操作。这个减少了类个数。因为我们可以看出来我们只有两个实例。
        for (int i = 0; i < 100; i++) {
            stock.addAndGet(1);
            Active active = ActiveFactory.getActive(1000l);
            active.printActiveDetail(stock);
        }

    }

}
