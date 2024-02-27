/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstractanimal;

/**
 *
 * @author isabe
 */
public class AbstractAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    }
    
}
abstract class Animal{
    public String nombre;
    public String color;
    public double peso;
Animal(String nombre, String color, int peso)
{
    this.nombre = nombre;
    this.color = color;
    this.peso = peso;
}
    abstract String expresion();
    
    
}
