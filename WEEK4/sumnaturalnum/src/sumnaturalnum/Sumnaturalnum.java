/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumnaturalnum;
import java.util.Scanner;
public class Sumnaturalnum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = scanner.nextInt();
        int sum=0;
//        int sum = (num*(num+1))/2;
        for (int i =1 ; i<=num ; i++){
            sum= sum+i;
        }
        System.out.println("Sum of Natural number till "+ num +" is "+sum);
        scanner.close();
    }
}
