/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios.modelos;

/**
 *
 * @author tomyl
 */
public abstract class Usuario {
    private String nombre;
    private String apellido;
    private String correo;
    private String clave;
    
    public Usuario(){
    }
    
    public Usuario(String correo, String clave, String apellido, String nombre) {
        this.correo = correo;
        this.clave = clave;
        this.apellido = apellido;
        this.nombre = nombre;
    }
    
    public String verCorreo() {
        return correo;
    }

    public String verClave() {
        return clave;
    }

    public String verApellido() {
        return apellido;
    }

    public String verNombre() {
        return nombre;
    }

    public void asignarCorreo(String correo) {
        this.correo = correo;
    }

    public void asignarClave(String clave) {
        this.clave = clave;
    }

    public void asignarApellido(String apellido) {
        this.apellido = apellido;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }
   
    public void mostrar(){
        System.out.println("Usuario: " + this.apellido + ", " + this.nombre);
        System.out.println("Correo: " + this.correo);
    }
    
    public boolean equals(Usuario user){
        return (this.correo == user.correo);
    }
}

