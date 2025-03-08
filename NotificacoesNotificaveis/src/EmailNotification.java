public class EmailNotification implements Notification {

    public String sendNotification(String message) {
        return "Email: " + message;
    }
}
