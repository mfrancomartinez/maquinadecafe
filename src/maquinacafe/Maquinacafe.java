/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinacafe;

/**
 *
 * @author Marcos
 */
public class Maquinacafe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Cafeyazucar ex1 = new Cafeyazucar();
    ex1.setTipo("Capuccino");
    ex1.masazucar();
    Monedero ex2 = new Monedero();
    ex2.setPrecio(0.50);
    ex2.demandarimporte(0.50);
    
    }
    
}
