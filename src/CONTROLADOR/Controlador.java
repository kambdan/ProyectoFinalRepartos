
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

    public Controlador( ventanaEntrada miVentanaIngreso) {
        this.miListaClientes=null;
       
        this.miVentanaIngreso = miVentanaIngreso;
        this.miVentanaIngreso.btnIngresar.addActionListener(this);
         VentanPrincipal viewPrincipal=new VentanPrincipal();
         viewPrincipal.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       
        }
        
    public void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        miListaClientes.agregarCliente(miVentanaIngreso.jTextFieldNombre.getText(),Long.parseLong(miVentanaIngreso.jTextFieldTelefono.getText()),miVentanaIngreso.jTextFieldCorreo.getText(),miVentanaIngreso.jTextFieldDireccion.getText());
    
    }                                           

    
    
}
