package runners;

import patterns.creation.factorymethod.driver.AbstractDriver;
import patterns.creation.factorymethod.transport.Car;
import patterns.creation.factorymethod.transport.Plane;
import patterns.creation.factorymethod.transport.Ship;
import patterns.creation.factorymethod.transport.Transport;

public class FactoryMethodRunner {

    public static void main(String[] args) {
        Transport car = new Car();
        Transport plane = new Plane();
        Transport ship = new Ship();

        AbstractDriver carDriver = car.driver();
        AbstractDriver pilot = plane.driver();
        AbstractDriver captain = ship.driver();

        carDriver.drive();
        pilot.drive();
        captain.drive();
    }
}
