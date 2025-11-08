/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Personal
 */
import java.util.Scanner;
public class question10 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int len = scanner.nextInt();
        
        int arr[] = new int[len];
        
        for (int i=0 ; i<len ; i++){
            System.out.print("Enter element " + (i+1) + " : ");
            arr[i] = scanner.nextInt();
        }
        
        System.out.print("Array elements before reversal:\n");
        for (int i=0 ; i<len ; i++){
            System.out.print(arr[i]+"  ");
        }
        
        for (int i=0 ; i<len/2 ; i++){
            int temp = arr[i];
            arr[i] = arr[len-1-i];
            arr[len-1-i] = temp;   
        }
        System.out.print("\nArray elements after reversal:\n");
        for (int i=0 ; i<len ; i++){
            System.out.print(arr[i]+"  ");
        }
            
            
        scanner.close();
    }
}
