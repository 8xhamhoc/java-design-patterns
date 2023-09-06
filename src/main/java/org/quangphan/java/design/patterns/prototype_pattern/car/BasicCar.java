package org.quangphan.java.design.patterns.prototype_pattern.car;

public abstract class BasicCar implements Cloneable {

    public String modelName;
    public int basePrice = 0, onRoadPrice = 0;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public BasicCar clone() throws CloneNotSupportedException {
        return (BasicCar) super.clone();
    }
}
