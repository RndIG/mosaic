package com.mosaic;

import java.time.LocalDateTime;

public class Weatherforecast {
    private LocalDateTime time;
    private float precipitationIntensity;
    private int percipitationProbability;
    private int percipitationType;
    private float temperature;

    //default constructor used in apiclientStub FOR NOW (values are intentionally improbable to show that this is dummy values)
    public Weatherforecast() {
        this.time = LocalDateTime.now();
        this.precipitationIntensity = 55;
        this.percipitationProbability = 77;
        this.percipitationType = 99;
        this.temperature = 451;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public float getPrecipitationIntensity() {
        return precipitationIntensity;
    }

    public int getPercipitationProbability() {
        return percipitationProbability;
    }

    public int getPercipitationType() {
        return percipitationType;
    }

    public float getTemperature() {
        return temperature;
    }
}
