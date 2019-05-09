package patterns.behavioural.observer.publisher;

import patterns.behavioural.observer.subscriber.Observer;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Observable{

    private String location;
    private List<String> skills;

    private List<Observer> observers;

    public Employee(String location, List<String> skills) {
        this.location = location;
        this.skills = skills;
        this.observers = new ArrayList<>();
    }

    public void updateLocation(String newLocation) {
        location = newLocation;
        notifyObservers();
    }

    public void addNewSkill(String newSkill) {
        skills.add(newSkill);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(o -> o.handleEvent(this));
    }

    @Override
    public String toString() {
        return "location = [" + location + "], skills = " + skills.toString();
    }
}
