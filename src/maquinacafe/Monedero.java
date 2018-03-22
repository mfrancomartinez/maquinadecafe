/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinacafe;

import javax.swing.JOptionPane;

/**
 *
 * @author Marcos
 */
public class Monedero {
private double precio;
private double dinero;

    public Monedero(double precio , double dinero) {
        this.precio = precio;
        this.dinero = dinero;
    }

    Monedero() {
        
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public double getPrecio() {
        return precio;
    }

    public double getDinero() {
        return dinero;
    }

public void demandarimporte(double dinero){
    JOptionPane.showInputDialog("Inserte el importe.");
    if (dinero >= getPrecio()){
        
        JOptionPane.showInputDialog("Espere, su cafe se esta preparando.");
        if(dinero>getPrecio()){
            dinero = dinero-getPrecio();
            JOptionPane.showInputDialog("Reciba su cambio: "+dinero);
        }
    } 
    
}
}