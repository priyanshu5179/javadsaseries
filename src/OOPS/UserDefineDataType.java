package OOPS;

import java.util.Scanner;

public class UserDefineDataType {

    static class Students {

        // Attributes
        int id;
        int age;
        String name;
        int nos;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Students student1 = new Students();

        student1.id = 101;
        student1.age = 20;
        student1.name = "Priyanshu";
        student1.nos = 5;

        Students student2 = new Students();

        student2.id = 11;

        System.out.print("Enter student age: ");
        student2.age = sc.nextInt();

        student2.name = "Himanshu";
        student2.nos = 50;

        System.out.println("Student name: " + student2.name);
        System.out.println("Student age: " + student2.age);
    }
}