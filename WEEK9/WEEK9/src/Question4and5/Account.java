/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question4and5;

/**
 *
 * @author ACER
 */
public abstract class Account {
    int Id;
    double balance ; 
    String Account_holder_name ; 
    String Address;
    
    Account (int Id , double balance , String Account_holder_name , String Address ){
        this.Id = Id ; 
        this.balance = balance ; 
        this.Account_holder_name = Account_holder_name ; 
        this.Address = Address ; 
    }
    
    abstract void Deposit(int money);
    abstract void Withdraw(int money);
           
    void DisplayDetails(){
        System.out.println("Account details ");
        System.out.println("Id -> " + this.Id);
        System.out.println("Account holder name -> " +this.Account_holder_name);
        System.out.println("Address -> " + this.Address);
        System.out.println("Balance -> " + this.balance);
    }
    
    void DisplayBalance(){
        System.out.println("Current Balance -> " + this.balance);
    }
}
