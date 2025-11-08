/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplicationtable;
import java.util.Scanner;
public class Multiplicationtable {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter a number: ");
       int num = scanner.nextInt();
       System.out.println("Multiplication table of " +num+" is");
       for (int i=0 ; i<=10 ;i++){
           System.out.println(num +" * " +i +" = "+(num*i));
       }
       scanner.close();
    }
}
