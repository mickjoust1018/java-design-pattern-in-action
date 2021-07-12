package com.mickjoust.demo.jdp.chp3.a38.command;

/**
 * @author mickjoust
 */
public class Close implements Command{

    private Editor editor;

    public Close(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.close();
    }
}
