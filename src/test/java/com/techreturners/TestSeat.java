package com.techreturners;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class TestSeat {
    @Test
    public void intToSeat(){
        assertEquals("A1", Seat.intToSeatNumber(0));
        assertEquals("A2", Seat.intToSeatNumber(1));
        assertEquals("B1", Seat.intToSeatNumber(5));
        assertEquals("C5", Seat.intToSeatNumber(14));
    }
}
