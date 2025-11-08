/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class question5 {
    public static int factorial(int num){
        if (num==0)
            return 1;
        return num*factorial(num-1);
    }
    
    public static void main (String[] args){
        
        Scanner sc= new Scanner (System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int fact = factorial(num);
        
        System.out.println("Factorial of " + num + " is " + fact);
    }
            
}
