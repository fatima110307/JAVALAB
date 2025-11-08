/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package divby2;
import java.util.Scanner;
public class Divby2 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter a number: ");
       int num1 = scanner.nextInt();
       double rem=num1/2;
       while (rem>=10){
           System.out.println(rem);
           rem = rem/2;
       }
       scanner.close();
    }
    
}
