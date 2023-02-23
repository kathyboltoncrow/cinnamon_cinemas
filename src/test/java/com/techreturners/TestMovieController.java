package com.techreturners;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

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

    @Test
    public void requestThirteenSeats(){
        Seat[] seats = controller.getSeats(13);
        int seatLength = seats.length;
        assertEquals(13, seatLength);

        int availableSeatCount = controller.getAvailableSeatCount();
        assertEquals(2, availableSeatCount);

    }

    @Test
    public int requestRandomSeatNumber(){

        Random randomSeatsRequested = new Random();
        int upperbound = 2;
        boolean seatsAvailable = true;

        int availableSeatCount = controller.getAvailableSeatCount();
        assertTrue(availableSeatCount >= upperbound + 1);

        while(seatsAvailable) {
            int int_random = randomSeatsRequested.nextInt(upperbound) + 1;
            Seat[] seats = controller.getSeats(int_random);
            if(seats.length == 0){
                seatsAvailable = false;
            }
            availableSeatCount = controller.getAvailableSeatCount();
        }
        assertTrue(availableSeatCount < upperbound + 1);

        return availableSeatCount;
    }


}
