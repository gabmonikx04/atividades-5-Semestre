public class SMSNotification implements Notification {

    public String sendNotification(String message) {
        return "SMS: " + message;
    }
}
