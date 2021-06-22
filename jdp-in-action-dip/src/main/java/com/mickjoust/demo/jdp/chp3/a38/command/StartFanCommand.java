package com.mickjoust.demo.jdp.chp3.a38.command;

/**
 * @author mickjoust
 */
public class StartFanCommand implements Command {

    Fan fan;

    public StartFanCommand(Fan fan) {
        super();
        this.fan = fan;
    }

    @Override
    public void execute() {
        System.out.println("starting Fan.");
        fan.start();
    }

}
