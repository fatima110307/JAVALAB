/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question1;

/**
 *
 * @author ACER
 */
import java.util.Scanner;

public class question1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        try{
            for (int i = 5  ; i>=0 ; i--){
            System.out.println(num + "/" + i + " = " + (num/i));
        }
        }
        catch (ArithmeticException e){
            System.out.println("Cannot divide a number by zero");
        }
        sc.close();
    }
}
