package com.mosaic;

public record WeatherForecast(String startTime,
                              Double precipitationIntensity,
                              Double precipitationProbability,
                              Double precipitationType,
                              Double temperature) {

}
