package com.mickjoust.demo.jdp.chp3.a34_memento;


/**
 * @author mickjoust
 */

public class Originator {

    private String state = "原始对象";  //打印当前状态

    private String id;
    private String name;
    private String phone;

    public Originator() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }



    public Memento create() {
        return new Memento(id, name, phone);
    }

    public void restore(Memento m) {
        this.state = m.getState();
        this.id = m.getId();
        this.name = m.getName();
        this.phone = m.getPhone();
    }

    @Override
    public String toString() {
        return "Originator{" +
                "state='" + state + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
