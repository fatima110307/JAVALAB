/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question2;

/**
 *
 * @author ACER
 */
public class University {
    String name ; 
    int ranking ; 
    
    University(String name , int ranking){
        this.name = name ; 
        this.ranking = ranking ; 
    }
    
    void Details(){
        System.out.println("University details");
        System.out.println("University Name-> " + this.name);
        System.out.println("University Ranking -> " + this.ranking);
        System.out.println("_______________________________________");
    }
}
