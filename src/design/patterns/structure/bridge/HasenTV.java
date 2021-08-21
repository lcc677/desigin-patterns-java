package design.patterns.structure.bridge;

/**
 * description: HasenTV
 * date: 2021/8/21 下午5:23
 * author: cc
 */
public class HasenTV implements Driver{
    @Override
    public void powerOn() {
        System.out.println("海信电视机打开了");
    }

    @Override
    public void powerOff() {
        System.out.println("海信电视机关闭了");
    }

    @Override
    public void channelChange() {
        System.out.println("海信电视机换台了");
    }
}
