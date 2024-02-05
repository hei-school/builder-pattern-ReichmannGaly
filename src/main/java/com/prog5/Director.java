package com.prog5;

import com.prog5.Car.Engine.SUVEngine;
import com.prog5.Car.Engine.SportEngine;

public class Director {
    public void constructSportsCar(Builder builder){
        builder.reset();
        builder.setSeats(2);
        builder.setEngine(new SportEngine());
        builder.setTripComputer(true);
        builder.setGPS(true);
    }

    public void constructSUV(Builder builder){
        builder.reset();
        builder.setSeats(8);
        builder.setEngine(new SUVEngine());
        builder.setTripComputer(true);
        builder.setGPS(true);
    }
}
