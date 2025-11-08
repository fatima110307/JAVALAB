/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chacheck;
import java.util.Scanner;
public class Chacheck {

    public static void main(String[] args) {
      Scanner scanner = new Scanner (System.in);
      System.out.print("Enter a char:");
      char check  = scanner.next().charAt(0);
      if(check=='a' || check =='A' || check =='e'|| check=='E' || check =='i' || check=='I' || check =='o' || check=='O' || check =='u' || check == 'U'){
          System.out.println(check +" is a vowel");
      }
      else{
           System.out.println(check +" is NOT a vowel");
      }
      scanner.close();
    }
    
}
