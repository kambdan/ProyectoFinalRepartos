package Modelo;

import CONTROLADOR.*;
import Vista.*;

import Vista.ventanaEntradaClientes;
import Vista.VentanaPrincipal;
public class Main{

    public static void main(String[] args) {

       // NewJFrame miViewClientes=new NewJFrame();
        VentanaPrincipal miView =new VentanaPrincipal();
        ListaClientes miListaClientes=new ListaClientes();
        Controlador miControlador=new Controlador(miView,miListaClientes);
       // miVentanaEntr.setVisible(true);

        miView.setVisible(true);
        
       

        //miControlador.actionPerformed(null);
        
    }
}