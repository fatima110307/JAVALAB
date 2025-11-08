/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question4;

/**
 *
 * @author ACER
 */
import java.util.Scanner;
class InvalidAgeException extends Exception{
    
}

public class question4 { 
    public static void Canvote (int age) throws InvalidAgeException{
        
        if (age<18)
            throw new InvalidAgeException();
        else
            System.out.println("you can vote legally");
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        
        try{
            Canvote(age);
        }
        catch (InvalidAgeException e){
            System.out.println("Age less than 18");
        }
        
    }
}
