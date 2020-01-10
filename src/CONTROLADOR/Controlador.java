
package CONTROLADOR;

import Modelo.Clientes;
import Modelo.ListaClientes;
import Vista.NewJFrame;
import Vista.VentanPrincipal;
import Vista.ventanaEntradaClientes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener{
    //Para poder controlar el otro paquete de vista
    private ListaClientes miListaClientes;
    private Clientes miCliente;
    private ventanaEntradaClientes miVentanaIngreso=new ventanaEntradaClientes();
    private NewJFrame miView;

    public Controlador( NewJFrame miView,ListaClientes miListaClientes) {
        this.miListaClientes=null;
       
        this.miView=miView;
        System.out.println("HhHH");
        this.miListaClientes=miListaClientes;
        miVentanaIngreso.btnIngresar.addActionListener(this);
        this.miView.btnCrear.addActionListener(this);
         // TODO add your handling code here:
      // VentanPrincipal viewPrincipal=new VentanPrincipal();
       //viewPrincipal.setVisible(true);
        
             
    }
    
   
        
    public void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        System.out.println("Holala");
    
    }                                           


   
  
            @Override
 public void actionPerformed(ActionEvent e) {
            if(e.getSource()==miVentanaIngreso.btnIngresar){
                miListaClientes.agregarCliente(miVentanaIngreso.jTextFieldNombre.getText(),Long.parseLong(miVentanaIngreso.jTextFieldTelefono.getText()),miVentanaIngreso.jTextFieldCorreo.getText(),miVentanaIngreso.jTextFieldDireccion.getText());
                System.out.println("Hola bbrbbr");
            }
            if(e.getSource()==miView.btnCrear){
                 
                miVentanaIngreso.setVisible(true);   
            }
           
}

    
}
