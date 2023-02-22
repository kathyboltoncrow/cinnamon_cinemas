package com.techreturners;

public class Seat {
    private String seatNumber;
    private boolean isReserved;

    public Seat(String seatNumber, boolean isReserved) {
        this.seatNumber = seatNumber;
        this.isReserved = isReserved;
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
