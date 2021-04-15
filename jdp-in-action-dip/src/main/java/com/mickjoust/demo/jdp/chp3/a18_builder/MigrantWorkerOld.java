package com.mickjoust.demo.jdp.chp3.a18_builder;

/**
 * @author mickjoust
 * 打工人
 **/
public class MigrantWorkerOld {

    private String name;    //姓名
    private int age;        //年龄
    private String phone;   //电话
    private String gender;  //性别

    public MigrantWorkerOld() {
    }

    public MigrantWorkerOld(String name, int age, String phone, String gender) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.gender = gender;
    }

    public MigrantWorkerOld(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public MigrantWorkerOld(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "MigrantWorkerOld{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
