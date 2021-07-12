package design.patterns.behavior.observerargs;

import java.util.ArrayList;

public class WaterData implements Subject {
    private float temperature;
    private float humidity;
    private float pressure;
    private ArrayList<Observer> observers;

    public WaterData() {
        observers = new ArrayList<Observer>();
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public void dataChange(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if(observers.contains(observer)){
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        for(Observer observer:observers){
            observer.update(getTemperature(),getHumidity(),getPressure());
        }
    }
}
