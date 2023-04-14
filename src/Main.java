/*
    Ask the user how many students will enroll
    Students should have a unique 5 digit ID, first number is their year
    Students can enroll in : Math, History, English, Chemistry, Programming
    Each course costs 600 RON
    Student can check his balance and pay
 */


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nCati studenti doresc sa se inregistreze?\nIntroduceti numarul: ");
        Scanner sc = new Scanner(System.in);
        int nrStudenti = sc.nextInt();
        Student[] students = new Student[nrStudenti];

        for(int i=0; i<nrStudenti; i++){
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
        }

        System.out.println(students[0].toString());
        System.out.println(students[1].toString());
        System.out.println(students[2].toString());
    }
}
