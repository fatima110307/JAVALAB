/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package question1;

/**
 *
 * @author ACER
 */
import java.io.*;
public class Question1 {

    public static void main(String[] args) throws Exception {
       File f = new File ("abc.txt");
       if (f.createNewFile()){
           System.out.println("New File Created");
       }
       else
            System.out.println("File already exist");
    } 
}
