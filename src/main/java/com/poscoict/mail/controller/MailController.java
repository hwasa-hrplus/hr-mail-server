package com.poscoict.mail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poscoict.mail.dto.MailDto;
import com.poscoict.mail.service.MailService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class MailController {

    @Autowired
    private MailService mailService;

    @PostMapping("/send")
    public void sendMail(@RequestBody MailDto mailDto) {
    	System.out.println("mail server");
    	System.out.println("in!"+mailDto.getAddress());
    	mailDto.setAddress(mailDto.getAddress());
    	mailDto.setTitle("[POSCOICT] 출장신청 승인 요청");
    	mailDto.setMessage(mailDto.getName()+ "님이 "+mailDto.getProjectName()+"건으로 출장 신청을 했습니다. 확인부탁드립니다.");

        mailService.sendMail(mailDto);

    }
    
    @PostMapping("/sendApprove")
    public void sendApproveMail(@RequestBody MailDto mailDto) {
    	System.out.println("mail server");
    	System.out.println("in!"+mailDto.getAddress());
    	mailDto.setAddress(mailDto.getAddress());
    	mailDto.setTitle("[POSCOICT] 출장승인 완료");
    	mailDto.setMessage(mailDto.getName()+ "님, "+mailDto.getProjectName() +"건으로 신청한 출장이 승인되었습니다.");

        mailService.sendMail(mailDto);

    }
}