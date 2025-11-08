package week8;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Personal
 */
import java.util.Scanner;
class Car{
    String model;
    String color;
    int price;
    
    Car(){
    }
    
    Car (String model ){
        this.model = model;
    }
    
    Car(String model , String color  ){
        this(model);
        this.color = color;
    }
    
    Car (String model , String color , int price){
        this.price = price;
        this (model , color);
    }
    
    void setModel(String model){    
        this.model = model;
    }
    
    void setColor(String color){    
        this.color = color;
    }
    
    void setPrice(int price){    
        this.price = price;
    }
    
    int getPrice(){
        return this.price;
    }
    
    String getColor(){
        return this.color;
    }
    
    String getModel(){
        return this.model;
    }
    
    void display (){
        System.out.println("Model = " + this.model);
        System.out.println("Color = " + this.color);
        System.out.println("Price = " + this.price);
        System.out.println("______________________________________");
    }


}
public class Main
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        String model ; 
        String color ; 
        int price;
        
        Car car1 =  new Car(); 
        
        System.out.print("Enter the model of car2: ");
        model = sc.nextLine();
        Car car2 = new Car(model);
        
        System.out.print("Enter the model of car3: ");
        model = sc.nextLine();
        
        System.out.print("Enter the color of car3: ");
        color = sc.nextLine();
        Car car3 = new Car(model , color);
        
        System.out.print("Enter price of Car1: ");
        price = sc.nextInt();
        car1.setPrice(price);
        
        System.out.print("Enter price of Car2: ");
        price = sc.nextInt();
        car2.setPrice(price);
        
        System.out.print("Enter price of Car3: ");
        price = sc.nextInt();
        car3.setPrice(price);
        
        System.out.println("CAR1:  ");
        car1.display();
        System.out.println("CAR2:  ");
        car2.display();
        System.out.println("CAR3:  ");
        car3.display();
        
        sc.close();
    }
}
