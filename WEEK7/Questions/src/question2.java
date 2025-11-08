/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class question2 {
    
    public static void bubble_sort(int arr[]){
        
        for (int i=0 ; i<arr.length ; i++){
            
            for (int j=i+1 ; j<arr.length ; j++){
                
                if (arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                
            }
        }
        
    }
    
    public static void main (String[] args){
        Scanner sc= new Scanner (System.in);
        
        System.out.print("Enter the length of array: ");
        int len = sc.nextInt();
        
        int arr[] = new int[len];
        for (int i=0 ; i<len ; i++){
            System.out.print("Enter element " + (i+1) + " : ");
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Contents of array:");
        for (int i=0 ; i<len ; i++){
            System.out.print(arr[i] + "  ");
        }
        
        bubble_sort(arr);
        System.out.println("\nSorted array:");
        for (int i=0 ; i<len ; i++){
            System.out.print(arr[i] + "  ");
        }
        sc.close();
    }
}
