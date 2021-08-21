package design.patterns.structure.bridge;

/**
 * description: Remote
 * date: 2021/8/21 下午5:17
 * author: cc
 */
public abstract class Remote {
    Driver driver;

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Remote(Driver driver) {
        this.driver = driver;
    }

    void on(){
        driver.powerOn();
    }
    void off(){
        driver.powerOff();
    }
    void change(){
        driver.channelChange();
    }
}
