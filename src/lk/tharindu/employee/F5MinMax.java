package lk.tharindu.employee;

import java.util.Comparator;
import java.util.Optional;

public class F5MinMax
{
    public static void main(String[] args) {
        Optional<Employee> optionalEmployee=Employee.getAllEmployees().stream()
                .min(Comparator.comparing(Employee::getMarks));

        System.out.println(optionalEmployee);

        Optional<Employee> optionalEmployee2=Employee.getAllEmployees().stream()
                .max(Comparator.comparing(Employee::getMarks));

        System.out.println(optionalEmployee2);
    }
}
