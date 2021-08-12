package design.patterns.behavior.state;

public class GumballMechineOld {
    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    int state = NO_QUARTER;
    int count = 2;

    public void insertQuarter() {
        if (state == SOLD_OUT) {
            System.out.println("机器售罄中，请等待补货。。");
        } else if (state == NO_QUARTER) {
            System.out.println("恭喜你，投币成功，准备摇把手出糖吧");
            state = HAS_QUARTER;
        } else if (state == HAS_QUARTER) {
            System.out.println("你已经投币，不能重复投币");
        } else if (state == SOLD) {
            System.out.println("正在发放糖果，不能投币");
        }
    }

    public void dispense() {
        if (state == SOLD_OUT) {
            System.out.println("机器售罄中，请等待补货。。");
        } else if (state == NO_QUARTER) {
            System.out.println("你还没有投币，先投币吧");
        } else if (state == HAS_QUARTER) {
            System.out.println("你要摇动把手的");
        } else if (state == SOLD) {
            System.out.println("正在发放糖果");
            count -= 1;
            if (count <= 0) {
                state = SOLD_OUT;
            } else {
                state = NO_QUARTER;
            }
        }
    }

}
