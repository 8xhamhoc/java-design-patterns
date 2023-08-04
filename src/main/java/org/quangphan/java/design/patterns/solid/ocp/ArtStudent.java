package org.quangphan.java.design.patterns.solid.ocp;

public class ArtStudent extends Student {

    public ArtStudent(String name, String regNumber, double score, String department) {
        super(name, regNumber, score);
        this.setDepartment(department);
    }
}
