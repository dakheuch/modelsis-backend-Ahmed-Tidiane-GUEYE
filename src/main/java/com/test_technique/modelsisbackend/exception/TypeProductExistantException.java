package com.test_technique.modelsisbackend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class TypeProductExistantException extends RuntimeException{

    public TypeProductExistantException(String message) {
        super(message);
    }
}
