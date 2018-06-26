package DesignPatterns.StrategyPattern;

import static java.lang.System.out;

/**
 * Created by cycy on 2018/6/16.
 */
public class FlyNoWay implements FlyBehavior{
    public void fly(){
        out.println("I can't fly.");
    }
}

