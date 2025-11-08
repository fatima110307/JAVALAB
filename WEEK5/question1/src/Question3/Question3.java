/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question3;

/**
 *
 * @author Personal
 */
public class Question3 {
     public static void main(String[] args) {
        int i , j , k ;
        for (i = 5 ; i>=0 ; i--){            
            for (j=0 ; j<=i ; j++)
               System.out.print(" ");
          for ( k=1 ; k<(6-i) ; k++)
               System.out.print(k);
          System.out.println();
        }
//        String s = "";
//        for ( i = 1 ; i<=5 ; i++){
//            
//            for ( j = 5 ; j >= (i+1) ; j--)
//                System.out.print(" ");
//            s = s+ i;
//            System.out.println("*");
//             
//        }
    }
}
