/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Question1and2;

/**
 *
 * @author Personal
 */
public interface Account {
    
    void deposit();
    void withdraw();
    
    default void takeLoan(){};
    static void abountBank(String name ,String manager ){
        System.out.println("Name Of the Bank -> " + name);
        System.out.println("Name of the Bank Manager ->" + manager);
    }
}
