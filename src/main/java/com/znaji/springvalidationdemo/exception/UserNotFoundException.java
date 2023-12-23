package com.znaji.springvalidationdemo.exception;

public class UserNotFoundException extends Exception {
    public UserNotFoundException(String ex) {
        super(ex);
    }
}
