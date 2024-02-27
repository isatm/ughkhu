/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parqueadero.componentes;

/**
 *
 * @author korez
 */
public class Vehiculo {
    private String color;
    private String marca;
    private String placa;

    public Vehiculo(String color, String marca, String placa) {
        this.color = color;
        this.marca = marca;
        this.placa = placa;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }
    
    
}
