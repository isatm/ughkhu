/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadenalarga;
import java.lang.String;
import java.util.Scanner;
/**
 *
 * @author isabe
 */
public class CadenaLarga {

    public static void main(String[] args) {
         Scanner stdIn = new Scanner(System.in);
        System.out.println("Diga casa");
        String cadena1 = stdIn.next();
        System.out.println("Escriba algo");
        String cadena2 = stdIn.next();
        String cFinal = encontrarCadena(cadena1, cadena2);
        System.out.println("La subcadena común más larga es: " + cFinal);
    } 

public static String encontrarCadena(String c1, String c2) {
    int m = c1.length();
    int n = c2.length();
    int lM = 0; //Longitud de la cadena nueva
    int pF = 0; // Pos final de la cadena
    int[][] matriz = new int[m][n];

    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            if (c1.charAt(i) == c2.charAt(j)) {
                if (i == 0 || j == 0) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = matriz[i - 1][j - 1] + 1;
                }

                if (matriz[i][j] > lM) {
                    lM = matriz[i][j];
                    pF = i;
                }
            }
        }
    }

    if (lM == 0) {
        return "No se encontro una subcadena comun";
    }

    return c1.substring(pF - lM + 1, pF + 1); //
}
}