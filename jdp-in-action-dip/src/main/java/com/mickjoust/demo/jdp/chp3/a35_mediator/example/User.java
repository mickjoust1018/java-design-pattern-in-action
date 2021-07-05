package com.mickjoust.demo.jdp.chp3.a35_mediator.example;

/**
 * @author mickjoust
 */
public abstract class User {

    private ChatRoom mediator;

    private String id;
    private String name;

    public User(ChatRoom room, String id, String name){
        this.mediator = room;
        this.name = name;
        this.id = id;
    }

    public abstract void send(String msg, String userId);
    public abstract void receive(String msg);

    public ChatRoom getMediator() {
        return mediator;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
