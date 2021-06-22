package com.mickjoust.demo.jdp.chp3.a37_interpreter;

/**
 * @author mickjoust
 */
public class AndExpression implements Expression {

    Expression expr1;
    Expression expr2;

    public AndExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    public boolean interpreter(String con) {
        return expr1.interpreter(con) && expr2.interpreter(con);
    }

}
