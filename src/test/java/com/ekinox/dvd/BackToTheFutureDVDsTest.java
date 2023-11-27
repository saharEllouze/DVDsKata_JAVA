package com.ekinox.dvd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BackToTheFutureDVDsTest {

    @Test
    public void testExample1() {
        String[] input = {"Back to the Future 1", "Back to the Future 2", "Back to the Future 3"};
        assertEquals(36, BackToTheFutureDVDs.calculateTotalPrice(input));
    }

    @Test
    public void testExample2() {
        String[] input = {"Back to the Future 1", "Back to the Future 3"};
        assertEquals(27, BackToTheFutureDVDs.calculateTotalPrice(input));
    }

    @Test
    public void testExample3() {
        String[] input = {"Back to the Future 1"};
        assertEquals(15, BackToTheFutureDVDs.calculateTotalPrice(input));
    }

    @Test
    public void testExample4() {
        String[] input = {"Back to the Future 1", "Back to the Future 2", "Back to the Future 3", "Back to the Future 2"};
        assertEquals(48, BackToTheFutureDVDs.calculateTotalPrice(input));
    }

    @Test
    public void testExample5() {
        String[] input = {"Back to the Future 1", "Back to the Future 2", "Back to the Future 3", "La chèvre"};
        assertEquals(56, BackToTheFutureDVDs.calculateTotalPrice(input));
    }
}