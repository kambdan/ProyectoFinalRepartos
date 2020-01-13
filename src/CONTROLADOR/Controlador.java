
package CONTROLADOR;

import Modelo.Clientes;
import Modelo.ListaClientes;
import Vista.VentanaEntradaProductos;
import Vista.ventanaCRUD;
import Vista.VentanaPrincipal;
import Vista.ventanaEntradaClientes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;

public class Controlador implements ActionListener{
    //Para poder controlar el otro paquete de vista
    private ListaClientes miListaClientes;
    private Clientes miCliente;
    private ventanaEntradaClientes miVentanaIngreso;
    private VentanaPrincipal miViewPrincipal;
    private ventanaCRUD viewCrud;
    private VentanaEntradaProductos miViewIngresoProd;
    public Controlador(VentanaPrincipal miViewPrincipal,ListaClientes miListaClientes) {
        this.miListaClientes=null;
        this.miViewPrincipal=miViewPrincipal;
        viewCrud=new ventanaCRUD();
        this.miListaClientes=miListaClientes;
        miVentanaIngreso =new ventanaEntradaClientes();
        miViewIngresoProd=new VentanaEntradaProductos();
        init();
       
             
    }
    private void init(){
        viewCrud.btnCrear.addActionListener(this);
      
        miViewPrincipal.btnClientes.addActionListener(this);
        miViewPrincipal.btnCaracteristicas.addActionListener(this);
        miViewPrincipal.btnCiudad.addActionListener(this);
        miViewPrincipal.btnContratos.addActionListener(this);
        miViewPrincipal.btnEmpresa.addActionListener(this);
        miViewPrincipal.btnProducto.addActionListener(this);
        miViewPrincipal.btnVehiculos.addActionListener(this);
        miViewPrincipal.btnViajar.addActionListener(this);
        miVentanaIngreso.btnIngresar.addActionListener(this); 
        miViewPrincipal.btnConductores.addActionListener(this);
         
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
                System.out.println("dos vecss");
                miViewPrincipal.setVisible(false);
                
            }
            if(viewCrud.btnCrear==e.getSource()){
                   
                    miVentanaIngreso.setVisible(true);
                     viewCrud.setVisible(false);

                 }
           if(miVentanaIngreso.btnIngresar==e.getSource()){
              
               miListaClientes.agregarCliente(miVentanaIngreso.jTextFieldNombre.getText(),Long.parseLong(miVentanaIngreso.jTextFieldTelefono.getText()),miVentanaIngreso.jTextFieldCorreo.getText(),miVentanaIngreso.jTextFieldDireccion.getText());
                // miVentanaIngreso=null;
                miVentanaIngreso.setVisible(false);
                DefaultListModel modelo = new DefaultListModel();
                mostrarClientes(modelo);
                System.out.println("**");
                viewCrud.setVisible(true);
                //miVentanaIngreso=null;
               
              
               
                 
          }
           
           
}
 
 private void mostrarClientes(DefaultListModel modelo){
     Clientes miCliente=new Clientes();
     miCliente=miListaClientes.getHeadCliente();
     
     int i=0;
     while(miCliente!=null){
          modelo.addElement(miCliente.getNombre());
          miCliente=miCliente.getSiguienteCliente();
          System.out.println(": "+i+" ");
          i++;
     }
     viewCrud.listCrud.setModel(modelo);
    }
 
 
 }

    

