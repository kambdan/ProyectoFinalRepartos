/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author CARLOS ARMIJOS
 */
public class ListaConductores {
    
    
    private Conductores headConductor;
    private Conductores tailConductor;
    
    
    
    public void agregarConductor(long cedula){
        
        Conductores miConductor=new Conductores();
        miConductor.setCedula(cedula);
        
        if(headConductor==null){
            headConductor=miConductor;
            tailConductor=miConductor;
        }else{
            miConductor.setSiguienteConductor(miConductor);
            tailConductor=miConductor;
        }
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
