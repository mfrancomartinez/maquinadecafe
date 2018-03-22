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
public class Cafeyazucar {
    private String tipo;
    private int azucar;

    public Cafeyazucar(String tipo, int azucar) {
        this.tipo = tipo;
        this.azucar = azucar;
    }

    Cafeyazucar() {
        
    }

    public String getTipo() {
        return tipo;
    }

    public int getAzucar() {
        return azucar;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setAzucar(int azucar) {
        this.azucar = azucar;
    }
    
    public void masazucar(){
        if(azucar<6){
            azucar++;
        }
        
    }
    public void menosazucar(){
        if (azucar>0){
            azucar--;
        }
    }
}
