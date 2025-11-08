/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question2;

public class Department extends Faculty {
    String name ;
    String Chairman ; 
    Department (String name , String Faculty_name , int ranking , String Department_name , String Chairman  ){
    
    super(name , Faculty_name , ranking);
    this.name = Department_name;
    this.Chairman = Chairman ; 
    }
    
    void Details(){
        System.out.println("Department Details");
        System.out.println("Department name -> " + this.name);
        System.out.println("Chairman name -> " + this.Chairman);
        System.out.println("______________________________________________");
    }
    
    void Display(){
    
    super.Details();
    this.Details();
    }
}

