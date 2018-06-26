package DesignPatterns.CommandPattern;

/**
 * Created by cycy on 2018/6/19.
 */
public class RemoteControl {
    Command[] OnCommands;
    Command[] OffCommands;
    Command lastCommmand;
    public RemoteControl(){
        OnCommands=new Command[7];
        OffCommands=new Command[7];

        Command noCommand=new NoCommand();
        for(int i=0;i<7;i++){
            OnCommands[i]=noCommand;
            OffCommands[i]=noCommand;
        }
    }
    public void setCommand(int slot,Command onCommand,Command offCommand){
        OnCommands[slot]=onCommand;
        OffCommands[slot]=offCommand;
    }
    public void onButtonWasPressured(int slot){
        OnCommands[slot].execute();
        lastCommmand=OnCommands[slot];
    }
    public void offButtonWasPressured(int slot){
        OffCommands[slot].execute();
        lastCommmand=OffCommands[slot];
    }

    public void undoButtonWasPresssured(){
        lastCommmand.undo();
    }
    public String toString(){
        StringBuffer res=new StringBuffer();
        res.append("\n--------- Remote Control ---------\n");
        for(int i=0;i<OnCommands.length;i++)
            res.append("slot [ "+i+" ], "+OnCommands[i].getClass()+"   "+OffCommands[i].getClass()+"\n");
        return res.toString();
    }
}
