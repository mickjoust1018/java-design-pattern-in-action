package com.mickjoust.demo.jdp.chp3.a37_interpreter;


/**
 * @author mickjoust
 * @author jingfeng.huang
 * @since 2021/7/8 15:25
 */
public class NoterminalExpression implements AbstractExpression {

    AbstractExpression expr1;
    AbstractExpression expr2;

    public NoterminalExpression(AbstractExpression expr1, AbstractExpression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpreter(Context context) {
        return expr1.interpreter(context) && expr2.interpreter(context);
    }
}
