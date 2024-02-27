/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaanimals1;
import java.util.Scanner;

 //Importamos la clase Animal para poder usarl
/**
 *
 * @author malba
 */
public class JavaAnimals1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner stdIn = new Scanner(System.in);
        String entrada;
        
       
        System.out.print("Nombre...");
        entrada= stdIn.nextLine();
        System.out.println(" El nombre es "+ entrada);
        
        System.out.print("Peso...");
        int i = stdIn.nextInt();
        System.out.println(" El peso es "+ i);
        
        Animal animalUno = new Animal(i,entrada);
        System.out.println(" mi nombre es "+ animalUno.nombre());
        System.out.println(" mi peso es "+ animalUno.peso());
         String n;
        System.out.print("Ingrese otro Nombre...");
        n = stdIn.next();
        System.out.println(" El Nombre es "+ n);
        System.out.print("Ingrese otro Peso...");
        int pesando = stdIn.nextInt();
        System.out.println(" El peso es "+ pesando);
        Animal animalDos = new Animal(pesando,n);
        System.out.println(" mi nombre es "+ animalDos.nombre());
        System.out.println(" mi peso es "+ animalDos.peso());
        stdIn.close();
    }
    
}
class Animal {
    int peso;
    String nombre;
    public Animal(int peso, String nombre) {
        this.peso=peso;
        this.nombre=nombre;
    }
    int peso() {
        return peso;
    }
    String nombre() {
        return nombre;
    }
}