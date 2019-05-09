package patterns.behavioural.observer.subscriber;

import patterns.behavioural.observer.publisher.Employee;

public class RM implements Observer {

    @Override
    public void handleEvent(Employee reportingEmployee) {
        System.out.println("Your reporting employee has made changes in his account: " + reportingEmployee.toString());
    }
}
