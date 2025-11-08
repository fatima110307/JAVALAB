/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question2;

/**
 *
 * @author ACER
 */
public class Faculty extends University {
    String name ; 
     
    Faculty(String name , String Faculty_name , int ranking){
        super(name , ranking);
        this.name = Faculty_name ;
    } 
     
    void Details(){
        super.Details();
        System.out.println("Faculty Details ");
        System.out.println("Faculty name -> " + this.name);
        System.out.println("_______________________________________________");
    }
}
