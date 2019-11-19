package com.etz.abiolagbode.waxnote.dto;

/**
 * ResponseCodes
 */
public enum ResponseCodes {

    SUCCESS(0),
    UNAUTHORIZED(1),
    FORBIDDEN(2),
    INVALID_REQUEST(3),
    NOT_FOUND(4),
    SYSTEM_ERROR(5);

    private Integer code;

    public Integer code(){
        return code;
    }

    ResponseCodes(Integer code){
        this.code=code;
    }
    
}