/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parqueadero.componentes;
import parqueadero.utilidades.Hora;

/**
 *
 * @author korez
 */
public class LugarDeParqueo {
    private String fila;
    private String columna;
    private Hora hora;
    private Vehiculo vehiculo;

    public LugarDeParqueo(String fila, String columna) {
        this.fila = fila;
        this.columna = columna;
        this.hora = null;
        this.vehiculo = null;
    }

    /**
     * @return the fila
     */
    public String getFila() {
        return fila;
    }

    /**
     * @return the columna
     */
    public String getColumna() {
        return columna;
    }

    /**
     * @return the hora
     */
    public Hora getHora() {
        return hora;
    }

    /**
     * @return the vehiculo
     */
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    /**
     * @param vehiculo
     */
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;  
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(Hora hora) {
        this.hora = hora;
    }
}
