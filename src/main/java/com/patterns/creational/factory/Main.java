package com.patterns.creational.factory;

public class Main {


    /**
     * *** FACTORY METHOD ***
     * The Factory Method defines an interface for creating an object,
     * but delegates to the subclasses the decision of which class will be instantiated,
     * without the rest of the application having to know about such subclasses.
     */

    public static void main() {

        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification;

        //Sending SMS notification
        notification = notificationFactory.createNotification(ChannelNotification.SMS);
        notification.notifyUser();

        //Sending EMAIL notification
        notification = notificationFactory.createNotification(ChannelNotification.EMAIL);
        notification.notifyUser();

        //Sending PHONE notification
        notification = notificationFactory.createNotification(ChannelNotification.PUSH);
        notification.notifyUser();

        //Sending PHONE notification but the channel is unavailable
        try{
            notification = notificationFactory.createNotification(ChannelNotification.PHONE);
            notification.notifyUser();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


    }
}
