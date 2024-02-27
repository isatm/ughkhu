/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaMercado.productos;

/**
 *
 * @author isabela
 */
public class Producto {
    private String nombre;
    private float peso;
    private float valor;
    public Producto(String nombre, float peso, float valor){
        this.nombre = nombre;
        this.peso = peso;
        this.valor = valor;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the peso
     */
    public float getPeso() {
        return peso;
    }

    /**
     * @return the valor
     */
    public float getValor() {
        return valor;
    }
    public String toStringP(){
        return "Peso: " + peso;
    }
    
     public String toStringV(){
        return "Valor: " + valor;
    }
    
}
