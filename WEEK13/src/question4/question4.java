/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question4;

/**
 *
 * @author ACER
 */
import java.io.*;
public class question4 {
   
    public static void main(String[] args) throws Exception{
        
        FileReader fr = new FileReader("Read.txt");
        
        int c = fr.read();
        int charcount=0;
        while(c>=0){
            charcount++;
            c = fr.read();
        }
        System.out.println("Total number of charachter = " + charcount);
        fr.close();
    }
}
