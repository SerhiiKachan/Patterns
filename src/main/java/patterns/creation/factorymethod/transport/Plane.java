package patterns.creation.factorymethod.transport;

import patterns.creation.factorymethod.driver.AbstractDriver;
import patterns.creation.factorymethod.driver.Pilot;

public class Plane extends Transport {

    @Override
    public AbstractDriver driver() {
        return new Pilot();
    }
}
