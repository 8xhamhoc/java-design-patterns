package org.quangphan.java.design.patterns.solid.ocp;

public class ArtsDistinctionDecider implements DistinctionDecider {

    @Override
    public void evaluateDistinction(Student student) {
        if (student.getScore() > 70) {
            System.out.println(student.getRegNumber() + " has received a distinction in arts.");
        }
    }
}
