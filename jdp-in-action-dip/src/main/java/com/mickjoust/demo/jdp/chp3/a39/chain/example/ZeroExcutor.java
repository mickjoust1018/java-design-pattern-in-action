package com.mickjoust.demo.jdp.chp3.a39.chain.example;

/**
 * @author mickjoust
 */
public class ZeroExcutor implements Excutor{

    private Excutor next;

    @Override
    public void setNext(Excutor excutor) {
        this.next = excutor;
    }

    @Override
    public void handle(Integer num) {
        if (null!= num && num == 0) {
            System.out.println("ZeroExcutor获取数字："+num+" ,处理完成！");
        } else {
            if (null != next) {
                System.out.println("===经过ZeroExcutor");
                next.handle(num);
            } else {
                System.out.println("处理中止！- ZeroExcutor");
            }
        }
    }

}
