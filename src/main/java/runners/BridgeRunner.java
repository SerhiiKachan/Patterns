package runners;

import patterns.structural.bridge.transport.Car;
import patterns.structural.bridge.transport.Plane;
import patterns.structural.bridge.transport.Ship;
import patterns.structural.bridge.transport.Transport;
import patterns.structural.bridge.type.Cargo;
import patterns.structural.bridge.type.Military;

public class BridgeRunner {

    public static void main(String[] args) {
        Transport car = new Car(new Cargo());
        Transport ship = new Ship(new Military());
        Transport plane = new Plane(new Cargo());

        System.out.println(car.getType());
        System.out.println(ship.getType());
        System.out.println(plane.getType());
    }

}
