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
public class ListaContratos {
    
    private Contratos headContratos;
    private Contratos tailContratos;

    public Contratos getHeadContratos() {
        return headContratos;
    }

    public void setHeadContratos(Contratos headContratos) {
        this.headContratos = headContratos;
    }

    public Contratos getTailContratos() {
        return tailContratos;
    }

    public void setTailContratos(Contratos tailContratos) {
        this.tailContratos = tailContratos;
    }
    
    public void agregarContrato(String ciudad, int dia, int mes, int ano){
    
        Contratos nuevoContrato=new Contratos(ciudad,dia,mes,ano);
        
        if(headContratos==null){
            headContratos=nuevoContrato;
            tailContratos=nuevoContrato;
        }else{
            tailContratos.setSiguienteContrato(nuevoContrato);
            tailContratos=nuevoContrato;
        }

    }
    
    
    
    
}
