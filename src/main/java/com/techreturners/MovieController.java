package com.techreturners;

public class MovieController {

    private Seat [] seats;
    private final int MAX_SEATS = 15;
    private int availableSeatsCounter = 0;

    public MovieController() {
        seats = new Seat[MAX_SEATS];
        for(int i = 0; i < MAX_SEATS; i++){
            seats[i] = Seat.intToSeat(i);
        }
    }

    public int getSeats(int requestNumberSeats) {
       int available = MAX_SEATS - availableSeatsCounter;
       if(available >= requestNumberSeats){
           availableSeatsCounter += requestNumberSeats;
           return requestNumberSeats;
       }
       else{
           return 0;
       }

    }


}
