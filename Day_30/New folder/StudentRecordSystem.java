import java.util.Scanner;

class Student {
    String name;
    int rollNo;
    String course;
}

public class StudentRecordSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            students[i] = new Student();
            System.out.println("Enter details for student " + (i+1));
            System.out.print("Name: ");
            students[i].name = sc.nextLine();
            System.out.print("Roll No: ");
            students[i].rollNo = sc.nextInt();
            sc.nextLine();
            System.out.print("Course: ");
            students[i].course = sc.nextLine();
        }

        System.out.println("\n--- Student Records ---");
        for (Student s : students) {
            System.out.println("Roll: " + s.rollNo + ", Name: " + s.name + ", Course: " + s.course);
        }
    }
}