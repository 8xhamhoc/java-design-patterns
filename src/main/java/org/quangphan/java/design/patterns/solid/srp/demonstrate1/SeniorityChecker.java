package org.quangphan.java.design.patterns.solid.srp.demonstrate1;

public class SeniorityChecker {

    public String check(double experienceYear) {
        return experienceYear >= 5 ? "Senior" : "Junior";
    }
}
