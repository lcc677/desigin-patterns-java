package design.patterns.behavior.observersystem;


import java.util.Observable;
import java.util.Observer;

public class BaiduCondition implements Observer {
    private float temperature;
    private float humidity;
    private float pressure;
    private Observable observable;

    public BaiduCondition(Observable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }

    public void display() {
        System.out.println("====百度面板====");
        System.out.println("当前温度:" + temperature);
        System.out.println("当前湿度:" + humidity);
        System.out.println("当前气压:" + pressure);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WaterData) {
            this.temperature = ((WaterData) o).getTemperature();
            this.humidity = ((WaterData) o).getHumidity();
            this.pressure = ((WaterData) o).getPressure();
            display();
        }
    }
}
