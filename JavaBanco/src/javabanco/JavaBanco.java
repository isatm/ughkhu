/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabanco;
import java.util.Scanner;
import java.util.*;
/**
 *
 * @author isabe
 */
public class JavaBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner stdIn = new Scanner(System.in);
        
        // BANCO
        
        String nombreB,direccionContacto;
        
            
        System.out.print("Nombre banco..");
        nombreB= stdIn.next();
        System.out.print("Direccion banco...");
        direccionContacto= stdIn.next();
        
        Banco miBanco=new Banco(nombreB,direccionContacto);
        
        
        // CLIENTE
        String nombreC,direccionC;
        
            
        System.out.print("Nombre cliente..");
        nombreC= stdIn.next();
        //System.out.println(" El nombre es "+ entrada);
        
        System.out.print("DNI cliente...");
        int dniC = stdIn.nextInt();
        //System.out.println(" El peso es "+ i);
        
        System.out.print("Direccion cliente...");
        direccionC= stdIn.next();
        
        System.out.print("Telefono cliente..");
        int telefonoC = stdIn.nextInt();
        
        
        miBanco.crearCliente(dniC,nombreC,direccionC,telefonoC);
        Cliente titular;
        if(miBanco.existeCliente(dniC)){
            int posCliente= miBanco.indexCliente(dniC);
            titular=miBanco.clientePosicion(posCliente);
        
            System.out.println(  " Nombre del cliente   "+titular.getNombre()+ "  en posicion "+posCliente) ;    
        }
        else titular=null;
        
        
        // TARJETA
        
        String tipo,fechaCaducidad;
        
            
        System.out.print("Tipo de la tarjeta..");
        tipo= stdIn.next();
        //System.out.println(" El nombre es "+ entrada);
        
        System.out.print("Numero de la tarjeta...");
        int numero = stdIn.nextInt();
        //System.out.println(" El peso es "+ i);
        
        System.out.print("Fecha caducidad de la tarjeta...");
        fechaCaducidad= stdIn.next();
        
        miBanco.expedirTarjeta(tipo,numero,fechaCaducidad,titular);
        
        TarjetaCredito tarjeta;
        if(miBanco.existeTarjeta(numero)){
            int postarjeta= miBanco.indexTarjeta(numero);
            tarjeta=miBanco.posTarjeta(postarjeta);
        
            System.out.println(  " Numero de la tarjeta del cliente   "+tarjeta.getNumero()+ "  en posicion "+postarjeta) ;    
        }
        else tarjeta=null;
        
        int numT=titular.getNumTarjetas();
        
        System.out.println(" numero de tarjetas "+ numT);
        
        
        System.out.println(" el numero de la tarjeta del cliente es "+ titular.getTarjetaCredito(numT-1).getNumero());
        
    }
    
}
