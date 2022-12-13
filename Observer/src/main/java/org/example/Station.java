package org.example;

import java.util.Random;

public class Station extends Publisher {

    public void start(int times) throws InterruptedException {
        Random random = new Random();

        for (int i = 0; i < times; i++) {
            WeatherContext weatherContext = new WeatherContext(
                    getRandomInRange(random,-10, 25),
                    getRandomInRange(random,10, 12),
                    getRandomInRange(random,2444, 6444)
            );

            notifyAll(weatherContext);

            Thread.sleep(1000);
        }
    }

    private int getRandomInRange(Random random, int min, int max) {
        return random.nextInt(max - min) + min;
    }
}
