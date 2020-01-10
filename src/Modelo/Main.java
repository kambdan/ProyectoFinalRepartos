package Modelo;

import CONTROLADOR.*;
import Vista.*;

import Vista.ventanaEntradaClientes;
import Vista.VentanPrincipal;
public class Main{

    public static void main(String[] args) {

        NewJFrame miViewClientes=new NewJFrame();
        ListaClientes miListaClientes=new ListaClientes();
        Controlador miControlador=new Controlador(miViewClientes,miListaClientes);
       // miVentanaEntr.setVisible(true);

        miViewClientes.setVisible(true);
        
       

        //miControlador.actionPerformed(null);
        
    }
}