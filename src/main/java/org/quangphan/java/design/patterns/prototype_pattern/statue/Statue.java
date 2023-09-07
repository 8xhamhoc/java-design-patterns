package org.quangphan.java.design.patterns.prototype_pattern.statue;

public interface Statue {

    Statue clone() throws CloneNotSupportedException;

    void makeColor(String color);
}
