/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question7;

/**
 *
 * @author Personal
 */
public class Manager extends Employee {
    String department;
    
    void Showdetails(){
        System.out.println("Manager details........");
        System.out.println("Name -> " + super.name);
        System.out.println("Salary -> " + super.salary);
        System.out.println("Department -> " + this.department);
    }
}
