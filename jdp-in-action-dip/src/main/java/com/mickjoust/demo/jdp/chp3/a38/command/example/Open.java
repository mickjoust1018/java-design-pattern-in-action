package com.mickjoust.demo.jdp.chp3.a38.command.example;

/**
 * @author mickjoust
 * @author jingfeng.huang
 * @since 2021/7/9 16:10
 */
public class Open implements Action {

    private final Editor editor;

    public Open(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void perform() {
        editor.open();
    }

}
