/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question5;

/**
 *
 * @author ACER
 */
import java.io.*;
public class question5 {
    public static void main(String[] args) throws Exception {
        
        FileReader fr = new FileReader("Read.txt");
        BufferedReader br = new BufferedReader(fr);
        
        String line = br.readLine();
        int linecount = 0 ;
        
        while(line!=null){
            linecount++;
            line = br.readLine();
        }
        System.out.println("Number of lines: " + linecount);
        br.close();
        fr.close();
    }
}
