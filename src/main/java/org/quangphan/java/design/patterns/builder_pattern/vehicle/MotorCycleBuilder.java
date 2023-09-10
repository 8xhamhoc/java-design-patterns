package org.quangphan.java.design.patterns.builder_pattern.vehicle;

public class MotorCycleBuilder implements Builder {

    private MotorCycle motorCycle;

    public MotorCycleBuilder() {
        this.motorCycle = new MotorCycle("Honda");
    }

    @Override
    public void addBrandName() {
        motorCycle.add(" Adding the brand name: " +
                motorCycle.brandName);
    }

    @Override
    public void buildBody() {
        motorCycle.add(" Making the body of the motorcycle.");
    }

    @Override
    public void insertWheels() {
        motorCycle.add(" 2 wheels are added to the motorcycle.");
    }

    @Override
    public Vehicle getVehicle() {
        return motorCycle;
    }
}
