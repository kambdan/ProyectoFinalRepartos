
package CONTROLADOR;

import Modelo.Clientes;
import Modelo.ListaClientes;
import Vista.ventanaCRUD;
import Vista.VentanaPrincipal;
import Vista.ventanaEntradaClientes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener{
    //Para poder controlar el otro paquete de vista
    private ListaClientes miListaClientes;
    private Clientes miCliente;
    private ventanaEntradaClientes miVentanaIngreso=new ventanaEntradaClientes();
    private VentanaPrincipal miViewPrincipal;
    private ventanaCRUD viewCrud;
    
    public Controlador(VentanaPrincipal miViewPrincipal,ListaClientes miListaClientes) {
        this.miListaClientes=null;
       
        this.miViewPrincipal=miViewPrincipal;
        
        System.out.println("HhHH");
        viewCrud=new ventanaCRUD();
        this.miListaClientes=miListaClientes;
        init();
         // TODO add your handling code here:
      // VentanaPrincipal viewPrincipal=new VentanaPrincipal();
       //viewPrincipal.setVisible(true);
        
             
    }
    private void init(){
        viewCrud.btnCrear.addActionListener(this);
        miVentanaIngreso.btnIngresar.addActionListener(this);
        miViewPrincipal.btnClientes.addActionListener(this);
        miVentanaIngreso.btnIngresar.addActionListener(this); 
    
    
    }
    
   
        
    public void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        System.out.println("Holala");
    
    }                                           


   
  
            @Override
 public void actionPerformed(ActionEvent e) {
            //if(e.getSource()==miVentanaIngreso.btnIngresar){
          //     
           // }
            if(e.getSource()==miViewPrincipal.btnClientes){
                viewCrud.setVisible(true);
                
            }
            if(viewCrud.btnCrear==e.getSource()){
                    miVentanaIngreso.setVisible(true);
                    
                    
                  
                }
           if(miVentanaIngreso.btnIngresar==e.getSource()){
                         miListaClientes.agregarCliente(miVentanaIngreso.jTextFieldNombre.getText(),Long.parseLong(miVentanaIngreso.jTextFieldTelefono.getText()),miVentanaIngreso.jTextFieldCorreo.getText(),miVentanaIngreso.jTextFieldDireccion.getText());
                        System.out.println("Hola bbrbbr");
          }
}

    
}
