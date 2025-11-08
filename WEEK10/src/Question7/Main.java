/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question7;

/**
 *
 * @author Personal
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Employee emp1 = new Employee();
        
        System.out.print("Enter the ID :");
        emp1.EmpId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the name :");
        emp1.empName = sc.nextLine();
        
        Employee.Salary sal = emp1.new Salary() ;
        System.out.print("Enter the basic pay: ");
        double basic = sc.nextDouble();
        System.out.print("Enter the hra: ");
        double hra = sc.nextDouble();
        System.out.print("Enter the pf: ");
        double pf = sc.nextDouble();
        sal.setDetails(basic, hra, pf);
        
        Employee.JoiningDate date = emp1.new JoiningDate() ;
        
        System.out.print("Enter the date of Joining: ");
        int Date = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the month of Joining: ");
        String month = sc.nextLine();
        System.out.print("Enter the year of Joining: ");
        int year = sc.nextInt();
                   
        date = emp1.setDate(Date , month , year);
        emp1.displayDetails(sal, date);
    }
}
