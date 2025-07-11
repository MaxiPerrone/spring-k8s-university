package com.university.users.services;

import com.university.users.client.CourseClientRest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private CourseClientRest client;

    @Override
    public String get(String id) {
        return client.list();
    }
}
