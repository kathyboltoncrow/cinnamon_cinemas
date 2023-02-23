package com.techreturners;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class TestMovieController {

    private MovieController controller;

    @BeforeEach
    protected void setUp(){
        controller = new MovieController();
    }

    @Test
    public void requestSeatNumber(){
        Seat[] seats = controller.getSeats(0);
        int seatLength = seats.length;
        assertEquals(0, seatLength);
    }

    @Test
    public void requestMinSeatNumber(){
        Seat[] seats = controller.getSeats(1);
        int seatLength = seats.length;
        assertEquals(1, seatLength);
    }

    @Test
    public void requestMaxSeatNumber(){
        Seat[] seats = controller.getSeats(16);
        int seatLength = seats.length;
        assertEquals(0, seatLength);
    }



}
