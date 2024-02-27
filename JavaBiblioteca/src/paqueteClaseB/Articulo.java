/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteClaseB;

/**
 *
 * @author isabe
 */
public abstract class Articulo{
    String nombre;
    String tipo;
    int fecha;
public Articulo(String nombre, String tipo, int fecha){
    this.nombre = nombre;
    this.fecha = fecha;
    this.tipo = tipo;
}
public String getNombre(){
    return nombre;
}
public String getTipo(){
    return tipo;
} 
public int getFecha(){
    return fecha;
}
void Tamaño(){
    System.out.println("---> Tamaño ");
}
}
