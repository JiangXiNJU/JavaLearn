package DesignPatterns.CommandPattern;

import static java.lang.System.out;

/**
 * Created by cycy on 2018/6/19.
 */
public class Light {
    String name="Light";
    public Light(String str){
        name=str;
    }
    public void on(){
        out.println(name+" is on");
    }
    public void off(){
        out.println(name+" is off");
    }
}
