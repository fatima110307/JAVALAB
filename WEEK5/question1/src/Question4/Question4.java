/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question4;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        double sum = 0;
        for (double i =1 ; i<=num ; i++){
            sum += (1/i);
        }
        System.out.println("The sum of Harmonic series upto " + num + " is " + sum);
        scanner.close();
    }
}
