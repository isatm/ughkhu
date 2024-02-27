/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteClase;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.ArrayList;
/**
 *
 * @author isabe
 */
public class Distancia {
    public static void EncontrarDistancia(ArrayList<Punto> puntos, int n){ //*
        double distanciaMen = 342432342; //Centila
        double distancia = 5463357; // Limites
        int punto_1 = 0;
        int punto_2 = 0;
          for(int i = 0; i < n; i++){
              for(int j = 0; j < n; j++){
                  if(i != j){ //i y j deben ser diferentes para no analizar el mismo punto
                    distancia = sqrt(pow(puntos.get(i).getX() - puntos.get(j).getX(),2)+pow(puntos.get(i).getY() - puntos.get(j).getY(),2)+pow(puntos.get(i).getZ() - puntos.get(j).getZ(),2));
                  }
                  if(distancia < distanciaMen){
                      distanciaMen = distancia;
                      punto_1 = i;
                      punto_2 = j;
                  }
              }
          }
        System.out.println("La distancia menor es: " + distanciaMen);
        System.out.println("La distancia minima va desde el punto " + (punto_1 + 1) + " hasta el punto " + (punto_2 + 1)); //+ 1 porque es una situación real
    }
}
