package com.techreturners;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestMovieController {
    @Test
    public void requestSeat() {
        MovieController controller = new MovieController();
        int allocatedSeats = controller.getSeats(2);
        assertEquals(2, allocatedSeats);
    }
    @Test
    public void requestMaxSeats() {
        MovieController controller = new MovieController();
        int allocatedSeats = controller.getSeats(20);
        assertEquals(0, allocatedSeats);
    }

}
