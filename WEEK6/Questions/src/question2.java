/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
public class question2 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean isPrime = true;
        
        for (int i = 2 ; i<=Math.sqrt(num) ; i++){
            if (num%i == 0){
                isPrime = false;
                break;
            }
        }
        if (isPrime)
            System.out.println( num + " Is Prime");
        else 
            System.out.println( num + " Is NOTPrime");
        sc.close();
    }          
}
