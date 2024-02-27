/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajotime;
import java.time.*;
import java.util.*;
/**
 *
 * @author isabela Taborda
 */
public class TrabajoTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
        System.out.println("Ingrese la primera fecha de forma AÑO-MES-DIA utilizando los guiones");
       String fechaA = scanner.nextLine();
       LocalDate fecha1 = LocalDate.parse(fechaA);
       
       System.out.println("Ingrese la segunda fecha de forma AÑO-MES-DIA utilizando los guiones");
       String fechaB = scanner.next();
       LocalDate fecha2 = LocalDate.parse(fechaB);
       
       CalcularDias.difDias(fecha1, fecha2);
       
       
    }
    
}

class CalcularDias{
public static void difDias(LocalDate fecha1, LocalDate fecha2){    
    long difDias = Math.abs(Duration.between(fecha1.atStartOfDay(), fecha2.atStartOfDay()).toDays());
        System.out.println("Diferencia en días: " + difDias);
    }

}