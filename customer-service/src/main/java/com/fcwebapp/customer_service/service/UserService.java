package com.fcwebapp.customer_service.service;



import com.fcwebapp.customer_service.dto.LoginRequest;
import com.fcwebapp.customer_service.dto.UserDto;

import java.util.List;

public interface UserService {
    UserDto createNewUser(UserDto userDto);

    UserDto getUserByEmail(String email);

    LoginRequest loginUser(LoginRequest loginRequest);

    List<UserDto> getAllUsers();

}
