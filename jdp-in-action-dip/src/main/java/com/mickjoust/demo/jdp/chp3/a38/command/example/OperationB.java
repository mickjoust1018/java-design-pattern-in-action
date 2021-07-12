package com.mickjoust.demo.jdp.chp3.a38.command.example;


/**
 * @author mickjoust
 */
public class OperationB implements Command {

    private final Receiver receiver;

    public OperationB(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void excute() {
        receiver.operationB();
    }
}
