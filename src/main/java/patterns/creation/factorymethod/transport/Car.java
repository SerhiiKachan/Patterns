package patterns.creation.factorymethod.transport;

import patterns.creation.factorymethod.driver.AbstractDriver;
import patterns.creation.factorymethod.driver.CarDriver;

public class Car extends Transport {

    @Override
    public AbstractDriver driver() {
        return new CarDriver();
    }
}
