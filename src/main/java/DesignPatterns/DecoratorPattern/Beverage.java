package DesignPatterns.DecoratorPattern;

/**
 * Created by cycy on 2018/6/18.
 */
public abstract class Beverage {
    String description="Unkown Beverage";
    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
