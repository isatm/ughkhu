/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package distanciapuntos; import paqueteClase.*; import paqueteClase.Distancia;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.*;
/**
 *
 * @author isabela taborda
 */
public class DistanciaPuntos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       ArrayList <Punto> puntos = new ArrayList<>(); //*
       
        System.out.println("Ingrese la cantidad de puntos");
        int n = leer.nextInt();
        //Punto[] puntos = new Punto[n]; // vector para contener adentro los puntos
         for (int i = 0; i < n; i++) {
            System.out.println("Ingrese las coordenadas para el punto " + (i + 1) + ":");  // i + 1 para que no incicie en 0           
            System.out.print("x: ");
            double x = leer.nextDouble();
            System.out.print("y: ");
            double y = leer.nextDouble();
            System.out.print("z: ");
            double z = leer.nextDouble();

            Punto npunto = new Punto(x, y, z); //*
            puntos.add(npunto); //*
        }
         
        Distancia.EncontrarDistancia(puntos, n); //*
    }
}
