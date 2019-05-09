package patterns.creation.abstractfactory.entities.air;

public class MilitaryPlane implements Plane {

    @Override
    public void startTakingOff() {
        System.out.println("MilitaryPlane has been taken off");
    }

    @Override
    public void startLanding() {
        System.out.println("MilitaryPlane has been landed");
    }
}
