package patterns.creation.singleton.demand_holder;

import models.Client;
import models.Notification;

import java.util.ArrayList;
import java.util.List;

public final class Administrator {

    public static Administrator getAdministrator() {
        return AdministratorHolder.administrator;
    }

    private static class AdministratorHolder {
        private static final Administrator administrator = new Administrator();
    }








    private List<Client> clients;

    private Administrator() {
        clients = new ArrayList<>();
    }

    public void callClient(Client client) {
        if (!getAdministrator().clients.contains(client))
            registerNewClient(client);
        call(client.getPhoneNumber());
    }

    public void sendNotifications(Notification notification) {
        getAdministrator().clients.forEach(client -> sendSMS(client.getPhoneNumber(), notification));
    }

    public void registerNewClient(Client client) {
        getAdministrator().clients.add(client);
    }

    private void call(String number) {
        System.out.println("call " + number);
    }

    private void sendSMS(String number, Notification notification) {
        System.out.println("send [" + notification.getType().name() + ": " + notification.getText() + "] via " + number);
    }
}
