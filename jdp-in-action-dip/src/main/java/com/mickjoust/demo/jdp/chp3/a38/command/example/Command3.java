package com.mickjoust.demo.jdp.chp3.a38.command.example;

/**
 * @author mickjoust
 */
public class Command3 implements Command {

    private final Receiver receiver;

    public Command3(Receiver receiver) {
        this.receiver = receiver;
    }


    @Override
    public void excute() {
        receiver.operationC();
    }

}
