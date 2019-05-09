package patterns.structural.bridge.transport;

import patterns.structural.bridge.type.TransportType;

public class Ship extends Transport {

    public Ship(TransportType type) {
        super(type);
    }

    @Override
    public void move() {
        System.out.println("Ship");
    }
}
