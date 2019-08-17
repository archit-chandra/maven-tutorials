package com.example.controllers;


import com.example.converters.UserMapper;
import com.example.domain.UserCommand;
import com.example.entities.User;

public class UserController {

    User saveUser(UserCommand command) {
        return UserMapper.INSTANCE.userCommandToUser(command);
    }

}
