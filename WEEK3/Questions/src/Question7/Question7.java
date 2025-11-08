/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question7;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner (System.in);
        System.out.print("Enter length of rectangle: ");
        double length= scanner.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        double breadth= scanner.nextDouble();
        double area= length*breadth;
        System.out.println("Area= "+area+ " cm^2");
        scanner.close();
    }
}
