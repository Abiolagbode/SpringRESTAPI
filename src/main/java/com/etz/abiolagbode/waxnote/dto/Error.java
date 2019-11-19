package com.etz.abiolagbode.waxnote.dto;

import lombok.Data;

/**
 * Error
 */
@Data
public class Error {

    Integer code;
    String message;

    public Error(ResponseCodes code, String message){
        this.code=code.code();
        this.message = message;
    }
}