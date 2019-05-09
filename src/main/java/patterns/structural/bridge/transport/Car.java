package patterns.structural.bridge.transport;

import patterns.structural.bridge.type.TransportType;

public class Car extends Transport {

    public Car(TransportType type) {
        super(type);
    }

    @Override
    public void move() {
        System.out.println("Car");
    }
}
