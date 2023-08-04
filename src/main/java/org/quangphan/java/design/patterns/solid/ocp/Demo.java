package org.quangphan.java.design.patterns.solid.ocp;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {

        List<Student> scienceStudents = enrollScienceStudents();
        List<Student> artsStudents = enrollArtsStudents();

        System.out.println("===Results:===");

        scienceStudents.forEach(System.out::println);
        artsStudents.forEach(System.out::println);

        DistinctionDecider scienceDistinctionDecider = new ScienceDistinctionDecider();
        DistinctionDecider artsDistinctionDecider = new ArtsDistinctionDecider();

        scienceStudents.forEach(scienceDistinctionDecider::evaluateDistinction);
        artsStudents.forEach(artsDistinctionDecider::evaluateDistinction);
    }

    private static List<Student> enrollScienceStudents() {
        Student sam = new ScienceStudent("Sam", "R1", 81.5, "Comp.Sc.");
        Student bob = new ScienceStudent("Bob", "R2", 72, "Physics");
        List<Student> scienceStudents = new ArrayList<>();
        scienceStudents.add(sam);
        scienceStudents.add(bob);
        return scienceStudents;
    }

    private static List<Student> enrollArtsStudents() {
        Student john = new ArtStudent("John", "R3", 71, "History");
        Student kate = new ArtStudent("Kate", "R4", 66.5, "English");
        List<Student> artsStudents = new ArrayList<Student>();
        artsStudents.add(john);
        artsStudents.add(kate);
        return artsStudents;
    }

}
