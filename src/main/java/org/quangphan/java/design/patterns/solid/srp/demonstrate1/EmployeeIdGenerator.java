package org.quangphan.java.design.patterns.solid.srp.demonstrate1;

import java.util.Random;

public class EmployeeIdGenerator {

    public String generate(String firstName) {
        int random = new Random().nextInt(1000);
        return firstName.substring(0, 1) + random;
    }
}
