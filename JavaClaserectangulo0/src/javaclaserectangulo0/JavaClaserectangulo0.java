/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaclaserectangulo0;

import java.util.Scanner; 
/**
 *
 * @author malba
 */
public class JavaClaserectangulo0 {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Cuadrados");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el ancho ");
        //String  anchoS= JOptionPane.showInputDialog(" Ingrese el ancho ");
        double ancho = sc.nextInt();
        
        System.out.println("Ingrese el largo ");
        double largo  = sc.nextInt();
        Rectangulo rec=new Rectangulo(ancho, largo);
        System.out.println("Diagonal: ");
        System.out.println(rec.calcularDiagonal());
        
        
    }    
}

class Rectangulo {
    double largo;
    double ancho;
    public Rectangulo(double ancho, double largo) {
        this.largo=largo;
        this.ancho=ancho;
    }
    double calcularDiagonal() {
        return Math.sqrt(Math.pow(largo,2)+Math.pow(ancho, 2));
    }
    
}

