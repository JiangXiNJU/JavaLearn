package DesignPatterns.CommandPattern;

/**
 * Created by cycy on 2018/6/19.
 */
public class LightOnCommand implements Command {
    Light light;
    public LightOnCommand(Light l){
        light=l;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
