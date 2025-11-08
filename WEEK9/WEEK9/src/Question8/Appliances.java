/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question8;

/**
 *
 * @author Personal
 */
public abstract class Appliances {
    String brand;
    double power;
    
    Appliances(String brand , double power){
        this.brand = brand ;
        this.power = power;
    }
    
    abstract void turnOn();
    abstract void turnOff();
}
