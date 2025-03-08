public class NotificationFactory {
    public Notification createNotification(String channel) {
        if (channel == null || channel.isEmpty()) {
            return null;
        }
        return switch (channel) {
            case "SMS" -> new SMSNotification();
            case "PUSH" -> new PushNotification();
            case "Email" -> new EmailNotification();
            default -> null;
        };
    }
}
