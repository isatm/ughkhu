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
public class CuentaCorriente extends Cuentas {
public  int numTarjetas=0;
public    ArrayList<TarjetaCredito> tarjetas;
public CuentaCorriente(int numero, int saldo, int fechaApertura, String tipoInteres){
    super(numero,saldo,fechaApertura,tipoInteres);
     tarjetas = new ArrayList<TarjetaCredito>();
}  
public   void entregaTarjeta(TarjetaCredito tarjeta){
        numTarjetas++;
        this.tarjetas.add(tarjeta);
    }
 public   TarjetaCredito tenerTarjetaCredito(int posicion){
        if(posicion >= numTarjetas)
            System.out.println(" error numero"+ posicion);
        return tarjetas.get(posicion);
    }
public    int tenerNumTarjetas() {
        return numTarjetas;
    }
}


