/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question4;

/**
 *
 * @author ACER
 */
public class MultiFunctionMachine implements Printer , Scanner {
   
    public void connect(){
        System.out.println("Connected");
    }
    
    public void details(){
    Printer.super.details();
    Scanner.super.details();
    }
    
}
