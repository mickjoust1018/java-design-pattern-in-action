package com.mickjoust.demo.jdp.chp3.a38.command;

import com.mickjoust.demo.jdp.chp3.a38.command.*;

/**
 * @author mickjoust
 */
public class Client {

    public static void main(String[] args) {
        Html5Editor html5Editor = new Html5Editor();
        MarkDownEditor markDownEditor = new MarkDownEditor();

        Open html5Open = new Open(html5Editor);
        Save html5Save = new Save(html5Editor);
        Close html5Close = new Close(html5Editor);

        Open markDownOpen = new Open(markDownEditor);
        Save markDownSave = new Save(markDownEditor);
        Close markDownClose = new Close(markDownEditor);

        WebEditFlow webEditFlow = new WebEditFlow();
        webEditFlow.setCommand(html5Open);
        webEditFlow.setCommand(html5Save);
        webEditFlow.setCommand(html5Close);

        webEditFlow.setCommand(markDownOpen);
        webEditFlow.setCommand(markDownSave);
        webEditFlow.setCommand(markDownClose);

        webEditFlow.run();
    }
}
