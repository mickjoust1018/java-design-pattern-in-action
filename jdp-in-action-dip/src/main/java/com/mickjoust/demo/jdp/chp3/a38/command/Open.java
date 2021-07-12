package com.mickjoust.demo.jdp.chp3.a38.command;

/**
 * @author mickjoust
 */
public class Open implements Command {

    private Editor editor;

    public Open(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.open();
    }
}
