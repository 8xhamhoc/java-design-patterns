package org.quangphan.java.design.patterns.solid.srp.demonstrate1;

public class Demo {

    public static void main(String[] args) {
        Employee employee = new Employee("Quang", "Phan", 9);

        EmployeeIdGenerator employeeIdGenerator = new EmployeeIdGenerator();
        String empId = employeeIdGenerator.generate(employee.getFirstName());

        employee.displayDetails();
        System.out.println("Employee id: " + empId);

        SeniorityChecker seniorityChecker = new SeniorityChecker();
        System.out.println("Level: " + seniorityChecker.check(employee.getExperienceInYears()));
    }
}
