/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question1;

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String name , phone_no;
        
        System.out.print("Enter the name of the person: ");
        name = sc.nextLine();
        System.out.print("Enter the phone_no: ");
        phone_no = sc.nextLine();
        
        Person p1 = new Person(name , phone_no);
        
        System.out.println("Enter the Adress details..");
        System.out.print("House no : ");
        String house_no = sc.nextLine();
        System.out.print("Strret : ");
        String street = sc.nextLine();
        System.out.print("City : ");
        String city = sc.nextLine();
        System.out.print("Sate : ");
        String state = sc.nextLine();
        
        Person.Address address = p1.new Address(house_no , street , city , state);
        
        System.out.println("Enter Birthdate details...");
        System.out.print("Date : ");
        String date = sc.nextLine();
        System.out.print("Month : ");
        String Month = sc.nextLine();
        System.out.print("Year : ");
        String Year = sc.nextLine();
        
        Person.DateOfBirth dob = p1.new DateOfBirth(date , Month , Year);
        
        p1.display(address, dob);
    }
}
