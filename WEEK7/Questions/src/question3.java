/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class question3 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a String: ");
        String str= sc.nextLine();
        
        char[] arr = str.toCharArray();
        
        for (int i=0 ; i<=(arr.length/2) ; i++){
            char temp = arr[i];
            arr[i] = arr [arr.length-1-i];
            arr [arr.length-1-i] = temp;
        }
        
        System.out.print("Reversed String:  ");
        String rstr = new String(arr);
        System.out.println(rstr);
        sc.close();
    }

    
    
}
