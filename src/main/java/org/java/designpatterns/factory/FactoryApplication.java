package org.java.designpatterns.factory;

public class FactoryApplication {
    public static void main(String[] args) {
        Notification notification = NotificationFactory.createNotification(NotificationType.SMS);
        notification.notifyUser();
    }
}
