package com.example.demandems.exception;

import lombok.Data;

public class NotFoundException extends RuntimeException{
    public NotFoundException(String message)
    {

        super(message);
    }
}
