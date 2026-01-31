package org.example;

public class Main {
    static void main() {
//        "Сотрудник: " + name + ". Зарплата + бонус: " + salary + bonus
        Employee[] employees = new Employee[] {
          new Developer("Islam", 1000, 200),
          new Manager("Erbol", 1500, 0.2),
          new Intern("Altynai", 800)
        };
        double total = 0;
      for (Employee e : employees){
          double currentSalary = e.getSalary();
          System.out.println(e.name + ": " + currentSalary);
          total += currentSalary;
      }
        System.out.println("Общая зарплата всех сотрудников: " + total);
   }
}
