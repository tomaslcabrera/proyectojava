/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productos.modelos;

/**
 *
 * @author tomyl
 */
public class Producto {
    private int codigo;
    private String descripcion;
    private Categoria categoria;
    private Estado estado;
    private float precio;

    public Producto(){}
    
    public Producto(int codigo, String descripcion, Categoria categoria, Estado estado, float precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.estado = estado;
        this.precio = precio;
    }
    
    
    public int verCodigo() {
        return codigo;
    }

    public String verDescripcion() {
        return descripcion;
    }

    public Categoria verCategoria() {
        return categoria;
    }

    public Estado verEstado() {
        return estado;
    }

    public float verPrecio() {
        return precio;
    }

    public void asignarCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void asignarDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void asignarCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void asignarEstado(Estado estado) {
        this.estado = estado;
    }

    public void asignarPrecio(float precio) {
        this.precio = precio;
    }
    
    public void mostrar(){
        System.out.println("Producto: " + this.descripcion);
        System.out.println("Precio: " + this.precio);
        System.out.println("Categoria: " + this.categoria + " Vigente: " + this.estado);
    }
    
    public boolean equals(Producto prod){
        return (this.codigo == prod.codigo);
    }
    
    @Override
    public String toString(){
        return codigo + "\n" + descripcion + "\n" + categoria + "\n" + estado + "\n" + precio;
    }
}
