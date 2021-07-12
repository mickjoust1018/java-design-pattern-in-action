package com.mickjoust.demo.jdp.chp3.a38.command.example;

import com.mickjoust.demo.jdp.chp3.a38.command.Command;

/**
 * @author mickjoust
 */
public class OperationC implements Command {

    private final Receiver receiver;

    public OperationC(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.operationC();
    }
}
