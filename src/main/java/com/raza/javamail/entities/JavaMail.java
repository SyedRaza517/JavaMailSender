package com.raza.javamail.entities;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class JavaMail {


    private String recipient;
    private String subject;
    private String body;
}
