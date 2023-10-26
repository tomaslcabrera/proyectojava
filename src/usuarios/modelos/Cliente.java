/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios.modelos;

import java.util.ArrayList;
import pedidos.modelos.Pedido;

/**
 *
 * @author tomyl
 */
public class Cliente extends Usuario {
    private ArrayList<Pedido> pedidos = new ArrayList<>();
    
    public Cliente(){}

    public Cliente(String correo, String clave, String apellido, String nombre) {
        super(correo, clave, apellido, nombre);
    }
    
    
    @Override
    public void mostrar(){
        System.out.println("Cliente: " + super.verApellido() + " " + super.verNombre());
        System.out.println("Correo: " + super.verCorreo());
    }

    @Override
    public ArrayList<Pedido> verPedidos() {
        return new ArrayList<> (this.pedidos);
    }
    
    public void agregarPedido(Pedido pedido){
        if(!this.pedidos.contains(pedido)){
            this.pedidos.add(pedido);}else{
                    for (var i = 0; i < this.pedidos.size(); i++) {
                        if (this.pedidos.get(i).equals(pedido)) {
                              this.pedidos.remove(this.pedidos.get(i));
                              this.pedidos.add(pedido);
                        }
                    }
                 
            }
    }
    
    public void cancelarPedido(Pedido pedido){
        for (var i = 0; i < this.pedidos.size(); i++) {
                        if (this.pedidos.get(i).equals(pedido)) {
                              this.pedidos.remove(this.pedidos.get(i));
                        }
    }
    }
}
    
