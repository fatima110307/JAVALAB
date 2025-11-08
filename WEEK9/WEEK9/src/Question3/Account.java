/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question3;

public class Account {
    
    int Id; 
    String Account_holder_name ; 
    String Address;
    
    Account (int Id , String Account_holder_name , String Address ){
        this.Id = Id ; 
        this.Account_holder_name = Account_holder_name ; 
        this.Address = Address ; 
    }
    
    void Deposit(){
        System.out.println("Money Successfully depoisted");
    }
    
    void Withdraw(){
        System.out.println("Money Sucessfully withdrwan");
    }
    
    public static void SimpleInterest(double p , double r , int t){
        double SI = (p*r*t)/100 ; 
        System.out.println( "Simple Interest = " + SI);
    }
    
    static void CompoundInterest( double p , double r , int t){
        double CI= p*Math.pow((1+ (r/100)) , t);
        System.out.println("Compound Interest = " + CI);
    }
    
    void DisplayDetails(){
        System.out.println("Id -> " + this.Id);
        System.out.println("Account holder name -> " +this.Account_holder_name);
        System.out.println("Address -> " + this.Address);
    }
}
