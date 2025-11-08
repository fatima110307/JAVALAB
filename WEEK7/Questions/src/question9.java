/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Personal
 */
import java.util.Scanner;
public class question9 {
    
    public static int partition(int arr[] , int start , int end){
        int pivot = arr[end];
        int i = start-1;
        for (int j=start ; j<end ; j++){
            if (arr[j]<=pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
           
        }
        int temp = arr[i+1];
        arr[i+1] = pivot;
        arr[end] = temp;
    return i+1;    
    }
    
    public static void quick_sort (int arr[] , int start , int end){
        if(start < end){
            int index = partition(arr,start,end);
            quick_sort(arr , start , index-1 );
            quick_sort(arr , index+1 , end );            
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter the number of elements in array");
        int len = sc.nextInt();
        
        int [] arr = new int [len];
        
        for (int i=0 ; i<len ; i++){
            System.out.print("Enter element "+ (i+1) +": ");
            arr[i] = sc.nextInt();
        }
        
        quick_sort(arr , 0 , len-1);
        
        for (int i=0 ; i<len ; i++){
            System.out.print(arr[i]+ "  ");
             
        }
        sc.close();
    }
}
