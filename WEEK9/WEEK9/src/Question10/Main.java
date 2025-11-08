/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question10;

/**
 *
 * @author Personal
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        Student student1 = new Student();
        Student student2 = new Student();
        
        int rollNo , marks;
        String name , SchoolName ; 
        
        System.out.print("Enter the name of Student1: ");
        name = sc.nextLine();
        System.out.print("Enter the roll No of Student1: ");
        rollNo = sc.nextInt();
        System.out.print("Enter the marks of Student1: ");
        marks = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the School name of Student1 : ");
        SchoolName = sc.nextLine();
        
        student1.setdetails(rollNo, name, marks, SchoolName);
        System.out.println("Details of student 1 :");
        student1.showDetails();
        
        System.out.print("Enter the name of Student2: ");
        name = sc.nextLine();
        System.out.print("Enter the roll No of Student2: ");
        rollNo = sc.nextInt();
        System.out.print("Enter the marks of Student2: ");
        marks = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the School name of Student2 : ");
        SchoolName = sc.nextLine();
        
        student2.setdetails(rollNo, name, marks, SchoolName);
        System.out.println("Details of student 2 :");
        student2.showDetails();
        
        System.out.print("Enter the Updated School name of studen 1 : ");
        SchoolName = sc.nextLine();
        
        student1.changeSchoolName(SchoolName);
        System.out.println("Details of student 1 :");
        student1.showDetails();
        
        System.out.println("Details of student 2 :");
        student2.showDetails();
        sc.close();
    }
}
