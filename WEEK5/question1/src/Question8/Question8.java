/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question8;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int rev = 0 ;
        
        while (num != 0){
            rev = (rev*10)+(num%10);
            num = num/10;            
        }
        
        System.out.println("The reverse of inputed number = " + rev);
        scanner.close();
    }
}
