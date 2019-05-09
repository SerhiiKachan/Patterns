package patterns.structural.bridge.transport;

import patterns.structural.bridge.type.TransportType;

public class Plane extends Transport {

    public Plane(TransportType type) {
        super(type);
    }

    @Override
    public void move() {
        System.out.println("Plane");
    }
}
