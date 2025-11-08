/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question6;

/**
 *
 * @author Personal
 */
public class Faculty extends University {
    
    String Faculty_name ;
    
    Faculty(String name , int ranking , String Faculty_name){
        super(name , ranking);
        this.Faculty_name = Faculty_name ;
    }
    
    void showDetails(){
        super.showDetails();
        System.out.println("Faculty name -> " + this.Faculty_name);
    }
}
