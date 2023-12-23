package com.znaji.springvalidationdemo.service;

import com.znaji.springvalidationdemo.dto.UserDto;
import com.znaji.springvalidationdemo.entity.User;
import com.znaji.springvalidationdemo.exception.UserNotFoundException;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User save(UserDto userDto);

    List<User> allUsers();

    User findUserById(int id) throws UserNotFoundException;
}
