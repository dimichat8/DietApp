package com.example.plan.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmailDTO {

    private String email;
    private String contactInfo;
    private MultipartFile[] file;
    private String to;
    private String[] cc;
    private String subject;
    private String body;
}