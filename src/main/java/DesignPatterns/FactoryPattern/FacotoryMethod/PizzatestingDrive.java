package DesignPatterns.FactoryPattern.FacotoryMethod;

/**
 * Created by cycy on 2018/6/18.
 */
public class PizzatestingDrive {
    public static void main(String[] args){
        PizzaStore ps=new NYPizzaStore();
        ps.orderPizza("Cheese");
    }

}
