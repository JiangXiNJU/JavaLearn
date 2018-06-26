package DesignPatterns.CommandPattern;

/**
 * Created by cycy on 2018/6/19.
 */
public class SimpleCommandControl {
    Command slot;

    public void setCommand(Command command) {
        this.slot = command;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
}
