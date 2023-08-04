package org.quangphan.java.design.patterns.solid.ocp;

public class ScienceStudent extends Student {

    public ScienceStudent(String name, String regNumber, double score, String department) {
        super(name, regNumber, score);
        this.setDepartment(department);
    }
}
