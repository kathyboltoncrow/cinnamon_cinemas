package com.techreturners;

public class    Seat {

    private static int SEATS_PER_ROW = 5;
    private String seatNumber;
    private boolean isReserved;

    public Seat(String seatNumber) {
        this.seatNumber = seatNumber;
        this.isReserved = false;
    }

    public static String intToSeatNumber(int i) {
        char row = 'A';
        int rowCount = i / SEATS_PER_ROW;
        row = (char) (row + rowCount);
        int seatCount = i % SEATS_PER_ROW;

        String result = String.valueOf(row) + String.valueOf(seatCount + 1);
        return result;
    }

    public static Seat intToSeat(int i){
        Seat result = null;
        String seatNumber = Seat.intToSeatNumber(i);
        if(seatNumber != null){
            result = new Seat(seatNumber);
        }

        return result;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }
}
