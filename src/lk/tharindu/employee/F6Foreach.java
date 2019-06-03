package lk.tharindu.employee;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class F6Foreach {
    public static void main(String[] args) {

//
//        Employee.getAllEmployees().forEach(employee ->
//                System.out.println(employee.getName()));

        Employee.getAllEmployees().stream()
                .filter(employee -> employee.getName().length()>=5)
                .map(employee -> new Employee(employee.getName().toUpperCase(),employee.getMarks()))
                .sorted(Comparator.comparing(Employee::getName))
                .forEach(System.out::println);
    }
}
