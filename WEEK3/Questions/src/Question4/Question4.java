/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question4;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1= scanner.nextInt();
        System.out.print("Enter num2: ");
        int num2= scanner.nextInt();
        System.out.print("Enter num3: ");
        int num3= scanner.nextInt();
        int avg=(num1+num2+num3)/3;
        System.out.println("Average of "+num1+", "+num2+", "+num3+" = "+avg);
        scanner.close();
    }
}
