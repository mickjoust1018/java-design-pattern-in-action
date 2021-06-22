package com.mickjoust.demo.jdp.chp3.a38.command;

/**
 * @author mickjoust
 */
public class StopFanCommand implements Command {

    Fan fan;

    public StopFanCommand(Fan fan) {
        super();
        this.fan = fan;
    }

    @Override
    public void execute() {
        System.out.println("stopping Fan.");
        fan.stop();
    }

}
