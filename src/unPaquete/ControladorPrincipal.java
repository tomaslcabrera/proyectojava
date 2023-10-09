/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unPaquete;

import java.util.ArrayList;

/**
 *
 * @author tomyl
 */
public class ControladorPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
        Empleado e1 = new Empleado();
        e1.setNombre("pepito");
        empleados.add(e1);
        for (Empleado cancion : empleados) {
        System.out.println(cancion.getNombre());
        }
    }
    
}
