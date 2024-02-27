/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestorCumpleaños.utilidades;

/**
 *
 * @author isabela
 */
public class Fecha {
    private int dia;
    private int mes;
    private int ano;
    
    public Fecha(int dia, int mes, int ano){
        setDia(dia);
        setMes(mes);
        setAno(ano);
    }
    
    public Fecha(String fecha){
        String[] partes = fecha.split("/");
        
        setDia(Integer.parseInt(partes[0]));
        setMes(Integer.parseInt(partes[1]));
        setAno(Integer.parseInt(partes[2]));
    }
    /**
     * @return the dias
     */
    public int getDia() {
        return dia;
    }

    /**
     * @param dia the dias to set
     */
    public boolean setDia(int dia) {
        if(dia > 0 & dia <= 31){
            this.dia = dia;
            return true;
        }
        return false;
    }

    /**
     * @return the mes
     */
    public int getMes() {
        return mes;
    }

    /**
     * @param mes the mes to set
     */
    public boolean setMes(int mes) {
        if(mes > 0 & dia <= 12){
        this.mes = mes;
        return true;
        }
        return false;
    }

    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public boolean setAno(int ano) {
        if(ano > 0){
        this.ano = ano;
        return true;
        }
        return false;
    }
    public String toString(){
        return dia + "/" + mes + "/" + ano;
    }
    
}
