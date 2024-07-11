package com.mosaic;

import java.time.LocalDateTime;

/**
 * This is a class for deserializing future json responses from api to java-classes
 * as api response will be List of forcasts ("intervals") I decided to make forcast itself an inner class of response
 * example of response is in responseDummy.json under resources/json/.
 * But im not exactly sure how to make a class which will make sense to deserialize such structure
 *
 * Implementation of deserializer with Jackson objectMapper to be done in next step (?)
 *
 */
public class ApiResponse {
    private WeatherForecast content;

    public ApiResponse () {
        this.content = new WeatherForecast();
    }

    public WeatherForecast getContent() {
        return content;
    }



    public class WeatherForecast {
        private String startTime;
        private Double precipitationIntensity;
        private Double precipitationProbability;
        private Double precipitationType;
        private Double temperature;

        //default constructor used in ApiClientStub FOR NOW (values are intentionally improbable to show that this is dummy values)
        public WeatherForecast() {
            this.startTime = LocalDateTime.now().toString();
            this.precipitationIntensity = 55.0d;
            this.precipitationProbability = 77.0d;
            this.precipitationType = 99.0d;
            this.temperature = 451.0d;
        }

        public String getTime() {
            return startTime;
        }

        public Double getPrecipitationIntensity() {
            return precipitationIntensity;
        }

        public Double getPrecipitationProbability() {
            return precipitationProbability;
        }

        public Double getPrecipitationType() {
            return precipitationType;
        }

        public Double getTemperature() {
            return temperature;
        }
    }
}
