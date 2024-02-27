/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas;
import java.util.Scanner;
import java.util.*;
/**
 *
 * @author isabe
 */
public class Persona {
    private int dni;
    private String nombre;
    private String direccion;
    private int telefono;
public    Persona(int dni,String nombre, String direccion,int telefono)
    {
        this.dni=dni;
        this.direccion=direccion;
        this.nombre= nombre;
        this.telefono=telefono;
    }
public    int getDNI() {
        return dni;
    }
public    String getNombre(){
        return nombre;
    }
public    String getDireccion(){
        return direccion;
       
    }
public    int getTelefono(){
        return telefono;
    }            
            
}
