package org.example;

public class Intern extends Employee{

    public Intern(String name, double salary) {
        super(name, salary);
    }

    @Override
    double getSalary() {
        return salary;
    }
}
