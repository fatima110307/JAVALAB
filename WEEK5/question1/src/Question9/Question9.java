/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question9;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int rev =0 , temp = num ;
        
        while (num!=0){
            rev = (rev*10)+(num%10);
            num = num/10 ;
        }
        
        if (temp == rev)
            System.out.println(temp + " is a Palindrome.");
        else
            System.out.println(temp + " is NOT a Palindrome.");
        scanner.close();
    }
}
