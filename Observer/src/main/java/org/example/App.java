package org.example;

public class App {
    public static void main( String[] args ) throws InterruptedException {
        Subscriber subscriber = new Device(new WeatherContext(0,0,0));
        Station station = new Station();

        station.subscribe(subscriber);

        station.start(10);

        station.unsubscribe(subscriber);
    }
}
