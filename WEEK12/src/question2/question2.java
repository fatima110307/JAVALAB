/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question2;

/**
 *
 * @author ACER
 */
import java.io.*;
public class question2 {
    
    public static void function1() throws FileNotFoundException {
        FileReader file = new FileReader("abc.txt");
    }
    
    public static void function2() throws Exception{
        function1();
    }
    
    public static void main(String[] args) {
         try{
             function2();
         }
         catch(Exception e){
             System.out.println("Error occured");
         }
         
         System.out.println("Rest of the code.......");
    }
}
