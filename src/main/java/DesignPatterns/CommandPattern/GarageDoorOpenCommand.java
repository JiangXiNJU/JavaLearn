package DesignPatterns.CommandPattern;

/**
 * Created by cycy on 2018/6/19.
 */
public class GarageDoorOpenCommand implements Command{
    GarageDoor garageDoor;
    public GarageDoorOpenCommand(GarageDoor gd){
        garageDoor=gd;
    }

    @Override
    public void execute() {
        garageDoor.up();
        garageDoor.lightOn();
    }

    @Override
    public void undo() {
        garageDoor.lightOff();
        garageDoor.down();
    }
}
