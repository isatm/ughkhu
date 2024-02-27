/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colegioabstract;
import java.util.Scanner;
/**
 *
 * @author isabe
 */
public class ColegioAbstract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          // Crear una asignatura
         Scanner sc = new Scanner(System.in);
         
         String a, Ttarjeta, nombre;
         int ntarjeta;
         System.out.println(" Ingrese el nombre de la Asignatura del estudiante");
         a = sc.next();
         
        Asignatura.obtenern(a);
        
         System.out.println(" Ingrese el nombre de un estudiante ");
         nombre = sc.next();
        
        System.out.println(" Tipo de tarjeta ");
        Ttarjeta = sc.next();
        
        System.out.println(" numero de la tarjeta ");
        ntarjeta = sc.nextInt();
        // Crear un estudiante
        Estudiante estudiante = new Estudiante(Ttarjeta, ntarjeta, nombre);
        
        
        
        System.out.println(" Ingrese el nombre de un Profesor ");
         nombre = sc.next();
        
                
        System.out.println(" Tipo de tarjeta ");
        Ttarjeta = sc.next();
        
        System.out.println(" numero de la tarjeta ");
        ntarjeta = sc.nextInt();
        
        
        // Crear un profesor
        Profesor profesor = new Profesor(ntarjeta, Ttarjeta, nombre);
        String area;
        System.out.println(" Ingrese el Area del profesor ");
        area = sc.next();
        
        Profesor.obtenerarea(area);
        
        System.out.println("El area del profesor es: "+ Profesor.getArea());
        
        // Mostrar información
        System.out.println("Asignatura: " + Asignatura.getnombreA());
        System.out.println("Estudiante: " + estudiante.getNombre() + ", Tipo de tarjeta: " + estudiante.tipoTarjeta() + ", Número de tarjeta: " + estudiante.tarjeta());
        System.out.println("Profesor: " + profesor.getNombre() + ", Tipo de tarjeta: " + profesor.tipoTarjeta() + ", Número de tarjeta: " + profesor.tarjeta());
    }
    
}

abstract class Persona{
    String nombre;
public Persona(String nombre){
    this.nombre = nombre;
}
abstract int tarjeta();
abstract String tipoTarjeta();
public String getNombre(){
    return nombre;
}
}

class Estudiante extends Persona{
   int ntarjeta; 
   String tipoT;
Estudiante(String tipoT, int ntarjeta, String nombre){
super(nombre);
    this.ntarjeta = ntarjeta;
    this.tipoT = tipoT;
}           
   @Override
    String tipoTarjeta() {
        return tipoT;
    }
    @Override
    int tarjeta() {
        return ntarjeta;
    }
    
}

class Profesor extends Persona{
static String area;
int numTarjeta;
String tipo;
Profesor(int numTarjeta, String tipo, String nombre){
super(nombre);
    this.numTarjeta = numTarjeta;
    this.tipo = tipo;
}

@Override
    String tipoTarjeta() {
        return tipo;
    }
    @Override
    int tarjeta() {
        return numTarjeta;
    }
    static String getArea(){
        return area;
    }
    static void obtenerarea(String a){
        area = a;
    }
}
 class Asignatura{    
     static String nombreAsignatura;
     static int intensidadHoraria;
   
 static String getnombreA(){
        return nombreAsignatura;
 } 
 static void obtenern(String nombre){
     nombreAsignatura = nombre;
        
 }
 
 static int getIntensidad(){
     return intensidadHoraria;
 }
 
 static void obtenerIntensidad(int inten){
     intensidadHoraria = inten;
 }
 
}
