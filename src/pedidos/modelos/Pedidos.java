/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedidos.modelos;

import java.time.LocalDateTime;
import java.util.ArrayList;
import usuarios.modelos.Cliente;

/**
 *
 * @author tomyl
 */
public class Pedidos {
    private int numero;
    private LocalDateTime fechaYHora;
    private ArrayList<Cliente> clientes;

    public Pedidos(int numero, LocalDateTime fechaYHora) {
        this.numero = numero;
        this.fechaYHora = fechaYHora;
    }

    public int getNumero() {
        return numero;
    }

    public LocalDateTime getFechaYHora() {
        return fechaYHora;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setFechaYHora(LocalDateTime fechaYHora) {
        this.fechaYHora = fechaYHora;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
    
    
    
    public void mostrar(){
        System.out.println("Nro: "+this.numero+"\n"+"Fecha: "+this.fechaYHora+"\n"+"Cliente: ");
    }
}
