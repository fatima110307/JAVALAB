/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question8;

/**
 *
 * @author Personal
 */
public class WashingMachine extends Appliances{
    
    
    WashingMachine(String brand , double power){
        super (brand , power);    
    }
    @Override
    void turnOn(){
        System.out.println( super.brand + "Washing Machine turned On....\nPower Consumption = " + super.power);
    }
    
    @Override
    void turnOff(){
        System.out.println( super.brand + "Washing Machine turned Off.... ");
    }
}
