package patterns.creation.factorymethod.driver;

public class Captain extends AbstractDriver {

    @Override
    public void drive() {
        System.out.println("Captain started to drive ship");
    }
}
