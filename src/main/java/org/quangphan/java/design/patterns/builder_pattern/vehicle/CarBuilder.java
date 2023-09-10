package org.quangphan.java.design.patterns.builder_pattern.vehicle;

public class CarBuilder implements Builder {

    public Car car;

    public CarBuilder() {
        this.car = new Car("Ford");
    }

    @Override
    public void addBrandName() {
        car.add(" Adding the car brand: " + car.brandName);
    }

    @Override
    public void buildBody() {
        car.add(" Making the car body.");
    }

    @Override
    public void insertWheels() {
        car.add(" 4 wheels are added to the car.");
    }

    @Override
    public Vehicle getVehicle() {
        return car;
    }
}
