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
public class TarjetaCredito {
public String tipo;
public int numero;
public String fechaCaducidad;
public Cliente titular;
public CuentaCorriente cuenta;
public    TarjetaCredito(String tipo,int numero,String fechaCaducidad, Cliente titular, CuentaCorriente cuenta){
        this.tipo= tipo;
        this.numero= numero;
        this.fechaCaducidad= fechaCaducidad;
        this.titular=titular;
        this.cuenta = cuenta;
        titular.entregarTarjeta(this);
        cuenta.entregaTarjeta(this);
        
    }
public    int getNumero() {
        return numero;
    }
public    Cliente  getTitular(){
        return titular;
    }   
}
