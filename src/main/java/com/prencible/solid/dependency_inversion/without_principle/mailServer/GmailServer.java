package com.prencible.solid.dependency_inversion.without_principle.mailServer;

import org.springframework.stereotype.Service;

@Service
public class GmailServer {

    public void send(String to, String content) {
        System.out.println("gmail sent mail to" + to + " content:" + content);
    }
}
