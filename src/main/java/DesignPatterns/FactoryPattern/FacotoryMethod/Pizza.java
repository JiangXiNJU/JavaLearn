package DesignPatterns.FactoryPattern.FacotoryMethod;

import static java.lang.System.out;

/**
 * Created by cycy on 2018/6/18.
 */
public abstract class Pizza {
    String type;
    String dough;
    String sauce;

    public String getName(){
        return type+" Pizza";
    }
    public void prepare() {
        out.println(type+" Pizza prepare");
    }

    public void bake() {
        out.println(type+" Pizza bake");
    }

    public void box() {
        out.println(type+" Pizza box");
    }
}
