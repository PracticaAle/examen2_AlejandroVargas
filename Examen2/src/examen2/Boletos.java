/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2;

/**
 *
 * @author usuario
 */
public class Boletos {
    private EstadoNumeros estado;
    private String comprador;
    private int numeroCelular;
    private int numero;

        public Boletos(EstadoNumeros estado, String comprador, int numeroCelular, int numero) {
            this.estado = estado;
            this.comprador = comprador;
            this.numeroCelular = numeroCelular;
            this.numero = numero;
        }
        
    public Boletos(EstadoNumeros estado) {
        this.estado = estado.disponible;
    }
        
        

    public EstadoNumeros getEstado() {
        return estado;
    }

    public void setEstado(EstadoNumeros estado) {
        this.estado = estado;
    }

    public String getComprador() {
        return comprador;
    }

    public void setComprador(String comprador) {
        this.comprador = comprador;
    }

    public int getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(int numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Boletos{" + "estado=" + estado + ", comprador=" + comprador + ", numeroCelular=" + numeroCelular + ", numero=" + numero + '}';
    }
    
}