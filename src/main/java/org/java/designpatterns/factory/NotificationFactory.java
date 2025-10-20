package org.java.designpatterns.factory;

import org.java.designpatterns.factory.notifications.EmailNotification;
import org.java.designpatterns.factory.notifications.PushNotification;
import org.java.designpatterns.factory.notifications.SMSNotification;

public class NotificationFactory {
    public static Notification createNotification(NotificationType type){
        return switch (type) {
            case SMS -> new SMSNotification();
            case EMAIL -> new EmailNotification();
            case PUSH -> new PushNotification();
        };
    }
}
