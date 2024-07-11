package com.mosaic;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("We are running..." );

        ApiClientStub apiStub = new ApiClientStub();
        ApiResponse response = apiStub.fetchForcast();
        ApiResponse.WeatherForecast forecast = response.getContent();

        System.out.println(forecast.getTime());
        System.out.println(forecast.getPrecipitationIntensity());
        System.out.println(forecast.getPrecipitationProbability());
        System.out.println(forecast.getPrecipitationType());
        System.out.println(forecast.getTemperature());


    }
}
