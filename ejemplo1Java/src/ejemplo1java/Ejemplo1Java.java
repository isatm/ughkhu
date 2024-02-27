/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo1java;

import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author isabe
 */
public class Ejemplo1Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numC = 0;
        ArrayList<Cliente> clientes;
        clientes = new ArrayList<Cliente>();
        Scanner stdIn = new Scanner(System.in);
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
   
        int numeroT = 0;
        TarjetaCredito tarjetas[];
       
        Cliente clienteUno = new Cliente(dni,nombre,direccion,telefono);
        
        System.out.println(" mi nombre es "+ clienteUno.getNombre());
        
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
        tarjeta = new TarjetaCredito(tipo,numero,fechaCaducidad,clienteUno);
        
        System.out.println(" mi numero de tarjeta es "+ tarjeta.getNumero());
        
        System.out.println(" el nombre del titular es "+ tarjeta.getTitular().getNombre());
        
        
    }
    
}

public static boolean existeCliente(int DNI, ArrayList<Cliente> clientes){
    int numClientes = clientes.size();
    int i = 0;
        while(i<numClientes){
            if()
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
    int numeroT = 0;
    TarjetaCredito tarjetas[];
    Cliente(int dni,String nombre, String direccion,int telefono){
        super(dni,nombre, direccion,telefono);
        this.tarjetas = new TarjetaCredito[10];
    }
    void entregaTarjeta(TarjetaCredito tarjeta){
       tarjetas[numeroT++] = tarjeta;   
    }
    TarjetaCredito getTarjeta(int pos){
    return tarjetas[pos];
    }
    int getNumTarjetas(){
        return numeroT;
    }
}

class TarjetaCredito {
    String tipo;
    int numero;
    String fechaCaducidad;
    Cliente titular;
    TarjetaCredito(String tipo,int numero,String fechaCaducidad, Cliente titular){
        this.tipo= tipo;
        this.numero= numero;
        this.fechaCaducidad= fechaCaducidad;
        this.titular=titular;
        titular.entregaTarjeta(this);
    }
    int getNumero() {
        return numero;
    }
    Cliente  getTitular(){
        return titular;
    }
}

