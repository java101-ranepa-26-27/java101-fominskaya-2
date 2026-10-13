package ru.ranepa;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private final String name;
    private final List<Integer> grades = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double average() {
        if (grades.isEmpty()) {
            return 0.0;
        }

        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }

        return (double) sum / grades.size();
    }

    public String status() {
        double average = average();

        if (average >= 4.5) {
            return "отличник";
        } else if (average >= 3.5) {
            return "хорошист";
        } else if (average >= 2.5) {
            return "троечник";
        } else {
            return "двоечник";
        }
    }

    public String report() {
        return "Студент: " + name
                + "\nОценки: " + grades
                + "\nСредний балл: " + average()
                + "\nСтатус: " + status();
    }

    public void printReport() {
        System.out.println(report());
    }
}

