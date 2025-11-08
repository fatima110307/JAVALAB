/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question8;

/**
 *
 * @author Personal
 */
import java.util.Scanner;
public class Shape {
    
    public static void area(int side){
        int area = side * side ; 
        System.out.println(" Area of Square = " + area);
    }
    
    public static void area(int length , int breadth){
        int area = length * breadth ; 
        System.out.println(" Area of Square = " + area);
    }
    
    public static void area(double radius){
        double area = Math.PI * radius * radius ; 
        System.out.println(" Area of Square = " + area);
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int choice = 0 ;
        
        do{
        
            System.out.print("MENU.......\n1.Area of square\n2.Area of Rectangle\n3.Area of Circle\n4.Exit\nEnter your Choice...");
            choice = sc.nextInt();
            
            switch (choice){
                case 1:
                    System.out.print("Enter the side of Sqaure");
                    int side = sc.nextInt();
                    area(side);
                    break;
                case 2:
                    System.out.print("Enter the length of Reactangle");
                    int length = sc.nextInt();
                    System.out.print("Enter the breadth of Reactangle");
                    int breadth = sc.nextInt();
                    area(length , breadth);
                    break;
                case 3:
                   System.out.print("Enter the radius  of circle");
                   double radius = sc.nextDouble(); 
                   area(radius);
                   break;
                case 4 : 
                    System.out.println("Program Execution ended .....");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }           
        }
        while(choice!=4);
    }
}
