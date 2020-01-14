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
public class ListaCaracteristicasEspeciales {
    
    private CaracteristicasEspeciales headCaracteristica;
    private CaracteristicasEspeciales tailCaracteristica;
    
    
    public CaracteristicasEspeciales getHeadCaracteristica() {
        return headCaracteristica;
    }

    public void setHeadCaracteristica(CaracteristicasEspeciales headCaracteristica) {
        this.headCaracteristica = headCaracteristica;
    }

    public CaracteristicasEspeciales getTailCaracterisitca() {
        return tailCaracteristica;
    }

    public void setTailCaracterisitca(CaracteristicasEspeciales tailCaracterisitca) {
        this.tailCaracteristica = tailCaracterisitca;
    }
    
    
    public void agregarCaracteristica(String caracteristica,String descripcion){
        
        CaracteristicasEspeciales nuevaCaracteristica=new CaracteristicasEspeciales();
        nuevaCaracteristica.setCaracteristicas(caracteristica);
        nuevaCaracteristica.setDescripcion(descripcion);
        
        if(headCaracteristica==null){
            headCaracteristica=nuevaCaracteristica;
            tailCaracteristica=nuevaCaracteristica;
        
        }else{
            tailCaracteristica.setSiguienteCaracteristica(nuevaCaracteristica);
            tailCaracteristica=nuevaCaracteristica;
        }       
    }
    
    
    public CaracteristicasEspeciales consultarCaracteristica(ListaCaracteristicasEspeciales miLista, String NombreCaracteristica){
       
        CaracteristicasEspeciales miCaracterisitca;
        miCaracterisitca=miLista.headCaracteristica;
        while(miCaracterisitca!=null && !miCaracterisitca.getCaracteristicas().equals(NombreCaracteristica)){
          miCaracterisitca=miCaracterisitca.getSiguienteCaracteristica();
        }
        if(miCaracterisitca==null){
            return miCaracterisitca;
        }else{
            return miCaracterisitca;
        }
    }
    
    public void modificarCaracteristica(ListaCaracteristicasEspeciales miLista, String NombreCaracteristica, String Descripcion){

    CaracteristicasEspeciales nodAux;
    CaracteristicasEspeciales nodCaracteristica;
    nodAux=miLista.headCaracteristica;
    
    nodCaracteristica=consultarCaracteristica(miLista,NombreCaracteristica);
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
    public void eliminarCaracteristica(ListaCaracteristicasEspeciales miLista, String NombreCaracteristica){

            if(miLista.headCaracteristica!=null){
                    CaracteristicasEspeciales auxBorrar;
                    CaracteristicasEspeciales anterior=null;
                    auxBorrar=miLista.headCaracteristica;
                    while((auxBorrar!=null)&&(auxBorrar.getCaracteristicas()!=NombreCaracteristica)){
                            anterior=auxBorrar;
                            auxBorrar=auxBorrar.getSiguienteCaracteristica();

                    }
                    if(auxBorrar==null){
                        System.out.println("ELEMENTO NO EXISTE");
                    }else{

                        if(anterior==null){//para eliminar el primer elemento de la lista
                            miLista.headCaracteristica=miLista.headCaracteristica.getSiguienteCaracteristica();
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
