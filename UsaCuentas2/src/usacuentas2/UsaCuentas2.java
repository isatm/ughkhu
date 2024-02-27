/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usaCuentas2;
import cuentasBancarias.*;

import java.util.Scanner;


/**
 *
 * @author malba
 */
public class UsaCuentas2 {
 	
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        CheckAccount cuenta1 = new CheckAccount (10000);
        Scanner stdIn = new Scanner(System.in);
        //String entrada;
        //entrada  = 
        stdIn.nextLine();
        System.out.println("Hola Mundo");
        stdIn.close();
        guionNro_1(cuenta1);
    
    }
    
    public static  void guionAnteChkAcc(CheckAccount cuenta1) {
        	System.out.println("\n ANTES: ");
                estadoCheckAccount(cuenta1);

    }
    
    public static void estadoCheckAccount(CheckAccount cuenta1) {
        System.out.print(" saldo: ");
	System.out.println(cuenta1.getBalance());
	System.out.print(" sobregiro autorizado?: ");
	System.out.println(cuenta1.sobregiroAutorizado());
	System.out.print(" valorautorizado: ");
	System.out.println(cuenta1.valorAutorizado());
	System.out.print(" valor usado:");
	System.out.print(cuenta1.valorUsado());
    }
    
    public static  void guionDespuesChkAcc(CheckAccount cuenta1) throws Exception {
		System.out.println("\n DESPUES: ");
		estadoCheckAccount(cuenta1);

	}
    
    public static  void guionNro_1(CheckAccount cuenta1) throws Exception {
        
        

	guionAnteChkAcc(cuenta1);
        BankAccount.setMinBalance(10000);
	guionDespuesChkAcc(cuenta1);
        
        cuenta1.deposit(8000);
	guionDespuesChkAcc(cuenta1);
        
        cuenta1.withdraw(7000);
	cuenta1.autorizarSobregiro();
        guionDespuesChkAcc(cuenta1);
        
        cuenta1.withdraw(9000);
	cuenta1.autorizarSobregiro();
        guionDespuesChkAcc(cuenta1); 
        
	

	
	
	
	
    }   
}