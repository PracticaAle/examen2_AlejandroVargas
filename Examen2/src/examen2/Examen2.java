/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen2;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Examen2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Boletos boletos[] = new Boletos[100];
        
        

        int op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(
                     "1) Venta manual \n"
                    + "2) Gallo tapado \n"
                    + "3) Mostrar talonario \n"
                    + "4) Consulta por comprador \n"
                    + "5) Estadisticas y recaudacion\n"
                    + "6) Sorteo Complejo \n"
                    + "7) Salir "));

            switch (op) {
                case 1:
                    GestionTalonario.instanciarDefault(boletos);
                    GestionTalonario.ventaTiquetes(boletos);
                    break;
                case 2:
//                    GestionTalonario.galloTapado(boletos);
                        JOptionPane.showMessageDialog(null, "Hay codigo comentado del intento de hacer el modulo jaja");
                    break;
                case 3:
                    GestionTalonario.mostrarEstado(boletos);
                        
                    break;
                case 4:
                    GestionTalonario.consultaComprador(boletos);

                    break;
                case 5:
                    GestionTalonario.estadisticaRecaudacion(boletos);

                    break;
                case 6:
                    GestionTalonario.sorteo(boletos);

                    break;
              

            }

        } while (op != 7);
    }

}
