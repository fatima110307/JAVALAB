/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package largest3;
import java.util.Scanner;
public class Largest3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int big;
        
        if (num1>num2){
            if (num1>num3)
                big=num1;
            else 
                big=num3;
        }
        else{
            if (num2>num3)
                big= num2;
            else
                big= num3;
        }
        System.out.println("Biggest number among three is : "+ big);
    }
    
}
