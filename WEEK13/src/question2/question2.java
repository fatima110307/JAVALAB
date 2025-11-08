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
import java.util.Scanner;
public class question2 {
    public static void main(String[] args) throws Exception{
        
        FileWriter fw = new FileWriter("question2.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the contents of the file: ");
        String content = sc.nextLine();
        bw.write(content);
        bw.close();
        fw.close();
    }
}
