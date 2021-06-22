package com.mickjoust.demo.jdp.chp3.a38.command;

/**
 * @author mickjoust
 */
public class HomeAutomationRemote {

    //Command Holder
    Command command;

    //Set the command in runtime to trigger.
    public void setCommand(Command command) {
        this.command = command;
    }

    //Will call the command interface method so that particular command can be invoked.
    public void buttonPressed() {
        command.execute();
    }

}
