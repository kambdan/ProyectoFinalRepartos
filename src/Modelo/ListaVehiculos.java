
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
    void agregarVehiculo(String placa, String marca, String modelo, double peso, double volumen){
        Vehiculos nuevoVehiculo=new Vehiculos(placa, marca, modelo, peso, volumen);
        if(headVehiculos==null){
            headVehiculos=nuevoVehiculo;
            tailVehiculos=nuevoVehiculo;
        }else{
            tailVehiculos.setSiguienteVehiculo(nuevoVehiculo);
            tailVehiculos=nuevoVehiculo;
        }
    }
    
}
