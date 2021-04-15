package com.mickjoust.demo.jdp.chp2.a11;

/**
 * @author mickjoust
 **/
public class ApplicationOpt {

    public void process(String[] words) {
        for (int i = 0; i < words.length; i++) {
            reversecharacters(words[i]);
            System.out.println(words[i]);
        }

        if (isHelloWorld(words)) {
            System.out.println("...bingo");
        }
    }

    private String reversecharacters(String forward) {
        String reverse = "";
        for (int j = forward.length(); j > 0; j--) {
            reverse += forward.substring(j - 1, j);
        }
        return reverse;
    }

    private boolean isHelloWorld(String[] names) {
        if (names.length == 2){
            if (names[0].toLowerCase().equals("hello")
                    && names[1].toLowerCase().equals("world")){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ApplicationOpt myApp = new ApplicationOpt();
        myApp.process(new String[]{"test","is","a","mighty,hahaah,world"});
        myApp.process(new String[]{"hello","world"});
    }

}