/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question1;

/**
 *
 * @author ACER
 */
public class Person {
    String name ;
    String Phone_no ; 
      
    Person(){}
    Person(String name , String Phone_no){
        this.name = name ; 
        this.Phone_no = Phone_no;
    }
    
    class Address{
        String House_no;
        String Street ;
        String city;
        String state ; 
        Address(){}
        Address(String House_no , String Street , String City , String state){
            this.House_no = House_no ; 
            this.Street = Street ; 
            this.city = City ; 
            this.state = state ;
        }
        
        void DisplayAdd(){
            System.out.println("Address -> " + this.House_no  + ", "  + this.Street + " ,"  + this.city + ", " + this.state );
        }
    }
    
    class DateOfBirth{
        String Day ; 
        String month ;
        String year ; 
        DateOfBirth(){}
        DateOfBirth(String Day , String month , String year){
            this.Day = Day ; 
            this.month = month ; 
            this.year = year ; 
        }
        
        void DisplayDOB(){
            System.out.println("Date of Birth -> " + this.Day + " / " + this.month + " / " + this.year );
        }
    }
    
    Address Address (String House_no , String Street , String City , String state){
        Address address = new Address(House_no , Street , City , state);
        return address;
    }
    
    DateOfBirth DateOfBirth (String day , String month , String year ){
        DateOfBirth dob = new DateOfBirth(day , month , year);
        return dob;
    }
    void display(Address address , DateOfBirth dob){
        System.out.println("Name -> " + this.name);
        System.out.println("Phone number -> " + this.Phone_no);
        address.DisplayAdd();
        dob.DisplayDOB();
    }
}
