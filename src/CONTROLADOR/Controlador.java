
package CONTROLADOR;

import Modelo.Clientes;
import Modelo.ListaClientes;
import Vista.VentanPrincipal;
import Vista.ventanaEntradaClientes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener{
    //Para poder controlar el otro paquete de vista
    private ListaClientes miListaClientes;
    private Clientes miCliente;
    private ventanaEntradaClientes miVentanaIngreso;

    public Controlador( ventanaEntradaClientes miVentanaIngreso) {
        this.miListaClientes=null;
       
        this.miVentanaIngreso = miVentanaIngreso;
         VentanPrincipal viewPrincipal=new VentanPrincipal();
         viewPrincipal.setVisible(true);
    }
  
            @Override
        public void actionPerformed(ActionEvent e) {
        miListaClientes.agregarCliente(miVentanaIngreso.jTextFieldNombre.getText(),Long.parseLong(miVentanaIngreso.jTextFieldTelefono.getText()),miVentanaIngreso.jTextFieldCorreo.getText(),miVentanaIngreso.jTextFieldDireccion.getText());
        miVentanaIngreso.btnIngresar.addActionListener(this);
        }
    
    
}
