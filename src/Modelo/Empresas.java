/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

/**
 *
 * @author STRIX
 */
public class Empresas {
    
    private String direccion;
    private long telefono;
    
    
    private ListaClientes miListaClientes;
    private ListaContratos miListaContratos;
    private ListaProductos miListaProduc;
    private ListaVehiculos miListaVehic;
    private ListaCaracteristicasEspeciales miListaCarac;
   
    public Empresas() {
        
        this.miListaClientes = new ListaClientes();
        this.miListaContratos = new ListaContratos();
        this.miListaProduc = new ListaProductos();
        this.miListaVehic = new ListaVehiculos();
        this.miListaCarac = new ListaCaracteristicasEspeciales();
    }
    
    public ListaClientes getMiListaClientes() {
        return miListaClientes;
    }

    public void setMiListaClientes(ListaClientes miListaClientes) {
        this.miListaClientes = miListaClientes;
    }

    public ListaContratos getMiListaContratos() {
        return miListaContratos;
    }

    public void setMiListaContratos(ListaContratos miListaContratos) {
        this.miListaContratos = miListaContratos;
    }

    public ListaProductos getMiListaProduc() {
        return miListaProduc;
    }

    public void setMiListaProduc(ListaProductos miListaProduc) {
        this.miListaProduc = miListaProduc;
    }

    public ListaVehiculos getMiListaVehic() {
        return miListaVehic;
    }

    public void setMiListaVehic(ListaVehiculos miListaVehic) {
        this.miListaVehic = miListaVehic;
    }

    public ListaCaracteristicasEspeciales getMiListaCarac() {
        return miListaCarac;
    }

    public void setMiListaCarac(ListaCaracteristicasEspeciales miListaCarac) {
        this.miListaCarac = miListaCarac;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
    
    void registrarActividad(){}
    void dicidirRutas(){}
        //Funcion para Agregar un nuevo cliente a nuestra lista
    
    
    
    
     public void agregarProducto(String NombreProducto,String Unidad, double Peso, double Volumen){
        
        Productos miProducto=new Productos(NombreProducto,Unidad,Peso,Volumen);
        
        if(miListaProduc.getHeadProducto()==null){
            miListaProduc.setHeadProducto(miProducto);
            miListaProduc.setTailProducto(miProducto);
        }else{
            miListaProduc.getTailProducto().setSiguienteProducto(miProducto);
            miListaProduc.setTailProducto(miProducto);
            
        }
    }
    
    public Productos consultarProducto(String NombreProducto){
        
        Productos miProducto;
        miProducto=miListaProduc.getHeadProducto();
        while(miProducto!=null && !miProducto.getNombreProducto().equals(NombreProducto)){
          miProducto=miProducto.getSiguienteProducto();
        }
        if(miProducto==null){
            return miProducto;
        }else{
            System.out.println("producto: "+miProducto.getNombreProducto());
            return miProducto;
        }
    }
    
    public void modificarProducto( String NombreProducto,String Unidad, double Peso, double Volumen){

        Productos nodAux;
        Productos nodProd;
        nodAux=nodAux=miListaProduc.getHeadProducto();


        nodProd=consultarProducto(NombreProducto);
        if(nodProd!=null){
            System.out.println("ENCONTRADO");
            while(nodProd!=nodAux){
                 nodAux=nodAux.getSiguienteProducto();
            }


            nodAux.setNombreProducto(NombreProducto);
            nodAux.setUnidad(Unidad);
            nodAux.setPeso(Peso);
            nodAux.setVolumen(Volumen);
            System.out.println("MODIFICADO CON EXITO");
        }else{
            System.out.println("NO ENCONTRADO");
        }
    }

    public void eliminarProducto(String NombreProducto){

	if(miListaProduc.getHeadProducto()!=null){
		Productos auxBorrar;
		Productos anterior=null;
		auxBorrar=miListaProduc.getHeadProducto();
		while((auxBorrar!=null)&&(auxBorrar.getNombreProducto()!=NombreProducto)){
			anterior=auxBorrar;
			auxBorrar=auxBorrar.getSiguienteProducto();

		}
		if(auxBorrar==null){
                    System.out.println("ELEMENTO NO EXISTE");
		}else{
                    
                    if(anterior==null){//para eliminar el primer elemento de la lista
			
                        miListaProduc.setHeadProducto(miListaProduc.getHeadProducto().getSiguienteProducto());
			auxBorrar=null;
                    }else{//cualquier elemento que se vaya a borrar
			anterior.setSiguienteProducto(auxBorrar.getSiguienteProducto());
			auxBorrar=null;
                    }
                    System.out.println("ELIMINADO CON EXITO");
		}
	}
    }   
    
    //*****************************************************************************

    public void agregarVehiculo(String placa, String marca, String modelo, double peso, double volumen){
            Vehiculos nuevoVehiculo=new Vehiculos(placa, marca, modelo, peso, volumen);
            if(miListaVehic.getHeadVehiculos()==null){
                miListaVehic.setHeadVehiculos(nuevoVehiculo);
                miListaVehic.setTailVehiculos(nuevoVehiculo);
            }else{
                miListaVehic.getTailVehiculos().setSiguienteVehiculo(nuevoVehiculo);
                miListaVehic.setTailVehiculos(nuevoVehiculo);
            }
        }
    
    public Vehiculos consultarVehiculos(String placa){
        
        Vehiculos miVehiculo;
        miVehiculo=miListaVehic.getHeadVehiculos();
        while(miVehiculo!=null && !miVehiculo.getPlaca().equals(placa)){
          miVehiculo=miVehiculo.getSiguienteVehiculo();
        }
        if(miVehiculo==null){
            return miVehiculo;
        }else{
            return miVehiculo;
        }
    }
    
    //**************************************************************************
    
    public void agregarCaracteristica(String caracteristica,String descripcion){
        
        CaracteristicasEspeciales nuevaCaracteristica=new CaracteristicasEspeciales(caracteristica,descripcion);
        
        
        if(miListaCarac.getHeadCaracteristica()==null){
            miListaCarac.setHeadCaracteristica(nuevaCaracteristica);
            miListaCarac.setTailCaracterisitca(nuevaCaracteristica);
        }else{
            miListaCarac.getTailCaracterisitca().setSiguienteCaracteristica(nuevaCaracteristica);
            
            miListaCarac.setTailCaracterisitca(nuevaCaracteristica);
        }       
    }
    
    
    public CaracteristicasEspeciales consultarCaracteristica(String NombreCaracteristica){
       
        CaracteristicasEspeciales miCaracterisitca;
        miCaracterisitca=miListaCarac.getHeadCaracteristica();
        while(miCaracterisitca!=null && !miCaracterisitca.getCaracteristicas().equals(NombreCaracteristica)){
          miCaracterisitca=miCaracterisitca.getSiguienteCaracteristica();
        }
        if(miCaracterisitca==null){
            return miCaracterisitca;
        }else{
            return miCaracterisitca;
        }
    }
    
    public void modificarCaracteristica(String NombreCaracteristica, String Descripcion){

    CaracteristicasEspeciales nodAux;
    CaracteristicasEspeciales nodCaracteristica;
    nodAux=miListaCarac.getHeadCaracteristica();
    
    nodCaracteristica=consultarCaracteristica(NombreCaracteristica);
    if(nodCaracteristica!=null){
	System.out.println("ENCONTRADO");
	while(nodCaracteristica!=nodAux){
             nodAux=nodAux.getSiguienteCaracteristica();
        }
        nodAux.setCaracteristicas(NombreCaracteristica);
        nodAux.setDescripcion(Descripcion);

        System.out.println("MODIFICADO CON EXITO");
    }else{
	System.out.println("NO ENCONTRADO");
        }
    }
    public void eliminarCaracteristica(String NombreCaracteristica){

            if(miListaCarac.getHeadCaracteristica()!=null){
                    CaracteristicasEspeciales auxBorrar;
                    CaracteristicasEspeciales anterior=null;
                    auxBorrar=miListaCarac.getHeadCaracteristica();
                    while((auxBorrar!=null)&&(auxBorrar.getCaracteristicas()!=NombreCaracteristica)){
                            anterior=auxBorrar;
                            auxBorrar=auxBorrar.getSiguienteCaracteristica();

                    }
                    if(auxBorrar==null){
                        System.out.println("ELEMENTO NO EXISTE");
                    }else{

                        if(anterior==null){//para eliminar el primer elemento de la lista
                            miListaCarac.setHeadCaracteristica(miListaCarac.getHeadCaracteristica().getSiguienteCaracteristica());
                            auxBorrar=null;
                        }else{//cualquier elemento que se vaya a borrar
                            anterior.setSiguienteCaracteristica(auxBorrar.getSiguienteCaracteristica());
                            auxBorrar=null;
                        }
                        System.out.println("ELIMINADO CON EXITO");
                    }
            }
        }
    
 
}
