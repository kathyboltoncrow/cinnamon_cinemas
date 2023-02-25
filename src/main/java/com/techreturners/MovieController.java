package com.techreturners;

public class MovieController {

    private final Seat [] seats;
    private final int MAX_SEATS = 15;
    private int freeSeatsPointer = 0;

    public MovieController() {
        seats = new Seat[MAX_SEATS];
        for(int i = 0; i < MAX_SEATS; i++){
            seats[i] = Seat.intToSeat(i);
        }
    }

    public int getAvailableSeatCount(){
        return MAX_SEATS - freeSeatsPointer;
    }

    public Seat[] getSeats(int requestNumberSeats) {
        Seat [] allocatedSeats;

        int available = getAvailableSeatCount();

        if(requestNumberSeats > 0 && requestNumberSeats <= available){
            allocatedSeats = new Seat[requestNumberSeats];
            for(int i = 0; i < requestNumberSeats; i++){

                Seat allocatedSeat = seats[freeSeatsPointer];
                allocatedSeat.setReserved(true);
                allocatedSeats[i] = allocatedSeat;
                freeSeatsPointer++;
            }
        }
        else{
            allocatedSeats = new Seat[0];
        }
        return allocatedSeats;
    }

}
