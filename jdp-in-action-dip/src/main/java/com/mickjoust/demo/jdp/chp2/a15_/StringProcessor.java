package com.mickjoust.demo.jdp.chp2.a15_;

/**
 * @author mickjoust
 **/
public class StringProcessor {

    private CaseFilter myFilter;
    private String caseFilterName;

    public StringProcessor() {
        this.myFilter = CaseFilterFactory.getFilter("");
    }

    public StringProcessor(String filterName) {
        this.caseFilterName = filterName;
        this.myFilter = CaseFilterFactory.getFilter(filterName);
    }

    public void setFilterName(String filterName) {
        this.caseFilterName = filterName;
        this.myFilter = CaseFilterFactory.getFilter(filterName);
    }

    public String process(String str) {
        return myFilter.filter(str);
    }

    public static void main(String[] args) {
        StringProcessor stringProcessor = new StringProcessor();
        stringProcessor.setFilterName("up");
        System.out.println(stringProcessor.process("fdasfasdfdsaf-dsfasdfasdfadf"));

        StringProcessor stringProcessor2 = new StringProcessor("low");
        System.out.println(stringProcessor2.process("fdasfasdfdsaf-dsfasdfasdfadf"));

        StringProcessor stringProcessor3 = new StringProcessor("low");
        stringProcessor3.setFilterName("");
        System.out.println(stringProcessor3.process("fdasfasdfdsaf-dsfasdfasdfadf"));
    }

}
