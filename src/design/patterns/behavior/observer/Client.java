package design.patterns.behavior.observer;

public class Client {
    public static void main(String[] args) {
        WaterData waterData  = new WaterData();

        new CurrentCondition(waterData);

        new BaiduCondition(waterData);
        waterData.dataChange(12.1f,13.5f,36.3f);

    }
}
