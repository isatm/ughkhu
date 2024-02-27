/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaMercado.lista;
import java.util.ArrayList;
import listaMercado.productos.*;
/**
 *
 * @author isabela
 */
public class ListaCompras {
     private ArrayList<Producto>productos;
     public ListaCompras(){
         productos = new ArrayList<>();
     }
     
       public boolean agregarProducto(String nombre, float peso, float valor){
            for(int i = 0; i < productos.size(); i++){
            Producto producto = productos.get(i);
            if(producto.getNombre().equals(nombre)){
                return false;
            }
        }    
        Producto nuevoProducto = new Producto(nombre, peso, valor);
        productos.add(nuevoProducto);
        return true;
    }
       
       public ArrayList<String> listarProductos(){
           ArrayList<String> nombresProductos = new ArrayList<>();
           for(int i = 0; i < productos.size(); i++){
               Producto producto = productos.get(i);
               nombresProductos.add(producto.getNombre());
           }
          return nombresProductos;
       }
       
       public float valorTotal(){
           float valorTotal = 0;
           for(int i = 0; i < productos.size(); i++){
               Producto producto = productos.get(i);
               valorTotal = valorTotal + producto.getValor();
           }
           return valorTotal;
       }
       
       public float pesoTotal(){
           float pesoTotal = 0;
           for(int i = 0; i < productos.size(); i++){
               Producto producto = productos.get(i);
               pesoTotal = pesoTotal + producto.getPeso();
           }
           return pesoTotal;
       }
 }


