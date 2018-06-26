package DesignPatterns.CommandPattern;

/**
 * Created by cycy on 2018/6/19.
 */
public class GarageDoorCloseCommand implements Command{
    GarageDoor garageDoor;
    public GarageDoorCloseCommand(GarageDoor gd){
        garageDoor=gd;
    }

    @Override
    public void execute() {
        garageDoor.lightOff();
        garageDoor.down();
    }

    @Override
    public void undo() {
        garageDoor.up();
        garageDoor.lightOn();
    }
}
