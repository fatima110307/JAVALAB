/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
public class question8 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the size of aray: ");
        int len = sc.nextInt();
        
        int arr[] = new int[len];
        
        for (int i =0 ; i<len ; i++){
            System.out.print("Enter element " +(i+1)+ " : ");
            arr[i] = sc.nextInt();
        }
        
        int largest = arr[0];
        int largest2= Integer.MIN_VALUE;
        
        System.out.println("Contents of array: ");
        for (int i=0 ; i<len ; i++){
            System.out.print(arr[i] + "  ");
            if (arr[i]>largest ){
                largest2=  largest;
                largest = arr[i];
            }
            else if (arr[i] > largest2 && arr[i] != largest)
                largest2 = arr[i];
        }
        System.out.println("\nSecond Largest element is " + largest2);
        sc.close();
    }
}
