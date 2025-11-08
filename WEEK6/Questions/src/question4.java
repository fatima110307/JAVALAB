/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
public class question4 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the length of array: ");
        int len = sc.nextInt();
        
        int arr[] = new int[len];
        
        for (int i = 0 ; i<len ; i++){
            System.out.print("Enter element "+ (i+1) + " : ");
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        System.out.print("Content of Array:\n");
        for (int i = 0 ; i<len ; i++){
            System.out.print(arr[i]+"   ");
            if(arr[i]>max)
                max=arr[i];
            if(arr[i]<min)
                min=arr[i];
        }
        System.out.println("\nMaximum = " + max + "\nMinimun = " + min);
        sc.close();
    }
}
