package com.david.week_9_task.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

public class GlobalException {
    @ExceptionHandler(EmployeeNotFound.class)
    public ResponseEntity<ErrorDetails> EmployeeNotFoundException(final EmployeeNotFound e) {
        ErrorDetails errorResponse = new ErrorDetails();
        errorResponse.setTimestamp(LocalDateTime.now());
        errorResponse.setErrorDetails(String.valueOf(HttpStatus.BAD_REQUEST));
        errorResponse.setErrorMessage(e.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }
}
