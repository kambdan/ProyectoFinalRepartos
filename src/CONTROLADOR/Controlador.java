
package CONTROLADOR;

import Modelo.CaracteristicasEspeciales;
import Modelo.Clientes;
import Modelo.Empresas;
import Modelo.ListaClientes;
import Modelo.ListaProductos;
import Modelo.Productos;
import Modelo.Vehiculos;
import Vista.VentanaEntradaCaracteristicas;
import Vista.VentanaEntradaProductos;
import Vista.VentanaEntradaVehiculos;
import Vista.ventanaCRUD;
import Vista.VentanaPrincipal;
import Vista.ventanaEntradaClientes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Controlador implements ActionListener{
    //Para poder controlar el otro paquete de vista
    
    
    private Clientes miCliente;
    private ventanaEntradaClientes miVentanaIngreso;
    private VentanaPrincipal miViewPrincipal;
    private Empresas miEmpresas;
    private ventanaCRUD viewCrud;
    private int casoB;
    private VentanaEntradaProductos miViewIngresoProd;
    private VentanaEntradaCaracteristicas miViewCaracteristicas;
    private VentanaEntradaVehiculos miViewVehiculos;
    
    
    public Controlador(VentanaPrincipal miViewPrincipal,Empresas miEmpresas) {
        
        this.miViewPrincipal=miViewPrincipal;
        viewCrud=new ventanaCRUD();
        miVentanaIngreso =new ventanaEntradaClientes();
        miViewIngresoProd=new VentanaEntradaProductos();
        miViewCaracteristicas=new VentanaEntradaCaracteristicas();
        miViewVehiculos=new VentanaEntradaVehiculos();
        this.miEmpresas=miEmpresas;
        init();
       
             
    }
    private void init(){
        viewCrud.btnCrear.addActionListener(this);
        viewCrud.btnCrear.setActionCommand("Crear");
        viewCrud.btnBuscar.addActionListener(this);
        viewCrud.btnModificar.addActionListener(this);
        viewCrud.btnEliminar.addActionListener(this);
        miViewCaracteristicas.btnAceptarCaract.addActionListener(this);
        miViewIngresoProd.btnIngresarProd.addActionListener(this);
        miViewVehiculos.btnAceptarVehiculo.addActionListener(this);
        miViewVehiculos.btnCancelarVehiculo.addActionListener(this);
        
        
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
            
            //**********************************************
            //VENTANA QUE CONTROLA LA OPCION VEHICULOS
            
            if(e.getSource()==miViewPrincipal.btnVehiculos){
               viewCrud.setVisible(true);
              
               miViewPrincipal.setVisible(false);
               casoB=3;
            
            }
            
            if(viewCrud.btnCrear==e.getSource() && casoB==3){
                miViewVehiculos.setVisible(true);
                viewCrud.setVisible(false);
            }
            
            
            
            if(miViewVehiculos.btnAceptarVehiculo==e.getSource()){
                miEmpresas.agregarVehiculo(miViewVehiculos.txtPlacaVehiculo.getText(), miViewVehiculos.txtMarcaVehiculo.getText(), miViewVehiculos.txtModeloVehiculo.getText(),Double.parseDouble(miViewVehiculos.txtPesoMaximoVehiculo.getText()), Double.parseDouble(miViewVehiculos.txtVolumneMaximoVehiculo.getText()));
                mostarVehiculos();
                viewCrud.setVisible(true);
                miViewVehiculos.setVisible(false);
            }else{
               if(miViewVehiculos.btnCancelarVehiculo==e.getSource()){
                   miViewVehiculos.setVisible(false);
                   viewCrud.setVisible(true);
               } 
            
            }   
           
            if(viewCrud.btnBuscar==e.getSource() && casoB==3){
                
                Vehiculos miVehiculo=new Vehiculos();
                miVehiculo=miEmpresas.consultarVehiculos(viewCrud.txtBuscar.getText());
                DefaultListModel modelo = new DefaultListModel();
                if(miVehiculo!=null){
                    modelo.addElement(miVehiculo.getPlaca());
                    viewCrud.listCrud.setModel(modelo);
                }else{
                   //vemtana mergente no esta el producto
                    JOptionPane.showMessageDialog(null,"Elemento no encontrado");
                }
           }         
            //Termina el controlador para la opcion VEHICULOS
            
            
            
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
            if(viewCrud.btnCrear==e.getSource()&& casoB==5){
                miViewCaracteristicas.setVisible(true);
                viewCrud.setVisible(false);
            
            }
           if(miViewCaracteristicas.btnAceptarCaract==e.getSource()){
               miEmpresas.agregarCaracteristica(miViewCaracteristicas.txtNombreCaracterisitca.getText(), miViewCaracteristicas.txtDescripcionCaract.getText());
               mostrarCaracteristicas();
               viewCrud.setVisible(true);
               miViewCaracteristicas.setVisible(false);
           }else{
               if(miViewCaracteristicas.btnCancelkarCaract==e.getSource()){
                   miViewCaracteristicas.setVisible(false);
                   viewCrud.setVisible(true);
               }
           
           }
           
           
           if(viewCrud.btnBuscar==e.getSource() && casoB==5){
               
              CaracteristicasEspeciales miCaract=new CaracteristicasEspeciales();
              miCaract=miEmpresas.consultarCaracteristica(viewCrud.txtBuscar.getText());
              DefaultListModel modelo = new DefaultListModel();
              if(miCaract!=null){
                   modelo.addElement(miCaract.getCaracteristicas());
                   viewCrud.listCrud.setModel(modelo);
               }else{
                   //vemtana mergente no esta el producto
                   JOptionPane.showMessageDialog(null,"Elemento no encontrado");
               }
           
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
                   
          if(miViewIngresoProd.btnIngresarProd==e.getSource()){
              miEmpresas.agregarProducto(miViewIngresoProd.txtNombProd.getText(), miViewIngresoProd.txtUnidad.getText(), Double.parseDouble(miViewIngresoProd.txtPeso.getText()),Double.parseDouble(miViewIngresoProd.txtVolum.getText()));
              mostrarProductos();
              miVentanaIngreso.setVisible(false);
              viewCrud.setVisible(true);
          }
          if(miVentanaIngreso.btnIngresar==e.getSource() ){
              miEmpresas.agregarCliente(miVentanaIngreso.jTextFieldNombre.getText(),Long.parseLong(miVentanaIngreso.jTextFieldTelefono.getText()),miVentanaIngreso.jTextFieldCorreo.getText(),miVentanaIngreso.jTextFieldDireccion.getText());
              miVentanaIngreso.setVisible(false);
              mostrarClientes();
              viewCrud.setVisible(true);
             }
          
          if(viewCrud.btnBuscar==e.getSource()&&casoB==6){
              Productos miProducto=new Productos();
              miProducto=miEmpresas.consultarProducto(viewCrud.txtBuscar.getText());
              DefaultListModel modelo = new DefaultListModel();
              if(miProducto!=null){
                   modelo.addElement(miProducto.getNombreProducto());
                   viewCrud.listCrud.setModel(modelo);
               }else{
                   //vemtana mergente no esta el producto
                   JOptionPane.showMessageDialog(null,"Elemento no encontrado");
               }
           }
           
           if(viewCrud.btnBuscar==e.getSource()&&casoB==8){
               Clientes miCliente=new Clientes();
               miCliente=miEmpresas.consultarCliente(viewCrud.txtBuscar.getText());
               DefaultListModel modelo = new DefaultListModel();
               if(miCliente!=null){
                   modelo.addElement(miCliente.getNombre());
                   viewCrud.listCrud.setModel(modelo);
               }else{
                   //vemtana mergente no esta el producto
                    JOptionPane.showMessageDialog(null,"Elemento no encontrado");
               }
           }
           
           if(viewCrud.btnModificar==e.getSource()&& casoB==8){
               String value =(String) viewCrud.listCrud.getSelectedValue();
               System.out.println("---"+value);
               miViewIngresoProd.setVisible(true);
           }
           

           
         
           
           
}
 
  private void mostrarProductos(){
      DefaultListModel modelo = new DefaultListModel();
      Productos miProducto=new Productos();
      miProducto=miEmpresas.getMiListaProduc().getHeadProducto();
      
     while(miProducto!=null){
          modelo.addElement(miProducto.getNombreProducto());
          miProducto=miProducto.getSiguienteProducto();
          
         
     }
     viewCrud.listCrud.setModel(modelo);
    }
 
    private void mostrarClientes(){
      
     Clientes miCliente=new Clientes();
     miCliente=miEmpresas.getMiListaClientes().getHeadCliente();
     DefaultListModel modelo = new DefaultListModel();
     int i=0;
     while(miCliente!=null){
          modelo.addElement(miCliente.getNombre());
          miCliente=miCliente.getSiguienteCliente();
          System.out.println(": "+i+" ");
          i++;
     }
     viewCrud.listCrud.setModel(modelo);
    }

    private void mostrarCaracteristicas() {
      
     CaracteristicasEspeciales miCar=new CaracteristicasEspeciales();
   
     miCar=miEmpresas.getMiListaCarac().getHeadCaracteristica();
     DefaultListModel modelo = new DefaultListModel();
     int i=0;
     while(miCar!=null){
          modelo.addElement(miCar.getCaracteristicas());
          miCar=miCar.getSiguienteCaracteristica();
          
         
     }
     viewCrud.listCrud.setModel(modelo);
    }

    private void mostarVehiculos() {
        
        Vehiculos miVehiculo=new Vehiculos();
        miVehiculo=miEmpresas.getMiListaVehic().getHeadVehiculos();
        DefaultListModel modelo = new DefaultListModel();
        while(miVehiculo!=null){
            modelo.addElement(miVehiculo.getPlaca());
            miVehiculo=miVehiculo.getSiguienteVehiculo(); 
        }
        viewCrud.listCrud.setModel(modelo);
    }
 
 
 }

    

