package patterns.structural.bridge.type;

public class Military implements TransportType {

    @Override
    public int crewConsistence() {
        return 20;
    }

    @Override
    public double equipmentWeight() {
        return 346.77;
    }
}
