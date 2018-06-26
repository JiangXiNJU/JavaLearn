package DesignPatterns.ObserverPattern.JavaObserverPattern;

import DesignPatterns.ObserverPattern.Display;

import java.util.Observable;
import java.util.Observer;

import static java.lang.System.out;

/**
 * Created by cycy on 2018/6/16.
 */
public class CurrentConditionsDisplay implements Observer,Display{
    private float temperature;
    private float humidity;
    private float pressure;
//    Observable observable;
    public CurrentConditionsDisplay(Observable o){
//        observable=o;
        o.addObserver(this);
    }

    public void display() {
        out.println("*****************************************");
        out.println("* This is CurrentConditionsDisplay"+"   \t*");
        out.println("* Temperature is "+temperature+"   \t*");
        out.println("* Humidity is "+humidity+"   \t*");
        out.println("* Pressure is "+pressure+"   \t*");
        out.println("************************************\n");
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData w=(WeatherData) o;
            temperature=w.getTemperature();
            humidity=w.getHumidity();
            pressure=w.getPressure();
            display();
        }
    }
}
