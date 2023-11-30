package Lyambda_expressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class Employee {
    String name;
    String department;
    double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

class TestEmployee {
    void printEmployee(Employee emp) {
        System.out.println("Имя работника: " + emp.name
                + " департамент: " + emp.department
                + " зарплата: " + emp.salary);
    }

    void filtraciyaRabotnikov(ArrayList<Employee> list, Predicate<Employee> p) {
        for (Employee e : list) {
            if (p.test(e)) {
                printEmployee(e);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee("Ivan", "IT", 250);
        Employee emp2 = new Employee("Evgeniy", "IT", 320);
        Employee emp3 = new Employee("Anatoliy", "Finance", 180);
        Employee emp4 = new Employee("Evlapiy", "IT", 422);
        Employee emp5 = new Employee("Arkadiy", "HR", 650);
        Employee emp6 = new Employee("IT", "IT", 1000);
        Collections.addAll(list, emp1, emp2, emp3, emp4, emp5, emp6);
        TestEmployee te = new TestEmployee();
        te.filtraciyaRabotnikov(list, emp -> emp.department == "IT" && emp.salary > 200);
        System.out.println("---");
        te.filtraciyaRabotnikov(list, emp -> emp.name.startsWith("E") && emp.salary != 450);
        System.out.println("---");
        te.filtraciyaRabotnikov(list, emp -> emp.name.equals(emp.department));

    }
}
