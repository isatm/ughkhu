/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaexception1;
import java.io.*;
/**
 *
 * @author isabe
 */
public class JavaException1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int numerador = 1;
    int denominador = 0;            
    
    try{
        System.out.println(numerador/denominador);
    }
    catch(ArithmeticException e){
        System.out.println("divide entre 0");
    }
    
    }
    
}
