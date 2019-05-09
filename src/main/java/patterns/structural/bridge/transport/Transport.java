package patterns.structural.bridge.transport;

import lombok.AllArgsConstructor;
import lombok.Getter;
import patterns.structural.bridge.type.TransportType;

@AllArgsConstructor
@Getter
public abstract class Transport {

    private TransportType type;

    public abstract void move();
}
