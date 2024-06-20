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
public class Apiresponse {


    public class Weatherforecast {
        private LocalDateTime startTime;
        private float precipitationIntensity;
        private float percipitationProbability;
        private float percipitationType;
        private float temperature;

        //default constructor used in apiclientStub FOR NOW (values are intentionally improbable to show that this is dummy values)
        public Weatherforecast() {
            this.startTime = LocalDateTime.now();
            this.precipitationIntensity = 55;
            this.percipitationProbability = 77;
            this.percipitationType = 99;
            this.temperature = 451;
        }
    }
}
