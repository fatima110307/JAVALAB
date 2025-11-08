/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Question1;

import java.util.Scanner;
public class Question1 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1= scanner.nextInt() ;
        System.out.print("Enter num2: ");
        int num2= scanner.nextInt() ;
        int sum= num1+num2 ;
        System.out.println(num1+" + "+num2+"= "+sum);
        scanner.close();
    }
    
}
