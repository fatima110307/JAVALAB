/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question9;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter Int1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter Int2: ");
        int num2 = scanner.nextInt();
        double quo = num1/ num2;
        double rem = num1% num2;
        System.out.println("Quoteint = " + quo + "\nRemainder = " + rem);
        scanner.close();
    }
}
