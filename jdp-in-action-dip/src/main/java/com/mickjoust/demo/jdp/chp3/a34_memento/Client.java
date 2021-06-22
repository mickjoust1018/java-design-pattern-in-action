package com.mickjoust.demo.jdp.chp3.a34_memento;

/**
 * @author mickjoust
 **/
public class Client {
    public static void main(String[] args) {
        Blog blog = new Blog(1, "My Blog");
        blog.setContent("ABC");      //原始的文章内容
        System.out.println(blog);

        BlogMemento memento = blog.createMemento();   //创建blog的备忘录

        blog.setContent("123");      //改变内容
        System.out.println(blog);

        blog.restore(memento);       //撤销操作
        System.out.println(blog);    //这时会显示原始的内容
    }
}