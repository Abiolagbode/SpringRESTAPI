package com.etz.abiolagbode.waxnote.exception;

/**
 * FileStorageException
 */
public class FileStorageException extends RuntimeException {

    
    public FileStorageException(String message) {
        super(message);
    }

    public FileStorageException(String message, Throwable cause) {
        super(message, cause);
    }
}