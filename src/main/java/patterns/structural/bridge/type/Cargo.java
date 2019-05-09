package patterns.structural.bridge.type;

public class Cargo implements TransportType{

    @Override
    public int crewConsistence() {
        return 4;
    }

    @Override
    public double equipmentWeight() {
        return 567.45;
    }
}
