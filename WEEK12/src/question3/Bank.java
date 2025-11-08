/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question3;

/**
 *
 * @author ACER
 */

class InsufficientFundException extends Exception{
    
}
public class Bank {
    int balance ;
    
    public void withdraw (int amount) throws InsufficientFundException {
        
        
        if (balance < amount){
            throw new InsufficientFundException();
        }
        
        else{
            this.balance = this.balance - amount;
        }
    }
}
