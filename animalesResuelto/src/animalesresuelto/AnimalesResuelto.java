/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animalesresuelto;
import java.util.Scanner;

/**
 *
 * @author isabe
 */
public class AnimalesResuelto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner stdIn = new Scanner(System.in);
        String entrada;
        
       
        System.out.print("Nombre...");
        entrada= stdIn.next();
        System.out.println(" El nombre es "+ entrada);
        
        System.out.print("Peso...");
        int i = stdIn.nextInt();
        System.out.println(" El peso es "+ i);
       
        
        Animal animalUno = new Animal(i,entrada);
        System.out.println(" mi nombre es "+ animalUno.nombre());
        System.out.println(" mi peso es "+ animalUno.peso());
        System.out.print("Ingrese otro Nombre...");
        entrada = stdIn.next();
        
        
        System.out.println(" El Nombre es "+ entrada);
        System.out.print("Ingrese otro Peso...");
        i = stdIn.nextInt();
        System.out.println(" El peso es "+ i);
        
        
        Animal animalDos = new Animal(i,entrada);
        
        
        System.out.println(" mi nombre es "+ animalDos.nombre());
        System.out.println(" mi peso es "+ animalDos.peso());
        
          System.out.print("Nombre...");
        entrada= stdIn.next();
        System.out.println(" El nombre es "+ entrada);
        
        System.out.print("Peso...");
        i = stdIn.nextInt();
        System.out.println(" El peso es "+ i);
        String x,y;
        System.out.print("Raza...");
        x= stdIn.next();
        System.out.println("La raza es "+ x);
        
        System.out.print("Color...");
        y= stdIn.next();
        System.out.println(" El Color es "+ y);
        
        Perro perro1 = new Perro(i,entrada,x,y);
         System.out.println(" mi nombre es "+ perro1.nombre());
        System.out.println(" mi peso es "+ perro1.peso());
         System.out.println(" mi Raza es "+ perro1.raza());
        System.out.println(" mi Color es "+ perro1.color());
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
 class Perro extends Animal{
     String raza;
     String color;
     public Perro(int peso, String nombre, String raza, String color){
     super(peso,nombre);
     this.raza = raza;
     this.color = color;
    }
     String raza(){
         return raza;
     }
     String color(){
         return color;
     }
 }