/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question4and5;

/**
 *
 * @author Personal
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int Id ;
        double balance , Min_balance , Max_withdrawl_limit;
        String account_holder_name , Address ;
        
        System.out.println("Enter the Details of Saving Account:");
        System.out.print("Enter the Account Id: ");
        Id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the name of account holder: ");
        account_holder_name = sc.nextLine();
        System.out.print("Enter the balance : ");
        balance = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter the Address: ");
        Address = sc.nextLine();
        System.out.print("Enter the minimun Balance to be maintained in a saving account: ");
        Min_balance = sc.nextDouble();
       
        Saving s1 = new Saving(Id , balance , account_holder_name , Address , Min_balance);
        
        System.out.println("Enter the Details of Current Account:");
        System.out.print("Enter the Account Id");
        Id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the name of account holder: ");
        account_holder_name = sc.nextLine();
        System.out.print("Enter the balance : ");
        balance = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter the Address: ");
        Address = sc.nextLine();
        System.out.print("Enter the Maximum withdrawl limit of a Current account : ");
        Max_withdrawl_limit = sc.nextDouble();
        
        Current c1 = new Current (Id , balance , account_holder_name , Address , Max_withdrawl_limit);
        
        int money;
        System.out.println("Enter the amount to be depoisted in the savings account: ");
        money = sc.nextInt();
        s1.Deposit(money);
        s1.DisplayBalance();
        System.out.println("Enter the amount to be depoisted in the Current account: ");
        money = sc.nextInt();
        c1.Deposit(money);
        c1.DisplayBalance();
        System.out.println("Enter the amount to be Withdrwan out of Saving account: ");
        money = sc.nextInt();
        s1.Withdraw(money);
        s1.DisplayBalance();
        System.out.println("Enter the amount to be Withdrawn in the Current account: ");
        money = sc.nextInt();
        c1.Withdraw(money);
        c1.DisplayBalance();
        
        s1.DisplayDetails();
        c1.DisplayDetails();
    }
}
