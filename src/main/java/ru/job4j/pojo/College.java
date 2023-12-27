package ru.job4j.pojo;

import java.time.LocalDate;
import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setId("Petr Ivanov");
        student.setGroup(5);
        student.setAdmission(new Date());
        System.out.println("Student " + student.getId() + System.lineSeparator()
                + "Group " + student.getGroup() + System.lineSeparator()
                + "Date of admission " + student.getAdmission());
    }
}
