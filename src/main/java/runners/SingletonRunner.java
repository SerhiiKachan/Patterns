package runners;

import models.Client;
import models.Notification;

import static enums.NotificationType.WARNING;
import static patterns.creation.singleton.sync_lazy_volatile.Administrator.getAdministrator;
import static enums.NotificationType.REMINDER;

public class SingletonRunner {

    public static void main(String[] args) {
        Client client1 = new Client("Serhii", "+3553454345");
        Client client2 = new Client("Vitaliy", "+8439985245");

        Notification reminder = new Notification(REMINDER, "Pay bills");

        getAdministrator().registerNewClient(client1);
        getAdministrator().callClient(client1);

        getAdministrator().sendNotifications(reminder);
        getAdministrator().registerNewClient(client2);

        Notification warning = new Notification(WARNING, "You have debt for 2 months");

        getAdministrator().sendNotifications(warning);
    }

}
