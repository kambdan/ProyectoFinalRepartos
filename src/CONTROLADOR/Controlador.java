
package CONTROLADOR;

import Modelo.Clientes;
import Modelo.ListaClientes;
import Vista.VentanPrincipal;
import Vista.ventanaEntrada;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener{
    //Para poder controlar el otro paquete de vista
    private ListaClientes miListaClientes;
    private Clientes miCliente;
    private ventanaEntrada miVentanaIngreso;

    public Controlador( ventanaEntrada miVentanaIngreso,ListaClientes miListaClientes) {
        this.miListaClientes=null;
       
        this.miVentanaIngreso = miVentanaIngreso;
        this.miVentanaIngreso.btnIngresar.addActionListener(this);
        
        this.miListaClientes=miListaClientes;
       VentanPrincipal viewPrincipal=new VentanPrincipal();
       viewPrincipal.setVisible(true);
       
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       miVentanaIngreso.btnIngresar.setActionCommand("boton");
       String comando = e.getActionCommand();
        if(comando.equals("boton")){
             miListaClientes.agregarCliente(miVentanaIngreso.jTextFieldNombre.getText(),Long.parseLong(miVentanaIngreso.jTextFieldTelefono.getText()),miVentanaIngreso.jTextFieldCorreo.getText(),miVentanaIngreso.jTextFieldDireccion.getText());
        
       }
       
    }
        
    public void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        System.out.println("Holala");
    
    }                                           

    
    
}
