
package Modelo;

public class ListaClientes{
    private Clientes headCliente;
    private Clientes tailCliente;
    
    //Constructor
    public ListaClientes(){
        this.headCliente=null;
        this.tailCliente=null;
    }
    
    public Clientes getHeadCliente() {
        return headCliente;
    }

    public void setHeadCliente(Clientes headCliente) {
        this.headCliente = headCliente;
    }

    public Clientes getTailCliente() {
        return tailCliente;
    }

    public void setTailCliente(Clientes tailCliente) {
        this.tailCliente = tailCliente;
    }
}
