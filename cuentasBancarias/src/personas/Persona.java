/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas;
/**
 *
 * @author isabe
 */
public class Persona {
    String nombre;
    int dni;
    String direccion;
    int telefono;
    Persona(int dni, int telefono, String nombre, String direccion){
        this.dni=dni;
        this.telefono = telefono;
        this.direccion = direccion;
        this.nombre = nombre;
    }
    int getDni(){
        return dni;
    }
    int getTelefono(){
        return telefono;
    }
    String getDireccion(){
        return direccion;
    }
    String getNombre(){
        return nombre;
    }
}
