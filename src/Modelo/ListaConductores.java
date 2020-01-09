
package Modelo;


public class ListaConductores {
    
    
    private Conductores headConductor;
    private Conductores tailConductor;
    
    
    
    public void agregarConductor(String Nombre,long telefono,long cedula){
        
        Conductores miConductor=new Conductores(Nombre,telefono,cedula);
        
        
        if(headConductor==null){
            headConductor=miConductor;
            tailConductor=miConductor;
        }else{
            miConductor.setSiguienteConductor(miConductor);
            tailConductor=miConductor;
        }
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
