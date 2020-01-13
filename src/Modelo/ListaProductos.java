/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author CARLOS ARMIJOS
 */
public class ListaProductos {
    
    private Productos headProducto;

    public Productos getHeadProducto() {
        return headProducto;
    }

    public void setHeadProducto(Productos headProducto) {
        this.headProducto = headProducto;
    }

    public Productos getTailProducto() {
        return tailProducto;
    }

    public void setTailProducto(Productos tailProducto) {
        this.tailProducto = tailProducto;
    }
    private Productos tailProducto;
    
    public void agregarProducto(String NombreProducto,String Unidad, double Peso, double Volumen){
        
        Productos miProducto=new Productos(NombreProducto,Unidad,Peso,Volumen);
        
        if(headProducto==null){
            headProducto=miProducto;
            tailProducto=miProducto;        
        }else{
            tailProducto.setSiguienteProducto(miProducto);
            tailProducto=miProducto;
        }
    }
    
    public int consultarProducto(ListaProductos miLista, String NombreProducto){
        int bandera=0;
        Productos miProducto;
        
        miProducto=miLista.headProducto;
        while(miProducto!=null && miProducto.getNombreProducto()!=NombreProducto){
            bandera++;
            miProducto=miProducto.getSiguienteProducto();
        }
        if(miProducto==null){
            return bandera;
        }
        return bandera;
    }
    
    void modificarProducto(ListaProductos miLista, String NombreProducto,String Unidad, double Peso, double Volumen){

    int posicion;
    //char dato[100];
    Productos nodAux;
    nodAux=miLista.headProducto;
    posicion=consultarProducto(miLista,NombreProducto);
    if(posicion!=-1){
	System.out.println("ENCONTRADO");
	for(int i=0;i<posicion;i++){
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
void eliminarProducto(ListaProductos miLista, String NombreProducto){

	if(miLista.headProducto!=null){
		Productos auxBorrar;
		Productos anterior=null;
		auxBorrar=miLista.headProducto;
		while((auxBorrar!=null)&&(auxBorrar.getNombreProducto()!=NombreProducto)){
			anterior=auxBorrar;
			auxBorrar=auxBorrar.getSiguienteProducto();

		}
		if(auxBorrar==null){
                    System.out.println("ELEMENTO NO EXISTE");
		}else{
                    
                    if(anterior==null){//para eliminar el primer elemento de la lista
			miLista.headProducto=miLista.headProducto.getSiguienteProducto();
			auxBorrar=null;
                    }else{//cualquier elemento que se vaya a borrar
			anterior.setSiguienteProducto(auxBorrar.getSiguienteProducto());
			auxBorrar=null;
                    }
                    System.out.println("ELIMINADO CON EXITO");
		}
	}
    }   
    
}
