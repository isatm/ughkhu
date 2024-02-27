/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hostal.clientes;

/**
 *
 * @author isabela
 */
public class Cliente {
    private String nombres;
    private String apellidos;
    private String cedula;
    private String correo;
    
    public Cliente(String cedula, String apellidos, String nombres, String correo)
    {
        this.cedula = cedula;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.correo = correo;
    }
    
    public String getCedula()
    {
        return cedula;
    }
    
    
}
