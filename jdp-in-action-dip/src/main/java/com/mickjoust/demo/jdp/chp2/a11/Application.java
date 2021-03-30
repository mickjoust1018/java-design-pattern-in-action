package com.mickjoust.demo.jdp.chp2.a11;

/**
 * @author mickjoust
 **/
public class Application {

    private static void process(String[] words) {
        for (int i = 0; i < words.length; i++) {
            String arg = "";
            for (int j = words[i].length(); j > 0; j--) {
                arg+=words[i].substring(j-1,j);
            }
            System.out.println(arg);
        }

        if (words.length == 2){
            if (words[0].toLowerCase().equals("hello")
                    && words[1].toLowerCase().equals("world")){
                System.out.println("...bingo");
            }
        }
    }

    public static void main(String[] args) {

        process(new String[]{"test","is","a","mighty,hahaah,world"});
        process(new String[]{"hello","world"});

    }
}
