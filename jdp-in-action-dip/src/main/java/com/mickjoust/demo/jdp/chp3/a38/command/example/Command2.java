package com.mickjoust.demo.jdp.chp3.a38.command.example;

/**
 * @author mickjoust
 */
public class Command2 implements Command {

    private final Receiver receiver;

    public Command2(Receiver receiver) {
        this.receiver = receiver;
    }


    @Override
    public void excute() {
        receiver.operationB();
    }

}
