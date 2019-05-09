package patterns.behavioural.observer.subscriber;

import patterns.behavioural.observer.publisher.Employee;

public interface Observer {
    void handleEvent(Employee employee);
}
