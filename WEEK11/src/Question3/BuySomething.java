/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question3;

/**
 *
 * @author ACER
 */
public class BuySomething implements Bike , Scooty {
   
    
    @Override
    public void offer(){
        System.out.println("There is 50% discount in our store");
    }
    
  
    @Override
    public void details(){
        System.out.println("Details of Bike ");    
        Bike.super.details();
        Scooty.super.details();
    }
    
}
