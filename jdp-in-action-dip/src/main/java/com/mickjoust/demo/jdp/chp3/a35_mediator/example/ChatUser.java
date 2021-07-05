package com.mickjoust.demo.jdp.chp3.a35_mediator.example;

/**
 * @author mickjoust
 */
public class ChatUser extends User {

    public ChatUser(ChatRoom room, String id, String name) {
        super(room, id, name);
    }

    @Override
    public void send(String msg, String userId) {
        System.out.println(this.getName() + " :: Sending Message : " + msg);
        getMediator().sendMessage(msg, userId);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.getName() + " :: Received Message : " + msg);
    }


}
