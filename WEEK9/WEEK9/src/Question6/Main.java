/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question6;

/**
 *
 * @author Personal
 */
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
    
        double num1 , num2 ;
    
        System.out.print("Enter the radius of Cicrle: ");
        num1 = sc.nextDouble();
        
        Circle c1 = new Circle(num1);
        c1.area();
        
        System.out.print("Enter the length of rectangle : ");
        num1 = sc.nextDouble();
        System.out.println("Enter the breadth of rectangle : ");
        num2 = sc.nextDouble();
        
        Rectangle r1 = new Rectangle (num1 , num2 );
        r1.area();
        
        Shape s1 = new Shape();
        s1.area();
    
    sc.close();
    }
}
