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
    
   
    
}
