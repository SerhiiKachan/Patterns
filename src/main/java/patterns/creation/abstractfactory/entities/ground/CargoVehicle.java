package patterns.creation.abstractfactory.entities.ground;

public class CargoVehicle implements Car {

    @Override
    public void drive() {
        System.out.println("CargoVehicle was started to drive");
    }

    @Override
    public void stop() {
        System.out.println("CargoVehicle has been stopped");
    }
}
