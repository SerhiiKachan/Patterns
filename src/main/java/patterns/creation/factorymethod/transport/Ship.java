package patterns.creation.factorymethod.transport;

import patterns.creation.factorymethod.driver.AbstractDriver;
import patterns.creation.factorymethod.driver.Captain;

public class Ship extends Transport {

    @Override
    public AbstractDriver driver() {
        return new Captain();
    }
}
