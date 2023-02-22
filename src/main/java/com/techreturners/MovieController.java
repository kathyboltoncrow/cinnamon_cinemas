package com.techreturners;

public class MovieController {

    private Seat [] seats;
    private final int MAX_SEATS = 15;
    private int seatPointer = 0;

    public void MovieController() {
        seats = new Seat[MAX_SEATS];
        for(int i = 0; i < MAX_SEATS; i++){
        }
    }

    public int getSeats(int requestNumberSeats) {
       int allocatedSeat = 0;
       return allocatedSeat;
    }


}
