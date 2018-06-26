package DesignPatterns.ObserverPattern.JavaObserverPattern;

import java.util.Observer;
import java.util.Observable;

import static java.lang.System.out;

/**
 * Created by cycy on 2018/6/17.
 */
public class ForecastDisplay implements Observer {
    private float currentPressure=1;
    private float lastPressure;
    public ForecastDisplay(Observable o){
        o.addObserver(this);
    }

    public void display(){
        out.println("*****************************************");
        out.println("* This is ForecastDisplay"+"   \t*");
        out.println("* current Pressure is "+currentPressure+"   \t*");
        out.println("* last Pressure is "+lastPressure+"   \t*");
        out.println("************************************\n");
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData w=(WeatherData) o;
            lastPressure=currentPressure;
            currentPressure=w.getPressure();
            display();
        }
    }
}

