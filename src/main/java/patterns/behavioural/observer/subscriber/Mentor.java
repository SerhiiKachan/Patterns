package patterns.behavioural.observer.subscriber;

import patterns.behavioural.observer.publisher.Employee;

public class Mentor implements Observer {

    @Override
    public void handleEvent(Employee mentee) {
        System.out.println("Your mentee has made changes in his account: " + mentee.toString());
    }
}
