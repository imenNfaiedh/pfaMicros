package com.example.demandems.exception;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter

public class ApiError {
    private String message;
    private int code;
    private LocalDateTime timestamp;
}
