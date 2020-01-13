
package Modelo;

public class Productos {
    //Atributos de la clase Productos
    private String NombreProducto;
    private String Unidad;
    private double Peso;
    private double Volumen;
    private Productos siguienteProducto;

    public Productos getSiguienteProducto() {
        return siguienteProducto;
    }

    public void setSiguienteProducto(Productos siguienteProducto) {
        this.siguienteProducto = siguienteProducto;
    }
    
    
    
    public Productos(String NombreProducto,String Unidad, double Peso, double Volumen){
        this.NombreProducto=NombreProducto;
        this.Unidad=Unidad;
        this.Peso=Peso;
        this.Volumen=Volumen;
        this.siguienteProducto=null;
    
    }
    
    public Productos(){
    
    }
    
    public String getNombreProducto() {
        return NombreProducto;
    }

    public void setNombreProducto(String NombreProducto) {
        this.NombreProducto = NombreProducto;
    }

    public String getUnidad() {
        return Unidad;
    }

    public void setUnidad(String Unidad) {
        this.Unidad = Unidad;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public double getVolumen() {
        return Volumen;
    }

    public void setVolumen(double Volumen) {
        this.Volumen = Volumen;
    }
    
}
