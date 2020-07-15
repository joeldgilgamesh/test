package com.spminfiscaa.service.dto;

import org.springframework.web.multipart.MultipartFile;

public class SendDTO {
    private MultipartFile file ;

    public SendDTO(MultipartFile file) {
        this.file = file;
    }
    public SendDTO() {}

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }

    @Override
    public String toString() {
        return "SendDTO{" +
            "file=" + file +
            '}';
    }
}
