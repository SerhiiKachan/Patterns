package patterns.creation.abstractfactory.factory;

import patterns.creation.abstractfactory.entities.air.MilitaryPlane;
import patterns.creation.abstractfactory.entities.air.Plane;
import patterns.creation.abstractfactory.entities.ground.Car;
import patterns.creation.abstractfactory.entities.ground.MilitaryVehicle;
import patterns.creation.abstractfactory.entities.water.Ship;
import patterns.creation.abstractfactory.entities.water.Warship;

public class MilitaryFactory implements TransportFactory {

    @Override
    public Plane createPlane() {
        return new MilitaryPlane();
    }

    @Override
    public Car createCar() {
        return new MilitaryVehicle();
    }

    @Override
    public Ship createShip() {
        return new Warship();
    }
}
