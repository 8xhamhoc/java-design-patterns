package org.quangphan.java.design.patterns.prototype_pattern.statue;

public class Dragon implements Statue {

    private String name;
    private String color;

    public Dragon(String name) {
        this.name = name;
    }

    @Override
    public Statue clone() throws CloneNotSupportedException {
        Dragon dragon = new Dragon(this.name);
        dragon.color = color;
        return dragon;
    }

    @Override
    public void makeColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dragon{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
