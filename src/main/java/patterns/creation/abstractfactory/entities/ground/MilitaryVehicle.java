package patterns.creation.abstractfactory.entities.ground;

public class MilitaryVehicle implements Car {

    @Override
    public void drive() {
        System.out.println("MilitaryVehicle was started to ride");
    }

    @Override
    public void stop() {
        System.out.println("MilitaryVehicle has been stopped");
    }
}
