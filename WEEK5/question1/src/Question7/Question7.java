/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question7;

import java.util.Scanner;

public class Question7 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter the number of elements to be entered: ");
        int size = scanner.nextInt();
        
        int array[] = new int[size];
        
        for (int i = 0 ; i<size ; i++ ){
            System.out.print("Enter element " + (i+1) + " : ");
            array[i] = scanner.nextInt();
        }
        
        int largest = array[0];
        
        for (int i = 1 ; i<size ; i++){
            if (array[i] > largest)
                largest = array[i];
        }
        System.out.println("Largest element of array = " + largest);
        scanner.close();
    }
}
