package DesignPatterns.StrategyPattern;

import static java.lang.System.out;

/**
 * Created by cycy on 2018/6/16.
 */
public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        out.println("Zhi zhi.");
    }
}