/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question4and5;

/**
 *
 * @author ACER
 */
public class Saving extends Account  {
    
    double Min_balance ; 
    
    Saving(int Id , double balance , String Account_holder_name , String Address , double Min_balance){
        super(Id ,balance ,  Account_holder_name , Address);
        this.Min_balance = Min_balance;
    }
    @Override
    void Deposit(int money){
        
       double amount = money + balance ;  
       if ( amount < Min_balance){
           System.out.println( (Min_balance - amount) + " Rupees are required to reach Minimun Balance");
       }
            
       else{
           System.out.println("Amount Deposited");
           balance = balance + money ;
       }
            
    }
    
    @Override
    void Withdraw(int money){
        
        double amount = balance - money ;
        
        if (amount <= Min_balance ){
            System.out.println("Minimun_balance reached");
        }
        else{
            System.out.println("Amount Withdrawed");
            balance = balance - money ;
        }
    }
    
    @Override
    void DisplayDetails(){
        System.out.print("Saving ");
        super.DisplayDetails();
        System.out.println("Minimum Balance Limit");
        System.out.println("______________________________________");
    }
}
