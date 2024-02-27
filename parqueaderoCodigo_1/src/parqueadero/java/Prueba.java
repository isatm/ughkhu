/*
package parqueadero.java;
import parqueadero.utilidades.Hora;
public class Prueba {
    public static void main(String[] args) {
        GestorParqueadero gestor = new GestorParqueadero("123");
        System.out.println(gestor.modificarParqueadero(2, 2, 3000));
        
        Hora hora1 = new Hora(6, 0);
        Hora hora2 = new Hora(10, 35);
        Hora hora3 = new Hora(13, 55);
        Hora hora4 = new Hora(20, 25);
        Hora hora5 = new Hora(50, 00);
        
        System.out.println(gestor.registrarCliente("Jero", "1", "301", "blanco", "mazda", "UWU"));
        System.out.println(gestor.registrarCliente("Jero", "2", "301", "blanco", "chevrolet", "UNU"));
        System.out.println(gestor.registrarCliente("Jero", "3", "301", "blanco", "mazda", "7U7"));
        System.out.println(gestor.registrarCliente("Jero", "4", "301", "blanco", "Hyundai", "UEU"));
        System.out.println(gestor.registrarCliente("Jero", "5", "301", "blanco", "Nissan", "UuU"));
        
        System.out.println(gestor.parquearVehiculo("1", hora1));
        System.out.println(gestor.parquearVehiculo("2", hora2));
        System.out.println(gestor.parquearVehiculo("3", hora3));
        System.out.println(gestor.parquearVehiculo("4", hora4));
        System.out.println(gestor.parquearVehiculo("5", hora1));
        
        String[][] estado = gestor.estadoParqueadero();
        for(int f = 0; f < 2; f++){
            for(int c = 0; c < 2; c++){
                System.out.println(estado[f][c]);
            }
            System.out.println("\n");
        }
        
        float [] promedio = gestor.porcentajeParqueadero();
        System.out.println(promedio[0] + "%");
        System.out.println(promedio[1] + "%");
        
        System.out.println(gestor.valorTotal(hora5));
    }
}
*/
