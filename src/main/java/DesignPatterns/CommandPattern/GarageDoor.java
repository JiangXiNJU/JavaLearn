package DesignPatterns.CommandPattern;

import static java.lang.System.out;

/**
 * Created by cycy on 2018/6/19.
 */
public class GarageDoor {
    Light light;
    public GarageDoor(String str){
        light=new Light(str);
    }
    public void up(){
        out.println("Garage Door is up");
    }
    public void down(){
        out.println("Garage Door is down");
    }
    public void stop(){
        out.println("Garage Door is stop");
    }
    public void lightOn(){
        light.on();
    }
    public void lightOff(){
        light.off();
    }
}
