package com.prog5;

import com.prog5.Car.Car;
import com.prog5.Car.CarBuilder;
import com.prog5.Car.Engine.SUVEngine;
import com.prog5.Car.Engine.SportEngine;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {
    Car expectedSportCar(){
        Car sportCar = new Car();
        sportCar.setSeats(2);
        sportCar.setEngine(new SportEngine());
        sportCar.setTripComputer(true);
        sportCar.setGPS(true);

        return sportCar;
    }

    Car expectedSUVCar(){
        Car SUVCar = new Car();
        SUVCar.setSeats(8);
        SUVCar.setEngine(new SUVEngine());
        SUVCar.setTripComputer(true);
        SUVCar.setGPS(true);

        return SUVCar;
    }

    @Test
    public void create_sport_car(){
        Director director = new Director();
        CarBuilder builder = new CarBuilder();

        Car expectedSportCar = expectedSportCar();

        director.constructSportsCar(builder);
        Car actualSportCar = builder.getProduct();

        assertEquals(expectedSportCar, actualSportCar);
    }

    @Test
    public void create_suv_car(){
        Director director = new Director();
        CarBuilder builder = new CarBuilder();

        Car expectedSUVCar = expectedSUVCar();

        director.constructSUV(builder);
        Car actualSUVCar = builder.getProduct();

        assertEquals(expectedSUVCar, actualSUVCar);
    }
}
