/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestorCumpleaños.elementos;
import gestorCumpleaños.utilidades.*;
/**
 *
 * @author isabela
 */
public class Amigo {
    private String name;
    private String correo;
    private Fecha fechaC;
    public Amigo(String name, String correo, Fecha fechac){
        this.name = name;
        this.correo = correo;
        this.fechaC = fechac;
    }
    
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @param fechaC the fechaC to set
     */
    public void setFechaC(Fecha fechaC) {
        this.fechaC = fechaC;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the fechaC
     */
    public Fecha getFechaC() {
        return fechaC;
    }
    
    
}
