package patterns.creation.abstractfactory.entities.water;

public class CargoShip implements Ship {

    @Override
    public void berth() {
        System.out.println("CargoShip has been docked");
    }

    @Override
    public boolean dropAnchor() {
        System.out.println("Cargo ship anchor has been dropped");
        return true;
    }
}
