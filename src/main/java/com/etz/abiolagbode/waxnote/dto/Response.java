package com.etz.abiolagbode.waxnote.dto;

import java.util.List;

import lombok.Builder;
import lombok.Data;

/**
 * Response
 */
@Data
@Builder
public class Response {

    private Integer code;

    private String message;

    private Object result;

    private List<Error> errors;
}