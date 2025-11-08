/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question9;

/**
 *
 * @author Personal
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Enter num1 : ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter num2 : ");
        int num2 = sc.nextInt();
        
        int GCD;
        if (num1 > num2){
            GCD = MathOperations.findGCD(num1 , num2);
        }
        else{
            GCD = MathOperations.findGCD(num2 , num1);
        }
        int LCM = MathOperations.findLCM(num1, num2);
        
        System.out.println("GCD of " + num1 + ", " + num2 + " = " + GCD);
        System.out.println("LCM of " + num1 + ", " + num2 + " = " + LCM);
    }
}
