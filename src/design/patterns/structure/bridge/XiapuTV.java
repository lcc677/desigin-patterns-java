package design.patterns.structure.bridge;

/**
 * description: XiapuTV
 * date: 2021/8/21 下午5:25
 * author: cc
 */
public class XiapuTV implements Driver{
    @Override
    public void powerOn() {
        System.out.println("夏普电视打开了");
    }

    @Override
    public void powerOff() {
        System.out.println("夏普电视关闭了");
    }

    @Override
    public void channelChange() {
        System.out.println("夏普电视换台了");
    }
}
