package DesignPatterns.ObserverPattern.MyObserverPattern;

/**
 * Created by cycy on 2018/6/16.
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();
}
