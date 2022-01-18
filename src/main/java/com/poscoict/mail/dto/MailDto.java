package com.poscoict.mail.dto;

import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class MailDto {
	private String address;
    private String title;
    private String message;
    private String name;
    private String projectName;
    
}
