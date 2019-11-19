package com.etz.abiolagbode.waxnote.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Payload
 */
@Data
@NoArgsConstructor
@ToString
public class Payload {

    private String fileName;
    private String fileDownloadUri;
    private String fileType;
    private long size;

    public Payload(String fileName, String fileDownloadUri, String fileType, long size) {
        this.fileName = fileName;
        this.fileDownloadUri = fileDownloadUri;
        this.fileType = fileType;
        this.size = size;
    }

}