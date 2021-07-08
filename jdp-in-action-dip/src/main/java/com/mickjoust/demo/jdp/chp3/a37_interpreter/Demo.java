package com.mickjoust.demo.jdp.chp3.a37_interpreter;



/**
 * @author mickjoust
 **/
public class Demo {
    public static void main(String[] args) {

        AbstractExpression person1 = new TerminalExpression("mick");
        AbstractExpression person2 = new TerminalExpression("mia");
        AbstractExpression isSingle = new NoterminalExpression(person1, person2);

        Context context1 = new Context("mick,mia");
        Context context2 = new Context("mia,mock");
        Context context3 = new Context("spike");

        System.out.println(isSingle.interpreter(context1));
        System.out.println(isSingle.interpreter(context2));
        System.out.println(isSingle.interpreter(context3));
    }
}
