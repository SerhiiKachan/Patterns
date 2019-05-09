package patterns.creation.factorymethod.driver;

public class Pilot extends AbstractDriver{

    @Override
    public void drive() {
        System.out.println("Pilot started to drive plane");
    }
}
