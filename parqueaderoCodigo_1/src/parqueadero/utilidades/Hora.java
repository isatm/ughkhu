/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parqueadero.utilidades;
import java.time.LocalDateTime;

public class Hora {
    private int horas;
    private int minutos;
    
    public Hora(){
        LocalDateTime hora= LocalDateTime.now();
        this.horas = hora.getHour();
        this.minutos = hora.getMinute();
    }
    //---PARA PROBAR---
    public Hora(int hora, int minutos){
        this.horas = hora;
        this.minutos = minutos;
    }
    //----
    /**
     * @return the horas
     */
    public int getHoras() {
        return horas;
    }

    /**
     * @return the minutos
     */
    public int getMinutos() {
        return minutos;
    }
}
