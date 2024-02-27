/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hostal;
import hostal.clientes.*;
import hostal.servicios.Habitacion;
/**
 *
 * @author isabela
 */
public class Hostal {
    private String nombre;
    private String direccion;
    private Habitacion[] habitaciones;
    private Cliente[] clientes;
    public Hostal(String nombre, String direccion)
    {
        this.nombre = nombre;
        this.direccion = direccion;
        habitaciones = new Habitacion[5];
        clientes = new Cliente[10];
        
        for(int i = 0; i<habitaciones.length; i++)
        {
            String numero = (i+1)+"01";
            habitaciones[i] = new Habitacion(numero);
        }
    }
    public Hostal(String nombre)
    {
        this(nombre, "");  //reutilizando el constructor
    }
    
    public int buscarIndiceClienteLibre()
    {
        for(int i=0; i<clientes.length; i++)
        {
            if(clientes[i] == null)
            {
                return i;
            }
        }
        
        return -1;
    }
    
    public Cliente buscarCliente(String cedula)
    {
        for(int i=0; i<clientes.length; i++)
        {
            if(clientes[i] != null && clientes[i].getCedula().equals(cedula))
                return clientes[i];
        }     
        return null;
    }
    
    public boolean registrarCliente(Cliente cliente)
    {
        //verificar si ya existe
        Cliente buscado = buscarCliente(cliente.getCedula());
        
        if(buscado != null)
        {
            return false;
        }
        
        int indice = buscarIndiceClienteLibre();
        
        if(indice == -1)
        {
            return false;
        }
        // si no, verificar si hay espacio (ok)
        // si hay, guardar cliente
        clientes[indice] = cliente;
        return true;
    }
    
    
    /////////////////////////////////////////////////////////////////////////////////////////////
    
    public static void main(String[] args){
        Hostal hostal = new Hostal("Mi casita");
        
        Cliente cliente1 = new Cliente("123", "caca", "Juan", "juan@gmail.com");
        
        Cliente cliente2 = new Cliente("456", "popo", "luis", "juan@gmail.com");
        boolean control = hostal.registrarCliente(cliente1);
        
        System.out.println(control);
       
        Cliente buscado1 = hostal.buscarCliente("123");
        Cliente buscado2 = hostal.buscarCliente("456");
        
        System.out.println("Buscado1: " + buscado1);
        System.out.println("Buscado2: " + buscado2);
    }
    
    ///////////////////////////////////////////////////////////////////////////////////////////////
}
