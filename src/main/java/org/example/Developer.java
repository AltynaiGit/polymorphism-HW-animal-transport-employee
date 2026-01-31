package org.example;

public class Developer extends Employee{
    double bonus;

    public Developer(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    double getSalary() {
        return salary + bonus;
    }
}
