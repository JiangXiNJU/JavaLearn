package DesignPatterns.ObserverPattern.JavaObserverPattern;

import java.util.Observable;

/**
 * Created by cycy on 2018/6/16.
 */

public class WeatherData extends Observable{
    private float temperature;
    private float humidity;
    private float pressure;
    public WeatherData(){};

    public float getTemperature(){
        return temperature;
    }
    public float getHumidity(){
        return humidity;
    }
    public float getPressure(){
        return pressure;
    }

    public void measurementsChanged(){
        setChanged();
        notifyObservers();//拉
    }

    public void setMeasurements(float temp,float humi,float pres){
        temperature=temp;
        humidity=humi;
        pressure=pres;
        measurementsChanged();
    }
}
