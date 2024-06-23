package com.raza.javamail.controller;

import com.raza.javamail.entities.JavaMail;
import com.raza.javamail.services.JavaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mail")
public class EmailController {

    @Autowired
    private JavaService javaService;

    @PostMapping("/sendMail")
    public String sendingMail(@RequestBody JavaMail javaMail){
        javaService.sendMail(javaMail.getRecipient(),javaMail.getSubject(),javaMail.getBody());
        return "Mail has been sent successfully";
    }

}
