/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabanca1arraylistmain;

import java.util.ArrayList;
import java.util.Scanner;

import java.util.Arrays;
/**
 *
 * @author malba
 */
public class JavaBanca1ArrayListMain {




    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numClientes=0;
    
        // ARRAY LIST
        ArrayList<Cliente> clientes;
        clientes= new ArrayList<Cliente>();
        
        ArrayList<TarjetaCredito> tarjetas;
        tarjetas= new ArrayList<TarjetaCredito>();
        
        
        Scanner stdIn = new Scanner(System.in);
        String nombre,direccion;
       
        
// CLIENTE 1
            
        System.out.print("Nombre cliente 1..");
        nombre= stdIn.next();
        //System.out.println(" 1 El nombre es "+ entrada);
        System.out.print("DNI 1...");
        int dni = stdIn.nextInt();
        //System.out.println(" 1 El DNI es "+ i);
        
        System.out.print("Direccion 1...");
        direccion= stdIn.next();
        
        System.out.print("Telefono 1...");
        int telefono = stdIn.nextInt();
        
        
        Cliente clienteUno = new Cliente(dni,nombre,direccion,telefono);
        
        System.out.println(" 1 mi nombre es "+ clienteUno.getNombre());
        
        clientes.add(clienteUno);
        
        System.out.print("Tipo tarjeta...");
        String tipo= stdIn.next();
        
        System.out.print("Numero...");
        int numero = stdIn.nextInt();
        
        System.out.print("Fecha de caducidad...");
        int caducidad = stdIn.nextInt();
        
        TarjetaCredito tarjetaUno;
        tarjetaUno = new TarjetaCredito(tipo, numero, direccion, clienteUno);
        
        tarjetas.add(tarjetaUno);
        
        
        System.out.println(" # de clientes "+ clientes.size());
        
        System.out.print("Nombre cliente 2..");
        nombre= stdIn.next();
        //System.out.println(" El nombre es "+ entrada);
        
        System.out.print("DNI 2...");
        dni = stdIn.nextInt();
        //System.out.println(" El peso es "+ i);
        
        System.out.print("Direccion 2...");
        direccion= stdIn.next();
        
        System.out.print("Telefono 2...");
        telefono = stdIn.nextInt();
        
        
        
         // CLIENTE 2
        Cliente clienteDos;
        clienteDos= new Cliente(dni,nombre,direccion,telefono);
        clientes.add(clienteDos);
        
        System.out.print("Tipo tarjeta cliente 2...");
        tipo= stdIn.next();
        
        System.out.print("Numero tarjeta 2...");
        numero = stdIn.nextInt();
        
        System.out.print("Fecha de caducidad tarjeta 2...");
        caducidad = stdIn.nextInt();
        
        TarjetaCredito tarjetaDos;
        tarjetaDos = new TarjetaCredito(tipo, numero, direccion, clienteDos);
        
        tarjetas.add(tarjetaDos);
        
        System.out.print("Tipo tarjeta 3...");
        tipo= stdIn.next();
        
        System.out.print("Numero tarjeta 3...");
        numero = stdIn.nextInt();
        
        System.out.print("Fecha de caducidad tarjeta 3...");
        caducidad = stdIn.nextInt();
        
        TarjetaCredito tarjetaTres;
        tarjetaTres = new TarjetaCredito(tipo, numero, direccion, clienteDos);
        
        tarjetas.add(tarjetaTres);
        
        // CONSULTAS
        System.out.println(" # de tarjetas "+ tarjetas.size());
        int busca=1;
        while (busca !=0) {
            System.out.println("NUMERO DE DNI...");
            dni = stdIn.nextInt();
            boolean existe = existeCliente(dni,clientes);
        // 
            System.out.println("el CLIENTE con DNI..."+dni);
            if (existe){
                System.out.println("EXISTE");
            Cliente clienteEncontrado = null;
            for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getDNI() == dni) {
                clienteEncontrado = clientes.get(i);
            }
            
            if (clienteEncontrado != null) {
            // Muestra las tarjetas del cliente
            ArrayList<TarjetaCredito> tarjetasCliente = clienteEncontrado.getTarjetaCredito();
            System.out.println("El cliente con el DNI: " + dni + " tiene las siguientes tarjetas:");
            for (int j = 0; j < clientes.size(); j++) {
                System.out.println("Número de Tarjeta: " + tarjetas.get(j).getNumero());
            }
            }
        }
        
    }else{
            System.out.println("NO EXISTE");
        }
       System.out.println("DESEA BUSCAR OTRO CLIENTE ?.(digite 0 si NO..");
       busca = stdIn.nextInt();
    }
    }
    public static boolean existeCliente(int DNI,ArrayList<Cliente> clientes){
        
        int numClientes= clientes.size();
        int i=0;
        while(i<numClientes){
            if(clientes.get(i).getDNI()==DNI){
               return true; 
            }
            i++;
            
      }
        return false;
    }
    

    public static boolean existeTarjeta(int numeroT, ArrayList<TarjetaCredito> tarjetas){

    int numTarjetas = tarjetas.size();
    int i = 0;
    while(i<numTarjetas){
       if(tarjetas.get(i).getNumero() == numeroT){
           return true;
       }
       i++;
   }
return false;
        
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
    int numTarjetas=0;
    ArrayList<TarjetaCredito> tarjetas;
    Cliente(int dni,String nombre, String direccion,int telefono){
        super(dni,nombre, direccion,telefono);
        this.tarjetas= new ArrayList<TarjetaCredito>();
    }
    
    void entregarTarjeta(TarjetaCredito tarjeta){
        
        tarjetas.add(tarjeta);
    }
    ArrayList<TarjetaCredito> getTarjetaCredito(){
        return tarjetas;
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
        titular.entregarTarjeta(this);
    }
    int getNumero() {
        return numero;
    }
    Cliente  getTitular(){
        return titular;
    }
}
