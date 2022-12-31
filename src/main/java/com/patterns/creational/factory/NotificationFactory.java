package com.patterns.creational.factory;

public class NotificationFactory {

    public Notification createNotification(ChannelNotification channel){

        switch (channel){
            case SMS:
                return new SMSNotification();
            case EMAIL:
                return new EmailNotification();
            case PUSH:
                return new PushNotification();
            default:
                throw new IllegalArgumentException("Channel " + channel +  " not available!");
        }

    }

}
