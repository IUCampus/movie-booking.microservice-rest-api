package com.fcwebapp.customer_service.service.impl;

import com.fcwebapp.customer_service.dto.LoginRequest;
import com.fcwebapp.customer_service.dto.UserDto;
import com.fcwebapp.customer_service.entity.User;
import com.fcwebapp.customer_service.exception.EmailAlreadyExistsException;
import com.fcwebapp.customer_service.exception.ResourceNotFoundException;
import com.fcwebapp.customer_service.mapper.UserMapper;
import com.fcwebapp.customer_service.repository.UserRepository;
import com.fcwebapp.customer_service.service.UserService;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    private final UserRepository userRepository;

    @Override
    public UserDto createNewUser(UserDto userDto) {
        LOGGER.info("Creating new user: {}", userDto);

        Optional<User> optionalUser = userRepository.findByEmail(userDto.getEmail());
        if(optionalUser.isPresent()){
            throw new EmailAlreadyExistsException("Email Already Exists for User");
        }

        User user = UserMapper.mapToUser(userDto);
        User savedUser = userRepository.save(user);
        return UserMapper.mapToUserDto(savedUser);
    }

    @Override
    public UserDto getUserByEmail(String email) {
        User user = userRepository.findByEmail(email).orElseThrow(() ->
                new ResourceNotFoundException("User", "email", 0L));
        return user != null ? UserMapper.mapToUserDto(user) : null;
    }

    @Override
    public LoginRequest loginUser(LoginRequest loginRequest) {
        LOGGER.info("Login request: {}", loginRequest);
        LoginRequest loginResponse = new LoginRequest("admin", "admin");
        return loginResponse;
    }

    @Override
    public List<UserDto> getAllUsers() {
        return userRepository.findAll().stream()
                .map(UserMapper::mapToUserDto)
                .toList();
    }
}
