package com.example.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.domain.User;
import com.example.model.UserCommand;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserCommand userToUserCommand(User user);

    User userCommandToUser(UserCommand userCommand);
}
