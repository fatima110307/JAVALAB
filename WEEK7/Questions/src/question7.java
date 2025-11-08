/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Personal
 */
import java.util.Scanner;
public class question7 {
    
     public static int GCD_recursion (int num1 , int num2){
         if (num2%num1== 0)
             return num2;
         return GCD( num2 , (num2%num1));
    }    
     
     public static int GCD (int num1 , int num2 ){
        int rem = num1%num2;
        while (rem!= 0){
            num1= num2;
            num2 = rem;
            rem = num1%num2; 
        }
        return num2;
    }
    
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int choice = 0 ;
        do {
        System.out.print("MENU\n1.GCD with recursion\n2.GCD without recursion\n3.Exit\nEnter your choice:"); 
        choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.print("Enter num1: ");
                int num1=sc.nextInt();
                System.out.print("Enter num2: ");
                int num2 = sc.nextInt();
                int gcd = GCD_recursion (num1 , num2);
                System.out.println("GCD = " + gcd );
                break;
            case 2:
                System.out.print("Enter num1: ");
                int num3=sc.nextInt();
                System.out.print("Enter num2: ");
                int num4 = sc.nextInt();
                int gc_d = GCD(num3 , num4);
                System.out.println("GCD = " + gc_d );
                break;

        }
            
        }
        while(choice!=3);
    }
}
