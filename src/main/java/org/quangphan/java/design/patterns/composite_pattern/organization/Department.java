package org.quangphan.java.design.patterns.composite_pattern.organization;

import java.util.ArrayList;
import java.util.List;

public class Department implements OrganizationUnit {

    private final String name;

    private final List<OrganizationUnit> units = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void addUnit(OrganizationUnit unit) {
        units.add(unit);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void displayHierarchy(String indent) {
        System.out.println(indent + "Department " + name);
        units.forEach(unit -> unit.displayHierarchy(indent + " "));
    }
}
