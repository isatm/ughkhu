/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animalpreferido;
import java.util.Scanner;        

/**
 *
 * @author isabe
 */
public class AnimalPreferido {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        // TODO code application logic here
        String entrada;
        System.out.print("Nombre...");
        entrada= stdIn.next();
        System.out.println(" El nombre es "+ entrada);
        
        System.out.print("Peso...");
        int i = stdIn.nextInt();
        System.out.println(" El peso es "+ i);
        String x,y,v;
        System.out.print("Raza...");
        x= stdIn.next();
        System.out.println("La raza es "+ x);
        
        System.out.print("Color...");
        y= stdIn.next();
        System.out.println(" El Color es "+ y);
         System.out.print("Vuela o no vuela...");
         v = stdIn.next();
        System.out.println(" El pajaro "+ v +" vuela");
        
        Pajaro pajaro1 = new Pajaro(i,entrada,x,y,v);
        System.out.println(" mi nombre es "+ pajaro1.nombre());
        System.out.println(" mi peso es "+ pajaro1.peso());
        System.out.println(" mi Raza es "+ pajaro1.raza());
        System.out.println(" mi Color es "+ pajaro1.color());
        System.out.println(" El pajaro "+ pajaro1.volar() + " vuela");
        stdIn.close();
    }
    }
    
class Animal {
    int peso;
    String nombre;
    public Animal(int peso, String nombre) {
        this.peso=peso;          // this es para que peso sea un parametro y no un atributo
        this.nombre=nombre;
    }
    int peso() {
        return peso;
    }
    String nombre() {
        return nombre;
    }
}
 class Pajaro extends Animal{
     String raza;
     String color;
     String volar;
     public Pajaro(int peso, String nombre, String Raza, String Color,String volar){
         super(peso,nombre);
         this.raza = raza;
         this. color = color;
         this.volar = volar;
     }
      String raza(){
         return raza;
     }
     String color(){
         return color;
     }
     String volar(){
         return volar;
     }
     }
     