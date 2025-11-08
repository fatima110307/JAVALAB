/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class question5 {
    public static void main(String [] args){
        
        System.out.println("Prime number between 1 to 100");
        for (int i = 1 ; i<=100 ; i++ ){
            boolean Isprime = true;
            for (int j = 2  ; j <= Math.sqrt(i) ; j++){
                
                if (i%j == 0){
                    Isprime = false;
                    break;
            }
            
            }
            if (Isprime)
                System.out.print(i + "  ");
                
        
    }
}
}