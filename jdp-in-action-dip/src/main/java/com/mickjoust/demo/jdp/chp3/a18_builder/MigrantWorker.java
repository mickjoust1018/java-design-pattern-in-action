package com.mickjoust.demo.jdp.chp3.a18_builder;

/**
 * @author mickjoust
 * 打工人
 **/
public class MigrantWorker {

    //所有属性
    private String name;   //必选
    private int age;       //可选
    private String phone;  //可选
    private String gender; //可选

    public MigrantWorker() {
    }

    public static MigrantWorker builder() {
        return new MigrantWorker();
    }


    public MigrantWorker name(String name) {
        this.name = name;
        return this;
    }

    public MigrantWorker age(int age) {
        this.age = age;
        return this;
    }

    public MigrantWorker phone(String phone) {
        this.phone = phone;
        return this;
    }

    public MigrantWorker gender(String gender) {
        this.gender = gender;
        return this;
    }

    //执行创建操作
    public MigrantWorker build() {
        validateObject(this);
        return this;
    }

    private void validateObject(MigrantWorker migrantWorker) {
        //可以做基础预校验，或自定义校验
    }

    @Override
    public String toString() {
        return "MigrantWorker{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }


    public static void main(String[] args) {
        MigrantWorker migrantWorker1 = MigrantWorker.builder()
                .name("Spike")
                .age(27)
                .phone("1810000111")
                .gender("男")
                .build();

        System.out.println(migrantWorker1);

        MigrantWorker migrantWorker2 = MigrantWorker.builder()
                .name("Max")
                .age(7)
                .phone("1810000222")
                //没有性别
                .build();

        System.out.println(migrantWorker2);

        MigrantWorker migrantWorker3 = MigrantWorker.builder()
                .name("Mia")
                .age(17)
                //没有 电话
                .gender("女")
                .build();

        System.out.println(migrantWorker3);

        MigrantWorker migrantWorker4 = MigrantWorker.builder()
                .name("Mick")
                //没有 年龄
                //没有 电话
                //没有 性别
                .build();

        System.out.println(migrantWorker4);
    }

}
