package com.patterns.creational.factory;

public class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending EMAIL notification...");
    }
}
