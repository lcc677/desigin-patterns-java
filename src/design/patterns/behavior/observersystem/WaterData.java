package design.patterns.behavior.observersystem;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class WaterData extends Observable {
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
        setChanged();
        notifyObservers();
    }

}
