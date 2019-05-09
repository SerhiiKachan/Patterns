package runners;

import patterns.behavioural.observer.publisher.Employee;
import patterns.behavioural.observer.subscriber.Mentor;
import patterns.behavioural.observer.subscriber.RM;
import patterns.behavioural.observer.subscriber.TeamLead;

import java.util.ArrayList;
import java.util.List;

public class ObserverRunner {

    public static void main(String[] args) {
        List<String> employeeSkills = new ArrayList<>();
        employeeSkills.add("Java");
        employeeSkills.add("C++");

        Employee employee = new Employee("Area D", employeeSkills);

        employee.addObserver(new RM());
        employee.addObserver(new Mentor());
        employee.addObserver(new TeamLead());

        employee.notifyObservers();

        System.out.println();

        employee.updateLocation("Area C");

        System.out.println();

        employee.addNewSkill("Python");
    }

}
