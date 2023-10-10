/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal.controladores;

import java.util.ArrayList;
import productos.modelos.Producto;
import usuarios.modelos.Cliente;
import usuarios.modelos.Empleado;
import usuarios.modelos.Encargado;

/**
 *
 * @author tomyl
 */
public class ControladorPrincipal {
    public static void main(String[] args) {
        /*
        Definir un ArrayList para cada una de las clases Cliente, 
        Empleado, Encargado y Producto  (realizar las importaciones correspondientes).*/
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        ArrayList<Encargado> listaEncargados = new ArrayList<>();
        ArrayList<Producto> listaProductos = new ArrayList<>();
        /*Instanciar 3 objetos de cada clase y guardarlos en su correspondiente ArrayList. */
        Empleado e1 = new Empleado("pepito@gmail","1234","oreo","pepito");
        listaEmpleados.add(e1);
        for (Empleado e : listaEmpleados) {
            System.out.println(e1.toString());
        }
    }
}
