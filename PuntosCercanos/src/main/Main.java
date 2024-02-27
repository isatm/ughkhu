package main;
import objetos.*;
import java.util.Scanner;
import java.util.ArrayList;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Punto> puntos = new ArrayList<>();
        
        System.out.println("Numeros de puntos: ");
        int tamano = leer.nextInt();
        
        for(int i = 0; i < tamano; i++){
            System.out.println("Ingresar X del punto " + (i+1) + ":");
            int x = leer.nextInt();
            System.out.println("Ingresar Y del punto " + (i+1) + ":");
            int y = leer.nextInt();
            System.out.println("Ingresar Z del punto " + (i+1) + ":");
            int z = leer.nextInt();
            System.out.println();
            
            Punto puntoCreado = new Punto(x, y, z);
            puntos.add(puntoCreado);
        }
        
        distanciaCorta(puntos);
    }
    
    static void distanciaCorta(ArrayList<Punto> puntos){
        double distancia = 0;
        double distanciaMenor = 100;
        int p1 = 0;
        int p2 = 0;
        for(int punto1 = 0; punto1 < puntos.size(); punto1++){
            for(int punto2 = 0; punto2 < puntos.size(); punto2++){
                if(punto1 != punto2){
                    distancia = sqrt(pow((puntos.get(punto1).x - puntos.get(punto2).x), 2) +  pow((puntos.get(punto1).y - puntos.get(punto2).y), 2) + pow((puntos.get(punto1).z - puntos.get(punto2).z), 2));   
                    System.out.println(distancia);
                    if (distancia < distanciaMenor){
                        distanciaMenor = distancia;
                        p1 = punto1 + 1;
                        p2 = punto2 + 1;
                    }
                }
            }
        }
        
        
        if(distancia != 0){
            System.out.println("Punto " + p1 + " hasta Punto " +  p2);
        }else{
            System.out.println("Todos son el mismo punto");
        }
    }
}


