package com.prencible.solid.dependency_inversion.without_principle.service;

import com.prencible.solid.dependency_inversion.with_principle.mailServer.GmailServer;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service
public class DIPMailServiceWithoutPrinciple {

//    @PostConstruct
    public void init() {
        this.sendMail("mail.@gmail.com", "hello world");
    }

    /**
     * mail service is dependent on GmailServer
     */
    public void sendMail(String to, String content) {
        GmailServer gmailServer = new GmailServer();
        gmailServer.send(to, content);
    }
}
