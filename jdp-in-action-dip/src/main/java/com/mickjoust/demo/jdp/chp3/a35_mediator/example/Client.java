package com.mickjoust.demo.jdp.chp3.a35_mediator.example;

/**
 * @author mickjoust
 */
public class Client {

    public static void main(String[] args) {
        ChatRoom chatroom = new ChatRoomImpl();

        User user1 = new ChatUser(chatroom,"1", "Spike");
        User user2 = new ChatUser(chatroom,"2", "Mia");
        User user3 = new ChatUser(chatroom,"3", "Max");
        User user4 = new ChatUser(chatroom,"4", "Mick");

        chatroom.addUser(user1);
        chatroom.addUser(user2);
        chatroom.addUser(user3);
        chatroom.addUser(user4);

        user1.send("Hello man", "2");
        user2.send("Hey", "1");
    }
}
