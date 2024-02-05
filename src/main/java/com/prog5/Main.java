package com.prog5;

import com.prog5.Car.Car;
import com.prog5.Car.CarBuilder;
import com.prog5.Manual.CarManualBuilder;
import com.prog5.Manual.Manual;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);
        Car sportCar = builder.getProduct();
        director.constructSUV(builder);
        Car SUV = builder.getProduct();

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual sportCarmanual = manualBuilder.getProduct();
        director.constructSUV(manualBuilder);
        Manual SUVManual = manualBuilder.getProduct();

        System.out.println(sportCar);
        System.out.println(SUV);
        System.out.println(sportCarmanual);
        System.out.println(SUVManual);
    }
}