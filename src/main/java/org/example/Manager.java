package org.example;

public class Manager extends Employee{
    double percent;

    public Manager(String name, double salary, double percent) {
        super(name, salary);
        this.percent = percent;
    }

    @Override
    double getSalary() {
        return salary + percent;
    }
}
