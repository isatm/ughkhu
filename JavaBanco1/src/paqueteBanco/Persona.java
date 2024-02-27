/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteBanco;

/**
 *
 * @author isabe
 */
public class Persona {
   public int dni;
    public String nombre;
    public String direccion;
    public int telefono;
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
