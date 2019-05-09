package patterns.creation.builder;

import lombok.ToString;
import models.Ticket;

@ToString
public class AirplanePassenger {
    private String name;
    private String surName;
    private String middleName;
    private int handLuggageWeight;
    private long id;
    private boolean hasBiometric;
    private boolean hasExtraLuggage;
    private Ticket ticket;

    private AirplanePassenger(AirplanePassengerBuilder builder) {
        this.name = builder.name;
        this.surName = builder.surName;
        this.middleName = builder.middleName;
        this.handLuggageWeight = builder.handLuggageWeight;
        this.id = builder.id;
        this.hasBiometric = builder.hasBiometric;
        this.hasExtraLuggage = builder.hasExtraLuggage;
        this.ticket = builder.ticket;
    }

    public static class AirplanePassengerBuilder {

        private String name;
        private String surName;
        private long id;
        private Ticket ticket;

        private String middleName;
        private int handLuggageWeight;
        private boolean hasBiometric;
        private boolean hasExtraLuggage;

        public AirplanePassengerBuilder(String name, String surName, int id, Ticket ticket) {
            this.name = name;
            this.surName = surName;
            this.id = id;
            this.ticket = ticket;
        }

        public AirplanePassengerBuilder addMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public AirplanePassengerBuilder addHandLuggageWeight(int handLuggageWeight) {
            this.handLuggageWeight = handLuggageWeight;
            return this;
        }

        public AirplanePassengerBuilder addBiometric() {
            this.hasBiometric = true;
            return this;
        }

        public AirplanePassengerBuilder hasExtraLuggage() {
            this.hasExtraLuggage = true;
            return this;
        }

        public AirplanePassenger build() {
            return new AirplanePassenger(this);
        }
    }
}
