/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question7;

/**
 *
 * @author Personal
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        Manager m1 = new Manager();
        
        System.out.print("Enter the name of Manager: ");
        m1.name = sc.nextLine();
      
        System.out.print("Enter the Department of Manager :");
        m1.department = sc.nextLine();
        
        System.out.print("Enter the salary of Manager: ");
        m1.salary = sc.nextDouble();
        
        m1.Showdetails();
        
        sc.close();
         
    }
}
