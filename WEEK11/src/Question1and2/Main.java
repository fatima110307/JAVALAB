/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question1and2;

/**
 *
 * @author Personal
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the name of the Bank:");
        String bank = sc.nextLine();
        System.out.print("Enter the name of the Bank Manager: ");
        String Manager = sc.nextLine();
        
        Account.abountBank(bank, Manager);
        
        Saving s1 = new Saving();
        Current c1 = new Current();
        
        s1.deposit();
        s1.withdraw();
        s1.takeLoan();
        c1.deposit();
        c1.withdraw();
        
        sc.close();
    }
}
