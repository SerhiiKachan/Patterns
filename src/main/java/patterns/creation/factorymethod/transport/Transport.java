package patterns.creation.factorymethod.transport;

import patterns.creation.factorymethod.driver.AbstractDriver;

public abstract class Transport {
    public abstract AbstractDriver driver();
}
