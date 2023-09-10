package org.quangphan.java.design.patterns.builder_pattern.vehicle;

public interface Builder {

    void addBrandName();
    void buildBody();
    void insertWheels();
    Vehicle getVehicle();
}
