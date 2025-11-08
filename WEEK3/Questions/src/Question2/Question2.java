/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question2;

import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner (System.in);
        System.out.print("Enter a float1: ");
        double num1= scanner.nextDouble();
        System.out.print("Enter a float2: ");
        double num2= scanner.nextDouble();
        double mul = num1*num2;
        System.out.println(num1+" * "+num2+" = "+mul);
        scanner.close();
    }
}
