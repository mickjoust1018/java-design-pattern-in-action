package com.mickjoust.demo.jdp.chp3.a38.command;

/**
 * @author mickjoust
 */
public class Save implements Command {

    private Editor editor;

    public Save(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.save();
    }
}
