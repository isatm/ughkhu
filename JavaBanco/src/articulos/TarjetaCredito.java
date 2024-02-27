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
public class TarjetaCredito {
    String tipo;
    int numero;
    String fechaCaducidad;
    Cliente titular;
public    TarjetaCredito(String tipo,int numero,String fechaCaducidad, Cliente titular){
        this.tipo= tipo;
        this.numero= numero;
        this.fechaCaducidad= fechaCaducidad;
        this.titular=titular;
        titular.entregarTarjeta(this);
        
    }
 public   int getNumero() {
        return numero;
    }
    Cliente  getTitular(){
        return titular;
    } 
}
