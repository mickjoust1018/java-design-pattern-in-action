package com.mickjoust.demo.jdp.chp3.a38.command.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mickjoust
 */
public class Invoker {

    private final List<Command> commands;

    public Invoker() {
        commands = new ArrayList<>();
    }

    public void setCommand(Command command) {
        commands.add(command);
    }

    public void run() {
        commands.forEach(Command::excute);
    }

}
