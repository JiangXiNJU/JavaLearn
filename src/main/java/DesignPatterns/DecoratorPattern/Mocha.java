package DesignPatterns.DecoratorPattern;

/**
 * Created by cycy on 2018/6/18.
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;
    public Mocha(Beverage b){
        beverage=b;
    }
    public String getDescription(){
        return beverage.getDescription()+", Mocha";
    }

    @Override
    public double cost() {
        return 0.2+beverage.cost();
    }
}
