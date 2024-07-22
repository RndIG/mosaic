package com.mosaic;

import java.time.LocalDateTime;

/**
 * This is a class for deserializing future json responses from api to java-classes
 *
 * example of response is in responseDummy.json under resources/json/.
 * But im not exactly sure how to make a class which will make sense to deserialize such structure
 *
 * Implementation of deserializer with Jackson objectMapper to be done in next step (?)
 *
 */
public class ApiResponse {
    private final WeatherForecast content;

    public ApiResponse () {
        this.content = new WeatherForecast(LocalDateTime.now().toString(), 55.0d, 77.0d, 99.0d, 451.0d);
    }

    public WeatherForecast getContent() {
        return content;
    }
}
