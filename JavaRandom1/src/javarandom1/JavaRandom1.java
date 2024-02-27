/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javarandom1;

import java.util.Random;
/**
 *
 * @author malba
 */
public class JavaRandom1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // create instance of Random class
        Random random = new Random();
   
        // Generación de enteros random desde 0 hasts 999
        int int1_random = random.nextInt(1000);
        int int2_random = random.nextInt(1000);
   
        // imprime enteros random 
        System.out.println("Entero Random 1: "+int1_random);
        System.out.println("Entero Random 2: "+int2_random);
   
        // Generación de dobles random 
        double dub1_random = random.nextDouble();
        double dub2_random = random.nextDouble();
   
        // imprime dobles random
        System.out.println("Dobles Random 1: "+dub1_random);
        System.out.println("Dobles Random 2: "+dub2_random);
        
        // Generación de dobles  random entre 0.0 y 1.0
        // con la clase Math método random() del paquete 
        System.out.println("Dobles Random  3: " + Math.random());
        System.out.println("Dobles Random  4: " + Math.random());
        
        // Generación de dobles  random entre 0.0 y 1000000.0
        // con la clase Math método random() del paquete 
        System.out.println("Dobles Random  3: " + Math.random()*1000000.0);
        System.out.println("Dobles Random  4: " + Math.random()*1000000.0);
    }
    
}
