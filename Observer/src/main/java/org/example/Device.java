package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Device implements Subscriber {
    @Getter
    private WeatherContext currentContext;

    @Override
    public void notify(WeatherContext context) {
        if (context.equals(currentContext)) {
            return;
        }

        if (context.getTemperature() != currentContext.getTemperature()) {
            System.out.println("New temperature is " + context.getTemperature());
            currentContext.setTemperature(context.getTemperature());
        }

        if (context.getHumidity() != currentContext.getHumidity()) {
            System.out.println("New humidity is " + context.getHumidity());
            currentContext.setHumidity(context.getHumidity());
        }

        if (context.getPressure() != currentContext.getPressure()) {
            System.out.println("New pressure is " + context.getPressure());
            currentContext.setPressure(context.getPressure());
        }

        System.out.println();
    }
}
