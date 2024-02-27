/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nextejemplo;
import java.util.*;
/**
 *
 * @author isabe
 */
public class NextEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
             Scanner cadena = new Scanner(System.in);
        //solucion usando dos nextLine
        System.out.println("Ingrese su numero de ID ");
        int Id = cadena.nextInt();
        cadena.nextLine();
        System.out.println("Ingrese su nombre ");
        String nombre = cadena.nextLine();
        System.out.println("su numero de identificacion es: "+Id);
        System.out.println("Su nombre es: "+nombre);
        
        // solucion 2 un scanner diferente para las nextLine
        
        Scanner otro = new Scanner(System.in);
        System.out.println("IIngrese su celular ");
        int celular = otro.nextInt();
        System.out.println("Ingrese su carrera ");
        String carrera = cadena.nextLine();
        System.out.println("Su carrera es "+carrera);
        System.out.println("Su numero celular es "+ celular);
    }
    
}
