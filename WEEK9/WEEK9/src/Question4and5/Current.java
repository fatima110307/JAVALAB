/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question4and5;

public class Current extends Account {
    
     double Max_withdrawal_limit ; 
    
    Current(int Id , double balance , String Account_holder_name , String Address , double Max_withdrawal_limit){
        super(Id ,balance ,  Account_holder_name , Address);
        this.Max_withdrawal_limit = Max_withdrawal_limit;
    }
    
     @Override
    void Deposit(int money){
        
        System.out.println( money + " Ruppes sucessfully deposited ");
        balance = balance + money;
    }
    
     @Override
    void Withdraw(int money){
        
        if ( money > Max_withdrawal_limit){
            System.out.println("Exceeding the Maximum Withdrawal Limit.........");
        }
        else{
            System.out.println("Withdrawn sucessfully ");
            balance = balance - money ;
        }
    }
    
    void DisplayDetails(){
        System.out.print("Currrent ");
        super.DisplayDetails();
        System.out.println("Minimum Balance Limit");
        System.out.println("______________________________________");
    }
}
