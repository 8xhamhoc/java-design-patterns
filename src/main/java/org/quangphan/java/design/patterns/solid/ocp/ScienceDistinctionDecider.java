package org.quangphan.java.design.patterns.solid.ocp;

public class ScienceDistinctionDecider implements DistinctionDecider {

    @Override
    public void evaluateDistinction(Student student) {
        if (student.getScore() > 80) {
            System.out.println(student.getRegNumber() + " has received a distinction in science.");
        }
    }
}
