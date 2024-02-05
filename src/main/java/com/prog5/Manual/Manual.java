package com.prog5.Manual;

import com.prog5.Car.Engine.Engine;

import java.util.Objects;

public class Manual {
    private int carSeats;
    private Engine engine;
    private boolean tripComputer;
    private boolean GPS;

    public int getCarSeats() {
        return carSeats;
    }

    public void setCarSeats(int carSeats) {
        this.carSeats = carSeats;
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
        return "Manual{" +
                "carSeats=" + carSeats +
                ", engine=" + engine +
                ", tripComputer=" + tripComputer +
                ", GPS=" + GPS +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manual manual = (Manual) o;
        return carSeats == manual.carSeats && tripComputer == manual.tripComputer && GPS == manual.GPS && Objects.equals(engine, manual.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carSeats, engine, tripComputer, GPS);
    }
}
