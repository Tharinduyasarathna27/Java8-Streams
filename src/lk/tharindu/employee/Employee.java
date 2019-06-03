package lk.tharindu.employee;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private String name;
    private Integer marks;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, Integer marks) {
        this.name = name;
        this.marks = marks;
    }

    public  String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }

    public static List<Employee> getAllEmployees(){
        List<Employee> employees =new ArrayList<>();
        employees.add(new Employee("Tharindu",90));
        employees.add(new Employee("Lakshan",95));
        employees.add(new Employee("Kasun",56));
        employees.add(new Employee("Amal",75));
        employees.add(new Employee("Kamal",40));
        employees.add(new Employee("Nimal",26));
        employees.add(new Employee("Sunil",62));
        employees.add(new Employee("Vinil",38));

        return employees;
    }

    public Employee(Integer marks) {
        this.marks = marks;
    }



    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
