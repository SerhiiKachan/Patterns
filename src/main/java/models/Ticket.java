package models;

import enums.SeatRowSymbol;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Date;

@ToString
@Getter
@AllArgsConstructor
public class Ticket {
    private long flightNumber;
    private int seatRowNumber;
    private SeatRowSymbol seatRowSymbol;
    private Date departureDay;
    private Date arrivalDay;
    private String departurePlace;
    private String arrivalPlace;
}
