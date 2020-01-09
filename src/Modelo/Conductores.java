/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author STRIX
 */
public class Conductores {
    
    private long cedula;
    private Conductores siguienteConductor;

    
    public Conductores(){
        this.cedula=cedula;
        this.siguienteConductor=null;
    }
    
    
    public Conductores getSiguienteConductor() {
        return siguienteConductor;
    }

    public void setSiguienteConductor(Conductores siguienteConductor) {
        this.siguienteConductor = siguienteConductor;
    }

    
    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }
    
    
}
