/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question7;

/**
 *
 * @author Personal
 */
public class Employee {
    
    String empName;
    int EmpId;
    
    class Salary{
        double basic ; 
        double hra;
        double pf;
        
        void setDetails( double basic , double hra , double pf){
            this.basic = basic ; 
            this.hra = hra ; 
            this.pf = pf ; 
        }
        
        void displaySalary(){
            System.out.println("Basic Pay -> " + this.basic);
            System.out.println("hra -> " + this.hra);
            System.out.println("pf -> " + this.pf);
        }        
    }
    class JoiningDate{
            int date;
            String Month ; 
            int year;
            
            void setDetails(int date , String Month , int year){
                this.date = date ; 
                this.Month = Month ;
                this.year = year ; 
            }
            
            void displayDate(){
                System.out.println( "Joining Date ->" + this.date + " " + this.Month + " " + this.year);
            }            
        }
    
    
    Salary setSalary(double basic , double hra , double pf){
        Salary sal = new Salary();
        sal.setDetails(basic , hra , pf);
        return sal;
    }
    
    JoiningDate setDate (int date , String month , int year){
        JoiningDate joiningdate = new JoiningDate();
        joiningdate.setDetails(date , month, year);
        return joiningdate;
    }
    
    void displayDetails(Salary sal , JoiningDate date){
        System.out.println("Name -> " + this.empName);
        System.out.println("Employee Id ->" + this.EmpId);
        sal.displaySalary();
        date.displayDate();
    }
}
