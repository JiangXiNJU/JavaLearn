package DesignPatterns.CommandPattern;

/**
 * Created by cycy on 2018/6/19.
 */
public class LightOffCommand implements Command{
    Light light;
    public LightOffCommand(Light l){
        light=l;
    }
    public void execute(){
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
