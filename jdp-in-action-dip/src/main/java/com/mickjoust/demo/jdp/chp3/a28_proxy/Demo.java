package com.mickjoust.demo.jdp.chp3.a28_proxy;

/**
 * @author mickjoust
 */
public class Demo {

    public static void main(String[] args) {
        System.out.println(checkNum("1.2.76","1.2.69"));
    }

    static boolean checkNum(String sourceVersion,String compareVersion) {
        if (sourceVersion.equals(compareVersion)) {
            return true;
        }

        String[] sourceResult = sourceVersion.split("[.]");
        String[] compareResult = compareVersion.split("[.]");

        if (sourceResult.length < 3 || compareResult.length < 3) {
            return true;
        }

        int[] source = new int[5];
        int[] compare = new int[5];

        for (int i = 0; i < sourceResult.length; i++) {
            source[i] = Integer.parseInt(sourceResult[i]);
        }

        for (int i = 0; i < compareResult.length; i++) {
            compare[i] = Integer.parseInt(compareResult[i]);
        }

        for (int i = 0; i < 3; i++) {
            if (i == 2) {
                //只有两个结果
                if (source[i] >= compare[i] ) {
                    return true;
                }
                if (source[i] < compare[i]) {
                    return false;
                }
            } else {
                if (source[i] > compare[i] ) {
                    return true;
                }
                if (source[i] < compare[i]) {
                    return false;
                }
                if (source[i] == compare[i]) {
                    continue;
                }
            }
        }
        return true;
    }

}
