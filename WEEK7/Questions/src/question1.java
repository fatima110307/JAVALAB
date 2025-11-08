/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
public class question1 {
    
    public static int binary_search(int key ,int start , int end , int arr[]){
        if (start>end)
            return -1;
        int mid =(start +end)/2;
        if (key > arr[mid])
            return binary_search(key , mid+1 , end , arr);
        if (key < arr[mid])
            return binary_search(key , start , mid-1 , arr);
        return mid;
    }
    public static void bubblesort (int arr[]){
        
        for (int i=0  ; i<arr.length ; i++){
            for (int j= i+1 ; j<arr.length ; j++){
                if (arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
                
        }
        
    }
    public static void main (String[] args){
        
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the length of array: ");
        int size = sc.nextInt();
        
        int arr[] = new int[size];
        for (int i=0 ; i<size ; i++){
            System.out.print("Enter element" + (i+1) + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter key:");
        int key=sc.nextInt();
        bubblesort(arr);
        System.out.print("Sorted array:\n");
        for (int i=0 ; i<size ; i++){
            System.out.print(arr[i]+ "  ");
        }
        
        int index=binary_search(key , 0 , size-1 , arr);
        if (index!=-1)
            System.out.println("\nElement found at " + index + " index");
        else
            System.out.println("\nElement not found");
    }
}
