package patterns.creation.abstractfactory.factory;

import patterns.creation.abstractfactory.entities.air.CargoPlane;
import patterns.creation.abstractfactory.entities.air.Plane;
import patterns.creation.abstractfactory.entities.ground.Car;
import patterns.creation.abstractfactory.entities.ground.CargoVehicle;
import patterns.creation.abstractfactory.entities.water.CargoShip;
import patterns.creation.abstractfactory.entities.water.Ship;

public class CargoFactory implements TransportFactory {

    @Override
    public Plane createPlane() {
        return new CargoPlane();
    }

    @Override
    public Car createCar() {
        return new CargoVehicle();
    }

    @Override
    public Ship createShip() {
        return new CargoShip();
    }
}
