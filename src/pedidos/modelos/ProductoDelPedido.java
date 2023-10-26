/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedidos.modelos;

import productos.modelos.Producto;

/**
 *
 * @author tomyl
 */
public class ProductoDelPedido {
    private int cantidad;
    private Producto producto;

    public ProductoDelPedido(){
    }
    
    public ProductoDelPedido(Producto producto,int cantidad) {
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public int verCantidad() {
        return cantidad;
    }

    public Producto verProducto() {
        return producto;
    }

    public void asignarCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void asignarProducto(Producto producto) {
        this.producto = producto;
    }
    
    public boolean equal(ProductoDelPedido pdp){
        return (this.producto.equals(pdp.producto));
    }
    
}
