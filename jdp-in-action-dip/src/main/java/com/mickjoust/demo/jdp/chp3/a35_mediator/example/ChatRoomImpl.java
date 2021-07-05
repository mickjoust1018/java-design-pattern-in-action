package com.mickjoust.demo.jdp.chp3.a35_mediator.example;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mickjoust
 */
public class ChatRoomImpl implements ChatRoom {

    private Map<String, User> usersMap = new HashMap<>();

    @Override
    public void sendMessage(String msg, String userId) {
        User u = usersMap.get(userId);
        u.receive(msg);
    }

    @Override
    public void addUser(User user) {
        this.usersMap.put(user.getId(), user);
    }
}
