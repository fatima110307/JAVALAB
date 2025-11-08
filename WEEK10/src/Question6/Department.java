/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question6;

/**
 *
 * @author Personal
 */
public class Department extends Faculty {
    
    String name ; 
    String Chairperson ;
    
    Department (String name , int ranking , String Faculty_name , String Department_name , String Chairperson){
        super(name , ranking , Faculty_name);
        this.name = Department_name; 
        this.Chairperson = Chairperson;
    }
    
    void showDetails(){
        System.out.println("Department name -> "  + this.name);
        System.out.println("Chairperson name -> " + this.Chairperson);
    }
    
    void display(){
        super.showDetails();
        this.showDetails();
    }
}
