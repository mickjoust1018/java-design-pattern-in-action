package com.mickjoust.demo.jdp.chp3.a38.command.example;

/**
 * @author mickjoust
 * @author jingfeng.huang
 * @since 2021/7/9 16:12
 */
public class Close implements Action{

    private final Editor editor;

    public Close(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void perform() {
        editor.close();
    }
}
