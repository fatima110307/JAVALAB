/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package largestin4;
import java.util.Scanner;
public class Largestin4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter four integer: ");
        int num1= scanner.nextInt();
        int num2= scanner.nextInt();
        int num3= scanner.nextInt();
        int num4= scanner.nextInt();
        if (num1<num2 && num1<num3 && num1 <num4)
            System.out.println(num1+ " is smaller.");
        else if (num2<num1 && num2<num3 && num2 <num4)
            System.out.println(num2+ " is smaller.");
        else if (num3<num1 && num3<num2 && num3 <num4)
            System.out.println(num3+ " is smaller.");
        else 
            System.out.println(num4+ " is smaller.");
        
        scanner.close();
    }
    
}
