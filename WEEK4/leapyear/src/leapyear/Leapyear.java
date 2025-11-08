/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leapyear;
import java.util.Scanner;
public class Leapyear {

    public static void main(String[] args) {
       Scanner scanner = new Scanner (System.in);
       System.out.print("Enter a year: ");
       int year = scanner.nextInt();
       boolean check = true;
       if (year % 400 == 0);
       else if (year % 100 == 0)
           check = false;
       else if (year % 4 == 0);
       else 
           check= false;
       
       if (check)
           System.out.println(year+" is a leap year.");
       else
           System.out.println(year+" is NOT a leap year.");
           
       scanner.close();
    }
    
}
