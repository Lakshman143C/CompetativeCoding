package org.java.designpatterns.factory.notifications;

import org.java.designpatterns.factory.Notification;
import org.java.designpatterns.factory.NotificationType;

public class PushNotification  implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("This is a "+ NotificationType.PUSH+" notification");
    }
}
