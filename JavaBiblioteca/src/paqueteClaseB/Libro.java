/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteClaseB;

/**
 *
 * @author isabe
 */
public class Libro extends Articulo 
{
    int paginas;
    String autor;
public Libro(String nombre, String tipo, int fecha, int paginas, String autor)
{
    super(nombre, tipo,fecha);
    this.paginas = paginas;
    this.autor = autor;
}
public int getPaginas()
{
    return paginas;
}
public String autor()
{
    return autor;
}
void Tamaño(int t)
{
        System.out.println(t);
}

}
