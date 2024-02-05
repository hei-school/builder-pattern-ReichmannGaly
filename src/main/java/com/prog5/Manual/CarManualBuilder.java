package com.prog5.Manual;

import com.prog5.Builder;
import com.prog5.Car.Engine.Engine;

public class CarManualBuilder implements Builder {
    private Manual manual;

    public CarManualBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.manual = new Manual();
    }

    @Override
    public void setSeats(int seats) {
        this.manual.setCarSeats(seats);
    }

    @Override
    public void setEngine(Engine engine) {
        this.manual.setEngine(engine);
    }

    @Override
    public void setTripComputer(boolean hasTripComputer) {
        this.manual.setTripComputer(hasTripComputer);
    }

    @Override
    public void setGPS(boolean hasGPS) {
        this.manual.setGPS(hasGPS);
    }

    public Manual getProduct(){
        Manual product = this.manual;
        this.reset();
        return product;
    }
}
