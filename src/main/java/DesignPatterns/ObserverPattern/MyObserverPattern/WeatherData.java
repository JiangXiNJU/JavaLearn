package DesignPatterns.ObserverPattern.MyObserverPattern;

import java.util.ArrayList;

/**
 * Created by cycy on 2018/6/16.
 */
public class WeatherData implements Subject{
    private float temperature;
    private float humidity;
    private float pressure;
    private ArrayList observers=new ArrayList();

    public float getTemperature(){
        return temperature;
    }
    public float getHumidity(){
        return humidity;
    }
    public float getPressure(){
        return pressure;
    }


    @Override
    public void registerObserver(Observer o){
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(int i=0;i<observers.size();i++){
            Observer o=(Observer) observers.get(i);
            o.update(temperature,humidity,pressure);
        }
    }

    public void measurementschanged(){
        notifyObserver();
    }

    public void setMeasurements(float temp,float humi,float pres){
        temperature=temp;
        humidity=humi;
        pressure=pres;
        measurementschanged();
    }
}
