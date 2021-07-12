package com.mickjoust.demo.jdp.chp3.a38.command.example;


/**
 * @author mickjoust
 */
public class OperationC implements Command {

    private final Receiver receiver;

    public OperationC(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void excute() {
        receiver.operationC();
    }
}
