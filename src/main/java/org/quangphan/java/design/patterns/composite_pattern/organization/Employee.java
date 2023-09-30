package org.quangphan.java.design.patterns.composite_pattern.organization;

public class Employee implements OrganizationUnit {

    private String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void displayHierarchy(String indent) {
        System.out.println(indent + "Employee" + name);
    }
}
