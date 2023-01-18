package com.prencible.solid.dependency_inversion.with_principle.mailServer;

public class YandexServer implements IMailServer {
    @Override
    public void send(String to, String content) {
        System.out.println("yandex sent mail to" + to + " content:" + content);
    }
}
