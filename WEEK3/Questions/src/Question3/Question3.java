/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question3;

import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Integer:  ");
        int num= scanner.nextInt();
        int cube=num*num*num;
        System.out.println("Cube of "+num+" = "+cube);
        scanner.close();
    }
}
