package com.global.exception.exception;

public class NoProductFoundException extends RuntimeException {

    public NoProductFoundException (String message) {
        super(message);
    }
}
