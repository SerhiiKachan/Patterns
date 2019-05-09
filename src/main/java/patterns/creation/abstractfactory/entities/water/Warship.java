package patterns.creation.abstractfactory.entities.water;

public class Warship implements Ship {

    @Override
    public void berth() {
        System.out.println("Warship has been docked");
    }

    @Override
    public boolean dropAnchor() {
        System.out.println("Warship anchor has been dropped");
        return true;
    }
}
