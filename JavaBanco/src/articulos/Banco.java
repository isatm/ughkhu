/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package articulos;
import java.util.Scanner;
import java.util.*;
/**
 *
 * @author isabe
 */
public class Banco {
  private String nombre;
    private String direccionContacto;
    private ArrayList<TarjetaCredito> todaslasTarjetas;
    private  ArrayList<Cliente> todoslosClientes;
public    Banco(String nombre, String direccionContacto){
        this.nombre=nombre;
        this.direccionContacto=direccionContacto;
        this.todoslosClientes=new ArrayList<Cliente>();
        this.todaslasTarjetas=new ArrayList<TarjetaCredito>();
    }
public    void crearCliente(int dni,String nombre, String direccion,int telefono){
        Cliente cliente= new Cliente(dni,nombre, direccion,telefono);
        this.todoslosClientes.add(cliente);
    }
public    int indexCliente(int DNI){
        
        int numClientes= todoslosClientes.size();
        int i=0;
        while(i<numClientes){
            if(todoslosClientes.get(i).getDNI()==DNI){
               break; 
            }
            i++;
            
        }
        return i;
        
    }
    
public    Cliente clientePosicion(int index){
        int numClientes= todoslosClientes.size();
        if(index>=numClientes) {
            System.out.println(" error numero"+ index);
            return null;
        }
        else 
            return todoslosClientes.get(index);
        
    }
    
public    boolean existeCliente(int DNI){
        
        int numClientes= todoslosClientes.size();
        int i=0;
        while(i<numClientes){
            if(todoslosClientes.get(i).getDNI()==DNI){
               return true; 
            }
            i++;
            
        }
        return false;
    }
    
public    void expedirTarjeta(String tipo,int numero,String fechaCaducidad, Cliente titular){
        TarjetaCredito tarjeta= new TarjetaCredito(tipo,numero,fechaCaducidad,titular);
        this.todaslasTarjetas.add(tarjeta);
        
    }
    
public    boolean existeTarjeta(int numero){
        int numTarjetas= todaslasTarjetas.size();
        int i=0;
        while(i<numTarjetas){
            if(todaslasTarjetas.get(i).getNumero()==numero){
               return true; 
            }
            i++;
            
        }
        return false;
    }
public    int indexTarjeta(int numero){
        int numTarjetas= todaslasTarjetas.size();
        
        int i=0;
        while(i<numTarjetas){
            if(todaslasTarjetas.get(i).getNumero()==numero){
               break; 
            }
            i++;
            
        }
        return i;
        
    }
    
public    TarjetaCredito posTarjeta(int index){
        int numTarjetas= todaslasTarjetas.size();
        if(index>= numTarjetas) {
            System.out.println(" error numero"+ index);
            return null;
        }
            
        return todaslasTarjetas.get(index);
        
    }  
}
