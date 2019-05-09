package runners;

import patterns.structural.composite.ParkingZone;
import patterns.structural.composite.ParkingZoneComposite;

public class CompositeRunner {

    public static void main(String[] args) {
        ParkingZone level1 = new ParkingZone(3, "Green zone");
        ParkingZone level2 = new ParkingZone(5, "Red zone");
        ParkingZone level3 = new ParkingZone(9, "Blue zone");

        level1.zoneContents();
        level2.zoneContents();
        level3.zoneContents();

        System.out.println();

        ParkingZoneComposite compositeZone = new ParkingZoneComposite("Black zone");

        compositeZone.zoneContents();

        System.out.println();

        compositeZone.addZone(level1);
        compositeZone.addZone(level2);
        compositeZone.addZone(level3);

        compositeZone.zoneContents();

        compositeZone.removeZone(level2);

        System.out.println();

        compositeZone.zoneContents();
    }

}
