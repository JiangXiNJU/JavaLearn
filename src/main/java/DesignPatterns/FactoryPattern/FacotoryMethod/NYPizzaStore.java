package DesignPatterns.FactoryPattern.FacotoryMethod;

/**
 * Created by cycy on 2018/6/18.
 */
public class NYPizzaStore extends  PizzaStore {
    @Override
    Pizza createPizza(String type) {
        Pizza pizza=null;
        if(type.equals("Cheese"))
            return new NYStyleCheesePizza();
        return pizza;
    }


}
