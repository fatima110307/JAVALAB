/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question3;

/**
 *
 * @author ACER
 */
import java.io.*;

public class question3 {
    public static void main(String[] args) throws Exception {
        
        FileReader fr = new FileReader("Read.txt");
        FileWriter fw = new FileWriter("Write.txt");
        
        int c = fr.read();
        while (c!= -1){
            fw.write(c);
            c = fr.read();
        }
        
        fr.close();
        fw.close();
    }
}
