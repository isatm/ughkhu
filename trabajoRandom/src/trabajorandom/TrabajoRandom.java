/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajorandom;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author isabela Taborda
 */
public class TrabajoRandom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        System.out.println(" INGRESE EL PRIMER NUMERO DEL RANGO ");
        System.out.println(" INICIO ");
        n1 = sc.nextInt();
        
        System.out.println(" FINAL ");
        n2 = sc.nextInt();
        
        AleatoriosEnteros(n1,n2);
        
        System.out.println(" INGRESE EL PRINCIPIO CON NUMERO DOUBLE ");
        double inicio;
        double fina;
        inicio = sc.nextDouble();
        
        System.out.println(" INGRESE EL FINAL ");
        fina = sc.nextDouble();
             
        AleatoriosDouble(inicio, fina);
        
    }
    


//funcion
 public static void AleatoriosEnteros(int inicio, int fin) {
        Random random = new Random();
         Scanner sc = new Scanner(System.in);
        int x;
        System.out.println(" CANTIDAD DE NUMEROS AL SALIR ");
        x = sc.nextInt();
                
        System.out.println("Numeros aleatorios en el rango [" + inicio + ", " + fin + "]:");
        
        int cantidadNumeros = x; // n numero que saldran aleatoriamente

        for (int i = 0; i < cantidadNumeros; i++) {
            int numeroAleatorio = random.nextInt((fin - inicio) + 1) + inicio;  // numero que saldra dentro del rango
            System.out.println(numeroAleatorio);
        }
    }
 
 
 // FUNCION PARA DOUBLE
 
 public static void AleatoriosDouble(double inicio, double fin) {
        Random random = new Random();
         Scanner sc = new Scanner(System.in);
        int x;
        System.out.println(" CANTIDAD DE NUMEROS AL SALIR ");
        x = sc.nextInt();
                

        System.out.println("Numeros aleatorios en el rango [" + inicio + ", " + fin + "]:");
        
        int cantidadNumeros = x; // Cambia esto según tus necesidades
        
        for (double i = 0; i < cantidadNumeros; i++) {
            double numeroAleatorio = random.nextDouble((fin - inicio) + 1) + inicio; // genera el numero aleatorio dentro del rando
            System.out.println(numeroAleatorio);
                       
        }
    }
 
 
 
 
 
 
 
}
      