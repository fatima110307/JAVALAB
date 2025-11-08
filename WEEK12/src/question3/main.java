/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question3;

/**
 *
 * @author ACER
 */
public class main {
    
    public static void main(String[] args) {
     
        Bank b = new Bank();
        b.balance = 2000;
        try{
             b.withdraw(5000);
        }
        catch(InsufficientFundException e){
            System.out.println("Not enoungh balance in account");
        }
    }
}
