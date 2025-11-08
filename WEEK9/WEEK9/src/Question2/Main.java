/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        
        System.out.print("Enter University name: ");
        String Uni_name  = sc.nextLine();
        
        System.out.print("Enter the ranking: ");
        int ranking = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Enter Faculty name: ");
        String Faculty_name = sc.nextLine();    
        
        System.out.print("Enter the Department name: ");
        String Department_name = sc.nextLine();
        
        System.out.print("Enter the Chairperson name: ");
        String Chairperson = sc.nextLine();
        
        
        
        Department d = new Department ( Uni_name , Faculty_name , ranking , Department_name , Chairperson  );
        d.Details();
        d.Display();
    }
}
