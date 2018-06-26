package DesignPatterns.FactoryPattern.FacotoryMethod;

/**
 * Created by cycy on 2018/6/18.
 * 允许子类做决定，平行的类层级
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type){
        Pizza pizza=createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.box();
        return pizza;
    }
    abstract Pizza createPizza(String type);
}
