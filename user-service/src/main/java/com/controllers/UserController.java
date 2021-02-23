package com.controllers;

import com.entities.User;
import com.entities.value_objects.ResponseTemplateVO;
import com.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public User save(@RequestBody User user) {
        return userService.save(user);
    }

    @GetMapping
    public ResponseTemplateVO getUser(
            @RequestHeader(value = "id") String userId,
            @RequestHeader(value = "role") String role) {
        return userService.getUserWithDepartment(userId);
    }

    @GetMapping(value = "/secure")
    public String getSecure() {
        return "Secure endpoint available";
    }
}
