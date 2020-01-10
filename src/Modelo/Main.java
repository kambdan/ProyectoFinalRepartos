package Modelo;

import CONTROLADOR.Controlador;
import Vista.VentanPrincipal;
import Vista.ventanaEntrada;

public class Main{

    public static void main(String[] args) {
        ventanaEntrada miVentanaEntr=new ventanaEntrada();
        ListaClientes miListaClientes=new ListaClientes();
        Controlador miControlador=new Controlador(miVentanaEntr,miListaClientes);
       // miVentanaEntr.setVisible(true);
        //miControlador.actionPerformed(null);
        
    }
}