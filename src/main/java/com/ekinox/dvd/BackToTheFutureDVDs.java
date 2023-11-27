package com.ekinox.dvd;

public class BackToTheFutureDVDs {

    public static int calculateTotalPrice(String[] basket) {
        int backToTheFutureCount = 0;
        int otherFilmCount = 0;
        int totalPrice = 0;

        for (String film : basket) {
            if (film.startsWith("Back to the Future")) {
                backToTheFutureCount += 1;
            } else {
                otherFilmCount++;
            }
        }

        if (backToTheFutureCount == 2) {

            totalPrice = (int) Math.round((15 * backToTheFutureCount) * 0.9);
        } else if (backToTheFutureCount >= 3) {

            totalPrice = (int) Math.round((15 * backToTheFutureCount) * 0.8);
        } else {

            totalPrice = 15 * backToTheFutureCount;
        }

        totalPrice += 20 * otherFilmCount;

        return totalPrice;
    }
}
