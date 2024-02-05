package com.prog5;

import com.prog5.Car.Engine.SUVEngine;
import com.prog5.Car.Engine.SportEngine;
import com.prog5.Manual.CarManualBuilder;
import com.prog5.Manual.Manual;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarManualTest {
    Manual expectedSportCarManual(){
        Manual manual = new Manual();
        manual.setCarSeats(2);
        manual.setEngine(new SportEngine());
        manual.setTripComputer(true);
        manual.setGPS(true);

        return manual;
    }

    Manual expectedSUVCarManual(){
        Manual manual = new Manual();
        manual.setCarSeats(8);
        manual.setEngine(new SUVEngine());
        manual.setTripComputer(true);
        manual.setGPS(true);

        return manual;
    }

    @Test
    public void create_sport_car_manual(){
        Director director = new Director();
        CarManualBuilder builder = new CarManualBuilder();

        Manual expectedSportCarManual = expectedSportCarManual();

        director.constructSportsCar(builder);
        Manual actualCarManual = builder.getProduct();

        assertEquals(expectedSportCarManual, actualCarManual);
    }

    @Test
    public void create_suv_car_manual(){
        Director director = new Director();
        CarManualBuilder builder = new CarManualBuilder();

        Manual expectedSUVCarManual = expectedSUVCarManual();

        director.constructSUV(builder);
        Manual actualCarManual = builder.getProduct();

        assertEquals(expectedSUVCarManual, actualCarManual);
    }


}
