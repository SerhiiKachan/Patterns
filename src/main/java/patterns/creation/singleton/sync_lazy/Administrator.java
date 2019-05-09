package patterns.creation.singleton.sync_lazy;

import models.Client;
import models.Notification;

import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.isNull;

public final class Administrator{

    private static Administrator administrator;

//    public static synchronized Mentor getAdministrator() {
//        return isNull(administrator) ? administrator = new Mentor() : administrator;
//    }

    public static Administrator getAdministrator() {
        if (isNull(administrator))
            synchronized (Administrator.class) {
                if (isNull(administrator))
                    administrator = new Administrator();
            }
        return administrator;
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
