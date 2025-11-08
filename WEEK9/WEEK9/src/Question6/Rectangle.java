/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question6;

/**
 *
 * @author Personal
 */
public class Rectangle extends Shape{
    double length; 
    double breadth ; 
    
    Rectangle(double length , double breadth){
        this.length = length ;
        this.breadth = breadth;
    }
    
    @Override
    void area(){
    
        double area = this.length * this.breadth ;
        System.out.println("Area of Rectangle = " + area);
    }
}
