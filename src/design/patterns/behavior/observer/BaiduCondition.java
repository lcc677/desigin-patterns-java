package design.patterns.behavior.observer;

public class BaiduCondition implements Observer {
    private float temperature;
    private float humidity;
    private float pressure;

    public BaiduCondition(Subject subject) {
        subject.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.println("====百度面板====");
        System.out.println("当前温度:" + temperature);
        System.out.println("当前湿度:" + humidity);
        System.out.println("当前气压:" + pressure);
    }
}
