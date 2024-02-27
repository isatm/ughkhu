/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaclaserectangulo1;
import java.lang.Math;
import javax.swing.JOptionPane;


/**
 *
 * @author malba
 */
public class JavaClaserectangulo1 {

/**
 *
 * @author estuam
 */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JOptionPane.showMessageDialog(null, "Cuadrados");
        //Scanner sc = new Scanner(System.in);
        String  anchoS= JOptionPane.showInputDialog(" Ingrese el ancho ");
        //int ancho = sc.nextInt();
        String  largoS = JOptionPane.showInputDialog(" Ingrese el largo ");
        int ancho = Integer.parseInt(anchoS);
        int largo = Integer.parseInt(largoS);
        Rectangulo rectan=new Rectangulo(ancho, largo);
        System.out.println("Perimetro ");
        System.out.println(rectan.calcularPerimetro());
        JOptionPane.showMessageDialog(null, " Perimetro  "+rectan.calcularPerimetro());//cuando se usa un metodo a una variable se usa variable.metodo
        System.out.println("Area ");
        System.out.println(rectan.calcularArea());
        JOptionPane.showMessageDialog(null, " Area  "+rectan.calcularArea());
        JOptionPane.showMessageDialog(null, " Diagonal  "+rectan.calcularDiagonal());
        
    }
    
}

class Rectangulo {
    int largo;
    int ancho;
    public Rectangulo(int ancho, int largo) {
        this.largo=largo;
        this.ancho=ancho;
    }
    int calcularPerimetro() {
        return 2*this.largo+2*this.ancho;
    }
    int calcularArea() {
        return this.ancho*this.largo;
    }
    double calcularDiagonal() {
        return Math.sqrt(Math.pow(largo,2)+Math.pow(ancho, 2));
    }
}
