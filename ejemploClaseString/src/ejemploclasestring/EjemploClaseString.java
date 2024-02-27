/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploclasestring;
import java.lang.String;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author isabe
 */
public class EjemploClaseString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner stdIn = new Scanner(System.in);
        String cadena1,cadena2,cadena3,cadena4;
        int long1, long2;
        System.out.println("Escriba algo");
        cadena1 = stdIn.next();
        System.out.println("Escriba algo mas ");       
        cadena2 = cadena1.substring(3, 5);
        System.out.println("SUB CADENA : "+ cadena2);
       // System.out.println("diga casa: ");
     //  cadena4 = cadena1.concat(cadena3);
       // System.out.println("CONTCATENAMOS: "+cadena4);
       for(int i = 0; i<cadena1.length()-cadena2.length(); i+=2){
           cadena3 = (cadena1.substring(i, i)+ cadena2.length());
        if(cadena1.compareTo(cadena3)== 0){
            cadena4 = cadena3;
        }
        }
    }
    
}
