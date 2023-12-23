package com.znaji.springvalidationdemo.controller;

import com.znaji.springvalidationdemo.dto.UserDto;
import com.znaji.springvalidationdemo.entity.User;
import com.znaji.springvalidationdemo.exception.UserNotFoundException;
import com.znaji.springvalidationdemo.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody @Valid UserDto userDto) {
        return new ResponseEntity<>(userService.save(userDto), HttpStatus.CREATED);
    }

    @GetMapping()
    public ResponseEntity<List<User>>getUsers()
    {
        return new ResponseEntity<>(userService.allUsers(),HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable int id) throws UserNotFoundException {
        return new ResponseEntity<>(userService.findUserById(id), HttpStatus.FOUND);
    }
}
