/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javafilewriter1;
import java.io.FileWriter;
/**
 *
 * @author malba
 */
public class JavaFileWriter1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		try(FileWriter archivo = new FileWriter("archivo.txt")) { // crea el archivo
			char letra='a';
			archivo.write(letra);                 // USO DE "write(char)"
			archivo.write(": pedro perez \n");       // USO DE "write(String)"

			archivo.write('b');
			archivo.write(": juan perez \n");
                        
                        archivo.close();                        // CIERRA el archivo
                        
			


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
    
}
