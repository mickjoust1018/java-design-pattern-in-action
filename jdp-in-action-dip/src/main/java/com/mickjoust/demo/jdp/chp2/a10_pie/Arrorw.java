package com.mickjoust.demo.jdp.chp2.a10_pie;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mickjoust
 **/
public class Arrorw {

    public List<User> getUsers(int id) {
        List<User> result = new ArrayList<>();
        User user = getUserById(id);
        if (user != null) {
            Manager manager = user.getManager();
            if (manager != null) {
                List<User> users = manager.getUsers();
                if (users != null) {
                    for (User user1 : users) {
                        if (user1.getAge() >= 35) {
                            result.add(user1);
                        }
                    }
                } else {
                    System.err.println("获取员工列表失败");
                }
            } else {
                System.err.println("获取管理者信息失败");
            }
        } else {
            System.err.println("获取员工信息失败");
        }
        return result;
    }

    User getUserById(int id) {
        User user = new User();
        return user;
    }
    
}

