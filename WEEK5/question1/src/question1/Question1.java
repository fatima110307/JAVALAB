/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Question1;
import java.util.Scanner;
public class Question1 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner (System.in);
       System.out.print("Enter the number of elements to be entered: ");
       int size = scanner.nextInt();
       
       int array [] = new int[size];
       
       for (int i=0 ; i<size ; i++){
           System.out.print("Enter element " + (i+1) + ": ");
           array[i]=scanner.nextInt();
       }
       System.out.println("The elements of the array are:");
       for (int i=0 ; i<size ; i++){
           System.out.print(array[i] + "  ");
           
       }
       scanner.close();
    }
}
