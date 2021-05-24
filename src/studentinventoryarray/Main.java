package studentinventoryarray;

import java.util.Scanner;

public class Main {
    static final int STUDENT_COUNT = 2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[STUDENT_COUNT];
        for (int i = 0; i < STUDENT_COUNT; i++) {
            students[i]= new Student();
            System.out.println("Enter name: ");
            String name = sc.nextLine();
            students[i].setName(name);
            System.out.println("Enter Address: ");
            String address = sc.nextLine();
            students[i].setAddress(address);
            System.out.println("Enter Age: ");
            int age = sc.nextInt();
            students[i].setAge(age);
           // students[i]= new Student(name,address,age);
            sc.nextLine();
        }
        System.out.println("Enter which student to print");
        int selectedStudent = sc.nextInt();
        System.out.println("Name: " + students[selectedStudent].getName()
                + "\nAddress: " + students[selectedStudent].getAddress()
                + "\nAge: " + students[selectedStudent].getAge());

        // write your code here
      /*  String[] name = new String[STUDENT_COUNT];
        String[] address = new String[STUDENT_COUNT];
        int[] age = new int[STUDENT_COUNT];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < STUDENT_COUNT; i++) {
            System.out.println("Enter name: ");
            name[i] = sc.nextLine();
            System.out.println("Enter Address: ");
            address[i] = sc.nextLine();
            System.out.println("Enter Age: ");
            age[i] = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("Enter which student to print");
        int selectedStudent = sc.nextInt();
        System.out.println("Name: " + name[selectedStudent] + "\nAddress: " + address[selectedStudent] + "\nAge: " + age[selectedStudent]);
      *//*  for(int i=0;i<STUDENT_COUNT;i++){
            System.out.println("Name: "+name[i]+"\nAddress: "+address[i]+"\nAge: "+age[i]);
        }*/
    }
}
