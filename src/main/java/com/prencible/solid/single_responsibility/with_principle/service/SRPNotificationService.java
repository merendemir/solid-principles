package com.prencible.solid.single_responsibility.with_principle.service;

import org.springframework.stereotype.Service;

@Service
public class SRPNotificationService {

    public void sendMessage(String message) {
        System.out.println("message sent. message: " + message);
    }
}
