/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Question4;

/**
 *
 * @author ACER
 */
public interface Scanner {
    
    void connect();
    default void details(){
        System.out.println("This is a Scanner");
    }
}
