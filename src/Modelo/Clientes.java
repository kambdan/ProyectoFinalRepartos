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
public class Clientes extends Personas{
    private String correoElectronico;
    private String direccion;
    private Clientes siguienteCliente;

   
    
    //Constructor
    public Clientes(String Nombre, long telefono,String correo, String d){
        super(Nombre,telefono);
        this.correoElectronico=correo;
        this.direccion=d;
        this.siguienteCliente=null;
        
    }
    
    
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
     public Clientes getSiguienteCliente() {
        return siguienteCliente;
    }

    public void setSiguienteCliente(Clientes siguienteCliente) {
        this.siguienteCliente = siguienteCliente;
    }

}
