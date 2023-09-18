package org.quangphan.java.design.patterns.singleton_pattern.eager;

public class Captain {

    private static final Captain INSTANCE = new Captain();

    private Captain() {
        System.out.println("Caption initialization");
    }

    public static Captain getCaptain() {
        return INSTANCE;
    }
}
