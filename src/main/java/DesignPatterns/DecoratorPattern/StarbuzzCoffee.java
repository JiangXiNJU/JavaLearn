package DesignPatterns.DecoratorPattern;

/**
 * Created by cycy on 2018/6/18.
 */
public class StarbuzzCoffee {
    public static void main(String[] args){
        Beverage b=new Espresso();
        b=new Mocha(new Whip(new Soy(b)));
        System.out.println(b.getDescription()+", $ "+b.cost());
    }
}
