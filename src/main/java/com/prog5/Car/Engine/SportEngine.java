package com.prog5.Car.Engine;

import java.util.Objects;

public class SportEngine implements Engine {
    @Override
    public String engineType() {
        return "Sport engine";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        return o != null && getClass() == o.getClass();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }
}
