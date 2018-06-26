package DesignPatterns.CommandPattern;

import static java.lang.System.out;

/**
 * Created by cycy on 2018/6/19.
 */
public class RemoteControlTest {
    public static void main(String[] args){
        RemoteControl rc=new RemoteControl();
        Light light=new Light("Light");
        GarageDoor gd=new GarageDoor("light_Garage");

        Command lonc=new LightOnCommand(light);
        Command loffc=new LightOffCommand(light);
        Command gopc=new GarageDoorOpenCommand(gd);
        Command gclc=new GarageDoorCloseCommand(gd);

        rc.setCommand(0,lonc,loffc);
        rc.setCommand(1,gopc,gclc);

        out.println(rc);
        rc.onButtonWasPressured(0);
        rc.onButtonWasPressured(1);
        rc.offButtonWasPressured(0);
        rc.offButtonWasPressured(1);
    }
}
