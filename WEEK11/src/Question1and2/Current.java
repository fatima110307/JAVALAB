/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question1and2;

/**
 *
 * @author Personal
 */
public class Current implements Account {
    
    @Override
    public void withdraw(){
        System.out.println("Withdrawn from the Current account....");
    }
    @Override
    public void deposit(){
        System.out.println("Deposited to the Current account........");
    }
}
