package com.pb.lyashenko.hw8;

public class WrongConfirmPasswordException extends Exception {
    public WrongConfirmPasswordException() {
    }

    public WrongConfirmPasswordException(String message) {
        super(message);
    }
}
