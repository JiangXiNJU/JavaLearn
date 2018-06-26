package DesignPatterns.DecoratorPattern;

/**
 * Created by cycy on 2018/6/18.
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;
    public Whip(Beverage b){
        beverage=b;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Whip";
    }

    @Override
    public double cost() {
        return .1+beverage.cost();
    }
}

