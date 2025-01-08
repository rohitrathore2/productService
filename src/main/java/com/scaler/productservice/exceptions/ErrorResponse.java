package com.scaler.productservice.exceptions;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ErrorResponse {
    private int status;     // http status code
    private String message; // error message
    private LocalDateTime timestamp;    // when error happened

    public ErrorResponse(int status, String message, LocalDateTime timestamp){
        this.status = status;
        this.message = message;
        this.timestamp = timestamp;
    }

    // manually add getter and setter ??
}
