package patterns.creation.abstractfactory.factory;

import patterns.creation.abstractfactory.entities.air.Plane;
import patterns.creation.abstractfactory.entities.ground.Car;
import patterns.creation.abstractfactory.entities.water.Ship;

public interface TransportFactory {
    Plane createPlane();
    Car createCar();
    Ship createShip();
}
