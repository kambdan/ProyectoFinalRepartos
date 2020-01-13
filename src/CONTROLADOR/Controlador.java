
package CONTROLADOR;

import Modelo.Clientes;
import Modelo.ListaClientes;
import Modelo.ListaProductos;
import Modelo.Productos;
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
    private ListaProductos miListaProd;
    private Clientes miCliente;
    private ventanaEntradaClientes miVentanaIngreso;
    private VentanaPrincipal miViewPrincipal;
    private ventanaCRUD viewCrud;
    private int casoB;
    private VentanaEntradaProductos miViewIngresoProd;
    public Controlador(VentanaPrincipal miViewPrincipal,ListaClientes miListaClientes,ListaProductos miListaProd) {
        this.miListaClientes=null;
        this.miViewPrincipal=miViewPrincipal;
        viewCrud=new ventanaCRUD();
        this.miListaClientes=miListaClientes;
        this.miListaProd=miListaProd;
        miVentanaIngreso =new ventanaEntradaClientes();
        miViewIngresoProd=new VentanaEntradaProductos();
        init();
       
             
    }
    private void init(){
        viewCrud.btnCrear.addActionListener(this);
        viewCrud.btnCrear.setActionCommand("Crear");
        miViewIngresoProd.btnIngresarProd.addActionListener(this);
        
        
        
        
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
            if(e.getSource()==miViewPrincipal.btnEmpresa){
                viewCrud.setVisible(true);
              
                miViewPrincipal.setVisible(false);
               casoB=1;
            
            }
            if(e.getSource()==miViewPrincipal.btnCiudad){
                viewCrud.setVisible(true);
              
                miViewPrincipal.setVisible(false);
               casoB=2;
            
            }
            if(e.getSource()==miViewPrincipal.btnVehiculos){
               viewCrud.setVisible(true);
              
               miViewPrincipal.setVisible(false);
               casoB=3;
            
            }
             if(e.getSource()==miViewPrincipal.btnConductores){
               viewCrud.setVisible(true);
              
               miViewPrincipal.setVisible(false);
               casoB=4;
            
            }
            if(e.getSource()==miViewPrincipal.btnCaracteristicas){
               viewCrud.setVisible(true);
              
               miViewPrincipal.setVisible(false);
               casoB=5;
            
            }
             if(e.getSource()==miViewPrincipal.btnProducto){
                viewCrud.setVisible(true);
              
                miViewPrincipal.setVisible(false);
               casoB=6;
            
            }
            if(e.getSource()==miViewPrincipal.btnContratos){
               viewCrud.setVisible(true);
              
               miViewPrincipal.setVisible(false);
               casoB=7;
            
            }
            if(e.getSource()==miViewPrincipal.btnClientes){
                viewCrud.setVisible(true);
                
                miViewPrincipal.setVisible(false);
               casoB=8;
                
            }
           
            
            String comando = e.getActionCommand();
            if(viewCrud.btnCrear==e.getSource()&&casoB==8){
                miVentanaIngreso.setVisible(true);
                viewCrud.setVisible(false);
            }
                
          if(viewCrud.btnCrear==e.getSource()&&casoB==6){
             miViewIngresoProd.setVisible(true);
            viewCrud.setVisible(false);
                     
            }
            
          //if(viewCrud.btnB)
          
          
          
          if(miViewIngresoProd.btnIngresarProd==e.getSource()){
              miListaProd.agregarProducto(miViewIngresoProd.txtNombProd.getText(),miViewIngresoProd.txtUnidad.getText(),Double.parseDouble(miViewIngresoProd.txtPeso.getText()),Double.parseDouble(miViewIngresoProd.txtVolum.getText()));
              mostrarProductos();
              miVentanaIngreso.setVisible(false);
               
              
              //System.out.println("**");
              viewCrud.setVisible(true);
          }
          
          
          
          
          
           if(miVentanaIngreso.btnIngresar==e.getSource() ){
                miListaClientes.agregarCliente(miVentanaIngreso.jTextFieldNombre.getText(),Long.parseLong(miVentanaIngreso.jTextFieldTelefono.getText()),miVentanaIngreso.jTextFieldCorreo.getText(),miVentanaIngreso.jTextFieldDireccion.getText());
                // miVentanaIngreso=null;
                miVentanaIngreso.setVisible(false);
               
                mostrarClientes();
                System.out.println("**");
                viewCrud.setVisible(true);
             }
          
           
         
           
           
}
 
  private void mostrarProductos(){
      DefaultListModel modelo = new DefaultListModel();
      Productos miProducto=new Productos();
      miProducto=miListaProd.getHeadProducto();
      
     while(miProducto!=null){
          modelo.addElement(miProducto.getNombreProducto());
          miProducto=miProducto.getSiguienteProducto();
          
         
     }
     viewCrud.listCrud.setModel(modelo);
    }
 
 private void mostrarClientes(){
      DefaultListModel modelo = new DefaultListModel();
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

    

