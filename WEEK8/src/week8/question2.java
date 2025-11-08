/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week8;

import java.util.Scanner;

class Fruit2{
    String color;
    String taste;
    int price;
    
    void setDetails(String color , String taste , int price){
        this.color = color ; 
        this.taste = taste ; 
        this.price = price ;
    }
    
    void display(){
        System.out.println("Color = " + color);
        System.out.println("Taste = " + taste);
        System.out.println("Price = " + price);
        System.out.println("______________________________________");
    }
    
    Fruit2(){
    }
    
    Fruit2(String color , String taste , int price){
        this(color , taste);
        this.price = price ;
    }
    
    Fruit2(String color , String taste){
        this(color);
        this.taste = taste ; 
    }
    
    Fruit2(String color ){
        this.color = color ; 
        
    }
    
}
public class question2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
    
        Fruit2 f1 = new Fruit2();
        Fruit2 f2 = new Fruit2();
        
        
        String color ;
        String taste; 
        int price;
        
//        Input for f1
        System.out.print("Enter a the color of  f1: ");
        color = sc.next();
      
        System.out.print("Enter a the Taste of  f1: ");
        taste = sc.next();
      
        System.out.print("Enter a the Price of  f1: ");
        price = sc.nextInt();
        
        f1.setDetails( color , taste , price);
//        Input for f2        
        System.out.print("Enter a the color of  f2: ");
        color = sc.next();
        
        System.out.print("Enter a the Taste of  f2: ");
        taste = sc.next();
        
        System.out.print("Enter a the Price of  f2: ");
        price = sc.nextInt();
        
        f2.setDetails( color , taste , price);
        
        
        System.out.println("Fruit 1: ");
        f1.display();
        System.out.println("Fruit 2: ");
        f2.display();
        
        
        
//          Input for f3        
        System.out.print("Enter a the color of  f3: ");
        color = sc.next();
        
        System.out.print("Enter a the Taste of  f3: ");
        taste = sc.next();
        
        System.out.print("Enter a the Price of  f3: ");
        price = sc.nextInt();
        
        Fruit2 f3  = new Fruit2(color , taste , price);
        System.out.println("Constructor chaining :");
        f3.display();
    }
}

