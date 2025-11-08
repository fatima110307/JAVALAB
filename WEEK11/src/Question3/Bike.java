/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Question3;

/**
 *
 * @author ACER
 */
public interface Bike {
     
    void offer();
    default void details(){
        System.out.println("This is a Bike.");
        System.out.println("It sells for 10000 rupees.");
        System.out.println("This have a disel Engine.");
    }
}
