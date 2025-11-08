/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
public class question3 {
    public static void main (String[] args){
     
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        
        int arr[] = new int[size];
        
        for (int i=0 ; i<size ; i++){
            System.out.print("Enter element " + (i+1) + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Before Swapping:");
        for (int i=0 ; i<size ; i++){
            System.out.print(arr[i]+"   ");
        }
        int temp = arr[size-1];
        arr[size-1]= arr[0];
        arr[0] = temp;
        
        System.out.println("\nAfter Swapping:");
        for (int i=0 ; i<size ; i++){
            System.out.print(arr[i]+"   ");
        }
        sc.close();
    }
}
