/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class GestionTalonario {

    //Poner todos los tiquetes como disponibles
    public static void instanciarDefault(Boletos boletos[]) {
        for (int i = 0; i < boletos.length; i++) {
            boletos[i] = new Boletos(EstadoNumeros.disponible, null, 0, i);
        }
    }

    public static void ventaTiquetes(Boletos boletos[]) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero que desea comprar:"));

        for (int i = 0; i < boletos.length; i++) {
            if (boletos[i].getEstado() == EstadoNumeros.vendido) {
                JOptionPane.showMessageDialog(null, "Este numero de boleto ya no esta disponible");
            } else {
                String comprador = JOptionPane.showInputDialog("Cual es su nombre: ");

                int numeroCelular = Integer.parseInt(JOptionPane.showInputDialog("Digite su numero de celular:"));

                boletos[i] = new Boletos(EstadoNumeros.vendido, comprador, numeroCelular, numero);
                break;

            }
        }
    }

//    public static void galloTapado(Boletos boletos[]) {
//
//        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de boletos que desea registrar:"));
//        Random random = new Random();
//
//        for (int i = 0; i < cantidad; i++) {
//            int numero = random.nextInt(0, 100);
//            for (int j = 0; j < boletos.length; j++) {
//                if (boletos[j].getNumero()==numero){
//                   
//                }
//            }
//
////                do {
////                    for (int j = 0; j < cantidad; j++) {
////                        String comprador = JOptionPane.showInputDialog("Cual es su nombre: ");
////
////                        int numeroCelular = Integer.parseInt(JOptionPane.showInputDialog("Digite su numero de celular:"));
////
////                        boletos[i] = new Boletos(EstadoNumeros.vendido, comprador, numeroCelular, numero);
////
////                        JOptionPane.showMessageDialog(null, "Boleto: " + boletos[i].getNumero() + " vendido");
////                    }
////
////                } while (boletos[i].getNumero() != numero);
////
////            }
////        }
//    }

    public static void mostrarEstado(Boletos boletos[]) {
        String print = "";
        for (int i = 0; i < boletos.length; i++) {
            print += boletos[i].toString() + "\n";
        }
        JOptionPane.showMessageDialog(null, "Informacion de boletos \n" + print);
    }

    public static void consultaComprador(Boletos boletos[]) {
        String comprador = JOptionPane.showInputDialog("Cual es el nombre del comprador: ");
        for (int i = 0; i < boletos.length; i++) {
            if (boletos[i].getComprador().equalsIgnoreCase(comprador)) {
                JOptionPane.showMessageDialog(null, "numeros adquiridos por " + boletos[i].getComprador() + ": " + boletos[i].getNumero());
            } else {
                JOptionPane.showMessageDialog(null, "El comprador no tiene boletos");
            }
        }
    }
    
    public static void estadisticaRecaudacion(Boletos boletos[]) {
        int cantidad = 0;
        int disponibles = 0;
        int dineroRecaudado = 0;

        for (int i = 0; i < boletos.length; i++) {
            if (boletos[i].getEstado() == boletos[i].getEstado().vendido) {
                cantidad += 1;
                dineroRecaudado += 2000;
            } else if (boletos[i].getEstado() == boletos[i].getEstado().disponible) {
                disponibles += 1;
            }
        }
        float porcentaje = (cantidad / boletos.length) * 100;
        JOptionPane.showMessageDialog(null, "Cantidad de boletos vendidos: " + cantidad + "\n"
                + "Porcentaje (%) del talonario que se ha vendido " + porcentaje + "%\n"
                + "Total de dinero recaudado en colones: " + dineroRecaudado + "₡");
    }
    public static void sorteo(Boletos boletos[]) {
        String primer = "";
        String segundo = "";
        String tercero = "";

        Random random = new Random();
        int primero = random.nextInt(0, 100);
        int segund = random.nextInt(0, 100);
        int tercer = random.nextInt(0, 100);

        for (int i = 0; i < boletos.length; i++) {
            if (boletos[i].getComprador() != null) {
                if (boletos[i].getNumero() == primero) {
                    primer = boletos[i].getComprador();
                } else if (boletos[i].getNumero() == segund) {
                    segundo = boletos[i].getComprador();
                } else if (boletos[i].getNumero() == tercer) {
                    tercero = boletos[i].getComprador();
                }
            }
        }
        JOptionPane.showMessageDialog(null, "primer lugar: "+primer + "\n" + "segundo lugar: " + segundo + "\n"+ "Tercer lugar: " + tercero);
    


    }
}
