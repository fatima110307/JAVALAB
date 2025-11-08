/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question2;

import java.util.Scanner;

/**
 *
 * @author Personal
 */
import java.util.Scanner;
public class Edible {
    
    static class Fruit{
        static String name ;
        String Is_packed;
        static void fruitDetails(){
            System.out.println("Name of the Fruit -> " + name);
        }
        
        void fruitPackaging(){
            System.out.println("Is Packed -> " + this.Is_packed );
        }
    }
    
    static class Vegetable{
        static String name ;
        String Is_packed;
        static void VegetableDetails(){
            System.out.println("Name of the Fruit -> " + name);
        }
        
        void VegetablePackaging(){
            System.out.println("Is Packed -> " + this.Is_packed );
        }
    }
    
     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Edible e1 = new Edible();
        
        Fruit f1 = new Fruit();
        
        System.out.print("Name of the Fruit: ");
        f1.name = sc.nextLine();
        System.out.print("Is Packaged: ");
        f1.Is_packed = sc.nextLine();
        Edible.Fruit.fruitDetails();
        f1.fruitPackaging();
        
        Vegetable v1 = new Vegetable();
        
        System.out.print("Name of the Fruit: ");
        v1.name = sc.nextLine();
        System.out.print("Is Packaged: ");
        v1.Is_packed = sc.nextLine();
        Edible.Vegetable.VegetableDetails();
        v1.VegetablePackaging();
    }
}
