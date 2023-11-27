package com.ekinox.dvd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BackToTheFutureDVDsTest {

    @Test
    public void testExample1() {
        String[] input = {"Back to the Future 1", "Back to the Future 2", "Back to the Future 3"};
        assertEquals(36, BackToTheFutureDVDs.calculateTotalPrice(input));
    }

}