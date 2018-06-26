package DesignPatterns.CommandPattern;

/**
 * Created by cycy on 2018/6/19.
 */
public class SimpleRemoteControlTest {
    public static void main(String[] args){
        SimpleCommandControl rc=new SimpleCommandControl();
        Light light=new Light("Light");
        LightOnCommand loc=new LightOnCommand(light);
        rc.setCommand(loc);
        rc.buttonWasPressed();
    }
}
