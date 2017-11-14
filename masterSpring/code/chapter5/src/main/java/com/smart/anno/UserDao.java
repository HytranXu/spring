package com.smart.anno;

import org.springframework.stereotype.Component;

@Component("userDao")
public class UserDao {
    public UserDao()
    {
        System.out.println("UserDao....this" + this);
    }
}
