
package Modelo;

public class Conductores extends Personas{
    
    private long cedula;
    private Conductores siguienteConductor;

    
    public Conductores(String Nombre, long telefono, long cedula){
        super(Nombre,telefono);
        this.cedula=cedula;
        this.siguienteConductor=null;
    }
    
    
    public Conductores getSiguienteConductor() {
        return siguienteConductor;
    }

    public void setSiguienteConductor(Conductores siguienteConductor) {
        this.siguienteConductor = siguienteConductor;
    }

    
    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }
    
    
}
