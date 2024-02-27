/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteClase;
import java.util.*; //*
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
/**
 *
 * @author isabe
 */
public class Punto {
   final private double x; //Las coordenadas no pueden cambiar
   final private double y;
   final private double z;
public Punto(double x, double y, double z){
    this.x = x;
    this.z = z;
    this.y = y;
}
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getZ() {
        return z;
    }
}
