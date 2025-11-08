/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question6;

/**
 *
 * @author Personal
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        String Department_name , Faculty_name , University_name , chairperson;
        int ranking;
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter the University Name: ");
        University_name = sc.nextLine();
        System.out.println("Enter the ranking: ");
        ranking = sc.nextInt();
        
       sc.nextLine();
       
        System.out.print("Enter the Faculty name: ");
        Faculty_name = sc.nextLine();
        System.out.print("Enter the Department name: ");
        Department_name = sc.nextLine();
        System.out.print("Enter the Chairperson name: ");
        chairperson = sc.nextLine();
        
        Department d1 = new Department (University_name , ranking , Faculty_name , Department_name , chairperson);
        d1.display();
        sc.close();
    }
}
