package DesignPatterns.DecoratorPattern;

/**
 * Created by cycy on 2018/6/18.
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;
    public Soy(Beverage b){
        beverage=b;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Soy";
    }

    @Override
    public double cost() {
        return .15+beverage.cost();
    }
}
