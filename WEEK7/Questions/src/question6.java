     /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class question6 {
    
    public static void fib(int range){
        int num1 = 0 ;
        int num2 = 1;
        if ( range == 1)
            System.out.print(num1);
        
        else if (range == 2)
            System.out.print(num1 + ", " + num2);
        
        else{
            System.out.print(num1 + ", " + num2);
            
            for (int i=3 ; i<= range ; i++){
               int next = num1 + num2;
               num1= num2;
               num2=next;
               System.out.print(", " + next);
           } 
        }
    }
    
    public static int fib_recursion (int n){
    
        if (n<=1)
            return n;
        return (fib_recursion(n-1)+fib_recursion(n-2));
    }
    
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int choice = 0;
        do{
            System.out.println("\n1.Fibonacci with recursion\n2.Fibonacci without recursioon\n3.Exit\nEnter your choice: ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.print("Enter the number of elements to be printed");
                    int n = sc.nextInt();
                    System.out.println("Fibonacci series  with recursion:");
                    
                    for (int i=0 ; i< n ; i++)
                        System.out.print(fib_recursion(i)+ " ");
                    
                    break;
                case 2:
                    System.out.print("Enter the number of elements to be printed");
                    int range = sc.nextInt();
                    System.out.println("Fibonacci series  without recursion:");
                    fib(range);
                    break;
            }
        }
        while (choice!=3);
        
        sc.close();
    }
}
