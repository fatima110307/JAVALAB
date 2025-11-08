/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question8;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter temprature in Celsius: ");
        double cel = scanner.nextDouble();
        double fer = (cel*1.8)+32;
        System.out.println(cel+" C in Fahrenheit = "+ fer + " F");
        scanner.close();
    }
}
