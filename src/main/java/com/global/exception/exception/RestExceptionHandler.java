package com.global.exception.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(value = NoProductFoundException.class)
    public ResponseEntity<ApiError> handleNoProductFoundException() {

        ApiError error = new ApiError(400, "No Product Found", new Date());
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
}
