/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oddeven;
import java.util.Scanner;
public class Oddeven {

    public static void main(String[] args) {
      Scanner scanner = new Scanner (System.in);
      System.out.print("Enter a number: ");
      int num1= scanner.nextInt();
      if (num1%2 == 0)
          System.out.println(num1+" is Even");
      else
          System.out.println(num1+ " is Odd");
      scanner.close();
    }
}
