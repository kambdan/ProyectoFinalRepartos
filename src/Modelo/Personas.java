
package Modelo;

public class Personas {
    //Atributos de la clase personas
    private String Nombre;
    private long telefono;

    public Personas(String Nombre, long telefono) {
        this.Nombre = Nombre;
        this.telefono = telefono;
    }

    
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
    
}
