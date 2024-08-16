package com.example.demandems.exception;

public class PartnerNotFoundException extends RuntimeException{
    public PartnerNotFoundException(String message)
    {
        super(message);
    }
}
