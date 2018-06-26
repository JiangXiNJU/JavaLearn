package DesignPatterns.DecoratorPattern;

/**
 * Created by cycy on 2018/6/18.
 */
public class Espresso extends Beverage {
    public Espresso(){
        description="Espresso";
    }

    public double cost(){
        return 1.99;
    }
}
