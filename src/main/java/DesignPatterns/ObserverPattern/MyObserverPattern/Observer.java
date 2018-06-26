package DesignPatterns.ObserverPattern.MyObserverPattern;

/**
 * Created by cycy on 2018/6/16.
 */
public interface Observer {
    void update(float temp,float humi,float pres);
    void register();
    void remove();
}
