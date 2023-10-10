/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios.modelos;

import pedidos.modelos.Pedidos;

/**
 *
 * @author tomyl
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private String correo;
    private String clave;
    private Pedidos unPedido;
    
    public Cliente(){}
    
    public Cliente(String nombre, String apellido, String correo, String clave) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.clave = clave;
    }

    public String verNombre() {
        return nombre;
    }

    public String verApellido() {
        return apellido;
    }

    public String verCorreo() {
        return correo;
    }

    public String verClave() {
        return clave;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }

    public void asignarApellido(String apellido) {
        this.apellido = apellido;
    }

    public void asignarCorreo(String correo) {
        this.correo = correo;
    }

    public void asignarClave(String clave) {
        this.clave = clave;
    }
    
    public void mostrar(){
        System.out.println(this);
    }
}
