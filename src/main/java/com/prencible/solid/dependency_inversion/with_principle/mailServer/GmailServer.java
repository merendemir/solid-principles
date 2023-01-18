package com.prencible.solid.dependency_inversion.with_principle.mailServer;


public class GmailServer implements IMailServer {

    @Override
    public void send(String to, String content) {
        System.out.println("gmail sent mail to" + to + " content:" + content);
    }
}
