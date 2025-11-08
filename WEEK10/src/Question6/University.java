/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question6;

/**
 *
 * @author Personal
 */
public class University {
    String name ; 
    int ranking ; 
    
    University(String name , int ranking){
        this.name = name ;
        this.ranking = ranking;
    }
    
    void showDetails(){
        System.out.println("University Name -> " + this.name);
        System.out.println("Ranking -> " + this.ranking);
    }
}
