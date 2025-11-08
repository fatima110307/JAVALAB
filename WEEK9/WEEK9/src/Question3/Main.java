/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question3;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Id: ");
        int id = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Enter Account holder name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter Address: ");
        String address = sc.nextLine();
        
        Account a1 = new Account (id , name , address );
        
        a1.DisplayDetails();
        a1.Deposit();
        a1.Withdraw();
        
        System.out.print("Enter Principle amount: ");
        double p = sc.nextInt();
        System.out.print("Enter Rate of Interest: ");
        double r = sc.nextInt();
        System.out.print("Enter Time: ");
        int t = sc.nextInt();
        
        a1.SimpleInterest( p , r , t);
        a1.CompoundInterest (p , r , t);
        
    }
}
