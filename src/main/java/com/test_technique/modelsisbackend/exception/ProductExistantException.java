package com.test_technique.modelsisbackend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ProductExistantException extends RuntimeException{

    public ProductExistantException(String message) {
        super(message);
    }
}

