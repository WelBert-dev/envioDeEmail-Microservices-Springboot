package com.ms.email.services;

import com.ms.email.repositories.IEmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    IEmailRepository _emailRepository;
}
