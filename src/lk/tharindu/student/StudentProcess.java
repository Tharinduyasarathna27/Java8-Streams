package lk.tharindu.student;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class StudentProcess {
    public static void main(String[] args) {



        List<Student> studentList= Student.getAllStudents().stream()
                .filter(student -> (LocalDate.now().getYear()-student.getDateOfBirth().getYear())>18)
                .collect(Collectors.toList());

        System.out.println(studentList);
    }
}
