/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestorCumpleaños.java;
import gestorCumpleaños.elementos.*;
import gestorCumpleaños.utilidades.*;
import java.util.ArrayList;
/**
 *
 * @author isabela
 */
public class GestorCumpleaños {
    private ArrayList<Amigo>amigos;
    
    public GestorCumpleaños (){
        amigos = new ArrayList<>();
    }
    
    public boolean agregarAmigo(Amigo amigo){
       if(buscarAmigo(amigo.getCorreo()) != null){    
        return false;
       } else
           amigos.add(amigo);
           return true;
    }
    
    public Amigo buscarAmigo(String correo){
        for(int i = 0; i < amigos.size(); i++){
            Amigo amigo = amigos.get(i);
            if(amigo.getCorreo().equals(correo)){
                return amigo;
            }
        }
        return null;
    }
    
    public boolean eliminarAmigo(Amigo amigo){
        //TO DO VALIDAS
        return false;
    }
    
    public boolean removerAmigo(String correo){
        Amigo amigo = buscarAmigo(correo);
        
        if(amigo == null){
            return false;
        }
        amigos.remove(amigo);
        return true;
    
    }
    
    public boolean editarAmigo(Amigo amigo,String name,String correo, Fecha fecha){
       
        
      
            amigo.setName(name);
            amigo.setCorreo(correo);
            amigo.setFechaC(fecha);
            return true;
        
}
}