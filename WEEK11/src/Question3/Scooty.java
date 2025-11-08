/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Question3;

/**
 *
 * @author ACER
 */
public interface Scooty {
    
    void offer();
    default void details(){
        System.out.println("This a Scooty");
        System.out.println("This is sold for 5000 rupees");
        System.out.println("This is a electric scooty");
    }
}
