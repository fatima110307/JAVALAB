/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question10;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int choice = 0;
        do {
           System.out.print("MENU\n1.Decimal to Hexadecimal\n2.Hexadecimal to decimal\n3.Exit\nEnter your choice:");
           choice = scanner.nextInt();
           
           if (choice==1){
               System.out.print("Enter the decimal number");
               int num = scanner.nextInt();
               int temp = num;
               String s="";
               while (num>0){
                   int r = num%16 ;
                   num = num/16;
                   if (r>=10){
                       switch (r){
                           case 10: 
                           s= 'A'+s; break;
                           case 11: 
                           s= 'B'+s; break;
                           case 12: 
                           s= 'C'+s; break;
                           case 13: 
                           s= 'D'+s; break;
                           case 14: 
                           s= 'E'+s; break;
                           case 15: 
                           s= 'F'+s; break;
                       }
                               
                   }
                   else {
                       s = r+s;
                   }
               }
               System.out.println("Hexadecimal equivalent of " + temp + " is" +s);
           }
           
           else if (choice == 2){
               System.out.print("Enter the hexadecimal number: ");
               String hex = scanner.next();
               int decimal = 0 ;
               int power=0;
               for (int i = (hex.length()-1) ; i>=0; i--){
                   char ch = hex.charAt(i);
                   if ( ch == '1' )
                       decimal += 1*(Math.pow(16 , power));
                   else if ( ch == '2' )
                       decimal += 2*(Math.pow(16 , power));
                   else if ( ch == '3' )
                       decimal += 3*(Math.pow(16 , power));
                   else if ( ch == '4' )
                       decimal += 4*(Math.pow(16 , power));
                   else if ( ch == '5' )
                       decimal += 5*(Math.pow(16 , power));
                   else if ( ch == '6' )
                       decimal += 6*(Math.pow(16 , power));
                   else if ( ch == '7' )
                       decimal += 7*(Math.pow(16 , power));
                   else if ( ch == '8' )
                       decimal += 8*(Math.pow(16 , power));
                   else if ( ch == '9' )
                       decimal += 9*(Math.pow(16 , power));
                   else if ( ch == 'A' )
                       decimal += 10*(Math.pow(16 , power));
                   else if ( ch == 'B' )
                       decimal += 11*(Math.pow(16 , power));
                   else if ( ch == 'C' )
                       decimal += 12*(Math.pow(16 , power));
                   else if ( ch == 'D' )
                       decimal += 13*(Math.pow(16 , power));
                   else if ( ch == 'E' )
                       decimal += 14*(Math.pow(16 , power));
                   else if ( ch == 'F' )
                       decimal += 15*(Math.pow(16 , power));
                  power++;
               }
               System.out.println("Decimal equivalent of " + hex + " = " + decimal );
           }
           
        }
        while (choice!=3);
        scanner.close();        
    }
}
