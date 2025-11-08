/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question9;

public class MathOperations {
    
    public static int findGCD (int num1 , int num2){
        if (num1 % num2 == 0)
            return num2 ;
        return findGCD(num2 , num1%num2);      
    }
    
    public static int findLCM (int num1 , int num2){
        return (num1*num2)/findGCD(num1 , num2);
    }
}
