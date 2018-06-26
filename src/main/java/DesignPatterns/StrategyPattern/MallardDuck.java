package DesignPatterns.StrategyPattern;

import static java.lang.System.out;

/**
 * Created by cycy on 2018/6/16.
 */
public class MallardDuck extends Duck{

    public MallardDuck(){
        quackBehavior=new Quack();
        flyBehavior=new FlyWithWings();
    }
    @Override
    public void display() {
        out.println("My head is green");
    }

    public static void main(String[] args){
        Duck d=new MallardDuck();
        d.display();
        d.performFly();
        d.performQuack();
        class flyWithRocket implements FlyBehavior{
          public void fly(){
              out.println("I fly with rockets");
           }
         }
        d.setFlyBehavior(new flyWithRocket());
        /**
         * 若 setFlyBehavior(……)定义在MallardDuck中，d.setFlyBehavior()不能执行
         * MallardDuck m=new MallardDuck();
         * m.setFlyBehavior(new flyWithRocket());执行成功
         */


    }
}
