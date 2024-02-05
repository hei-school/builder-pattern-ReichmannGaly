package com.prog5.Car;

import com.prog5.Car.Engine.Engine;

import java.util.Objects;

public class Car {
    private int seats;
    private Engine engine;
    private boolean tripComputer;
    private boolean GPS;

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public boolean isTripComputer() {
        return tripComputer;
    }

    public void setTripComputer(boolean tripComputer) {
        this.tripComputer = tripComputer;
    }

    public boolean isGPS() {
        return GPS;
    }

    public void setGPS(boolean GPS) {
        this.GPS = GPS;
    }

    @Override
    public String toString() {
        return "Car{" +
                "seats=" + seats +
                ", engine=" + engine +
                ", tripComputer=" + tripComputer +
                ", GPS=" + GPS +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return seats == car.seats && tripComputer == car.tripComputer && GPS == car.GPS && Objects.equals(engine, car.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(seats, engine, tripComputer, GPS);
    }
}
