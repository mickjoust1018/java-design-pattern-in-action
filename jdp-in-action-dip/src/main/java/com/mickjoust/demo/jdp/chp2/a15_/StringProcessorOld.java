package com.mickjoust.demo.jdp.chp2.a15_;

/**
 * @author mickjoust
 **/
public class StringProcessorOld {

    private CaseFilter myFilter;

    public StringProcessorOld() {
        this.myFilter = new UpperCaseFilter();
    }

    public StringProcessorOld(String filterName) {
        if ("up".equals(filterName)) {
            this.myFilter = new UpperCaseFilter();
        } else if ("low".equals(filterName)) {
            this.myFilter = new LowerCaseFilter();
        } else {
            this.myFilter = new UpperCaseFilter();
        }
    }

    public String process(String str) {
        return myFilter.filter(str);
    }

    public static void main(String[] args) {
        StringProcessorOld stringProcessor = new StringProcessorOld();
        System.out.println(stringProcessor.process("fdasfasdfdsaf-dsfasdfasdfadf"));

        StringProcessorOld stringProcessor2 = new StringProcessorOld("low");
        System.out.println(stringProcessor2.process("fdasfasdfdsaf-dsfasdfasdfadf"));

        StringProcessorOld stringProcessor3 = new StringProcessorOld("up");
        System.out.println(stringProcessor3.process("fdasfasdfdsaf-dsfasdfasdfadf"));
    }

}
