package lk.tharindu.employee;

import java.util.List;
import java.util.stream.Collectors;

public class F3FiltureProcess {

    public static void main(String[] args) {
        List<Employee> employeeList =Employee.getAllEmployees().stream()
                .filter(employee -> employee.getName().contains("i"))
                .map(employee -> new Employee(employee.getName(),employee.getMarks()*3))
                .collect(Collectors.toList());




        System.out.println(employeeList);
    }



}
