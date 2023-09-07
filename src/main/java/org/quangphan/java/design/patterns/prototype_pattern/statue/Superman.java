package org.quangphan.java.design.patterns.prototype_pattern.statue;

public class Superman implements Statue {

    private String name;
    private String color;

    public Superman(String name) {
        this.name = name;
    }

    @Override
    public Statue clone() throws CloneNotSupportedException {
        Superman superman = new Superman(this.name);
        superman.color = this.color;
        return superman;
    }

    @Override
    public void makeColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Superman{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
