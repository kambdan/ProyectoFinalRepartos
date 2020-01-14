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
public class CaracteristicasEspeciales {
    
    private String caracteristicas;
    private String descripcion;
    private CaracteristicasEspeciales siguienteCaracteristica;
        
    public CaracteristicasEspeciales(String caracteristicas,String descripcion) {
        this.caracteristicas=caracteristicas;
        this.descripcion=descripcion;
        this.siguienteCaracteristica=null;
    }
    public CaracteristicasEspeciales(){
    
    }
  
    public CaracteristicasEspeciales getSiguienteCaracteristica() {
        return siguienteCaracteristica;
    }

    public void setSiguienteCaracteristica(CaracteristicasEspeciales siguienteCaracteristica) {
        this.siguienteCaracteristica = siguienteCaracteristica;
    } 

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
