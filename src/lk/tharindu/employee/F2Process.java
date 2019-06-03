package lk.tharindu.employee;

import java.util.List;
import java.util.stream.Collectors;

public class F2Process {
    public static void main(String[] args) {

        // marks multiply by 2
        List<Employee> employees=Employee.getAllEmployees().stream()
                .map(employee -> new Employee(employee.getName(),employee.getMarks()*3)).collect(Collectors.toList());

        System.out.println(employees);


    }
}
