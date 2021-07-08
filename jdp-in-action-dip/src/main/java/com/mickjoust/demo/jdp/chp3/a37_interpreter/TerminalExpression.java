package com.mickjoust.demo.jdp.chp3.a37_interpreter;

/**
 * @author mickjoust
 */
public class TerminalExpression implements AbstractExpression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpreter(Context context) {
        if(context.getData().contains(data)) {
            return true;
        } else {
            return false;
        }
    }

}
