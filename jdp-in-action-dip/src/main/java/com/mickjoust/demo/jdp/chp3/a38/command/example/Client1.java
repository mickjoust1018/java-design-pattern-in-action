package com.mickjoust.demo.jdp.chp3.a38.command.example;

/**
 * @author mickjoust
 */
public class Client1 {
    public static void main(String[] args) {

        Editor editor = new EditorIMpl();

        Macro macro = new Macro();
        macro.record(new Open(editor));
        macro.record(new Save(editor));
        macro.record(new Close(editor));

        macro.run();
    }
}
