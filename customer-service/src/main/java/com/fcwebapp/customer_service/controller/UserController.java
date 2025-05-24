package com.fcwebapp.customer_service.controller;

import com.fcwebapp.customer_service.dto.LoginRequest;
import com.fcwebapp.customer_service.dto.UserDto;
import com.fcwebapp.customer_service.service.impl.UserServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserServiceImpl userService;

    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }


    @PostMapping("/create")
    public ResponseEntity<UserDto> setPricing(@RequestBody UserDto userDto) {
        // Basic validation
        if (userDto.getEmail() == null || userDto.getPassword() == null) {
            return ResponseEntity.badRequest().build();
        }
        
        // Set default role if none provided
        if (userDto.getRole() == null) {
            userDto.setRole("CUSTOMER");
        }
        
        return ResponseEntity.ok(userService.createNewUser(userDto));
    }

    @GetMapping
    public ResponseEntity<List<UserDto>> getAllBookings() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @GetMapping("/{email}")
    public ResponseEntity<UserDto> getUserByEmail(@PathVariable String email) {
        return ResponseEntity.ok(userService.getUserByEmail(email));
    }

    @PostMapping("/login")
    public ResponseEntity<LoginRequest> loginUser(@RequestBody LoginRequest loginRequest) {
        return ResponseEntity.ok(userService.loginUser(loginRequest));
    }

}