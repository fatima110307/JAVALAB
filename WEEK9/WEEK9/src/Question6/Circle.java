/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question6;

/**
 *
 * @author Personal
 */
public class Circle extends Shape{
    double radius ; 
    
    Circle(double radius){
        this.radius = radius ;
    }
    
    
    @Override
    void area(){
        double area = Math.PI*this.radius*this.radius ;
        System.out.println("Area of Circle = " + area);
    }
}
