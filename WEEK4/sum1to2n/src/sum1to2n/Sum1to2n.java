/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sum1to2n;
import java.util.Scanner;
public class Sum1to2n {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter a number : ");
        int N = scanner.nextInt();
        int sum=0;
        for (int i=2 ; i<=N ; i+=2){
            sum+=i;
//            System.out.println("NUMBER= " + i +"\tSUM = "+sum);
        }
        System.out.println("Sum of Even numbers from 1 to "+ N +" = "+ sum);
        scanner.close();
    }
    
}
