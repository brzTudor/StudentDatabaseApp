import java.util.Locale;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Student {
    private String name;
    private int year;
    private String studentId;
    private String courses;
    private String balance;
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    public Student(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNumele studentului: ");
        this.name = sc.nextLine();
        System.out.print("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nAnul studentului: ");
        this.year = sc.nextInt();
        setStudentId();
    }

    private void setStudentId(){
        id++;
        this.studentId = year + "" + id;
    }

    public String toString(){
        return "\nNumele studentului: " + name +
                "\nAnul: " + year +
                "\nID: " + studentId +
                "\nInrolat in: " + courses +
                "\nBuget: " + tuitionBalance + " RON";
    }

    public void enroll(){
        do {
            System.out.print("Introduceti cursul studentului (Q pentru a iesi): ");
            Scanner sc = new Scanner(System.in);
            String course = sc.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }
            else {
                break;
            }
        }while (1 != 0);

        System.out.println("Studentul a fost inrolat in: " + courses);
    }

    public void viewBalance(){
        System.out.println("Studentul " + name + " are in cont " + tuitionBalance + " RON");
    }

    public void payTuition(){
        viewBalance();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti suma pe care vreti sa o achitati: ");
        int payment = sc.nextInt();
        if(tuitionBalance > payment) {
            tuitionBalance = tuitionBalance - payment;
            System.out.println("S-a platit suma de " + payment + " RON");
            viewBalance();
        }
        else {
            System.out.println("Fonduri insuficiente");
            System.out.println("Studentul " + name + " are in cont doar " + tuitionBalance + " RON");
        }
    }

}
