/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class question4 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        char [] CharArr = str.toCharArray();
        
        boolean IsPalindrome = true;
        
        for ( int i=0 ; (i<CharArr.length/2) ; i++){
            if (CharArr[i]!= CharArr[CharArr.length-1-i])
                IsPalindrome = false ;
                break;
        }
        
        if(IsPalindrome)
            System.out.println(str+" Is a Palindrome.");
        else
           System.out.println(str+" Is NOT a Palindrome.");
        sc.close();
    }
}
