package org.quangphan.java.design.patterns.prototype_pattern.statue;

public class ClientDemo {

    public static void main(String[] args) throws CloneNotSupportedException {

        Statue basicDragon = new Dragon("Dragon 1");
        basicDragon.makeColor("Yellow");

        System.out.println("Dragon basic: " + basicDragon);

        Statue copiedDragon = basicDragon.clone();

        System.out.println("Copied dragon: " + copiedDragon);
        copiedDragon.makeColor("Green");
        System.out.println("Copied dragon: " + copiedDragon);

    }
}
