package org.quangphan.java.design.patterns.composite_pattern.organization;

public class ClientDemo {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Trinh");
        Employee employee2 = new Employee("Quang");

        Department department = new Department("Backoffice");
        department.addUnit(employee1);
        department.addUnit(employee2);

        Employee employee3 = new Employee("Unknown");
        Employee employee4 = new Employee("Unknown");

        Department internship = new Department("Internship");
        internship.addUnit(employee3);
        internship.addUnit(employee4);

        Department company = new Department("Company");
        company.addUnit(department);
        company.addUnit(internship);

        company.displayHierarchy("  ");
    }
}
