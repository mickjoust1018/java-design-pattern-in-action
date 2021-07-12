package com.mickjoust.demo.jdp.chp3.a38.command;



import java.util.ArrayList;
import java.util.List;

/**
 * @author mickjoust
 */
public class WebEditFlow {

    private final List<Command> commands;

    public WebEditFlow() {
        commands = new ArrayList<>();
    }

    public void setCommand(Command command) {
        commands.add(command);
    }

    public void run() {
        commands.forEach(Command::execute);
    }

}
