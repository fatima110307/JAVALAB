/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question5;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter a number: ");
        
        int num = scanner.nextInt();
        int sum = 0 , temp = num;
        
        while (num != 0){
            sum = sum + (num%10);
            num = num/10;
        }
        System.out.println("The sum of the digits of " + temp + " = " + sum);
        scanner.close();
    }  
}
