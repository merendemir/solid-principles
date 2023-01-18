package com.prencible.solid.dependency_inversion.with_principle.service;

import com.prencible.solid.dependency_inversion.with_principle.mailServer.GmailServer;
import com.prencible.solid.dependency_inversion.with_principle.mailServer.IMailServer;
import com.prencible.solid.dependency_inversion.with_principle.mailServer.YandexServer;
import org.springframework.stereotype.Service;

@Service
public class DIPMailService {

//    @PostConstruct
    public void init() {
        this.sendMail(new GmailServer(), "mail.@gmail.com", "hello world");
        this.sendMail(new YandexServer(), "mail.@gmail.com", "hello world");
    }

    public void sendMail(IMailServer mailServer, String to, String content) {
        mailServer.send(to, content);
    }
}
