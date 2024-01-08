package com.test_technique.modelsisbackend.exception;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalProductExceptionHandler {

    @ExceptionHandler(ProductExistantException.class)
    public ResponseEntity<Object> handleTypeProductExistantException(ProductExistantException e) {
        Map<String, Object> response = new HashMap<>();

        response.put("message", e.getMessage());
        response.put("status", HttpStatus.BAD_REQUEST.value());

        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }


}


