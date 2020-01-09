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
public class Contratos {
    
    private String ciudadDestino;
    private int dia,mes,ano;
    private Contratos siguienteContrato;
    
    
    public Contratos(String ciudadDestino, int dia, int mes, int ano) {
        this.ciudadDestino = ciudadDestino;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.siguienteContrato=null;
    }
    
    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public Contratos getSiguienteContrato() {
        return siguienteContrato;
    }

    public void setSiguienteContrato(Contratos siguienteContrato) {
        this.siguienteContrato = siguienteContrato;
    }
    
    
    void alquilarViaje(){}
    void transportar(){}
    void solicitarProducto(){}
    void calcular(){}   //calcula el peso y volumentootal del paquete
    
    
}
