/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejemplo;

import java.util.Scanner;

/**
 *
 * @author estuam
 */
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner stdIn = new Scanner(System.in);
        
        // DATOS DEL CLIENTE
        String nombre,direccion;
        System.out.print("Nombre cliente..");
        nombre= stdIn.next();
        //System.out.println(" El nombre es "+ entrada);
        
        System.out.print("DNI...");
        int dni = stdIn.nextInt();
        //System.out.println(" El peso es "+ i);
        
        System.out.print("Direccion...");
        direccion= stdIn.next();
        
        System.out.print("Telefono...");
        int telefono = stdIn.nextInt();
        
        // CREACIÓN DEL OBJETO Cliente con los datos
        
        Cliente clienteUno = new Cliente(dni,nombre,direccion,telefono);
        
        System.out.println(" mi nombre es "+ clienteUno.getNombre());
        
        //DATOS DE LA TARJETA DE CRÉDITO
        String tipo,fechaCaducidad;
                    
        System.out.print("Tipo de la tarjeta..");
        tipo= stdIn.next();
        //System.out.println(" El nombre es "+ entrada);
        
        System.out.print("Numero de la tarjeta...");
        int numero = stdIn.nextInt();
        //System.out.println(" El peso es "+ i);
        
        System.out.print("Fecha caducidad...");
        fechaCaducidad= stdIn.next();
        
        TarjetaCredito tarjeta;
        // CREACIÓN DEL OBJETO DE LA CLASE TarjetaCredito CON EL Cliente compo titular
        tarjeta = new TarjetaCredito(tipo,numero,fechaCaducidad,clienteUno);
        
        System.out.println(" mi numero de tarjeta es "+ tarjeta.getNumero());
        
        // EL LLAMADO AL MÉTODO tarjeta.getTitular() RETORNA EL OBJETO Cliente
        // EL LLAMADO tarjeta.getTitular().getNombre() INCLUYE DOS MÉTODOS
        // Y RETORNA EL NOMBRE DEL OBJETO Cliente
        System.out.println(" el nombre del titular es "+ tarjeta.getTitular().getNombre());
        
        
        
    }
    
}

class Persona {
    private int dni;
    private String nombre;
    private String direccion;
    private int telefono;
    Persona(int dni,String nombre, String direccion,int telefono)
    {
        this.dni=dni;
        this.direccion=direccion;
        this.nombre= nombre;
        this.telefono=telefono;
    }
    int getDNI() {
        return dni;
    }
    String getNombre(){
        return nombre;
    }
    String getDireccion(){
        return direccion;
       
    }
    int getTelefono(){
        return telefono;
    }            
            
}

class Cliente extends Persona {
    
    Cliente(int dni,String nombre, String direccion,int telefono){
        super(dni,nombre, direccion,telefono);
    }
}

class TarjetaCredito {
    String tipo;
    int numero;
    String fechaCaducidad;
    // IMPLEMENTACION DE LA RELACIÓN CON Cliente USANDO UN ATRIBUTO Titular
    Cliente titular;        
    TarjetaCredito(String tipo,int numero,String fechaCaducidad, Cliente titular){
        this.tipo= tipo;
        this.numero= numero;
        this.fechaCaducidad= fechaCaducidad;
        this.titular=titular;
    }
    int getNumero() {
        return numero;
    }
    Cliente  getTitular(){
        return titular;
    }
}