/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios.modelos;

/**
 *
 * @author tomyl
 */
public class Encargado extends Usuario{
    
    public Encargado(){}
    
    public Encargado(String correo, String clave, String apellido, String nombre) {
        super(correo, clave, apellido, nombre);
    }
    
    @Override
    public void mostrar(){
        System.out.println("Encargado: " + super.verApellido() + " " + super.verNombre());
        System.out.println("Correo: " + super.verCorreo());
    }
}
