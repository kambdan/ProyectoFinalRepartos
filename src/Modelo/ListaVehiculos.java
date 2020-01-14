
package Modelo;

public class ListaVehiculos {
    private Vehiculos headVehiculos;
    private Vehiculos tailVehiculos;

    //Constructor
    public ListaVehiculos(){
        this.headVehiculos=null;
        this.tailVehiculos=null;
    }
    
    public Vehiculos getHeadVehiculos() {
        return headVehiculos;
    }

    public void setHeadVehiculos(Vehiculos headVehiculos) {
        this.headVehiculos = headVehiculos;
    }

    public Vehiculos getTailVehiculos() {
        return tailVehiculos;
    }

    public void setTailVehiculos(Vehiculos tailVehiculos) {
        this.tailVehiculos = tailVehiculos;
    }
    
    //Funcion para agregar un vehiculo a una lista de vehiculos
    //El Peso y el volumen hace referencia a un peso,volumen maximo que transporta Un vehiculo
       
    }
