/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question8;

import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
    
        String brand ;
        double power ;
    
        System.out.print("Enter the brand of Washing Machine: ");
        brand = sc.nextLine();
        
        System.out.print("Enter the power consumed by Washing Machine: ");
        power = sc.nextDouble();
        
        
        WashingMachine w1 = new WashingMachine(brand , power);
        w1.turnOn();
        
        sc.nextLine();
        System.out.print("Enter the brand of Refrigerator : ");
        brand = sc.nextLine();
        
        System.out.print("Enter the power consumed by Refrigerator : ");
        power = sc.nextDouble();
        
        System.out.print("Enter the Temperature to be set : ");
        double Temp = sc.nextDouble();
        
        Refrigerator r1 = new Refrigerator(brand , power , Temp);
        r1.turnOn();
        
        w1.turnOff();
        r1.turnOff();
    }   
}
