/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
public class question6 {
    public static void main( String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the length of array: ");
        int len = sc.nextInt();
        
        int arr[] = new int[len];
        
        for (int i = 0 ; i<len ; i++ ){
            System.out.print("Enter element " + (i+1) + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the value to be searched: ");
        int key = sc.nextInt();
        int index = -1 ; 
        
        for (int i= 0 ; i<len ; i++){
            if (arr[i]==key){
                index =  i;
                break;
            }
        }
                
       if(index!=-1) 
           System.out.println("Found At Index" + index );
       else 
           System.out.println("NOT FOUND");
        sc.close();
    }
}
