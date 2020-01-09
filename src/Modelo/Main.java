package Modelo;

import CONTROLADOR.Controlador;
import Vista.VentanPrincipal;
import Vista.ventanaEntradaClientes;

public class Main{

    public static void main(String[] args) {
        ventanaEntradaClientes miVentanaEntr=new ventanaEntradaClientes();
        Controlador miControlador=new Controlador(miVentanaEntr);
       
        //miControlador.actionPerformed(null);
        
    }
}