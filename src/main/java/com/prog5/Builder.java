package com.prog5;

import com.prog5.Car.Engine.Engine;

public interface Builder {
    void reset();
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTripComputer(boolean hasTripComputer);
    void setGPS(boolean hasGPS);
}
