package DesignPatterns.ObserverPattern.MyObserverPattern;

import DesignPatterns.ObserverPattern.Display;

import static java.lang.System.out;

/**
 * Created by cycy on 2018/6/16.
 */
public class ForecastDisplay implements Observer,Display {
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject WeatherData;
    public ForecastDisplay(Subject weatherData){
        WeatherData=weatherData;
        WeatherData.registerObserver(this);
    }

    @Override
    public void display() {
        out.println("************************************");
        out.println("* This is ForecastDisplay          *");
        out.println("* Temperature is "+temperature+"   \t*");
        out.println("* Humidity is "+humidity+"   \t*");
        out.println("* Pressure is "+pressure+"   \t*");
        out.println("************************************\n");
    }

    @Override
    public void update(float temp, float humi, float pres) {
        temperature=temp;
        humidity=humi;
        pressure=pres;
        display();
    }
    @Override
    public void register() {
        WeatherData.registerObserver(this);
    }

    @Override
    public void remove() {
        WeatherData.removeObserver(this);
    }
}


