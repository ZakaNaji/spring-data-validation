package com.znaji.springvalidationdemo.service.impl;

import com.znaji.springvalidationdemo.dto.UserDto;
import com.znaji.springvalidationdemo.entity.User;
import com.znaji.springvalidationdemo.exception.UserNotFoundException;
import com.znaji.springvalidationdemo.repository.UserRepository;
import com.znaji.springvalidationdemo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public User save(UserDto userReq) {
        User user = User.builder()
                .name(userReq.getName())
                .mobile(userReq.getMobile())
                .gender(userReq.getGender())
                .email(userReq.getEmail())
                .age(userReq.getAge())
                .nationality(userReq.getNationality())
                .build();
        return userRepository.save(user);
    }

    @Override
    public List<User> allUsers() {
        return userRepository.findAll();
    }

    @Override
    public User findUserById(int id) throws UserNotFoundException {
        return userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("no user found for id: " + id));
    }
}
