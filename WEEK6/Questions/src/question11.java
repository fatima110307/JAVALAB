/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Personal
 */
import java.util.Scanner;
public class question11 {
    public static void main (String[] args){
       Scanner sc = new Scanner (System.in);
       
       System.out.print("Enter a String (Without spaces): ");
       String str = sc.nextLine();
       
       char ch[] = str.toCharArray();
       boolean b[] = new boolean[ch.length]; 
       
       System.out.println("Frequency of Charachter: ");
       
       for (int i=0 ; i<ch.length ; i++){
           if (b[i]) 
               continue;
           int count=1;
           for (int j = i+1 ; j<ch.length ;j++){
                if (ch[i] == ch[j]){
                    count++;
                    b[j]=true;
                }
            }
           System.out.println(ch[i] + " : " + count);
       } 
       sc.close();
    }
}
