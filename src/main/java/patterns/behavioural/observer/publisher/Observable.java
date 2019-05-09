package patterns.behavioural.observer.publisher;

import patterns.behavioural.observer.subscriber.Observer;

public interface Observable {
    void addObserver(Observer observer);
    void deleteObserver(Observer observer);
    void notifyObservers();
}
