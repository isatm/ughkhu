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
public class Cuentas {
   public int numero;
   public int saldo;
   public int fechaApertura;
   public String tipoInteres;
public Cuentas(int numero, int saldo, int fechaApertura, String tipoInteres){
    
    this.numero = numero;
    this.saldo = saldo;
    this.fechaApertura = fechaApertura;
    this.tipoInteres = tipoInteres;
   
    
    
} int numero(){
    return numero;
} int saldo(){
   return saldo;
} int fechaApertura(){
    return fechaApertura;
} String tipoInteres(){
    return tipoInteres;    
} 
}
