package com.mickjoust.demo.jdp.chp3.a38.command.example;

/**
 * @author mickjoust
 */
public class OperationA implements Command {

    private final Receiver receiver;

    public OperationA(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void excute() {
        receiver.operationA();
    }
}
