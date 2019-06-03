package lk.tharindu.student;


import java.time.LocalDate;
import java.util.ArrayList;

import java.util.List;

public class Student {
    private String name;
     LocalDate dateOfBirth;

    public Student(String name, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public static List<Student> getAllStudents(){



        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Tharindu", LocalDate.of(1994,8,27)));
        studentList.add(new Student("Lakshan", LocalDate.of(1993,9,11)));
        studentList.add(new Student("Kasun", LocalDate.of(1999,10,7)));
        studentList.add(new Student("Kalana", LocalDate.of(2003,2,17)));
        studentList.add(new Student("Ruwan", LocalDate.of(2005,5,2)));

        return studentList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}
