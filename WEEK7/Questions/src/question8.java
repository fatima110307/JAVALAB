


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
public class question8 {
     public static void sort (char[] c){
        
        for (int i=0 ; i<c.length ; i++){
            for (int j=0 ; j<c.length-1-i ; j++){
                if (c[j]>c[j+1]){
                    char temp = c[j];
                    c[j]= c[j+1];
                    c[j+1] = temp;
                }
            } 
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        boolean is_Anagram = true;
            System.out.print("Enter String 1 : ");
            String s1=sc.nextLine().replaceAll("\\s" , "").toLowerCase();
            char [] c1 = s1.toCharArray();
            System.out.print("Enter String 2 : ");
            String s2=sc.nextLine().replaceAll("\\s" , "").toLowerCase();
            char [] c2 = s2.toCharArray();
            if (c1.length==c2.length){
            sort(c1);
            sort(c2);
            for (int i=0 ; i<c1.length ; i++){
                if (c1[i]!=c2[i]){
                    is_Anagram = false;
                    break;
                }
                
            }
            
            }
            else 
                is_Anagram= false;
        if(is_Anagram)
        System.out.println("Is Anagram");
        else
        System.out.println("Is not Anagram");
    }    
}
