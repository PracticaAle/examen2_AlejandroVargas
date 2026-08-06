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
            boletos[i] = new Boletos(EstadoNumeros.disponible);
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
        String print="";
        for (int i = 0; i < boletos.length; i++) {
            if(boletos[i].getComprador()!=null){
                print+=boletos[i].toString()+"\n";
            }
        }
        JOptionPane.showMessageDialog(null, "Informacion de boletos \n"+print);
    }
}
