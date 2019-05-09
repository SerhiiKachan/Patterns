package patterns.behavioural.observer.subscriber;

import patterns.behavioural.observer.publisher.Employee;

public class TeamLead implements Observer {

    @Override
    public void handleEvent(Employee teammate) {
        System.out.println("Your teammate has made changes in his account: " + teammate.toString());
    }
}
