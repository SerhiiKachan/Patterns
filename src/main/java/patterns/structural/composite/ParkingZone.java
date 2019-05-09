package patterns.structural.composite;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ParkingZone implements Zone{

    private int parkingSpaces;
    private String zoneName;

    @Override
    public void zoneContents() {
        System.out.println(zoneName + ": " + parkingSpaces + " parking spaces; area = " + area());
    }

    @Override
    public double area() {
        return parkingSpaces * 3.5 * 4.5;
    }
}
