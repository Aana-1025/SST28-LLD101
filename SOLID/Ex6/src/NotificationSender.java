public abstract class NotificationSender {

    protected final AuditLog audit;

    public NotificationSender(AuditLog audit) {
        this.audit = audit;
    }

    public final void send(Notification n) {

        if (n == null) {
            throw new IllegalArgumentException("Notification cannot be null");
        }

        if (n.phone == null || n.phone.isBlank()) {
            throw new IllegalArgumentException("Phone number required");
        }

        String body = (n.body == null) ? "" : n.body;

        Notification safe =
                new Notification(n.phone, n.subject, body);

        doSend(safe);

        audit.add("sent via " + this.getClass().getSimpleName());
    }

    protected abstract void doSend(Notification n);
}