package org.quangphan.java.design.patterns.builder_pattern.vehicle;

public class MotorCycleDirector extends Director {

    @Override
    public Vehicle instruct(Builder builder) {
        builder.addBrandName();
        builder.buildBody();
        builder.insertWheels();
        return builder.getVehicle();
    }
}
