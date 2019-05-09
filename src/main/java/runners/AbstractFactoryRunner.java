package runners;

import patterns.creation.abstractfactory.entities.air.Plane;
import patterns.creation.abstractfactory.factory.CargoFactory;
import patterns.creation.abstractfactory.factory.MilitaryFactory;
import patterns.creation.abstractfactory.factory.TransportFactory;
import patterns.creation.abstractfactory.entities.ground.Car;
import patterns.creation.abstractfactory.entities.water.Ship;

public class AbstractFactoryRunner {

    static class TransportContainer {

        private Ship ship;
        private Car car;
        private Plane plane;

        TransportContainer(TransportFactory transportFactory) {
            ship = transportFactory.createShip();
            car = transportFactory.createCar();
            plane = transportFactory.createPlane();
        }

        void useShip() {
            ship.berth();
            ship.dropAnchor();
        }

        void useCar() {
            car.drive();
            car.stop();
        }

        void usePlane() {
            plane.startTakingOff();
            plane.startLanding();
        }
    }

    public static void main(String[] args) {
        CargoFactory cargoFactory = new CargoFactory();
        MilitaryFactory militaryFactory = new MilitaryFactory();

        TransportContainer cargoContainer = new TransportContainer(cargoFactory);
        TransportContainer militaryContainer = new TransportContainer(militaryFactory);

        cargoContainer.useCar();
        cargoContainer.usePlane();
        cargoContainer.useShip();
        System.out.println();
        militaryContainer.useCar();
        militaryContainer.usePlane();
        militaryContainer.useShip();
    }
}
