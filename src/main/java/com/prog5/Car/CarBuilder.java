package com.prog5.Car;

import com.prog5.Builder;
import com.prog5.Car.Engine.Engine;

public class CarBuilder implements Builder {
    private Car car;

    public CarBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.car = new Car();
    }

    @Override
    public void setSeats(int seats) {
        this.car.setSeats(seats);
    }

    @Override
    public void setEngine(Engine engine) {
        this.car.setEngine(engine);
    }

    @Override
    public void setTripComputer(boolean hasTripComputer) {
        this.car.setTripComputer(hasTripComputer);
    }

    @Override
    public void setGPS(boolean hasGPS) {
        this.car.setGPS(hasGPS);
    }

    public Car getProduct(){
        Car product = this.car;
        this.reset();
        return product;
    }
}
