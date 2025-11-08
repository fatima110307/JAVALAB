/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question11;

/**
 *
 * @author Personal
 */
public class Question11 {
    public static void main(String[] args) {
        int i , j ;
        String s ="*";
        for ( i = 1 ; i<=3 ; i++){
            
            for (j = 3 ; j>=i ; j--)
                System.out.print(" ");
            
                System.out.println(s);
                s=s+"*";
        }
        for ( i = 1 ; i<=3 ; i++){
            
            for (j = 0 ; j<=i; j++)
                System.out.print(" ");
             for (j = 2 ; j>=i ; j--)
                System.out.print("*");
             System.out.println();
                
        }
    } 
}
