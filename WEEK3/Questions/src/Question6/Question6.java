/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question6;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter num1: ");
        int num1= scanner.nextInt();
        System.out.print("Enter num2: ");
        int num2= scanner.nextInt();
        System.out.println("Before swaping:\nnum1= "+ num1 +" num2= "+num2);
        int temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("After swaping:\nnum1= "+ num1 +" num2= "+num2);
        scanner.close();
    }
}
