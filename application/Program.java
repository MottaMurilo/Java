package application;

import java.util.Scanner;
import entities.Student;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        student.grade1 = sc.nextDouble();
        student.grade2 = sc.nextDouble();
        student.grade3 = sc.nextDouble();
        System.out.printf(student.AprovedOrReproved());
        sc.close();
    }
}   