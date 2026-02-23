public class Main {

    public static void main(String[] args) {

        AuditLog audit = new AuditLog();

        Notification smsNotification =
                new Notification("+911234567890", null, "Hello from SMS");

        Notification waNotification =
                new Notification("+911234567890", null, "Hello from WhatsApp");

        NotificationSender smsSender = new SmsSender(audit);
        NotificationSender waSender = new WhatsAppSender(audit);

        smsSender.send(smsNotification);
        waSender.send(waNotification);

        audit.print();
    }
}