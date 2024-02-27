/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parqueadero.java;

import java.text.DecimalFormat;
import java.util.ArrayList;
import parqueadero.componentes.Cliente;
import parqueadero.componentes.LugarDeParqueo;
import parqueadero.componentes.Vehiculo;
import parqueadero.utilidades.Hora;

/**
 *
 * @author Isabela Taborda y Jeronimo Ramirez
 */
public class GestorParqueadero {
    private int filas;
    private int columnas;
    private int tarifa;
    private String contrasena;
    private LugarDeParqueo [][] lugaresDeParqueo;
    private ArrayList<Cliente> clientes;
    private ArrayList<Vehiculo> vehiculos;
    
    
    public GestorParqueadero(String contrasena){
        this.contrasena = contrasena;
    }
    
    // verifica la que la contraseña sea igual
    public boolean ingresoContrasena(String contrasena){ 
        if(!contrasena.equals(this.contrasena)){
            return false;
        }
        return true;
    }
    
    public int getFilas(){
        return filas;
    }
    
    public int getColumnas(){
        return columnas;
    }
    
    public int getTarifa(){
        return tarifa;
    }
    
    //Modificar la tarifa
    public boolean setTarifa(String tarifa){
       try{
            int itarifa = Integer.parseInt(tarifa);
            if (itarifa < 0){
                return false;
            }
            this.tarifa = itarifa;
        }catch (NumberFormatException e) {
            return false;
        }
       return true;
    }
    
    
    //cambio de columnas, filas y la tarifa para reiniciar el programa
    public boolean modificarParqueadero(String filas, String columnas, String tarifa){
        try{
            int ifilas = Integer.parseInt(filas);
            int icolumnas = Integer.parseInt(columnas);
            int itarifa = Integer.parseInt(tarifa);
            
            if (ifilas <= 0 || icolumnas <= 0){
                return false;
            }else if (itarifa < 0){
                return false;
            }
            this.filas = ifilas;
            this.columnas = icolumnas;
            this.tarifa = itarifa;
            this.clientes = new ArrayList<>();
            this.vehiculos = new ArrayList<>();
            this.lugaresDeParqueo = new LugarDeParqueo[this.filas][this.columnas];
            for(int f = 0; f < this.filas; f++){
                for(int c = 0; c < this.columnas; c++){
                    LugarDeParqueo lugardeparqueo = new LugarDeParqueo(String.valueOf(f), String.valueOf(c));
                    lugaresDeParqueo[f][c] = lugardeparqueo;
                }
            }
        }catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
    
    public Cliente buscarCliente(String documento){
        for(int i = 0; i < clientes.size(); i++){
            if(clientes.get(i).getDocumento().equals(documento)){
                return clientes.get(i);
            }
        }
        return null;
    }
    
    private LugarDeParqueo buscarVehiculoParqueado(String placa){
        for (int f = 0; f < filas; f++){
            for(int c = 0; c < columnas; c++){
                if(lugaresDeParqueo[f][c].getVehiculo() != null){
                    if(lugaresDeParqueo[f][c].getVehiculo().getPlaca().equals(placa)){
                        return lugaresDeParqueo[f][c];
                    }
                }
            }
        }
        return null;
    }
    
    private LugarDeParqueo buscarLugarLibre(){
        for (int f = 0; f < filas; f++){
            for(int c = 0; c < columnas; c++){
                if(lugaresDeParqueo[f][c].getVehiculo() == null){
                    return lugaresDeParqueo[f][c];
                }
            }
        }
        return null;
    }
    
    
    /**
     * calcula el valor individual que debe pagar el vehiculo
     * @param lugar
     * @param horaActual
     * @return el valor que debe pagar el auto
     */
    private String valorVehiculo(LugarDeParqueo lugar, Hora horaActual){
        if(lugar.getVehiculo() == null){
            return "No hay vehiculo para calcular valor";
        }
        
        Hora horaGuardada = lugar.getHora();
        int horasGuardadas = horaGuardada.getHoras();
        int minutosGuardados = horaGuardada.getMinutos();
        
        int horasActuales = horaActual.getHoras();
        int minutosActuales = horaActual.getMinutos();
        
        //COBRO POR FRACCION
        int diferenciaHoras = horasActuales - horasGuardadas;
        if (minutosActuales != minutosGuardados && minutosActuales > minutosGuardados){
            diferenciaHoras += 1;
        }
        
        int valor = diferenciaHoras*tarifa;
        return Integer.toString(valor);
    }
    
    /**
     * registra al cliente y guarda sus datos
     * @param nombre
     * @param documento
     * @param celular
     * @param color
     * @param marca
     * @param placa
     * @return mensaje de registro exitoso o no exitoso
     */
    public String registrarCliente(String nombre, String documento, String celular, String color, String marca, String placa){
        Cliente cliente = buscarCliente(documento);
        if(cliente != null){
            return "El cliente ya esta registrado";
        }
        
        for(int i = 0; i < vehiculos.size(); i++){
            if(vehiculos.get(i).getPlaca().equals(placa)){
                return "El vehiculo ya esta registrado";
            }
        }
        Vehiculo vehiculo = new Vehiculo(color, marca, placa);
        vehiculos.add(vehiculo);
        
        Cliente clienteNew = new Cliente(nombre, documento, celular, vehiculo);
        clientes.add(clienteNew);
        
        return "¡Se ha registrado correctamente!";
    }
    
    /**
     * 
     * @param documento
     * @param placa
     * @return 
     */
    public String parquearVehiculo(String documento, String placa){
        Cliente cliente = buscarCliente(documento);
        if(cliente == null){
            return "El cliente no esta registrado";
        }
        
        for(int i = 0; i < vehiculos.size(); i++){
            
            if(vehiculos.get(i).getPlaca().equals(placa)){
                
                if(cliente.getVehiculo().getPlaca().equals(placa)){
                    if(buscarVehiculoParqueado(cliente.getVehiculo().getPlaca()) == null){
                        LugarDeParqueo lugar = buscarLugarLibre();
                        if(lugar != null){
                            lugar.setVehiculo(vehiculos.get(i));
                            Hora hora = new Hora();
                            lugar.setHora(hora);
                            return "El vehiculo parqueo en el "+lugar.getFila()+","+lugar.getColumna()+" a las "+hora.getHoras()+":"+hora.getMinutos();
                        }else{
                            return "No hay lugares disponibles";
                        }
                    }   
                }else{
                    return "El cliente no es el dueño del vehiculo";
                }
                
            } 
        }
        return "El vehiculo no esta registrado";
    }
    
    
    public String desaparcarVehiculo(String documento,String placa){
        Cliente cliente = buscarCliente(documento);
        if(cliente == null){
            return "El cliente no esta registrado";
        }
        for(int i = 0; i < vehiculos.size(); i++){
            if(vehiculos.get(i).getPlaca().equals(placa)){
                if(vehiculos.get(i).getPlaca().equals(cliente.getVehiculo().getPlaca())){
                    LugarDeParqueo lugar = buscarVehiculoParqueado(cliente.getVehiculo().getPlaca());
                        if(lugar != null){
                            Hora hora = new Hora();
                            String valor = valorVehiculo(lugar, hora);
                            lugar.setVehiculo(null);
                            lugar.setHora(null);
                            return "El documento " +documento+ " entrego " +vehiculos.get(i).getMarca()+", placa: "+vehiculos.get(i).getPlaca()+ 
                                        "\nValor a pagar: "+valor;
                        }else{
                            return "El vehiculo no esta parqueado";
                        }
                }else{
                    return "El cliente no esta registrado";
                }
        }
        }
        return "El vehiculo no esta registrado";
    }
    
    public String [][] estadoParqueadero(){
        String [][] estado = new String [filas][columnas];
        for(int f = 0; f < filas; f++){
            for(int c = 0; c < columnas; c++){
                if(lugaresDeParqueo[f][c].getVehiculo() == null){
                    estado[f][c] = "Libre";
                }else{
                    estado[f][c] = "Ocupado";
                }
            }
        }
        return estado;
    }
    
    public String porcentajeParqueadero(){
        String promedios;
        float sumatoriaLibre = 0; 
        float sumatoriaOcupado = 0;
        for(int f = 0; f < filas; f++){
            for(int c = 0; c < columnas; c++){
                if(lugaresDeParqueo[f][c].getVehiculo() == null){
                    sumatoriaLibre += 1;
                }else{
                    sumatoriaOcupado += 1;
                }
            }
        }
        DecimalFormat df = new DecimalFormat("#.00");
        promedios = String.valueOf(df.format((sumatoriaLibre/(filas*columnas))*100))+"%";
        promedios = promedios+ " / " +String.valueOf(df.format(((sumatoriaOcupado/(filas*columnas))*100))) +"%";
        
        return promedios;
    }
    
    public String valorTotal(){
        String mensaje = "";
        for(int f = 0; f < filas; f++){
            for(int c = 0; c < columnas; c++){
                if(lugaresDeParqueo[f][c].getVehiculo() != null){
                    mensaje = mensaje +"Placa: "+lugaresDeParqueo[f][c].getVehiculo().getPlaca()+" debe hasta ahora " + valorVehiculo(lugaresDeParqueo[f][c], new Hora()) + "\n";
                }
            }
        }
        if (mensaje.equals("")){
            return "No hay vehiculos parqueados";
        }
        return mensaje;
    }
}
