package com.mickjoust.demo.jdp.chp3.a21_protype;

/**
 * @author mickjoust
 */
public class Demo {

    public static void main(String[] args) {
        try {
            String moviePrototype  = PrototypeFactory.getInstance(ModelType.MOVIE.getName()).toString();
            System.out.println(moviePrototype);

            String eBookPrototype  = PrototypeFactory.getInstance(ModelType.EBOOK.getName()).toString();
            System.out.println(eBookPrototype);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}
