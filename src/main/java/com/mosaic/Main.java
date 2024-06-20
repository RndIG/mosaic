package com.mosaic;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("We are running..." );

        Apiclienstub apistub = new Apiclienstub();
        Weatherforecast forcastDummy = apistub.fetchforcast();
        System.out.println(forcastDummy.getTime());
        System.out.println(forcastDummy.getPrecipitationIntensity());
        System.out.println(forcastDummy.getPercipitationProbability());
        System.out.println(forcastDummy.getPercipitationType());
        System.out.println(forcastDummy.getTemperature());


    }
}
