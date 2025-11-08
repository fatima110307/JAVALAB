/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question10;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter the radius of circle: ");
        double radius = scanner.nextDouble();
        double circumference= 2* Math.PI * radius;
        System.out.println("Circumference = " + circumference);
        scanner.close();
    }
}
