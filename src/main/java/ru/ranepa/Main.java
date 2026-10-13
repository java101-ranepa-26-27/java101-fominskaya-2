package ru.ranepa;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);

        System.out.println("Введите имя студента:");
        String name = scanner.nextLine();

        Student student = new Student(name);

        System.out.println("Введите оценки (2–5), 0 — закончить:");

        while (scanner.hasNextInt()) {
            int grade = scanner.nextInt();

            if (grade == 0) {
                break;
            }

            student.addGrade(grade);
        }

        student.printReport();
    }
}