package patterns.creation.abstractfactory.entities.air;

public class CargoPlane implements Plane {

    @Override
    public void startTakingOff() {
        System.out.println("CargoPlane has been taken off");
    }

    @Override
    public void startLanding() {
        System.out.println("CargoPlane has been landed");
    }
}
