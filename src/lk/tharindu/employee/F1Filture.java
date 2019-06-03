package lk.tharindu.employee;

import java.util.List;
import java.util.stream.Collectors;

public class F1Filture {

    public static void main(String[] args) {


       // List<Employee> employees =Employee.getAllEmployees();


//        List<Employee> employeeList = employees.stream().filter(employee -> employee.getName().contains("i"))
//                .collect(Collectors.toList());

        List<Employee> employeeList = Employee.getAllEmployees().stream().filter(employee -> employee.getName().length()>5)
                .collect(Collectors.toList());
        System.out.println(employeeList);
    }
}
