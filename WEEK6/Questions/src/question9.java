/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
public class question9 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number of elements to be printed: ");
        int range = sc.nextInt();
        int num1=0;
        int num2=1;
        System.out.print(num1+"  " +num2+"  ");
        for (int i=1 ; i<=range-2; i++){
            int sum=num1+num2;
            System.out.print(sum +"   ");
            num1=num2;
            num2=sum;
        }
        sc.close();
    }
}
