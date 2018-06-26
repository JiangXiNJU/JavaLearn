package DesignPatterns.StrategyPattern;

import static java.lang.System.out;

/**
 * Created by cycy on 2018/6/16.
 */

public abstract class Duck {
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    public Duck(){

    }

    public abstract void display();

    public void swim(){
        out.println("I am swimming, all ducks can swim!");
    }

    public void performQuack(){
        quackBehavior.quack();
    }
    public void performFly(){
        flyBehavior.fly();
    }

    //动态变化fly和quack动作
    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior=fb;
    }
    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior=qb;
    }
}
