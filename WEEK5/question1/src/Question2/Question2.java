/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question2;

import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements to be entered: ");
        int size = scanner.nextInt();
        int sum=0;
        
        int array[] = new int[size];
        for (int i=0 ; i<size ; i++){
            System.out.print("Enter the element "+ (i+1) +" : ");
            array[i] = scanner.nextInt();
            sum+= array[i];
        }
        
        System.out.println("Sum of all the elemennts of the array = " + sum );
        scanner.close();
    }  
}
