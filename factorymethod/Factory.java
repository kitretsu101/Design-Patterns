public class Factory {

    public static void main(String[] args) {

        NotificationCreator emailCreator =
                new EmailNotificationCreator();

        NotificationCreator smsCreator =
                new SmsNotificationCreator();

        NotificationCreator pushCreator =
                new PushNotificationCreator();

        emailCreator.sendNotification("Hello via Email!");

        smsCreator.sendNotification("Hello via SMS!");

        pushCreator.sendNotification("Hello via Push!");
    }

}