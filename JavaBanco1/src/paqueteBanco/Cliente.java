/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteBanco;
import java.util.Scanner;
import java.util.*;
/**
 *
 * @author isabe
 */
public class Cliente extends Persona {
public  int numTarjetas=0;
public    ArrayList<TarjetaCredito> tarjetas;
public    ArrayList<Cuentas> cuenta;
public    Cliente(int dni,String nombre, String direccion,int telefono){
        super(dni,nombre, direccion,telefono);
        tarjetas= new ArrayList<TarjetaCredito>();
    }
    
 public   void entregarTarjeta(TarjetaCredito tarjeta){
        numTarjetas++;
        this.tarjetas.add(tarjeta);
    }
 public   TarjetaCredito getTarjetaCredito(int posicion){
        if(posicion >= numTarjetas)
            System.out.println(" error numero"+ posicion);
        return tarjetas.get(posicion);
    }
public    int getNumTarjetas() {
        return numTarjetas;
    }
}
