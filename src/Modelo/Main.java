package Modelo;

import CONTROLADOR.Controlador;
import Vista.VentanPrincipal;
import Vista.ventanaEntrada;

public class Main{

    public static void main(String[] args) {
        ventanaEntrada miVentanaEntr=new ventanaEntrada();
        Controlador miControlador=new Controlador(miVentanaEntr);
       
        //miControlador.actionPerformed(null);
        
    }
}