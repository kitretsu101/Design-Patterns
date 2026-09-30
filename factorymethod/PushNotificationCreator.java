public class PushNotificationCreator extends NotificationCreator {

    @Override
    protected Notification createNotification() {
        return new PushNotification();
    }

}