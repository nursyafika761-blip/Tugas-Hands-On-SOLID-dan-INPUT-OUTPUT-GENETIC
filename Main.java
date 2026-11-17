public class Main {
    public static void main(String[] args) {

        Notifier email = new EmailNotifier();
        NotificationService service =
                new NotificationService(email);

        service.sendNotification("Halo melalui Email!");

        Notifier sms = new SMSNotifier();
        service = new NotificationService(sms);

        service.sendNotification("Halo melalui SMS!");

        Notifier telegram = new TelegramNotifier();
        service = new NotificationService(telegram);
        service.sendNotification("Halo melalui Telegram!");

        Notifier whatsapp = new WhatsAppNotifier();
        service = new NotificationService(whatsapp);

        service.sendNotification("Halo melalui WhatsApp!");
    }
}