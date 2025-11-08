/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package week8;
import java.util.Scanner;

class Fruit1{
    String color;
    String taste;
    int price;
    
    void display(){
        System.out.println("Color = " + color);
        System.out.println("Taste = " + taste);
        System.out.println("Price = " + price);
        System.out.println("_____________________________________________");
    }
    
}

public class question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
    
        Fruit1 f1 = new Fruit1();
        Fruit1 f2 = new Fruit1();
        Fruit1 f3 = new Fruit1();
        
//        Input for f1
        System.out.print("Enter a the color of  f1: ");
        f1.color = sc.next();
      
        System.out.print("Enter a the Taste of  f1: ");
        f1.taste = sc.next();
      
        System.out.print("Enter a the Price of  f1: ");
        f1.price = sc.nextInt();
//        Input for f2        
        System.out.print("Enter a the color of  f2: ");
        f2.color = sc.next();
        
        System.out.print("Enter a the Taste of  f2: ");
        f2.taste = sc.next();
        
        System.out.print("Enter a the Price of  f2: ");
        f2.price = sc.nextInt();
//        Input for f3        
        System.out.print("Enter a the color of  f3: ");
        f3.color = sc.next();
        
        System.out.print("Enter a the Taste of  f3: ");
        f3.taste = sc.next();
        
        System.out.print("Enter a the Price of  f3: ");
        f3.price = sc.nextInt();
        
        System.out.println("Fruit 1: ");
        f1.display();
        System.out.println("Fruit 2: ");
        f2.display();
        System.out.println("Fruit 3: ");
        f3.display();
    }
}
