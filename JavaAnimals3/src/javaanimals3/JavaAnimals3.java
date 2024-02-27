/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
// AUTHOR: Mauricio Alba
// POO FUNDAMENTALS 2023-3
// 
package javaanimals3;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author malba
 */
public class JavaAnimals3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Animal> animales;
        animales = new  ArrayList<Animal>();
        // TODO code application logic here
        Scanner stdIn = new Scanner(System.in);
        String nombre,raza,color,especie;
        
        System.out.println("Un Perro ");
        System.out.print("  Nombre...");
        nombre= stdIn.nextLine();
        //System.out.println(" El nombre es "+ entrada);
        
        System.out.print("   Peso...");
        int peso = stdIn.nextInt();
        //System.out.println(" El peso es "+ i);
        
        System.out.print("   Raza...");
        raza= stdIn.next();
        
        System.out.print("   Color...");
        color= stdIn.next();
        
         System.out.print("   especie...");
         especie= stdIn.next();
        
        Perro perroUno;
        perroUno = new Perro(peso,nombre,raza,color,especie);
        animales.add(perroUno);
        System.out.println(" mi nombre es "+ perroUno.nombre());
        System.out.println(" mi peso es "+ perroUno.peso());
        System.out.println(" mi color es "+ perroUno.color());
        System.out.println(" mi raza es "+ perroUno.raza());
        
        System.out.println(" mi especie es "+ perroUno.especie());
        perroUno.expresion();
        
        System.out.println("Un Pajaro ");
        System.out.print("  Nombre...");
        nombre= stdIn.next();
        
        System.out.print("   Peso...");
        peso = stdIn.nextInt();
        System.out.print("   especie...");
        especie= stdIn.next();
        
        
        System.out.print("   ¿canta? (true/false) ");
        boolean canta=stdIn.nextBoolean();
        
        Pajaro pajaroUno = new Pajaro(peso,nombre,canta,especie);
        animales.add(pajaroUno);
        System.out.println(" mi nombre es "+ pajaroUno.nombre());
        System.out.println(" mi peso es "+ pajaroUno.peso());
        System.out.println(" ¿canto?  "+ pajaroUno.canta());
        System.out.println(" mi especie es "+ pajaroUno.especie());
        pajaroUno.expresion();
        
        System.out.println("  Un caballo ");
        
        System.out.print("  Nombre...");
        nombre= stdIn.next();
        //System.out.println(" El nombre es "+ entrada);
        
        System.out.print("   peso...");
        peso = stdIn.nextInt();
        //System.out.println(" El peso es "+ i);
        
        System.out.print("   Raza...");
        raza= stdIn.next();
        
        System.out.print("   Color...");
        color= stdIn.next();
        
         System.out.print("   especie...");
         especie= stdIn.next();
        
        Caballo caballoUno;
        caballoUno = new Caballo(peso,nombre,especie,color,raza);
        animales.add(caballoUno);
        System.out.println(" mi nombre es "+ caballoUno.nombre());
        System.out.println(" mi peso es "+ caballoUno.peso());
        System.out.println(" mi color es "+ caballoUno.color());
        System.out.println(" mi raza es "+ caballoUno.raza());
        
        System.out.println(" mi especie es "+ caballoUno.especie());
        caballoUno.expresion();
                
                
        int numAnimales= animales.size();       
        int i=0;
        while(i<numAnimales){
           Animal unAnimal = animales.get(i);
            System.out.println(" soy un: " + unAnimal.especie());
            unAnimal.expresion();
            i++;
            
      }
        stdIn.close();
    }
    
}

class Animal {
    int peso;
    String nombre;
    private String especie;
    public Animal(int peso, String nombre, String especie) {
        this.peso=peso;
        this.nombre=nombre;
        this.especie = especie; //rosado es el atributo y lo negro es el parametro
    }
    int peso() {
        return peso;
    }
    String nombre() {
        return nombre;
    }
        String especie(){
    return especie;
    }
    void expresion(){
        System.out.println("---> Expresion ");
    }
}

class Perro extends Animal {
    String raza;
    String color;
    Perro(int peso, String nombre, String raza, String color, String especie ){
        
        super (peso, nombre,especie);
        this.raza = raza;
        this.color=color;
        
    }
    public String raza() {
        return raza;
    }
    public String color() {
        return color;
    } 
     // expresion redefinida 
    @Override
    void expresion(){
        System.out.println("---> ladrido ");
    }
    
}

class Pajaro extends Animal {
    boolean canta;
    
    Pajaro(int peso, String nombre, boolean canta, String especie) {
        super(peso,nombre, especie);
        this.canta=canta;
    }
    boolean canta(){
        return canta;
    }
        void expresion(){
        System.out.println("---> trino ");
    }
}

class Caballo extends Animal{
    String color;
    String raza;
    Caballo(int peso, String nombre, String especie, String color, String raza) {
        super(peso,nombre, especie);
        this.color = color;
        this.raza = raza;
    }
    String color(){
        return color;
    }    
    String raza(){
        return raza;
    }
        void expresion(){
        System.out.println("---> Relincho ");
    }
    
}
