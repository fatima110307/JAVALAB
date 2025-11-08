/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question8;

/**
 *
 * @author Personal
 */
public class Refrigerator extends Appliances {
    
    double Temprature ; 
    
    Refrigerator(String brand , double power , double Temprature ){
    super(brand, power);
    this.Temprature = Temprature ; 
    }
    
    @Override
    void turnOn(){
        System.out.println( super.brand + " Refrigerator turned On......\nPower Consumption = " + super.power + "\nTemprature is set to " + this.Temprature);
    }
   
    
    @Override
    void turnOff(){
        System.out.println(super.brand + "  Refrigerator turned Off.......");
    }
}
