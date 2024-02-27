/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;
import javax.swing.JOptionPane;
import java.util.Scanner; 
/**
 *
 * @author isabe
 */
public class Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        // TODO code application logic here
        
       int n1,n2;
        String nombre;
        nombre = JOptionPane.showInputDialog("ingrese su nombre");
        JOptionPane.showConfirmDialog(null,"su nombre si es: " + nombre+"?","confirmar salida", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "su nombre es: " + nombre);
    }
}
