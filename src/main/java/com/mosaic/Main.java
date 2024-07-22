package com.mosaic;


public class Main {
    public static void main(String[] args) {

        System.out.println("We are running..." );

        ApiClientStub apiStub = new ApiClientStub();
        ApiResponse response = apiStub.fetchForecast();
        WeatherForecast forecast = response.getContent();

        System.out.println(forecast.startTime());
        System.out.println(forecast.precipitationIntensity());
        System.out.println(forecast.precipitationProbability());
        System.out.println(forecast.precipitationType());
        System.out.println(forecast.temperature());


    }
}
