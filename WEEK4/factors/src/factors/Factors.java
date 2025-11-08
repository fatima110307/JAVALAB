/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factors;
import java.util.Scanner;
public class Factors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter a Number: ");
        int num = scanner.nextInt();
        System.out.println("The factors of "+num +" is:");
        for (int i=1 ; i<=num ; i++){
            if (num%i == 0)
                System.out.println(i);
        }
        scanner.close();
    }
}
