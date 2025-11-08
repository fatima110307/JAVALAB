/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question3;

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class Main {
    
    public static void minMaxAdd(int num1 , int num2 , int num3){
        
        //Minimun
        int Min ;
        if (num1<=num2 && num1<=num3){
            Min= num1;
        }
        else if(num2<=num1 && num2<=num3){
            Min= num2;
        }
        else {
            Min = num3 ;
        }
        
        //Maximun 
        int Max ;
        if (num1>=num2 && num1>=num3){
            Max= num1;
        }
        else if(num2>=num1 && num2>=num3){
            Max= num2;
        }
        else {
            Max = num3 ;
        }
        // Addition
        int Add = num1 + num2 + num3 ;
        
        System.out.println("Minimun -> " + Min);
        System.out.println("Maximun -> " + Max);
        System.out.println("Addition -> " + Add);
    }
    
    public static void minMaxAdd(double num1 , double num2 , double num3){
        
        //Minimun
        double Min ;
        if (num1<=num2 && num1<=num3){
            Min= num1;
        }
        else if(num2<=num1 && num2<=num3){
            Min= num2;
        }
        else {
            Min = num3 ;
        }
        
        //Maximun 
        double Max ;
        if (num1>=num2 && num1>=num3){
            Max= num1;
        }
        else if(num2>=num1 && num2>=num3){
            Max= num2;
        }
        else {
            Max = num3 ;
        }
        
        //Addition
        double Add = num1 + num2 + num3 ;
         
        System.out.println("Minimun -> " + Min);
        System.out.println("Maximun -> " + Max);
        System.out.println("Addition -> " + Add);
    }
    
    public static void minMaxAdd(char num1 , char num2 , char num3){
        
        //Minimun
        char Min ;
        if (num1<=num2 && num1<=num3){
            Min= num1;
        }
        else if(num2<=num1 && num2<=num3){
            Min= num2;
        }
        else {
            Min = num3 ;
        }
        
        //Maximun 
        char Max ;
        if (num1>=num2 && num1>=num3){
            Max= num1;
        }
        else if(num2>=num1 && num2>=num3){
            Max= num2;
        }
        else {
            Max = num3 ;
        }
        //Addition
        String Add = "" ;
        Add = Add + num1 + num2 + num3 ;
        
        System.out.println("Minimun -> " + Min);
        System.out.println("Maximun -> " + Max);
        System.out.println("Addition -> " + Add);
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int choice = 0 ; 
        do{
            System.out.println("MENU.....\n1.MinMaxAdd for Integer\n2.MinMAxAdd for Real numbers\n3.MinMaxAdd for Charachter\n4.Exit");
            System.out.println("Enter Your Choice : ");
            choice = sc.nextInt();
            
            switch (choice){
                case 1:
                    System.out.println("Enter num1: ");
                    int num1 = sc.nextInt();
                    System.out.println("Enter num2: ");
                    int num2 = sc.nextInt();
                    System.out.println("Enter num3: ");
                    int num3 = sc.nextInt();
                    minMaxAdd(num1 , num2 , num3);
                    break;
                    
                 case 2:
                    System.out.println("Enter num1: ");
                    double rnum1 = sc.nextDouble();
                    System.out.println("Enter num2: ");
                    double rnum2 = sc.nextDouble();
                    System.out.println("Enter num3: ");
                    double rnum3 = sc.nextDouble();
                    minMaxAdd(rnum1 , rnum2 , rnum3);
                    break;
                case 3:
                    System.out.println("Enter char1: ");
                    char c1 = sc.next().charAt(0);
                    System.out.println("Enter char2: ");
                    char c2 = sc.next().charAt(0);
                    System.out.println("Enter char3: ");
                    char c3 = sc.next().charAt(0);
                    minMaxAdd(c1 , c2 , c3);
                    break;         
            }
        
        }
        while(choice!=4);
    }
    
}
