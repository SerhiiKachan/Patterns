package patterns.structural.composite;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class ParkingZoneComposite implements Zone{

    private int parkingSpaces;
    private String zoneName;

    private List<Zone> parkingZones;

    public ParkingZoneComposite(String zoneName) {
        this.parkingSpaces = 0;
        this.zoneName = zoneName;
        this.parkingZones = new ArrayList<>();
    }

    public void addZone(Zone zone) {
        parkingZones.add(zone);
        parkingSpaces += zone.getParkingSpaces();
    }

    public void removeZone(Zone zone) {
        parkingZones.remove(zone);
        parkingSpaces -= zone.getParkingSpaces();
    }

    @Override
    public void zoneContents() {
        if (parkingZones.isEmpty()) {
            System.out.println(zoneName + ": EMPTY");
        } else {
            System.out.println(zoneName + ": " + parkingSpaces + " parking spaces; area = " + area() + "; consists of \n{");
            parkingZones.forEach(Zone::zoneContents);
            System.out.println("}");
        }
    }

    @Override
    public double area() {
        return parkingZones.stream().mapToDouble(Zone::area).sum();
    }
}
