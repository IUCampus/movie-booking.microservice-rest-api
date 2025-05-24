package com.fcwebapp.customer_service.mapper;

import com.fcwebapp.customer_service.dto.LoginRequest;
import com.fcwebapp.customer_service.dto.UserDto;
import com.fcwebapp.customer_service.entity.Role;
import com.fcwebapp.customer_service.entity.User;

public class UserMapper {
    public static UserDto mapToUserDto(User user){
        UserDto userDto = new UserDto(
                user.getId(),
                user.getUsername(),
                user.getEmail(),
                user.getPassword(),
                user.getRole().name()
        );
    return userDto;
    }

    public static User mapToUser(UserDto userDto){
        User user = new User(
                userDto.getId(),
                userDto.getUsername(),
                userDto.getEmail(),
                userDto.getPassword(),
                Role.valueOf(userDto.getRole())
        );
        return user;
    }

    public static LoginRequest mapToLoginRequest(UserDto userDto){
        LoginRequest loginRequest = new LoginRequest(
                userDto.getUsername(),
                userDto.getPassword()
        );
    return loginRequest;
    }
}
