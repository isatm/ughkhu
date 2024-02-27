/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package editor.figuras;

/**
 *
 * @author isabela
 */
public class Punto {
    protected int x;
    protected int y;
    public Punto(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public String imprimir(){
        return ("x= "+ x + " y= "+y);
    }
}
