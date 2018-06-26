package DesignPatterns.StrategyPattern;

import static java.lang.System.out;

/**
 * Created by cycy on 2018/6/16.
 */
public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        out.println("I fly with wings");
    }
}
