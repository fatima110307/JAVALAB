/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question5;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
         Scanner scanner= new Scanner(System.in);
        System.out.print("Enter X1: ");
        double x1= scanner.nextDouble();
        System.out.print("Enter X2: ");
        double x2= scanner.nextDouble();
        System.out.print("Enter Y1: ");
        double y1= scanner.nextDouble();
        System.out.print("Enter Y2: ");
        double y2= scanner.nextDouble();
        double distance = Math.sqrt((Math.pow((x1-x2), 2)+ Math.pow((y1-y2),2)));
        System.out.println("Distance Betwwen ( "+ x1+" , "+x2+") and ( "+y1+", " +y2+") ="+ distance);
        scanner.close();
    }
}
