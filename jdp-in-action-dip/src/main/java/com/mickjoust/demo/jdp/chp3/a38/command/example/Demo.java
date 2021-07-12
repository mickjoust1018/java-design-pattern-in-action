package com.mickjoust.demo.jdp.chp3.a38.command.example;

/**
 * @author mickjoust
 */
public class Demo {
    public static void main(String[] args) {

        Receiver receiver1 = new Receiver1();

        Invoker invoker = new Invoker();
        invoker.setCommand(new Command1(receiver1));
        invoker.setCommand(new Command2(receiver1));
        invoker.setCommand(new OperationA(receiver1));

        invoker.run();
    }
}
