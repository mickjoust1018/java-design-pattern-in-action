package com.mickjoust.demo.jdp.chp3.a35;

/**
 * @author mickjoust
 */
public interface ChatRoom {

    void sendMessage(String msg, String userId);

    void addUser(User user);

}
