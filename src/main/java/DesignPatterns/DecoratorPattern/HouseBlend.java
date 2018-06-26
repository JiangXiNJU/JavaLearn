package DesignPatterns.DecoratorPattern;

/**
 * Created by cycy on 2018/6/18.
 */
public class HouseBlend extends Beverage{
    public HouseBlend(){
        description="HouseBlend";
    }

    public double cost(){
        return 0.89;
    }
}
