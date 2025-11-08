/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question10;

/**
 *
 * @author Personal
 */
public class Student {
    
    int rollNo;
    String name ; 
    int marks ;
    static String SchoolName;
    
    void setdetails(int rollNo , String name , int marks , String Schoolname){
        this.rollNo = rollNo ;
        this.name = name;
        this.marks = marks ;
        this.SchoolName = Schoolname; 
    }
    
    void showDetails(){
        System.out.println("Name -> " + this.name);
        System.out.println("Roll No -> " + this.rollNo);
        System.out.println("Marks -> " + this.marks);
        System.out.println("School Name -> " + this.SchoolName);
        System.out.println("_____________________________________");
    }
    void changeSchoolName (String newSchoolname){
        this.SchoolName = newSchoolname;
    }
}
