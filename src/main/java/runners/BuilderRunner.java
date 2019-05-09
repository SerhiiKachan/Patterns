package runners;

import patterns.creation.builder.AirplanePassenger;
import models.Ticket;

import java.util.Date;

import static enums.SeatRowSymbol.C;

public class BuilderRunner {

    public static void main(String[] args) {
        Date depDate = new Date(119, 4, 23);
        Date arrDate = new Date(119, 4, 28);

        Ticket ticket = new Ticket(472535, 17, C, depDate, arrDate, "Lviv", "Berlin");

        AirplanePassenger passenger = new AirplanePassenger.AirplanePassengerBuilder("Serhii", "Kachan", 49453453, ticket)
                .addBiometric()
                .addHandLuggageWeight(6)
                .addMiddleName("Liubomyrovych")
                .hasExtraLuggage()
                .build();

        System.out.println(passenger.toString());
    }

}
