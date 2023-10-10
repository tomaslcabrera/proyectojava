/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedidos.modelos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import usuarios.modelos.Cliente;

/**
 *
 * @author tomyl
 */
public class Pedidos {
    private int numero;
    private LocalDateTime fechaYHora;
    private Cliente cliente;
    private Estado estado;
    
    
    public Pedidos(){}

    public Pedidos(int numero, LocalDateTime fechaYHora, Cliente cliente, Estado estado) {
        this.numero = numero;
        this.fechaYHora = fechaYHora;
        this.cliente = cliente;
        this.estado = estado;
    }

    public int verNumero() {
        return numero;
    }

    public LocalTime verHora() {
        return LocalTime.now();
    }
    
    public LocalDate verFecha() {
        return fechaYHora.toLocalDate();
    }

    public Cliente verCliente() {
        return cliente;
    }

    public Estado verEstado() {
        return estado;
    }

    public void asignarNumero(int numero) {
        this.numero = numero;
    }

    public void asignarFechaYHora(LocalDateTime fechaYHora) {
        this.fechaYHora = fechaYHora;
    }

    public void asignarCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void asignarEstado(Estado estado) {
        this.estado = estado;
    }

    
    public void mostrar(){
        System.out.println("Nro: "+this.numero+"\n"+"Fecha: "+this.fechaYHora+"\n"+"Cliente: " + this.cliente + "\n" + "Hora: " + this.fechaYHora.getHour() + "Dia: " + this.fechaYHora.getDayOfYear());
    }
}
