package com.ekinox.dvd;

public class BackToTheFutureDVDs {

    public static final String BACK_TO_THE_FUTURE = "Back to the Future";
    private static final int DVD_PRICE = 15;
    private static final int OTHER_FILM_PRICE = 20;

    public static int calculateTotalPrice(String[] basket) {
        int backToTheFutureCount = 0;

        int otherFilmCount = 0;
        int totalPrice = 0;

        for (String film : basket) {
            if (film.startsWith(BACK_TO_THE_FUTURE)) {
                backToTheFutureCount += 1;
            } else {
                otherFilmCount++;
            }
        }

        if (backToTheFutureCount == 2) {

            totalPrice = (int) Math.round((DVD_PRICE * backToTheFutureCount) * 0.9);
        } else if (backToTheFutureCount >= 3) {

            totalPrice = (int) Math.round((DVD_PRICE * backToTheFutureCount) * 0.8);
        } else {

            totalPrice = DVD_PRICE * backToTheFutureCount;
        }

        totalPrice += OTHER_FILM_PRICE * otherFilmCount;

        return totalPrice;
    }
}
